package com.applovin.impl.communicator;

import android.content.Intent;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import java.lang.ref.WeakReference;
import java.util.UUID;

public abstract class CommunicatorMessageImpl extends Intent {

    /* renamed from: a  reason: collision with root package name */
    private final String f7016a = UUID.randomUUID().toString();
    protected final Bundle data;
    protected final WeakReference<AppLovinCommunicatorPublisher> publisherRef;

    public CommunicatorMessageImpl(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(str);
        this.publisherRef = new WeakReference<>(appLovinCommunicatorPublisher);
        this.data = bundle;
    }

    public static AppLovinCommunicatorMessage create(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        return new AppLovinCommunicatorMessage(bundle, str, appLovinCommunicatorPublisher);
    }

    public abstract Bundle getMessageData();

    public abstract String getPublisherId();

    public abstract String getTopic();

    public String getUniqueId() {
        return this.f7016a;
    }

    public String toString() {
        return "AppLovinCommunicatorMessage{publisherId=" + getPublisherId() + ", topic=" + getTopic() + '\'' + ", uniqueId='" + this.f7016a + '\'' + ", data=" + this.data + '}';
    }
}
