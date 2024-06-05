package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class d5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f24465a;

    /* renamed from: b  reason: collision with root package name */
    private final long f24466b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f24467c;

    /* renamed from: d  reason: collision with root package name */
    private long f24468d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ y4 f24469e;

    public d5(y4 y4Var, String str, long j10) {
        this.f24469e = y4Var;
        q.g(str);
        this.f24465a = str;
        this.f24466b = j10;
    }

    public final long a() {
        if (!this.f24467c) {
            this.f24467c = true;
            this.f24468d = this.f24469e.A().getLong(this.f24465a, this.f24466b);
        }
        return this.f24468d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f24469e.A().edit();
        edit.putLong(this.f24465a, j10);
        edit.apply();
        this.f24468d = j10;
    }
}
