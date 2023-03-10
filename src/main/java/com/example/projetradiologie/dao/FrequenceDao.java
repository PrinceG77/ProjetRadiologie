package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.Frequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequenceDao extends JpaRepository<Frequence, Long> {
    Frequence findByCode(String code);

    int deleteByCode(String code);

}
