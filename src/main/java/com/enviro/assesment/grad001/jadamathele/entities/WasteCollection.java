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
    private long year;

    @Column(name = "recyclables")
    private long recyclables;

    @Column(name = "organics")
    private long orgaincs;

    @Column(name = "builders_rubble")
    private long buildersRubble;

};
