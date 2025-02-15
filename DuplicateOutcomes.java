import java.util.*;

public class DuplicateOutcomes {
    public static int[] findDuplicates(int[] outcomes) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        
        for (int num : outcomes) {
            if (seen.contains(num)) duplicates.add(num);
            else seen.add(num);
        }

        int[] result = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] outcomes = {123456, 234567, 123347, 456789, 567890, 678901, 789012, 
                          890123, 901234, 112233, 223344, 334455, 789012, 222234, 123347};
        int[] duplicates = findDuplicates(outcomes);
        System.out.println(Arrays.toString(findDuplicates(outcomes)));
    }
}