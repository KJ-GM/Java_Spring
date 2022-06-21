package com.example.demo.entities;

import lombok.*;

import javax.persistence.*;

@Entity // Represents a table in DB
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "CITIES")

public class City extends AppEntity<Long> {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "citiesIdSeq", sequenceName = "CITIES_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "citiesIdSeq")
    private Long id;

    @Column(name = "NAME", nullable = false, updatable = true, insertable = true)
    private String name;

    @Column(name = "PRESIDENT", nullable = false, updatable = true, insertable = true)
    private String president;

    @Column(name = "POPULATION", nullable = false, updatable = true, insertable = true)
    private int population;
}
