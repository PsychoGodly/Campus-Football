package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList */
final class j1<E> extends c<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final j1<Object> f27111d;

    /* renamed from: b  reason: collision with root package name */
    private E[] f27112b;

    /* renamed from: c  reason: collision with root package name */
    private int f27113c;

    static {
        j1<Object> j1Var = new j1<>(new Object[0], 0);
        f27111d = j1Var;
        j1Var.i();
    }

    private j1(E[] eArr, int i10) {
        this.f27112b = eArr;
        this.f27113c = i10;
    }

    private static <E> E[] c(int i10) {
        return new Object[i10];
    }

    public static <E> j1<E> e() {
        return f27111d;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f27113c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f27113c;
    }

    public boolean add(E e10) {
        b();
        int i10 = this.f27113c;
        E[] eArr = this.f27112b;
        if (i10 == eArr.length) {
            this.f27112b = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f27112b;
        int i11 = this.f27113c;
        this.f27113c = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public E get(int i10) {
        f(i10);
        return this.f27112b[i10];
    }

    /* renamed from: h */
    public j1<E> d(int i10) {
        if (i10 >= this.f27113c) {
            return new j1<>(Arrays.copyOf(this.f27112b, i10), this.f27113c);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i10) {
        b();
        f(i10);
        E[] eArr = this.f27112b;
        E e10 = eArr[i10];
        int i11 = this.f27113c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f27113c--;
        this.modCount++;
        return e10;
    }

    public E set(int i10, E e10) {
        b();
        f(i10);
        E[] eArr = this.f27112b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public int size() {
        return this.f27113c;
    }

    public void add(int i10, E e10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f27113c)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        E[] eArr = this.f27112b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] c10 = c(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f27112b, 0, c10, 0, i10);
            System.arraycopy(this.f27112b, i10, c10, i10 + 1, this.f27113c - i10);
            this.f27112b = c10;
        }
        this.f27112b[i10] = e10;
        this.f27113c++;
        this.modCount++;
    }
}
