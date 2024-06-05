package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class e5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f24548a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24549b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f24550c;

    /* renamed from: d  reason: collision with root package name */
    private String f24551d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ y4 f24552e;

    public e5(y4 y4Var, String str, String str2) {
        this.f24552e = y4Var;
        q.g(str);
        this.f24548a = str;
    }

    public final String a() {
        if (!this.f24550c) {
            this.f24550c = true;
            this.f24551d = this.f24552e.A().getString(this.f24548a, (String) null);
        }
        return this.f24551d;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f24552e.A().edit();
        edit.putString(this.f24548a, str);
        edit.apply();
        this.f24551d = str;
    }
}
