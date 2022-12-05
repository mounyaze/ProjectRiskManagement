package com.example.demo.repository;


import java.util.List;

import com.example.demo.model.Risk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;




@Repository
public interface RiskRepository extends JpaRepository<Risk, Long>{
    //	List<Risk> getByUserId(long id);
    Risk findRiskByCode(String code);

}


