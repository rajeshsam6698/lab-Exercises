import java.util.Scanner;
 
class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
 }
}
public class Exercise51 {
 
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter ur age : ");
  int age = s.nextInt();
  
  try {
   if(age < 15) 
    throw new AgeException("Not Eligible");
   else
    System.out.println("Eligible");
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
}