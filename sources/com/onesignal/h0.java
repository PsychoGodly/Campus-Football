package com.onesignal;

import android.app.Activity;
import com.onesignal.PermissionsActivity;
import com.onesignal.e;
import com.onesignal.k3;
import kotlin.jvm.internal.m;

/* compiled from: LocationPermissionController.kt */
public final class h0 implements PermissionsActivity.c {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f27830a;

    /* compiled from: LocationPermissionController.kt */
    public static final class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f27831a;

        a(Activity activity) {
            this.f27831a = activity;
        }

        public void a() {
            i0.f27844a.a(this.f27831a);
            g0.n(true, k3.g1.PERMISSION_DENIED);
        }

        public void b() {
            g0.n(true, k3.g1.PERMISSION_DENIED);
        }
    }

    static {
        h0 h0Var = new h0();
        f27830a = h0Var;
        PermissionsActivity.e("LOCATION", h0Var);
    }

    private h0() {
    }

    private final void c(k3.g1 g1Var) {
        g0.n(true, g1Var);
    }

    private final void e() {
        Activity Z = k3.Z();
        if (Z != null) {
            e eVar = e.f27655a;
            String string = Z.getString(i4.location_permission_name_for_title);
            m.d(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = Z.getString(i4.location_permission_settings_message);
            m.d(string2, "activity.getString(R.str…mission_settings_message)");
            eVar.c(Z, string, string2, new a(Z));
        }
    }

    public void a() {
        c(k3.g1.PERMISSION_GRANTED);
        g0.p();
    }

    public void b(boolean z10) {
        c(k3.g1.PERMISSION_DENIED);
        if (z10) {
            e();
        }
        g0.e();
    }

    public final void d(boolean z10, String str) {
        m.e(str, "androidPermissionString");
        PermissionsActivity.i(z10, "LOCATION", str, h0.class);
    }
}
