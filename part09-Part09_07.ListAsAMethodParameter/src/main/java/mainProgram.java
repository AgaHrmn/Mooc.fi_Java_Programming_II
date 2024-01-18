
import java.util.List;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            myList.add("cat" + i);
        }

        System.out.println(returnSize(myList));

    }

    public static int returnSize(List l) {
        return l.size();
    }
}
