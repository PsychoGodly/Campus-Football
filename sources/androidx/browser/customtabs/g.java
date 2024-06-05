package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f1936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1937b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f1938c;

    public /* synthetic */ g(j jVar, boolean z10, Bundle bundle) {
        this.f1936a = jVar;
        this.f1937b = z10;
        this.f1938c = bundle;
    }

    public final void run() {
        this.f1936a.onSessionEnded(this.f1937b, this.f1938c);
    }
}
