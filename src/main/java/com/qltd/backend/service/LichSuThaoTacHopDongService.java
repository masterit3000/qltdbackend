package com.qltd.backend.service;

import com.qltd.backend.repositories.LichSuThaoTacHopDongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Component
public class LichSuThaoTacHopDongService {

	private LichSuThaoTacHopDongRepository lichSuThaoTacHopDongRepository;

	@Autowired
	public LichSuThaoTacHopDongService(LichSuThaoTacHopDongRepository lichSuThaoTacHopDongRepository) {
		this.lichSuThaoTacHopDongRepository = lichSuThaoTacHopDongRepository;
	}

}