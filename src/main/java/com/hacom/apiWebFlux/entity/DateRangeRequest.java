package com.hacom.apiWebFlux.entity;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotNull;

public class DateRangeRequest {
	@NotNull(message = "Field from is mandatory. Please enter a value.")
	 private OffsetDateTime from;
	@NotNull(message = "Field to is mandatory. Please enter a value.")
	 private OffsetDateTime to;
	
	public OffsetDateTime getFrom() {
		return from;
	}
	public void setFrom(OffsetDateTime from) {
		this.from = from;
	}
	public OffsetDateTime getTo() {
		return to;
	}
	public void setTo(OffsetDateTime to) {
		this.to = to;
	}
}
