package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: Internal */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f26985a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f26986b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    static final Charset f26987c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f26988d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f26989e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f26990f;

    /* compiled from: Internal */
    public interface a extends j<Boolean> {
    }

    /* compiled from: Internal */
    public interface b extends j<Double> {
    }

    /* compiled from: Internal */
    public interface c {
        int I();
    }

    /* compiled from: Internal */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* compiled from: Internal */
    public interface e {
        boolean a(int i10);
    }

    /* compiled from: Internal */
    public interface f extends j<Float> {
    }

    /* compiled from: Internal */
    public interface g extends j<Integer> {
        g d(int i10);

        void k(int i10);
    }

    /* compiled from: Internal */
    public static class h<F, T> extends AbstractList<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<F> f26991a;

        /* renamed from: b  reason: collision with root package name */
        private final a<F, T> f26992b;

        /* compiled from: Internal */
        public interface a<F, T> {
            T a(F f10);
        }

        public h(List<F> list, a<F, T> aVar) {
            this.f26991a = list;
            this.f26992b = aVar;
        }

        public T get(int i10) {
            return this.f26992b.a(this.f26991a.get(i10));
        }

        public int size() {
            return this.f26991a.size();
        }
    }

    /* compiled from: Internal */
    public interface i extends j<Long> {
    }

    /* compiled from: Internal */
    public interface j<E> extends List<E>, RandomAccess {
        j<E> d(int i10);

        void i();

        boolean t();
    }

    static {
        byte[] bArr = new byte[0];
        f26988d = bArr;
        f26989e = ByteBuffer.wrap(bArr);
        f26990f = j.j(bArr);
    }

    static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    static <T> T b(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return a2.s(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((v0) obj).b().q((v0) obj2).A();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f26986b);
    }
}
