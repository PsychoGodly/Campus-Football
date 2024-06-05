package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class j5 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f8675a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8676b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8677c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f8678d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f8679e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8680f;

    /* renamed from: g  reason: collision with root package name */
    public final long f8681g;

    /* renamed from: h  reason: collision with root package name */
    public final long f8682h;

    /* renamed from: i  reason: collision with root package name */
    public final String f8683i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8684j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f8685k;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f8686a;

        /* renamed from: b  reason: collision with root package name */
        private long f8687b;

        /* renamed from: c  reason: collision with root package name */
        private int f8688c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f8689d;

        /* renamed from: e  reason: collision with root package name */
        private Map f8690e;

        /* renamed from: f  reason: collision with root package name */
        private long f8691f;

        /* renamed from: g  reason: collision with root package name */
        private long f8692g;

        /* renamed from: h  reason: collision with root package name */
        private String f8693h;

        /* renamed from: i  reason: collision with root package name */
        private int f8694i;

        /* renamed from: j  reason: collision with root package name */
        private Object f8695j;

        public b() {
            this.f8688c = 1;
            this.f8690e = Collections.emptyMap();
            this.f8692g = -1;
        }

        public j5 a() {
            a1.a((Object) this.f8686a, (Object) "The uri must be set.");
            return new j5(this.f8686a, this.f8687b, this.f8688c, this.f8689d, this.f8690e, this.f8691f, this.f8692g, this.f8693h, this.f8694i, this.f8695j);
        }

        public b b(int i10) {
            this.f8688c = i10;
            return this;
        }

        public b b(String str) {
            this.f8686a = Uri.parse(str);
            return this;
        }

        public b a(int i10) {
            this.f8694i = i10;
            return this;
        }

        public b a(byte[] bArr) {
            this.f8689d = bArr;
            return this;
        }

        private b(j5 j5Var) {
            this.f8686a = j5Var.f8675a;
            this.f8687b = j5Var.f8676b;
            this.f8688c = j5Var.f8677c;
            this.f8689d = j5Var.f8678d;
            this.f8690e = j5Var.f8679e;
            this.f8691f = j5Var.f8681g;
            this.f8692g = j5Var.f8682h;
            this.f8693h = j5Var.f8683i;
            this.f8694i = j5Var.f8684j;
            this.f8695j = j5Var.f8685k;
        }

        public b a(Map map) {
            this.f8690e = map;
            return this;
        }

        public b a(String str) {
            this.f8693h = str;
            return this;
        }

        public b a(long j10) {
            this.f8691f = j10;
            return this;
        }

        public b a(Uri uri) {
            this.f8686a = uri;
            return this;
        }
    }

    private j5(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10;
        byte[] bArr2 = bArr;
        long j14 = j11;
        long j15 = j12;
        long j16 = j13 + j14;
        boolean z10 = true;
        a1.a(j16 >= 0);
        a1.a(j14 >= 0);
        if (j15 <= 0 && j15 != -1) {
            z10 = false;
        }
        a1.a(z10);
        this.f8675a = uri;
        this.f8676b = j13;
        this.f8677c = i10;
        this.f8678d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f8679e = Collections.unmodifiableMap(new HashMap(map));
        this.f8681g = j14;
        this.f8680f = j16;
        this.f8682h = j15;
        this.f8683i = str;
        this.f8684j = i11;
        this.f8685k = obj;
    }

    public static String a(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final String b() {
        return a(this.f8677c);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f8675a + ", " + this.f8681g + ", " + this.f8682h + ", " + this.f8683i + ", " + this.f8684j + "]";
    }

    public b a() {
        return new b();
    }

    public boolean b(int i10) {
        return (this.f8684j & i10) == i10;
    }
}
