package androidx.lifecycle;

import kotlin.jvm.internal.m;
import p0.a;

/* compiled from: ViewModelProvider.kt */
public final class n0 {
    public static final a a(p0 p0Var) {
        m.e(p0Var, "owner");
        if (p0Var instanceof h) {
            return ((h) p0Var).getDefaultViewModelCreationExtras();
        }
        return a.C0220a.f21097b;
    }
}
