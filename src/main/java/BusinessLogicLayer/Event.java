/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogicLayer;
import java.util.*;
/**
 *
 * @author Christopher
 */
public class Event 
{
    int event_ID;
    int client_ID;
    double budget;
    String type;
    String theme;
    String comments;
    Date date;
    String address;
    String region;
    String city;
    int guest_Num;
    int booking_Num;
    double tcost;
    double lcost;
    boolean cancelled_Status;
    
    public Event(int event_ID, int client_ID, double budget, String type, String theme, String comments, Date date, String address, String region, String city, int guest_Num, int booking_Num, double tcost, double lcost, boolean cancelled_Status)
    {
        this.event_ID = event_ID;
        this.client_ID = client_ID;
        this.budget = budget;
        this.type = type;
        this.theme = theme;
        this.comments = comments;
        this.date = date;
        this.address = address;
        this.region = region;
        this.city = city;
        this.guest_Num = guest_Num;
        this.booking_Num = booking_Num;
        this.tcost = tcost;
        this.lcost = lcost;
        this.cancelled_Status = cancelled_Status;
    }
}
