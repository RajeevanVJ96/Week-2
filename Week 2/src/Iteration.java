public class Iteration {

    public static void main(String[] args) {
        appendixB();
        appendixC();


    }


    public static void appendixB() {
        int A = 100;
        while (A < 200){
            System.out.println("A");
            A++;
    }
    }

    public static void appendixC(){
        int A = 100;
        while (A <= 200){
            if (A % 2 == 0){
                System.out.println("-");
                A++;
            }else{
                System.out.println("*");
                A++;
            }
        }
    }
}
