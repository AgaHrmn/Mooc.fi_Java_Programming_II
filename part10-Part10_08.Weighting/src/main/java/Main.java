import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        List <Hold> holdsList = new ArrayList<>();
        
        Item book = new Item("Hoodie", 1);
        Item phone = new Item("Juice", 2);
        Item brick = new Item("Books", 4);

        Suitcase myCase = new Suitcase(10);
        myCase.addItem(book);
        myCase.addItem(phone);

        Suitcase ourCase = new Suitcase(10);
        ourCase.addItem(brick);

        Hold firstHold = new Hold(1000);
        firstHold.addSuitcase(myCase);
        firstHold.addSuitcase(ourCase);
        
        holdsList.add(firstHold);
        System.out.println("The suitcases in the hold contain the following items:");
      
        holdsList.stream()
                .forEach(content -> content.printItems());
    }

}
