class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(String s:arr){
            if(map.get(s)==1){
                k--;
            }
            if(k==0){
                return s;
            }
        }
        return "";
    }
}