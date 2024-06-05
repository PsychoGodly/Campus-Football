package pf;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.core.device.MimeTypes;
import dc.a;
import fe.p;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.coroutines.jvm.internal.f;
import lc.j;
import lc.k;
import pe.c2;
import pe.g1;
import pe.p0;
import pe.q0;
import pe.r0;
import qf.l;
import qf.o;
import sd.n;
import sd.s;
import sd.w;

/* compiled from: AudioplayersPlugin.kt */
public final class m implements dc.a, q {

    /* renamed from: a  reason: collision with root package name */
    private final p0 f37445a = q0.a(g1.c());

    /* renamed from: b  reason: collision with root package name */
    private k f37446b;

    /* renamed from: c  reason: collision with root package name */
    private k f37447c;

    /* renamed from: d  reason: collision with root package name */
    private p f37448d;

    /* renamed from: f  reason: collision with root package name */
    private Context f37449f;

    /* renamed from: g  reason: collision with root package name */
    private lc.c f37450g;

    /* renamed from: h  reason: collision with root package name */
    private l f37451h;

    /* renamed from: i  reason: collision with root package name */
    private final ConcurrentHashMap<String, o> f37452i = new ConcurrentHashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private final Handler f37453j = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    private Runnable f37454k;

    /* renamed from: l  reason: collision with root package name */
    private a f37455l = new a();

    /* compiled from: AudioplayersPlugin.kt */
    private static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<ConcurrentMap<String, o>> f37456a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<k> f37457b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<Handler> f37458c;

        /* renamed from: d  reason: collision with root package name */
        private final WeakReference<q> f37459d;

        public a(ConcurrentMap<String, o> concurrentMap, k kVar, Handler handler, q qVar) {
            kotlin.jvm.internal.m.e(concurrentMap, "mediaPlayers");
            kotlin.jvm.internal.m.e(kVar, "methodChannel");
            kotlin.jvm.internal.m.e(handler, "handler");
            kotlin.jvm.internal.m.e(qVar, "updateCallback");
            this.f37456a = new WeakReference<>(concurrentMap);
            this.f37457b = new WeakReference<>(kVar);
            this.f37458c = new WeakReference<>(handler);
            this.f37459d = new WeakReference<>(qVar);
        }

        public void run() {
            ConcurrentMap concurrentMap = (ConcurrentMap) this.f37456a.get();
            k kVar = (k) this.f37457b.get();
            Handler handler = (Handler) this.f37458c.get();
            q qVar = (q) this.f37459d.get();
            if (concurrentMap != null && kVar != null && handler != null && qVar != null) {
                boolean z10 = false;
                for (o oVar : concurrentMap.values()) {
                    if (oVar.u()) {
                        Integer i10 = oVar.i();
                        p k10 = oVar.k();
                        n[] nVarArr = new n[1];
                        nVarArr[0] = s.a("value", Integer.valueOf(i10 == null ? 0 : i10.intValue()));
                        k10.c("audio.onCurrentPosition", k0.i(nVarArr));
                        z10 = true;
                    }
                }
                if (z10) {
                    handler.postDelayed(this, 200);
                } else {
                    qVar.a();
                }
            } else if (qVar != null) {
                qVar.a();
            }
        }
    }

    /* compiled from: AudioplayersPlugin.kt */
    /* synthetic */ class b extends kotlin.jvm.internal.k implements p<j, k.d, w> {
        b(Object obj) {
            super(2, obj, m.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        public final void b(j jVar, k.d dVar) {
            kotlin.jvm.internal.m.e(jVar, "p0");
            kotlin.jvm.internal.m.e(dVar, "p1");
            ((m) this.receiver).J(jVar, dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((j) obj, (k.d) obj2);
            return w.f38141a;
        }
    }

    /* compiled from: AudioplayersPlugin.kt */
    /* synthetic */ class c extends kotlin.jvm.internal.k implements p<j, k.d, w> {
        c(Object obj) {
            super(2, obj, m.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        public final void b(j jVar, k.d dVar) {
            kotlin.jvm.internal.m.e(jVar, "p0");
            kotlin.jvm.internal.m.e(dVar, "p1");
            ((m) this.receiver).r(jVar, dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((j) obj, (k.d) obj2);
            return w.f38141a;
        }
    }

    @f(c = "xyz.luan.audioplayers.AudioplayersPlugin$safeCall$1", f = "AudioplayersPlugin.kt", l = {}, m = "invokeSuspend")
    /* compiled from: AudioplayersPlugin.kt */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<p0, xd.d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<j, k.d, w> f37461b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f37462c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k.d f37463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(p<? super j, ? super k.d, w> pVar, j jVar, k.d dVar, xd.d<? super d> dVar2) {
            super(2, dVar2);
            this.f37461b = pVar;
            this.f37462c = jVar;
            this.f37463d = dVar;
        }

        public final xd.d<w> create(Object obj, xd.d<?> dVar) {
            return new d(this.f37461b, this.f37462c, this.f37463d, dVar);
        }

        public final Object invoke(p0 p0Var, xd.d<? super w> dVar) {
            return ((d) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.f37460a == 0) {
                sd.p.b(obj);
                try {
                    this.f37461b.invoke(this.f37462c, this.f37463d);
                } catch (Exception e10) {
                    this.f37463d.error("Unexpected AndroidAudioError", e10.getMessage(), e10);
                }
                return w.f38141a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    public static final void B(m mVar, String str) {
        kotlin.jvm.internal.m.e(mVar, "this$0");
        kotlin.jvm.internal.m.e(str, "$message");
        p pVar = mVar.f37448d;
        if (pVar == null) {
            kotlin.jvm.internal.m.t("globalEvents");
            pVar = null;
        }
        pVar.c("audio.onLog", k0.i(s.a("value", str)));
    }

    /* access modifiers changed from: private */
    public static final void E(o oVar, String str) {
        kotlin.jvm.internal.m.e(oVar, "$player");
        kotlin.jvm.internal.m.e(str, "$message");
        oVar.k().c("audio.onLog", k0.i(s.a("value", str)));
    }

    /* access modifiers changed from: private */
    public static final void G(o oVar, boolean z10) {
        kotlin.jvm.internal.m.e(oVar, "$player");
        oVar.k().c("audio.onPrepared", k0.i(s.a("value", Boolean.valueOf(z10))));
    }

    /* access modifiers changed from: private */
    public static final void I(o oVar) {
        kotlin.jvm.internal.m.e(oVar, "$player");
        p.d(oVar.k(), "audio.onSeekComplete", (Map) null, 2, (Object) null);
        p k10 = oVar.k();
        n[] nVarArr = new n[1];
        Integer i10 = oVar.i();
        nVarArr[0] = s.a("value", Integer.valueOf(i10 == null ? 0 : i10.intValue()));
        k10.c("audio.onCurrentPosition", k0.i(nVarArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: pf.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: pf.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: qf.l} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02ea, code lost:
        r2.success(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(lc.j r19, lc.k.d r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            java.lang.String r3 = "AndroidAudioError"
            java.lang.String r4 = "playerId"
            java.lang.Object r4 = r0.a(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.String r5 = r0.f36116a
            java.lang.String r6 = "create"
            boolean r5 = kotlin.jvm.internal.m.a(r5, r6)
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0066
            pf.p r0 = new pf.p
            lc.d r3 = new lc.d
            lc.c r5 = r1.f37450g
            if (r5 != 0) goto L_0x002d
            java.lang.String r5 = "binaryMessenger"
            kotlin.jvm.internal.m.t(r5)
            r5 = r7
        L_0x002d:
            java.lang.String r8 = "xyz.luan/audioplayers/events/"
            java.lang.String r8 = kotlin.jvm.internal.m.m(r8, r4)
            r3.<init>(r5, r8)
            r0.<init>(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, qf.o> r3 = r1.f37452i
            qf.o r5 = new qf.o
            pf.a r8 = r1.f37455l
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 63
            r16 = 0
            pf.a r8 = pf.a.c(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            qf.l r9 = r1.f37451h
            if (r9 != 0) goto L_0x0057
            java.lang.String r9 = "soundPoolManager"
            kotlin.jvm.internal.m.t(r9)
            goto L_0x0058
        L_0x0057:
            r7 = r9
        L_0x0058:
            r5.<init>(r1, r0, r8, r7)
            r3.put(r4, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.success(r0)
            return
        L_0x0066:
            qf.o r5 = r1.q(r4)
            java.lang.String r8 = r0.f36116a     // Catch:{ Exception -> 0x0313 }
            if (r8 == 0) goto L_0x030f
            int r9 = r8.hashCode()     // Catch:{ Exception -> 0x0313 }
            r10 = 46
            r11 = 0
            java.lang.String r12 = "message is required"
            java.lang.String r13 = "message"
            switch(r9) {
                case -1757019252: goto L_0x02fe;
                case -1722943962: goto L_0x02b4;
                case -1660487654: goto L_0x028b;
                case -1630329231: goto L_0x026b;
                case -934426579: goto L_0x025c;
                case -402284771: goto L_0x0232;
                case -159032046: goto L_0x01f1;
                case 3526264: goto L_0x01c8;
                case 3540994: goto L_0x01b9;
                case 85887754: goto L_0x01a7;
                case 106440182: goto L_0x0198;
                case 670514716: goto L_0x016e;
                case 910310901: goto L_0x0137;
                case 1090594823: goto L_0x0128;
                case 1671767583: goto L_0x0112;
                case 1771699022: goto L_0x00d6;
                case 1902436987: goto L_0x00c3;
                case 2096116872: goto L_0x007e;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x030f
        L_0x007e:
            java.lang.String r4 = "setReleaseMode"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x0088
            goto L_0x030f
        L_0x0088:
            java.lang.String r4 = "releaseMode"
            java.lang.Object r0 = r0.a(r4)     // Catch:{ Exception -> 0x0313 }
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0313 }
            if (r12 != 0) goto L_0x0094
            goto L_0x00b0
        L_0x0094:
            char[] r13 = new char[r6]     // Catch:{ Exception -> 0x0313 }
            r13[r11] = r10     // Catch:{ Exception -> 0x0313 }
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            java.util.List r0 = ne.p.e0(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0313 }
            java.lang.Object r0 = td.y.z(r0)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = pf.n.c(r0)     // Catch:{ Exception -> 0x0313 }
            pf.s r7 = pf.s.valueOf(r0)     // Catch:{ Exception -> 0x0313 }
        L_0x00b0:
            if (r7 == 0) goto L_0x00b7
            r5.K(r7)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x00b7:
            java.lang.String r0 = "releaseMode is required"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x00c3:
            java.lang.String r4 = "setAudioContext"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x00cd
            goto L_0x030f
        L_0x00cd:
            pf.a r0 = pf.n.b(r19)     // Catch:{ Exception -> 0x0313 }
            r5.R(r0)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x00d6:
            java.lang.String r4 = "setSourceBytes"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x00e0
            goto L_0x030f
        L_0x00e0:
            java.lang.String r4 = "bytes"
            java.lang.Object r0 = r0.a(r4)     // Catch:{ Exception -> 0x0313 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x0106
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0313 }
            r7 = 23
            if (r4 < r7) goto L_0x00fa
            rf.a r4 = new rf.a     // Catch:{ Exception -> 0x0313 }
            r4.<init>((byte[]) r0)     // Catch:{ Exception -> 0x0313 }
            r5.N(r4)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x00fa:
            java.lang.String r0 = "Operation not supported on Android <= M"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x0106:
            java.lang.String r0 = "bytes are required"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x0112:
            java.lang.String r0 = "dispose"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0313 }
            if (r0 != 0) goto L_0x011c
            goto L_0x030f
        L_0x011c:
            android.os.Handler r0 = r1.f37453j     // Catch:{ Exception -> 0x0313 }
            pf.j r7 = new pf.j     // Catch:{ Exception -> 0x0313 }
            r7.<init>(r5, r1, r4)     // Catch:{ Exception -> 0x0313 }
            r0.post(r7)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x0128:
            java.lang.String r0 = "release"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0313 }
            if (r0 != 0) goto L_0x0132
            goto L_0x030f
        L_0x0132:
            r5.E()     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x0137:
            java.lang.String r4 = "emitError"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x0141
            goto L_0x030f
        L_0x0141:
            java.lang.String r4 = "code"
            java.lang.Object r4 = r0.a(r4)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0313 }
            if (r4 == 0) goto L_0x0162
            java.lang.Object r0 = r0.a(r13)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x0158
            r5.r(r4, r0, r7)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x0158:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r4 = r12.toString()     // Catch:{ Exception -> 0x0313 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0313 }
            throw r0     // Catch:{ Exception -> 0x0313 }
        L_0x0162:
            java.lang.String r0 = "code is required"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x016e:
            java.lang.String r4 = "setVolume"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x0178
            goto L_0x030f
        L_0x0178:
            java.lang.String r4 = "volume"
            java.lang.Object r0 = r0.a(r4)     // Catch:{ Exception -> 0x0313 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x018c
            double r7 = r0.doubleValue()     // Catch:{ Exception -> 0x0313 }
            float r0 = (float) r7     // Catch:{ Exception -> 0x0313 }
            r5.O(r0)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x018c:
            java.lang.String r0 = "volume is required"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x0198:
            java.lang.String r0 = "pause"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0313 }
            if (r0 != 0) goto L_0x01a2
            goto L_0x030f
        L_0x01a2:
            r5.C()     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x01a7:
            java.lang.String r0 = "getDuration"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0313 }
            if (r0 != 0) goto L_0x01b1
            goto L_0x030f
        L_0x01b1:
            java.lang.Integer r0 = r5.j()     // Catch:{ Exception -> 0x0313 }
            r2.success(r0)     // Catch:{ Exception -> 0x0313 }
            return
        L_0x01b9:
            java.lang.String r0 = "stop"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0313 }
            if (r0 != 0) goto L_0x01c3
            goto L_0x030f
        L_0x01c3:
            r5.Q()     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x01c8:
            java.lang.String r4 = "seek"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x01d2
            goto L_0x030f
        L_0x01d2:
            java.lang.String r4 = "position"
            java.lang.Object r0 = r0.a(r4)     // Catch:{ Exception -> 0x0313 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x01e5
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0313 }
            r5.F(r0)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x01e5:
            java.lang.String r0 = "position is required"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x01f1:
            java.lang.String r4 = "setSourceUrl"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x01fb
            goto L_0x030f
        L_0x01fb:
            java.lang.String r4 = "url"
            java.lang.Object r4 = r0.a(r4)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0313 }
            if (r4 == 0) goto L_0x0226
            java.lang.String r7 = "isLocal"
            java.lang.Object r0 = r0.a(r7)     // Catch:{ Exception -> 0x0313 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0313 }
            if (r0 != 0) goto L_0x0211
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0313 }
        L_0x0211:
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0313 }
            rf.c r7 = new rf.c     // Catch:{ FileNotFoundException -> 0x021f }
            r7.<init>(r4, r0)     // Catch:{ FileNotFoundException -> 0x021f }
            r5.N(r7)     // Catch:{ FileNotFoundException -> 0x021f }
            goto L_0x02ea
        L_0x021f:
            r0 = move-exception
            java.lang.String r4 = "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md"
            r2.error(r3, r4, r0)     // Catch:{ Exception -> 0x0313 }
            return
        L_0x0226:
            java.lang.String r0 = "url is required"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x0232:
            java.lang.String r4 = "setPlaybackRate"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x023c
            goto L_0x030f
        L_0x023c:
            java.lang.String r4 = "playbackRate"
            java.lang.Object r0 = r0.a(r4)     // Catch:{ Exception -> 0x0313 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x0250
            double r7 = r0.doubleValue()     // Catch:{ Exception -> 0x0313 }
            float r0 = (float) r7     // Catch:{ Exception -> 0x0313 }
            r5.J(r0)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x0250:
            java.lang.String r0 = "playbackRate is required"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x025c:
            java.lang.String r0 = "resume"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0313 }
            if (r0 != 0) goto L_0x0266
            goto L_0x030f
        L_0x0266:
            r5.D()     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x026b:
            java.lang.String r4 = "emitLog"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x0275
            goto L_0x030f
        L_0x0275:
            java.lang.Object r0 = r0.a(r13)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x0281
            r5.s(r0)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x0281:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r4 = r12.toString()     // Catch:{ Exception -> 0x0313 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0313 }
            throw r0     // Catch:{ Exception -> 0x0313 }
        L_0x028b:
            java.lang.String r4 = "setBalance"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x0295
            goto L_0x030f
        L_0x0295:
            java.lang.String r4 = "balance"
            java.lang.Object r0 = r0.a(r4)     // Catch:{ Exception -> 0x0313 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x02a8
            double r7 = r0.doubleValue()     // Catch:{ Exception -> 0x0313 }
            float r0 = (float) r7     // Catch:{ Exception -> 0x0313 }
            r5.G(r0)     // Catch:{ Exception -> 0x0313 }
            goto L_0x02ea
        L_0x02a8:
            java.lang.String r0 = "balance is required"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x02b4:
            java.lang.String r4 = "setPlayerMode"
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x0313 }
            if (r4 != 0) goto L_0x02bd
            goto L_0x030f
        L_0x02bd:
            java.lang.String r4 = "playerMode"
            java.lang.Object r0 = r0.a(r4)     // Catch:{ Exception -> 0x0313 }
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0313 }
            if (r12 != 0) goto L_0x02c9
            goto L_0x02e5
        L_0x02c9:
            char[] r13 = new char[r6]     // Catch:{ Exception -> 0x0313 }
            r13[r11] = r10     // Catch:{ Exception -> 0x0313 }
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            java.util.List r0 = ne.p.e0(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0313 }
            java.lang.Object r0 = td.y.z(r0)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = pf.n.c(r0)     // Catch:{ Exception -> 0x0313 }
            pf.r r7 = pf.r.valueOf(r0)     // Catch:{ Exception -> 0x0313 }
        L_0x02e5:
            if (r7 == 0) goto L_0x02f2
            r5.H(r7)     // Catch:{ Exception -> 0x0313 }
        L_0x02ea:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0313 }
            r2.success(r0)     // Catch:{ Exception -> 0x0313 }
            goto L_0x031b
        L_0x02f2:
            java.lang.String r0 = "playerMode is required"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0313 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0313 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            throw r4     // Catch:{ Exception -> 0x0313 }
        L_0x02fe:
            java.lang.String r0 = "getCurrentPosition"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0313 }
            if (r0 != 0) goto L_0x0307
            goto L_0x030f
        L_0x0307:
            java.lang.Integer r0 = r5.i()     // Catch:{ Exception -> 0x0313 }
            r2.success(r0)     // Catch:{ Exception -> 0x0313 }
            return
        L_0x030f:
            r20.notImplemented()     // Catch:{ Exception -> 0x0313 }
            return
        L_0x0313:
            r0 = move-exception
            java.lang.String r4 = r0.getMessage()
            r2.error(r3, r4, r0)
        L_0x031b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.m.J(lc.j, lc.k$d):void");
    }

    /* access modifiers changed from: private */
    public static final void K(o oVar, m mVar, String str) {
        kotlin.jvm.internal.m.e(oVar, "$player");
        kotlin.jvm.internal.m.e(mVar, "this$0");
        kotlin.jvm.internal.m.e(str, "$playerId");
        oVar.e();
        mVar.f37452i.remove(str);
    }

    /* access modifiers changed from: private */
    public static final void L(m mVar, j jVar, k.d dVar) {
        kotlin.jvm.internal.m.e(mVar, "this$0");
        kotlin.jvm.internal.m.e(jVar, "call");
        kotlin.jvm.internal.m.e(dVar, "response");
        mVar.N(jVar, dVar, new b(mVar));
    }

    /* access modifiers changed from: private */
    public static final void M(m mVar, j jVar, k.d dVar) {
        kotlin.jvm.internal.m.e(mVar, "this$0");
        kotlin.jvm.internal.m.e(jVar, "call");
        kotlin.jvm.internal.m.e(dVar, "response");
        mVar.N(jVar, dVar, new c(mVar));
    }

    private final void N(j jVar, k.d dVar, p<? super j, ? super k.d, w> pVar) {
        c2 unused = k.d(this.f37445a, g1.b(), (r0) null, new d(pVar, jVar, dVar, (xd.d<? super d>) null), 2, (Object) null);
    }

    private final o q(String str) {
        o oVar = this.f37452i.get(str);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Player has not yet been created or has already been disposed.".toString());
    }

    /* access modifiers changed from: private */
    public final void r(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1630329231) {
                if (hashCode != 910310901) {
                    if (hashCode == 1902436987 && str.equals("setAudioContext")) {
                        AudioManager p10 = p();
                        p10.setMode(this.f37455l.e());
                        p10.setSpeakerphoneOn(this.f37455l.h());
                        this.f37455l = n.b(jVar);
                    }
                } else if (str.equals("emitError")) {
                    String str2 = (String) jVar.a("code");
                    if (str2 != null) {
                        String str3 = (String) jVar.a("message");
                        if (str3 != null) {
                            y(str2, str3, (Object) null);
                        } else {
                            throw new IllegalStateException("message is required".toString());
                        }
                    } else {
                        throw new IllegalStateException("code is required".toString());
                    }
                }
            } else if (str.equals("emitLog")) {
                String str4 = (String) jVar.a("message");
                if (str4 != null) {
                    A(str4);
                } else {
                    throw new IllegalStateException("message is required".toString());
                }
            }
            dVar.success(1);
            return;
        }
        dVar.notImplemented();
    }

    /* access modifiers changed from: private */
    public static final void t(o oVar) {
        kotlin.jvm.internal.m.e(oVar, "$player");
        p.d(oVar.k(), "audio.onComplete", (Map) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void v(o oVar) {
        kotlin.jvm.internal.m.e(oVar, "$player");
        p k10 = oVar.k();
        n[] nVarArr = new n[1];
        Integer j10 = oVar.j();
        nVarArr[0] = s.a("value", Integer.valueOf(j10 == null ? 0 : j10.intValue()));
        k10.c("audio.onDuration", k0.i(nVarArr));
    }

    /* access modifiers changed from: private */
    public static final void x(o oVar, String str, String str2, Object obj) {
        kotlin.jvm.internal.m.e(oVar, "$player");
        oVar.k().b(str, str2, obj);
    }

    /* access modifiers changed from: private */
    public static final void z(m mVar, String str, String str2, Object obj) {
        kotlin.jvm.internal.m.e(mVar, "this$0");
        p pVar = mVar.f37448d;
        if (pVar == null) {
            kotlin.jvm.internal.m.t("globalEvents");
            pVar = null;
        }
        pVar.b(str, str2, obj);
    }

    public final void A(String str) {
        kotlin.jvm.internal.m.e(str, "message");
        this.f37453j.post(new b(this, str));
    }

    public final void C() {
        O();
    }

    public final void D(o oVar, String str) {
        kotlin.jvm.internal.m.e(oVar, "player");
        kotlin.jvm.internal.m.e(str, "message");
        this.f37453j.post(new h(oVar, str));
    }

    public final void F(o oVar, boolean z10) {
        kotlin.jvm.internal.m.e(oVar, "player");
        this.f37453j.post(new k(oVar, z10));
    }

    public final void H(o oVar) {
        kotlin.jvm.internal.m.e(oVar, "player");
        this.f37453j.post(new g(oVar));
    }

    public void O() {
        Runnable runnable = this.f37454k;
        if (runnable != null) {
            this.f37453j.post(runnable);
        }
    }

    public void a() {
        Runnable runnable = this.f37454k;
        if (runnable != null) {
            this.f37453j.removeCallbacks(runnable);
        }
    }

    public final Context o() {
        Context context = this.f37449f;
        if (context == null) {
            kotlin.jvm.internal.m.t("context");
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m.d(applicationContext, "context.applicationContext");
        return applicationContext;
    }

    public void onAttachedToEngine(a.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "binding");
        Context a10 = bVar.a();
        kotlin.jvm.internal.m.d(a10, "binding.applicationContext");
        this.f37449f = a10;
        lc.c b10 = bVar.b();
        kotlin.jvm.internal.m.d(b10, "binding.binaryMessenger");
        this.f37450g = b10;
        this.f37451h = new l(this);
        k kVar = new k(bVar.b(), "xyz.luan/audioplayers");
        this.f37446b = kVar;
        kVar.e(new l(this));
        k kVar2 = new k(bVar.b(), "xyz.luan/audioplayers.global");
        this.f37447c = kVar2;
        kVar2.e(new c(this));
        ConcurrentHashMap<String, o> concurrentHashMap = this.f37452i;
        k kVar3 = this.f37446b;
        if (kVar3 == null) {
            kotlin.jvm.internal.m.t("methods");
            kVar3 = null;
        }
        this.f37454k = new a(concurrentHashMap, kVar3, this.f37453j, this);
        this.f37448d = new p(new lc.d(bVar.b(), "xyz.luan/audioplayers.global/events"));
    }

    public void onDetachedFromEngine(a.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "binding");
        a();
        p pVar = null;
        this.f37453j.removeCallbacksAndMessages((Object) null);
        this.f37454k = null;
        Collection<o> values = this.f37452i.values();
        kotlin.jvm.internal.m.d(values, "players.values");
        for (o e10 : values) {
            e10.e();
        }
        this.f37452i.clear();
        q0.d(this.f37445a, (CancellationException) null, 1, (Object) null);
        l lVar = this.f37451h;
        if (lVar == null) {
            kotlin.jvm.internal.m.t("soundPoolManager");
            lVar = null;
        }
        lVar.d();
        p pVar2 = this.f37448d;
        if (pVar2 == null) {
            kotlin.jvm.internal.m.t("globalEvents");
        } else {
            pVar = pVar2;
        }
        pVar.a();
    }

    public final AudioManager p() {
        Context context = this.f37449f;
        if (context == null) {
            kotlin.jvm.internal.m.t("context");
            context = null;
        }
        Object systemService = context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public final void s(o oVar) {
        kotlin.jvm.internal.m.e(oVar, "player");
        this.f37453j.post(new f(oVar));
    }

    public final void u(o oVar) {
        kotlin.jvm.internal.m.e(oVar, "player");
        this.f37453j.post(new e(oVar));
    }

    public final void w(o oVar, String str, String str2, Object obj) {
        kotlin.jvm.internal.m.e(oVar, "player");
        this.f37453j.post(new i(oVar, str, str2, obj));
    }

    public final void y(String str, String str2, Object obj) {
        this.f37453j.post(new d(this, str, str2, obj));
    }
}
