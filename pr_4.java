class fruits
{
    void print()
    {
        System.out.println("Fruits");
    }
}
class pineapple extends fruits
{
    void print()
    {
        System.out.println("Pineapple");
    }
}
class apple extends fruits
{
    void print()
    {
        System.out.println("Apple");
    }
}
class strawberry extends fruits
{
    void print()
    {
        System.out.println("Strawberry");
    }
}
public class pr_4
{
    public static void main(String[] args)
    {
        fruits a=new fruits(); a.print();
        pineapple b=new pineapple(); b.print();
        apple c=new apple(); c.print();
        strawberry d=new strawberry(); d.print();
        System.out.println("21CE077");
    }
}

