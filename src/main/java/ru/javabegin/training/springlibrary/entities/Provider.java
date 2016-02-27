package ru.javabegin.training.springlibrary.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by faceta on 05.12.2015.
 */
@Entity
public class Provider {
    private int kodProvider;
    private String provider;
    private String inn;
    private String address;
    private String bank;
    private String account;

    @Id
    @Column(name = "kod_provider")
    public int getKodProvider() {
        return kodProvider;
    }

    public void setKodProvider(int kodProvider) {
        this.kodProvider = kodProvider;
    }

    @Basic
    @Column(name = "provider")
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Basic
    @Column(name = "INN")
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Bank")
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Basic
    @Column(name = "Account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Provider provider1 = (Provider) o;

        if (kodProvider != provider1.kodProvider) return false;
        if (provider != null ? !provider.equals(provider1.provider) : provider1.provider != null) return false;
        if (inn != null ? !inn.equals(provider1.inn) : provider1.inn != null) return false;
        if (address != null ? !address.equals(provider1.address) : provider1.address != null) return false;
        if (bank != null ? !bank.equals(provider1.bank) : provider1.bank != null) return false;
        if (account != null ? !account.equals(provider1.account) : provider1.account != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kodProvider;
        result = 31 * result + (provider != null ? provider.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        return result;
    }


}
