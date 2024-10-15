package com.study.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.test.Domain.imageTab;

@Repository
public interface imageTabRepository extends JpaRepository<imageTab, Long>{
	
}
