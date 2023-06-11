package AgeTest;
import homework25.Women;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWomen {
    @Test
    public void testisRetiredWomenTrue(){
        Women womenAge = new Women("Anna", 60);
        Assert.assertFalse(womenAge.isRetiredWomen(), "The age more than 60 or incorrect");
    }
    @Test
    public void testisRetiredWomenFalse(){
        Women womenAge = new Women("Anna", 89);
        Assert.assertTrue(womenAge.isRetiredWomen(), "The age less than 60 or incorrect");
    }
}

