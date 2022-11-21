package eng_9_constructors;

public class C03_Create2Cosntructor {

    int a;
    static int b;
    public static void main(String[] args) {
        C03_Create2Cosntructor c1 = new C03_Create2Cosntructor();
        System.out.println(c1.a);
        System.out.println(b);

        C03_Create2Cosntructor c2 = new C03_Create2Cosntructor(5);
        System.out.println(c2.a);
        System.out.println(b);
    }

    public C03_Create2Cosntructor(){
        b++;
    }

    public C03_Create2Cosntructor(int a){
        this.a = a;
        b++;
    }
}
