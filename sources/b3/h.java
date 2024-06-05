package b3;

import b3.i;
import java.util.Arrays;
import java.util.List;
import k4.a;
import k4.a0;
import n2.r1;
import n2.y2;
import p2.i0;
import s2.h0;
import s6.u;

/* compiled from: OpusReader */
final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f5497o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f5498p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    private boolean f5499n;

    h() {
    }

    private static boolean n(a0 a0Var, byte[] bArr) {
        if (a0Var.a() < bArr.length) {
            return false;
        }
        int f10 = a0Var.f();
        byte[] bArr2 = new byte[bArr.length];
        a0Var.l(bArr2, 0, bArr.length);
        a0Var.T(f10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(a0 a0Var) {
        return n(a0Var, f5497o);
    }

    /* access modifiers changed from: protected */
    public long f(a0 a0Var) {
        return c(i0.e(a0Var.e()));
    }

    /* access modifiers changed from: protected */
    public boolean h(a0 a0Var, long j10, i.b bVar) throws y2 {
        if (n(a0Var, f5497o)) {
            byte[] copyOf = Arrays.copyOf(a0Var.e(), a0Var.g());
            int c10 = i0.c(copyOf);
            List<byte[]> a10 = i0.a(copyOf);
            if (bVar.f5513a != null) {
                return true;
            }
            bVar.f5513a = new r1.b().g0("audio/opus").J(c10).h0(48000).V(a10).G();
            return true;
        }
        byte[] bArr = f5498p;
        if (n(a0Var, bArr)) {
            a.h(bVar.f5513a);
            if (this.f5499n) {
                return true;
            }
            this.f5499n = true;
            a0Var.U(bArr.length);
            f3.a c11 = h0.c(u.v(h0.j(a0Var, false, false).f22427b));
            if (c11 == null) {
                return true;
            }
            bVar.f5513a = bVar.f5513a.b().Z(c11.b(bVar.f5513a.f20652k)).G();
            return true;
        }
        a.h(bVar.f5513a);
        return false;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f5499n = false;
        }
    }
}
