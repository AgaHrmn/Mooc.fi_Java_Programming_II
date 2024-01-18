import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        for(int i=0; i<3; i++){
            mySet.add("arg" + i);
        }
        
        System.out.println(returnSize(mySet));

    }

    public static int returnSize(Set set) {
        return set.size();
    }

}
