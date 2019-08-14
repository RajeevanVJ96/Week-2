public class Seat {

    int porridgeTemp;
    int weight;
    int light;

    public Seat(int porridgeTemp, int weight, int light){
        this.porridgeTemp = porridgeTemp;
        this.weight = weight;
        this.light = light;
    }

    public int getPorridge() {
        return porridgeTemp;
    }

    public int getWeight() {
        return weight;
    }

    public int getLight() {
        return light;
    }
}
