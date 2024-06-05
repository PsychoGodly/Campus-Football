package com.applovin.mediation.adapter.parameters;

public interface MaxAdapterResponseParameters extends MaxAdapterParameters {
    long getBidExpirationMillis();

    String getBidResponse();

    String getThirdPartyAdPlacementId();
}
