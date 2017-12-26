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
public class Standard extends Ticket {
    Standard(int amount, boolean discount){
        super(amount,discount);
        this.ticketPrice = 8;
}
}