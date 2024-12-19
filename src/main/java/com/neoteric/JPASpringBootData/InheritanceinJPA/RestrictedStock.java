package com.neoteric.JPASpringBootData.InheritanceinJPA;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("RestrictedStock")
@Data
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "id")
public class RestrictedStock extends Stock {

    private int vestingPeriod;

    public RestrictedStock(){

    }

    public RestrictedStock(int vestingPeriod) {
        this.vestingPeriod = vestingPeriod;
    }

    public RestrictedStock(int id, String name, double value, int vestingPeriod) {
        super(id, name, value);
        this.vestingPeriod = vestingPeriod;
    }


}
