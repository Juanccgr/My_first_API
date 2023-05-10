package com.JuanMicroservicios.Microservicios.Model;
import jakarta.persistence.*;
@Entity
@Table
public class veterinary_client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String last_name;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private Integer verinary_id;
    @Column
    private String document;
    @Column
    private String global_id;

    public veterinary_client() {
    }

    public veterinary_client(Integer id, String name, String last_name, String email, String phone, Integer verinary_id, String document, String global_id) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.verinary_id = verinary_id;
        this.document = document;
        this.global_id = global_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getVerinary_id() {
        return verinary_id;
    }

    public void setVerinary_id(Integer verinary_id) {
        this.verinary_id = verinary_id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getGlobal_id() {
        return global_id;
    }

    public void setGlobal_id(String global_id) {
        this.global_id = global_id;
    }
}
