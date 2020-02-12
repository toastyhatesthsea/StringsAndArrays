package Strings;

public class EmptySpaces {


    public static String replaceSpaces(String aString) {
        String replacement = "%20";
        String answer = "";

        for (int i = 0; i < aString.length(); i++) {
            Character aChar = aString.charAt(i);

            if (aChar.equals(' ')) {
                answer = answer.concat(replacement);
            } else {
                answer = answer.concat(aChar.toString());

            }
        }
        return answer;
    }

}

class EmptySpaceTesters {
    public static void main(String[] asasas) {
        String answer = EmptySpaces.replaceSpaces("A ho  ot");
    }

}
