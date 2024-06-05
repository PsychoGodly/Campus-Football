package o2;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import e3.o;
import j4.a0;
import j4.b0;
import j4.c0;
import j4.q0;
import j4.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import k4.n0;
import k4.y;
import l4.z;
import n2.c3;
import n2.c4;
import n2.e2;
import n2.f3;
import n2.g3;
import n2.h4;
import n2.i;
import n2.q;
import n2.r1;
import n2.y2;
import n2.z1;
import o2.c;
import o2.t1;
import p2.v;
import p3.t;
import p3.x;
import q2.e;
import r2.h;
import r2.m;
import r2.o;
import r2.p0;
import s6.d1;
import s6.u;

/* compiled from: MediaMetricsListener */
public final class s1 implements c, t1.a {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private final Context f21034a;

    /* renamed from: b  reason: collision with root package name */
    private final t1 f21035b;

    /* renamed from: c  reason: collision with root package name */
    private final PlaybackSession f21036c;

    /* renamed from: d  reason: collision with root package name */
    private final long f21037d = SystemClock.elapsedRealtime();

    /* renamed from: e  reason: collision with root package name */
    private final c4.d f21038e = new c4.d();

    /* renamed from: f  reason: collision with root package name */
    private final c4.b f21039f = new c4.b();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, Long> f21040g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, Long> f21041h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private String f21042i;

    /* renamed from: j  reason: collision with root package name */
    private PlaybackMetrics.Builder f21043j;

    /* renamed from: k  reason: collision with root package name */
    private int f21044k;

    /* renamed from: l  reason: collision with root package name */
    private int f21045l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f21046m = 0;

    /* renamed from: n  reason: collision with root package name */
    private c3 f21047n;

    /* renamed from: o  reason: collision with root package name */
    private b f21048o;

    /* renamed from: p  reason: collision with root package name */
    private b f21049p;

    /* renamed from: q  reason: collision with root package name */
    private b f21050q;

    /* renamed from: r  reason: collision with root package name */
    private r1 f21051r;

    /* renamed from: s  reason: collision with root package name */
    private r1 f21052s;

    /* renamed from: t  reason: collision with root package name */
    private r1 f21053t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f21054u;

    /* renamed from: v  reason: collision with root package name */
    private int f21055v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f21056w;

    /* renamed from: x  reason: collision with root package name */
    private int f21057x;

    /* renamed from: y  reason: collision with root package name */
    private int f21058y;

    /* renamed from: z  reason: collision with root package name */
    private int f21059z;

    /* compiled from: MediaMetricsListener */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f21060a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21061b;

        public a(int i10, int i11) {
            this.f21060a = i10;
            this.f21061b = i11;
        }
    }

    /* compiled from: MediaMetricsListener */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final r1 f21062a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21063b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21064c;

        public b(r1 r1Var, int i10, String str) {
            this.f21062a = r1Var;
            this.f21063b = i10;
            this.f21064c = str;
        }
    }

    private s1(Context context, PlaybackSession playbackSession) {
        this.f21034a = context.getApplicationContext();
        this.f21036c = playbackSession;
        r1 r1Var = new r1();
        this.f21035b = r1Var;
        r1Var.g(this);
    }

    private boolean A0(b bVar) {
        return bVar != null && bVar.f21064c.equals(this.f21035b.a());
    }

    public static s1 B0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new s1(context, mediaMetricsManager.createPlaybackSession());
    }

    private void C0() {
        PlaybackMetrics.Builder builder = this.f21043j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f21059z);
            this.f21043j.setVideoFramesDropped(this.f21057x);
            this.f21043j.setVideoFramesPlayed(this.f21058y);
            Long l10 = this.f21040g.get(this.f21042i);
            this.f21043j.setNetworkTransferDurationMillis(l10 == null ? 0 : l10.longValue());
            Long l11 = this.f21041h.get(this.f21042i);
            this.f21043j.setNetworkBytesRead(l11 == null ? 0 : l11.longValue());
            this.f21043j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f21036c.reportPlaybackMetrics(this.f21043j.build());
        }
        this.f21043j = null;
        this.f21042i = null;
        this.f21059z = 0;
        this.f21057x = 0;
        this.f21058y = 0;
        this.f21051r = null;
        this.f21052s = null;
        this.f21053t = null;
        this.A = false;
    }

    private static int D0(int i10) {
        switch (n0.U(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static m E0(u<h4.a> uVar) {
        m mVar;
        d1<h4.a> m10 = uVar.iterator();
        while (m10.hasNext()) {
            h4.a next = m10.next();
            int i10 = 0;
            while (true) {
                if (i10 < next.f20431a) {
                    if (next.f(i10) && (mVar = next.c(i10).f20657p) != null) {
                        return mVar;
                    }
                    i10++;
                }
            }
        }
        return null;
    }

    private static int F0(m mVar) {
        for (int i10 = 0; i10 < mVar.f22080d; i10++) {
            UUID uuid = mVar.e(i10).f22082b;
            if (uuid.equals(i.f20439d)) {
                return 3;
            }
            if (uuid.equals(i.f20440e)) {
                return 2;
            }
            if (uuid.equals(i.f20438c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a G0(c3 c3Var, Context context, boolean z10) {
        boolean z11;
        int i10;
        if (c3Var.f20203a == 1001) {
            return new a(20, 0);
        }
        if (c3Var instanceof q) {
            q qVar = (q) c3Var;
            z11 = qVar.f20619j == 1;
            i10 = qVar.f20623n;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th = (Throwable) k4.a.e(c3Var.getCause());
        if (th instanceof IOException) {
            if (th instanceof c0) {
                return new a(5, ((c0) th).f19295d);
            }
            if ((th instanceof b0) || (th instanceof y2)) {
                return new a(z10 ? 10 : 11, 0);
            } else if ((th instanceof a0) || (th instanceof q0.a)) {
                if (y.d(context).f() == 1) {
                    return new a(3, 0);
                }
                Throwable cause = th.getCause();
                if (cause instanceof UnknownHostException) {
                    return new a(6, 0);
                }
                if (cause instanceof SocketTimeoutException) {
                    return new a(7, 0);
                }
                if (!(th instanceof a0) || ((a0) th).f19288c != 1) {
                    return new a(8, 0);
                }
                return new a(4, 0);
            } else if (c3Var.f20203a == 1002) {
                return new a(21, 0);
            } else {
                if (th instanceof o.a) {
                    Throwable th2 = (Throwable) k4.a.e(th.getCause());
                    int i11 = n0.f19738a;
                    if (i11 >= 21 && (th2 instanceof MediaDrm.MediaDrmStateException)) {
                        int V = n0.V(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                        return new a(D0(V), V);
                    } else if (i11 >= 23 && (th2 instanceof MediaDrmResetException)) {
                        return new a(27, 0);
                    } else {
                        if (i11 >= 18 && (th2 instanceof NotProvisionedException)) {
                            return new a(24, 0);
                        }
                        if (i11 >= 18 && (th2 instanceof DeniedByServerException)) {
                            return new a(29, 0);
                        }
                        if (th2 instanceof p0) {
                            return new a(23, 0);
                        }
                        if (th2 instanceof h.e) {
                            return new a(28, 0);
                        }
                        return new a(30, 0);
                    }
                } else if (!(th instanceof y.b) || !(th.getCause() instanceof FileNotFoundException)) {
                    return new a(9, 0);
                } else {
                    Throwable cause2 = ((Throwable) k4.a.e(th.getCause())).getCause();
                    if (n0.f19738a < 21 || !(cause2 instanceof ErrnoException) || ((ErrnoException) cause2).errno != OsConstants.EACCES) {
                        return new a(31, 0);
                    }
                    return new a(32, 0);
                }
            }
        } else if (z11 && (i10 == 0 || i10 == 1)) {
            return new a(35, 0);
        } else {
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th instanceof o.b) {
                return new a(13, n0.V(((o.b) th).f17905d));
            }
            if (th instanceof e3.m) {
                return new a(14, n0.V(((e3.m) th).f17852b));
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof v.b) {
                return new a(17, ((v.b) th).f21343a);
            }
            if (th instanceof v.e) {
                return new a(18, ((v.e) th).f21348a);
            }
            if (n0.f19738a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(D0(errorCode), errorCode);
        }
    }

    private static Pair<String, String> H0(String str) {
        String[] R0 = n0.R0(str, "-");
        return Pair.create(R0[0], R0.length >= 2 ? R0[1] : null);
    }

    private static int J0(Context context) {
        switch (k4.y.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
            default:
                return 1;
        }
    }

    private static int K0(z1 z1Var) {
        z1.h hVar = z1Var.f20785b;
        if (hVar == null) {
            return 0;
        }
        int p02 = n0.p0(hVar.f20859a, hVar.f20860b);
        if (p02 == 0) {
            return 3;
        }
        if (p02 != 1) {
            return p02 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int L0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void M0(c.b bVar) {
        for (int i10 = 0; i10 < bVar.d(); i10++) {
            int b10 = bVar.b(i10);
            c.a c10 = bVar.c(b10);
            if (b10 == 0) {
                this.f21035b.e(c10);
            } else if (b10 == 11) {
                this.f21035b.f(c10, this.f21044k);
            } else {
                this.f21035b.c(c10);
            }
        }
    }

    private void N0(long j10) {
        int J0 = J0(this.f21034a);
        if (J0 != this.f21046m) {
            this.f21046m = J0;
            this.f21036c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(J0).setTimeSinceCreatedMillis(j10 - this.f21037d).build());
        }
    }

    private void O0(long j10) {
        c3 c3Var = this.f21047n;
        if (c3Var != null) {
            a G0 = G0(c3Var, this.f21034a, this.f21055v == 4);
            this.f21036c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f21037d).setErrorCode(G0.f21060a).setSubErrorCode(G0.f21061b).setException(c3Var).build());
            this.A = true;
            this.f21047n = null;
        }
    }

    private void P0(g3 g3Var, c.b bVar, long j10) {
        if (g3Var.b() != 2) {
            this.f21054u = false;
        }
        if (g3Var.v() == null) {
            this.f21056w = false;
        } else if (bVar.a(10)) {
            this.f21056w = true;
        }
        int X0 = X0(g3Var);
        if (this.f21045l != X0) {
            this.f21045l = X0;
            this.A = true;
            this.f21036c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f21045l).setTimeSinceCreatedMillis(j10 - this.f21037d).build());
        }
    }

    private void Q0(g3 g3Var, c.b bVar, long j10) {
        if (bVar.a(2)) {
            h4 C = g3Var.C();
            boolean c10 = C.c(2);
            boolean c11 = C.c(1);
            boolean c12 = C.c(3);
            if (c10 || c11 || c12) {
                if (!c10) {
                    V0(j10, (r1) null, 0);
                }
                if (!c11) {
                    R0(j10, (r1) null, 0);
                }
                if (!c12) {
                    T0(j10, (r1) null, 0);
                }
            }
        }
        if (A0(this.f21048o)) {
            b bVar2 = this.f21048o;
            r1 r1Var = bVar2.f21062a;
            if (r1Var.f20660s != -1) {
                V0(j10, r1Var, bVar2.f21063b);
                this.f21048o = null;
            }
        }
        if (A0(this.f21049p)) {
            b bVar3 = this.f21049p;
            R0(j10, bVar3.f21062a, bVar3.f21063b);
            this.f21049p = null;
        }
        if (A0(this.f21050q)) {
            b bVar4 = this.f21050q;
            T0(j10, bVar4.f21062a, bVar4.f21063b);
            this.f21050q = null;
        }
    }

    private void R0(long j10, r1 r1Var, int i10) {
        if (!n0.c(this.f21052s, r1Var)) {
            int i11 = (this.f21052s == null && i10 == 0) ? 1 : i10;
            this.f21052s = r1Var;
            W0(0, j10, r1Var, i11);
        }
    }

    private void S0(g3 g3Var, c.b bVar) {
        m E0;
        if (bVar.a(0)) {
            c.a c10 = bVar.c(0);
            if (this.f21043j != null) {
                U0(c10.f20992b, c10.f20994d);
            }
        }
        if (!(!bVar.a(2) || this.f21043j == null || (E0 = E0(g3Var.C().b())) == null)) {
            ((PlaybackMetrics.Builder) n0.j(this.f21043j)).setDrmType(F0(E0));
        }
        if (bVar.a(1011)) {
            this.f21059z++;
        }
    }

    private void T0(long j10, r1 r1Var, int i10) {
        if (!n0.c(this.f21053t, r1Var)) {
            int i11 = (this.f21053t == null && i10 == 0) ? 1 : i10;
            this.f21053t = r1Var;
            W0(2, j10, r1Var, i11);
        }
    }

    private void U0(c4 c4Var, x.b bVar) {
        int f10;
        PlaybackMetrics.Builder builder = this.f21043j;
        if (bVar != null && (f10 = c4Var.f(bVar.f21677a)) != -1) {
            c4Var.j(f10, this.f21039f);
            c4Var.r(this.f21039f.f20218c, this.f21038e);
            builder.setStreamType(K0(this.f21038e.f20237c));
            c4.d dVar = this.f21038e;
            if (dVar.f20248o != -9223372036854775807L && !dVar.f20246m && !dVar.f20243j && !dVar.h()) {
                builder.setMediaDurationMillis(this.f21038e.f());
            }
            builder.setPlaybackType(this.f21038e.h() ? 2 : 1);
            this.A = true;
        }
    }

    private void V0(long j10, r1 r1Var, int i10) {
        if (!n0.c(this.f21051r, r1Var)) {
            int i11 = (this.f21051r == null && i10 == 0) ? 1 : i10;
            this.f21051r = r1Var;
            W0(1, j10, r1Var, i11);
        }
    }

    private void W0(int i10, long j10, r1 r1Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f21037d);
        if (r1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(L0(i11));
            String str = r1Var.f20653l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = r1Var.f20654m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = r1Var.f20651j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = r1Var.f20650i;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = r1Var.f20659r;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = r1Var.f20660s;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = r1Var.f20667z;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = r1Var.A;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = r1Var.f20645c;
            if (str4 != null) {
                Pair<String, String> H0 = H0(str4);
                timeSinceCreatedMillis.setLanguage((String) H0.first);
                Object obj = H0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = r1Var.f20661t;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f21036c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int X0(g3 g3Var) {
        int b10 = g3Var.b();
        if (this.f21054u) {
            return 5;
        }
        if (this.f21056w) {
            return 13;
        }
        if (b10 == 4) {
            return 11;
        }
        if (b10 == 2) {
            int i10 = this.f21045l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (!g3Var.m()) {
                return 7;
            }
            return g3Var.I() != 0 ? 10 : 6;
        } else if (b10 == 3) {
            if (!g3Var.m()) {
                return 4;
            }
            if (g3Var.I() != 0) {
                return 9;
            }
            return 3;
        } else if (b10 != 1 || this.f21045l == 0) {
            return this.f21045l;
        } else {
            return 12;
        }
    }

    public /* synthetic */ void A(c.a aVar, int i10) {
        b.V(this, aVar, i10);
    }

    public /* synthetic */ void B(c.a aVar, String str, long j10, long j11) {
        b.g0(this, aVar, str, j10, j11);
    }

    public /* synthetic */ void C(c.a aVar, float f10) {
        b.n0(this, aVar, f10);
    }

    public /* synthetic */ void D(c.a aVar, Object obj, long j10) {
        b.U(this, aVar, obj, j10);
    }

    public void E(c.a aVar, String str) {
        x.b bVar = aVar.f20994d;
        if (bVar == null || !bVar.b()) {
            C0();
            this.f21042i = str;
            this.f21043j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.7");
            U0(aVar.f20992b, aVar.f20994d);
        }
    }

    public /* synthetic */ void F(c.a aVar, Exception exc) {
        b.k(this, aVar, exc);
    }

    public /* synthetic */ void G(c.a aVar, t tVar) {
        b.d0(this, aVar, tVar);
    }

    public /* synthetic */ void H(c.a aVar, e eVar) {
        b.i0(this, aVar, eVar);
    }

    public void I(c.a aVar, z zVar) {
        b bVar = this.f21048o;
        if (bVar != null) {
            r1 r1Var = bVar.f21062a;
            if (r1Var.f20660s == -1) {
                this.f21048o = new b(r1Var.b().n0(zVar.f20004a).S(zVar.f20005b).G(), bVar.f21063b, bVar.f21064c);
            }
        }
    }

    public LogSessionId I0() {
        return this.f21036c.getSessionId();
    }

    public /* synthetic */ void J(c.a aVar, boolean z10) {
        b.Y(this, aVar, z10);
    }

    public /* synthetic */ void K(c.a aVar, int i10) {
        b.O(this, aVar, i10);
    }

    public /* synthetic */ void L(c.a aVar, long j10) {
        b.j(this, aVar, j10);
    }

    public /* synthetic */ void M(c.a aVar, z1 z1Var, int i10) {
        b.J(this, aVar, z1Var, i10);
    }

    public /* synthetic */ void N(c.a aVar, boolean z10, int i10) {
        b.M(this, aVar, z10, i10);
    }

    public /* synthetic */ void O(c.a aVar, p2.e eVar) {
        b.a(this, aVar, eVar);
    }

    public /* synthetic */ void P(c.a aVar, int i10, long j10) {
        b.C(this, aVar, i10, j10);
    }

    public /* synthetic */ void Q(c.a aVar, int i10, long j10, long j11) {
        b.l(this, aVar, i10, j10, j11);
    }

    public /* synthetic */ void R(c.a aVar, p3.q qVar, t tVar) {
        b.F(this, aVar, qVar, tVar);
    }

    public /* synthetic */ void S(c.a aVar, int i10, String str, long j10) {
        b.r(this, aVar, i10, str, j10);
    }

    public /* synthetic */ void T(c.a aVar, int i10) {
        b.z(this, aVar, i10);
    }

    public /* synthetic */ void U(c.a aVar, int i10, int i11) {
        b.a0(this, aVar, i10, i11);
    }

    public /* synthetic */ void V(c.a aVar, p3.q qVar, t tVar) {
        b.G(this, aVar, qVar, tVar);
    }

    public void W(c.a aVar, String str, String str2) {
    }

    public void X(c.a aVar, int i10, long j10, long j11) {
        long j12;
        x.b bVar = aVar.f20994d;
        if (bVar != null) {
            String b10 = this.f21035b.b(aVar.f20992b, (x.b) k4.a.e(bVar));
            Long l10 = this.f21041h.get(b10);
            Long l11 = this.f21040g.get(b10);
            HashMap<String, Long> hashMap = this.f21041h;
            long j13 = 0;
            if (l10 == null) {
                j12 = 0;
            } else {
                j12 = l10.longValue();
            }
            hashMap.put(b10, Long.valueOf(j12 + j10));
            HashMap<String, Long> hashMap2 = this.f21040g;
            if (l11 != null) {
                j13 = l11.longValue();
            }
            hashMap2.put(b10, Long.valueOf(j13 + ((long) i10)));
        }
    }

    public void Y(c.a aVar, c3 c3Var) {
        this.f21047n = c3Var;
    }

    public /* synthetic */ void Z(c.a aVar, c3 c3Var) {
        b.Q(this, aVar, c3Var);
    }

    public /* synthetic */ void a(c.a aVar, r1 r1Var, q2.i iVar) {
        b.l0(this, aVar, r1Var, iVar);
    }

    public /* synthetic */ void a0(c.a aVar, Exception exc) {
        b.A(this, aVar, exc);
    }

    public /* synthetic */ void b(c.a aVar, int i10, boolean z10) {
        b.u(this, aVar, i10, z10);
    }

    public /* synthetic */ void b0(c.a aVar, int i10, e eVar) {
        b.p(this, aVar, i10, eVar);
    }

    public /* synthetic */ void c(c.a aVar, int i10, int i11, int i12, float f10) {
        b.m0(this, aVar, i10, i11, i12, f10);
    }

    public /* synthetic */ void c0(c.a aVar, boolean z10, int i10) {
        b.S(this, aVar, z10, i10);
    }

    public /* synthetic */ void d(c.a aVar) {
        b.x(this, aVar);
    }

    public /* synthetic */ void d0(c.a aVar, boolean z10) {
        b.I(this, aVar, z10);
    }

    public void e(c.a aVar, g3.e eVar, g3.e eVar2, int i10) {
        if (i10 == 1) {
            this.f21054u = true;
        }
        this.f21044k = i10;
    }

    public /* synthetic */ void e0(c.a aVar, int i10) {
        b.b0(this, aVar, i10);
    }

    public /* synthetic */ void f(c.a aVar) {
        b.B(this, aVar);
    }

    public /* synthetic */ void f0(c.a aVar, int i10, e eVar) {
        b.q(this, aVar, i10, eVar);
    }

    public /* synthetic */ void g(c.a aVar, Exception exc) {
        b.e0(this, aVar, exc);
    }

    public /* synthetic */ void g0(c.a aVar, r1 r1Var, q2.i iVar) {
        b.i(this, aVar, r1Var, iVar);
    }

    public /* synthetic */ void h(c.a aVar, r1 r1Var) {
        b.k0(this, aVar, r1Var);
    }

    public /* synthetic */ void h0(c.a aVar, f3 f3Var) {
        b.N(this, aVar, f3Var);
    }

    public void i(c.a aVar, e eVar) {
        this.f21057x += eVar.f21748g;
        this.f21058y += eVar.f21746e;
    }

    public /* synthetic */ void i0(c.a aVar, h4 h4Var) {
        b.c0(this, aVar, h4Var);
    }

    public /* synthetic */ void j(c.a aVar, long j10, int i10) {
        b.j0(this, aVar, j10, i10);
    }

    public /* synthetic */ void j0(c.a aVar, e eVar) {
        b.g(this, aVar, eVar);
    }

    public /* synthetic */ void k(c.a aVar) {
        b.y(this, aVar);
    }

    public /* synthetic */ void k0(c.a aVar) {
        b.W(this, aVar);
    }

    public /* synthetic */ void l(c.a aVar, String str) {
        b.e(this, aVar, str);
    }

    public /* synthetic */ void l0(c.a aVar, int i10) {
        b.T(this, aVar, i10);
    }

    public /* synthetic */ void m(c.a aVar) {
        b.w(this, aVar);
    }

    public /* synthetic */ void m0(c.a aVar) {
        b.X(this, aVar);
    }

    public /* synthetic */ void n(c.a aVar, g3.b bVar) {
        b.m(this, aVar, bVar);
    }

    public /* synthetic */ void n0(c.a aVar, boolean z10) {
        b.Z(this, aVar, z10);
    }

    public /* synthetic */ void o(c.a aVar, int i10) {
        b.P(this, aVar, i10);
    }

    public /* synthetic */ void o0(c.a aVar, boolean z10) {
        b.D(this, aVar, z10);
    }

    public /* synthetic */ void p(c.a aVar, boolean z10) {
        b.E(this, aVar, z10);
    }

    public void p0(c.a aVar, String str, boolean z10) {
        x.b bVar = aVar.f20994d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f21042i)) {
            C0();
        }
        this.f21040g.remove(str);
        this.f21041h.remove(str);
    }

    public /* synthetic */ void q(c.a aVar) {
        b.v(this, aVar);
    }

    public void q0(c.a aVar, p3.q qVar, t tVar, IOException iOException, boolean z10) {
        this.f21055v = tVar.f21642a;
    }

    public /* synthetic */ void r(c.a aVar, String str) {
        b.h0(this, aVar, str);
    }

    public void r0(c.a aVar, t tVar) {
        if (aVar.f20994d != null) {
            b bVar = new b((r1) k4.a.e(tVar.f21644c), tVar.f21645d, this.f21035b.b(aVar.f20992b, (x.b) k4.a.e(aVar.f20994d)));
            int i10 = tVar.f21643b;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f21049p = bVar;
                    return;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        this.f21050q = bVar;
                        return;
                    }
                    return;
                }
            }
            this.f21048o = bVar;
        }
    }

    public /* synthetic */ void s(c.a aVar, e eVar) {
        b.f(this, aVar, eVar);
    }

    public /* synthetic */ void s0(c.a aVar, int i10, r1 r1Var) {
        b.s(this, aVar, i10, r1Var);
    }

    public void t(c.a aVar, String str) {
    }

    public /* synthetic */ void t0(c.a aVar, List list) {
        b.n(this, aVar, list);
    }

    public /* synthetic */ void u(c.a aVar, p3.q qVar, t tVar) {
        b.H(this, aVar, qVar, tVar);
    }

    public /* synthetic */ void u0(c.a aVar, String str, long j10) {
        b.f0(this, aVar, str, j10);
    }

    public /* synthetic */ void v(c.a aVar, e2 e2Var) {
        b.K(this, aVar, e2Var);
    }

    public void v0(g3 g3Var, c.b bVar) {
        if (bVar.d() != 0) {
            M0(bVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            S0(g3Var, bVar);
            O0(elapsedRealtime);
            Q0(g3Var, bVar, elapsedRealtime);
            N0(elapsedRealtime);
            P0(g3Var, bVar, elapsedRealtime);
            if (bVar.a(1028)) {
                this.f21035b.d(bVar.c(1028));
            }
        }
    }

    public /* synthetic */ void w(c.a aVar) {
        b.R(this, aVar);
    }

    public /* synthetic */ void w0(c.a aVar, n2.o oVar) {
        b.t(this, aVar, oVar);
    }

    public /* synthetic */ void x(c.a aVar, f3.a aVar2) {
        b.L(this, aVar, aVar2);
    }

    public /* synthetic */ void x0(c.a aVar, String str, long j10) {
        b.c(this, aVar, str, j10);
    }

    public /* synthetic */ void y(c.a aVar, String str, long j10, long j11) {
        b.d(this, aVar, str, j10, j11);
    }

    public /* synthetic */ void y0(c.a aVar, y3.e eVar) {
        b.o(this, aVar, eVar);
    }

    public /* synthetic */ void z(c.a aVar, r1 r1Var) {
        b.h(this, aVar, r1Var);
    }

    public /* synthetic */ void z0(c.a aVar, Exception exc) {
        b.b(this, aVar, exc);
    }
}
