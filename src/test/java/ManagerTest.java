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

}
