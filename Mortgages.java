import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgages{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Period(years): ");
        double period = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Do you want to take Intrest(riba)(yes/no)? ");
        String takeInterest = scanner.nextLine().trim().toLowerCase();

        if (takeInterest.equals("yes")){
                    System.out.print("Annual Intrest(riba): ");
                    double Interest = scanner.nextDouble();
                    Interest = ((Interest/100)/12);
                    period = period*12;
                    double mortgage = principal*((Interest*Math.pow((1+Interest), period))/((Math.pow((1+Interest), period))-1));

                    String result =  NumberFormat.getCurrencyInstance().format(mortgage);
                    System.out.println("You have choosen riba may Allah guide you");
                    System.out.println("Your monthly morgage with Intrest is: "+ result);
        }else{
            period = period*12;
            double mo = principal/period;

            String result = NumberFormat.getCurrencyInstance().format(mo);
            System.out.println("Thank you for avoiding intrest(riba). May Allah bless your finances ");
            System.out.println("Your monthly payment without intrest is : " + result);
        }
        scanner.close();        
    }
}