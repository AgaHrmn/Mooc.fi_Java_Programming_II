
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    public static void main(String[] args) {
        ArrayList<String> literacyList = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv")).forEach(row -> literacyList.add(row));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        for (int i=0; i< literacyList.size(); i++) {
            literacyList.get(i).trim();
        }

        literacyList.stream()
                .map(row -> row.split(","))
                .sorted((row1, row2) -> {
                    return Double.valueOf(row1[5]).compareTo(Double.valueOf(row2[5]));
                })
                
                .forEach(row -> System.out.println(row[3] + " (" + row[4]+ ")," + row[2].replace(" (%)", "") + ", " + row[5]));
    }
}
