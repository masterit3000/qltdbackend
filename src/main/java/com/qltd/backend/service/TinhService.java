package com.qltd.backend.service;

import com.qltd.backend.repositories.TinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class TinhService {

	private TinhRepository tinhRepository;

	@Autowired
	public TinhService(TinhRepository tinhRepository) {
		this.tinhRepository = tinhRepository;
	}

}