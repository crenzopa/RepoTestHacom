package com.hacom.apiWebFlux.utils;

import org.springframework.beans.BeanUtils;

import com.hacom.apiWebFlux.dto.TraceMsgDTO;
import com.hacom.apiWebFlux.entity.TraceMsg;

public class hacomUtils {
	
	public static TraceMsgDTO entityToDto(TraceMsg traceMsg) {
		TraceMsgDTO traceMsgDto = new TraceMsgDTO();
		BeanUtils.copyProperties(traceMsg, traceMsgDto);
		return traceMsgDto;
	}
	
	public static TraceMsg dtoToEntity(TraceMsgDTO traceMsgDto) {
		TraceMsg traceMsg = new TraceMsg();
		BeanUtils.copyProperties(traceMsgDto, traceMsg);
		return traceMsg;
	}
}
