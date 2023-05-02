
package com.dorukbiyikli.yarisma.repository;

import com.dorukbiyikli.yarisma.entity.Yarisma;
import com.dorukbiyikli.yarisma.utility.MyFactoryRepository;


public class YarismaRepository extends MyFactoryRepository<Yarisma, Long> {
    
    public YarismaRepository(){
        super(new Yarisma());
    }
    
}
