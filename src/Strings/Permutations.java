package Strings;

import java.util.HashMap;

public class Permutations {


    public static boolean checkTwoStringsForPermutation(String stringA, String stringB) {

        if (stringA.length() != stringB.length()) {
            return false;
        }

        stringA = stringA.toLowerCase();
        stringB = stringB.toLowerCase();
        HashMap<Character, Integer> stringAHash = new HashMap<>();
        HashMap<Character, Integer> stringBHash = new HashMap<>();

        for (int i = 0; i < stringA.length(); i++) {

            Character stringAChar = stringA.charAt(i);
            Character stringBChar = stringB.charAt(i);

            Integer valueA = stringAHash.get(stringAChar);
            Integer valueB = stringBHash.get(stringBChar);
            if (valueA != null) {
                stringAHash.put(stringAChar, 1 + valueA);
            } else {
                stringAHash.put(stringAChar, 1);
            }

            if (valueB != null) {
                stringBHash.put(stringBChar, 1 + valueB);
            } else {
                stringBHash.put(stringBChar, 1);
            }
        }

        return false;
    }

    private void computeHash(HashMap<Character, Integer> aHash, Character aChar) {
        Integer valueA = aHash.get(aChar);
        if (valueA != null) {
            aHash.put(aChar, 1 + valueA);
        } else {
            aHash.put(aChar, 1);
        }
    }

}

class Testers {
    public static void main(String[] asasas) {
        boolean test = Permutations.checkTwoStringsForPermutation("Cat", "Tac");
    }
}
