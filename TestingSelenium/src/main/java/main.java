import org.testng.annotations.Test;
public class main {

    @Test(groups = {"Ananna"})
    public void func1()
    {
        System.out.println("Function 1 is running");
    }
    @Test(groups={"Ananya","Anam"})
    public void func2()
    {
        System.out.println("Function 2 is running");
    }
    @Test(groups={"Anam"})
    public void func3()
    {
        System.out.println("3rd Function");
    }


}