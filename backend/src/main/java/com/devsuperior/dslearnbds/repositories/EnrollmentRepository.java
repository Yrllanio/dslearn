package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<EnrollmentRepository, EnrollmentPK> {

}
