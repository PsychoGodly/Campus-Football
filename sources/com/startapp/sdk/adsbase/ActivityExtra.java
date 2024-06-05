package com.startapp.sdk.adsbase;

import android.app.Activity;
import java.io.Serializable;

/* compiled from: Sta */
public class ActivityExtra implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean isActivityFullScreen;

    public ActivityExtra(Activity activity) {
        a(a.a(activity));
    }

    public boolean a() {
        return this.isActivityFullScreen;
    }

    public final void a(boolean z10) {
        this.isActivityFullScreen = z10;
    }
}
