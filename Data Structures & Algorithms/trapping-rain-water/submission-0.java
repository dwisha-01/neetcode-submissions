class Solution {
    public int trap(int[] height) {
       int n = height.length;
       int[] leftMax = new int[n];
       int[] rightMax = new int[n];
       rightMax[n-1] = height[n-1];
       leftMax[0] = height[0];
       for(int i=1;i<n;i++){
          if(leftMax[i-1]>height[i]){
            leftMax[i] = leftMax[i-1];
          }
          else{
            leftMax[i] = height[i];
          }
          
        } 
        for(int i=n-2;i>=0;i--){
            if(rightMax[i+1]>height[i]){
                rightMax[i] = rightMax[i+1];
            }
            else{
                rightMax[i] = height[i];
            }
            
        }
        int total = 0;
        for(int i=0;i<n;i++){
            int water = Math.min(leftMax[i], rightMax[i])-height[i];
            total+=water;
        }
        return total;
    }
}
