package AgeTest;
import homework25.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMan {
    @Test
    public void testisRetiredManTrue(){
        Man manAge = new Man("Bob", 40);
        Assert.assertFalse(manAge.isRetiredMan(), "The age more than 65 or incorrect");
    }
    @Test
    public void testisRetiredMenFalse(){
        Man manAge = new Man("Bob", 66);
        Assert.assertTrue(manAge.isRetiredMan(), "The age less than 65 or incorrect");
    }
}
