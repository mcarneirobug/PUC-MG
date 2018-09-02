// Dependence
import java.io.IOException;
import java.util.*;

public class Lista0 {

    // Global variable to manipulate input and output data
    public static Scanner in = new Scanner (System.in);

    public static void main ( String [] args ) throws IOException {

        // define data

        String name         = "";
        String genre        = "";
        String nameM        = "";
        String nameF        = "";
        int age             = 0;
        int countM          = 0;
        int countF          = 0;
        int olderM          = 0;
        int olderF          = 0;
        int amountStore     = 0;
        double percentage   = 0.0;
        double height       = 0.0;
        double weight       = 0.0;
        double IMC          = 0.0;
        double sumAverage   = 0.0;
        double finalAverage = 0.0;

        System.out.println("Enter the number of people: ");
        int amount = in.nextInt();

        amountStore    = amount;
        // repeat while people equals 0
        while ( amount > 0 ) {

            System.out.println("\nEnter your name: ");
            name = in.next();

            System.out.println("Enter your age: ");
            age = in.nextInt();

            System.out.println("Enter your height: ");
            height = in.nextDouble();

            System.out.println("Enter your weight: ");
            weight = in.nextDouble();

            System.out.println("Enter your genre [F/M]: ");
            genre = in.next();

            // count how many women
            if(genre.equals("f")) {
                countF++;
            } //end if (1)
            else if (genre.equals("F")) {
                countF++;
            } //end else if (2)

            // count how many men
            else if(genre.equals("m")) {
                countM++;
            } //end else if (3)
            else if(genre.equals("M")) {
                countM++;
            } //end else if (4)

            // Equation to calculate IMC
            IMC = (weight/Math.pow(height, (int)2));
            System.out.printf("Your IMC = %.2f %n", IMC);

            // Calculate percentage
            if ( IMC < 20.0 ) {
                if (genre.equals("f") || genre.equals("F")) {
                    percentage = (100.0 * countF)/100.0; // multiply percentage by value and divide by 100
                } //end if (2)
            } //end if (1)

            if ( genre.equals("M") || genre.equals("m")) {
                if (age > olderM) {
                    olderM = age;
                    nameM  = name;
                } //end if (2)
            } //end if (1)
            else {
                if (genre.equals("F") || genre.equals("f")) {
                    if (age > olderF) {
                        olderF = age;
                        nameF  = name;
                    } //end if (2)
                } //end if (1)
            } //end else

            // calculate age average
            if(genre.equals("m") || genre.equals("M") || genre.equals("F") || genre.equals("f")) {
                sumAverage  += age;
                finalAverage = (sumAverage/amountStore);
            } //end if
            amount--;
        } //end while

        System.out.println("\na.) Age average =  " + finalAverage);
        System.out.println("b.) Number of men interviewed   = " + countM);
        System.out.println("    Number of woman interviewed = " + countF);
        System.out.println("c.) Weight percentage below ideal = " + (int) percentage +  "%");
        System.out.println("d.) Older woman = " + nameF  + " - " + olderF);
        System.out.println("    Older men   = " + nameM  + " - " + olderM);

        System.exit(0);
    } //end main
} //end class