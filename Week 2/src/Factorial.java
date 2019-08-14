import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){15
        ArrayList<Integer> inputs = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter numbers and type 0 when done:");
        int input = 0;
        while (read.hasNextLine()){
            input = read.nextInt();
            if (input == 0){
                break;
            }else{
            inputs.add(input);}

        }
        for (int i: inputs){
            reverseFactorial(i);
        }


    }

    public static void reverseFactorial(int x){
        int factorialCounter = 1;
        int input = x;
        while (input != 1){
            if (input % factorialCounter == 0){
                input /= factorialCounter;
                factorialCounter++;
            }else{
                System.out.println(x + " NONE");
                return;
            }
        }System.out.println(x + "=" + (factorialCounter - 1) + "!");

    }
}
