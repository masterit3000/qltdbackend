package com.qltd.backend.service;

import com.qltd.backend.repositories.ThuChiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class ThuChiService {

	private ThuChiRepository thuChiRepository;

	@Autowired
	public ThuChiService(ThuChiRepository thuChiRepository) {
		this.thuChiRepository = thuChiRepository;
	}

}