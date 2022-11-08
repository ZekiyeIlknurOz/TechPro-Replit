package tr_5_arrays;
import java.util.List;
import java.util.Arrays;
public class Arrays_7 {

    public static void main(String[] args) {
        //  Array i ARRAYLIST e çeviren Java Kodunu yazınız.
        //Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
        //Beklenen Çıktı:
        //[Python, JAVA, PHP, Perl, C#, C++]
        String s[] = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List <String> sList = Arrays.asList(s);
        System.out.println(sList);

    }
}
