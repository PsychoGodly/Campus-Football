package com.startapp.simple.bloomfilter.algo;

import java.io.Serializable;

/* compiled from: Sta */
public class OpenBitSet implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f17269a = true;
    private static final long serialVersionUID = -901334831550831262L;
    private final long[][] bits;
    private final int pageCount;
    private int wlen;

    static {
        Class<OpenBitSet> cls = OpenBitSet.class;
    }

    public OpenBitSet(long j10) {
        int a10 = a(j10);
        this.wlen = a10;
        int i10 = a10 % 4096;
        int i11 = a10 / 4096;
        int i12 = (i10 == 0 ? 0 : 1) + i11;
        this.pageCount = i12;
        if (i12 <= 100) {
            this.bits = new long[i12][];
            for (int i13 = 0; i13 < i11; i13++) {
                this.bits[i13] = new long[4096];
            }
            if (i10 != 0) {
                long[][] jArr = this.bits;
                jArr[jArr.length - 1] = new long[i10];
                return;
            }
            return;
        }
        throw new RuntimeException("HighPageCountException pageCount = " + i12);
    }

    public int a() {
        return this.wlen;
    }

    public final int a(long j10) {
        return (int) (((j10 - 1) >>> 6) + 1);
    }

    public void b(long j10) {
        int i10 = (int) (j10 >> 6);
        int i11 = this.wlen;
        if (i10 >= i11) {
            int i12 = (int) ((((j10 + 1) - 1) >>> 6) + 1);
            if (f17269a || i12 <= i11) {
                this.wlen = i10 + 1;
            } else {
                throw new AssertionError("Growing of paged bitset is not supported");
            }
        }
        long[] jArr = this.bits[i10 / 4096];
        int i13 = i10 % 4096;
        jArr[i13] = (1 << (((int) j10) & 63)) | jArr[i13];
    }

    public long c() {
        return ((long) this.wlen) << 6;
    }

    public long[] a(int i10) {
        return this.bits[i10];
    }

    public int b() {
        return this.pageCount;
    }
}
