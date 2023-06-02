package com.ust.helo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.helo.Entity.Products1;
@Repository
public interface jpaRepository extends JpaRepository<Products1,Long> {

	

}
