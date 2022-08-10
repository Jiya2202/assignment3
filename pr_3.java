interface P
{
    final int p=5; void dispP();
}
interface P1 extends P


{
    final int p1=10; void dispP1();
}
interface P2 extends P
{
    final int p2=15; void dispP2();
}
interface P12 extends P1,P2
{
    final int p12=20; void dispP12();
}
class Newly implements P12
{
    public void dispP()
    {
        System.out.println("displaying the value of P:"+p1);
    }
    public void dispP1()
    {
        System.out.println("displaying the value of P1:"+p2);
    }
    public void dispP2()
    {
        System.out.println("displaying the value of P2:"+p12);
    }
    public void dispP12()
    {
        System.out.println("displayingthe value of P12:"+p);
    }

}
public class pr_3
{
    public static void main(String arg[])
    {
        Newly q=new Newly(); q.dispP();
        q.dispP1();
        q.dispP2();
        q.dispP12(); System.out.println("21CE077");
    }
}
