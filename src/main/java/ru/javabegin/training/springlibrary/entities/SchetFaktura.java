package ru.javabegin.training.springlibrary.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
@Table(name = "schet_faktura", schema = "", catalog = "komp")
public class SchetFaktura {
    private int countNumber;
    private int kodZ;
    private Date dateStart;
    private int value;
    private String worker;

    @Id
    @Column(name = "CountNumber")
    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    @Basic
    @Column(name = "kod_z")
    public int getKodZ() {
        return kodZ;
    }

    public void setKodZ(int kodZ) {
        this.kodZ = kodZ;
    }

    @Basic
    @Column(name = "DateStart")
    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Basic
    @Column(name = "value")
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Basic
    @Column(name = "worker")
    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchetFaktura that = (SchetFaktura) o;

        if (countNumber != that.countNumber) return false;
        if (kodZ != that.kodZ) return false;
        if (value != that.value) return false;
        if (dateStart != null ? !dateStart.equals(that.dateStart) : that.dateStart != null) return false;
        if (worker != null ? !worker.equals(that.worker) : that.worker != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countNumber;
        result = 31 * result + kodZ;
        result = 31 * result + (dateStart != null ? dateStart.hashCode() : 0);
        result = 31 * result + value;
        result = 31 * result + (worker != null ? worker.hashCode() : 0);
        return result;
    }
}
