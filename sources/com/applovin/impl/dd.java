package com.applovin.impl;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.impl.cd;
import com.applovin.impl.d9;
import com.applovin.impl.li;
import com.applovin.impl.p1;
import com.applovin.impl.q1;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dd extends gd implements bd {
    private final Context J0;
    /* access modifiers changed from: private */
    public final p1.a K0;
    private final q1 L0;
    private int M0;
    private boolean N0;
    private d9 O0;
    private long P0;
    private boolean Q0;
    private boolean R0;
    private boolean S0;
    private boolean T0;
    /* access modifiers changed from: private */
    public li.a U0;

    public dd(Context context, cd.b bVar, hd hdVar, boolean z10, Handler handler, p1 p1Var, q1 q1Var) {
        super(1, bVar, hdVar, z10, 44100.0f);
        this.J0 = context.getApplicationContext();
        this.L0 = q1Var;
        this.K0 = new p1.a(handler, p1Var);
        q1Var.a((q1.c) new b());
    }

    private static boolean c0() {
        if (yp.f13662a == 23) {
            String str = yp.f13665d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void e0() {
        long a10 = this.L0.a(c());
        if (a10 != Long.MIN_VALUE) {
            if (!this.R0) {
                a10 = Math.max(this.P0, a10);
            }
            this.P0 = a10;
            this.R0 = false;
        }
    }

    private static boolean h(String str) {
        if (yp.f13662a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(yp.f13664c)) {
            String str2 = yp.f13663b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void Q() {
        super.Q();
        this.L0.i();
    }

    /* access modifiers changed from: protected */
    public void V() {
        try {
            this.L0.f();
        } catch (q1.e e10) {
            throw a((Throwable) e10, e10.f10798c, e10.f10797b, 5002);
        }
    }

    public boolean c() {
        return super.c() && this.L0.c();
    }

    public boolean d() {
        return this.L0.g() || super.d();
    }

    /* access modifiers changed from: protected */
    public void d0() {
        this.R0 = true;
    }

    /* access modifiers changed from: protected */
    public void g(String str) {
        this.K0.a(str);
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    public bd l() {
        return this;
    }

    public long p() {
        if (b() == 2) {
            e0();
        }
        return this.P0;
    }

    /* access modifiers changed from: protected */
    public void v() {
        this.S0 = true;
        try {
            this.L0.b();
            try {
                super.v();
            } finally {
                this.K0.a(this.E0);
            }
        } catch (Throwable th) {
            super.v();
            throw th;
        } finally {
            this.K0.a(this.E0);
        }
    }

    /* access modifiers changed from: protected */
    public void w() {
        try {
            super.w();
        } finally {
            if (this.S0) {
                this.S0 = false;
                this.L0.reset();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        super.x();
        this.L0.j();
    }

    /* access modifiers changed from: protected */
    public void y() {
        e0();
        this.L0.pause();
        super.y();
    }

    private final class b implements q1.c {
        private b() {
        }

        public void a(Exception exc) {
            kc.a("MediaCodecAudioRenderer", "Audio sink error", exc);
            dd.this.K0.b(exc);
        }

        public void b(long j10) {
            if (dd.this.U0 != null) {
                dd.this.U0.a(j10);
            }
        }

        public void a() {
            if (dd.this.U0 != null) {
                dd.this.U0.a();
            }
        }

        public void b() {
            dd.this.d0();
        }

        public void a(long j10) {
            dd.this.K0.b(j10);
        }

        public void a(boolean z10) {
            dd.this.K0.b(z10);
        }

        public void a(int i10, long j10, long j11) {
            dd.this.K0.b(i10, j10, j11);
        }
    }

    /* access modifiers changed from: protected */
    public o5 a(fd fdVar, d9 d9Var, d9 d9Var2) {
        int i10;
        o5 a10 = fdVar.a(d9Var, d9Var2);
        int i11 = a10.f10067e;
        if (a(fdVar, d9Var2) > this.M0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = fdVar.f7722a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = a10.f10066d;
        }
        return new o5(str, d9Var, d9Var2, i10, i12);
    }

    /* access modifiers changed from: protected */
    public void b(n5 n5Var) {
        if (this.Q0 && !n5Var.d()) {
            if (Math.abs(n5Var.f9908f - this.P0) > 500000) {
                this.P0 = n5Var.f9908f;
            }
            this.Q0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean c(d9 d9Var) {
        return this.L0.a(d9Var);
    }

    public dd(Context context, hd hdVar, boolean z10, Handler handler, p1 p1Var, q1 q1Var) {
        this(context, cd.b.f6979a, hdVar, z10, handler, p1Var, q1Var);
    }

    private int a(fd fdVar, d9 d9Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(fdVar.f7722a) || (i10 = yp.f13662a) >= 24 || (i10 == 23 && yp.d(this.J0))) {
            return d9Var.f7154n;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int a(fd fdVar, d9 d9Var, d9[] d9VarArr) {
        int a10 = a(fdVar, d9Var);
        if (d9VarArr.length == 1) {
            return a10;
        }
        for (d9 d9Var2 : d9VarArr) {
            if (fdVar.a(d9Var, d9Var2).f10066d != 0) {
                a10 = Math.max(a10, a(fdVar, d9Var2));
            }
        }
        return a10;
    }

    /* access modifiers changed from: protected */
    public float a(float f10, d9 d9Var, d9[] d9VarArr) {
        int i10 = -1;
        for (d9 d9Var2 : d9VarArr) {
            int i11 = d9Var2.A;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * ((float) i10);
    }

    /* access modifiers changed from: protected */
    public List a(hd hdVar, d9 d9Var, boolean z10) {
        fd a10;
        String str = d9Var.f7153m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.L0.a(d9Var) && (a10 = id.a()) != null) {
            return Collections.singletonList(a10);
        }
        List a11 = id.a(hdVar.a(str, z10, false), d9Var);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(a11);
            arrayList.addAll(hdVar.a("audio/eac3", z10, false));
            a11 = arrayList;
        }
        return Collections.unmodifiableList(a11);
    }

    /* access modifiers changed from: protected */
    public cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f10) {
        this.M0 = a(fdVar, d9Var, t());
        this.N0 = h(fdVar.f7722a);
        MediaFormat a10 = a(d9Var, fdVar.f7724c, this.M0, f10);
        this.O0 = (!"audio/raw".equals(fdVar.f7723b) || "audio/raw".equals(d9Var.f7153m)) ? null : d9Var;
        return cd.a.a(fdVar, a10, d9Var, mediaCrypto);
    }

    public mh a() {
        return this.L0.a();
    }

    public void a(int i10, Object obj) {
        if (i10 == 2) {
            this.L0.a(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.L0.a((k1) obj);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.L0.b(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.L0.a(((Integer) obj).intValue());
                    return;
                case 11:
                    this.U0 = (li.a) obj;
                    return;
                default:
                    super.a(i10, obj);
                    return;
            }
        } else {
            this.L0.a((u1) obj);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Exception exc) {
        kc.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.K0.a(exc);
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j10, long j11) {
        this.K0.a(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z10, boolean z11) {
        super.a(z10, z11);
        this.K0.b(this.E0);
        if (q().f9996a) {
            this.L0.e();
        } else {
            this.L0.d();
        }
    }

    /* access modifiers changed from: protected */
    public o5 a(e9 e9Var) {
        o5 a10 = super.a(e9Var);
        this.K0.a(e9Var.f7378b, a10);
        return a10;
    }

    /* access modifiers changed from: protected */
    public void a(d9 d9Var, MediaFormat mediaFormat) {
        int i10;
        int i11;
        d9 d9Var2 = this.O0;
        int[] iArr = null;
        if (d9Var2 != null) {
            d9Var = d9Var2;
        } else if (I() != null) {
            if ("audio/raw".equals(d9Var.f7153m)) {
                i10 = d9Var.B;
            } else if (yp.f13662a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = yp.d(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = "audio/raw".equals(d9Var.f7153m) ? d9Var.B : 2;
            }
            d9 a10 = new d9.b().f("audio/raw").j(i10).e(d9Var.C).f(d9Var.D).c(mediaFormat.getInteger("channel-count")).n(mediaFormat.getInteger("sample-rate")).a();
            if (this.N0 && a10.f7166z == 6 && (i11 = d9Var.f7166z) < 6) {
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < d9Var.f7166z; i12++) {
                    iArr2[i12] = i12;
                }
                iArr = iArr2;
            }
            d9Var = a10;
        }
        try {
            this.L0.a(d9Var, 0, iArr);
        } catch (q1.a e10) {
            throw a((Throwable) e10, e10.f10790a, 5001);
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j10, boolean z10) {
        super.a(j10, z10);
        if (this.T0) {
            this.L0.h();
        } else {
            this.L0.b();
        }
        this.P0 = j10;
        this.Q0 = true;
        this.R0 = true;
    }

    /* access modifiers changed from: protected */
    public boolean a(long j10, long j11, cd cdVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, d9 d9Var) {
        a1.a((Object) byteBuffer);
        if (this.O0 != null && (i11 & 2) != 0) {
            ((cd) a1.a((Object) cdVar)).a(i10, false);
            return true;
        } else if (z10) {
            if (cdVar != null) {
                cdVar.a(i10, false);
            }
            this.E0.f9190f += i12;
            this.L0.i();
            return true;
        } else {
            try {
                if (!this.L0.a(byteBuffer, j12, i12)) {
                    return false;
                }
                if (cdVar != null) {
                    cdVar.a(i10, false);
                }
                this.E0.f9189e += i12;
                return true;
            } catch (q1.b e10) {
                throw a((Throwable) e10, e10.f10793c, e10.f10792b, 5001);
            } catch (q1.e e11) {
                throw a((Throwable) e11, d9Var, e11.f10797b, 5002);
            }
        }
    }

    public void a(mh mhVar) {
        this.L0.a(mhVar);
    }

    /* access modifiers changed from: protected */
    public int a(hd hdVar, d9 d9Var) {
        if (!df.g(d9Var.f7153m)) {
            return hz.a(0);
        }
        int i10 = yp.f13662a >= 21 ? 32 : 0;
        boolean z10 = d9Var.F != 0;
        boolean d10 = gd.d(d9Var);
        int i11 = 8;
        int i12 = 4;
        if (d10 && this.L0.a(d9Var) && (!z10 || id.a() != null)) {
            return hz.b(4, 8, i10);
        }
        if ("audio/raw".equals(d9Var.f7153m) && !this.L0.a(d9Var)) {
            return hz.a(1);
        }
        if (!this.L0.a(yp.b(2, d9Var.f7166z, d9Var.A))) {
            return hz.a(1);
        }
        List a10 = a(hdVar, d9Var, false);
        if (a10.isEmpty()) {
            return hz.a(1);
        }
        if (!d10) {
            return hz.a(2);
        }
        fd fdVar = (fd) a10.get(0);
        boolean b10 = fdVar.b(d9Var);
        if (b10 && fdVar.c(d9Var)) {
            i11 = 16;
        }
        if (!b10) {
            i12 = 3;
        }
        return hz.b(i12, i11, i10);
    }

    /* access modifiers changed from: protected */
    public MediaFormat a(d9 d9Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", d9Var.f7166z);
        mediaFormat.setInteger("sample-rate", d9Var.A);
        nd.a(mediaFormat, d9Var.f7155o);
        nd.a(mediaFormat, "max-input-size", i10);
        int i11 = yp.f13662a;
        if (i11 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f && !c0()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(d9Var.f7153m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.L0.b(yp.b(4, d9Var.f7166z, d9Var.A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }
}
