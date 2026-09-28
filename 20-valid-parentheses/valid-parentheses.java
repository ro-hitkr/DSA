class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();
        for(int i=0;i<s.length();i++){
            char chh = s.charAt(i);
            if(chh == '(' || chh == '{' || chh == '['){
                ch.push(chh);
            }else{
                if(ch.isEmpty()){
                    return false;
                }
                if((ch.peek() == '(' && chh == ')')||
                    (ch.peek() == '{' && chh == '}')||
                    (ch.peek() == '[' && chh == ']')){
                    ch.pop();
                }else{
                    return false;
                }
            }
        }
        return ch.isEmpty();
       
        }
    }
