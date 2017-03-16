package com.smartsettles.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/14/17.
 */
@Repository
public class ChatRepository {


    @Autowired
    MongoTemplate mongoTemplate;

    public List<ChatMessages> getMessagesForId(String userId) {
        return mongoTemplate.find(Query.query(new Criteria()
                .orOperator(Criteria.where("from").regex(userId, "i"),
                        Criteria.where("to").regex(userId, "i")

        )), ChatMessages.class);
    }
}
