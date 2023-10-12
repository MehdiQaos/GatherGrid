package com.mehdi.gathergrid.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity @Table(name = "images")
@Getter @NoArgsConstructor
public class Image {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "user_id") @Setter
    private User user;

    @ManyToOne @JoinColumn(name = "event_id") @Setter
    private Event event;

    @Column(name = "image_type") @Setter
    private String imageType; // TODO use an enum

    @Column(name = "file_path") @Setter
    private String filePath;

    @Column(name = "upload_date") @Setter
    private Date uploadDate;

    public Image(User user, Event event, String imageType, String filePath,
                 Date uploadDate) {
        this.user = user;
        this.event = event;
        this.imageType = imageType;
        this.filePath = filePath;
        this.uploadDate = uploadDate;
    }
}