package s2;

import f3.a;
import java.util.Collections;
import java.util.List;
import k4.n0;
import k4.z;
import n2.r1;

/* compiled from: FlacStreamMetadata */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f22468a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22469b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22470c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22471d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22472e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22473f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22474g;

    /* renamed from: h  reason: collision with root package name */
    public final int f22475h;

    /* renamed from: i  reason: collision with root package name */
    public final int f22476i;

    /* renamed from: j  reason: collision with root package name */
    public final long f22477j;

    /* renamed from: k  reason: collision with root package name */
    public final a f22478k;

    /* renamed from: l  reason: collision with root package name */
    private final f3.a f22479l;

    /* compiled from: FlacStreamMetadata */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f22480a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f22481b;

        public a(long[] jArr, long[] jArr2) {
            this.f22480a = jArr;
            this.f22481b = jArr2;
        }
    }

    public v(byte[] bArr, int i10) {
        z zVar = new z(bArr);
        zVar.p(i10 * 8);
        this.f22468a = zVar.h(16);
        this.f22469b = zVar.h(16);
        this.f22470c = zVar.h(24);
        this.f22471d = zVar.h(24);
        int h10 = zVar.h(20);
        this.f22472e = h10;
        this.f22473f = j(h10);
        this.f22474g = zVar.h(3) + 1;
        int h11 = zVar.h(5) + 1;
        this.f22475h = h11;
        this.f22476i = e(h11);
        this.f22477j = zVar.j(36);
        this.f22478k = null;
        this.f22479l = null;
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public v a(List<i3.a> list) {
        return new v(this.f22468a, this.f22469b, this.f22470c, this.f22471d, this.f22472e, this.f22474g, this.f22475h, this.f22477j, this.f22478k, h(new f3.a((List<? extends a.b>) list)));
    }

    public v b(a aVar) {
        return new v(this.f22468a, this.f22469b, this.f22470c, this.f22471d, this.f22472e, this.f22474g, this.f22475h, this.f22477j, aVar, this.f22479l);
    }

    public v c(List<String> list) {
        return new v(this.f22468a, this.f22469b, this.f22470c, this.f22471d, this.f22472e, this.f22474g, this.f22475h, this.f22477j, this.f22478k, h(h0.c(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f22471d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f22470c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f22468a;
            j10 = ((((i11 != this.f22469b || i11 <= 0) ? 4096 : (long) i11) * ((long) this.f22474g)) * ((long) this.f22475h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f22477j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f22472e);
    }

    public r1 g(byte[] bArr, f3.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f22471d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new r1.b().g0("audio/flac").Y(i10).J(this.f22474g).h0(this.f22472e).V(Collections.singletonList(bArr)).Z(h(aVar)).G();
    }

    public f3.a h(f3.a aVar) {
        f3.a aVar2 = this.f22479l;
        return aVar2 == null ? aVar : aVar2.b(aVar);
    }

    public long i(long j10) {
        return n0.r((j10 * ((long) this.f22472e)) / 1000000, 0, this.f22477j - 1);
    }

    private v(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, f3.a aVar2) {
        this.f22468a = i10;
        this.f22469b = i11;
        this.f22470c = i12;
        this.f22471d = i13;
        this.f22472e = i14;
        this.f22473f = j(i14);
        this.f22474g = i15;
        this.f22475h = i16;
        this.f22476i = e(i16);
        this.f22477j = j10;
        this.f22478k = aVar;
        this.f22479l = aVar2;
    }
}
