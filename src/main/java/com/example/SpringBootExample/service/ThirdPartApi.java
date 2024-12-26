package com.example.SpringBootExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.SpringBootExample.Entity.DataDTO;

/**
 * @author rabhor
 *
 */
@Service
public class ThirdPartApi {

	@Autowired
	RestTemplate restTemplate;

	@Value("${rest.api.url}")
	String apiUrl;

	/**
	 * @return
	 */
	public DataDTO getThirdPartApi() {
		ResponseEntity<DataDTO> forEntity = restTemplate.getForEntity(apiUrl, DataDTO.class);
		DataDTO response=forEntity.getBody();
		return response;
	}

	/**
	 * @param id
	 * @return
	 */
	public DataDTO getApiById(int id) {
		ResponseEntity<DataDTO> forEntity = restTemplate.getForEntity(apiUrl + "/" + id, DataDTO.class);
		DataDTO response=forEntity.getBody();
		return response;
	}
}
