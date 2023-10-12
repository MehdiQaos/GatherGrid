package com.mehdi.gathergrid.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity @Table(name = "tickets")
@Getter @NoArgsConstructor
public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "event_id") @Setter
    private Event event;

    @Column(name = "ticket_type") @Setter
    private String ticketType;

    @Column(name = "price") @Setter
    private float price;

    @Column(name = "quantity_available") @Setter
    private int quantityAvailable;

    @Column(name = "sale_start_date") @Setter
    private Date saleStartDate;

    @Column(name = "sale_end_date") @Setter
    private Date saleEndDate;

    @OneToMany(mappedBy = "ticket") @Setter
    private List<Registration> registrations;

    public Ticket(Event event, String ticketType, float price, int quantityAvailable,
                  Date saleStartDate, Date saleEndDate, List<Registration> registrations) {
        this.event = event;
        this.ticketType = ticketType;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.saleStartDate = saleStartDate;
        this.saleEndDate = saleEndDate;
        this.registrations = registrations;
    }
}
