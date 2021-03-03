/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;
/**
 *
 * @author Christopher
 */
public class DataHandler {
    String connectionString = "jdbc:ucanaccess://DeliciousCatering.accdb";
    Connection conn;

    public DataHandler(String connectionString) {
        this.connectionString=connectionString;
    }
    
    public DataHandler() {
    }
       
    public void CreateConnection(){
        try {
            conn =DriverManager.getConnection(connectionString);
            System.out.println("Connection Successfull");
           
        } catch (SQLException ex) {
            System.out.println("Connection Error:\n"+ex.getMessage());
        }
    }
    
    public void CloseConnection() throws SQLException{
         conn.close();
    }
    
    //---------------------------------
    //Data handler output
    //---------------------------------
    
    
    public ResultSet GetResultSet(String selectStatement){
        
        ResultSet result =null;
        try {
            Statement statement = conn.createStatement();
            result = statement.executeQuery(selectStatement);
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
               
        return result;
    }
       
    //---------------------------------
    //Data handler input
    //---------------------------------
    
    public void Insert(String insertStatement){
        Statement statement;
        try {
            statement = conn.createStatement();
            statement.executeUpdate(insertStatement);
            System.out.println("Row Successfully Inserted");
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
    }
    
    
    //---------------------------------
    //Data handler processes
    //---------------------------------   
    
    //updates
    //deletes
    //==========
    //...
    
    
        
 
    
    
    
}
