package com.kursach.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "elements")
public class DAOElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "primaryKey.daoElement")
    private Set<DAOMasterElement> daoMasterElements;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<DAOMasterElement> getDaoMasterElements() {
        return daoMasterElements;
    }

    public void setDaoMasterElements(Set<DAOMasterElement> daoMasterElements) {
        this.daoMasterElements = daoMasterElements;
    }
}
