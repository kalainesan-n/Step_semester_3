

public class Word_Reversal_Encoder {

    static void reverseWords(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder word = new StringBuilder(words[i]);

            result.append(word.reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        reverseWords("hello club");
        reverseWords("Java is fun");
    }
}