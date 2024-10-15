package com.study.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.test.Domain.ImageTabId;

@Repository
public interface ImageTabIdRepository extends JpaRepository<ImageTabId, Long> {
	
	
}
