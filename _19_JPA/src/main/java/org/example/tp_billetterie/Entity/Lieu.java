package org.example.tp_billetterie.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@SuperBuilder
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Lieu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private long capacite;

}
