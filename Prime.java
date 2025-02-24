import java.util.*;
import java.util.Scanner;
public class Prime
  {
    //Creating main method 
    
    public static void main(String[] args){
      //creating a scanner object
      
    Scanner b=new Scanner(System.in);
      //gjuyufyuik//
      //storing the input in number variable
      
      int number=b.nextInt();
      int c=0;//assign c (count value) as 0
      if(number<1){
System.out.print("Not a prime number");}
        for(int i=1;i<=number/2;i++){
        if(number%i==0){
        c++;
        }
        }

        if(c>1){
          System.out.print("Not a prime no");
        }
        else{
          System.out.print("Prime no");
        }
        
      }
  }
