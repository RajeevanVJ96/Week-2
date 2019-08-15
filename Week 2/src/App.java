
public class App {



    public static void main(String[] args){
        imAConsultant();
        String name = "World";
        System.out.println(" called Hello " + name);
        int line = 1;
        System.out.println(handCount(6));
        Bird bird = new Bird();
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
