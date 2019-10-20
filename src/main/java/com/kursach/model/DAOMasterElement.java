package com.kursach.model;

import javax.persistence.*;


@Entity
@Table(name = "masterelements")
public class DAOMasterElement {


    @EmbeddedId
    private MasterElementId primaryKey;



    @Column
    private int amount;



}
