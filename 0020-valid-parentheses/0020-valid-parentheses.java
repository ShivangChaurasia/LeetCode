class Solution {
    public boolean isValid(String s) {
        Stack <Character> ch1 = new Stack<>();
        int l=0;
        while(l<s.length()){
            char ch = s.charAt(l);
            if(ch1.size()>0){
                if(ch==')'){
                    if(ch1.peek()=='('){
                        ch1.pop();
                    }
                    else{
                        ch1.push(ch);
                    }
                } 
                else if(ch=='}'){
                    if(ch1.peek()=='{'){
                        ch1.pop();
                    }else{
                        ch1.push(ch);
                    }
                } 
                else if(ch==']'){
                    if(ch1.peek()=='['){
                        ch1.pop();
                    }
                    else{
                        ch1.push(ch);
                    }
                }else{
                    ch1.push(ch);
                }
            }
            else{
                ch1.push(ch);
            }
            l++;
        }

        return ch1.size()==0;

    }
}



// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (char ch : s.toCharArray()) {
//             if (ch == '(') stack.push(')');
//             else if (ch == '{') stack.push('}');
//             else if (ch == '[') stack.push(']');
//             else {
//                 // if stack is empty or top doesn't match
//                 if (stack.isEmpty() || stack.pop() != ch) return false;
//             }
//         }

//         return stack.isEmpty();
//     }
// }
