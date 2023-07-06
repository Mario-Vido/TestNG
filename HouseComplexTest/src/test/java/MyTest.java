import org.testng.annotations.BeforeClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class MyTest {


    @BeforeClass
    public void setupTestClass() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Initializing test class: " + this.getClass().getSimpleName() + " Time of the test: " + formattedTime);
    }

}
