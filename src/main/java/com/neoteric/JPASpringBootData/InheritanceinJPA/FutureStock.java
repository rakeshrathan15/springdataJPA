package com.neoteric.JPASpringBootData.InheritanceinJPA;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@DiscriminatorValue("OptionStock")
@Data
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "id")
public class FutureStock extends Stock{


    public Date maturityDate;

    public FutureStock(){

    }

    public FutureStock(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public FutureStock(int id, String name, double value, Date maturityDate) {
        super(id, name, value);
        this.maturityDate = maturityDate;
    }


}
