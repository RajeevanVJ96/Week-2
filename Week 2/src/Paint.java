import java.util.ArrayList;

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
        Paint cheap = new Paint("CheapoMax", 21, 19.99, 10);
        paints.add(cheap);
        Paint that = new Paint("ThatOneWithTheDog", 40, 34.38, 12);
        paints.add(that);
        Paint avg = new Paint("AverageJoes", 16, 17.99, 11);
        paints.add(avg);
        Paint dul = new Paint("DuluxourousPaints", 10, 25.00, 10);
        paints.add(dul);
        int roomSize = 50;
        Paint best = cheap;
        for (Paint i: paints){
            if (paintLeft(roomSize, i) < paintLeft(roomSize, best)){  //loop through arraylist of paints and check which one has the most paint leftover after use.
                best = i;
            }
        }
        System.out.println(best.getName());
    }

    public static float paintLeft(int size, Paint paint){
        float paintUsed = size/ paint.getArea(); //size of room/ m^2 per litre
        return paint.getLitre() - paintUsed; // total paint - paintused
    }





}
