class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> c = new ArrayDeque<>();
        char ch[] = s.toCharArray();
        for(int i = 0;i<s.length();i++){
        boolean isUnique = true;
            for(int j = 0;j<s.length();j++){
                if(i!=j && ch[i] == ch[j]){
                isUnique = false;
                    break;
                }
                }
                if(isUnique){
                    c.add(i);
                }
            
        }
      
        
 if(c.isEmpty()){
        return -1;
       }else{
        return c.peek();
       }
    }
}