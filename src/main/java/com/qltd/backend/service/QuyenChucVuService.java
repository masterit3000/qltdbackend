package com.qltd.backend.service;

import com.qltd.backend.repositories.QuyenChucVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class QuyenChucVuService {

	private QuyenChucVuRepository quyenChucVuRepository;

	@Autowired
	public QuyenChucVuService(QuyenChucVuRepository quyenChucVuRepository) {
		this.quyenChucVuRepository = quyenChucVuRepository;
	}

}
