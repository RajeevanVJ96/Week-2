import java.util.ArrayList;


public class Person {


    public static void main(String[] args){
        Person a = new Person("Raj", 28, "annoying");
        Person b = new Person("John", 21, "annoying");
        Person c = new Person("Bob", 25, "annoying");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(a);
        persons.add(b);
        persons.add(c);
        persons.stream().forEach(System.out::println);
        findPerson("John",persons);
    }

    String name;
    int age;
    String title;

    public Person(String name, int age, String title){
        this.name = name;
        this.age = age;
        this.title = title;
    }


    public String toString(){
        return "Name: " + this.name + " Age: " + this.age
                + " Title: " + this.title;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }

    public static void findPerson(String name, ArrayList<Person> persons){
        for (Person person: persons){
            if (person.getName() == name){
                System.out.println(name + " was found ");
            }
        }
    }
}
