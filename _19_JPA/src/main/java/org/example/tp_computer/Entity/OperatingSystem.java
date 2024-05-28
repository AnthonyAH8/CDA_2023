package org.example.tp_computer.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperatingSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_os")
    private int id;

    private String name;

    @OneToMany(mappedBy = "operating_system_id", cascade = CascadeType.ALL)
    private List<Computer> computers = new ArrayList<>();

}
