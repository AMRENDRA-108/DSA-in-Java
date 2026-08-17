class Solution {
    String removeDuplicates(String s) {
        // ASCII characters ke liye boolean array
        boolean[] visited = new boolean[256];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Agar character pehle nahi dekha gaya
            if (!visited[ch]) {
                ans.append(ch);
                visited[ch] = true; //  visited char
            }
        }

        return ans.toString();
    }
}