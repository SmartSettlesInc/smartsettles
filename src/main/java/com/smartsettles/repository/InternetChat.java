package com.smartsettles.repository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/5/17.
 */
public class InternetChat extends Chat{

    List<InternetDetails> internetDetails;

    public List<InternetDetails> getInternetDetails() {
        return internetDetails;
    }

    public void setInternetDetails(List<InternetDetails> internetDetails) {
        this.internetDetails = internetDetails;
    }
}
