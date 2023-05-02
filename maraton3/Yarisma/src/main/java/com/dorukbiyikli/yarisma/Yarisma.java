package com.dorukbiyikli.yarisma;

import com.dorukbiyikli.yarisma.entity.Kullanici;
import com.dorukbiyikli.yarisma.entity.YarismaKatilim;
import com.dorukbiyikli.yarisma.utility.HibernateUtility;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

public class Yarisma {

    public static void main(String[] args) {

    }

    public List<Kullanici> getKullaniciListByYarismaId(int id) {
        Session session = HibernateUtility.getFACTORY().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Kullanici> query = builder.createQuery(Kullanici.class);
        Root<YarismaKatilim> root = query.from(YarismaKatilim.class);
        Join<YarismaKatilim, Kullanici> kullaniciJoin = root.join("kullanici");
        Join<YarismaKatilim, Yarisma> yarismaJoin = root.join("yarisma");

        Yarisma yarisma = session.get(Yarisma.class, id);

        query.select(kullaniciJoin)
                .distinct(true)
                .where(builder.equal(yarismaJoin.get("id"), yarisma.getId()));

        return session.createQuery(query).getResultList();
    }

    public List<Yarisma> getKullaniciYarismalari(String kullaniciAdi) {
        Session session = HibernateUtility.getFACTORY().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Yarisma> query = builder.createQuery(Yarisma.class);
        Root<Kullanici> kullaniciRoot = query.from(Kullanici.class);
        Join<Kullanici, Yarisma> yarismaJoin = kullaniciRoot.join("yarismalar", JoinType.INNER);
        query.select(yarismaJoin).where(builder.equal(kullaniciRoot.get("ad"), kullaniciAdi));
        List<Yarisma> yarismalar = session.createQuery(query).getResultList();
        return yarismalar;
    }

    public List<Yarisma> getKatilinanYarismalar(Kullanici kullanici) {
        Session session = HibernateUtility.getFACTORY().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Yarisma> query = builder.createQuery(Yarisma.class);
        Root<YarismaKatilim> root = query.from(YarismaKatilim.class);
        Join<YarismaKatilim, Yarisma> yarismaJoin = root.join("yarisma");
        query.select(yarismaJoin)
                .distinct(true)
                .where(builder.equal(root.get("kullanici"), kullanici));
        List<Yarisma> yarismalar = session.createQuery(query).getResultList();
        return yarismalar;
    }

}
