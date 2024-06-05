package n2;

import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.unity3d.services.UnityAdsConstants;
import i4.s;
import j4.b;
import j4.q;
import k4.n0;
import k4.r;
import p3.z0;

/* compiled from: DefaultLoadControl */
public class k implements x1 {

    /* renamed from: a  reason: collision with root package name */
    private final q f20488a;

    /* renamed from: b  reason: collision with root package name */
    private final long f20489b;

    /* renamed from: c  reason: collision with root package name */
    private final long f20490c;

    /* renamed from: d  reason: collision with root package name */
    private final long f20491d;

    /* renamed from: e  reason: collision with root package name */
    private final long f20492e;

    /* renamed from: f  reason: collision with root package name */
    private final int f20493f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f20494g;

    /* renamed from: h  reason: collision with root package name */
    private final long f20495h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f20496i;

    /* renamed from: j  reason: collision with root package name */
    private int f20497j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20498k;

    /* compiled from: DefaultLoadControl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private q f20499a;

        /* renamed from: b  reason: collision with root package name */
        private int f20500b = 50000;

        /* renamed from: c  reason: collision with root package name */
        private int f20501c = 50000;

        /* renamed from: d  reason: collision with root package name */
        private int f20502d = 2500;

        /* renamed from: e  reason: collision with root package name */
        private int f20503e = UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS;

        /* renamed from: f  reason: collision with root package name */
        private int f20504f = -1;

        /* renamed from: g  reason: collision with root package name */
        private boolean f20505g = false;

        /* renamed from: h  reason: collision with root package name */
        private int f20506h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f20507i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f20508j;

        public k a() {
            k4.a.f(!this.f20508j);
            this.f20508j = true;
            if (this.f20499a == null) {
                this.f20499a = new q(true, 65536);
            }
            return new k(this.f20499a, this.f20500b, this.f20501c, this.f20502d, this.f20503e, this.f20504f, this.f20505g, this.f20506h, this.f20507i);
        }

        public a b(int i10, boolean z10) {
            k4.a.f(!this.f20508j);
            k.j(i10, 0, "backBufferDurationMs", "0");
            this.f20506h = i10;
            this.f20507i = z10;
            return this;
        }

        public a c(int i10, int i11, int i12, int i13) {
            k4.a.f(!this.f20508j);
            k.j(i12, 0, "bufferForPlaybackMs", "0");
            k.j(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
            k.j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            k.j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            k.j(i11, i10, "maxBufferMs", "minBufferMs");
            this.f20500b = i10;
            this.f20501c = i11;
            this.f20502d = i12;
            this.f20503e = i13;
            return this;
        }

        public a d(boolean z10) {
            k4.a.f(!this.f20508j);
            this.f20505g = z10;
            return this;
        }

        public a e(int i10) {
            k4.a.f(!this.f20508j);
            this.f20504f = i10;
            return this;
        }
    }

    public k() {
        this(new q(true, 65536), 50000, 50000, 2500, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, -1, false, 0, false);
    }

    /* access modifiers changed from: private */
    public static void j(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        k4.a.b(z10, str + " cannot be less than " + str2);
    }

    private static int l(int i10) {
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

    private void m(boolean z10) {
        int i10 = this.f20493f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f20497j = i10;
        this.f20498k = false;
        if (z10) {
            this.f20488a.g();
        }
    }

    public boolean a() {
        return this.f20496i;
    }

    public void b(p3[] p3VarArr, z0 z0Var, s[] sVarArr) {
        int i10 = this.f20493f;
        if (i10 == -1) {
            i10 = k(p3VarArr, sVarArr);
        }
        this.f20497j = i10;
        this.f20488a.h(i10);
    }

    public long c() {
        return this.f20495h;
    }

    public void d() {
        m(true);
    }

    public boolean e(long j10, float f10, boolean z10, long j11) {
        long e02 = n0.e0(j10, f10);
        long j12 = z10 ? this.f20492e : this.f20491d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || e02 >= j12 || (!this.f20494g && this.f20488a.f() >= this.f20497j);
    }

    public boolean f(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f20488a.f() >= this.f20497j;
        long j12 = this.f20489b;
        if (f10 > 1.0f) {
            j12 = Math.min(n0.Z(j12, f10), this.f20490c);
        }
        if (j11 < Math.max(j12, 500000)) {
            if (!this.f20494g && z11) {
                z10 = false;
            }
            this.f20498k = z10;
            if (!z10 && j11 < 500000) {
                r.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f20490c || z11) {
            this.f20498k = false;
        }
        return this.f20498k;
    }

    public b g() {
        return this.f20488a;
    }

    public void h() {
        m(true);
    }

    /* access modifiers changed from: protected */
    public int k(p3[] p3VarArr, s[] sVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < p3VarArr.length; i11++) {
            if (sVarArr[i11] != null) {
                i10 += l(p3VarArr[i11].f());
            }
        }
        return Math.max(13107200, i10);
    }

    public void onPrepared() {
        m(false);
    }

    protected k(q qVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        j(i12, 0, "bufferForPlaybackMs", "0");
        j(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i11, i10, "maxBufferMs", "minBufferMs");
        j(i15, 0, "backBufferDurationMs", "0");
        this.f20488a = qVar;
        this.f20489b = n0.C0((long) i10);
        this.f20490c = n0.C0((long) i11);
        this.f20491d = n0.C0((long) i12);
        this.f20492e = n0.C0((long) i13);
        this.f20493f = i14;
        this.f20497j = i14 == -1 ? 13107200 : i14;
        this.f20494g = z10;
        this.f20495h = n0.C0((long) i15);
        this.f20496i = z11;
    }
}
