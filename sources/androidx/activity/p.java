package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.m;

/* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
public final class p {
    public static final void a(View view, k kVar) {
        m.e(view, "<this>");
        m.e(kVar, "fullyDrawnReporterOwner");
        view.setTag(o.report_drawn, kVar);
    }
}
