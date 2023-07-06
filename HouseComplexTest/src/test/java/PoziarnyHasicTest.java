import org.example.PoziarnyHasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PoziarnyHasicTest extends MyTest{

    private final PoziarnyHasic poziarnyHasic = new PoziarnyHasic();

    @DataProvider(name = "poschodiaProvider" , parallel = true)
    public Object[][] providerPoschodie(){
        return new Object[][]{
                {1},{3},{5}
        };
    }

    @Test(dataProvider = "poschodiaProvider")
    public void skontrolujCO2(int poschodie) {
        poziarnyHasic.skontrolujCO2(poschodie);
    }

    @Test(dataProvider = "poschodiaProvider")
    public void zapniReproduktor(int poschodie){
        poziarnyHasic.zapniReproduktor(poschodie);
    }
}
