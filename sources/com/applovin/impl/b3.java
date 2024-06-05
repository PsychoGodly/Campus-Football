package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;

final class b3 extends y1 {

    /* renamed from: i  reason: collision with root package name */
    private int[] f6616i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f6617j;

    b3() {
    }

    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a1.a((Object) this.f6617j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a10 = a(((limit - position) / this.f13476b.f10049d) * this.f13477c.f10049d);
        while (position < limit) {
            for (int i10 : iArr) {
                a10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f13476b.f10049d;
        }
        byteBuffer.position(limit);
        a10.flip();
    }

    public o1.a b(o1.a aVar) {
        int[] iArr = this.f6616i;
        if (iArr == null) {
            return o1.a.f10045e;
        }
        if (aVar.f10048c == 2) {
            boolean z10 = aVar.f10047b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < aVar.f10047b) {
                    z10 |= i11 != i10;
                    i10++;
                } else {
                    throw new o1.b(aVar);
                }
            }
            if (z10) {
                return new o1.a(aVar.f10046a, iArr.length, 2);
            }
            return o1.a.f10045e;
        }
        throw new o1.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.f6617j = this.f6616i;
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f6617j = null;
        this.f6616i = null;
    }

    public void a(int[] iArr) {
        this.f6616i = iArr;
    }
}
