package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by faceta on 05.12.2015.
 */
public class KassaPK implements Serializable {
    private int nomKassOrd;
    private int countNumber;
    private int kodP;

    @Column(name = "nom_kass_ord")
    @Id
    public int getNomKassOrd() {
        return nomKassOrd;
    }

    public void setNomKassOrd(int nomKassOrd) {
        this.nomKassOrd = nomKassOrd;
    }

    @Column(name = "countNumber")
    @Id
    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    @Column(name = "kod_p")
    @Id
    public int getKodP() {
        return kodP;
    }

    public void setKodP(int kodP) {
        this.kodP = kodP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KassaPK kassaPK = (KassaPK) o;

        if (nomKassOrd != kassaPK.nomKassOrd) return false;
        if (countNumber != kassaPK.countNumber) return false;
        if (kodP != kassaPK.kodP) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomKassOrd;
        result = 31 * result + countNumber;
        result = 31 * result + kodP;
        return result;
    }
}
