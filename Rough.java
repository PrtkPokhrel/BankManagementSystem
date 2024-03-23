public class Rough {
    public static void main(String[] args) {
        Pwd pd=new Pwd ();
        Ls l=new Ls();

        // System.out.println(pd.a);
        System.out.println(l.c);
        // System.out.println(l.d);
        // System.out.println(pd.a);
        
        
    }
}

class Pwd{
    private int a=2;
    int b=2;

}
class Ls{
    Pwd p=new Pwd();
    int c=p.b;
    // int d=p.a;
}
