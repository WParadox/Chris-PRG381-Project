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
public class Client 
{
    int client_ID;
    String first_Name;
    String last_Name;
    String cell;
    int nID;
    String email;
    double birthdate;
    
    public Client(int client_id, String firstname, String lastname, String cell, int nid, String email, double birthdate)
    {
        this.client_ID = client_id;
        this.first_Name = firstname;
        this.last_Name = lastname;
        this.cell = cell;
        this.nID = nid;
        this.email = email;
        this.birthdate = birthdate;
    }
    
     public void clientdetails()
   {
       
   }
     
    
}
  
