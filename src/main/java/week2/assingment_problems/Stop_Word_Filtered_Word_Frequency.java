
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stop_Word_Filtered_Word_Frequency {

    static void countWords(String text) {

        String[] words = text.toLowerCase()
                .replaceAll("[^a-z ]", "")
                .split("\\s+");

        String[] stopWords = {
                "the", "was", "and", "a", "is", "of", "in"
        };

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            boolean isStopWord = false;

            for (String stop : stopWords) {

                if (word.equals(stop)) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord && !word.isEmpty()) {

                frequency.put(
                        word,
                        frequency.getOrDefault(word, 0) + 1
                );
            }
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(frequency.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : list) {

            System.out.println(
                    entry.getKey() + ": " + entry.getValue()
            );
        }
    }

    public static void main(String[] args) {

        countWords(
                "The mentor was great, the session was great and clear."
        );
    }
}