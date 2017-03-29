package models;

import java.util.*;
import javax.persistence.*;

import javax.validation.Constraint;


import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;


@Entity
public class Ticket extends Model {


    @Id
    private Long ticketID;

    // Foreign Key
    private Long eventID;


    @Constraints.Required
    private String ticketType;

    @Constraints.Required
    private int quantity;

    private int qty;


    @Constraints.Required
    private double price;

    @ManyToOne
    private Event events;


    public Ticket() {
    }

    public Ticket(Long ticketID, Long eventID, String ticketType, int quantity, double price) {
        this.ticketID = ticketID;
        this.eventID = eventID;
        this.ticketType = ticketType;
        this.quantity = quantity;
    }


    public Long getTicketID() {
        return ticketID;
    }

    public void setTicketID(Long ticketID) {
        this.ticketID = ticketID;
    }


    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Finder<Long,Ticket> find = new Finder<Long, Ticket>(Ticket.class);

    // Find all Events in the database
    // Filter event name
    public static List<Ticket> findAll() {
        return Ticket.find.all();
    }


}
