/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketsystem;

/**
 *
 * @author Gabriel
 */
public abstract class Ticket {
    private int ticketPrice;
    private int ticketAmount;
    private int reduction = 2;
    boolean discount;
    
    public Ticket(int amount, boolean discount){
        this.ticketAmount = amount;
        this.discount = discount;
    }
    int getPrice(){
        if (discount == true){
          return ticketPrice - reduction;  
        }
        
        else{
            return ticketPrice;
        }
    }
    
    void setPrice(int price){
        this.ticketPrice = price;
    }
    
    int getTotal(){
        if (discount == true){
            return (ticketPrice-reduction)*ticketAmount;
        }
        else{
          return ticketPrice*ticketAmount;  
        }
        
    }
}
