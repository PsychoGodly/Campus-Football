package com.startapp.sdk.components;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.startapp.a3;
import com.startapp.ab;
import com.startapp.b5;
import com.startapp.b8;
import com.startapp.c7;
import com.startapp.f1;
import com.startapp.g7;
import com.startapp.h2;
import com.startapp.h3;
import com.startapp.h8;
import com.startapp.i2;
import com.startapp.i4;
import com.startapp.j9;
import com.startapp.k8;
import com.startapp.l3;
import com.startapp.l7;
import com.startapp.n4;
import com.startapp.o3;
import com.startapp.q1;
import com.startapp.q7;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.jobs.SchedulerService;
import com.startapp.t1;
import com.startapp.ta;
import com.startapp.u1;
import com.startapp.u3;
import com.startapp.u7;
import com.startapp.ua;
import com.startapp.v2;
import com.startapp.v5;
import com.startapp.va;
import com.startapp.w2;
import com.startapp.x2;
import com.startapp.x3;
import com.startapp.x5;
import com.startapp.y3;
import com.startapp.y4;
import com.startapp.z8;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class ComponentLocator {
    public static final q1<ComponentLocator, Context> N = new k();
    public final n4<Executor> A;
    public final n4<Executor> B;
    public final n4<v2> C;
    public final n4<v2> D;
    public final n4<com.startapp.sdk.adsbase.e> E;
    public final n4<com.startapp.sdk.adsbase.e> F;
    public final n4<com.startapp.t> G;
    public final n4<com.startapp.m> H;
    public final n4<com.startapp.sdk.adsbase.crashreport.b> I;
    public final n4<com.startapp.sdk.ads.video.h> J;
    public final n4<h2<Context, List<String>, TrackingParams, h3>> K;
    public final n4<com.startapp.d> L;
    public final n4<com.startapp.e0> M;

    /* renamed from: a  reason: collision with root package name */
    public final n4<ua> f17138a;

    /* renamed from: b  reason: collision with root package name */
    public final n4<ta> f17139b;

    /* renamed from: c  reason: collision with root package name */
    public final n4<y4> f17140c;

    /* renamed from: d  reason: collision with root package name */
    public final n4<x3> f17141d;

    /* renamed from: e  reason: collision with root package name */
    public final n4<h8> f17142e;

    /* renamed from: f  reason: collision with root package name */
    public final n4<k8> f17143f;

    /* renamed from: g  reason: collision with root package name */
    public final n4<AdvertisingIdResolver> f17144g;

    /* renamed from: h  reason: collision with root package name */
    public final n4<c7> f17145h;

    /* renamed from: i  reason: collision with root package name */
    public final n4<u1> f17146i;

    /* renamed from: j  reason: collision with root package name */
    public final n4<y3> f17147j;

    /* renamed from: k  reason: collision with root package name */
    public final n4<u7> f17148k = new n4<>(new g(this));

    /* renamed from: l  reason: collision with root package name */
    public final n4<z8> f17149l;

    /* renamed from: m  reason: collision with root package name */
    public final n4<com.startapp.b0> f17150m;

    /* renamed from: n  reason: collision with root package name */
    public final n4<a3> f17151n;

    /* renamed from: o  reason: collision with root package name */
    public final n4<b8> f17152o;

    /* renamed from: p  reason: collision with root package name */
    public final n4<com.startapp.y> f17153p;

    /* renamed from: q  reason: collision with root package name */
    public final n4<o3> f17154q;

    /* renamed from: r  reason: collision with root package name */
    public final n4<f1> f17155r;

    /* renamed from: s  reason: collision with root package name */
    public final n4<q7> f17156s;

    /* renamed from: t  reason: collision with root package name */
    public final n4<t1> f17157t;

    /* renamed from: u  reason: collision with root package name */
    public final n4<g7> f17158u;

    /* renamed from: v  reason: collision with root package name */
    public final n4<i4> f17159v;

    /* renamed from: w  reason: collision with root package name */
    public final n4<b5> f17160w;

    /* renamed from: x  reason: collision with root package name */
    public final n4<v2> f17161x;

    /* renamed from: y  reason: collision with root package name */
    public final n4<Executor> f17162y;

    /* renamed from: z  reason: collision with root package name */
    public final n4<Executor> f17163z;

    /* compiled from: Sta */
    public class a implements i2<h8> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17164a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i2 f17165b;

        public a(Context context, i2 i2Var) {
            this.f17164a = context;
            this.f17165b = i2Var;
        }

        public Object a() {
            return new h8(this.f17164a, new com.startapp.sdk.adsbase.e(this.f17164a.getSharedPreferences("StartApp-6d5362e8ecc8a910", 0), (e.b) null), ComponentLocator.this.i(), ComponentLocator.this.g(), this.f17165b, new a(this));
        }
    }

    /* compiled from: Sta */
    public class a0 implements i2<v2> {
        public a0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a("dc");
        }
    }

    /* compiled from: Sta */
    public class b implements i2<k8> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17167a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i2 f17168b;

        public b(Context context, i2 i2Var) {
            this.f17167a = context;
            this.f17168b = i2Var;
        }

        public Object a() {
            return new k8(this.f17167a, ComponentLocator.this.i(), new com.startapp.sdk.adsbase.e(this.f17167a.getSharedPreferences("StartApp-c5f5846c2a728b2a", 0), (e.b) null), ComponentLocator.this.g(), this.f17168b);
        }
    }

    /* compiled from: Sta */
    public class b0 implements i2<v2> {
        public b0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return new w2(new Handler(Looper.getMainLooper()));
        }
    }

    /* compiled from: Sta */
    public class c implements i2<AdvertisingIdResolver> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17170a;

        public c(ComponentLocator componentLocator, Context context) {
            this.f17170a = context;
        }

        public Object a() {
            return new AdvertisingIdResolver(this.f17170a, new m0("air"), new b(this));
        }
    }

    /* compiled from: Sta */
    public class c0 implements i2<com.startapp.sdk.adsbase.e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17171a;

        public c0(ComponentLocator componentLocator, Context context) {
            this.f17171a = context;
        }

        public Object a() {
            return new com.startapp.sdk.adsbase.e(this.f17171a.getSharedPreferences("com.startapp.sdk", 0), (e.b) null);
        }
    }

    /* compiled from: Sta */
    public class d implements i2<c7> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17172a;

        public d(ComponentLocator componentLocator, Context context) {
            this.f17172a = context;
        }

        public Object a() {
            return new c7(this.f17172a, new c(this));
        }
    }

    /* compiled from: Sta */
    public class d0 implements i2<com.startapp.sdk.adsbase.e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17173a;

        public d0(ComponentLocator componentLocator, Context context) {
            this.f17173a = context;
        }

        public Object a() {
            return new com.startapp.sdk.adsbase.e(this.f17173a.getSharedPreferences("com.startapp.sdk.extras", 0), new s(this));
        }
    }

    /* compiled from: Sta */
    public class e implements i2<u1> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17174a;

        public e(Context context) {
            this.f17174a = context;
        }

        public Object a() {
            return new u1(this.f17174a, ComponentLocator.this.e());
        }
    }

    /* compiled from: Sta */
    public class e0 implements i2<com.startapp.t> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17176a;

        public e0(ComponentLocator componentLocator, Context context) {
            this.f17176a = context;
        }

        public Object a() {
            return new com.startapp.t(this.f17176a);
        }
    }

    /* compiled from: Sta */
    public class f implements i2<y3> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17177a;

        public f(ComponentLocator componentLocator, Context context) {
            this.f17177a = context;
        }

        public Object a() {
            return new y3(new com.startapp.sdk.adsbase.e(this.f17177a.getSharedPreferences("StartApp-54ff24db2aee60b9", 0), (e.b) null));
        }
    }

    /* compiled from: Sta */
    public class f0 implements i2<com.startapp.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17178a;

        public f0(ComponentLocator componentLocator, Context context) {
            this.f17178a = context;
        }

        public Object a() {
            return new com.startapp.m(this.f17178a, new t(this));
        }
    }

    /* compiled from: Sta */
    public class g implements i2<u7> {
        public g(ComponentLocator componentLocator) {
        }

        public Object a() {
            return new u7();
        }
    }

    /* compiled from: Sta */
    public class g0 implements i2<WvfMetadata> {
        public g0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return MetaData.f17070k.R();
        }
    }

    /* compiled from: Sta */
    public class h implements i2<z8> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17179a;

        public h(Context context) {
            this.f17179a = context;
        }

        public Object a() {
            return new z8(this.f17179a.getPackageName(), new com.startapp.sdk.adsbase.e(this.f17179a.getSharedPreferences("StartApp-fba1a5307d96ef31", 0), (e.b) null), ComponentLocator.a(0, 1, "tlp", 5), ComponentLocator.this.o(), ComponentLocator.this.a(), new d(this), new e(this));
        }
    }

    /* compiled from: Sta */
    public class h0 implements i2<com.startapp.sdk.ads.video.h> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17181a;

        public h0(Context context) {
            this.f17181a = context;
        }

        public Object a() {
            return new com.startapp.sdk.ads.video.h(this.f17181a, ComponentLocator.this.f17163z.a(), com.startapp.sdk.adsbase.cache.d.f16928h);
        }
    }

    /* compiled from: Sta */
    public class i implements i2<com.startapp.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17183a;

        public i(ComponentLocator componentLocator, Context context) {
            this.f17183a = context;
        }

        public Object a() {
            return new com.startapp.b0(new com.startapp.sdk.adsbase.e(this.f17183a.getSharedPreferences("StartApp-790ba54ab8e69f2f", 0), (e.b) null));
        }
    }

    /* compiled from: Sta */
    public class i0 implements i2<h2<Context, List<String>, TrackingParams, h3>> {
        public i0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return new v(this);
        }
    }

    /* compiled from: Sta */
    public class j implements i2<a3> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17184a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ n4 f17185b;

        public j(Context context, n4 n4Var) {
            this.f17184a = context;
            this.f17185b = n4Var;
        }

        public Object a() {
            return new a3(ComponentLocator.this.a(), new f(this), ComponentLocator.this.p(), new v5(this.f17184a, new com.startapp.sdk.adsbase.e(this.f17184a.getSharedPreferences("StartApp-770c613f81fb5b52", 0), (e.b) null), new x5(this.f17184a, "StartApp-ac51a09f00e0f80c"), (Executor) this.f17185b.a(), new g(this)), new h(this));
        }
    }

    /* compiled from: Sta */
    public class j0 implements i2<com.startapp.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17187a;

        public j0(Context context) {
            this.f17187a = context;
        }

        public Object a() {
            return new com.startapp.d(this.f17187a, ComponentLocator.this.f17144g, new w(this));
        }
    }

    /* compiled from: Sta */
    public class k extends q1<ComponentLocator, Context> {
    }

    /* compiled from: Sta */
    public class k0 implements i2<com.startapp.e0> {
        public k0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return new com.startapp.e0(new x(this), new y(this));
        }
    }

    /* compiled from: Sta */
    public class l implements i2<b8> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17189a;

        public l(ComponentLocator componentLocator, Context context) {
            this.f17189a = context;
        }

        public Object a() {
            return new b8(this.f17189a, new com.startapp.sdk.adsbase.e(this.f17189a.getSharedPreferences("StartApp-9b9bfdb86df82dad", 0), (e.b) null), new k(this));
        }
    }

    /* compiled from: Sta */
    public class l0 implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* compiled from: Sta */
    public class m implements i2<com.startapp.y> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17190a;

        public m(ComponentLocator componentLocator, Context context) {
            this.f17190a = context;
        }

        public Object a() {
            return new com.startapp.y(this.f17190a);
        }
    }

    /* compiled from: Sta */
    public class m0 implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f17191a = new AtomicInteger();

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17192b;

        public m0(String str) {
            this.f17192b = str;
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder a10 = com.startapp.p0.a("startapp-");
            a10.append(this.f17192b);
            a10.append("-");
            a10.append(this.f17191a.incrementAndGet());
            return new Thread(runnable, a10.toString());
        }
    }

    /* compiled from: Sta */
    public class n implements i2<o3> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17193a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ n4 f17194b;

        public n(Context context, n4 n4Var) {
            this.f17193a = context;
            this.f17194b = n4Var;
        }

        public Object a() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5, TimeUnit.SECONDS, new PriorityBlockingQueue(), new m0("info"));
            l lVar = new l(this, threadPoolExecutor);
            t1 f10 = ComponentLocator.this.f();
            Context context = this.f17193a;
            ComponentLocator componentLocator = ComponentLocator.this;
            return new o3(new l3(this.f17193a, "StartApp-d6864f2502af7851"), (v2) this.f17194b.a(), threadPoolExecutor, lVar, f10, new u3(context, componentLocator.f17151n, componentLocator.f17145h), new m(this));
        }
    }

    /* compiled from: Sta */
    public class n0 implements i2<ua> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i2 f17196a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f17197b;

        public n0(i2 i2Var, Context context) {
            this.f17196a = i2Var;
            this.f17197b = context;
        }

        public Object a() {
            WvfMetadata wvfMetadata = (WvfMetadata) this.f17196a.a();
            if (wvfMetadata != null && j9.a(wvfMetadata.b())) {
                return new ab(this.f17197b, this.f17196a);
            }
            Context context = this.f17197b;
            ComponentLocator componentLocator = ComponentLocator.this;
            return new va(context, componentLocator.B, componentLocator.D, this.f17196a);
        }
    }

    /* compiled from: Sta */
    public class o implements i2<f1> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17199a;

        public o(Context context) {
            this.f17199a = context;
        }

        public Object a() {
            return new f1(this.f17199a, ComponentLocator.this.e(), new com.startapp.sdk.adsbase.e(this.f17199a.getSharedPreferences("StartApp-dfeaf103310003d9", 0), (e.b) null), ComponentLocator.this.g(), ComponentLocator.this.i(), new n(this));
        }
    }

    /* compiled from: Sta */
    public class o0 implements i2<ta> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17201a;

        public o0(Context context) {
            this.f17201a = context;
        }

        public Object a() {
            return new ta(this.f17201a, ComponentLocator.this.x());
        }
    }

    /* compiled from: Sta */
    public class p implements i2<q7> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17203a;

        public p(Context context) {
            this.f17203a = context;
        }

        public Object a() {
            return new q7(this.f17203a, new com.startapp.sdk.adsbase.e(this.f17203a.getSharedPreferences("StartApp-6cd3cac226013e8e", 0), (e.b) null), ComponentLocator.this.g(), ComponentLocator.this.i(), new o(this));
        }
    }

    /* compiled from: Sta */
    public class p0 implements i2<v2> {
        public p0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a("db");
        }
    }

    /* compiled from: Sta */
    public class q implements i2<t1> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17205a;

        public q(ComponentLocator componentLocator, Context context) {
            this.f17205a = context;
        }

        public Object a() {
            return new t1(this.f17205a, new p(this));
        }
    }

    /* compiled from: Sta */
    public class q0 implements i2<y4> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17206a;

        public q0(ComponentLocator componentLocator, Context context) {
            this.f17206a = context;
        }

        public Object a() {
            return new y4(this.f17206a);
        }
    }

    /* compiled from: Sta */
    public class r implements i2<g7> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17207a;

        public r(Context context) {
            this.f17207a = context;
        }

        public Object a() {
            return new g7(this.f17207a, ComponentLocator.this.l(), new q(this));
        }
    }

    /* compiled from: Sta */
    public class r0 implements i2<x3> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17209a;

        public r0(ComponentLocator componentLocator, Context context) {
            this.f17209a = context;
        }

        public Object a() {
            return new x3(this.f17209a);
        }
    }

    /* compiled from: Sta */
    public class s implements i2<i4> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17210a;

        public s(ComponentLocator componentLocator, Context context) {
            this.f17210a = context;
        }

        public Object a() {
            Pair pair;
            Context context = this.f17210a;
            com.startapp.sdk.jobs.f fVar = new com.startapp.sdk.jobs.f(context);
            if (Build.VERSION.SDK_INT >= 21) {
                pair = new Pair(new com.startapp.sdk.jobs.c(context, SchedulerService.class), fVar);
            } else {
                pair = new Pair(fVar, fVar);
            }
            return new i4((l7) pair.first, (l7) pair.second);
        }
    }

    /* compiled from: Sta */
    public class s0 implements i2<TelephonyMetadata> {
        public s0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return MetaData.f17070k.O();
        }
    }

    /* compiled from: Sta */
    public class t implements i2<b5> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17211a;

        public t(ComponentLocator componentLocator, Context context) {
            this.f17211a = context;
        }

        public Object a() {
            return new b5(this.f17211a, new com.startapp.sdk.adsbase.e(this.f17211a.getSharedPreferences("StartApp-b36110d5cb803404", 0), (e.b) null), new r(this), new Handler(Looper.getMainLooper()));
        }
    }

    /* compiled from: Sta */
    public class u implements i2<v2> {
        public u(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a("core");
        }
    }

    /* compiled from: Sta */
    public class v implements i2<com.startapp.sdk.adsbase.crashreport.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17212a;

        public v(ComponentLocator componentLocator, Context context) {
            this.f17212a = context;
        }

        public Object a() {
            ANRRemoteConfig f10 = MetaData.f17070k.f();
            com.startapp.sdk.adsbase.crashreport.b bVar = new com.startapp.sdk.adsbase.crashreport.b(f10 != null ? f10.c() : 2000, f10 != null && f10.g());
            if (f10 != null && f10.e()) {
                bVar.f17003b = new i(this, f10);
                bVar.f17002a = new com.startapp.sdk.adsbase.crashreport.a(this.f17212a, "com.startapp.", f10.h(), f10.a(), f10.d());
                if (f10.f()) {
                    bVar.f17005d = new j(this);
                }
                bVar.start();
            }
            return bVar;
        }
    }

    /* compiled from: Sta */
    public class w implements i2<Executor> {
        public w(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a(0, 4, "net-api", 10);
        }
    }

    /* compiled from: Sta */
    public class x implements i2<Executor> {
        public x(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a(0, 2, "net-media", 10);
        }
    }

    /* compiled from: Sta */
    public class y implements i2<Executor> {
        public y(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a(0, 2, "disk", 5);
        }
    }

    /* compiled from: Sta */
    public class z implements i2<Executor> {
        public z(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a(0, 4, "generic", 5);
        }
    }

    public ComponentLocator(Context context) {
        this.I = new n4<>(new v(this, context));
        this.f17138a = new n4<>(new n0(new g0(this), context));
        this.f17139b = new n4<>(new o0(context));
        n4 n4Var = new n4(new p0(this));
        this.f17140c = new n4<>(new q0(this, context));
        this.f17141d = new n4<>(new r0(this, context));
        s0 s0Var = new s0(this);
        this.f17142e = new n4<>(new a(context, s0Var));
        this.f17143f = new n4<>(new b(context, s0Var));
        this.f17144g = new n4<>(new c(this, context));
        this.f17145h = new n4<>(new d(this, context));
        this.f17146i = new n4<>(new e(context));
        this.f17147j = new n4<>(new f(this, context));
        this.f17149l = new n4<>(new h(context));
        this.f17150m = new n4<>(new i(this, context));
        this.f17151n = new n4<>(new j(context, n4Var));
        this.f17152o = new n4<>(new l(this, context));
        this.f17153p = new n4<>(new m(this, context));
        this.f17154q = new n4<>(new n(context, n4Var));
        this.f17155r = new n4<>(new o(context));
        this.f17156s = new n4<>(new p(context));
        this.f17157t = new n4<>(new q(this, context));
        this.f17158u = new n4<>(new r(context));
        this.f17159v = new n4<>(new s(this, context));
        this.f17160w = new n4<>(new t(this, context));
        this.f17161x = new n4<>(new u(this));
        this.f17162y = new n4<>(new w(this));
        this.f17163z = new n4<>(new x(this));
        this.A = new n4<>(new y(this));
        this.B = new n4<>(new z(this));
        this.C = new n4<>(new a0(this));
        this.D = new n4<>(new b0(this));
        this.E = new n4<>(new c0(this, context));
        this.F = new n4<>(new d0(this, context));
        this.G = new n4<>(new e0(this, context));
        this.H = new n4<>(new f0(this, context));
        this.J = new n4<>(new h0(context));
        this.K = new n4<>(new i0(this));
        this.L = new n4<>(new j0(context));
        this.M = new n4<>(new k0(this));
    }

    public static ComponentLocator a(Context context) {
        q1<ComponentLocator, Context> q1Var = N;
        T t10 = q1Var.f16284a;
        if (t10 == null) {
            synchronized (q1Var) {
                t10 = q1Var.f16284a;
                if (t10 == null) {
                    Context a10 = com.startapp.h0.a(context);
                    if (a10 != null) {
                        context = a10;
                    }
                    t10 = new ComponentLocator(context);
                    q1Var.f16284a = t10;
                }
            }
        }
        return (ComponentLocator) t10;
    }

    public com.startapp.y b() {
        return this.f17153p.a();
    }

    public com.startapp.b0 c() {
        return this.f17150m.a();
    }

    public com.startapp.e0 d() {
        return this.M.a();
    }

    public com.startapp.sdk.adsbase.e e() {
        return this.E.a();
    }

    public t1 f() {
        return this.f17157t.a();
    }

    public u1 g() {
        return this.f17146i.a();
    }

    public v2 h() {
        return this.f17161x.a();
    }

    public v2 i() {
        return this.C.a();
    }

    public Executor j() {
        return this.A.a();
    }

    public com.startapp.sdk.adsbase.e k() {
        return this.F.a();
    }

    public Executor l() {
        return this.B.a();
    }

    public a3 m() {
        return this.f17151n.a();
    }

    public o3 n() {
        return this.f17154q.a();
    }

    public i4 o() {
        return this.f17159v.a();
    }

    public y4 p() {
        return this.f17140c.a();
    }

    public b5 q() {
        return this.f17160w.a();
    }

    public Executor r() {
        return this.f17162y.a();
    }

    public c7 s() {
        return this.f17145h.a();
    }

    public g7 t() {
        return this.f17158u.a();
    }

    public u7 u() {
        return this.f17148k.a();
    }

    public h8 v() {
        return this.f17142e.a();
    }

    public k8 w() {
        return this.f17143f.a();
    }

    public ua x() {
        return this.f17138a.a();
    }

    public static ThreadFactory b(String str) {
        return new m0(str);
    }

    public AdvertisingIdResolver a() {
        return this.f17144g.a();
    }

    public static Executor a(int i10, int i11, String str, long j10) {
        if (Build.VERSION.SDK_INT >= 21) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i11, j10, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() {
                public boolean offer(Object obj) {
                    return tryTransfer((Runnable) obj);
                }
            }, new m0(str), new l0());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        } else if (i11 < 2) {
            return Executors.newSingleThreadExecutor(new m0(str));
        } else {
            return Executors.newCachedThreadPool(new m0(str));
        }
    }

    public static v2 a(String str) {
        x2 x2Var = new x2("startapp-" + str);
        x2Var.start();
        return new w2(new Handler(x2Var.getLooper()));
    }
}
