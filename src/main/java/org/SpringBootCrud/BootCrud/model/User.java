package org.SpringBootCrud.BootCrud.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "f_name", nullable = false)
    private String fname;

    @Column(name = "l_name", nullable = false)
    private String lname;

    @Column(nullable = false, unique = true)
    private String email;
}
