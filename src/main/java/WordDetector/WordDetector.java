package WordDetector;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordDetector {
    String[] words;

    public void parseText(String s){
        words = s.split(" |(,|:) ");
    }

    public int wordsFound() {
        return words.length;
    }

    public String[] getWords() {
        return words;
    }

    public List<String> duplicatesFound() {
        List<String> al = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();

        for (String word : words){
            if (!hs.contains(word)){
                hs.add(word);
            }
            else{
                al.add(word);
            }
        }

        return al;
    }
}
