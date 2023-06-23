package com.hacom.apiWebFlux.service;

import java.time.OffsetDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacom.apiWebFlux.dto.TraceMsgDTO;
import com.hacom.apiWebFlux.repository.ITraceMsgRepository;
import com.hacom.apiWebFlux.utils.hacomUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TraceMsgService {
	private static final Logger LOG = LogManager.getLogger(TraceMsgService.class); 
	@Autowired
	private ITraceMsgRepository repo;
	
	public Flux<TraceMsgDTO> getAllTraceMsj(){
		return repo.findAll().map(hacomUtils::entityToDto);
	}
	
	public Flux<TraceMsgDTO> getTraceMsjInDateRange(OffsetDateTime from, OffsetDateTime to){
		return repo.findBetweenDateRange(from, to).map(hacomUtils::entityToDto);
	}

	public Mono<TraceMsgDTO> saveTraceMsj(Mono<TraceMsgDTO> traceMsgMono) {
		try {
			LOG.info("Saving TraceMs in DB");
			return traceMsgMono.map(hacomUtils::dtoToEntity).flatMap(repo::insert).map(hacomUtils::entityToDto);
		} catch (Exception e) {
			LOG.error("TraceMs was not saved. Please check the error.");
			return null;
		}
	}
}
