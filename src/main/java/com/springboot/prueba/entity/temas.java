package com.springboot.prueba.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class temas {

    @Id
    private int id;
    private String tema;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {

        return "Tema{" + "id=" + id + ",tema'" + tema + '}';
    }

}
