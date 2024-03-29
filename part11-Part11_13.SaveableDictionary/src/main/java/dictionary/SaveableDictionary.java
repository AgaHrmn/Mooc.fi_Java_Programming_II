package dictionary;

//import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class SaveableDictionary {

    private HashMap<String, String> dict;
    private String file;

    public SaveableDictionary() {
        this.dict = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dict = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try ( Scanner s = new Scanner(Paths.get(this.file))) {
            while (s.hasNextLine()) {
                String row = s.nextLine();
                String[] parts = row.split(":");
                this.dict.put(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return false;
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String k : this.dict.keySet()) {
                String line = k + ":" + this.dict.get(k);
                writer.println(line);
            }
            return true;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void add(String words, String translation) {
        this.dict.putIfAbsent(words, translation);
    }

    public String translate(String word) {

        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else if (this.dict.containsValue(word)) {
            for (String key : this.dict.keySet()) {
                if (this.dict.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        this.dict.keySet().remove(word);
        this.dict.values().remove(word);
    }

}
