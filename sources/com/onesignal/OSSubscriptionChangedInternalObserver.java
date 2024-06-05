package com.onesignal;

class OSSubscriptionChangedInternalObserver {
    OSSubscriptionChangedInternalObserver() {
    }

    static void a(OSSubscriptionState oSSubscriptionState) {
        if (k3.L0().c(new w2(k3.f27917h0, (OSSubscriptionState) oSSubscriptionState.clone()))) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            k3.f27917h0 = oSSubscriptionState2;
            oSSubscriptionState2.g();
        }
    }

    public void changed(OSSubscriptionState oSSubscriptionState) {
        a(oSSubscriptionState);
    }
}
