package com.qltd.backend.service;

import com.qltd.backend.repositories.HuyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class HuyenService {

	private HuyenRepository huyenRepository;

	@Autowired
	public HuyenService(HuyenRepository huyenRepository) {
		this.huyenRepository = huyenRepository;
	}

}
