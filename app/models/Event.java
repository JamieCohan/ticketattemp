package models;


import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;


@Entity
public class Event extends Model {

    @Id
    private Long eventID;

    @Constraints.Required
    private String eventName;
    @Constraints.Required
    private String time;
    @Constraints.Required
    private String location;
    @Constraints.Required
    private String date;
    @Constraints.Required
    private String title; // Artist?

    @ManyToOne
    public List<Ticket> eventTicket;


    public Event() {}

    public Event(Long eventID, String eventName, String time, String location, String date, String title) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.time = time;
        this.location = location;
        this.date = date;
        this.title = title;
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Ticket> getEventTicket() {
        return eventTicket;
    }

    public void setEventTicket(List<Ticket> eventTicket) {
        this.eventTicket = eventTicket;
    }

    // Generic query helper for entity Computer with id long
    public static Finder<Long,Event> find = new Finder<Long, Event>(Event.class);

    // Find all Events in the database
    // Filter event name
    public static List<Event> findAll() {
        return Event.find.where().orderBy("name asc").findList();
    }


    }

