package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f1933a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1934b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f1935c;

    public /* synthetic */ f(j jVar, int i10, Bundle bundle) {
        this.f1933a = jVar;
        this.f1934b = i10;
        this.f1935c = bundle;
    }

    public final void run() {
        this.f1933a.onGreatestScrollPercentageIncreased(this.f1934b, this.f1935c);
    }
}
