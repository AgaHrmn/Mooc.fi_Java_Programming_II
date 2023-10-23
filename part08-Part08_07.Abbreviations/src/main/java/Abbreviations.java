import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> dict;
    
    public Abbreviations(){
        this.dict = new HashMap<>();
    }
    
    
    public void addAbbreviation(String abbreviation, String explanation){
        dict.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        if (dict.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    public String findExplanationFor(String abbreviation) {
        return dict.get(abbreviation);
    }
}
