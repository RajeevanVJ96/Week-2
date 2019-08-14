import java.util.Scanner;

public class Doggo {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        System.out.println("Enter your placement");
        int place = read.nextInt();
        displayPlace(place);
    }

    public static void displayPlace(int i){

        for (int place = 0; place < 100; place++){
            if (place == i){
                continue;
            }else{
                if(place == 1 | place % 10 == 1){
                    System.out.println(place +"st");
                }else if( place == 2 | place % 10 == 2){
                    System.out.println(place +"nd");
                }else if(place == 3 | place % 10 == 3){
                    System.out.println(place +"rd");
                }else{
                    System.out.println(place + "th");
                }


                }
            }
        }
    }

