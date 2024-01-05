/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string,
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if the character is a space or not already present in the result
            if (currentChar == ' ' || result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        return result;
    }
}

