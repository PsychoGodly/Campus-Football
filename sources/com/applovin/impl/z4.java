package com.applovin.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;
import com.applovin.mediation.MaxReward;

public final class z4 implements m2 {

    /* renamed from: s  reason: collision with root package name */
    public static final z4 f13750s = new b().a((CharSequence) MaxReward.DEFAULT_LABEL).a();

    /* renamed from: t  reason: collision with root package name */
    public static final m2.a f13751t = x80.f13302a;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f13752a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f13753b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f13754c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f13755d;

    /* renamed from: f  reason: collision with root package name */
    public final float f13756f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13757g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13758h;

    /* renamed from: i  reason: collision with root package name */
    public final float f13759i;

    /* renamed from: j  reason: collision with root package name */
    public final int f13760j;

    /* renamed from: k  reason: collision with root package name */
    public final float f13761k;

    /* renamed from: l  reason: collision with root package name */
    public final float f13762l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f13763m;

    /* renamed from: n  reason: collision with root package name */
    public final int f13764n;

    /* renamed from: o  reason: collision with root package name */
    public final int f13765o;

    /* renamed from: p  reason: collision with root package name */
    public final float f13766p;

    /* renamed from: q  reason: collision with root package name */
    public final int f13767q;

    /* renamed from: r  reason: collision with root package name */
    public final float f13768r;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f13769a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f13770b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f13771c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f13772d;

        /* renamed from: e  reason: collision with root package name */
        private float f13773e;

        /* renamed from: f  reason: collision with root package name */
        private int f13774f;

        /* renamed from: g  reason: collision with root package name */
        private int f13775g;

        /* renamed from: h  reason: collision with root package name */
        private float f13776h;

        /* renamed from: i  reason: collision with root package name */
        private int f13777i;

        /* renamed from: j  reason: collision with root package name */
        private int f13778j;

        /* renamed from: k  reason: collision with root package name */
        private float f13779k;

        /* renamed from: l  reason: collision with root package name */
        private float f13780l;

        /* renamed from: m  reason: collision with root package name */
        private float f13781m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f13782n;

        /* renamed from: o  reason: collision with root package name */
        private int f13783o;

        /* renamed from: p  reason: collision with root package name */
        private int f13784p;

        /* renamed from: q  reason: collision with root package name */
        private float f13785q;

        public b() {
            this.f13769a = null;
            this.f13770b = null;
            this.f13771c = null;
            this.f13772d = null;
            this.f13773e = -3.4028235E38f;
            this.f13774f = RecyclerView.UNDEFINED_DURATION;
            this.f13775g = RecyclerView.UNDEFINED_DURATION;
            this.f13776h = -3.4028235E38f;
            this.f13777i = RecyclerView.UNDEFINED_DURATION;
            this.f13778j = RecyclerView.UNDEFINED_DURATION;
            this.f13779k = -3.4028235E38f;
            this.f13780l = -3.4028235E38f;
            this.f13781m = -3.4028235E38f;
            this.f13782n = false;
            this.f13783o = -16777216;
            this.f13784p = RecyclerView.UNDEFINED_DURATION;
        }

        public b a(Bitmap bitmap) {
            this.f13770b = bitmap;
            return this;
        }

        public b b() {
            this.f13782n = false;
            return this;
        }

        public int c() {
            return this.f13775g;
        }

        public int d() {
            return this.f13777i;
        }

        public CharSequence e() {
            return this.f13769a;
        }

        public b a(float f10) {
            this.f13781m = f10;
            return this;
        }

        public b b(float f10) {
            this.f13776h = f10;
            return this;
        }

        public b c(float f10) {
            this.f13785q = f10;
            return this;
        }

        public b d(float f10) {
            this.f13780l = f10;
            return this;
        }

        public b a(float f10, int i10) {
            this.f13773e = f10;
            this.f13774f = i10;
            return this;
        }

        public b b(int i10) {
            this.f13777i = i10;
            return this;
        }

        public b c(int i10) {
            this.f13784p = i10;
            return this;
        }

        public b d(int i10) {
            this.f13783o = i10;
            this.f13782n = true;
            return this;
        }

        public b b(Layout.Alignment alignment) {
            this.f13771c = alignment;
            return this;
        }

        public b a(int i10) {
            this.f13775g = i10;
            return this;
        }

        public b b(float f10, int i10) {
            this.f13779k = f10;
            this.f13778j = i10;
            return this;
        }

        public b a(Layout.Alignment alignment) {
            this.f13772d = alignment;
            return this;
        }

        public b a(CharSequence charSequence) {
            this.f13769a = charSequence;
            return this;
        }

        public z4 a() {
            return new z4(this.f13769a, this.f13771c, this.f13772d, this.f13770b, this.f13773e, this.f13774f, this.f13775g, this.f13776h, this.f13777i, this.f13778j, this.f13779k, this.f13780l, this.f13781m, this.f13782n, this.f13783o, this.f13784p, this.f13785q);
        }

        private b(z4 z4Var) {
            this.f13769a = z4Var.f13752a;
            this.f13770b = z4Var.f13755d;
            this.f13771c = z4Var.f13753b;
            this.f13772d = z4Var.f13754c;
            this.f13773e = z4Var.f13756f;
            this.f13774f = z4Var.f13757g;
            this.f13775g = z4Var.f13758h;
            this.f13776h = z4Var.f13759i;
            this.f13777i = z4Var.f13760j;
            this.f13778j = z4Var.f13765o;
            this.f13779k = z4Var.f13766p;
            this.f13780l = z4Var.f13761k;
            this.f13781m = z4Var.f13762l;
            this.f13782n = z4Var.f13763m;
            this.f13783o = z4Var.f13764n;
            this.f13784p = z4Var.f13767q;
            this.f13785q = z4Var.f13768r;
        }
    }

    private z4(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            a1.a((Object) bitmap);
        } else {
            a1.a(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f13752a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f13752a = charSequence.toString();
        } else {
            this.f13752a = null;
        }
        this.f13753b = alignment;
        this.f13754c = alignment2;
        this.f13755d = bitmap2;
        this.f13756f = f10;
        this.f13757g = i10;
        this.f13758h = i11;
        this.f13759i = f11;
        this.f13760j = i12;
        this.f13761k = f13;
        this.f13762l = f14;
        this.f13763m = z10;
        this.f13764n = i14;
        this.f13765o = i13;
        this.f13766p = f12;
        this.f13767q = i15;
        this.f13768r = f15;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || z4.class != obj.getClass()) {
            return false;
        }
        z4 z4Var = (z4) obj;
        if (TextUtils.equals(this.f13752a, z4Var.f13752a) && this.f13753b == z4Var.f13753b && this.f13754c == z4Var.f13754c && ((bitmap = this.f13755d) != null ? !((bitmap2 = z4Var.f13755d) == null || !bitmap.sameAs(bitmap2)) : z4Var.f13755d == null) && this.f13756f == z4Var.f13756f && this.f13757g == z4Var.f13757g && this.f13758h == z4Var.f13758h && this.f13759i == z4Var.f13759i && this.f13760j == z4Var.f13760j && this.f13761k == z4Var.f13761k && this.f13762l == z4Var.f13762l && this.f13763m == z4Var.f13763m && this.f13764n == z4Var.f13764n && this.f13765o == z4Var.f13765o && this.f13766p == z4Var.f13766p && this.f13767q == z4Var.f13767q && this.f13768r == z4Var.f13768r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f13752a, this.f13753b, this.f13754c, this.f13755d, Float.valueOf(this.f13756f), Integer.valueOf(this.f13757g), Integer.valueOf(this.f13758h), Float.valueOf(this.f13759i), Integer.valueOf(this.f13760j), Float.valueOf(this.f13761k), Float.valueOf(this.f13762l), Boolean.valueOf(this.f13763m), Integer.valueOf(this.f13764n), Integer.valueOf(this.f13765o), Float.valueOf(this.f13766p), Integer.valueOf(this.f13767q), Float.valueOf(this.f13768r));
    }

    public b a() {
        return new b();
    }

    /* access modifiers changed from: private */
    public static final z4 a(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            bVar.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            bVar.b(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            bVar.a(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            bVar.a(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            bVar.a(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            bVar.a(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            bVar.b(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            bVar.b(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            bVar.b(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            bVar.d(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            bVar.a(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            bVar.d(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            bVar.b();
        }
        if (bundle.containsKey(a(15))) {
            bVar.c(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            bVar.c(bundle.getFloat(a(16)));
        }
        return bVar.a();
    }
}
