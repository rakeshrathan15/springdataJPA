package com.neoteric.JPASpringBootData.InheritanceinJPA;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("OptionStock")
@Data
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "id")
public class OptionStock  extends Stock{

    private double strikePrice;
    public OptionStock(){

    }

    public OptionStock(double strikePrice) {
        this.strikePrice = strikePrice;
    }

    public OptionStock(int id, String name, double value, double strikePrice) {
        super(id, name, value);
        this.strikePrice = strikePrice;
    }
}
