package ru.javabegin.training.springlibrary.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
@IdClass(KassaPK.class)
public class Kassa {
    private int nomKassOrd;
    private int countNumber;
    private int kodP;
    private int summa;
    private Date dataOplati;

    @Id
    @Column(name = "nom_kass_ord")
    public int getNomKassOrd() {
        return nomKassOrd;
    }

    public void setNomKassOrd(int nomKassOrd) {
        this.nomKassOrd = nomKassOrd;
    }

    @Id
    @Column(name = "countNumber")
    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    @Id
    @Column(name = "kod_p")
    public int getKodP() {
        return kodP;
    }

    public void setKodP(int kodP) {
        this.kodP = kodP;
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
    @Column(name = "data_oplati")
    public Date getDataOplati() {
        return dataOplati;
    }

    public void setDataOplati(Date dataOplati) {
        this.dataOplati = dataOplati;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kassa kassa = (Kassa) o;

        if (nomKassOrd != kassa.nomKassOrd) return false;
        if (countNumber != kassa.countNumber) return false;
        if (kodP != kassa.kodP) return false;
        if (summa != kassa.summa) return false;
        if (dataOplati != null ? !dataOplati.equals(kassa.dataOplati) : kassa.dataOplati != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomKassOrd;
        result = 31 * result + countNumber;
        result = 31 * result + kodP;
        result = 31 * result + summa;
        result = 31 * result + (dataOplati != null ? dataOplati.hashCode() : 0);
        return result;
    }
}
