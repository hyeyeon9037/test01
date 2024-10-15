package com.study.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.test.Domain.seriestab;

@Repository
public interface seriestabRepository extends JpaRepository<seriestab, Long>{

}
