package com.qltd.backend.service;

import com.qltd.backend.repositories.KhachhangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class KhachhangService {

	private KhachhangRepository khachhangRepository;

	@Autowired
	public KhachhangService(KhachhangRepository khachhangRepository) {
		this.khachhangRepository = khachhangRepository;
	}

}
