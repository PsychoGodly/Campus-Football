package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;

/* compiled from: Sta */
public abstract class b implements Runnable {
    public final a callback;
    public final Context context;
    public final Bundle extras;

    /* compiled from: Sta */
    public interface a {
        void a(b bVar, boolean z10);
    }

    public b(Context context2, a aVar, Bundle bundle) {
        this.context = context2;
        this.callback = aVar;
        this.extras = bundle;
    }

    public void run() {
        this.callback.a(this, runSync());
    }

    public boolean runSync() {
        return false;
    }
}
