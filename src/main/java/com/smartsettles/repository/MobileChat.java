package com.smartsettles.repository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/5/17.
 */
public class MobileChat extends Chat{

    List<MobileDetails> mobileDetails;

    public List<MobileDetails> getMobileDetails() {
        return mobileDetails;
    }

    public void setMobileDetails(List<MobileDetails> mobileDetails) {
        this.mobileDetails = mobileDetails;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String toString() {
        return "MobileChat{" +
                "mobileDetails=" + mobileDetails +
                '}';
    }
}
