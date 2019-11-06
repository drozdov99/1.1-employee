import org.junit.Assert;
import org.junit.Test;
import ua.profitsoft.trainee.drozdov.Accountant;
import ua.profitsoft.trainee.drozdov.Developer;
import ua.profitsoft.trainee.drozdov.Employee;
import ua.profitsoft.trainee.drozdov.Manager;

import java.util.Collections;

public class EmployeeTest {

    private static final int HOURS_160 = 160;

    @Test
    public void testFullSalaryDeveloper(){
        final double expected = 100;
        Employee developer = new Developer(100, 160);
        Assert.assertEquals(expected, Accountant.getInstance().getTotalSalary(Collections.singletonList(developer), HOURS_160),0);
    }
    @Test
    public void testFullSalaryManager(){
        final double expected = 300;
        Employee manager = new Manager(300, 160);
        Assert.assertEquals(expected, Accountant.getInstance().getTotalSalary(Collections.singletonList(manager), HOURS_160),0);
    }
    @Test
    public void testHalfTimeDeveloper(){
        final double expected = 50;
        Employee developer = new Developer(100, 80);
        Assert.assertEquals(expected, Accountant.getInstance().getTotalSalary(Collections.singletonList(developer), HOURS_160),0);
    }
    @Test
    public void testHalfTimeSalaryManager(){
        final double expected = 150;
        Employee manager = new Manager(300, 80);
        Assert.assertEquals(expected, Accountant.getInstance().getTotalSalary(Collections.singletonList(manager), HOURS_160),0);
    }
    @Test
    public void testOverTimeDeveloper(){
        final double expected = 200;
        Employee developer = new Developer(100, 320);
        Assert.assertEquals(expected, Accountant.getInstance().getTotalSalary(Collections.singletonList(developer), HOURS_160),0);
    }
    @Test
    public void testOverTimeSalaryManager(){
        final double expected = 300;
        Employee manager = new Manager(300, 240);
        Assert.assertEquals(expected, Accountant.getInstance().getTotalSalary(Collections.singletonList(manager), HOURS_160),0);
    }
}
