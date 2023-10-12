package com.mehdi.gathergrid.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity @Table(name = "reviews")
@Getter @NoArgsConstructor
public class Review {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "user_id") @Setter
    private User user;

    @ManyToOne @JoinColumn(name = "event_id") @Setter
    private Event event;

    @Column(name = "rating") @Setter
    private int rating;

    @Column(name = "review_text") @Setter
    private String reviewText;

    @Column(name = "review_date") @Setter
    private Date reviewDate;

    public Review(User user, Event event, int rating, String reviewText, Date reviewDate) {
        this.user = user;
        this.event = event;
        this.rating = rating;
        this.reviewText = reviewText;
        this.reviewDate = reviewDate;
    }
}
