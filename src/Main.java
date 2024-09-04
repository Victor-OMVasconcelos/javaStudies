import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){

        /*double friends = 10;

        friends = friends + 2;
        friends ++;
       friends = (double) friends / 3;
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");


        //Math in java (Math.max, Math.min, Math.abs(also the positive value), Math.sqrt
        //Math.round, Math.ceil(round up), Math.floor(round down)
        //Using math to find hypotenuse of a triangle:
        Scanner sc = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.println("Enter side x: ");
        x = sc.nextDouble();
        System.out.println("Enter side y: ");
        y = sc.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+z);

        //closing scanner is good practice
        scanner.close();


        //RANDOM NUMBERS
        Random random = new Random();

        //if you don't limit size in the () it can be negative 2 billion to positive 2 billion
        //you add the +1 because otherwise it will go from 0 to 5, since computers start at 0 (this is a dice)
        int x = random.nextInt(6)+1;

        //next double gives random value between 0 and 1
        double y = random.nextDouble();

        //true or false
        boolean z = random.nextBoolean();

        System.out.println(z);


        //IF STATEMENTS
        int age = 75;

        if(age >= 75){
            System.out.println("Ok boomer!");
        }
        else if(age >=18){
            System.out.println("You are an adult!");
        }
        else {
            System.out.println("You are not an adult!");
        }


        //SWITCHES
        //allows a variable to br tested for equality against a list of values
        String day = "Pizza";

        //If you don't add break, as soon as it finds a match it will print everything bellow it too.
        switch(day) {
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            case "Saturday":
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("That is not a day!");
        }


        //LOGICAL OPERATORS

        // &&(it means "and", both conditions must be true
        /*int temp = 19;

        if(temp > 30) {
            System.out.println("It is hot outside!");
        }
        else if(temp >= 20 && temp<= 30) {
            System.out.println("It is warm outside!");
        }
        else {
            System.out.println("It is cold outside!");
        }


        // ||(it means "or", either condition must be true
        Scanner sc = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        //next checks the next key you press
        String response = sc.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You are still playing the game");
        }


        // !(it means "not", reverse boolean value of condition)
        Scanner sc = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");

        String response = sc.next();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game");
        }
        else {
            System.out.println("You quit the game");
        }


        //WHILE LOOPS
        Scanner sc = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name =sc.nextLine();
        }
        System.out.println("Hello "+name);

        //DO LOOP: always executes block of code before verifying the condition
        do{
            System.out.print("Enter your name: ");
            name =sc.nextLine();
        }while(name.isBlank());
        System.out.println("Hello "+name);


        //FOR LOOP (Executes a limited amount of times, unlike a while loop
        // if you were to write i-=2 instead of i--, it would jump 2 numbers each time (10,8,6,4,2,0)
        for(int i = 10; i>=0; i--) {
            System.out.println(i);
        }
        System.out.println("Happy new year!");


        //NESTED LOOPS
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter # of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter symbol to use");
        symbol = sc.next();

        for(int i=1; i<=rows; i++) {
            System.out.println();
            for(int j = 1; j<=columns;j++) {
                System.out.print(symbol);
            }
        }


        //ARRAYS (store multiple values in a single variable
        String[] cars = {"Camaro","Corvette","Tesla"};

        cars[0] = "Mustang";

        System.out.println(cars[0]);

        //OR

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for(int i = 0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }


        //2D ARRAYS = AN ARRAY OF ARRAYS (ROWS AND COLUMNS)
        String[][] cars = new String [3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for(int i = 0; i<cars.length; i++) {
            System.out.println();
            for(int j = 0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }
         */







    }
}