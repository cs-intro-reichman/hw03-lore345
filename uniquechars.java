/** String processing exercise 2. */
public class uniquechars {
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
        String res = "";
        boolean isExist;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) != '1') {
                res = res + s.charAt(i);
            }
            if (s.charAt(i) != ' ') {
                for (int j = 1; j < s.length() ; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        s = s.replace(s.charAt(j), '1');
                    }
                }
            }
        }
        return res;
    }
}
