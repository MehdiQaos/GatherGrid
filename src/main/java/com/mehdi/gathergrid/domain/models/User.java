package com.mehdi.gathergrid.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter @Column(name = "username")
    private String userName;

    @Setter @Column(name = "email")
    private String email;

    @Setter @Column(name = "first_name")
    private String firstName;

    @Setter @Column(name = "last_name")
    private String lastName;

    @Setter @Column(name = "password")
    private String password;

    public User(String userName, String email, String firstName, String lastName, String password) {
        this.userName = userName;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
}
