package com.mehdi.gathergrid.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity @Table(name = "events")
@Getter @NoArgsConstructor
public class Event {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "event_name") @Setter
    private String eventName;

    @Column(name = "description") @Setter
    private String description;

    @Column(name = "location") @Setter
    private String location;

    @Column(name = "event_date") @Setter
    private Date eventDate;

    @Column(name = "creation_date") @Setter
    private Date creationDate;

    @ManyToOne @Setter
    private User organiser;

    @ManyToOne @Setter
    private Category category;

    public Event(String eventName, String description, String location, Date eventDate,
                 Date creationDate,User organiser, Category category) {
        this.eventName = eventName;
        this.description = description;
        this.location = location;
        this.eventDate = eventDate;
        this.creationDate = creationDate;
        this.organiser = organiser;
        this.category = category;
    }
}
