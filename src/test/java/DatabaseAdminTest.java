import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    
    DatabaseAdmin databaseAdmin;
    
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jim", "ABC2",50000);
    }

    @Test
    public void hasName(){
        assertEquals("Jim", databaseAdmin.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("ABC2", databaseAdmin.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2000);
        assertEquals(52000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, databaseAdmin.payBonus(), 0.0);
    }
}
