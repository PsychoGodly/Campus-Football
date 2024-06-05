package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    final String f24337a;

    /* renamed from: b  reason: collision with root package name */
    final String f24338b;

    /* renamed from: c  reason: collision with root package name */
    final long f24339c;

    /* renamed from: d  reason: collision with root package name */
    final long f24340d;

    /* renamed from: e  reason: collision with root package name */
    final long f24341e;

    /* renamed from: f  reason: collision with root package name */
    final long f24342f;

    /* renamed from: g  reason: collision with root package name */
    final long f24343g;

    /* renamed from: h  reason: collision with root package name */
    final Long f24344h;

    /* renamed from: i  reason: collision with root package name */
    final Long f24345i;

    /* renamed from: j  reason: collision with root package name */
    final Long f24346j;

    /* renamed from: k  reason: collision with root package name */
    final Boolean f24347k;

    a0(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0, 0, 0, j12, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public final a0 a(long j10) {
        return new a0(this.f24337a, this.f24338b, this.f24339c, this.f24340d, this.f24341e, j10, this.f24343g, this.f24344h, this.f24345i, this.f24346j, this.f24347k);
    }

    /* access modifiers changed from: package-private */
    public final a0 b(long j10, long j11) {
        return new a0(this.f24337a, this.f24338b, this.f24339c, this.f24340d, this.f24341e, this.f24342f, j10, Long.valueOf(j11), this.f24345i, this.f24346j, this.f24347k);
    }

    /* access modifiers changed from: package-private */
    public final a0 c(Long l10, Long l11, Boolean bool) {
        return new a0(this.f24337a, this.f24338b, this.f24339c, this.f24340d, this.f24341e, this.f24342f, this.f24343g, this.f24344h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    a0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        q.g(str);
        q.g(str2);
        boolean z10 = true;
        q.a(j15 >= 0);
        q.a(j16 >= 0);
        q.a(j17 >= 0);
        q.a(j18 < 0 ? false : z10);
        this.f24337a = str;
        this.f24338b = str2;
        this.f24339c = j15;
        this.f24340d = j16;
        this.f24341e = j17;
        this.f24342f = j13;
        this.f24343g = j18;
        this.f24344h = l10;
        this.f24345i = l11;
        this.f24346j = l12;
        this.f24347k = bool;
    }
}
