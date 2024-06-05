package e9;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import v8.j;
import v8.p;
import z8.g;
import z8.i;

/* compiled from: Detector */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final z8.b f28827a;

    /* renamed from: b  reason: collision with root package name */
    private final a9.b f28828b;

    /* compiled from: Detector */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final p f28829a;

        /* renamed from: b  reason: collision with root package name */
        private final p f28830b;

        /* renamed from: c  reason: collision with root package name */
        private final int f28831c;

        /* access modifiers changed from: package-private */
        public p a() {
            return this.f28829a;
        }

        /* access modifiers changed from: package-private */
        public p b() {
            return this.f28830b;
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.f28831c;
        }

        public String toString() {
            return this.f28829a + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + this.f28830b + '/' + this.f28831c;
        }

        private b(p pVar, p pVar2, int i10) {
            this.f28829a = pVar;
            this.f28830b = pVar2;
            this.f28831c = i10;
        }
    }

    /* compiled from: Detector */
    private static final class c implements Serializable, Comparator<b> {
        private c() {
        }

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public a(z8.b bVar) throws j {
        this.f28827a = bVar;
        this.f28828b = new a9.b(bVar);
    }

    private p a(p pVar, p pVar2, p pVar3, p pVar4, int i10) {
        float f10 = (float) i10;
        float d10 = ((float) d(pVar, pVar2)) / f10;
        float d11 = (float) d(pVar3, pVar4);
        p pVar5 = new p(pVar4.c() + (((pVar4.c() - pVar3.c()) / d11) * d10), pVar4.d() + (d10 * ((pVar4.d() - pVar3.d()) / d11)));
        float d12 = ((float) d(pVar, pVar3)) / f10;
        float d13 = (float) d(pVar2, pVar4);
        p pVar6 = new p(pVar4.c() + (((pVar4.c() - pVar2.c()) / d13) * d12), pVar4.d() + (d12 * ((pVar4.d() - pVar2.d()) / d13)));
        if (f(pVar5)) {
            return (f(pVar6) && Math.abs(h(pVar3, pVar5).c() - h(pVar2, pVar5).c()) > Math.abs(h(pVar3, pVar6).c() - h(pVar2, pVar6).c())) ? pVar6 : pVar5;
        }
        if (f(pVar6)) {
            return pVar6;
        }
        return null;
    }

    private p b(p pVar, p pVar2, p pVar3, p pVar4, int i10, int i11) {
        float d10 = ((float) d(pVar, pVar2)) / ((float) i10);
        float d11 = (float) d(pVar3, pVar4);
        p pVar5 = new p(pVar4.c() + (((pVar4.c() - pVar3.c()) / d11) * d10), pVar4.d() + (d10 * ((pVar4.d() - pVar3.d()) / d11)));
        float d12 = ((float) d(pVar, pVar3)) / ((float) i11);
        float d13 = (float) d(pVar2, pVar4);
        p pVar6 = new p(pVar4.c() + (((pVar4.c() - pVar2.c()) / d13) * d12), pVar4.d() + (d12 * ((pVar4.d() - pVar2.d()) / d13)));
        if (f(pVar5)) {
            return (f(pVar6) && Math.abs(i10 - h(pVar3, pVar5).c()) + Math.abs(i11 - h(pVar2, pVar5).c()) > Math.abs(i10 - h(pVar3, pVar6).c()) + Math.abs(i11 - h(pVar2, pVar6).c())) ? pVar6 : pVar5;
        }
        if (f(pVar6)) {
            return pVar6;
        }
        return null;
    }

    private static int d(p pVar, p pVar2) {
        return a9.a.c(p.b(pVar, pVar2));
    }

    private static void e(Map<p, Integer> map, p pVar) {
        Integer num = map.get(pVar);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        map.put(pVar, Integer.valueOf(i10));
    }

    private boolean f(p pVar) {
        return pVar.c() >= 0.0f && pVar.c() < ((float) this.f28827a.k()) && pVar.d() > 0.0f && pVar.d() < ((float) this.f28827a.g());
    }

    private static z8.b g(z8.b bVar, p pVar, p pVar2, p pVar3, p pVar4, int i10, int i11) throws j {
        float f10 = ((float) i10) - 0.5f;
        float f11 = ((float) i11) - 0.5f;
        return i.b().c(bVar, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, pVar.c(), pVar.d(), pVar4.c(), pVar4.d(), pVar3.c(), pVar3.d(), pVar2.c(), pVar2.d());
    }

    private b h(p pVar, p pVar2) {
        int c10 = (int) pVar.c();
        int d10 = (int) pVar.d();
        int c11 = (int) pVar2.c();
        int d11 = (int) pVar2.d();
        int i10 = 0;
        int i11 = 1;
        boolean z10 = Math.abs(d11 - d10) > Math.abs(c11 - c10);
        if (z10) {
            int i12 = d10;
            d10 = c10;
            c10 = i12;
            int i13 = d11;
            d11 = c11;
            c11 = i13;
        }
        int abs = Math.abs(c11 - c10);
        int abs2 = Math.abs(d11 - d10);
        int i14 = (-abs) / 2;
        int i15 = d10 < d11 ? 1 : -1;
        if (c10 >= c11) {
            i11 = -1;
        }
        boolean d12 = this.f28827a.d(z10 ? d10 : c10, z10 ? c10 : d10);
        while (c10 != c11) {
            boolean d13 = this.f28827a.d(z10 ? d10 : c10, z10 ? c10 : d10);
            if (d13 != d12) {
                i10++;
                d12 = d13;
            }
            i14 += abs2;
            if (i14 > 0) {
                if (d10 == d11) {
                    break;
                }
                d10 += i15;
                i14 -= abs;
            }
            c10 += i11;
        }
        return new b(pVar, pVar2, i10);
    }

    public g c() throws j {
        p pVar;
        p pVar2;
        z8.b bVar;
        p[] c10 = this.f28828b.c();
        p pVar3 = c10[0];
        p pVar4 = c10[1];
        p pVar5 = c10[2];
        p pVar6 = c10[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(h(pVar3, pVar4));
        arrayList.add(h(pVar3, pVar5));
        arrayList.add(h(pVar4, pVar6));
        arrayList.add(h(pVar5, pVar6));
        p pVar7 = null;
        Collections.sort(arrayList, new c());
        b bVar2 = (b) arrayList.get(0);
        b bVar3 = (b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        e(hashMap, bVar2.a());
        e(hashMap, bVar2.b());
        e(hashMap, bVar3.a());
        e(hashMap, bVar3.b());
        p pVar8 = null;
        p pVar9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            p pVar10 = (p) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                pVar8 = pVar10;
            } else if (pVar7 == null) {
                pVar7 = pVar10;
            } else {
                pVar9 = pVar10;
            }
        }
        if (pVar7 == null || pVar8 == null || pVar9 == null) {
            throw j.a();
        }
        p[] pVarArr = {pVar7, pVar8, pVar9};
        p.e(pVarArr);
        p pVar11 = pVarArr[0];
        p pVar12 = pVarArr[1];
        p pVar13 = pVarArr[2];
        if (!hashMap.containsKey(pVar3)) {
            pVar = pVar3;
        } else if (!hashMap.containsKey(pVar4)) {
            pVar = pVar4;
        } else {
            pVar = !hashMap.containsKey(pVar5) ? pVar5 : pVar6;
        }
        int c11 = h(pVar13, pVar).c();
        int c12 = h(pVar11, pVar).c();
        if ((c11 & 1) == 1) {
            c11++;
        }
        int i10 = c11 + 2;
        if ((c12 & 1) == 1) {
            c12++;
        }
        int i11 = c12 + 2;
        if (i10 * 4 >= i11 * 7 || i11 * 4 >= i10 * 7) {
            pVar2 = pVar13;
            p b10 = b(pVar12, pVar11, pVar13, pVar, i10, i11);
            if (b10 != null) {
                pVar = b10;
            }
            int c13 = h(pVar2, pVar).c();
            int c14 = h(pVar11, pVar).c();
            if ((c13 & 1) == 1) {
                c13++;
            }
            int i12 = c13;
            if ((c14 & 1) == 1) {
                c14++;
            }
            bVar = g(this.f28827a, pVar2, pVar12, pVar11, pVar, i12, c14);
        } else {
            p a10 = a(pVar12, pVar11, pVar13, pVar, Math.min(i11, i10));
            if (a10 != null) {
                pVar = a10;
            }
            int max = Math.max(h(pVar13, pVar).c(), h(pVar11, pVar).c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i13 = max;
            bVar = g(this.f28827a, pVar13, pVar12, pVar11, pVar, i13, i13);
            pVar2 = pVar13;
        }
        return new g(bVar, new p[]{pVar2, pVar12, pVar11, pVar});
    }
}
