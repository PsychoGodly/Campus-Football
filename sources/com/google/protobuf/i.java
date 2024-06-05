package com.google.protobuf;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: ByteString */
public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final i f27039b = new j(d0.f26988d);

    /* renamed from: c  reason: collision with root package name */
    private static final f f27040c = (d.c() ? new k((a) null) : new d((a) null));

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator<i> f27041d = new b();

    /* renamed from: a  reason: collision with root package name */
    private int f27042a = 0;

    /* compiled from: ByteString */
    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private int f27043a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f27044b;

        a() {
            this.f27044b = i.this.size();
        }

        public boolean hasNext() {
            return this.f27043a < this.f27044b;
        }

        public byte i() {
            int i10 = this.f27043a;
            if (i10 < this.f27044b) {
                this.f27043a = i10 + 1;
                return i.this.y(i10);
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: ByteString */
    class b implements Comparator<i> {
        b() {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            g B = iVar.iterator();
            g B2 = iVar2.iterator();
            while (B.hasNext() && B2.hasNext()) {
                int compareTo = Integer.valueOf(i.K(B.i())).compareTo(Integer.valueOf(i.K(B2.i())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(iVar.size()).compareTo(Integer.valueOf(iVar2.size()));
        }
    }

    /* compiled from: ByteString */
    static abstract class c implements g {
        c() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(i());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString */
    private static final class d implements f {
        private d() {
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString */
    private static final class e extends j {

        /* renamed from: g  reason: collision with root package name */
        private final int f27046g;

        /* renamed from: h  reason: collision with root package name */
        private final int f27047h;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            i.h(i10, i10 + i11, bArr.length);
            this.f27046g = i10;
            this.f27047h = i11;
        }

        /* access modifiers changed from: protected */
        public int U() {
            return this.f27046g;
        }

        public byte f(int i10) {
            i.g(i10, size());
            return this.f27050f[this.f27046g + i10];
        }

        public int size() {
            return this.f27047h;
        }

        /* access modifiers changed from: protected */
        public void v(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f27050f, U() + i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte y(int i10) {
            return this.f27050f[this.f27046g + i10];
        }
    }

    /* compiled from: ByteString */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* compiled from: ByteString */
    public interface g extends Iterator<Byte> {
        byte i();
    }

    /* compiled from: ByteString */
    static final class h {

        /* renamed from: a  reason: collision with root package name */
        private final l f27048a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f27049b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public i a() {
            this.f27048a.d();
            return new j(this.f27049b);
        }

        public l b() {
            return this.f27048a;
        }

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f27049b = bArr;
            this.f27048a = l.g0(bArr);
        }
    }

    /* renamed from: com.google.protobuf.i$i  reason: collision with other inner class name */
    /* compiled from: ByteString */
    static abstract class C0284i extends i {
        C0284i() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean T(i iVar, int i10, int i11);

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return i.super.iterator();
        }

        /* access modifiers changed from: protected */
        public final int x() {
            return 0;
        }

        /* access modifiers changed from: protected */
        public final boolean z() {
            return true;
        }
    }

    /* compiled from: ByteString */
    private static class j extends C0284i {

        /* renamed from: f  reason: collision with root package name */
        protected final byte[] f27050f;

        j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f27050f = bArr;
        }

        public final boolean A() {
            int U = U();
            return a2.t(this.f27050f, U, size() + U);
        }

        public final j D() {
            return j.l(this.f27050f, U(), size(), true);
        }

        /* access modifiers changed from: protected */
        public final int E(int i10, int i11, int i12) {
            return d0.i(i10, this.f27050f, U() + i11, i12);
        }

        /* access modifiers changed from: protected */
        public final int F(int i10, int i11, int i12) {
            int U = U() + i11;
            return a2.v(i10, this.f27050f, U, i12 + U);
        }

        public final i I(int i10, int i11) {
            int h10 = i.h(i10, i11, size());
            if (h10 == 0) {
                return i.f27039b;
            }
            return new e(this.f27050f, U() + i10, h10);
        }

        /* access modifiers changed from: protected */
        public final String M(Charset charset) {
            return new String(this.f27050f, U(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final void S(h hVar) throws IOException {
            hVar.b(this.f27050f, U(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean T(i iVar, int i10, int i11) {
            if (i11 <= iVar.size()) {
                int i12 = i10 + i11;
                if (i12 > iVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + iVar.size());
                } else if (!(iVar instanceof j)) {
                    return iVar.I(i10, i12).equals(I(0, i11));
                } else {
                    j jVar = (j) iVar;
                    byte[] bArr = this.f27050f;
                    byte[] bArr2 = jVar.f27050f;
                    int U = U() + i11;
                    int U2 = U();
                    int U3 = jVar.U() + i10;
                    while (U2 < U) {
                        if (bArr[U2] != bArr2[U3]) {
                            return false;
                        }
                        U2++;
                        U3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int U() {
            return 0;
        }

        public final ByteBuffer c() {
            return ByteBuffer.wrap(this.f27050f, U(), size()).asReadOnlyBuffer();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int G = G();
            int G2 = jVar.G();
            if (G == 0 || G2 == 0 || G == G2) {
                return T(jVar, 0, size());
            }
            return false;
        }

        public byte f(int i10) {
            return this.f27050f[i10];
        }

        public int size() {
            return this.f27050f.length;
        }

        /* access modifiers changed from: protected */
        public void v(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f27050f, i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte y(int i10) {
            return this.f27050f[i10];
        }
    }

    /* compiled from: ByteString */
    private static final class k implements f {
        private k() {
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    i() {
    }

    static h C(int i10) {
        return new h(i10, (a) null);
    }

    /* access modifiers changed from: private */
    public static int K(byte b10) {
        return b10 & 255;
    }

    private String O() {
        if (size() <= 50) {
            return s1.a(this);
        }
        return s1.a(I(0, 47)) + "...";
    }

    static i P(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new d1(byteBuffer);
        }
        return R(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    static i Q(byte[] bArr) {
        return new j(bArr);
    }

    static i R(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    private static i e(Iterator<i> it, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i10)}));
        } else if (i10 == 1) {
            return it.next();
        } else {
            int i11 = i10 >>> 1;
            return e(it, i11).m(e(it, i10 - i11));
        }
    }

    static void g(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    static int h(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static i n(Iterable<i> iterable) {
        int i10;
        if (!(iterable instanceof Collection)) {
            i10 = 0;
            Iterator<i> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i10++;
            }
        } else {
            i10 = ((Collection) iterable).size();
        }
        if (i10 == 0) {
            return f27039b;
        }
        return e(iterable.iterator(), i10);
    }

    public static i o(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static i p(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new j(f27040c.a(bArr, i10, i11));
    }

    public static i q(String str) {
        return new j(str.getBytes(d0.f26986b));
    }

    public static final i w() {
        return f27039b;
    }

    public abstract boolean A();

    /* renamed from: B */
    public g iterator() {
        return new a();
    }

    public abstract j D();

    /* access modifiers changed from: protected */
    public abstract int E(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int F(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public final int G() {
        return this.f27042a;
    }

    public final i H(int i10) {
        return I(i10, size());
    }

    public abstract i I(int i10, int i11);

    public final byte[] J() {
        int size = size();
        if (size == 0) {
            return d0.f26988d;
        }
        byte[] bArr = new byte[size];
        v(bArr, 0, 0, size);
        return bArr;
    }

    public final String L(Charset charset) {
        return size() == 0 ? MaxReward.DEFAULT_LABEL : M(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String M(Charset charset);

    public final String N() {
        return L(d0.f26986b);
    }

    /* access modifiers changed from: package-private */
    public abstract void S(h hVar) throws IOException;

    public abstract ByteBuffer c();

    public abstract boolean equals(Object obj);

    public abstract byte f(int i10);

    public final int hashCode() {
        int i10 = this.f27042a;
        if (i10 == 0) {
            int size = size();
            i10 = E(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f27042a = i10;
        }
        return i10;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final i m(i iVar) {
        if (a.e.API_PRIORITY_OTHER - size() >= iVar.size()) {
            return m1.W(this, iVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + iVar.size());
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), O()});
    }

    @Deprecated
    public final void u(byte[] bArr, int i10, int i11, int i12) {
        h(i10, i10 + i12, size());
        h(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            v(bArr, i10, i11, i12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void v(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int x();

    /* access modifiers changed from: package-private */
    public abstract byte y(int i10);

    /* access modifiers changed from: protected */
    public abstract boolean z();
}
