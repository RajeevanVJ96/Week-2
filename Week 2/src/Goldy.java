import java.util.ArrayList;
import java.util.Scanner;

public class Goldy {

    public static void main(String[] args){
        ArrayList<Integer> weight = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter weight and temperature with a space in between each then enter the seats and temps available?");
        int currentWeight = 0;
        while(read.hasNextLine()) {
            currentWeight = Integer.parseInt(read.next());
            if (currentWeight == 0 ){
                break;
            }else{
                int currentTemp = Integer.parseInt(read.next());
            weight.add(currentWeight);
            temp.add(currentTemp);

        }
        }
        whichSeats(weight, temp);
    }

    public static void whichSeats (ArrayList<Integer> weights, ArrayList<Integer> temps){
        int targetWeight = weights.get(0);
        weights.remove(0);
        int targetTemp = temps.get(0);
        temps.remove(0);
        ArrayList<Integer> seats = new ArrayList<>();
        for ( int w: weights){
            if (w > targetWeight){
                if (temps.get(weights.indexOf(w)) < targetTemp){
                    seats.add(weights.indexOf(w) + 1);
                }
            }else{
                continue;
            }
                }

        StringBuilder builder = new StringBuilder();
        for (int value : seats) {
            builder.append(value);
            builder.append(" ");
        }
        String text = builder.toString();

        System.out.print(text);


            }
        }



