package com.mehdi.gathergrid.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity @Table(name = "registrations")
@Getter @NoArgsConstructor
public class Registration {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "user_id") @Setter
    private User user;

    @ManyToOne @JoinColumn(name = "event_id") @Setter
    private Event event;

    @ManyToOne @JoinColumn(name = "ticket_id") @Setter
    private Ticket ticket;

    @Column(name = "registration_date") @Setter
    private Date registrationDate;

    public Registration(User user, Event event, Ticket ticket, Date registrationDate) {
        this.user = user;
        this.event = event;
        this.ticket = ticket;
        this.registrationDate = registrationDate;
    }
}
