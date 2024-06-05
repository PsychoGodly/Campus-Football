package e3;

import java.util.NoSuchElementException;

/* compiled from: IntArrayQueue */
final class k {

    /* renamed from: a  reason: collision with root package name */
    private int f17840a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f17841b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f17842c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f17843d;

    /* renamed from: e  reason: collision with root package name */
    private int f17844e;

    public k() {
        int[] iArr = new int[16];
        this.f17843d = iArr;
        this.f17844e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f17843d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i10 = this.f17840a;
            int i11 = length2 - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f17843d, 0, iArr2, i11, i10);
            this.f17840a = 0;
            this.f17841b = this.f17842c - 1;
            this.f17843d = iArr2;
            this.f17844e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i10) {
        if (this.f17842c == this.f17843d.length) {
            c();
        }
        int i11 = (this.f17841b + 1) & this.f17844e;
        this.f17841b = i11;
        this.f17843d[i11] = i10;
        this.f17842c++;
    }

    public void b() {
        this.f17840a = 0;
        this.f17841b = -1;
        this.f17842c = 0;
    }

    public boolean d() {
        return this.f17842c == 0;
    }

    public int e() {
        int i10 = this.f17842c;
        if (i10 != 0) {
            int[] iArr = this.f17843d;
            int i11 = this.f17840a;
            int i12 = iArr[i11];
            this.f17840a = (i11 + 1) & this.f17844e;
            this.f17842c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
