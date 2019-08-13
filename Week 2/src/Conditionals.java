import java.util.Scanner;

public class Conditionals {

    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = read.nextInt();
        System.out.println("Enter second number:");
        int b = read.nextInt();
        System.out.println("True or False? enter 1 or 0");
        int c = read.nextInt();
        Boolean choice;
        if (c == 1){
            choice = true;
        }else{
            choice = false;
        }
        result(a,b,choice);
        System.out.println("Enter number:");
        int d = read.nextInt();
        read.close();
        effedUp(d);


    }

    public static int result(int a,int b,Boolean c) {
        if(a % 2 == 0 || b % 2 == 0){
            return 0;
    }else if (c == true){
            return (a+b);
        }else{
            return (a+b);
        }
    }

    public static void effedUp(int d){
        if(d > 2000){
            System.out.println("A");
            if (d > 6000){
                System.out.println("C");
            }else{
                System.out.println("B");
                if (d > 4000){
                    System.out.println("D");
                }else{
                    System.out.println("E");
                }
            }
        }else{
            System.out.println("1");
            if (d > 100){
                System.out.println("3");
                if (d > 600){
                    System.out.println("5");
                }else{
                    System.out.println("4");
                    if(d > 500){
                        System.out.println("6");
                    }else{
                        System.out.println("7");
                    }
                }
            }else{
                System.out.println("2");
            }
        }
    }
}
