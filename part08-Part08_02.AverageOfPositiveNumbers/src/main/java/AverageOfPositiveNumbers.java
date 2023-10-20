
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int count = 0;
        double avg = 0;
        
        while (num != 0) {
            if (num > 0 ){
                sum += num;
                count += 1;
            }
            num = Integer.valueOf(scanner.nextLine());
        }
        
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avg = (double) sum / count;
            System.out.println(avg);
        }
        
    }
}
