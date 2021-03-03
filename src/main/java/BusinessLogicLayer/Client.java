/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogicLayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DataAccessLayer.DataHandler;


/**
 *
 * @author Christopher
 */
public class Client 
{
    //private fields
    private int clientID;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String cellNum;
    private String email;
    private String nationalID;
    
    //Properties
    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }
    public String getFirstName(){
        return firstName;
    }  
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellNum() {
        return cellNum;
    }

    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }
    
    //Constructor with all client fields as paramenters
    public Client(int clientID, String firstName, String lastName, Date birthDate, String cellNum, String email, String nationalID) {
        this.clientID = clientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.cellNum = cellNum;
        this.email = email;
        this.nationalID = nationalID;
    }
    
    //Constructor with paramenters, but without clientID
    public Client(String firstName, String lastName, Date birthDate, String cellNum, String email, String nationalID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.cellNum = cellNum;
        this.email = email;
        this.nationalID = nationalID;
    }
    
    //This overload allows the creation of the object using LocalDate, as input parameter instead of Date. LocalDate is more reliable and easier to work with than date
    public Client(String firstName, String lastName, LocalDate birthDate, String cellNum, String email, String nationalID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = Date.from(birthDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.cellNum = cellNum;
        this.email = email;
        this.nationalID = nationalID;
    }
    
    
    //Constructor without parameters
    public Client() {
    }
    
    
    //Interaction with Data Access Layer starts here, can potentially create a linking or ad-hoc class for this functionality

    public List<Client> GetClients()
    {
       DataHandler dataHandler = new DataHandler();
       dataHandler.CreateConnection();
       
       List<Client> clients = new ArrayList<Client>();
       ResultSet rs = dataHandler.GetResultSet("SELECT * FROM Client");
        try {
            while (rs.next()) {
                clients.add(new Client(rs.getInt("ClientID"),rs.getString("FirstName"),rs.getString("LastName"),rs.getDate("BirthDate"),rs.getString("CellNum"),rs.getString("Email"),rs.getString("NationalID")));
            }
            dataHandler.CloseConnection();
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return clients;
    }
    
    //Search for client by id
    public Client GetClient(int id){
        //Add code here
        //
        //
        return null;
    }
    
    public void InsertNewClient(Client client){
       DataHandler dataHandler = new DataHandler();
       dataHandler.CreateConnection();                             //Start from FirstName since the database automatically increments the ClientID
       String insertStatement = String.format("INSERT INTO Client (FirstName,LastName,BirthDate,CellNum,Email,NationalID) VALUES('%s','%s','%tF','%s','%s','%s')", client.getFirstName(),client.getLastName(),client.getBirthDate(),client.getCellNum(),client.getEmail(),client.getNationalID());
       dataHandler.Insert(insertStatement);
    }
    
    public void InsertNewClient(String firstName, String lastName, Date birthDate, String cellNum, String email, String nationalID){
       DataHandler dataHandler = new DataHandler();
       dataHandler.CreateConnection();
       String insertStatement = String.format("INSERT INTO Client (FirstName,LastName,BirthDate,CellNum,Email,NationalID) VALUES('%s','%s','%tF','%s','%s','%s')", firstName, lastName, birthDate, cellNum, email, nationalID);
       dataHandler.Insert(insertStatement);
    }
    
    public void UpdateClient(){
        //
    }
    
    
    
    
     
    
}
  
