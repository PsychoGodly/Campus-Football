package com.applovin.impl;

import com.applovin.impl.d9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class y8 {

    /* renamed from: a  reason: collision with root package name */
    public final int f13539a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13540b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13541c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13542d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13543e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13544f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13545g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13546h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13547i;

    /* renamed from: j  reason: collision with root package name */
    public final long f13548j;

    /* renamed from: k  reason: collision with root package name */
    public final a f13549k;

    /* renamed from: l  reason: collision with root package name */
    private final we f13550l;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f13551a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f13552b;

        public a(long[] jArr, long[] jArr2) {
            this.f13551a = jArr;
            this.f13552b = jArr2;
        }
    }

    private y8(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, we weVar) {
        this.f13539a = i10;
        this.f13540b = i11;
        this.f13541c = i12;
        this.f13542d = i13;
        this.f13543e = i14;
        this.f13544f = b(i14);
        this.f13545g = i15;
        this.f13546h = i16;
        this.f13547i = a(i16);
        this.f13548j = j10;
        this.f13549k = aVar;
        this.f13550l = weVar;
    }

    private static int a(int i10) {
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

    private static we a(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] b10 = yp.b(str, "=");
            if (b10.length != 2) {
                kc.d("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new er(b10[0], b10[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we((List) arrayList);
    }

    private static int b(int i10) {
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

    public y8 b(List list) {
        return new y8(this.f13539a, this.f13540b, this.f13541c, this.f13542d, this.f13543e, this.f13545g, this.f13546h, this.f13548j, this.f13549k, a(a(list, Collections.emptyList())));
    }

    public long b() {
        long j10 = this.f13548j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f13543e);
    }

    public y8 a(List list) {
        return new y8(this.f13539a, this.f13540b, this.f13541c, this.f13542d, this.f13543e, this.f13545g, this.f13546h, this.f13548j, this.f13549k, a(a(Collections.emptyList(), list)));
    }

    public y8(byte[] bArr, int i10) {
        xg xgVar = new xg(bArr);
        xgVar.c(i10 * 8);
        this.f13539a = xgVar.a(16);
        this.f13540b = xgVar.a(16);
        this.f13541c = xgVar.a(24);
        this.f13542d = xgVar.a(24);
        int a10 = xgVar.a(20);
        this.f13543e = a10;
        this.f13544f = b(a10);
        this.f13545g = xgVar.a(3) + 1;
        int a11 = xgVar.a(5) + 1;
        this.f13546h = a11;
        this.f13547i = a(a11);
        this.f13548j = xgVar.b(36);
        this.f13549k = null;
        this.f13550l = null;
    }

    public long a() {
        long j10;
        long j11;
        int i10 = this.f13542d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f13541c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f13539a;
            j10 = ((((i11 != this.f13540b || i11 <= 0) ? 4096 : (long) i11) * ((long) this.f13545g)) * ((long) this.f13546h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public d9 a(byte[] bArr, we weVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f13542d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new d9.b().f("audio/flac").i(i10).c(this.f13545g).n(this.f13543e).a(Collections.singletonList(bArr)).a(a(weVar)).a();
    }

    public we a(we weVar) {
        we weVar2 = this.f13550l;
        return weVar2 == null ? weVar : weVar2.a(weVar);
    }

    public long a(long j10) {
        return yp.b((j10 * ((long) this.f13543e)) / 1000000, 0, this.f13548j - 1);
    }

    public y8 a(a aVar) {
        return new y8(this.f13539a, this.f13540b, this.f13541c, this.f13542d, this.f13543e, this.f13545g, this.f13546h, this.f13548j, aVar, this.f13550l);
    }
}
