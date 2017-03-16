package com.smartsettles.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by SantoshKompally on 3/5/17.
 */

@Repository
public class Chat {

    // to denote the chat type Electricity, Internet, Mobile, Leasing.
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
