package com.qltd.backend.service;

import com.qltd.backend.repositories.QuyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class QuyenService {

	private QuyenRepository quyenRepository;

	@Autowired
	public QuyenService(QuyenRepository quyenRepository) {
		this.quyenRepository = quyenRepository;
	}

}
