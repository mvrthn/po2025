import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        final int N = 6;
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            nums.add(random.nextInt(1, 50));
        }
        System.out.println(nums);
    }
}