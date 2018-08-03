// dependencias

import java.util.*;
import java.io.*;


public class Lista0 { 

   public static Scanner in = new Scanner (System.in);
   
   public static void main ( String [] args ) throws IOException {  
   String name    = "";
   int    age     = 0;
   float high    = 0;
   float weight  = 0;
   char   genre   = 'f';
   int countF = 0, countM = 0; 
   
   System.out.println("Insira a quantidade de pessoas: ");
   int quantidade = in.nextInt();
   
   while ( quantidade > 0 ){
      
      
      System.out.println("Insira seu nome: ");
      name   = in.next();
      
      System.out.println("Insira sua idade: ");
      age    = in.nextInt();
      
      System.out.println("Insira sua altura: ");
      high   = in.nextFloat();
      
      System.out.println("Insira seu peso: ");
      weight = in.nextFloat();
      
      System.out.println("Insira o sexo [F/M]: ");
      
      genre  = (char) System.in.read();
      
      while ( genre == 'M' || genre == 'F' || genre == 'm' || genre == 'f' ) {
         
         if(  genre == 'M' || genre == 'm' ) {
            countM++;
         } //end se
         else {
            countF++;
         } //end else
         genre = 'n';
      } //end while
      quantidade--;
      double sum = 0.0;
      
      sum = weight/high math.pow(high, high);
      
      System.out.println(""+name+ " - IMC = "+ sum );
 
   } //end while 
     System.out.println("Fim...");
   } //end main
} //end class