package com.neoteric.JPASpringBootData.InheritanceinJPA;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "restricted_stock",schema = "springdatajpa")
public class RestrictedStock extends Stock {

    private int vestingPeriod;

    public RestrictedStock(){

    }





    public int getVestingPeriod() {
        return vestingPeriod;
    }

    public void setVestingPeriod(int vestingPeriod) {
        this.vestingPeriod = vestingPeriod;
    }
}
