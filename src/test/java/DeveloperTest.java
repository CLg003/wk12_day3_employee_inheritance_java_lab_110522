import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jim", "ABC2",60000);
    }

    @Test
    public void hasName(){
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("ABC2", developer.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000);
        assertEquals(62000, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(600, developer.payBonus(), 0.0);
    }
}
