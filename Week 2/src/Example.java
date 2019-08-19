import java.util.ArrayList;

public class Example {

    public static void main(String[] args){
       // int lg = Math.max(Math.max(4,60), Math.max(60,9));
      //  System.out.println(lg);
        //evenlySpaced(2,4,6);
        String choc = "hello";
        System.out.println(choc.(choc.charAt(choc.length()/2), "");
       System.out.println(nMid("Chocolate", 3));
       // System.out.println(getBert("bertclivebert"));

    }

    public static String nMid(String input, int a) {
        String formatedString = "";
        if (((input.length()) % 2 == 1)) {
            if (a == 1) {
                formatedString = formatedString.replace(formatedString.substring((input.length() / 2), ((input.length() / 2) + 1)), "");
            } else {
                formatedString = formatedString.replace(formatedString.substring((input.length() / a), a + 3), "");
            }

        }
        return formatedString;
    }
    public static void evenlySpaced(int a, int b, int c) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(a);
        nums.add(b);
        nums.add(c);
        int lg = Math.max(Math.max(a, b), Math.max(b, c));
        int sm = Math.min(Math.min(a, b), Math.min(b, c));
        int md = 0;
        for (int i : nums){
            if (i == lg | i == sm){
                continue;
            }else {
                md = i;
            }
        }
        System.out.println(lg);
        System.out.println(sm);
        System.out.println(md);

    }

//    public static String getBert(String input) {
//        String bert = "bert";
//        String returned = "";
//        String formatedInput = input.toLowerCase();
//        if (formatedInput.contains(bert)){
//            formatedInput = formatedInput.replaceFirst(bert, "");
//            if(formatedInput.contains(bert)){
//                formatedInput = formatedInput.replaceAll(bert, "");
//                for (int i = 0; i < formatedInput.length(); i++){
//                    returned += formatedInput.charAt((formatedInput.length()-1) - i);
//                }
//                return returned;
//            }else{
//                return "";
//            }
//
//        }else{
//            return "";
//        }
//
//    }



    public static int largest(String arg1) {
        ArrayList<Integer> totals = new ArrayList<Integer>();
        String[] args = arg1.split(" ");

        for (String s: args){
            int currentTotal = 0;
            for (char c: s.toCharArray()){
                currentTotal += (Integer.parseInt(String.valueOf(c)));
                //
            }
            totals.add(currentTotal);
        }

        int max = 0;
        for (int i:totals){
            if (i > max){
                max = i;
            }else{
                continue;
            }
        }
        return max;


    }
}
