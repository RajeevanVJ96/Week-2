import java.util.ArrayList;
import java.util.Scanner;

public class GoldyChallenge {

    public static void main(String[] args){

        ArrayList<Seat> seats = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter weight and temperature with a space in between each then enter the temps and light for each seat available?");
        int weight;
        int temp;
        weight = Integer.parseInt(read.next());
        temp = Integer.parseInt(read.next());
        int currentWeight = 0;
        while(read.hasNextLine()) {
            currentWeight = Integer.parseInt(read.next());
            if ( currentWeight == 0){
                break;
            }else{
                int currentTemp = Integer.parseInt(read.next());
                int light = Integer.parseInt(read.next());
                Seat currentSeat = new Seat(currentTemp, currentWeight, light);
                seats.add(currentSeat);
            }
        }

        whichSeats(weight, temp, seats);




    }

    public static void whichSeats(int weight, int temp, ArrayList<Seat> seats){
        ArrayList<Integer> works = new ArrayList<>();
        for (Seat s: seats){
            if (s.getWeight() > weight){
                if(s.getPorridgeTemp() < temp){
                    if(s.getLight() > 70){
                        works.add((seats.indexOf(s) + 1));
                    }else{
                        continue;
                    }
                }else{
                    continue;
                }
            }else{
                continue;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int value : works) {
            builder.append(value);
            builder.append(" ");
        }
        String text = builder.toString();

        System.out.print(text);



    }






    }

