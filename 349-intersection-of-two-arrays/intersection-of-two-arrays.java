class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        int n;

        if (nums1.length > nums2.length) {
            n = nums2.length;
        } else {
            n = nums1.length;
        }

        int[] arr = new int[n];
        int start = 0;

        for (int i = 0; i < nums1.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    // Check whether already present
                    for (int k = 0; k < start; k++) {
                        if (arr[k] == nums1[i]) {
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        arr[start] = nums1[i];
                        start++;
                    }

                    break;
                }
            }
        }

        return Arrays.copyOf(arr, start);
    }
}