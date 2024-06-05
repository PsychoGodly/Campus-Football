package ua;

import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.unity3d.ads.metadata.MediationMetaData;
import f3.a;
import f3.f;
import j4.l;
import j4.t;
import j4.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import k4.n0;
import l4.z;
import lc.k;
import n2.c3;
import n2.c4;
import n2.e2;
import n2.f3;
import n2.g3;
import n2.h4;
import n2.i3;
import n2.j;
import n2.k;
import n2.m;
import n2.o;
import n2.q;
import n2.s;
import n2.w1;
import n2.x1;
import n2.z1;
import p2.e;
import p3.l0;
import p3.s0;
import p3.t0;
import p3.x;
import p3.x0;
import s2.i;
import s2.r;

/* compiled from: AudioPlayer */
public class d implements k.c, g3.d, f {
    private static Random I = new Random();
    private int A = 0;
    private Map<String, Object> B;
    /* access modifiers changed from: private */
    public s C;
    private Integer D;
    private x E;
    private Integer F;
    /* access modifiers changed from: private */
    public final Handler G = new Handler(Looper.getMainLooper());
    private final Runnable H = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f22986a;

    /* renamed from: b  reason: collision with root package name */
    private final k f22987b;

    /* renamed from: c  reason: collision with root package name */
    private final e f22988c;

    /* renamed from: d  reason: collision with root package name */
    private final e f22989d;

    /* renamed from: f  reason: collision with root package name */
    private c f22990f;

    /* renamed from: g  reason: collision with root package name */
    private long f22991g;

    /* renamed from: h  reason: collision with root package name */
    private long f22992h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public long f22993i;

    /* renamed from: j  reason: collision with root package name */
    private Long f22994j;

    /* renamed from: k  reason: collision with root package name */
    private long f22995k;

    /* renamed from: l  reason: collision with root package name */
    private Integer f22996l;

    /* renamed from: m  reason: collision with root package name */
    private k.d f22997m;

    /* renamed from: n  reason: collision with root package name */
    private k.d f22998n;

    /* renamed from: o  reason: collision with root package name */
    private k.d f22999o;

    /* renamed from: p  reason: collision with root package name */
    private Map<String, x> f23000p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private j3.c f23001q;

    /* renamed from: r  reason: collision with root package name */
    private j3.b f23002r;

    /* renamed from: s  reason: collision with root package name */
    private int f23003s;

    /* renamed from: t  reason: collision with root package name */
    private e f23004t;

    /* renamed from: u  reason: collision with root package name */
    private x1 f23005u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f23006v;

    /* renamed from: w  reason: collision with root package name */
    private w1 f23007w;

    /* renamed from: x  reason: collision with root package name */
    private List<Object> f23008x;

    /* renamed from: y  reason: collision with root package name */
    private List<AudioEffect> f23009y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private Map<String, AudioEffect> f23010z = new HashMap();

    /* compiled from: AudioPlayer */
    class a implements Runnable {
        a() {
        }

        public void run() {
            if (d.this.C != null) {
                if (d.this.C.y() != d.this.f22993i) {
                    d.this.i0();
                }
                int b10 = d.this.C.b();
                if (b10 == 2) {
                    d.this.G.postDelayed(this, 200);
                } else if (b10 == 3) {
                    if (d.this.C.m()) {
                        d.this.G.postDelayed(this, 500);
                    } else {
                        d.this.G.postDelayed(this, 1000);
                    }
                }
            }
        }
    }

    /* compiled from: AudioPlayer */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23012a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                ua.d$c[] r0 = ua.d.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23012a = r0
                ua.d$c r1 = ua.d.c.none     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23012a     // Catch:{ NoSuchFieldError -> 0x001d }
                ua.d$c r1 = ua.d.c.loading     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ua.d.b.<clinit>():void");
        }
    }

    /* compiled from: AudioPlayer */
    enum c {
        none,
        loading,
        buffering,
        ready,
        completed
    }

    public d(Context context, lc.c cVar, String str, Map<?, ?> map, List<Object> list, Boolean bool) {
        this.f22986a = context;
        this.f23008x = list;
        this.f23006v = bool != null ? bool.booleanValue() : false;
        k kVar = new k(cVar, "com.ryanheise.just_audio.methods." + str);
        this.f22987b = kVar;
        kVar.e(this);
        this.f22988c = new e(cVar, "com.ryanheise.just_audio.events." + str);
        this.f22989d = new e(cVar, "com.ryanheise.just_audio.data." + str);
        this.f22990f = c.none;
        if (map != null) {
            Map map2 = (Map) map.get("androidLoadControl");
            if (map2 != null) {
                k.a b10 = new k.a().c((int) (J0(map2.get("minBufferDuration")).longValue() / 1000), (int) (J0(map2.get("maxBufferDuration")).longValue() / 1000), (int) (J0(map2.get("bufferForPlaybackDuration")).longValue() / 1000), (int) (J0(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000)).d(((Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue()).b((int) (J0(map2.get("backBufferDuration")).longValue() / 1000), false);
                if (map2.get("targetBufferBytes") != null) {
                    b10.e(((Integer) map2.get("targetBufferBytes")).intValue());
                }
                this.f23005u = b10.a();
            }
            Map map3 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                this.f23007w = new j.b().c((float) ((Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue()).b((float) ((Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue()).f(J0(map3.get("minUpdateInterval")).longValue() / 1000).g((float) ((Double) map3.get("proportionalControlFactor")).doubleValue()).d(J0(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000).h(J0(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000).e((float) ((Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue()).a();
            }
        }
    }

    private void A0() {
        new HashMap();
        this.B = v0();
    }

    private void B0() {
        if (this.C == null) {
            s.b bVar = new s.b(this.f22986a);
            x1 x1Var = this.f23005u;
            if (x1Var != null) {
                bVar.o(x1Var);
            }
            w1 w1Var = this.f23007w;
            if (w1Var != null) {
                bVar.n(w1Var);
            }
            if (this.f23006v) {
                bVar.p(new m(this.f22986a).j(true));
            }
            s g10 = bVar.g();
            this.C = g10;
            g10.D(this.f23006v);
            X0(this.C.getAudioSessionId());
            this.C.u(this);
        }
    }

    private Map<String, Object> C0() {
        Equalizer equalizer = (Equalizer) this.f23010z.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s10 = 0; s10 < equalizer.getNumberOfBands(); s10 = (short) (s10 + 1)) {
            arrayList.add(Q0("index", Short.valueOf(s10), "lowerFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s10)[0]) / 1000.0d), "upperFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s10)[1]) / 1000.0d), "centerFrequency", Double.valueOf(((double) equalizer.getCenterFreq(s10)) / 1000.0d), "gain", Double.valueOf(((double) equalizer.getBandLevel(s10)) / 1000.0d)));
        }
        return Q0("parameters", Q0("minDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[0]) / 1000.0d), "maxDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[1]) / 1000.0d), "bands", arrayList));
    }

    private void D0(int i10, double d10) {
        ((Equalizer) this.f23010z.get("AndroidEqualizer")).setBandLevel((short) i10, (short) ((int) Math.round(d10 * 1000.0d)));
    }

    private x E0(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        x xVar = this.f23000p.get(str);
        if (xVar != null) {
            return xVar;
        }
        x x02 = x0(map);
        this.f23000p.put(str, x02);
        return x02;
    }

    private List<x> F0(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                arrayList.add(E0(list.get(i10)));
            }
            return arrayList;
        }
        throw new RuntimeException("List expected: " + obj);
    }

    private x[] G0(Object obj) {
        List<x> F0 = F0(obj);
        x[] xVarArr = new x[F0.size()];
        F0.toArray(xVarArr);
        return xVarArr;
    }

    private long H0() {
        long j10 = this.f22995k;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        c cVar = this.f22990f;
        if (cVar == c.none || cVar == c.loading) {
            long currentPosition = this.C.getCurrentPosition();
            if (currentPosition < 0) {
                return 0;
            }
            return currentPosition;
        }
        Long l10 = this.f22994j;
        if (l10 == null || l10.longValue() == -9223372036854775807L) {
            return this.C.getCurrentPosition();
        }
        return this.f22994j.longValue();
    }

    private long I0() {
        s sVar;
        c cVar = this.f22990f;
        if (cVar == c.none || cVar == c.loading || (sVar = this.C) == null) {
            return -9223372036854775807L;
        }
        return sVar.getDuration();
    }

    public static Long J0(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf((long) ((Integer) obj).intValue());
    }

    private void N0(x xVar, long j10, Integer num, k.d dVar) {
        this.f22995k = j10;
        this.f22996l = num;
        this.F = Integer.valueOf(num != null ? num.intValue() : 0);
        int i10 = b.f23012a[this.f22990f.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                this.C.stop();
            } else {
                T();
                this.C.stop();
            }
        }
        this.f23003s = 0;
        this.f22997m = dVar;
        h1();
        this.f22990f = c.loading;
        A0();
        this.E = xVar;
        this.C.o(xVar);
        this.C.a();
    }

    private void O0(double d10) {
        ((LoudnessEnhancer) this.f23010z.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d10 * 1000.0d));
    }

    static <T> T P0(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    static Map<String, Object> Q0(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            hashMap.put(objArr[i10], objArr[i10 + 1]);
        }
        return hashMap;
    }

    private void T() {
        U0("abort", "Connection aborted");
    }

    private void U() {
        k.d dVar = this.f22999o;
        if (dVar != null) {
            try {
                dVar.success(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f22999o = null;
            this.f22994j = null;
        }
    }

    private void U0(String str, String str2) {
        V0(str, str2, (Object) null);
    }

    private void V0(String str, String str2, Object obj) {
        k.d dVar = this.f22997m;
        if (dVar != null) {
            dVar.error(str, str2, obj);
            this.f22997m = null;
        }
        this.f22988c.error(str, str2, obj);
    }

    private void W0(int i10, int i11, int i12) {
        e.C0223e eVar = new e.C0223e();
        eVar.c(i10);
        eVar.d(i11);
        eVar.f(i12);
        e a10 = eVar.a();
        if (this.f22990f == c.loading) {
            this.f23004t = a10;
        } else {
            this.C.L(a10, false);
        }
    }

    private void X0(int i10) {
        if (i10 == 0) {
            this.D = null;
        } else {
            this.D = Integer.valueOf(i10);
        }
        r0();
        if (this.D != null) {
            for (Object next : this.f23008x) {
                Map map = (Map) next;
                AudioEffect w02 = w0(next, this.D.intValue());
                if (((Boolean) map.get("enabled")).booleanValue()) {
                    w02.setEnabled(true);
                }
                this.f23009y.add(w02);
                this.f23010z.put((String) map.get("type"), w02);
            }
        }
        A0();
    }

    private void b1(Object obj) {
        Map map = (Map) obj;
        x xVar = this.f23000p.get((String) P0(map, "id"));
        if (xVar != null) {
            String str = (String) P0(map, "type");
            str.hashCode();
            if (str.equals("concatenating")) {
                ((p3.k) xVar).u0(y0((List) P0(map, "shuffleOrder")));
                for (Object b12 : (List) P0(map, "children")) {
                    b1(b12);
                }
            } else if (str.equals("looping")) {
                b1(P0(map, "child"));
            }
        }
    }

    private void f1() {
        this.G.removeCallbacks(this.H);
        this.G.post(this.H);
    }

    private void g0(String str, boolean z10) {
        this.f23010z.get(str).setEnabled(z10);
    }

    private boolean g1() {
        Integer valueOf = Integer.valueOf(this.C.G());
        if (valueOf.equals(this.F)) {
            return false;
        }
        this.F = valueOf;
        return true;
    }

    private void h1() {
        this.f22991g = H0();
        this.f22992h = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    public void i0() {
        A0();
        k0();
    }

    private boolean i1() {
        if (H0() == this.f22991g) {
            return false;
        }
        this.f22991g = H0();
        this.f22992h = System.currentTimeMillis();
        return true;
    }

    private void k0() {
        Map<String, Object> map = this.B;
        if (map != null) {
            this.f22988c.success(map);
            this.B = null;
        }
    }

    private l.a m0(Map<?, ?> map) {
        String str;
        Map<String, String> q02 = q0(map);
        if (q02 != null) {
            str = q02.remove("User-Agent");
            if (str == null) {
                str = q02.remove("user-agent");
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = n0.l0(this.f22986a, "just_audio");
        }
        u.b c10 = new u.b().e(str).c(true);
        if (q02 != null && q02.size() > 0) {
            c10.d(q02);
        }
        return new t.a(this.f22986a, c10);
    }

    private i o0(Map<?, ?> map) {
        int i10;
        boolean z10;
        boolean z11;
        Map map2;
        i iVar = new i();
        if (map == null || (map2 = (Map) map.get("androidExtractorOptions")) == null) {
            i10 = 0;
            z11 = true;
            z10 = false;
        } else {
            z11 = ((Boolean) map2.get("constantBitrateSeekingEnabled")).booleanValue();
            z10 = ((Boolean) map2.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
            i10 = ((Integer) map2.get("mp3Flags")).intValue();
        }
        iVar.i(z11);
        iVar.h(z10);
        iVar.j(i10);
        return iVar;
    }

    static Map<String, String> q0(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Object next : map.keySet()) {
            hashMap.put((String) next, (String) map.get(next));
        }
        return hashMap;
    }

    private void r0() {
        Iterator<AudioEffect> it = this.f23009y.iterator();
        while (it.hasNext()) {
            it.next().release();
            it.remove();
        }
        this.f23010z.clear();
    }

    private Map<String, Object> s0() {
        HashMap hashMap = new HashMap();
        if (this.f23001q != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("title", this.f23001q.f19283b);
            hashMap2.put("url", this.f23001q.f19284c);
            hashMap.put("info", hashMap2);
        }
        if (this.f23002r != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("bitrate", Integer.valueOf(this.f23002r.f19276a));
            hashMap3.put("genre", this.f23002r.f19277b);
            hashMap3.put(MediationMetaData.KEY_NAME, this.f23002r.f19278c);
            hashMap3.put("metadataInterval", Integer.valueOf(this.f23002r.f19281g));
            hashMap3.put("url", this.f23002r.f19279d);
            hashMap3.put("isPublic", Boolean.valueOf(this.f23002r.f19280f));
            hashMap.put("headers", hashMap3);
        }
        return hashMap;
    }

    private void t0() {
        this.f22994j = null;
        this.f22999o.success(new HashMap());
        this.f22999o = null;
    }

    private p3.k u0(Object obj) {
        return (p3.k) this.f23000p.get((String) obj);
    }

    private Map<String, Object> v0() {
        HashMap hashMap = new HashMap();
        Long valueOf = I0() == -9223372036854775807L ? null : Long.valueOf(I0() * 1000);
        s sVar = this.C;
        this.f22993i = sVar != null ? sVar.y() : 0;
        hashMap.put("processingState", Integer.valueOf(this.f22990f.ordinal()));
        hashMap.put("updatePosition", Long.valueOf(this.f22991g * 1000));
        hashMap.put("updateTime", Long.valueOf(this.f22992h));
        hashMap.put("bufferedPosition", Long.valueOf(Math.max(this.f22991g, this.f22993i) * 1000));
        hashMap.put("icyMetadata", s0());
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.F);
        hashMap.put("androidAudioSessionId", this.D);
        return hashMap;
    }

    private AudioEffect w0(Object obj, int i10) {
        Map map = (Map) obj;
        String str = (String) map.get("type");
        str.hashCode();
        if (str.equals("AndroidEqualizer")) {
            return new Equalizer(0, i10);
        }
        if (!str.equals("AndroidLoudnessEnhancer")) {
            throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
        } else if (Build.VERSION.SDK_INT >= 19) {
            int round = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 1000.0d);
            LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(i10);
            loudnessEnhancer.setTargetGain(round);
            return loudnessEnhancer;
        } else {
            throw new RuntimeException("AndroidLoudnessEnhancer requires minSdkVersion >= 19");
        }
    }

    private x x0(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        String str2 = (String) map.get("type");
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -445916622:
                if (str2.equals("concatenating")) {
                    c10 = 0;
                    break;
                }
                break;
            case 103407:
                if (str2.equals("hls")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3075986:
                if (str2.equals("dash")) {
                    c10 = 2;
                    break;
                }
                break;
            case 349937342:
                if (str2.equals("looping")) {
                    c10 = 3;
                    break;
                }
                break;
            case 918617282:
                if (str2.equals("clipping")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1131547531:
                if (str2.equals("progressive")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092627105:
                if (str2.equals("silence")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new p3.k(false, ((Boolean) map.get("useLazyPreparation")).booleanValue(), y0((List) P0(map, "shuffleOrder")), G0(map.get("children")));
            case 1:
                return new HlsMediaSource.Factory(m0((Map) P0(map, "headers"))).a(new z1.c().f(Uri.parse((String) map.get("uri"))).d("application/x-mpegURL").a());
            case 2:
                return new DashMediaSource.Factory(m0((Map) P0(map, "headers"))).a(new z1.c().f(Uri.parse((String) map.get("uri"))).d("application/dash+xml").e(str).a());
            case 3:
                x E0 = E0(map.get("child"));
                int intValue = ((Integer) map.get("count")).intValue();
                x[] xVarArr = new x[intValue];
                for (int i10 = 0; i10 < intValue; i10++) {
                    xVarArr[i10] = E0;
                }
                return new p3.k(xVarArr);
            case 4:
                Long J0 = J0(map.get("start"));
                Long J02 = J0(map.get("end"));
                return new p3.e(E0(map.get("child")), J0 != null ? J0.longValue() : 0, J02 != null ? J02.longValue() : Long.MIN_VALUE);
            case 5:
                return new l0.b(m0((Map) P0(map, "headers")), (r) o0((Map) P0(map, "options"))).b(new z1.c().f(Uri.parse((String) map.get("uri"))).e(str).a());
            case 6:
                return new t0.b().b(J0(map.get("duration")).longValue()).c(str).a();
            default:
                throw new IllegalArgumentException("Unknown AudioSource type: " + map.get("type"));
        }
    }

    private s0 y0(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = list.get(i10).intValue();
        }
        return new s0.a(iArr, I.nextLong());
    }

    public void A(g3.e eVar, g3.e eVar2, int i10) {
        h1();
        if (i10 == 0 || i10 == 1) {
            g1();
        }
        i0();
    }

    public /* synthetic */ void B(boolean z10) {
        i3.j(this, z10);
    }

    public /* synthetic */ void C(int i10) {
        i3.s(this, i10);
    }

    public /* synthetic */ void D(e2 e2Var) {
        i3.l(this, e2Var);
    }

    public /* synthetic */ void G(o oVar) {
        i3.e(this, oVar);
    }

    public /* synthetic */ void H(boolean z10) {
        i3.h(this, z10);
    }

    public /* synthetic */ void I() {
        i3.w(this);
    }

    public void J(h4 h4Var) {
        for (int i10 = 0; i10 < h4Var.b().size(); i10++) {
            x0 b10 = h4Var.b().get(i10).b();
            for (int i11 = 0; i11 < b10.f21688a; i11++) {
                f3.a aVar = b10.b(i11).f20652k;
                if (aVar != null) {
                    for (int i12 = 0; i12 < aVar.e(); i12++) {
                        a.b d10 = aVar.d(i12);
                        if (d10 instanceof j3.b) {
                            this.f23002r = (j3.b) d10;
                            i0();
                        }
                    }
                }
            }
        }
    }

    public void K(c4 c4Var, int i10) {
        if (!(this.f22995k == -9223372036854775807L && this.f22996l == null)) {
            Integer num = this.f22996l;
            this.C.l(num != null ? num.intValue() : 0, this.f22995k);
            this.f22996l = null;
            this.f22995k = -9223372036854775807L;
        }
        if (g1()) {
            i0();
        }
        if (this.C.b() == 4) {
            try {
                if (this.C.m()) {
                    if (this.A == 0 && this.C.t() > 0) {
                        this.C.l(0, 0);
                    } else if (this.C.E()) {
                        this.C.A();
                    }
                } else if (this.C.G() < this.C.t()) {
                    s sVar = this.C;
                    sVar.l(sVar.G(), 0);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.A = this.C.t();
    }

    public /* synthetic */ void L(float f10) {
        i3.D(this, f10);
    }

    public void M(int i10) {
        if (i10 == 2) {
            i1();
            c cVar = this.f22990f;
            c cVar2 = c.buffering;
            if (!(cVar == cVar2 || cVar == c.loading)) {
                this.f22990f = cVar2;
                i0();
            }
            f1();
        } else if (i10 == 3) {
            if (this.C.m()) {
                h1();
            }
            this.f22990f = c.ready;
            i0();
            if (this.f22997m != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", I0() == -9223372036854775807L ? null : Long.valueOf(I0() * 1000));
                this.f22997m.success(hashMap);
                this.f22997m = null;
                e eVar = this.f23004t;
                if (eVar != null) {
                    this.C.L(eVar, false);
                    this.f23004t = null;
                }
            }
            if (this.f22999o != null) {
                t0();
            }
        } else if (i10 == 4) {
            c cVar3 = this.f22990f;
            c cVar4 = c.completed;
            if (cVar3 != cVar4) {
                h1();
                this.f22990f = cVar4;
                i0();
            }
            if (this.f22997m != null) {
                this.f22997m.success(new HashMap());
                this.f22997m = null;
                e eVar2 = this.f23004t;
                if (eVar2 != null) {
                    this.C.L(eVar2, false);
                    this.f23004t = null;
                }
            }
            k.d dVar = this.f22998n;
            if (dVar != null) {
                dVar.success(new HashMap());
                this.f22998n = null;
            }
        }
    }

    public /* synthetic */ void N(g3.b bVar) {
        i3.b(this, bVar);
    }

    public /* synthetic */ void R(boolean z10) {
        i3.x(this, z10);
    }

    public void R0() {
        if (this.C.m()) {
            this.C.w(false);
            h1();
            k.d dVar = this.f22998n;
            if (dVar != null) {
                dVar.success(new HashMap());
                this.f22998n = null;
            }
        }
    }

    public void S0(k.d dVar) {
        k.d dVar2;
        if (this.C.m()) {
            dVar.success(new HashMap());
            return;
        }
        k.d dVar3 = this.f22998n;
        if (dVar3 != null) {
            dVar3.success(new HashMap());
        }
        this.f22998n = dVar;
        this.C.w(true);
        h1();
        if (this.f22990f == c.completed && (dVar2 = this.f22998n) != null) {
            dVar2.success(new HashMap());
            this.f22998n = null;
        }
    }

    public void T0(long j10, Integer num, k.d dVar) {
        int i10;
        c cVar = this.f22990f;
        if (cVar == c.none || cVar == c.loading) {
            dVar.success(new HashMap());
            return;
        }
        U();
        this.f22994j = Long.valueOf(j10);
        this.f22999o = dVar;
        if (num != null) {
            try {
                i10 = num.intValue();
            } catch (RuntimeException e10) {
                this.f22999o = null;
                this.f22994j = null;
                throw e10;
            }
        } else {
            i10 = this.C.G();
        }
        this.C.l(i10, j10);
    }

    public /* synthetic */ void W(int i10, boolean z10) {
        i3.f(this, i10, z10);
    }

    public /* synthetic */ void X(boolean z10, int i10) {
        i3.r(this, z10, i10);
    }

    public /* synthetic */ void Y(z1 z1Var, int i10) {
        i3.k(this, z1Var, i10);
    }

    public void Y0(int i10) {
        this.C.d(i10);
    }

    public void Z0(float f10) {
        f3 e10 = this.C.e();
        if (e10.f20385b != f10) {
            this.C.c(new f3(e10.f20384a, f10));
            A0();
        }
    }

    public /* synthetic */ void a(boolean z10) {
        i3.y(this, z10);
    }

    public void a1(boolean z10) {
        this.C.n(z10);
    }

    public /* synthetic */ void b0() {
        i3.u(this);
    }

    public /* synthetic */ void c0(e eVar) {
        i3.a(this, eVar);
    }

    public void c1(boolean z10) {
        this.C.g(z10);
    }

    public /* synthetic */ void d(f3 f3Var) {
        i3.o(this, f3Var);
    }

    public /* synthetic */ void d0(boolean z10, int i10) {
        i3.n(this, z10, i10);
    }

    public void d1(float f10) {
        f3 e10 = this.C.e();
        if (e10.f20384a != f10) {
            this.C.c(new f3(f10, e10.f20385b));
            if (this.C.m()) {
                h1();
            }
            A0();
        }
    }

    public void e1(float f10) {
        this.C.setVolume(f10);
    }

    public /* synthetic */ void f0(g3 g3Var, g3.c cVar) {
        i3.g(this, g3Var, cVar);
    }

    public /* synthetic */ void h0(int i10, int i11) {
        i3.z(this, i10, i11);
    }

    public void j0(c3 c3Var) {
        Integer num;
        int intValue;
        if (c3Var instanceof q) {
            q qVar = (q) c3Var;
            int i10 = qVar.f20619j;
            if (i10 == 0) {
                xb.b.b("AudioPlayer", "TYPE_SOURCE: " + qVar.l().getMessage());
            } else if (i10 == 1) {
                xb.b.b("AudioPlayer", "TYPE_RENDERER: " + qVar.k().getMessage());
            } else if (i10 != 2) {
                xb.b.b("AudioPlayer", "default ExoPlaybackException: " + qVar.m().getMessage());
            } else {
                xb.b.b("AudioPlayer", "TYPE_UNEXPECTED: " + qVar.m().getMessage());
            }
            V0(String.valueOf(qVar.f20619j), qVar.getMessage(), Q0("index", this.F));
        } else {
            xb.b.b("AudioPlayer", "default PlaybackException: " + c3Var.getMessage());
            V0(String.valueOf(c3Var.f20203a), c3Var.getMessage(), Q0("index", this.F));
        }
        this.f23003s++;
        if (this.C.E() && (num = this.F) != null && this.f23003s <= 5 && (intValue = num.intValue() + 1) < this.C.J().t()) {
            this.C.o(this.E);
            this.C.a();
            this.C.l(intValue, 0);
        }
    }

    public /* synthetic */ void l0(c3 c3Var) {
        i3.q(this, c3Var);
    }

    public void n(f3.a aVar) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof j3.c) {
                this.f23001q = (j3.c) d10;
                i0();
            }
        }
    }

    public void onMethodCall(lc.j jVar, k.d dVar) {
        lc.j jVar2 = jVar;
        k.d dVar2 = dVar;
        B0();
        try {
            String str = jVar2.f36116a;
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2058172951:
                    if (str.equals("androidEqualizerBandSetGain")) {
                        c10 = 21;
                        break;
                    }
                    break;
                case -1987605894:
                    if (str.equals("setShuffleMode")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case -1875704736:
                    if (str.equals("setSkipSilence")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -1540835818:
                    if (str.equals("concatenatingInsertAll")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case -1484304041:
                    if (str.equals("setShuffleOrder")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case -704119678:
                    if (str.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case -345307082:
                    if (str.equals("androidLoudnessEnhancerSetTargetGain")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case -104999328:
                    if (str.equals("setAndroidAudioAttributes")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case -48357143:
                    if (str.equals("setLoopMode")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3327206:
                    if (str.equals("load")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3526264:
                    if (str.equals("seek")) {
                        c10 = 13;
                        break;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 845471111:
                    if (str.equals("concatenatingRemoveRange")) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 986980643:
                    if (str.equals("concatenatingMove")) {
                        c10 = 16;
                        break;
                    }
                    break;
                case 1401390078:
                    if (str.equals("setPitch")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1404354821:
                    if (str.equals("setSpeed")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1454606831:
                    if (str.equals("setPreferredPeakBitRate")) {
                        c10 = 12;
                        break;
                    }
                    break;
                case 1624925565:
                    if (str.equals("androidEqualizerGetParameters")) {
                        c10 = 20;
                        break;
                    }
                    break;
                case 1631191096:
                    if (str.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 2117606630:
                    if (str.equals("audioEffectSetEnabled")) {
                        c10 = 18;
                        break;
                    }
                    break;
            }
            long j10 = -9223372036854775807L;
            switch (c10) {
                case 0:
                    Long J0 = J0(jVar2.a("initialPosition"));
                    Integer num = (Integer) jVar2.a("initialIndex");
                    x E0 = E0(jVar2.a("audioSource"));
                    if (J0 != null) {
                        j10 = J0.longValue() / 1000;
                    }
                    N0(E0, j10, num, dVar);
                    break;
                case 1:
                    S0(dVar2);
                    break;
                case 2:
                    R0();
                    dVar2.success(new HashMap());
                    break;
                case 3:
                    e1((float) ((Double) jVar2.a("volume")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                case 4:
                    d1((float) ((Double) jVar2.a("speed")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                case 5:
                    Z0((float) ((Double) jVar2.a("pitch")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                case 6:
                    c1(((Boolean) jVar2.a("enabled")).booleanValue());
                    dVar2.success(new HashMap());
                    break;
                case 7:
                    Y0(((Integer) jVar2.a("loopMode")).intValue());
                    dVar2.success(new HashMap());
                    break;
                case 8:
                    a1(((Integer) jVar2.a("shuffleMode")).intValue() == 1);
                    dVar2.success(new HashMap());
                    break;
                case 9:
                    b1(jVar2.a("audioSource"));
                    dVar2.success(new HashMap());
                    break;
                case 10:
                    dVar2.success(new HashMap());
                    break;
                case 11:
                    dVar2.success(new HashMap());
                    break;
                case 12:
                    dVar2.success(new HashMap());
                    break;
                case 13:
                    Long J02 = J0(jVar2.a("position"));
                    Integer num2 = (Integer) jVar2.a("index");
                    if (J02 != null) {
                        j10 = J02.longValue() / 1000;
                    }
                    T0(j10, num2, dVar2);
                    break;
                case 14:
                    u0(jVar2.a("id")).S(((Integer) jVar2.a("index")).intValue(), F0(jVar2.a("children")), this.G, new b(dVar2));
                    u0(jVar2.a("id")).u0(y0((List) jVar2.a("shuffleOrder")));
                    break;
                case 15:
                    u0(jVar2.a("id")).p0(((Integer) jVar2.a("startIndex")).intValue(), ((Integer) jVar2.a("endIndex")).intValue(), this.G, new c(dVar2));
                    u0(jVar2.a("id")).u0(y0((List) jVar2.a("shuffleOrder")));
                    break;
                case 16:
                    u0(jVar2.a("id")).k0(((Integer) jVar2.a("currentIndex")).intValue(), ((Integer) jVar2.a("newIndex")).intValue(), this.G, new a(dVar2));
                    u0(jVar2.a("id")).u0(y0((List) jVar2.a("shuffleOrder")));
                    break;
                case 17:
                    W0(((Integer) jVar2.a("contentType")).intValue(), ((Integer) jVar2.a("flags")).intValue(), ((Integer) jVar2.a("usage")).intValue());
                    dVar2.success(new HashMap());
                    break;
                case 18:
                    g0((String) jVar2.a("type"), ((Boolean) jVar2.a("enabled")).booleanValue());
                    dVar2.success(new HashMap());
                    break;
                case 19:
                    O0(((Double) jVar2.a("targetGain")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                case 20:
                    dVar2.success(C0());
                    break;
                case 21:
                    D0(((Integer) jVar2.a("bandIndex")).intValue(), ((Double) jVar2.a("gain")).doubleValue());
                    dVar2.success(new HashMap());
                    break;
                default:
                    dVar.notImplemented();
                    break;
            }
        } catch (IllegalStateException e10) {
            IllegalStateException illegalStateException = e10;
            illegalStateException.printStackTrace();
            dVar2.error("Illegal state: " + illegalStateException.getMessage(), (String) null, (Object) null);
        } catch (Exception e11) {
            Exception exc = e11;
            exc.printStackTrace();
            dVar2.error("Error: " + exc, (String) null, (Object) null);
        } catch (Throwable th) {
            Throwable th2 = th;
            k0();
            throw th2;
        }
        k0();
    }

    public /* synthetic */ void p(int i10) {
        i3.v(this, i10);
    }

    public /* synthetic */ void p0(boolean z10) {
        i3.i(this, z10);
    }

    public /* synthetic */ void q(List list) {
        i3.c(this, list);
    }

    public /* synthetic */ void s(z zVar) {
        i3.C(this, zVar);
    }

    public /* synthetic */ void u(y3.e eVar) {
        i3.d(this, eVar);
    }

    public /* synthetic */ void z(int i10) {
        i3.p(this, i10);
    }

    public void z0() {
        if (this.f22990f == c.loading) {
            T();
        }
        k.d dVar = this.f22998n;
        if (dVar != null) {
            dVar.success(new HashMap());
            this.f22998n = null;
        }
        this.f23000p.clear();
        this.E = null;
        r0();
        s sVar = this.C;
        if (sVar != null) {
            sVar.release();
            this.C = null;
            this.f22990f = c.none;
            i0();
        }
        this.f22988c.a();
        this.f22989d.a();
    }
}
