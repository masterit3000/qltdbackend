package com.qltd.backend.service;

import com.qltd.backend.repositories.TaiSanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class TaiSanService {

	private TaiSanRepository taiSanRepository;

	@Autowired
	public TaiSanService(TaiSanRepository taiSanRepository) {
		this.taiSanRepository = taiSanRepository;
	}

}
