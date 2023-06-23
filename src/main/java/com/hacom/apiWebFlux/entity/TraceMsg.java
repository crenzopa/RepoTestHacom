package com.hacom.apiWebFlux.entity;

import java.time.OffsetDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection ="tracemsgs")
public class TraceMsg {
	@Id
	 private ObjectId _id;
	 private String sessionId;
	 private String payload;
	 private OffsetDateTime ts;
	 
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public OffsetDateTime getTs() {
		return ts;
	}
	public void setTs(OffsetDateTime ts) {
		this.ts = ts;
	}
}
