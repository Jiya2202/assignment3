interface IPrinter
{
    void print(); void connect(); void on();
    void of();
}
interface IScanner
{
    void scan();
    void scconnect(); void scon();
    void scof();
}
class implementation implements IPrinter,IScanner
{
    public void print()
    {
        System.out.println("Buying the book");
    }
    public void connect()
    {
        System.out.println("Paying the money of books");
    }
    public void on()
    {
        System.out.println("Taking out book for Bookshell");
    }
    public void of()
    {
        System.out.println("Leaving library");
    }
    public void scan()
    {
        System.out.println("Trial of selected clothes");
    }
    public void scconnect()
    {
        System.out.println("selection of clothes ");
    }
    public void scon()
    {
        System.out.println("Entering into clothes section");
    }
    public void scof()
    {
        System.out.println("Purchased one of them");
        }
        }
        public class prac2
{
    public static void main(String[] args)
    {
        implementation a= new implementation(); System.out.println("Going to Library"); a.on();
        a.print();
        a.of(); System.out.println("");
        System.out.println("Going to the Mall"); a.scon();
        a.scconnect(); a.scan();
        a.scof(); System.out.println("");
        System.out.println("21CE077");
    }
}
