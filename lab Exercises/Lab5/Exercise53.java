import java.util.Scanner;
 class EmployeeException extends Exception{

           

    }
class Exercis53{
         public static void main(String[] args){
           try{
                System.out.println("Enter the salary: ");
                Scanner s = new Scanner(System.in);
                 double sal = s.nextDouble();
                  SalaryLimit s2 = new SalaryLimit();
                      s2.salaryLimit(sal);
                 }
                catch(EmployeeException e){

                    System.out.println("your salary balance is below 3000");
 
               }
         
     }
}
class SalaryLimit{

     static void salaryLimit(double sal)throws EmployeeException{
         if(sal < 3000)
        {
          throw new EmployeeException(); 
         }         
         else{
            System.out.println("salary submitted successfull");
         }
   
   }
}