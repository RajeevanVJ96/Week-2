public class Transfer {

    public static void main(String[] args){

        for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }else if(i == 7){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
