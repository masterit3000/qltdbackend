package com.qltd.backend.service;

import com.qltd.backend.repositories.AnhKhachHangRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class AnhKhachHangService{

	private AnhKhachHangRepository anhKhachHangRepository;

	@Autowired
	public AnhKhachHangService(AnhKhachHangRepository anhKhachHangRepository) {
		this.anhKhachHangRepository = anhKhachHangRepository;
	}

}
