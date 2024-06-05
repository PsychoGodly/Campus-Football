package com.startapp;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: Sta */
public class w7 {
    public static String a(List<String> list) {
        d1 d1Var = new d1();
        long currentTimeMillis = System.currentTimeMillis();
        BloomVersion bloomVersion = BloomVersion.FOUR;
        y0 y0Var = d1Var.f15720b.f17539a.get(bloomVersion).f17516b;
        y0Var.getClass();
        OpenBitSet openBitSet = new OpenBitSet((long) (y0Var.f17552a * y0Var.f17553b));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ByteBuffer wrap = ByteBuffer.wrap(it.next().getBytes());
            long c10 = openBitSet.c();
            int i10 = y0Var.f17552a;
            long[] jArr = new long[i10];
            long j10 = c10 / ((long) i10);
            long j11 = currentTimeMillis;
            long a10 = p5.a(wrap, wrap.position(), wrap.remaining(), 0);
            long a11 = p5.a(wrap, wrap.position(), wrap.remaining(), a10);
            Iterator<String> it2 = it;
            int i11 = 0;
            while (i11 < y0Var.f17552a) {
                BloomVersion bloomVersion2 = bloomVersion;
                long j12 = (long) i11;
                jArr[i11] = Math.abs(((j12 * a11) + a10) % j10) + (j12 * j10);
                i11++;
                bloomVersion = bloomVersion2;
                y0Var = y0Var;
            }
            BloomVersion bloomVersion3 = bloomVersion;
            y0 y0Var2 = y0Var;
            for (int i12 = 0; i12 < i10; i12++) {
                openBitSet.b(jArr[i12]);
            }
            bloomVersion = bloomVersion3;
            currentTimeMillis = j11;
            it = it2;
            y0Var = y0Var2;
        }
        long j13 = currentTimeMillis;
        BloomVersion bloomVersion4 = bloomVersion;
        o8 o8Var = d1Var.f15719a;
        o8Var.getClass();
        try {
            String a12 = o8Var.f16228a.a(openBitSet);
            p8 p8Var = o8Var.f16229b.f17539a.get(bloomVersion4).f17515a;
            return j13 + "-" + bloomVersion4.c() + "-" + p8Var.a(a12);
        } catch (Throwable unused) {
            return null;
        }
    }
}
