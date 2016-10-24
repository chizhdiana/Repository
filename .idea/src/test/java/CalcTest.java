
import org.testng.Assert;
import org.testng.annotations.Test;




import static org.testng.AssertJUnit.assertTrue;


/**
 * Created by Di on 07.10.2016.
 */
@Test
public class CalcTest {

    public void simpleCheck() {
        Calculator calculator = new Calculator(2, 2);
        int result = calculator.getResult();
        assertTrue("Результат(" + result + ") не равен 4", result == 4);
    }
}
