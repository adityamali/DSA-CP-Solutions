// Joseph and Jane are making a contest for apes. During the process, they have to communicate frequently with each other. Since they are not completely human, they cannot speak properly. They have to transfer messages using postcards of small sizes.
// To save space on the small postcards, they devise a string compression algorithm:
// If a character, , occurs  times in a row, then it will be represented by , where  is the value of . For example, if the substring is a sequence of  'a' ("aaaa"), it will be represented as "a4".
// If a character, , occurs exactly one time in a row, then it will be simply represented as . For example, if the substring is "a", then it will be represented as "a".
// Help Joseph to compress a message, msg.

// Input
//     The only line of input contains a string, msg.
// Output
//     Print the string msg as a compressed message.
    
// Constraints
//     1 <= length(msg) <= 10^5>
//     msg consists of lowercase English characters () only.

// Sample Input
// abcaaabbb

// Sample Output
// abca3b3

public class StringCompression {

    public static void main(String[] args) {
        String input = "abcaaabbb";
        System.out.println(stringCompress(input));
    }

    static String stringCompress(String input){
        String Output = "";
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i)==input.charAt(i-1)) {
                count++;
            } 
            else if (input.charAt(i)!=input.charAt(i-1)) {
                if (count > 1) {
                    Output = Output + input.charAt(i-1) + count;
                } else {
                    Output = Output + input.charAt(i-1);
                }
                count = 1;
            }
        }
        if (count > 1) {
            Output = Output + input.charAt(input.length() - 1) + count;
        } else {
            Output = Output + input.charAt(input.length() - 1);
        }
        return Output;
    }
    
}