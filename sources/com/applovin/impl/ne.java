package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

public abstract class ne extends Activity implements AppLovinCommunicatorSubscriber {
    protected List<String> communicatorTopics = new ArrayList();

    public String getCommunicatorId() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    public abstract k getSdk();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSdk() != null && !zp.c(getSdk())) {
            setTheme(R.style.com_applovin_mediation_MaxDebuggerActivity_Theme_Live);
        }
        List<String> list = this.communicatorTopics;
        if (list != null && list.size() > 0) {
            AppLovinCommunicator.getInstance(this).subscribe((AppLovinCommunicatorSubscriber) this, this.communicatorTopics);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        List<String> list = this.communicatorTopics;
        if (list != null && list.size() > 0) {
            AppLovinCommunicator.getInstance(this).unsubscribe((AppLovinCommunicatorSubscriber) this, this.communicatorTopics);
        }
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }
}
