package com.qltd.backend.service;

import com.qltd.backend.repositories.BatHoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class BatHoService {

	private BatHoRepository batHoRepository;

	@Autowired
	public BatHoService(BatHoRepository batHoRepository) {
		this.batHoRepository = batHoRepository;
	}

}
