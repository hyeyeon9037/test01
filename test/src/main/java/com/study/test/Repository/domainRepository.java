package com.study.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.test.Domain.domain;

@Repository
public interface domainRepository extends JpaRepository<domain, Long>{

}
