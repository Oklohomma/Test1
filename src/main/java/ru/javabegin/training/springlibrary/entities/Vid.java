package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
public class Vid {
    private int kodVid;
    private String vid;

    @Id
    @Column(name = "kod_vid")
    public int getKodVid() {
        return kodVid;
    }

    public void setKodVid(int kodVid) {
        this.kodVid = kodVid;
    }

    @Basic
    @Column(name = "vid")
    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vid vid1 = (Vid) o;

        if (kodVid != vid1.kodVid) return false;
        if (vid != null ? !vid.equals(vid1.vid) : vid1.vid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kodVid;
        result = 31 * result + (vid != null ? vid.hashCode() : 0);
        return result;
    }
}
