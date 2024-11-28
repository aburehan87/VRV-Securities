package com.skillcapital;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


//          User: implements all the entities a USER should have, GETTERS and SETTERS are generated using @Getter @Setter using
//          lombok dependency

@Setter
@Getter
@Entity
@Table(name = "users")
@Data
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

}