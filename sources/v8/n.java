package v8;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: Result */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f30771a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f30772b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30773c;

    /* renamed from: d  reason: collision with root package name */
    private p[] f30774d;

    /* renamed from: e  reason: collision with root package name */
    private final a f30775e;

    /* renamed from: f  reason: collision with root package name */
    private Map<o, Object> f30776f;

    /* renamed from: g  reason: collision with root package name */
    private final long f30777g;

    public n(String str, byte[] bArr, p[] pVarArr, a aVar) {
        this(str, bArr, pVarArr, aVar, System.currentTimeMillis());
    }

    public void a(p[] pVarArr) {
        p[] pVarArr2 = this.f30774d;
        if (pVarArr2 == null) {
            this.f30774d = pVarArr;
        } else if (pVarArr != null && pVarArr.length > 0) {
            p[] pVarArr3 = new p[(pVarArr2.length + pVarArr.length)];
            System.arraycopy(pVarArr2, 0, pVarArr3, 0, pVarArr2.length);
            System.arraycopy(pVarArr, 0, pVarArr3, pVarArr2.length, pVarArr.length);
            this.f30774d = pVarArr3;
        }
    }

    public a b() {
        return this.f30775e;
    }

    public byte[] c() {
        return this.f30772b;
    }

    public Map<o, Object> d() {
        return this.f30776f;
    }

    public p[] e() {
        return this.f30774d;
    }

    public String f() {
        return this.f30771a;
    }

    public void g(Map<o, Object> map) {
        if (map != null) {
            Map<o, Object> map2 = this.f30776f;
            if (map2 == null) {
                this.f30776f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(o oVar, Object obj) {
        if (this.f30776f == null) {
            this.f30776f = new EnumMap(o.class);
        }
        this.f30776f.put(oVar, obj);
    }

    public String toString() {
        return this.f30771a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(String str, byte[] bArr, p[] pVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, pVarArr, aVar, j10);
    }

    public n(String str, byte[] bArr, int i10, p[] pVarArr, a aVar, long j10) {
        this.f30771a = str;
        this.f30772b = bArr;
        this.f30773c = i10;
        this.f30774d = pVarArr;
        this.f30775e = aVar;
        this.f30776f = null;
        this.f30777g = j10;
    }
}
