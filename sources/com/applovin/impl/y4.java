package com.applovin.impl;

import android.media.MediaCodec;

public final class y4 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f13500a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f13501b;

    /* renamed from: c  reason: collision with root package name */
    public int f13502c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f13503d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f13504e;

    /* renamed from: f  reason: collision with root package name */
    public int f13505f;

    /* renamed from: g  reason: collision with root package name */
    public int f13506g;

    /* renamed from: h  reason: collision with root package name */
    public int f13507h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f13508i;

    /* renamed from: j  reason: collision with root package name */
    private final b f13509j;

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f13510a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f13511b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f13510a = cryptoInfo;
            this.f13511b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* access modifiers changed from: private */
        public void a(int i10, int i11) {
            this.f13511b.set(i10, i11);
            this.f13510a.setPattern(this.f13511b);
        }
    }

    public y4() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f13508i = cryptoInfo;
        this.f13509j = yp.f13662a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f13508i;
    }

    public void a(int i10) {
        if (i10 != 0) {
            if (this.f13503d == null) {
                int[] iArr = new int[1];
                this.f13503d = iArr;
                this.f13508i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f13503d;
            iArr2[0] = iArr2[0] + i10;
        }
    }

    public void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f13505f = i10;
        this.f13503d = iArr;
        this.f13504e = iArr2;
        this.f13501b = bArr;
        this.f13500a = bArr2;
        this.f13502c = i11;
        this.f13506g = i12;
        this.f13507h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f13508i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (yp.f13662a >= 24) {
            ((b) a1.a((Object) this.f13509j)).a(i12, i13);
        }
    }
}
