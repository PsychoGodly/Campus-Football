package z8;

import java.util.List;

/* compiled from: DecoderResult */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f31484a;

    /* renamed from: b  reason: collision with root package name */
    private int f31485b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31486c;

    /* renamed from: d  reason: collision with root package name */
    private final List<byte[]> f31487d;

    /* renamed from: e  reason: collision with root package name */
    private final String f31488e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f31489f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f31490g;

    /* renamed from: h  reason: collision with root package name */
    private Object f31491h;

    /* renamed from: i  reason: collision with root package name */
    private final int f31492i;

    /* renamed from: j  reason: collision with root package name */
    private final int f31493j;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.f31487d;
    }

    public String b() {
        return this.f31488e;
    }

    public int c() {
        return this.f31485b;
    }

    public Object d() {
        return this.f31491h;
    }

    public byte[] e() {
        return this.f31484a;
    }

    public int f() {
        return this.f31492i;
    }

    public int g() {
        return this.f31493j;
    }

    public String h() {
        return this.f31486c;
    }

    public boolean i() {
        return this.f31492i >= 0 && this.f31493j >= 0;
    }

    public void j(Integer num) {
        this.f31490g = num;
    }

    public void k(Integer num) {
        this.f31489f = num;
    }

    public void l(int i10) {
        this.f31485b = i10;
    }

    public void m(Object obj) {
        this.f31491h = obj;
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        int i12;
        this.f31484a = bArr;
        if (bArr == null) {
            i12 = 0;
        } else {
            i12 = bArr.length * 8;
        }
        this.f31485b = i12;
        this.f31486c = str;
        this.f31487d = list;
        this.f31488e = str2;
        this.f31492i = i11;
        this.f31493j = i10;
    }
}
