package com.hacom.apiWebFlux.controller;


import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hacom.apiWebFlux.dto.TraceMsgDTO;
import com.hacom.apiWebFlux.entity.DateRangeRequest;
import com.hacom.apiWebFlux.service.TraceMsgService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tracemsgs")
public class TraceMsgController {
	
	private static final Logger LOG = LogManager.getLogger(TraceMsgController.class);
	
	@Autowired
	private TraceMsgService service;

	@GetMapping("/all")
	public Flux<TraceMsgDTO> getAllTraceMsj(){
		return service.getAllTraceMsj();
	}
	
	@GetMapping("/bydates")
	public Flux<TraceMsgDTO> getTraceMsjInDateRange(@Valid @RequestBody DateRangeRequest range){
		return service.getTraceMsjInDateRange(range.getFrom(), range.getTo());
	}
	
	@PostMapping("/new")
	public Mono<TraceMsgDTO> saveTraceMsj(@RequestBody Mono<TraceMsgDTO> traceMsgMono) {
		LOG.info("Sending request to save a TraceMs");
		return service.saveTraceMsj(traceMsgMono);

	}
}
