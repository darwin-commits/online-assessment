import java.util.*;

public class BookOrganizer {
    public static String canOrganize(int[] shelf) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int book : shelf) {
            freq.put(book, freq.getOrDefault(book, 0) + 1);
        }
        
        for (int count : freq.values()) {
            if (count < 2) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        int[] shelf = {1234567, 1234567, 2345678, 2345679, 3456789, 3456789, 
                       1234567, 2345678, 3456789, 3456789, 4567890, 4567890, 
                       5678901, 5678901, 6789012, 6789012, 1234567, 2345678, 
                       3456789, 4567890, 5678901, 4567890, 5678901};
        System.out.println(canOrganize(shelf));
    }
}