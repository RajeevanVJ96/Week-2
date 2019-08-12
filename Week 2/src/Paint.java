import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

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
        ArrayList<Paint> paints = new ArrayList<>();
        HashMap<String, Double> wasteValues = new HashMap<>();
        int total;
        double waste;
        Paint cheap = new Paint("CheapoMax", 21, 19.99, 10);
        paints.add(cheap);
        Paint that = new Paint("ThatOneWithTheDog", 40, 34.38, 12);
        paints.add(that);
        Paint avg = new Paint("AverageJoes", 16, 17.99, 11);
        paints.add(avg);
        Paint dul = new Paint("DuluxourousPaints", 10, 25.00, 10);
        paints.add(dul);
        int roomSize = 240;
        String leastWaste;
        for (Paint i: paints){
            waste = paintLeft(roomSize, i);
            wasteValues.put(i.getName(), waste);
        }
        Double min = Collections.min(wasteValues.values());
        System.out.println("The paint that wastes the least " + Collections.min(wasteValues.values()));

        for (Paint i: paints){
            total = noOfCans(roomSize, i);
            //      Prices.put(i.getName(), (i.getPrice())*total);
        }

        // System.out.println("The cheapest for the current roomsize is " + Collections.min(Prices.keySet()));



    }

    public static int paintLeft(int size, Paint paint){
        int remainder;
        if (size < paint.getLitre() * paint.getArea()){
            return ( (paint.getLitre() * paint.getArea()) - size)/ paint.getArea();
        }
        else{
            remainder = size % (paint.getLitre() * paint.getArea());
            return ( (paint.getLitre() * paint.getArea()) - remainder)/ paint.getArea();
        }

    }

    public static int noOfCans( int roomSize, Paint paint){
        int total_litres = roomSize / paint.getArea();
        if ((paint.getLitre() - total_litres) > 0 ){
            return 1;
        }else{
            return 1 + Math.round((total_litres - paint.getLitre())/paint.getLitre());
        }

    }

    //public static int remainingPaint()

}