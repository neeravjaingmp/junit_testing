import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)   
public class functest{
        @BeforeAll
        void beforeclass(){
            System.out.println("running .......before test");
        }
    @Test
    public void test(){
    demo tes= new demo();
    Assert.assertEquals("Hello", tes.says());
    }
    @Test
    public void testFindMax(){  
    demo cal = new demo();
    Assert.assertEquals(4,cal.findMax(new int[]{1,3,4,2}));  
    Assert.assertEquals(-1,cal.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}