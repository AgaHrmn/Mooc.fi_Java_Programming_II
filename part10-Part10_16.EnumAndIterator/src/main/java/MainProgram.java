
public class MainProgram {

    public static void main(String[] args) {
        Employees t = new Employees();
        Person h = new Person("Arto", Education.PHD);
       
        t.add(h);
        t.print();
        t.print(Education.PHD);
    }
}
