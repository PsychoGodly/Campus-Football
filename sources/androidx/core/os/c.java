package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.internal.m;

/* compiled from: Bundle.kt */
final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f2965a = new c();

    private c() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        m.e(bundle, "bundle");
        m.e(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        m.e(bundle, "bundle");
        m.e(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
