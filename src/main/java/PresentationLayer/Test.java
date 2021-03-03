/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;
import BusinessLogicLayer.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
/**
 *
 * @author Christopher
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        //Example of how the Presentation will interact with the business layer, In this example we display the firstname of each client in the Client table in the DB
        Client clientObj = new Client();
        List<Client> clients = clientObj.GetClients();
        for (Client cl:clients) {
            System.out.println(cl.getFirstName());
        }
        
        Client clientToInsert =  new Client("Nick", "Morris", LocalDate.of(1990, Month.FEBRUARY, 24), "0735932363", "nick.morris@gmail.com",
                "9002244626963");
        
        //Example of updating a client in the database
        
        
        
    }
}
