package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.dl;
import com.applovin.impl.gr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class fr extends dl {

    /* renamed from: n  reason: collision with root package name */
    private a f7847n;

    /* renamed from: o  reason: collision with root package name */
    private int f7848o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7849p;

    /* renamed from: q  reason: collision with root package name */
    private gr.d f7850q;

    /* renamed from: r  reason: collision with root package name */
    private gr.b f7851r;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final gr.d f7852a;

        /* renamed from: b  reason: collision with root package name */
        public final gr.b f7853b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f7854c;

        /* renamed from: d  reason: collision with root package name */
        public final gr.c[] f7855d;

        /* renamed from: e  reason: collision with root package name */
        public final int f7856e;

        public a(gr.d dVar, gr.b bVar, byte[] bArr, gr.c[] cVarArr, int i10) {
            this.f7852a = dVar;
            this.f7853b = bVar;
            this.f7854c = bArr;
            this.f7855d = cVarArr;
            this.f7856e = i10;
        }
    }

    fr() {
    }

    static int a(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    static void a(yg ygVar, long j10) {
        if (ygVar.b() < ygVar.e() + 4) {
            ygVar.a(Arrays.copyOf(ygVar.c(), ygVar.e() + 4));
        } else {
            ygVar.e(ygVar.e() + 4);
        }
        byte[] c10 = ygVar.c();
        c10[ygVar.e() - 4] = (byte) ((int) (j10 & 255));
        c10[ygVar.e() - 3] = (byte) ((int) ((j10 >>> 8) & 255));
        c10[ygVar.e() - 2] = (byte) ((int) ((j10 >>> 16) & 255));
        c10[ygVar.e() - 1] = (byte) ((int) ((j10 >>> 24) & 255));
    }

    /* access modifiers changed from: package-private */
    public a b(yg ygVar) {
        gr.d dVar = this.f7850q;
        if (dVar == null) {
            this.f7850q = gr.b(ygVar);
            return null;
        }
        gr.b bVar = this.f7851r;
        if (bVar == null) {
            this.f7851r = gr.a(ygVar);
            return null;
        }
        byte[] bArr = new byte[ygVar.e()];
        System.arraycopy(ygVar.c(), 0, bArr, 0, ygVar.e());
        gr.c[] a10 = gr.a(ygVar, dVar.f8132b);
        return new a(dVar, bVar, bArr, a10, gr.a(a10.length - 1));
    }

    /* access modifiers changed from: protected */
    public void c(long j10) {
        super.c(j10);
        int i10 = 0;
        this.f7849p = j10 != 0;
        gr.d dVar = this.f7850q;
        if (dVar != null) {
            i10 = dVar.f8137g;
        }
        this.f7848o = i10;
    }

    public static boolean c(yg ygVar) {
        try {
            return gr.a(1, ygVar, true);
        } catch (ah unused) {
            return false;
        }
    }

    private static int a(byte b10, a aVar) {
        if (!aVar.f7855d[a(b10, aVar.f7856e, 1)].f8127a) {
            return aVar.f7852a.f8137g;
        }
        return aVar.f7852a.f8138h;
    }

    /* access modifiers changed from: protected */
    public long a(yg ygVar) {
        int i10 = 0;
        if ((ygVar.c()[0] & 1) == 1) {
            return -1;
        }
        int a10 = a(ygVar.c()[0], (a) a1.b((Object) this.f7847n));
        if (this.f7849p) {
            i10 = (this.f7848o + a10) / 4;
        }
        long j10 = (long) i10;
        a(ygVar, j10);
        this.f7849p = true;
        this.f7848o = a10;
        return j10;
    }

    /* access modifiers changed from: protected */
    public boolean a(yg ygVar, long j10, dl.b bVar) {
        if (this.f7847n != null) {
            a1.a((Object) bVar.f7284a);
            return false;
        }
        a b10 = b(ygVar);
        this.f7847n = b10;
        if (b10 == null) {
            return true;
        }
        gr.d dVar = b10.f7852a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f8140j);
        arrayList.add(b10.f7854c);
        bVar.f7284a = new d9.b().f("audio/vorbis").b(dVar.f8135e).k(dVar.f8134d).c(dVar.f8132b).n(dVar.f8133c).a((List) arrayList).a();
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f7847n = null;
            this.f7850q = null;
            this.f7851r = null;
        }
        this.f7848o = 0;
        this.f7849p = false;
    }
}
