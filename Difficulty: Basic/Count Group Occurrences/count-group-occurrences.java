class Sol {
    int getCount(String s, int k) {
        int[] freq = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Sirf tab count karange jab character apne pichhle character se alag ho
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                freq[s.charAt(i) - 'a']++;
            }
        }

        int result = 0;
        // Count characters whose frequency is equal to k
        for (int count : freq) {
            if (count == k) {
                result++;
            }
        }

        return result;
    }
}