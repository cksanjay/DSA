package Java.twopointers;

public class ValidPalindrome {
    int left=0,right=0;
    public boolean isPalindrome(String s) {
        int len=s.length();
        right=len-1;
        boolean isPalin=true;

        while(left<=right){
            int l=getLeftChar(s,len);
            int r=getRightChar(s,len);
            if(!(isAlphaNumeric(l) ||isAlphaNumeric(r))){
                break;
            }
            if((l!=r)){
                isPalin=false;
                break;
            }
            left++;
            right--;
        }
        return isPalin;
    }

    public boolean isAlpha(int c){
        return (c>=65 && c<=90) || (c>=97 && c<=122);
    }

    public boolean isNumber(int c){
        return (c>=48 && c<=57);
    }

    public boolean isAlphaNumeric(int c){
        return isAlpha(c) || isNumber(c);
    }

    public int getLeftChar(String s,int len){
        int l=0;
        while(left<len){
            l= s.charAt(left);
            if(isAlpha(l)||isNumber(l)){
                if((l>=65 && l<=90)){
                    l=l+32;
                }
                break;
            }
            ++left;
        }
        return l;
    }

    public int getRightChar(String s,int len){
        int r=0;
        for(int i=0;i<len;i++){
            r= s.charAt(right);
            if(isAlpha(r)||isNumber(r)){
                if((r>=65 && r<=90)){
                    r=r+32;
                }
                break;
            } else {
                right--;
            }
        }
        return r;
    }
}
