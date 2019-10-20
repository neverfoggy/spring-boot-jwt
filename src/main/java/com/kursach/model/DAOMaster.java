package com.kursach.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "reqmaster")
public class DAOMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String build;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
    private DAODept daoDept;

    @OneToMany(mappedBy = "primaryKey.daoMaster")
    private Set<DAOMasterElement> daoMasterElements;

}
