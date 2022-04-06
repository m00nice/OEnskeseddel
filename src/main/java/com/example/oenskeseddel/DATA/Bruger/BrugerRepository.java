package com.example.oenskeseddel.DATA.Bruger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrugerRepository  extends JpaRepository<Bruger , Integer> {
            Bruger findByUsernameAndPassword(String username,String password);

}
