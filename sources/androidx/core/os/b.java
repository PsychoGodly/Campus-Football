package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.jvm.internal.m;

/* compiled from: Bundle.kt */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2964a = new b();

    private b() {
    }

    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        m.e(bundle, "bundle");
        m.e(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
