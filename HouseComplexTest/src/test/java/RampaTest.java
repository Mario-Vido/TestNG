import org.example.Rampa;
import org.testng.annotations.Test;

public class RampaTest extends MyTest{

    private final Rampa rampa = new Rampa();

    @Test(priority = 1)
    public void zdvihni(){
        rampa.zdvihni();
    }

    @Test(dependsOnMethods = "zdvihni",priority = 2)
    public void spusti(){
        rampa.spusti();
    }
}
