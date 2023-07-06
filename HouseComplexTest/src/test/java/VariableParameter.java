import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;

public class VariableParameter {

    @BeforeTest
    public void printParameter(ITestContext context){
        System.out.println("Poschodie na ktorom prebieha test: " + context.getCurrentXmlTest().getParameter("poschodie"));
    }
}
