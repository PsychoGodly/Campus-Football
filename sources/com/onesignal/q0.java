package com.onesignal;

import android.app.Activity;
import android.os.Build;
import com.onesignal.PermissionsActivity;
import com.onesignal.e;
import com.onesignal.k3;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import sd.g;

/* compiled from: NotificationPermissionController.kt */
public final class q0 implements PermissionsActivity.c {

    /* renamed from: a  reason: collision with root package name */
    public static final q0 f28095a;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<k3.h1> f28096b = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static boolean f28097c;

    /* renamed from: d  reason: collision with root package name */
    private static final g f28098d = i.a(b.f28100a);

    /* compiled from: NotificationPermissionController.kt */
    public static final class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f28099a;

        a(Activity activity) {
            this.f28099a = activity;
        }

        public void a() {
            j0.f27863a.a(this.f28099a);
            q0 q0Var = q0.f28095a;
            q0.f28097c = true;
        }

        public void b() {
            q0.f28095a.e(false);
        }
    }

    /* compiled from: NotificationPermissionController.kt */
    static final class b extends n implements fe.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f28100a = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(Build.VERSION.SDK_INT > 32 && OSUtils.o(k3.f27912f) > 32);
        }
    }

    static {
        q0 q0Var = new q0();
        f28095a = q0Var;
        PermissionsActivity.e("NOTIFICATION", q0Var);
    }

    private q0() {
    }

    /* access modifiers changed from: private */
    public final void e(boolean z10) {
        for (k3.h1 n10 : f28096b) {
            n10.n(z10);
        }
        f28096b.clear();
    }

    private final boolean f() {
        return ((Boolean) f28098d.getValue()).booleanValue();
    }

    private final boolean g() {
        return OSUtils.a(k3.f27912f);
    }

    private final boolean j() {
        Activity Z = k3.Z();
        if (Z == null) {
            return false;
        }
        e eVar = e.f27655a;
        String string = Z.getString(i4.notification_permission_name_for_title);
        m.d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = Z.getString(i4.notification_permission_settings_message);
        m.d(string2, "activity.getString(R.str…mission_settings_message)");
        eVar.c(Z, string, string2, new a(Z));
        return true;
    }

    public void a() {
        k3.K1();
        e(true);
    }

    public void b(boolean z10) {
        if (!(z10 ? j() : false)) {
            e(false);
        }
    }

    public final void h() {
        if (f28097c) {
            f28097c = false;
            e(g());
        }
    }

    public final void i(boolean z10, k3.h1 h1Var) {
        if (h1Var != null) {
            f28096b.add(h1Var);
        }
        if (g()) {
            e(true);
        } else if (f()) {
            PermissionsActivity.i(z10, "NOTIFICATION", "android.permission.POST_NOTIFICATIONS", q0.class);
        } else if (z10) {
            j();
        } else {
            e(false);
        }
    }
}
