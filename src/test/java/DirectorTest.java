import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    
    Director director;

    @Before
    public void before(){
        director = new Director("Bob", "A2M2", 100000, "Books", 1000000);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", director.getName());
    }

    @Test
    public void hasNInumber(){
        assertEquals("A2M2", director.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, director.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Books", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2000);
        assertEquals(102000, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), 0.0);
    }
}
