package com.example.oenskeseddel.DATA.Bruger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrugerService {

    @Autowired
    private BrugerRepository repo;

    public Bruger login(String Username, String Password){
        Bruger bruger = repo.findByUsernameAndPassword(Username,Password);
        return bruger;
    }


}
