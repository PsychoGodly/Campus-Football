package j1;

import java.util.Objects;

/* compiled from: WebMessageCompat */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f19211a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19212b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f19213c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19214d;

    public l(String str, m[] mVarArr) {
        this.f19212b = str;
        this.f19213c = null;
        this.f19211a = mVarArr;
        this.f19214d = 0;
    }

    private void a(int i10) {
        if (i10 != this.f19214d) {
            throw new IllegalStateException("Wrong data accessor type detected. " + f(this.f19214d) + " expected, but got " + f(i10));
        }
    }

    private String f(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public byte[] b() {
        a(1);
        Objects.requireNonNull(this.f19213c);
        return this.f19213c;
    }

    public String c() {
        a(0);
        return this.f19212b;
    }

    public m[] d() {
        return this.f19211a;
    }

    public int e() {
        return this.f19214d;
    }

    public l(byte[] bArr, m[] mVarArr) {
        Objects.requireNonNull(bArr);
        this.f19213c = bArr;
        this.f19212b = null;
        this.f19211a = mVarArr;
        this.f19214d = 1;
    }
}
