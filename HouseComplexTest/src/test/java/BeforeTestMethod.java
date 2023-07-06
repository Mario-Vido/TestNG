import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;

public class BeforeTestMethod {

    @BeforeTest
    public void printNameOfTest(ITestContext context){
        System.out.println("Running test: " + context.getCurrentXmlTest().getName());
    }
}
