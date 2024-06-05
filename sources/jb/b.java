package jb;

import android.content.Context;
import bb.d;
import cb.e;
import cb.f;

/* compiled from: SignalsCollector */
public class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private hb.a f35718a;

    /* compiled from: SignalsCollector */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35719a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                bb.d[] r0 = bb.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35719a = r0
                bb.d r1 = bb.d.f31611c     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35719a     // Catch:{ NoSuchFieldError -> 0x001d }
                bb.d r1 = bb.d.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35719a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bb.d r1 = bb.d.REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jb.b.a.<clinit>():void");
        }
    }

    public b(hb.a aVar) {
        this.f35718a = aVar;
    }

    public void c(Context context, String str, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        z4.a.a(context, g(dVar), this.f35718a.a(), new a(str, new cb.d(aVar, fVar)));
    }

    public void d(Context context, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        c(context, e(dVar), dVar, aVar, fVar);
    }

    public n4.b g(d dVar) {
        int i10 = a.f35719a[dVar.ordinal()];
        if (i10 == 1) {
            return n4.b.f20900a;
        }
        if (i10 == 2) {
            return n4.b.INTERSTITIAL;
        }
        if (i10 != 3) {
            return n4.b.UNKNOWN;
        }
        return n4.b.REWARDED;
    }
}
