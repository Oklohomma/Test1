package ru.javabegin.training.springlibrary.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
@IdClass(ZakazPK.class)
public class Zakaz {
    private int kodZ;
    private int kodCustU;
    private int kodCustF;
    private int kodFilm;
    private int kolVo;
    private Date dataZ;

    @Id
    @Column(name = "kod_z")
    public int getKodZ() {
        return kodZ;
    }

    public void setKodZ(int kodZ) {
        this.kodZ = kodZ;
    }

    @Id
    @Column(name = "kod_cust_u")
    public int getKodCustU() {
        return kodCustU;
    }

    public void setKodCustU(int kodCustU) {
        this.kodCustU = kodCustU;
    }

    @Id
    @Column(name = "kod_cust_f")
    public int getKodCustF() {
        return kodCustF;
    }

    public void setKodCustF(int kodCustF) {
        this.kodCustF = kodCustF;
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
    @Column(name = "data_z")
    public Date getDataZ() {
        return dataZ;
    }

    public void setDataZ(Date dataZ) {
        this.dataZ = dataZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zakaz zakaz = (Zakaz) o;

        if (kodZ != zakaz.kodZ) return false;
        if (kodCustU != zakaz.kodCustU) return false;
        if (kodCustF != zakaz.kodCustF) return false;
        if (kodFilm != zakaz.kodFilm) return false;
        if (kolVo != zakaz.kolVo) return false;
        if (dataZ != null ? !dataZ.equals(zakaz.dataZ) : zakaz.dataZ != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kodZ;
        result = 31 * result + kodCustU;
        result = 31 * result + kodCustF;
        result = 31 * result + kodFilm;
        result = 31 * result + kolVo;
        result = 31 * result + (dataZ != null ? dataZ.hashCode() : 0);
        return result;
    }
}
