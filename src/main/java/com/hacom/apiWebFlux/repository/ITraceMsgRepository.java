package com.hacom.apiWebFlux.repository;

import java.time.OffsetDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.hacom.apiWebFlux.entity.TraceMsg;

import reactor.core.publisher.Flux;

@Repository
public interface ITraceMsgRepository extends ReactiveMongoRepository<TraceMsg, ObjectId>{
	@Query("{'arrived': {$gte: ?0, $lte:?1 }}")
	Flux<TraceMsg> findBetweenDateRange(OffsetDateTime from, OffsetDateTime to);

}
