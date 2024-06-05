package com.applovin.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxReward;
import java.util.List;

public final class mp extends bk {

    /* renamed from: o  reason: collision with root package name */
    private final yg f9820o = new yg();

    /* renamed from: p  reason: collision with root package name */
    private final boolean f9821p;

    /* renamed from: q  reason: collision with root package name */
    private final int f9822q;

    /* renamed from: r  reason: collision with root package name */
    private final int f9823r;

    /* renamed from: s  reason: collision with root package name */
    private final String f9824s;

    /* renamed from: t  reason: collision with root package name */
    private final float f9825t;

    /* renamed from: u  reason: collision with root package name */
    private final int f9826u;

    public mp(List list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z10 = true;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f9822q = bArr[24];
            this.f9823r = ((bArr[26] & 255) << Ascii.CAN) | ((bArr[27] & 255) << Ascii.DLE) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f9824s = "Serif".equals(yp.a(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i10 = bArr[25] * Ascii.DC4;
            this.f9826u = i10;
            z10 = (bArr[0] & 32) == 0 ? false : z10;
            this.f9821p = z10;
            if (z10) {
                this.f9825t = yp.a(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i10), 0.0f, 0.95f);
            } else {
                this.f9825t = 0.85f;
            }
        } else {
            this.f9822q = 0;
            this.f9823r = -1;
            this.f9824s = str;
            this.f9821p = false;
            this.f9825t = 0.85f;
            this.f9826u = -1;
        }
    }

    private void a(yg ygVar, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        a(ygVar.a() >= 12);
        int C = ygVar.C();
        int C2 = ygVar.C();
        ygVar.g(2);
        int w10 = ygVar.w();
        ygVar.g(1);
        int j10 = ygVar.j();
        if (C2 > spannableStringBuilder.length()) {
            kc.d("Tx3gDecoder", "Truncating styl end (" + C2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i10 = spannableStringBuilder.length();
        } else {
            i10 = C2;
        }
        if (C >= i10) {
            kc.d("Tx3gDecoder", "Ignoring styl with start (" + C + ") >= end (" + i10 + ").");
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i11 = C;
        int i12 = i10;
        b(spannableStringBuilder2, w10, this.f9822q, i11, i12, 0);
        a(spannableStringBuilder2, j10, this.f9823r, i11, i12, 0);
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = true;
            boolean z11 = (i10 & 1) != 0;
            boolean z12 = (i10 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z10 && !z11 && !z12) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    private static void a(boolean z10) {
        if (!z10) {
            throw new ml("Unexpected subtitle format.");
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    /* access modifiers changed from: protected */
    public kl a(byte[] bArr, int i10, boolean z10) {
        this.f9820o.a(bArr, i10);
        String a10 = a(this.f9820o);
        if (a10.isEmpty()) {
            return np.f10012b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a10);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        b(spannableStringBuilder2, this.f9822q, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder2, this.f9823r, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f9824s, 0, spannableStringBuilder.length());
        float f10 = this.f9825t;
        while (this.f9820o.a() >= 8) {
            int d10 = this.f9820o.d();
            int j10 = this.f9820o.j();
            int j11 = this.f9820o.j();
            boolean z11 = true;
            if (j11 == 1937013100) {
                if (this.f9820o.a() < 2) {
                    z11 = false;
                }
                a(z11);
                int C = this.f9820o.C();
                for (int i11 = 0; i11 < C; i11++) {
                    a(this.f9820o, spannableStringBuilder);
                }
            } else if (j11 == 1952608120 && this.f9821p) {
                if (this.f9820o.a() < 2) {
                    z11 = false;
                }
                a(z11);
                f10 = yp.a(((float) this.f9820o.C()) / ((float) this.f9826u), 0.0f, 0.95f);
            }
            this.f9820o.f(d10 + j10);
        }
        return new np(new z4.b().a((CharSequence) spannableStringBuilder).a(f10, 0).a(0).a());
    }

    private static String a(yg ygVar) {
        char f10;
        a(ygVar.a() >= 2);
        int C = ygVar.C();
        if (C == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (ygVar.a() < 2 || ((f10 = ygVar.f()) != 65279 && f10 != 65534)) {
            return ygVar.a(C, Charsets.UTF_8);
        }
        return ygVar.a(C, Charsets.UTF_16);
    }
}
