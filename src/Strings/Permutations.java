package Strings;

import java.util.HashMap;
import java.util.Map;

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

            computeHash(stringAHash, stringAChar);
            computeHash(stringBHash, stringBChar);

        }

        for (Map.Entry<Character, Integer> entry: stringAHash.entrySet()) {
            Character stringAKey = entry.getKey();
            Integer stringAValue = entry.getValue();

            Integer stringBValue = stringBHash.getOrDefault(stringAKey, 0);

            if (!stringAValue.equals(stringBValue)) {
                return false;
            }
        }

        return true;
    }

    private static void computeHash(HashMap<Character, Integer> aHash, Character aChar) {
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
        boolean test = Permutations.checkTwoStringsForPermutation("Tenet", "tneet");
    }
}
