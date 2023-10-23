
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate d = new SimpleDate(1, 2, 2000);
        SimpleDate d2 = new SimpleDate(2, 2, 1990);
        
        System.out.println(d.hashCode());
        System.out.println(d2.hashCode());
        

    }
}
