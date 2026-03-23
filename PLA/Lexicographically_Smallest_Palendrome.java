public class Lexicographically_Smallest_Palendrome {

    private String findSmallest(String s) {
        // Count frequency of each character (ASCII 0-255)
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Count how many characters have odd frequency
        int oddCount = 0;
        char middleChar = '\0';
        for (int i = 0; i < 256; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                middleChar = (char) i; // save the odd character (will be used later)
            }
        }

        // If more than one character has odd frequency, palindrome is impossible
        if (oddCount > 1) {
            return "NO";
        }

        // Build the left half of the palindrome
        StringBuilder leftHalf = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                // Append half of the characters (integer division)
                for (int j = 0; j < freq[i] / 2; j++) {
                    leftHalf.append((char) i);
                }
            }
        }

        // The result is leftHalf + middleChar (if any) + reverse(leftHalf)
        StringBuilder result = new StringBuilder(leftHalf);
        if (oddCount == 1) {
            result.append(middleChar);
        }
        result.append(leftHalf.reverse());

        return result.toString();
    }

    public static void main(String[] args) {
        Lexicographically_Smallest_Palendrome obj = new Lexicographically_Smallest_Palendrome();
        String s = "aacdbbcde";
        String result = obj.findSmallest(s);
        System.out.println(result);
    }
}