package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<functionalinterfaces.User> users = new ArrayList<>();
        users.add(functionalinterfaces.User.builder().firstName("Mike").lastName("Smith").age(35).build());
        users.add(functionalinterfaces.User.builder().firstName("Tom").lastName("Hanks").age(55).build());
        users.add(functionalinterfaces.User.builder().firstName("Ammy").lastName("Evan").age(15).build());
        users.add(functionalinterfaces.User.builder().firstName("Emma").lastName("Pellard").age(25).build());

        //Print all elements in the list
//        printName(users, p -> true);


        //Print all users that last name starts with E
        printName(users, user -> user.getLastName().startsWith("E"));
    }

    private static void printName(List<functionalinterfaces.User> users, Predicate<functionalinterfaces.User> p){
        for(functionalinterfaces.User user : users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
