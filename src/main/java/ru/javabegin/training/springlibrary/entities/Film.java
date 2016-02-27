package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
public class Film {
    private int kodFilm;
    private int kodVid;
    private String film;
    private String manufacturer;
    private String specification;

    @Id
    @Column(name = "kod_film")
    public int getKodFilm() {
        return kodFilm;
    }

    public void setKodFilm(int kodFilm) {
        this.kodFilm = kodFilm;
    }

    @Basic
    @Column(name = "kod_vid")
    public int getKodVid() {
        return kodVid;
    }

    public void setKodVid(int kodVid) {
        this.kodVid = kodVid;
    }

    @Basic
    @Column(name = "film")
    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    @Basic
    @Column(name = "manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "Specification")
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film1 = (Film) o;

        if (kodFilm != film1.kodFilm) return false;
        if (kodVid != film1.kodVid) return false;
        if (film != null ? !film.equals(film1.film) : film1.film != null) return false;
        if (manufacturer != null ? !manufacturer.equals(film1.manufacturer) : film1.manufacturer != null) return false;
        if (specification != null ? !specification.equals(film1.specification) : film1.specification != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kodFilm;
        result = 31 * result + kodVid;
        result = 31 * result + (film != null ? film.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (specification != null ? specification.hashCode() : 0);
        return result;
    }
}
