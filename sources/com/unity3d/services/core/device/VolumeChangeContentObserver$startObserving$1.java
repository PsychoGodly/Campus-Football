package com.unity3d.services.core.device;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: VolumeChangeContentObserver.kt */
public final class VolumeChangeContentObserver$startObserving$1 extends ContentObserver {
    final /* synthetic */ VolumeChangeContentObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VolumeChangeContentObserver$startObserving$1(VolumeChangeContentObserver volumeChangeContentObserver, Handler handler) {
        super(handler);
        this.this$0 = volumeChangeContentObserver;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z10, Uri uri) {
        this.this$0.triggerListeners();
    }
}
