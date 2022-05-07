package Java.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> sHash=new HashMap<>();
        Map<Character,Integer> tHash=new HashMap<>();
        for(int i=0;i<s.length();i++){
            trackChars(sHash, s.charAt(i));
            trackChars(tHash, t.charAt(i));
        }
        return sHash.equals(tHash);
    }

    private void trackChars(Map<Character,Integer> map, char c){
        if(map.containsKey(c)){
            int count=map.get(c)+1;
            map.put(c,count);
        } else {
            map.put(c,1);
        }
    }
}