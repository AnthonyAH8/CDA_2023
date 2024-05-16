package org.example.zoo_jdbc.Entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
public class Alimentation {
    private int id;
    private Date date;
    private LocalDateTime heure;
    private String details;
    private Animaux animaux;
}
