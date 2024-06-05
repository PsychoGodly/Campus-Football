package q2;

import android.media.MediaCodec;
import k4.n0;

/* compiled from: CryptoInfo */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f21730a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f21731b;

    /* renamed from: c  reason: collision with root package name */
    public int f21732c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f21733d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f21734e;

    /* renamed from: f  reason: collision with root package name */
    public int f21735f;

    /* renamed from: g  reason: collision with root package name */
    public int f21736g;

    /* renamed from: h  reason: collision with root package name */
    public int f21737h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f21738i;

    /* renamed from: j  reason: collision with root package name */
    private final b f21739j;

    /* compiled from: CryptoInfo */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f21740a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f21741b;

        /* access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f21741b.set(i10, i11);
            this.f21740a.setPattern(this.f21741b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f21740a = cryptoInfo;
            this.f21741b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f21738i = cryptoInfo;
        this.f21739j = n0.f19738a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f21738i;
    }

    public void b(int i10) {
        if (i10 != 0) {
            if (this.f21733d == null) {
                int[] iArr = new int[1];
                this.f21733d = iArr;
                this.f21738i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f21733d;
            iArr2[0] = iArr2[0] + i10;
        }
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f21735f = i10;
        this.f21733d = iArr;
        this.f21734e = iArr2;
        this.f21731b = bArr;
        this.f21730a = bArr2;
        this.f21732c = i11;
        this.f21736g = i12;
        this.f21737h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f21738i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (n0.f19738a >= 24) {
            ((b) k4.a.e(this.f21739j)).b(i12, i13);
        }
    }
}
