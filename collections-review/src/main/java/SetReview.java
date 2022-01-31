import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        //1. create a set
        Set<Student> mySet = new HashSet<>();

        //2 add element
        mySet.add(new Student(7,"Ibadet"));
        mySet.add(new Student(8,"Johny"));
        mySet.add(new Student(9,"Sasha"));
        mySet.add(new Student(9,"Sasha"));//not added, implemented hashcode and equals in Student class

        System.out.println(mySet);

        Set<Integer> numSet=new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));

        System.out.println("===================================");

        System.out.println(firstRepeatingChar("Kto by znalk"));


        //find first repeating character

        String  str = "jAva Developer";
        str = str.replace(" ", "").toLowerCase();

        Set<Character> strSet = new HashSet();

        char result = 'x';

        for(int i = 0; i<str.length();i++){
           if(!strSet.add(str.charAt(i))){
               result = str.charAt(i);
               break;
           }
        }
        System.out.println(result);
    }

    public static Character firstRepeatingChar(String str){

        str = str.replace(" ", "").toLowerCase();

        Set<Character> chars = new HashSet<>();

        for(Character ch: str.toCharArray()) if(!chars.add(ch)) return ch;
        return null;
    }
}
