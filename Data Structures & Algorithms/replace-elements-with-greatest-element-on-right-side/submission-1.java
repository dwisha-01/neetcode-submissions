class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        
        // Loop forward
        for (int i = 1; i < n; i++) {
            int max = -1;
            
            // Look ahead to find the max element strictly to the right of arr[i-1]
            for (int j = i; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            
            // Update the previous element with the max found ahead
            arr[i - 1] = max;
        }
        
        // Set the last element to -1
        arr[n - 1] = -1;
        return arr;
    }
}
