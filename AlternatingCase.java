public class AlternatingCase {
    public static String alternateCase(String s) {
        StringBuilder result = new StringBuilder();
        boolean shouldUpper = true; // Toggle flag
        
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(shouldUpper ? Character.toUpperCase(c) : Character.toLowerCase(c));
                shouldUpper = !shouldUpper;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Za^*88g@E2jH+KWJHkQpXz7YVTLGFF3U49NwZ8yXQpLkV6sHqM^dB4rA+oZ%qFj";
        System.out.println(alternateCase(input));
    }
}