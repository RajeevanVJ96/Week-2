import java.util.Scanner;

public class Taxes {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Salary:");
        int salary = read.nextInt();
        percTaxAmount(salary);
        taxExactAmount(salary);
    }

    public static int percTaxAmount(int salary){
        if (salary >= 0 & salary < 14999){
            return 0;
        }else if ((salary >= 15000 & salary < 19999)){
            return 10;
        }else if (salary >= 20000 & salary < 29999){
            return 15;
        }else if (salary >= 30000 & salary < 44999){
            return 20;
        }else{
            return 25;
        }
    }

    public static double taxExactAmount(int salary){
        int taxAmount = percTaxAmount(salary);
        return salary * 0.1;


    }
}

