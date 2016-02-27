package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
public class Sklad {
    private int kodFilm;
    private int kolVo;
    private int stoimost;

    @Id
    @Column(name = "kod_film")
    public int getKodFilm() {
        return kodFilm;
    }

    public void setKodFilm(int kodFilm) {
        this.kodFilm = kodFilm;
    }

    @Basic
    @Column(name = "kol_vo")
    public int getKolVo() {
        return kolVo;
    }

    public void setKolVo(int kolVo) {
        this.kolVo = kolVo;
    }

    @Basic
    @Column(name = "stoimost")
    public int getStoimost() {
        return stoimost;
    }

    public void setStoimost(int stoimost) {
        this.stoimost = stoimost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sklad sklad = (Sklad) o;

        if (kodFilm != sklad.kodFilm) return false;
        if (kolVo != sklad.kolVo) return false;
        if (stoimost != sklad.stoimost) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kodFilm;
        result = 31 * result + kolVo;
        result = 31 * result + stoimost;
        return result;
    }
}
