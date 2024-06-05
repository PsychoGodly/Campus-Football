package h4;

import android.text.TextUtils;
import java.util.ArrayList;
import k4.a0;
import n2.y2;
import y3.g;
import y3.j;

/* compiled from: WebvttDecoder */
public final class h extends g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f18794o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final c f18795p = new c();

    public h() {
        super("WebvttDecoder");
    }

    private static int B(a0 a0Var) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = a0Var.f();
            String r10 = a0Var.r();
            if (r10 == null) {
                i10 = 0;
            } else if ("STYLE".equals(r10)) {
                i10 = 2;
            } else {
                i10 = r10.startsWith("NOTE") ? 1 : 3;
            }
        }
        a0Var.T(i11);
        return i10;
    }

    private static void C(a0 a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.r()));
    }

    /* access modifiers changed from: protected */
    public y3.h z(byte[] bArr, int i10, boolean z10) throws j {
        e n10;
        this.f18794o.R(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f18794o);
            do {
            } while (!TextUtils.isEmpty(this.f18794o.r()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int B = B(this.f18794o);
                if (B == 0) {
                    return new k(arrayList2);
                }
                if (B == 1) {
                    C(this.f18794o);
                } else if (B == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f18794o.r();
                        arrayList.addAll(this.f18795p.d(this.f18794o));
                    } else {
                        throw new j("A style block was found after the first cue.");
                    }
                } else if (B == 3 && (n10 = f.n(this.f18794o, arrayList)) != null) {
                    arrayList2.add(n10);
                }
            }
        } catch (y2 e10) {
            throw new j((Throwable) e10);
        }
    }
}
