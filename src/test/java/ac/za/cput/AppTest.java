package ac.za.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void test(){
        App app = new App();

        Assert.assertEquals("My Hello World!", app.runHello("My"));

    }
@Test
    public void test2(){
        App app2 = new App();

        Assert.assertEquals("Why Hello World!", app2.runHello("Why"));

    }

}
