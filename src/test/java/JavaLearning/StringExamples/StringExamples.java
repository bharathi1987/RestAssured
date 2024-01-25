package JavaLearning.StringExamples;

import java.util.HashMap;
import java.util.Map;

public class StringExamples {


        public static char findMaxOccurringChar(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Input string is null or empty");
            }

            Map<Character, Integer> charCountMap = new HashMap<>();

            // Count the frequency of each character
            for (char c : str.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
                System.out.println(charCountMap.get(c));
            }

            char maxChar = str.charAt(0);
            int maxCount = charCountMap.get(maxChar);

            // Find the character with the maximum frequency
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxChar = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            return maxChar;
        }

        public static void main(String[] args) {
            String input = "programming";
            char maxChar = findMaxOccurringChar(input);
            System.out.println("Maximum occurring character: " + maxChar);
        }


}





