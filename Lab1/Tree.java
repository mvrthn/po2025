import java.util.List;
import java.util.ArrayList;

public class Tree {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("Usage: java Tree <Tree size>");
            System.exit(1);
        }
        int treeSize = 0;
        try {
            treeSize = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.err.println("Error: Invalid tree size");
            System.exit(1);
        }
        for(int i = 0; i < treeSize; i++) {
            String row = String.valueOf('*').repeat(i + 1);
            System.out.println(row);
        }
    }
}