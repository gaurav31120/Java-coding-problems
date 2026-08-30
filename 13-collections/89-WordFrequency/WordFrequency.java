import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        String sentence = "java is easy and java is powerful";

        String[] words = sentence.split(" ");

        for (String word : words) {

            if (map.containsKey(word)) {
                int count = map.get(word);
                count++;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("===== Word Frequencies =====");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Java frequency: " + map.get("java"));

        boolean isPythonPresent = map.containsKey("python");
        System.out.println("Python present: " + isPythonPresent);

        System.out.println("Unique word count: " + map.size());
    }
}