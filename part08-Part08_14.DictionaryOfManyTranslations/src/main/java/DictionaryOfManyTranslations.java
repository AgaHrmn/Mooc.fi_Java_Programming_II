/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> hm;

    public DictionaryOfManyTranslations() {
        this.hm = new HashMap<>();

    }

    public void add(String word, String translation) {
        if (!(hm.keySet().contains(word))) {
            this.hm.put(word, new ArrayList<String>());
            this.hm.get(word).add(translation);
        } else {
            this.hm.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        if (this.hm.containsKey(word)) {
            return this.hm.get(word);
        } else {
            return new ArrayList<String>();
        }
    }

    public void remove(String word) {
        this.hm.remove(word);
    }
}
