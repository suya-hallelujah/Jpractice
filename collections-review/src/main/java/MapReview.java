import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Arman");
        map.put(2,"Moses");
        System.out.println(map.get(2));

        System.out.println(findFirstNonRepeatingCharacter("jopajop"));

    }

    public static Character findFirstNonRepeatingCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();
        int count=1;
        for(Character ch:str.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,count);
            }else{
                map.put(ch,count+1);
            }
        }

        for(Character ch: str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }
        return null;
    }
}
