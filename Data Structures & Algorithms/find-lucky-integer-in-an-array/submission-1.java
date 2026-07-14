class Solution {
    public int findLucky(int[] arr) {
      int n = arr.length;
      HashMap<Integer, Integer> map = new HashMap<>();
      List<Integer> list = new ArrayList<>();
      for(int i=0;i<n;i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
      }
      for(Map.Entry<Integer, Integer> entry: map.entrySet()){
          if(entry.getKey().equals(entry.getValue())){
             list.add(entry.getKey());
            }
           
        }
        if(list.isEmpty()){
            return -1;
        }
      return Collections.max(list);
      
    }
}