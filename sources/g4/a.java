package g4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.nio.charset.Charset;
import java.util.List;
import k4.a0;
import k4.n0;
import k4.r;
import r6.e;
import y3.b;
import y3.g;
import y3.h;
import y3.j;

/* compiled from: Tx3gDecoder */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f18097o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final boolean f18098p;

    /* renamed from: q  reason: collision with root package name */
    private final int f18099q;

    /* renamed from: r  reason: collision with root package name */
    private final int f18100r;

    /* renamed from: s  reason: collision with root package name */
    private final String f18101s;

    /* renamed from: t  reason: collision with root package name */
    private final float f18102t;

    /* renamed from: u  reason: collision with root package name */
    private final int f18103u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z10 = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f18099q = bArr[24];
            this.f18100r = ((bArr[26] & 255) << Ascii.CAN) | ((bArr[27] & 255) << Ascii.DLE) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f18101s = "Serif".equals(n0.E(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i10 = bArr[25] * Ascii.DC4;
            this.f18103u = i10;
            z10 = (bArr[0] & 32) == 0 ? false : z10;
            this.f18098p = z10;
            if (z10) {
                this.f18102t = n0.p(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i10), 0.0f, 0.95f);
            } else {
                this.f18102t = 0.85f;
            }
        } else {
            this.f18099q = 0;
            this.f18100r = -1;
            this.f18101s = str;
            this.f18098p = false;
            this.f18102t = 0.85f;
            this.f18103u = -1;
        }
    }

    private void B(a0 a0Var, SpannableStringBuilder spannableStringBuilder) throws j {
        int i10;
        C(a0Var.a() >= 12);
        int M = a0Var.M();
        int M2 = a0Var.M();
        a0Var.U(2);
        int G = a0Var.G();
        a0Var.U(1);
        int p10 = a0Var.p();
        if (M2 > spannableStringBuilder.length()) {
            r.i("Tx3gDecoder", "Truncating styl end (" + M2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i10 = spannableStringBuilder.length();
        } else {
            i10 = M2;
        }
        if (M >= i10) {
            r.i("Tx3gDecoder", "Ignoring styl with start (" + M + ") >= end (" + i10 + ").");
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i11 = M;
        int i12 = i10;
        E(spannableStringBuilder2, G, this.f18099q, i11, i12, 0);
        D(spannableStringBuilder2, p10, this.f18100r, i11, i12, 0);
    }

    private static void C(boolean z10) throws j {
        if (!z10) {
            throw new j("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
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

    private static void F(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String G(a0 a0Var) throws j {
        C(a0Var.a() >= 2);
        int M = a0Var.M();
        if (M == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        int f10 = a0Var.f();
        Charset O = a0Var.O();
        int f11 = M - (a0Var.f() - f10);
        if (O == null) {
            O = e.f29803c;
        }
        return a0Var.E(f11, O);
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) throws j {
        this.f18097o.R(bArr, i10);
        String G = G(this.f18097o);
        if (G.isEmpty()) {
            return b.f18104b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        E(spannableStringBuilder2, this.f18099q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder2, this.f18100r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f18101s, 0, spannableStringBuilder.length());
        float f10 = this.f18102t;
        while (this.f18097o.a() >= 8) {
            int f11 = this.f18097o.f();
            int p10 = this.f18097o.p();
            int p11 = this.f18097o.p();
            boolean z11 = true;
            if (p11 == 1937013100) {
                if (this.f18097o.a() < 2) {
                    z11 = false;
                }
                C(z11);
                int M = this.f18097o.M();
                for (int i11 = 0; i11 < M; i11++) {
                    B(this.f18097o, spannableStringBuilder);
                }
            } else if (p11 == 1952608120 && this.f18098p) {
                if (this.f18097o.a() < 2) {
                    z11 = false;
                }
                C(z11);
                f10 = n0.p(((float) this.f18097o.M()) / ((float) this.f18103u), 0.0f, 0.95f);
            }
            this.f18097o.T(f11 + p10);
        }
        return new b(new b.C0250b().o(spannableStringBuilder).h(f10, 0).i(0).a());
    }
}
