package j0;

import java.nio.ByteBuffer;

/* compiled from: Table */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f19188a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f19189b;

    /* renamed from: c  reason: collision with root package name */
    private int f19190c;

    /* renamed from: d  reason: collision with root package name */
    private int f19191d;

    /* renamed from: e  reason: collision with root package name */
    d f19192e = d.a();

    /* access modifiers changed from: protected */
    public int a(int i10) {
        return i10 + this.f19189b.getInt(i10);
    }

    /* access modifiers changed from: protected */
    public int b(int i10) {
        if (i10 < this.f19191d) {
            return this.f19189b.getShort(this.f19190c + i10);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void c(int i10, ByteBuffer byteBuffer) {
        this.f19189b = byteBuffer;
        if (byteBuffer != null) {
            this.f19188a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f19190c = i11;
            this.f19191d = this.f19189b.getShort(i11);
            return;
        }
        this.f19188a = 0;
        this.f19190c = 0;
        this.f19191d = 0;
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        int i11 = i10 + this.f19188a;
        return i11 + this.f19189b.getInt(i11) + 4;
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
        int i11 = i10 + this.f19188a;
        return this.f19189b.getInt(i11 + this.f19189b.getInt(i11));
    }
}
