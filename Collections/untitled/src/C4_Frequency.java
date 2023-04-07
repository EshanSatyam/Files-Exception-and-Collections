import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C4_Frequency {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a string : ");
                String String = scanner.nextLine();

                // creating a hashmap to store frequency
                Map<Character, Integer> frequencyCount = new HashMap<Character, Integer>();

                // iterating
                for (char c : String.toCharArray()) {

                    // Checking if the character is a digit or an alphabet
                    if (Character.isDigit(c) || Character.isAlphabetic(c)) {


                        // update the frequency of the character in the hashmap
                        frequencyCount.put(c, frequencyCount.getOrDefault(c, 0) + 1);
                    }
                }

                // Printing the frequency
                for (Map.Entry<Character, Integer> entry : frequencyCount.entrySet()) {
                    System.out.println(" + entry.getKey() + " + entry.getValue());
                }
            }
        }
