import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    public static void flipCoin() {
        int heads=0;
        int tails=0;
        int count=1;
        double randum=0.0;
        System.out.println("Please Enter the number");
        Scanner n = new Scanner(System.in);
        int flips = n.nextInt();
        while (count<=flips){
            randum=Math.random();
            System.out.println(count+" "+randum);
            if(randum<0.5){
                heads++;
                System.out.println("heads");
            }
            else{
                tails++;
                System.out.println("Tails");
            }
            count++;
        }

        System.out.println();
        System.out.println("Number of Heads"+heads);
        System.out.println("Number of tails "+tails);

        double headpercent = (double)heads/flips*100;
        double tailpercent = (double)tails/flips*100;

        System.out.println("Percentage of Heads "+headpercent);
        System.out.println("Percentage of tails"+tailpercent);


    }


    public static void leapYear(){
        int year;
        System.out.println("Enter an Year ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(" It is a leap year");
        else
            System.out.println("It is not a leap year");
    }



    static double nthHarmonic(int N)
    {

        float harmonic = 1;

        for (int i = 2; i <= N; i++) {
            harmonic += (float)1 / i;
        }

        return harmonic;
    }


    public static void primeFactor(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }


    public static void quotientRemainder() {

        int dividend = 25, divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }



    public static void swapTwoNumber() {
        int x, y, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("numbers before Swapping "+x +"  "+ y);
        t = x;
        x = y;
        y = t;
        System.out.println("numbers after Swapping  "+x +"   " + y);
        System.out.println();
    }




    public static void evenOdd() {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter any number");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println("It is even Number "+num);
        else
            System.out.println("It is odd Number"+num);
    }



    }


