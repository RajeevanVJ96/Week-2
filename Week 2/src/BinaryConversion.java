import java.util.HashMap;
import java.util.Scanner;

public class BinaryConversion {

    public static void main(String[] args) {

        HashMap<Integer, Integer> binary = new HashMap<>();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the binary code:");
        String input = read.nextLine();
        char[] breakUp = input.toCharArray();
        toDecimal(breakUp);
    }


    public static void toDecimal(char[] breakUp) {
        int total = 0;
        int length = breakUp.length;
        for (char i : breakUp) {
            if (i == '0') {
                continue;

            }else if( i == '1'){
                total = total + 1 << ((length - i)/2);
                System.out.println(total);


//                }
//            }
//            System.out.println(total);


            }
        }
    }}
