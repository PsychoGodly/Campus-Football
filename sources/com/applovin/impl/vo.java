package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.impl.ab;
import com.applovin.impl.m2;
import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.Locale;

public class vo implements m2 {
    public static final m2.a A = r60.f11151a;

    /* renamed from: y  reason: collision with root package name */
    public static final vo f12823y;

    /* renamed from: z  reason: collision with root package name */
    public static final vo f12824z;

    /* renamed from: a  reason: collision with root package name */
    public final int f12825a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12826b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12827c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12828d;

    /* renamed from: f  reason: collision with root package name */
    public final int f12829f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12830g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12831h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12832i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12833j;

    /* renamed from: k  reason: collision with root package name */
    public final int f12834k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f12835l;

    /* renamed from: m  reason: collision with root package name */
    public final ab f12836m;

    /* renamed from: n  reason: collision with root package name */
    public final ab f12837n;

    /* renamed from: o  reason: collision with root package name */
    public final int f12838o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12839p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12840q;

    /* renamed from: r  reason: collision with root package name */
    public final ab f12841r;

    /* renamed from: s  reason: collision with root package name */
    public final ab f12842s;

    /* renamed from: t  reason: collision with root package name */
    public final int f12843t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f12844u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f12845v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f12846w;

    /* renamed from: x  reason: collision with root package name */
    public final eb f12847x;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f12848a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f12849b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f12850c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f12851d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f12852e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f12853f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f12854g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f12855h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f12856i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f12857j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f12858k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public ab f12859l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public ab f12860m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public int f12861n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public int f12862o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f12863p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public ab f12864q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public ab f12865r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public int f12866s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public boolean f12867t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public boolean f12868u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public boolean f12869v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public eb f12870w;

        public a() {
            this.f12848a = a.e.API_PRIORITY_OTHER;
            this.f12849b = a.e.API_PRIORITY_OTHER;
            this.f12850c = a.e.API_PRIORITY_OTHER;
            this.f12851d = a.e.API_PRIORITY_OTHER;
            this.f12856i = a.e.API_PRIORITY_OTHER;
            this.f12857j = a.e.API_PRIORITY_OTHER;
            this.f12858k = true;
            this.f12859l = ab.h();
            this.f12860m = ab.h();
            this.f12861n = 0;
            this.f12862o = a.e.API_PRIORITY_OTHER;
            this.f12863p = a.e.API_PRIORITY_OTHER;
            this.f12864q = ab.h();
            this.f12865r = ab.h();
            this.f12866s = 0;
            this.f12867t = false;
            this.f12868u = false;
            this.f12869v = false;
            this.f12870w = eb.h();
        }

        private static ab a(String[] strArr) {
            ab.a f10 = ab.f();
            for (String a10 : (String[]) a1.a((Object) strArr)) {
                f10.b(yp.f((String) a1.a((Object) a10)));
            }
            return f10.a();
        }

        private void b(Context context) {
            CaptioningManager captioningManager;
            if ((yp.f13662a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f12866s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f12865r = ab.a((Object) yp.a(locale));
                }
            }
        }

        public a a(int i10, int i11, boolean z10) {
            this.f12856i = i10;
            this.f12857j = i11;
            this.f12858k = z10;
            return this;
        }

        public a a(Context context, boolean z10) {
            Point c10 = yp.c(context);
            return a(c10.x, c10.y, z10);
        }

        public a a(Context context) {
            if (yp.f13662a >= 19) {
                b(context);
            }
            return this;
        }

        public vo a() {
            return new vo(this);
        }

        public a(Context context) {
            this();
            a(context);
            a(context, true);
        }

        protected a(Bundle bundle) {
            String a10 = vo.b(6);
            vo voVar = vo.f12823y;
            this.f12848a = bundle.getInt(a10, voVar.f12825a);
            this.f12849b = bundle.getInt(vo.b(7), voVar.f12826b);
            this.f12850c = bundle.getInt(vo.b(8), voVar.f12827c);
            this.f12851d = bundle.getInt(vo.b(9), voVar.f12828d);
            this.f12852e = bundle.getInt(vo.b(10), voVar.f12829f);
            this.f12853f = bundle.getInt(vo.b(11), voVar.f12830g);
            this.f12854g = bundle.getInt(vo.b(12), voVar.f12831h);
            this.f12855h = bundle.getInt(vo.b(13), voVar.f12832i);
            this.f12856i = bundle.getInt(vo.b(14), voVar.f12833j);
            this.f12857j = bundle.getInt(vo.b(15), voVar.f12834k);
            this.f12858k = bundle.getBoolean(vo.b(16), voVar.f12835l);
            this.f12859l = ab.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(17)), new String[0]));
            this.f12860m = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(1)), new String[0]));
            this.f12861n = bundle.getInt(vo.b(2), voVar.f12838o);
            this.f12862o = bundle.getInt(vo.b(18), voVar.f12839p);
            this.f12863p = bundle.getInt(vo.b(19), voVar.f12840q);
            this.f12864q = ab.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(20)), new String[0]));
            this.f12865r = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(3)), new String[0]));
            this.f12866s = bundle.getInt(vo.b(4), voVar.f12843t);
            this.f12867t = bundle.getBoolean(vo.b(5), voVar.f12844u);
            this.f12868u = bundle.getBoolean(vo.b(21), voVar.f12845v);
            this.f12869v = bundle.getBoolean(vo.b(22), voVar.f12846w);
            this.f12870w = eb.a((Collection) pb.a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(vo.b(23)), new int[0])));
        }
    }

    static {
        vo a10 = new a().a();
        f12823y = a10;
        f12824z = a10;
    }

    protected vo(a aVar) {
        this.f12825a = aVar.f12848a;
        this.f12826b = aVar.f12849b;
        this.f12827c = aVar.f12850c;
        this.f12828d = aVar.f12851d;
        this.f12829f = aVar.f12852e;
        this.f12830g = aVar.f12853f;
        this.f12831h = aVar.f12854g;
        this.f12832i = aVar.f12855h;
        this.f12833j = aVar.f12856i;
        this.f12834k = aVar.f12857j;
        this.f12835l = aVar.f12858k;
        this.f12836m = aVar.f12859l;
        this.f12837n = aVar.f12860m;
        this.f12838o = aVar.f12861n;
        this.f12839p = aVar.f12862o;
        this.f12840q = aVar.f12863p;
        this.f12841r = aVar.f12864q;
        this.f12842s = aVar.f12865r;
        this.f12843t = aVar.f12866s;
        this.f12844u = aVar.f12867t;
        this.f12845v = aVar.f12868u;
        this.f12846w = aVar.f12869v;
        this.f12847x = aVar.f12870w;
    }

    /* access modifiers changed from: private */
    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vo voVar = (vo) obj;
        if (this.f12825a == voVar.f12825a && this.f12826b == voVar.f12826b && this.f12827c == voVar.f12827c && this.f12828d == voVar.f12828d && this.f12829f == voVar.f12829f && this.f12830g == voVar.f12830g && this.f12831h == voVar.f12831h && this.f12832i == voVar.f12832i && this.f12835l == voVar.f12835l && this.f12833j == voVar.f12833j && this.f12834k == voVar.f12834k && this.f12836m.equals(voVar.f12836m) && this.f12837n.equals(voVar.f12837n) && this.f12838o == voVar.f12838o && this.f12839p == voVar.f12839p && this.f12840q == voVar.f12840q && this.f12841r.equals(voVar.f12841r) && this.f12842s.equals(voVar.f12842s) && this.f12843t == voVar.f12843t && this.f12844u == voVar.f12844u && this.f12845v == voVar.f12845v && this.f12846w == voVar.f12846w && this.f12847x.equals(voVar.f12847x)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((this.f12825a + 31) * 31) + this.f12826b) * 31) + this.f12827c) * 31) + this.f12828d) * 31) + this.f12829f) * 31) + this.f12830g) * 31) + this.f12831h) * 31) + this.f12832i) * 31) + (this.f12835l ? 1 : 0)) * 31) + this.f12833j) * 31) + this.f12834k) * 31) + this.f12836m.hashCode()) * 31) + this.f12837n.hashCode()) * 31) + this.f12838o) * 31) + this.f12839p) * 31) + this.f12840q) * 31) + this.f12841r.hashCode()) * 31) + this.f12842s.hashCode()) * 31) + this.f12843t) * 31) + (this.f12844u ? 1 : 0)) * 31) + (this.f12845v ? 1 : 0)) * 31) + (this.f12846w ? 1 : 0)) * 31) + this.f12847x.hashCode();
    }
}
