package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;

/* compiled from: Sta */
public class k6 extends b {

    /* compiled from: Sta */
    public class a implements g6 {
        public a() {
        }

        public void a(Object obj) {
            k6.this.callback.a(k6.this, false);
        }
    }

    public k6(Context context, b.a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        try {
            if (MetaData.f17070k.X()) {
                ComponentLocator.a(this.context).w().b();
                StartAppSDKInternal.a(true, (g6) new a());
                return;
            }
            this.callback.a(this, false);
        } catch (Throwable th) {
            i3.a(th);
        }
    }
}
