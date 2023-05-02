package com.dorukbiyikli.yarisma.service;

import com.dorukbiyikli.yarisma.entity.Yarisma;
import com.dorukbiyikli.yarisma.repository.YarismaRepository;
import com.dorukbiyikli.yarisma.utility.MyFactoryService;

public class YarismaService extends MyFactoryService<Yarisma, YarismaRepository> {

    public YarismaService() {
        super(new YarismaRepository());
    }

    
}