package com.applovin.communicator;

import android.os.Bundle;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.mediation.MaxReward;

public class AppLovinCommunicatorMessage extends CommunicatorMessageImpl {
    public AppLovinCommunicatorMessage(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(bundle, str, appLovinCommunicatorPublisher);
    }

    public Bundle getMessageData() {
        return this.data;
    }

    public String getPublisherId() {
        AppLovinCommunicatorPublisher appLovinCommunicatorPublisher = this.publisherRef.get();
        return appLovinCommunicatorPublisher != null ? appLovinCommunicatorPublisher.getCommunicatorId() : MaxReward.DEFAULT_LABEL;
    }

    public String getTopic() {
        return getAction();
    }
}
