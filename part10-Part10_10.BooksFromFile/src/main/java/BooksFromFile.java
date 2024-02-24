
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(readBooks("books.txt"));

    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(row_elements -> new Book(row_elements[0], Integer.valueOf(row_elements[1]),
                    Integer.valueOf(row_elements[2]), row_elements[3]))
                    .forEach(book -> books.add(book));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return books;
    }
    
}
