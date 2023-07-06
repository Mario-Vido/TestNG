import org.example.KamerovySystem;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KamerovySystemTest extends MyTest {

    private final KamerovySystem kamerovySystem = new KamerovySystem();

    @Test(invocationCount = 2)
    public void nacitajSPZTest(){
        kamerovySystem.nacitajSPZ();
//        Assert.fail();
    }

    @Test(dependsOnMethods = "nacitajSPZTest")
    public void odoftSPZ(){
        kamerovySystem.odoftSPZ();
    }
}
