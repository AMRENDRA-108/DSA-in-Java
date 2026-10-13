class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        // Loop tab tak chalega jab tak dono strings ke digits ya carry khatam na ho jaye
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                // Character ko integer mein convert karange
                sum += a.charAt(i) - '0';  
                i--;
            }
            
            if (j >= 0) {
                // Character ko integer mein convert karange
                sum += b.charAt(j) - '0'; 
                j--;
            }
            
            // Current digit (0 ya 1) ko append karange
            result.append(sum % 2);
            
            // New carry updated (0 ya 1)
            carry = sum / 2;
        }
        
        // Right-to-left add kiya tha, isliye reverse karke return karo
        return result.reverse().toString();
    }
}