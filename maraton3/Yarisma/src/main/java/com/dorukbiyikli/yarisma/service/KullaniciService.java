package com.dorukbiyikli.yarisma.service;

import com.dorukbiyikli.yarisma.entity.Kullanici;
import com.dorukbiyikli.yarisma.repository.KullaniciRepository;
import com.dorukbiyikli.yarisma.utility.MyFactoryService;

public class KullaniciService extends MyFactoryService<Kullanici, KullaniciRepository> {

    public KullaniciService() {
        super(new KullaniciRepository());
    }

    
}