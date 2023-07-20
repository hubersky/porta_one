
import java.util.List;

public class Solution {

    public String getUniqueChar(String text) {
        try {
            List<String> words = List.of(replaceAll(text));
            words = List.of(findUniqueChar(words));
            words = List.of(findUniqueChar(words));
            return words.get(0);
        } catch (NullPointerException ex) {
            return "Object is Empty!";
        }
    }

    private String[] findUniqueChar(List<String> words) {
        String[] chars = new String[1];
        int count = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                for (int k = 0; k < word.length(); k++) {
                    if (word.charAt(i) == word.charAt(k)) count++;
                }
                if (count > 1) {
                    count = 0;
                } else {
                    if (chars[0] != null) chars[0] += String.valueOf(word.charAt(i));
                    else chars[0] = String.valueOf(word.charAt(i));
                    count = 0;
                    break;
                }
            }
        }
        return chars;
    }

    private String[] replaceAll(String text) {
        return text.trim().replace("\\n", " ").replaceAll("\\W", " ").replaceAll("\\d", " ").split("\\s+");
    }
}
