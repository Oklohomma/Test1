package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
public class Postavka {
    private int kodP;
    private int kodProvider;
    private int kodFilm;
    private int kolVo;
    private int summa;
    private Date dataOpl;
    private Date dataP;

    @Id
    @Column(name = "kod_p")
    public int getKodP() {
        return kodP;
    }

    public void setKodP(int kodP) {
        this.kodP = kodP;
    }

    @Basic
    @Column(name = "kod_provider")
    public int getKodProvider() {
        return kodProvider;
    }

    public void setKodProvider(int kodProvider) {
        this.kodProvider = kodProvider;
    }

    @Basic
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
    @Column(name = "summa")
    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    @Basic
    @Column(name = "data_opl")
    public Date getDataOpl() {
        return dataOpl;
    }

    public void setDataOpl(Date dataOpl) {
        this.dataOpl = dataOpl;
    }

    @Basic
    @Column(name = "data_p")
    public Date getDataP() {
        return dataP;
    }

    public void setDataP(Date dataP) {
        this.dataP = dataP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Postavka postavka = (Postavka) o;

        if (kodP != postavka.kodP) return false;
        if (kodProvider != postavka.kodProvider) return false;
        if (kodFilm != postavka.kodFilm) return false;
        if (kolVo != postavka.kolVo) return false;
        if (summa != postavka.summa) return false;
        if (dataOpl != null ? !dataOpl.equals(postavka.dataOpl) : postavka.dataOpl != null) return false;
        if (dataP != null ? !dataP.equals(postavka.dataP) : postavka.dataP != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kodP;
        result = 31 * result + kodProvider;
        result = 31 * result + kodFilm;
        result = 31 * result + kolVo;
        result = 31 * result + summa;
        result = 31 * result + (dataOpl != null ? dataOpl.hashCode() : 0);
        result = 31 * result + (dataP != null ? dataP.hashCode() : 0);
        return result;
    }
}
