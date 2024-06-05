package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class x implements a.d {

    /* renamed from: c  reason: collision with root package name */
    public static final x f15491c = c().a();

    /* renamed from: b  reason: collision with root package name */
    private final String f15492b;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f15493a;

        /* synthetic */ a(z zVar) {
        }

        public x a() {
            return new x(this.f15493a, (a0) null);
        }
    }

    /* synthetic */ x(String str, a0 a0Var) {
        this.f15492b = str;
    }

    public static a c() {
        return new a((z) null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f15492b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return p.a(this.f15492b, ((x) obj).f15492b);
    }

    public final int hashCode() {
        return p.b(this.f15492b);
    }
}
