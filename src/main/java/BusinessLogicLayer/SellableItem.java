/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogicLayer;

/**
 *
 * @author Christopher
 */
public class SellableItem 
{
   int eventitemid;
   String sellitemname;
   String type;
   String description;
   String intendedclientel;
   double costprice;
   double unitprice;
   
   public SellableItem(int eventitemid,String sellitemname,String type,String description,String intendedclientel,double costprice,double unitprice)
    {
        this.eventitemid = eventitemid;
        this.sellitemname = sellitemname;
        this.type = type;
        this.description = description;
        this.intendedclientel = intendedclientel;
        this.costprice = costprice;
        this.unitprice = unitprice; 
    }
}
