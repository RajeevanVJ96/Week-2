public class Calculator {


    public static void main(String[] args){
        String greeting = "Hi there";
        for (int i = 0; i < greeting.length(); i++){
            System.out.print(greeting.substring(i,i+1));
        }
    }



    public int add(int x, int y){
        return x + y;
    }
}
