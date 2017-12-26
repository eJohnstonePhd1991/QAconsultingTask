/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketsystem;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class TicketSystem {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String discountDay = "WEDNESDAY";
        int std=0;
        int stu=0;
        int oap=0;
        int child=0;
        String dayIn = "SUNDAY";
        boolean discount = false;
        String result;
        System.out.println("What day is your movie?");
        dayIn = input.next();
        result = dayIn.toUpperCase();
        
        if (result.equals(discountDay)){
            System.out.println("discount applied");
            discount = true;
        }
        
        System.out.println(result);
        System.out.println("How many Standard tickets? :");
        std = input.nextInt();
       System.out.println("How many Student tickets? :");
        stu = input.nextInt();
        System.out.println("How many OAP tickets? :");
        oap = input.nextInt();
        System.out.println("How many Child tickets :");
        child = input.nextInt();
        
        System.out.println("Your total order comes to : £" 
                + BasketTotal(std,stu,oap,child,discount));
         
         
        
    }
    
    public static int BasketTotal(int stdAmt, int stuAmt, int oapAmt, int childAmt,boolean discount){
            Standard standard = new Standard(stdAmt,discount);
            Student student = new Student(stuAmt,discount);
            Oap oap = new Oap(oapAmt,discount);
            Child child = new Child(childAmt,discount);
            
            return standard.getTotal()
                    + student.getTotal() 
                    + oap.getTotal() 
                    + child.getTotal();
            
        }
    
}
