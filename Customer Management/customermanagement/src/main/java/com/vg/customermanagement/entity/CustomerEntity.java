package com.vg.customermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class CustomerEntity  {

    private Long id;
    private String firstname;
    private String surname;
    
    public CustomerEntity() {}
    
    public CustomerEntity(Long id, String firstname, String surname) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_ID_SEQ")
    @SequenceGenerator(name = "CUSTOMER_ID_SEQ", sequenceName = "CUSTOMER_ID_SEQ", allocationSize = 1)
    @Column(name = "ID", unique = true, nullable = false, precision = 38, scale = 0) 
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }



    @Column(name = "FIRST_NAME", length = 100, nullable=false)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    @Column(name = "LAST_NAME", length = 100, nullable=true)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    

    

}

