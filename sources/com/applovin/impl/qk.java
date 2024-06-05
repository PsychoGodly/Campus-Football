package com.applovin.impl;

import com.applovin.impl.we;
import java.nio.ByteBuffer;

public final class qk extends ak {

    /* renamed from: a  reason: collision with root package name */
    private final yg f11025a = new yg();

    /* renamed from: b  reason: collision with root package name */
    private final xg f11026b = new xg();

    /* renamed from: c  reason: collision with root package name */
    private io f11027c;

    /* access modifiers changed from: protected */
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        io ioVar = this.f11027c;
        if (ioVar == null || zeVar.f13826j != ioVar.c()) {
            io ioVar2 = new io(zeVar.f9908f);
            this.f11027c = ioVar2;
            ioVar2.a(zeVar.f9908f - zeVar.f13826j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f11025a.a(array, limit);
        this.f11026b.a(array, limit);
        this.f11026b.d(39);
        long a10 = (((long) this.f11026b.a(1)) << 32) | ((long) this.f11026b.a(32));
        this.f11026b.d(20);
        int a11 = this.f11026b.a(12);
        int a12 = this.f11026b.a(8);
        we.b bVar = null;
        this.f11025a.g(14);
        if (a12 == 0) {
            bVar = new sk();
        } else if (a12 == 255) {
            bVar = vh.a(this.f11025a, a11, a10);
        } else if (a12 == 4) {
            bVar = tk.a(this.f11025a);
        } else if (a12 == 5) {
            bVar = rk.a(this.f11025a, a10, this.f11027c);
        } else if (a12 == 6) {
            bVar = eo.a(this.f11025a, a10, this.f11027c);
        }
        if (bVar == null) {
            return new we(new we.b[0]);
        }
        return new we(bVar);
    }
}
