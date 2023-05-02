
package com.dorukbiyikli.yarisma.repository;

import com.dorukbiyikli.yarisma.entity.Kullanici;
import com.dorukbiyikli.yarisma.utility.MyFactoryRepository;


public class KullaniciRepository extends MyFactoryRepository<Kullanici, Long> {
    
    public KullaniciRepository(){
        super(new Kullanici());
    }
    
}
