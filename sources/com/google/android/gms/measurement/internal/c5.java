package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class c5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f24427a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24428b;

    /* renamed from: c  reason: collision with root package name */
    private final String f24429c;

    /* renamed from: d  reason: collision with root package name */
    private final long f24430d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ y4 f24431e;

    private c5(y4 y4Var, String str, long j10) {
        this.f24431e = y4Var;
        q.g(str);
        q.a(j10 > 0);
        this.f24427a = str + ":start";
        this.f24428b = str + ":count";
        this.f24429c = str + ":value";
        this.f24430d = j10;
    }

    private final long c() {
        return this.f24431e.A().getLong(this.f24427a, 0);
    }

    private final void d() {
        this.f24431e.i();
        long a10 = this.f24431e.zzb().a();
        SharedPreferences.Editor edit = this.f24431e.A().edit();
        edit.remove(this.f24428b);
        edit.remove(this.f24429c);
        edit.putLong(this.f24427a, a10);
        edit.apply();
    }

    public final Pair<String, Long> a() {
        long j10;
        this.f24431e.i();
        this.f24431e.i();
        long c10 = c();
        if (c10 == 0) {
            d();
            j10 = 0;
        } else {
            j10 = Math.abs(c10 - this.f24431e.zzb().a());
        }
        long j11 = this.f24430d;
        if (j10 < j11) {
            return null;
        }
        if (j10 > (j11 << 1)) {
            d();
            return null;
        }
        String string = this.f24431e.A().getString(this.f24429c, (String) null);
        long j12 = this.f24431e.A().getLong(this.f24428b, 0);
        d();
        if (string == null || j12 <= 0) {
            return y4.f25264z;
        }
        return new Pair<>(string, Long.valueOf(j12));
    }

    public final void b(String str, long j10) {
        this.f24431e.i();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = MaxReward.DEFAULT_LABEL;
        }
        long j11 = this.f24431e.A().getLong(this.f24428b, 0);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f24431e.A().edit();
            edit.putString(this.f24429c, str);
            edit.putLong(this.f24428b, 1);
            edit.apply();
            return;
        }
        long j12 = j11 + 1;
        boolean z10 = (this.f24431e.f().P0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.f24431e.A().edit();
        if (z10) {
            edit2.putString(this.f24429c, str);
        }
        edit2.putLong(this.f24428b, j12);
        edit2.apply();
    }
}
