import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgages{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = 0;
        while(true){
        System.out.print("Principal ($1k - $1M): ");
        if (scanner.hasNextDouble()){
        principal = scanner.nextDouble();
        if (principal >= 1000 && principal <= 1_000_000)
            break;
            
        }else {
            scanner.next();
        }
        System.err.println("Enter a value between $1,000 and $1,000,000");
        }

        double period = 0;
        while(true) {

        System.out.print("Period(years): ");
        if (scanner.hasNextDouble()) {
            period = scanner.nextDouble();
        if (period >= 1 && period <= 30)
            break;
        }else {
            scanner.next();
        }
        System.out.println("Enter a value between 1 and 30.");
        }

        scanner.nextLine();
        System.out.println("Do you want to take Intrest(riba)(yes/no)? ");
        String takeInterest = scanner.nextLine().trim().toLowerCase();

        if (takeInterest.equals("yes")){
                    double interest = 0;
                    while (true) {
                    System.out.print("Annual Intrest Rate(riba): ");
                    if(scanner.hasNextDouble()){
                    interest = scanner.nextDouble();
                    if (interest >= 1 && interest <= 30)
                        break;
                    }else{
                        scanner.next();
                    }
                    System.out.println("Enter a value greater than 0 and less than or equal to 30.");
                    }
                    interest = ((interest/100)/12);
                    period = period*12;
                    double mortgage = principal*((interest*Math.pow((1+interest), period))/((Math.pow((1+interest), period))-1));

                    String result =  NumberFormat.getCurrencyInstance().format(mortgage);
                    System.out.println("You have chosen riba may Allah guide you");
                    System.out.println("Your monthly mortgage with Intrest is: "+ result);
        }else{
            period = period*12;
            double mo = principal/period;

            String result = NumberFormat.getCurrencyInstance().format(mo);
            System.out.println("Thank you for avoiding interest(riba). May Allah bless your finances ");
            System.out.println("Your monthly payment without interest is : " + result);
        }
        scanner.close();        
    }
}