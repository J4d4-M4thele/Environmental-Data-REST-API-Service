package com.enviro.assesment.grad001.jadamathele.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Waste_Collection")
public class WasteCollection {
    @Id
    private int year;

    @Column(name = "recyclables")
    private int recyclables;

    @Column(name = "organics")
    private int orgaincs;

    @Column(name = "builders_rubble")
    private int buildersRubble;

};
