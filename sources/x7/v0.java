package x7;

import com.google.protobuf.i;
import g7.e;
import java.util.HashMap;
import java.util.Map;
import r7.m;
import u7.l;
import y7.b;

/* compiled from: TargetState */
final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private int f31149a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Map<l, m.a> f31150b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f31151c = true;

    /* renamed from: d  reason: collision with root package name */
    private i f31152d = i.f27039b;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31153e = false;

    /* compiled from: TargetState */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31154a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                r7.m$a[] r0 = r7.m.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31154a = r0
                r7.m$a r1 = r7.m.a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31154a     // Catch:{ NoSuchFieldError -> 0x001d }
                r7.m$a r1 = r7.m.a.MODIFIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31154a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r7.m$a r1 = r7.m.a.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.v0.a.<clinit>():void");
        }
    }

    v0() {
    }

    /* access modifiers changed from: package-private */
    public void a(l lVar, m.a aVar) {
        this.f31151c = true;
        this.f31150b.put(lVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f31151c = false;
        this.f31150b.clear();
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f31151c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f31153e;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f31149a != 0;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f31151c = true;
        this.f31153e = true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f31149a++;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f31149a--;
    }

    /* access modifiers changed from: package-private */
    public void i(l lVar) {
        this.f31151c = true;
        this.f31150b.remove(lVar);
    }

    /* access modifiers changed from: package-private */
    public u0 j() {
        e<l> e10 = l.e();
        e<l> e11 = l.e();
        e<l> e12 = l.e();
        e<l> eVar = e10;
        e<l> eVar2 = e11;
        e<l> eVar3 = e12;
        for (Map.Entry next : this.f31150b.entrySet()) {
            l lVar = (l) next.getKey();
            m.a aVar = (m.a) next.getValue();
            int i10 = a.f31154a[aVar.ordinal()];
            if (i10 == 1) {
                eVar = eVar.e(lVar);
            } else if (i10 == 2) {
                eVar2 = eVar2.e(lVar);
            } else if (i10 == 3) {
                eVar3 = eVar3.e(lVar);
            } else {
                throw b.a("Encountered invalid change type: %s", aVar);
            }
        }
        return new u0(this.f31152d, this.f31153e, eVar, eVar2, eVar3);
    }

    /* access modifiers changed from: package-private */
    public void k(i iVar) {
        if (!iVar.isEmpty()) {
            this.f31151c = true;
            this.f31152d = iVar;
        }
    }
}
