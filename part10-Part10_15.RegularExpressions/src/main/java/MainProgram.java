

public class MainProgram {

    public static void main(String[] args) {
        Checker c = new Checker();
        
        System.out.println(c.isDayOfWeek("mon"));
        
        if (c.allVowels("aoi")) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        System.out.println("time of day");
        
        if (c.timeOfDay("23:59:78")) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
