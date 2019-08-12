public class Results {

    static int physics;
    static int biology;
    static int chemistry;

    public static void main(String[] args){
        physics = 50;
        biology = 100;
        chemistry = 125;
        results(physics, biology,chemistry);
        percentage(physics+biology+chemistry);
        for (int i = 1; i<5; i++){
            System.out.println(i);
        }

    }

    public static void results(int ph, int bio, int chem){
        System.out.println("Physics:" + ph);
        System.out.println("Biology:" + bio);
        System.out.println("Chemistry:" + chem);
        System.out.println("Total:" + (ph + bio + chem));

    }

    public static int percalc(int x){
        return (x/150)* 100;
    }

    public static void percentage(int total){
        int percentage = (total*100)/450;
        if (percentage >= 60){
            if (percalc(physics) < 60){
                specific(biology, chemistry);
            }else if(percalc(biology) < 60){
                specific(physics, chemistry);
            }else if(percalc(chemistry) < 60){
                specific(biology, physics);
            }else{
                System.out.println("You passed");
            }
        }else{
            System.out.println("You failed with "+ percentage);
        }
    }

    public static void specific(int x, int y){
        if (percalc(x) < 60 & percalc(y) < 60){
            System.out.println("You failed 3 subjects");
        }else if(percalc(x) < 60 || percalc(y) < 60){
            System.out.println("You failed 2 subjects");
        }else{
            System.out.println("You failed 1 subjects");
        }
    }
}
