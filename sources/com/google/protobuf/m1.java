package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: RopeByteString */
final class m1 extends i {

    /* renamed from: k  reason: collision with root package name */
    static final int[] f27144k = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, a.e.API_PRIORITY_OTHER};

    /* renamed from: f  reason: collision with root package name */
    private final int f27145f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final i f27146g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final i f27147h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27148i;

    /* renamed from: j  reason: collision with root package name */
    private final int f27149j;

    /* compiled from: RopeByteString */
    class a extends i.c {

        /* renamed from: a  reason: collision with root package name */
        final c f27150a;

        /* renamed from: b  reason: collision with root package name */
        i.g f27151b = b();

        a() {
            this.f27150a = new c(m1.this, (a) null);
        }

        private i.g b() {
            if (this.f27150a.hasNext()) {
                return this.f27150a.next().iterator();
            }
            return null;
        }

        public boolean hasNext() {
            return this.f27151b != null;
        }

        public byte i() {
            i.g gVar = this.f27151b;
            if (gVar != null) {
                byte i10 = gVar.i();
                if (!this.f27151b.hasNext()) {
                    this.f27151b = b();
                }
                return i10;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: RopeByteString */
    private static final class c implements Iterator<i.C0284i> {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<m1> f27154a;

        /* renamed from: b  reason: collision with root package name */
        private i.C0284i f27155b;

        /* synthetic */ c(i iVar, a aVar) {
            this(iVar);
        }

        private i.C0284i a(i iVar) {
            while (iVar instanceof m1) {
                m1 m1Var = (m1) iVar;
                this.f27154a.push(m1Var);
                iVar = m1Var.f27146g;
            }
            return (i.C0284i) iVar;
        }

        private i.C0284i b() {
            i.C0284i a10;
            do {
                ArrayDeque<m1> arrayDeque = this.f27154a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a10 = a(this.f27154a.pop().f27147h);
            } while (a10.isEmpty());
            return a10;
        }

        /* renamed from: c */
        public i.C0284i next() {
            i.C0284i iVar = this.f27155b;
            if (iVar != null) {
                this.f27155b = b();
                return iVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f27155b != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(i iVar) {
            if (iVar instanceof m1) {
                m1 m1Var = (m1) iVar;
                ArrayDeque<m1> arrayDeque = new ArrayDeque<>(m1Var.x());
                this.f27154a = arrayDeque;
                arrayDeque.push(m1Var);
                this.f27155b = a(m1Var.f27146g);
                return;
            }
            this.f27154a = null;
            this.f27155b = (i.C0284i) iVar;
        }
    }

    /* synthetic */ m1(i iVar, i iVar2, a aVar) {
        this(iVar, iVar2);
    }

    static i W(i iVar, i iVar2) {
        if (iVar2.size() == 0) {
            return iVar;
        }
        if (iVar.size() == 0) {
            return iVar2;
        }
        int size = iVar.size() + iVar2.size();
        if (size < 128) {
            return X(iVar, iVar2);
        }
        if (iVar instanceof m1) {
            m1 m1Var = (m1) iVar;
            if (m1Var.f27147h.size() + iVar2.size() < 128) {
                return new m1(m1Var.f27146g, X(m1Var.f27147h, iVar2));
            } else if (m1Var.f27146g.x() > m1Var.f27147h.x() && m1Var.x() > iVar2.x()) {
                return new m1(m1Var.f27146g, new m1(m1Var.f27147h, iVar2));
            }
        }
        if (size >= Z(Math.max(iVar.x(), iVar2.x()) + 1)) {
            return new m1(iVar, iVar2);
        }
        return new b((a) null).b(iVar, iVar2);
    }

    private static i X(i iVar, i iVar2) {
        int size = iVar.size();
        int size2 = iVar2.size();
        byte[] bArr = new byte[(size + size2)];
        iVar.u(bArr, 0, 0, size);
        iVar2.u(bArr, 0, size, size2);
        return i.Q(bArr);
    }

    private boolean Y(i iVar) {
        boolean z10;
        c cVar = new c(this, (a) null);
        i.C0284i iVar2 = (i.C0284i) cVar.next();
        c cVar2 = new c(iVar, (a) null);
        i.C0284i iVar3 = (i.C0284i) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = iVar2.size() - i10;
            int size2 = iVar3.size() - i11;
            int min = Math.min(size, size2);
            if (i10 == 0) {
                z10 = iVar2.T(iVar3, i11, min);
            } else {
                z10 = iVar3.T(iVar2, i10, min);
            }
            if (!z10) {
                return false;
            }
            i12 += min;
            int i13 = this.f27145f;
            if (i12 < i13) {
                if (min == size) {
                    iVar2 = (i.C0284i) cVar.next();
                    i10 = 0;
                } else {
                    i10 += min;
                }
                if (min == size2) {
                    iVar3 = (i.C0284i) cVar2.next();
                    i11 = 0;
                } else {
                    i11 += min;
                }
            } else if (i12 == i13) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    static int Z(int i10) {
        int[] iArr = f27144k;
        if (i10 >= iArr.length) {
            return a.e.API_PRIORITY_OTHER;
        }
        return iArr[i10];
    }

    public boolean A() {
        int F = this.f27146g.F(0, 0, this.f27148i);
        i iVar = this.f27147h;
        if (iVar.F(F, 0, iVar.size()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public i.g iterator() {
        return new a();
    }

    public j D() {
        return j.h(V(), true);
    }

    /* access modifiers changed from: protected */
    public int E(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f27148i;
        if (i13 <= i14) {
            return this.f27146g.E(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f27147h.E(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f27147h.E(this.f27146g.E(i10, i11, i15), 0, i12 - i15);
    }

    /* access modifiers changed from: protected */
    public int F(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f27148i;
        if (i13 <= i14) {
            return this.f27146g.F(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f27147h.F(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f27147h.F(this.f27146g.F(i10, i11, i15), 0, i12 - i15);
    }

    public i I(int i10, int i11) {
        int h10 = i.h(i10, i11, this.f27145f);
        if (h10 == 0) {
            return i.f27039b;
        }
        if (h10 == this.f27145f) {
            return this;
        }
        int i12 = this.f27148i;
        if (i11 <= i12) {
            return this.f27146g.I(i10, i11);
        }
        if (i10 >= i12) {
            return this.f27147h.I(i10 - i12, i11 - i12);
        }
        return new m1(this.f27146g.H(i10), this.f27147h.I(0, i11 - this.f27148i));
    }

    /* access modifiers changed from: protected */
    public String M(Charset charset) {
        return new String(J(), charset);
    }

    /* access modifiers changed from: package-private */
    public void S(h hVar) throws IOException {
        this.f27146g.S(hVar);
        this.f27147h.S(hVar);
    }

    public List<ByteBuffer> V() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, (a) null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().c());
        }
        return arrayList;
    }

    public ByteBuffer c() {
        return ByteBuffer.wrap(J()).asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f27145f != iVar.size()) {
            return false;
        }
        if (this.f27145f == 0) {
            return true;
        }
        int G = G();
        int G2 = iVar.G();
        if (G == 0 || G2 == 0 || G == G2) {
            return Y(iVar);
        }
        return false;
    }

    public byte f(int i10) {
        i.g(i10, this.f27145f);
        return y(i10);
    }

    public int size() {
        return this.f27145f;
    }

    /* access modifiers changed from: protected */
    public void v(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f27148i;
        if (i13 <= i14) {
            this.f27146g.v(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.f27147h.v(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.f27146g.v(bArr, i10, i11, i15);
            this.f27147h.v(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    /* access modifiers changed from: protected */
    public int x() {
        return this.f27149j;
    }

    /* access modifiers changed from: package-private */
    public byte y(int i10) {
        int i11 = this.f27148i;
        if (i10 < i11) {
            return this.f27146g.y(i10);
        }
        return this.f27147h.y(i10 - i11);
    }

    /* access modifiers changed from: protected */
    public boolean z() {
        return this.f27145f >= Z(this.f27149j);
    }

    /* compiled from: RopeByteString */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<i> f27153a;

        private b() {
            this.f27153a = new ArrayDeque<>();
        }

        /* access modifiers changed from: private */
        public i b(i iVar, i iVar2) {
            c(iVar);
            c(iVar2);
            i pop = this.f27153a.pop();
            while (!this.f27153a.isEmpty()) {
                pop = new m1(this.f27153a.pop(), pop, (a) null);
            }
            return pop;
        }

        private void c(i iVar) {
            if (iVar.z()) {
                e(iVar);
            } else if (iVar instanceof m1) {
                m1 m1Var = (m1) iVar;
                c(m1Var.f27146g);
                c(m1Var.f27147h);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + iVar.getClass());
            }
        }

        private int d(int i10) {
            int binarySearch = Arrays.binarySearch(m1.f27144k, i10);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(i iVar) {
            int d10 = d(iVar.size());
            int Z = m1.Z(d10 + 1);
            if (this.f27153a.isEmpty() || this.f27153a.peek().size() >= Z) {
                this.f27153a.push(iVar);
                return;
            }
            int Z2 = m1.Z(d10);
            i pop = this.f27153a.pop();
            while (!this.f27153a.isEmpty() && this.f27153a.peek().size() < Z2) {
                pop = new m1(this.f27153a.pop(), pop, (a) null);
            }
            m1 m1Var = new m1(pop, iVar, (a) null);
            while (!this.f27153a.isEmpty() && this.f27153a.peek().size() < m1.Z(d(m1Var.size()) + 1)) {
                m1Var = new m1(this.f27153a.pop(), m1Var, (a) null);
            }
            this.f27153a.push(m1Var);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private m1(i iVar, i iVar2) {
        this.f27146g = iVar;
        this.f27147h = iVar2;
        int size = iVar.size();
        this.f27148i = size;
        this.f27145f = size + iVar2.size();
        this.f27149j = Math.max(iVar.x(), iVar2.x()) + 1;
    }
}
