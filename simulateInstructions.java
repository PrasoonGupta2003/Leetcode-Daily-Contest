import java.util.HashSet;
import java.util.Set;

public class InstructionSimulator {

    public static int simulateProcess(String[] instructions, int[] values) {
        int n = instructions.length;
        Set<Integer> visited = new HashSet<>();
        int i = 0;
        int score = 0;

        while (i >= 0 && i < n) {
            if (visited.contains(i)) {
                break;
            }
            visited.add(i);

            if (instructions[i].equals("add")) {
                score += values[i];
                i += 1;
            } else if (instructions[i].equals("jump")) {
                i += values[i];
            }
        }

        return score;
    }

    public static void main(String[] args) {
        // Example 1
        String[] instructions1 = {"jump", "add", "add", "jump", "add", "jump"};
        int[] values1 = {2, 1, 3, 1, -2, -3};
        System.out.println(simulateProcess(instructions1, values1)); 

        // Example 2
        String[] instructions2 = {"jump", "add", "add"};
        int[] values2 = {3, 1, 1};
        System.out.println(simulateProcess(instructions2, values2));

        // Example 3
        String[] instructions3 = {"jump"};
        int[] values3 = {0};
        System.out.println(simulateProcess(instructions3, values3)); 
    }
}
