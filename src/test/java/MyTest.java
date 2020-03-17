import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class MyTest
{

}

@Test
void unitTest(){
    MyTest tester = new App();

    assertEquals(10, App.add(5,5), "5 + 5 must be 10");
    assertEquals(10, App.subtract(20,10), "20 - 10 must be 10");
    assertEquals(10, App.multiply(5,2), "5 x 2 must be 10");
}