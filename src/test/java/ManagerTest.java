import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "A2M2", 35000, "Books");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("A2M2", manager.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Books", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2000);
        assertEquals(37000, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350, manager.payBonus(), 0.0);
    }

    @Test
    public void cannotReduceSalary(){
        manager.raiseSalary(-1000);
        assertEquals(35000, manager.getSalary(), 0.0);
    }

    @Test
    public void canChangeName(){
        manager.setName("Tim");
        assertEquals("Tim", manager.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }

}
