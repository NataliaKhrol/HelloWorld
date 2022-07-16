public class Palindrome {
    public static void main(String[] args) {
        //Написать метод, который находит и выводит все слова палиндромы в тексте.
        String j = "like level Java, noon";
        String[] words = j.split(" ");
       // System.out.println(Arrays.toString(words));

        int count = 0;
        for (int m = 0; m < words.length; m++) {
            String word = words[m];
            String result;

            if (isPalindrome(word)) {
                result = "palindrome";
                count += 1;

            } else {
                //result = "Not a palindrome";
                continue;
            }
            System.out.println(count + "." + word + " - " + result);

        }
    }

    private static boolean isPalindrome(String word) {
        boolean result = true;
        String[] wordIntoLetters = word.split("");
      //  System.out.println(Arrays.toString(wordIntoLetters));

        for (int i = 0; i < wordIntoLetters.length / 2; i++) {
            String left = wordIntoLetters[i];
            String right = wordIntoLetters[wordIntoLetters.length - i - 1];

            if (!left.equals(right)) {
                result = false;
                break;
            }
        }
        return result;
    }
}








