import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Calculator {


    public static void main(String[] args){
        String greeting = "Hi there";
        System.out.println(greeting.substring(1,5));
        for (int i = 0; i < greeting.length(); i++){
            System.out.println(greeting.substring(i,i+1));
        }
        System.out.println(Into(greeting));
        System.out.println(reverseString(greeting));
    }

    private static String reverseString(String greeting) {
        String reversed = "";
        for (int i = 0; i < greeting.length(); i++){
            reversed += greeting.charAt((greeting.length()-1) - i);
        }
        return reversed;
    }

    private static String Into(String greeting) {
        String returnSentence = "";
        for (int i = 0; i < greeting.length(); i++){
            if (greeting.substring(i, i +1).equals("i")){
                returnSentence += "o";
            }else{
                returnSentence += greeting.substring(i,i+1);
            }
        }
        return returnSentence;
    }


    public int add(int x, int y){
        return x + y;
    }
}
