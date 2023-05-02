
package com.dorukbiyikli.yarisma.entity;

import com.dorukbiyikli.yarisma.Yarisma;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table(name = "YarismaKatilim")
public class YarismaKatilim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "yarisma_id")
    private Yarisma yarisma;

    @ManyToOne
    @JoinColumn(name = "katilimci_id")
    private Kullanici katilimci;

    @Column(name = "katilim_tarihi")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date katilimTarihi;

    // getters, setters ve constructorlar

    public YarismaKatilim() {
    }

    public YarismaKatilim(int id, Yarisma yarisma, Kullanici katilimci, Date katilimTarihi) {
        this.id = id;
        this.yarisma = yarisma;
        this.katilimci = katilimci;
        this.katilimTarihi = katilimTarihi;
    }

    public YarismaKatilim(Yarisma yarisma, Kullanici katilimci, Date katilimTarihi) {
        this.yarisma = yarisma;
        this.katilimci = katilimci;
        this.katilimTarihi = katilimTarihi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Yarisma getYarisma() {
        return yarisma;
    }

    public void setYarisma(Yarisma yarisma) {
        this.yarisma = yarisma;
    }

    public Kullanici getKatilimci() {
        return katilimci;
    }

    public void setKatilimci(Kullanici katilimci) {
        this.katilimci = katilimci;
    }

    public Date getKatilimTarihi() {
        return katilimTarihi;
    }

    public void setKatilimTarihi(Date katilimTarihi) {
        this.katilimTarihi = katilimTarihi;
    }

    @Override
    public String toString() {
        return "YarismaKatilim{" + "id=" + id + ", yarisma=" + yarisma + ", katilimci=" + katilimci + ", katilimTarihi=" + katilimTarihi + '}';
    }
    
}
