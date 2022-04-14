import org.testng.annotations.Test;
public class test2 {

    @Test(priority = 6)
    public void C()
    {
        System.out.println("C function is running");
    }
    @Test(priority = 5)
    public void D()
    {
        System.out.println("Function D is running");
    }
}
