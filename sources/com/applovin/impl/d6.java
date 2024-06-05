package com.applovin.impl;

import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.unity3d.services.UnityAdsConstants;

public class d6 implements gc {

    /* renamed from: a  reason: collision with root package name */
    private final p5 f7122a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7123b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7124c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7125d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7126e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7127f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f7128g;

    /* renamed from: h  reason: collision with root package name */
    private final long f7129h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f7130i;

    /* renamed from: j  reason: collision with root package name */
    private int f7131j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7132k;

    public d6() {
        this(new p5(true, 65536), 50000, 50000, 2500, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, -1, false, 0, false);
    }

    private static void a(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        a1.a(z10, (Object) str + " cannot be less than " + str2);
    }

    public n0 b() {
        return this.f7122a;
    }

    public void c() {
        a(true);
    }

    public long d() {
        return this.f7129h;
    }

    public void e() {
        a(true);
    }

    public void f() {
        a(false);
    }

    protected d6(p5 p5Var, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(i15, 0, "backBufferDurationMs", "0");
        this.f7122a = p5Var;
        this.f7123b = r2.a((long) i10);
        this.f7124c = r2.a((long) i11);
        this.f7125d = r2.a((long) i12);
        this.f7126e = r2.a((long) i13);
        this.f7127f = i14;
        this.f7131j = i14 == -1 ? 13107200 : i14;
        this.f7128g = z10;
        this.f7129h = r2.a((long) i15);
        this.f7130i = z11;
    }

    /* access modifiers changed from: protected */
    public int a(li[] liVarArr, f8[] f8VarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < liVarArr.length; i11++) {
            if (f8VarArr[i11] != null) {
                i10 += a(liVarArr[i11].e());
            }
        }
        return Math.max(13107200, i10);
    }

    private static int a(int i10) {
        switch (i10) {
            case IntegrityErrorCode.PLAY_STORE_NOT_FOUND /*-2*/:
                return 0;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void a(li[] liVarArr, qo qoVar, f8[] f8VarArr) {
        int i10 = this.f7127f;
        if (i10 == -1) {
            i10 = a(liVarArr, f8VarArr);
        }
        this.f7131j = i10;
        this.f7122a.a(i10);
    }

    private void a(boolean z10) {
        int i10 = this.f7127f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f7131j = i10;
        this.f7132k = false;
        if (z10) {
            this.f7122a.e();
        }
    }

    public boolean a() {
        return this.f7130i;
    }

    public boolean a(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f7122a.d() >= this.f7131j;
        long j12 = this.f7123b;
        if (f10 > 1.0f) {
            j12 = Math.min(yp.a(j12, f10), this.f7124c);
        }
        if (j11 < Math.max(j12, 500000)) {
            if (!this.f7128g && z11) {
                z10 = false;
            }
            this.f7132k = z10;
            if (!z10 && j11 < 500000) {
                kc.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f7124c || z11) {
            this.f7132k = false;
        }
        return this.f7132k;
    }

    public boolean a(long j10, float f10, boolean z10, long j11) {
        long b10 = yp.b(j10, f10);
        long j12 = z10 ? this.f7126e : this.f7125d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || b10 >= j12 || (!this.f7128g && this.f7122a.d() >= this.f7131j);
    }
}
