public class BlackJack {
    public static void main(String[] args){
        System.out.println(blackJack(10,21));
        System.out.println(blackJack(20,18));
        System.out.println(blackJack(1,22));
        System.out.println(blackJack(22,23));
    }







    public static int blackJack(int x, int y){
        if (x > 21 && y > 21){
            return 0;
        }else if (x > 21){
            return y;
        }else if (y > 21) {
            return x;
        }else if (x > y){
            return x;
        }else{
            return y;
        }
    }
}
