package com.devsperior.dsvendas.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsperior.dsvendas.dto.SaleDTO;
import com.devsperior.dsvendas.entities.Sale;
import com.devsperior.dsvendas.repositories.SaleRepository;
import com.devsperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerrepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable paegable){
		sellerrepository.findAll();
		Page <Sale> result = repository.findAll(paegable);
		return result.map(x -> new SaleDTO(x));
	}
}
