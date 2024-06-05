package j4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: SlidingPercentile */
public class n0 {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<b> f19371h = m0.f35712a;

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<b> f19372i = l0.f35711a;

    /* renamed from: a  reason: collision with root package name */
    private final int f19373a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f19374b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final b[] f19375c = new b[5];

    /* renamed from: d  reason: collision with root package name */
    private int f19376d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f19377e;

    /* renamed from: f  reason: collision with root package name */
    private int f19378f;

    /* renamed from: g  reason: collision with root package name */
    private int f19379g;

    /* compiled from: SlidingPercentile */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f19380a;

        /* renamed from: b  reason: collision with root package name */
        public int f19381b;

        /* renamed from: c  reason: collision with root package name */
        public float f19382c;

        private b() {
        }
    }

    public n0(int i10) {
        this.f19373a = i10;
    }

    private void d() {
        if (this.f19376d != 1) {
            Collections.sort(this.f19374b, f19371h);
            this.f19376d = 1;
        }
    }

    private void e() {
        if (this.f19376d != 0) {
            Collections.sort(this.f19374b, f19372i);
            this.f19376d = 0;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f19380a - bVar2.f19380a;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f19379g;
        if (i11 > 0) {
            b[] bVarArr = this.f19375c;
            int i12 = i11 - 1;
            this.f19379g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f19377e;
        this.f19377e = i13 + 1;
        bVar.f19380a = i13;
        bVar.f19381b = i10;
        bVar.f19382c = f10;
        this.f19374b.add(bVar);
        this.f19378f += i10;
        while (true) {
            int i14 = this.f19378f;
            int i15 = this.f19373a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = this.f19374b.get(0);
                int i17 = bVar2.f19381b;
                if (i17 <= i16) {
                    this.f19378f -= i17;
                    this.f19374b.remove(0);
                    int i18 = this.f19379g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f19375c;
                        this.f19379g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f19381b = i17 - i16;
                    this.f19378f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * ((float) this.f19378f);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f19374b.size(); i11++) {
            b bVar = this.f19374b.get(i11);
            i10 += bVar.f19381b;
            if (((float) i10) >= f11) {
                return bVar.f19382c;
            }
        }
        if (this.f19374b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f19374b;
        return arrayList.get(arrayList.size() - 1).f19382c;
    }

    public void i() {
        this.f19374b.clear();
        this.f19376d = -1;
        this.f19377e = 0;
        this.f19378f = 0;
    }
}
