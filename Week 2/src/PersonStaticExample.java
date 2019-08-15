import java.util.ArrayList;

public class PersonStaticExample {

    public String name;
    public int age;
    public static ArrayList<PersonStaticExample> people = new ArrayList<PersonStaticExample>();

    public PersonStaticExample(){
        people.add(this);
    }
}
