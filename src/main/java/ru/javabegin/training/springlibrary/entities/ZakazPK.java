package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by faceta on 05.12.2015.
 */
public class ZakazPK implements Serializable {
    private int kodZ;
    private int kodCustU;
    private int kodCustF;

    @Column(name = "kod_z")
    @Id
    public int getKodZ() {
        return kodZ;
    }

    public void setKodZ(int kodZ) {
        this.kodZ = kodZ;
    }

    @Column(name = "kod_cust_u")
    @Id
    public int getKodCustU() {
        return kodCustU;
    }

    public void setKodCustU(int kodCustU) {
        this.kodCustU = kodCustU;
    }

    @Column(name = "kod_cust_f")
    @Id
    public int getKodCustF() {
        return kodCustF;
    }

    public void setKodCustF(int kodCustF) {
        this.kodCustF = kodCustF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZakazPK zakazPK = (ZakazPK) o;

        if (kodZ != zakazPK.kodZ) return false;
        if (kodCustU != zakazPK.kodCustU) return false;
        if (kodCustF != zakazPK.kodCustF) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kodZ;
        result = 31 * result + kodCustU;
        result = 31 * result + kodCustF;
        return result;
    }
}
