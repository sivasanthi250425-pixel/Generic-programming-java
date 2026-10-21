
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();

        l.add("Hello");
        l.add("World");

        String s = l.get(0);
        String s2 = l.get(1);

        System.out.println(s);
        
        System.out.println(s2);
        System.out.println(l);
    }
}
