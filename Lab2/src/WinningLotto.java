import java.util.ArrayList;
import java.util.List;

public class WinningLotto {
    public static void main(String[] args) {
        if(args.length != 6){
            System.out.println("Wrong number of arguments");
            System.exit(1);
        }
        List<Integer> input = new ArrayList<>();
        for(String s : args) {
            input.add(Integer.parseInt(s));
        }
        int repetitions = 1;
        final long startTime = System.currentTimeMillis();
        while(!Lotto.run(input, false)) {
            repetitions++;
        }
        System.out.println("Repetitions: " + repetitions);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
