package com.smartsettles.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/14/17.
 */
public interface IChatRepository extends MongoRepository<ChatMessages,String> {

    public List<ChatMessages> findByFrom(String from);
}
