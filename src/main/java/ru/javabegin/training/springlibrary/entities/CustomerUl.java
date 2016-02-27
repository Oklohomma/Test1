package ru.javabegin.training.springlibrary.entities;

import javax.persistence.*;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
@Table(name = "customer_ul", schema = "", catalog = "komp")
public class CustomerUl {
    private int kodCustU;
    private String customer;
    private String inNcustomer;
    private String addressCust;
    private String chief;
    private String bankCustomer;
    private String phone;
    private String accountcust;

    @Id
    @Column(name = "kod_cust_u")
    public int getKodCustU() {
        return kodCustU;
    }

    public void setKodCustU(int kodCustU) {
        this.kodCustU = kodCustU;
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
    @Column(name = "INNcustomer")
    public String getInNcustomer() {
        return inNcustomer;
    }

    public void setInNcustomer(String inNcustomer) {
        this.inNcustomer = inNcustomer;
    }

    @Basic
    @Column(name = "AddressCust")
    public String getAddressCust() {
        return addressCust;
    }

    public void setAddressCust(String addressCust) {
        this.addressCust = addressCust;
    }

    @Basic
    @Column(name = "chief")
    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    @Basic
    @Column(name = "BankCustomer")
    public String getBankCustomer() {
        return bankCustomer;
    }

    public void setBankCustomer(String bankCustomer) {
        this.bankCustomer = bankCustomer;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "accountcust")
    public String getAccountcust() {
        return accountcust;
    }

    public void setAccountcust(String accountcust) {
        this.accountcust = accountcust;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerUl that = (CustomerUl) o;

        if (kodCustU != that.kodCustU) return false;
        if (customer != null ? !customer.equals(that.customer) : that.customer != null) return false;
        if (inNcustomer != null ? !inNcustomer.equals(that.inNcustomer) : that.inNcustomer != null) return false;
        if (addressCust != null ? !addressCust.equals(that.addressCust) : that.addressCust != null) return false;
        if (chief != null ? !chief.equals(that.chief) : that.chief != null) return false;
        if (bankCustomer != null ? !bankCustomer.equals(that.bankCustomer) : that.bankCustomer != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (accountcust != null ? !accountcust.equals(that.accountcust) : that.accountcust != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kodCustU;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (inNcustomer != null ? inNcustomer.hashCode() : 0);
        result = 31 * result + (addressCust != null ? addressCust.hashCode() : 0);
        result = 31 * result + (chief != null ? chief.hashCode() : 0);
        result = 31 * result + (bankCustomer != null ? bankCustomer.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (accountcust != null ? accountcust.hashCode() : 0);
        return result;
    }
}
