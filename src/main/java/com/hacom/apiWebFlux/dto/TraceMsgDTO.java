package com.hacom.apiWebFlux.dto;

import java.time.OffsetDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraceMsgDTO {
	 @Id
	 private ObjectId _id;
	 private String sessionId;
	 private String payload;
	 private OffsetDateTime ts;


}
