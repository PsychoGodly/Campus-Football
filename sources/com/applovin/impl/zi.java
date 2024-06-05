package com.applovin.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

final class zi implements vq, t2 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f13870a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f13871b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private final bi f13872c = new bi();

    /* renamed from: d  reason: collision with root package name */
    private final i9 f13873d = new i9();

    /* renamed from: f  reason: collision with root package name */
    private final fo f13874f = new fo();

    /* renamed from: g  reason: collision with root package name */
    private final fo f13875g = new fo();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f13876h = new float[16];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f13877i = new float[16];

    /* renamed from: j  reason: collision with root package name */
    private int f13878j;

    /* renamed from: k  reason: collision with root package name */
    private SurfaceTexture f13879k;

    /* renamed from: l  reason: collision with root package name */
    private volatile int f13880l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f13881m = -1;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f13882n;

    public void a(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        z9.a();
        if (this.f13870a.compareAndSet(true, false)) {
            ((SurfaceTexture) a1.a((Object) this.f13879k)).updateTexImage();
            z9.a();
            if (this.f13871b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f13876h, 0);
            }
            long timestamp = this.f13879k.getTimestamp();
            Long l10 = (Long) this.f13874f.b(timestamp);
            if (l10 != null) {
                this.f13873d.a(this.f13876h, l10.longValue());
            }
            zh zhVar = (zh) this.f13875g.c(timestamp);
            if (zhVar != null) {
                this.f13872c.b(zhVar);
            }
        }
        Matrix.multiplyMM(this.f13877i, 0, fArr, 0, this.f13876h, 0);
        this.f13872c.a(this.f13878j, this.f13877i, z10);
    }

    public SurfaceTexture b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        z9.a();
        this.f13872c.a();
        z9.a();
        this.f13878j = z9.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13878j);
        this.f13879k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new f90(this));
        return this.f13879k;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f13870a.set(true);
    }

    public void a(long j10, float[] fArr) {
        this.f13873d.a(j10, fArr);
    }

    public void a() {
        this.f13874f.a();
        this.f13873d.a();
        this.f13871b.set(true);
    }

    public void a(long j10, long j11, d9 d9Var, MediaFormat mediaFormat) {
        this.f13874f.a(j11, (Object) Long.valueOf(j10));
        a(d9Var.f7163w, d9Var.f7164x, j11);
    }

    public void a(int i10) {
        this.f13880l = i10;
    }

    private void a(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f13882n;
        int i11 = this.f13881m;
        this.f13882n = bArr;
        if (i10 == -1) {
            i10 = this.f13880l;
        }
        this.f13881m = i10;
        if (i11 != i10 || !Arrays.equals(bArr2, this.f13882n)) {
            zh zhVar = null;
            byte[] bArr3 = this.f13882n;
            if (bArr3 != null) {
                zhVar = ai.a(bArr3, this.f13881m);
            }
            if (zhVar == null || !bi.a(zhVar)) {
                zhVar = zh.a(this.f13881m);
            }
            this.f13875g.a(j10, (Object) zhVar);
        }
    }
}
