class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for(int i=0;i<n1;i++){
            list1.add(s.charAt(i));
        }
        for(int i=0;i<n2;i++){
            list2.add(t.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
}
