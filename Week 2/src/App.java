
public class App {



    public static void main(String[] args){
        imAConsultant();
        String name = "World";
        System.out.println(" called Hello " + name);
        int line = 1;
        System.out.println(handCount(6));
        Bird bird = new Bird();
        Box box = new Box();
        Box box1 = new Box();
        Box.colour = "Green";
        box.item = "Cat";
        System.out.println(box1.item);
        PersonStaticExample p1 = new PersonStaticExample();
        PersonStaticExample p2 = new PersonStaticExample();
        for (PersonStaticExample i: PersonStaticExample.people){
            System.out.println(i);
        }
    }

    public static int handCount(int numOfPeople){
        if (numOfPeople == 0){
            return 0;
        }else{
            return handCount(numOfPeople - 1) + 2;
        }
    }
    public static void imAConsultant(){
        System.out.print("I'm ");
        System.out.print("a ");
        System.out.print("Consultant");
    }
}
