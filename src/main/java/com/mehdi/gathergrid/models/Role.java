package com.mehdi.gathergrid.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "roles")
@NoArgsConstructor @Getter
public class Role {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter @Column(name = "role_name", nullable = false, length = 50)
    private String roleName; // TODO use an enum

    public Role(String roleName) {
        this.roleName = roleName;
    }
}