import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();

        String sentence = "java programming";

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (map.containsKey(ch)) {
                int count = map.get(ch);
                count++;
                map.put(ch, count);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println("===== Character Frequencies =====");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("a frequency: " + map.get('a'));

        boolean isZPresent = map.containsKey('z');
        System.out.println("Is z present: " + isZPresent);

        System.out.println("Unique characters count: " + map.size());
    }
}