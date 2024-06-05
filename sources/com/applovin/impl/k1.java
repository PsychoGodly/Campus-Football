package com.applovin.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.impl.m2;

public final class k1 implements m2 {

    /* renamed from: g  reason: collision with root package name */
    public static final k1 f8851g = new b().a();

    /* renamed from: h  reason: collision with root package name */
    public static final m2.a f8852h = my.f9866a;

    /* renamed from: a  reason: collision with root package name */
    public final int f8853a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8854b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8855c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8856d;

    /* renamed from: f  reason: collision with root package name */
    private AudioAttributes f8857f;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f8858a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f8859b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f8860c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f8861d = 1;

        public b a(int i10) {
            this.f8861d = i10;
            return this;
        }

        public b b(int i10) {
            this.f8858a = i10;
            return this;
        }

        public b c(int i10) {
            this.f8859b = i10;
            return this;
        }

        public b d(int i10) {
            this.f8860c = i10;
            return this;
        }

        public k1 a() {
            return new k1(this.f8858a, this.f8859b, this.f8860c, this.f8861d);
        }
    }

    private k1(int i10, int i11, int i12, int i13) {
        this.f8853a = i10;
        this.f8854b = i11;
        this.f8855c = i12;
        this.f8856d = i13;
    }

    public AudioAttributes a() {
        if (this.f8857f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f8853a).setFlags(this.f8854b).setUsage(this.f8855c);
            if (yp.f13662a >= 29) {
                usage.setAllowedCapturePolicy(this.f8856d);
            }
            this.f8857f = usage.build();
        }
        return this.f8857f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1.class != obj.getClass()) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (this.f8853a == k1Var.f8853a && this.f8854b == k1Var.f8854b && this.f8855c == k1Var.f8855c && this.f8856d == k1Var.f8856d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f8853a + 527) * 31) + this.f8854b) * 31) + this.f8855c) * 31) + this.f8856d;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k1 a(Bundle bundle) {
        b bVar = new b();
        if (bundle.containsKey(a(0))) {
            bVar.b(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            bVar.c(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            bVar.d(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            bVar.a(bundle.getInt(a(3)));
        }
        return bVar.a();
    }
}
