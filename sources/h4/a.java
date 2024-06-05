package h4;

import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Collections;
import k4.a0;
import k4.n0;
import y3.b;
import y3.g;
import y3.h;
import y3.j;

/* compiled from: Mp4WebvttDecoder */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f18744o = new a0();

    public a() {
        super("Mp4WebvttDecoder");
    }

    private static b B(a0 a0Var, int i10) throws j {
        CharSequence charSequence = null;
        b.C0250b bVar = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int p10 = a0Var.p();
                int p11 = a0Var.p();
                int i11 = p10 - 8;
                String E = n0.E(a0Var.e(), a0Var.f(), i11);
                a0Var.U(i11);
                i10 = (i10 - 8) - i11;
                if (p11 == 1937011815) {
                    bVar = f.o(E);
                } else if (p11 == 1885436268) {
                    charSequence = f.q((String) null, E.trim(), Collections.emptyList());
                }
            } else {
                throw new j("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = MaxReward.DEFAULT_LABEL;
        }
        if (bVar != null) {
            return bVar.o(charSequence).a();
        }
        return f.l(charSequence);
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) throws j {
        this.f18744o.R(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f18744o.a() > 0) {
            if (this.f18744o.a() >= 8) {
                int p10 = this.f18744o.p();
                if (this.f18744o.p() == 1987343459) {
                    arrayList.add(B(this.f18744o, p10 - 8));
                } else {
                    this.f18744o.U(p10 - 8);
                }
            } else {
                throw new j("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new b(arrayList);
    }
}
