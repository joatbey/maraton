
package com.dorukbiyikli.yarisma.repository;

import com.dorukbiyikli.yarisma.entity.YarismaKatilim;
import com.dorukbiyikli.yarisma.utility.MyFactoryRepository;


public class YarismaKatilimRepository extends MyFactoryRepository<YarismaKatilim, Long> {
    
    public YarismaKatilimRepository(){
        super(new YarismaKatilim());
    }
    
}
