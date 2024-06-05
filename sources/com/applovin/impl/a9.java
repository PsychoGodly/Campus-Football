package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.o1;
import java.nio.ByteBuffer;

final class a9 extends y1 {

    /* renamed from: i  reason: collision with root package name */
    private static final int f6339i = Float.floatToIntBits(Float.NaN);

    a9() {
    }

    public void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f13476b.f10048c;
        if (i11 == 536870912) {
            byteBuffer2 = a((i10 / 3) * 4);
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 2) & 255) << Ascii.CAN), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 805306368) {
            byteBuffer2 = a(i10);
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 3) & 255) << Ascii.CAN), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public o1.a b(o1.a aVar) {
        int i10 = aVar.f10048c;
        if (!yp.f(i10)) {
            throw new o1.b(aVar);
        } else if (i10 != 4) {
            return new o1.a(aVar.f10046a, aVar.f10047b, 4);
        } else {
            return o1.a.f10045e;
        }
    }

    private static void a(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (floatToIntBits == f6339i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
