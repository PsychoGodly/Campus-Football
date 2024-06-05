package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class r4 {

    /* renamed from: a  reason: collision with root package name */
    public String f24992a;

    /* renamed from: b  reason: collision with root package name */
    private String f24993b;

    /* renamed from: c  reason: collision with root package name */
    private long f24994c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f24995d;

    private r4(String str, String str2, Bundle bundle, long j10) {
        this.f24992a = str;
        this.f24993b = str2;
        this.f24995d = bundle == null ? new Bundle() : bundle;
        this.f24994c = j10;
    }

    public static r4 b(d0 d0Var) {
        return new r4(d0Var.f24457a, d0Var.f24459c, d0Var.f24458b.w(), d0Var.f24460d);
    }

    public final d0 a() {
        return new d0(this.f24992a, new z(new Bundle(this.f24995d)), this.f24993b, this.f24994c);
    }

    public final String toString() {
        String str = this.f24993b;
        String str2 = this.f24992a;
        String valueOf = String.valueOf(this.f24995d);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }
}
