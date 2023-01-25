import java.util.Scanner;

public class advCalculater {

    static void addition(){

        Scanner add = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Please enter the first number : ");
        int num1 = add.nextInt();

        System.out.print("Please enter the second number : ");
        int num2 = add.nextInt();

        int result = num1 + num2;

        System.out.println(" ");
        System.out.println("Addition Result : ");

    }

    static void subtraction(){
        Scanner subt = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Please enter the first number : ");
        int num1 = subt.nextInt();

        System.out.print("Please enter the second number : ");
        int num2 = subt.nextInt();

        int result = num1-num2;

        System.out.println(" ");
        System.out.println("Subtraction Result : " + result);

    }

    static void multiplication(){
        Scanner multi = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Please enter the first number : ");
        int num1 = multi.nextInt();

        System.out.print("Please enter the second number : ");
        int num2 = multi.nextInt();

        int result = num1*num2;

        System.out.println(" ");
        System.out.println("Multiplication Result : " + result);

    }

    static void divided(){
        Scanner multi = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Please enter the first number : ");
        int num1 = multi.nextInt();

        System.out.print("Please enter the second number : ");
        int num2 = multi.nextInt();

        if (num2 ==0) {
            System.out.println(" ");

            System.out.println("Any number cannot be divided by 0.");
        }

        int result = num2 /num2;
        System.out.println(" ");

        System.out.println("Divided Result : " + result);
    }


    static void exponent(){
        Scanner exp = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Please enter the base number : ");
        int num1 = exp.nextInt();

        System.out.print("Please enter the exponents number : ");
        int num2 = exp.nextInt();

        int result =1 ;
       for (int i=1; i <= num2; i++) {
           result *= num1;
       }
        System.out.println(" ");
           System.out.println("Exponential Result : " + result);


    }

    static void modding(){
        Scanner mod = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Please enter the base number : ");
        int num1 = mod.nextInt();

        System.out.print("Please enter the exponents number : ");
        int num2 = mod.nextInt();

        int result = num1 % num2;
    }

    static void rectangleCalculate(){

        Scanner rect = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Please enter the base number : ");
        int num1 = rect.nextInt();

        System.out.print("Please enter the exponents number : ");
        int num2 = rect.nextInt();

        int perimeter = 2*(num1 + num2);
        int area = num1 * num2;


        System.out.println(" ");
        System.out.println("Perimeter of Rectangle : " + perimeter);
        System.out.println("Area of Rectangle : " + area);
    }

    static void factorial(){
        int result = 1;

        Scanner fact = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Please enter a number : ");
        int n= fact.nextInt();

        for(int i = 1; i <= n ; i++)
            result *=i;

        System.out.println(" ");
        System.out.println("Factorial Result :  " +result);
    }



    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Welcome to the advanced calculator!");

        String menu = "1- Addition\n"+
                "2- Subtraction\n"+
                "3- Multiplication\n"+
                "4- Divided\n"+
                "5- Exponential\n"+
                "6- Modding\n"+
                "7- Rectangle area and perimeter\n"+
                "8- Factorial\n"+
                "0- Sign Out.";

        System.out.println(" ");
        System.out.println(menu);

        while (true){


            Scanner input = new Scanner(System.in);

            System.out.println("    ");
            System.out.print("Please select a process : ");
            int select = input.nextInt();

            if (select == 0) {
                System.out.println("You Logged Out. Goodbye");
                break;
            }



            switch (select){
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    exponent();
                    break;
                case 6:
                    modding();
                    break;
                case 7:
                    rectangleCalculate();
                    break;
                case 8:
                    factorial();
                    break;

                default:
                    System.out.println("You entered an invalid number. Please try again.\n");
            }
        }
    }
}
