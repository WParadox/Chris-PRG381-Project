/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

/**
 *
 * @author Kyle Opperman
 */
public class EventSellableItems 
{
    int event_id;
    int eventitemid;
    int quantity;
    double discount;
    
    public EventSellableItems(int event_id, int eventitemid, int quantity, double discount)
    {
       this.event_id = event_id;
       this.eventitemid = eventitemid;
       this.quantity = quantity;
       this.discount = discount;
    }
}
