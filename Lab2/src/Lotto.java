import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Lotto {
    public static void main(String[] args) {
        if(args.length != 6){
            System.out.println("Wrong number of arguments");
            System.exit(1);
        }
        List<Integer> input = new ArrayList<>();
        for(String s : args) {
            input.add(Integer.parseInt(s));
        }
        run(input, true);
    }
    public static boolean run(List<Integer> input, boolean v) {
        List<Integer> range = new ArrayList<>(IntStream.rangeClosed(1, 50).boxed().toList());
        Random random = new Random();
        final int N = 6;
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int index = random.nextInt(range.size());
            nums.add(range.get(index));
            range.remove(index);
        }
        int count = 0;
        for(int i : input) {
            if(nums.contains(i)) {
                count++;
            }
        }
        if(v) {
            System.out.println("Input: " + input);
            System.out.println("Lotto: " + nums);
            System.out.println("Count: " + count);
        }
        return count == N;
    }
}