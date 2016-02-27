package ru.javabegin.training.springlibrary.entities;

import javax.persistence.*;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
@Table(name = "customer_fl", schema = "", catalog = "komp")
public class CustomerFl {
    private int kodCustF;
    private String customer;
    private String phone;

    @Id
    @Column(name = "kod_cust_f")
    public int getKodCustF() {
        return kodCustF;
    }

    public void setKodCustF(int kodCustF) {
        this.kodCustF = kodCustF;
    }

    @Basic
    @Column(name = "customer")
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerFl that = (CustomerFl) o;

        if (kodCustF != that.kodCustF) return false;
        if (customer != null ? !customer.equals(that.customer) : that.customer != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kodCustF;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
