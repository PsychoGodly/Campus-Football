package androidx.profileinstaller;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f4304a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f4305b;

    public /* synthetic */ l(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f4304a = profileInstallerInitializer;
        this.f4305b = context;
    }

    public final void run() {
        this.f4304a.g(this.f4305b);
    }
}
