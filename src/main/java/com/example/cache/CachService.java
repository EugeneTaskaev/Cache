package com.example.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CachService {
    public final Dao dao;

    public CachService(Dao dao){
        this.dao = dao;
    }
    @Cacheable("data")
    public String getData(){
        return dao.getData();
    }
}
