package com.neoteric.JPASpringBootData.InheritanceinJPA;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DatabaseNametype", discriminatorType = DiscriminatorType.STRING)

public abstract class Stock  {



    @Id
    private int id;

    private String name;
    private double value;

    public Stock(){

    }

    public Stock(int id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }


}
