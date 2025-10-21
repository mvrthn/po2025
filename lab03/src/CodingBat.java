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
        List<Character> arr = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) != 'i') {
                continue;
            }
            if(i == arr.size() - 1 || arr.get(i + 1) != 's') {
                continue;
            }
            if(i != arr.size() - 2 && Character.isLetter(arr.get(i + 2))) {
                continue;
            }
            if(i == 0 || !Character.isLetter(arr.get(i - 1))) {
                arr.addAll(i + 2, Arrays.asList(' ', 'n', 'o', 't'));
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }



}
