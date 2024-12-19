package com.neoteric.JPASpringBootData.InheritanceinJPA;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity



@Table(name = "option_stock",schema = "springdatajpa")


public class OptionStock  extends Stock{

    private double strikePrice;
    public OptionStock(){

    }





    public double getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(double strikePrice) {
        this.strikePrice = strikePrice;
    }
}
