import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Paint {
    String name;
    int litre;
    double price;
    int area;


    public int getLitre() {
        return litre;
    }

    public double getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public Paint(String name, int litre, double price, int area){
        this.name = name;
        this.litre = litre;
        this.price = price;
        this.area = area;
    }

    public static void main(String[] args){
        ArrayList<Paint> paints = new ArrayList<>();                 // ArrayList of the different paint objects
        ArrayList<String> brandName = new ArrayList<>();             // ArrayList of the different brand names
        ArrayList<Double> wasted = new ArrayList<>();                // ArrayList of how much paint is remaining after use
        ArrayList<Double> Prices = new ArrayList<>();                // Arraylist of how much it costs to paint a room using each brand
        int total;
        double waste;
        Paint cheap = new Paint("CheapoMax", 21, 19.99, 10);
        paints.add(cheap);
        Paint that = new Paint("ThatOneWithTheDog", 40, 34.38, 12);
        paints.add(that);
        Paint avg = new Paint("AverageJoes", 16, 17.99, 11);
        paints.add(avg);
        Paint dul = new Paint("DuluxourousPaints", 10, 25.00, 22);
        paints.add(dul);
        System.out.println("Please enter the size of the room you'd like to paint:");
        Scanner read = new Scanner(System.in);
        String size = read.next();
        int roomSize = Integer.parseInt(size);                                                                            // Room size to paint
        double currentWaste;
        for (Paint i: paints){
            currentWaste = paintLeft(roomSize, i);                                                     // Method call that returns how much paint is left after painting
            brandName.add(i.getName());
            wasted.add(currentWaste);
        }
        System.out.println("The brand that wastes the least is " + brandName.get(wasted.indexOf(Collections.min(wasted))) + " with " + Collections.min(wasted));

        for (Paint i: paints){
            total = noOfCans(roomSize, i);                                 // method returns total number of cans
            Prices.add((i.getPrice()) * total);                            // get total price by multiplying price of one by no of cans.
        }

         System.out.println("The cheapest for the current roomsize is " + brandName.get(Prices.indexOf(Collections.min(Prices))));



    }

    public static int paintLeft(int size, Paint paint){
        int remainder;
        if (size < paint.getLitre() * paint.getArea()){                                                  // If we can paint with the one can
            return ( (paint.getLitre() * paint.getArea()) - size)/ paint.getArea();                      // (Total amount in a can * area per litre) - room size)/ area per litre
        }
        else{
            remainder = size % (paint.getLitre() * paint.getArea());                                     // If we need more cans then leftover litres needed from extra can =  room size % (Total amount in a can * area per litre)
            return ( (paint.getLitre() * paint.getArea()) - remainder)/ paint.getArea();                 // (Total amount in a can * area per litre) - leftover)/ area per litre
        }

    }

    public static int noOfCans( int roomSize, Paint paint){
        int total_litres = roomSize / paint.getArea();                                              // Total litres needed to paint room
        if ((paint.getLitre() - total_litres) > 0 ){                                                // if it can be done in one can
            return 1;
        }else{
            return 1 + (total_litres/paint.getLitre());                                             // else return 1 + total amount divided by capacity of each paint
        }

    }

}