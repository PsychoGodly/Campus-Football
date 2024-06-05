package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import com.applovin.impl.sdk.t;
import java.util.concurrent.atomic.AtomicReference;

public abstract class h3 extends AppLovinWebViewBase {

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f8211b;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f8212a = new AtomicReference();

    public h3(Context context) {
        super(context);
        if (f8211b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", new Class[]{MotionEvent.class});
                f8211b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                t.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f8211b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f8212a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f8212a.getAndSet((Object) null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f8212a.get();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f8212a.set(MotionEvent.obtain(motionEvent));
        if (f8211b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
