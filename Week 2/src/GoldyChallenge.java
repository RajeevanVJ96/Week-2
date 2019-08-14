import java.util.ArrayList;
import java.util.Scanner;

public class GoldyChallenge {

    public static void main(String[] args){

        ArrayList<Seat> seats = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter weight and temperature with a space in between each then enter the seats and temps available?");
        int weight;
        int temp;
        int currentWeight = 0;
        while(read.hasNextLine()) {
            currentWeight = Integer.parseInt(read.next());
            if (currentWeight == 0 ){
                break;
            }else{
                int currentTemp = Integer.parseInt(read.next());
                int light = Integer.parseInt(read.next());
                Seat currentSeat = new Seat(currentTemp, currentWeight, light);
                seats.add(currentSeat);
            }
        }
//        int currentjk



    }






    }

