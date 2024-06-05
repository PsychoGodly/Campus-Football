package e3;

import e3.b;
import e3.l;
import e3.x;
import java.io.IOException;
import k4.n0;
import k4.r;
import k4.v;

/* compiled from: DefaultMediaCodecAdapterFactory */
public final class j implements l.b {

    /* renamed from: a  reason: collision with root package name */
    private int f17838a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17839b;

    public l a(l.a aVar) throws IOException {
        int i10;
        int i11 = n0.f19738a;
        if (i11 < 23 || ((i10 = this.f17838a) != 1 && (i10 != 0 || i11 < 31))) {
            return new x.b().a(aVar);
        }
        int k10 = v.k(aVar.f17847c.f20654m);
        r.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + n0.k0(k10));
        return new b.C0184b(k10, this.f17839b).a(aVar);
    }
}
