package org.example.tp_billetterie.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@SuperBuilder
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Evenement {
    @Id
    @GeneratedValue
    private int id;
    private String lieu;
    private Date date;
    private SimpleDateFormat heure;
    private int nombre_places;
}
