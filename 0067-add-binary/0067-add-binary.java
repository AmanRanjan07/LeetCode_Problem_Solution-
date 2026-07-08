// import java.math.BigInteger;

// class Solution {
//     public String addBinary(String a, String b) {

//         BigInteger x = new BigInteger(a, 2);
//         BigInteger y = new BigInteger(b, 2);

//         return x.add(y).toString(2);
//     }
// }


class Solution {
    public String addBinary(String a, String b) {

        // Pointers for both strings
        int i = a.length() - 1;
        int j = b.length() - 1;

        // To store carry
        int carry = 0;

        // To build final answer
        StringBuilder result = new StringBuilder();

        // Traverse until both strings end and carry becomes 0
        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            // Add digit from string a
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add digit from string b
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Current binary digit
            result.append(sum % 2);

            // Update carry
            carry = sum / 2;
        }

        // Reverse because digits were added from right to left
        return result.reverse().toString();
    }
}