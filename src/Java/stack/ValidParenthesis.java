package Java.stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        char[] arr=new char[s.length()];
        int len=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                arr[len]=c;
                len++;
            } else if(len>0){
                if(c==')'){
                    if(arr[len-1]=='('){
                        len--;
                    }else {
                        break;
                    }
                } else if(c=='}'){
                    if(arr[len-1]=='{'){
                        len--;
                    }else {
                        break;
                    }
                } else if(c==']'){
                    if(arr[len-1]=='['){
                        len--;
                    }else {
                        break;
                    }
                }
            } else{
                return false;
            }
        }
        return len==0;
    }
}
