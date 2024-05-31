package com.asss.pj.entity;

import com.asss.pj.util.Gorivo;
import com.asss.pj.util.Namena;
import com.asss.pj.util.Posada;

import javax.persistence.*;

@Entity
@Table(name = "brod")
public class Brod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID")
    private int id;

    @Column(name = "Namena")
    @Enumerated(EnumType.STRING)
    private Namena namena;

    @Column(name = "Posada")
    @Enumerated(EnumType.STRING)
    private Posada posada;

    @Column(name = "Gorivo")
    @Enumerated(EnumType.STRING)
    private Gorivo gorivo;

    @Column(name = "Nosivost")
    private int nosivost;

    @Column(name = "Brzina")
    private int brzina;

    public Brod() {
    }

    public Brod(int id, Namena namena, Posada posada, Gorivo gorivo, int nosivost, int brzina) {
        this.id = id;
        this.namena = namena;
        this.posada = posada;
        this.gorivo = gorivo;
        this.nosivost = nosivost;
        this.brzina = brzina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Namena getNamena() {
        return namena;
    }

    public void setNamena(Namena namena) {
        this.namena = namena;
    }

    public Posada getPosada() {
        return posada;
    }

    public void setPosada(Posada posada) {
        this.posada = posada;
    }

    public Gorivo getGorivo() {
        return gorivo;
    }

    public void setGorivo(Gorivo gorivo) {
        this.gorivo = gorivo;
    }

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    @Override
    public String toString() {
        return "Brod{" +
                "id=" + id +
                ", namena=" + namena +
                ", posada=" + posada +
                ", gorivo=" + gorivo +
                ", nosivost=" + nosivost +
                ", brzina=" + brzina +
                '}';
    }
}
