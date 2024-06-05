package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class b5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f24381a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f24382b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f24383c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f24384d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ y4 f24385e;

    public b5(y4 y4Var, String str, boolean z10) {
        this.f24385e = y4Var;
        q.g(str);
        this.f24381a = str;
        this.f24382b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f24385e.A().edit();
        edit.putBoolean(this.f24381a, z10);
        edit.apply();
        this.f24384d = z10;
    }

    public final boolean b() {
        if (!this.f24383c) {
            this.f24383c = true;
            this.f24384d = this.f24385e.A().getBoolean(this.f24381a, this.f24382b);
        }
        return this.f24384d;
    }
}
