import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CodingBat {
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static int countYZ(String str) {
        String[] list = str.toLowerCase().split("[^a-zA-Z]");
        int count = 0;
        for(String s : list) {
            if(s.endsWith("y") || s.endsWith("z")) {
                count++;
            }
        }
        return count;
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public static String notReplace(String str) {
        StringBuilder sb = new StringBuilder();
        char prev = ' ';
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'i' && i + 1 != str.length() && str.charAt(i + 1) == 's' && !Character.isLetter(prev)
                    && (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {
                sb.append("is not");
                i++;
            }
            else {
                sb.append(c);
            }
            prev = c;
        }
        return sb.toString();
    }



}
