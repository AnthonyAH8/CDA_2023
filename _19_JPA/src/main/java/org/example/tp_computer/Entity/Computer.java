package org.example.tp_computer.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;

//    @Embedded
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_identifiant")
    private Identifiant identifiant;

    @ManyToOne
    @JoinColumn(name = "operating_system")
    private OperatingSystem operatingSystem;

    @ManyToMany(mappedBy = "computer")
    private List <Computer> computers;

}
