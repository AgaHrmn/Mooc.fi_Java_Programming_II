import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Dog", 1);
        myMap.put("Cat", 2);
        myMap.put("Rat", 3);
        
        System.out.println(returnSize(myMap));
    }

    public static int returnSize(Map m){
        return m.keySet().size();
    }
}
