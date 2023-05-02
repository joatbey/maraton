
package com.dorukbiyikli.yarisma.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Yarisma")
public class Yarisma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "adi")
    private String adi;

    @ManyToOne
    @JoinColumn(name = "olusturan_id")
    private Kullanici olusturan;

    @Column(name = "baslangic_tarihi")
    private Date baslangicTarihi;

    @Column(name = "bitis_tarihi")
    private Date bitisTarihi;

    @Column(name = "odul")
    private String odul;

    @Column(name = "katilimci_sayisi")
    private int katilimciSayisi;

    @OneToMany(mappedBy = "yarisma", cascade = CascadeType.ALL)
    private List<YarismaKatilim> yarismaKatilimList;

    // getters, setters ve constructorlar

    public Yarisma(int id, String adi, Kullanici olusturan, Date baslangicTarihi, Date bitisTarihi, String odul, int katilimciSayisi, List<YarismaKatilim> yarismaKatilimList) {
        this.id = id;
        this.adi = adi;
        this.olusturan = olusturan;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.odul = odul;
        this.katilimciSayisi = katilimciSayisi;
        this.yarismaKatilimList = yarismaKatilimList;
    }

    public Yarisma(String adi, Kullanici olusturan, Date baslangicTarihi, Date bitisTarihi, String odul, int katilimciSayisi, List<YarismaKatilim> yarismaKatilimList) {
        this.adi = adi;
        this.olusturan = olusturan;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.odul = odul;
        this.katilimciSayisi = katilimciSayisi;
        this.yarismaKatilimList = yarismaKatilimList;
    }

    public Yarisma() {
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

    public Kullanici getOlusturan() {
        return olusturan;
    }

    public void setOlusturan(Kullanici olusturan) {
        this.olusturan = olusturan;
    }

    public Date getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(Date baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(Date bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public String getOdul() {
        return odul;
    }

    public void setOdul(String odul) {
        this.odul = odul;
    }

    public int getKatilimciSayisi() {
        return katilimciSayisi;
    }

    public void setKatilimciSayisi(int katilimciSayisi) {
        this.katilimciSayisi = katilimciSayisi;
    }

    public List<YarismaKatilim> getYarismaKatilimList() {
        return yarismaKatilimList;
    }

    public void setYarismaKatilimList(List<YarismaKatilim> yarismaKatilimList) {
        this.yarismaKatilimList = yarismaKatilimList;
    }

    @Override
    public String toString() {
        return "Yarisma{" + "id=" + id + ", adi=" + adi + ", olusturan=" + olusturan + ", baslangicTarihi=" + baslangicTarihi + ", bitisTarihi=" + bitisTarihi + ", odul=" + odul + ", katilimciSayisi=" + katilimciSayisi + ", yarismaKatilimList=" + yarismaKatilimList + '}';
    }
    
}

