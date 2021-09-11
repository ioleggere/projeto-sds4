package com.devsperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
