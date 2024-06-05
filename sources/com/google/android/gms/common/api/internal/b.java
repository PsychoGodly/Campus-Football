package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.p;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final int f15066a;

    /* renamed from: b  reason: collision with root package name */
    private final a<O> f15067b;

    /* renamed from: c  reason: collision with root package name */
    private final O f15068c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15069d;

    private b(a<O> aVar, O o10, String str) {
        this.f15067b = aVar;
        this.f15068c = o10;
        this.f15069d = str;
        this.f15066a = p.b(aVar, o10, str);
    }

    public static <O extends a.d> b<O> a(a<O> aVar, O o10, String str) {
        return new b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f15067b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.a(this.f15067b, bVar.f15067b) && p.a(this.f15068c, bVar.f15068c) && p.a(this.f15069d, bVar.f15069d);
    }

    public final int hashCode() {
        return this.f15066a;
    }
}
