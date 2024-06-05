package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f1939a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1940b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f1941c;

    public /* synthetic */ h(j jVar, boolean z10, Bundle bundle) {
        this.f1939a = jVar;
        this.f1940b = z10;
        this.f1941c = bundle;
    }

    public final void run() {
        this.f1939a.onVerticalScrollEvent(this.f1940b, this.f1941c);
    }
}
