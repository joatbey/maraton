
package com.dorukbiyikli.yarisma.entity;

import com.dorukbiyikli.yarisma.Yarisma;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Kullanici")
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "adi")
    private String adi;

    @Column(name = "soyadi")
    private String soyadi;

    @Column(name = "email")
    private String email;

    @Column(name = "sifre")
    private String sifre;

    @OneToMany(mappedBy = "olusturan", cascade = CascadeType.ALL)
    private List<Yarisma> yarismaList;

    @OneToMany(mappedBy = "katilimci", cascade = CascadeType.ALL)
    private List<YarismaKatilim> yarismaKatilimList;

    // getters, setters ve constructorlar

    public Kullanici() {
    }

    public Kullanici(int id, String adi, String soyadi, String email, String sifre, List<Yarisma> yarismaList, List<YarismaKatilim> yarismaKatilimList) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.sifre = sifre;
        this.yarismaList = yarismaList;
        this.yarismaKatilimList = yarismaKatilimList;
    }

    public Kullanici(String adi, String soyadi, String email, String sifre, List<Yarisma> yarismaList, List<YarismaKatilim> yarismaKatilimList) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.sifre = sifre;
        this.yarismaList = yarismaList;
        this.yarismaKatilimList = yarismaKatilimList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public List<Yarisma> getYarismaList() {
        return yarismaList;
    }

    public void setYarismaList(List<Yarisma> yarismaList) {
        this.yarismaList = yarismaList;
    }

    public List<YarismaKatilim> getYarismaKatilimList() {
        return yarismaKatilimList;
    }

    public void setYarismaKatilimList(List<YarismaKatilim> yarismaKatilimList) {
        this.yarismaKatilimList = yarismaKatilimList;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + ", email=" + email + ", sifre=" + sifre + ", yarismaList=" + yarismaList + ", yarismaKatilimList=" + yarismaKatilimList + '}';
    }
    
}
