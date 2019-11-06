import org.junit.Assert;
import org.junit.Test;
import ua.profitsoft.trainee.drozdov.Accountant;
import ua.profitsoft.trainee.drozdov.Developer;
import ua.profitsoft.trainee.drozdov.Employee;
import ua.profitsoft.trainee.drozdov.Manager;
import java.util.Arrays;

public class AccountantTest {

    @Test
    public void testTotalSalary(){
        final double expected = 500;
        Employee manager = new Manager(300, 240);
        Employee developer = new Developer(100, 320);
        Assert.assertEquals(expected, Accountant.getInstance().getTotalSalary(Arrays.asList(manager, developer), 160),0);
    }

}
