package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;

/* compiled from: Sta */
public class l6 extends b {

    /* compiled from: Sta */
    public class a implements g6 {
        public a() {
        }

        public void a(Object obj) {
            l6.this.callback.a(l6.this, false);
        }
    }

    public l6(Context context, b.a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        try {
            MetaData.c(this.context);
            MetaData.f17070k.f17073b = true;
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
