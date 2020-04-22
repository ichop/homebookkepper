package com.homebookkeeper.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "USER")
public class User extends BaseEntity {

    @NotNull
    private String name;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

//    @OneToOne
//    private Balance balance;

//    @OneToMany
//    private List<Category> categories;
//
//    @OneToMany
//    private List<Event> events;
}
