package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import bd.h;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kc.f;
import kc.g;
import kc.i;
import kc.j;
import kc.m;
import kc.n;
import kc.o;
import kc.p;
import kc.q;
import zb.a;

/* compiled from: FlutterEngine */
public class a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f33536a;

    /* renamed from: b  reason: collision with root package name */
    private final jc.a f33537b;

    /* renamed from: c  reason: collision with root package name */
    private final zb.a f33538c;

    /* renamed from: d  reason: collision with root package name */
    private final c f33539d;

    /* renamed from: e  reason: collision with root package name */
    private final mc.a f33540e;

    /* renamed from: f  reason: collision with root package name */
    private final kc.a f33541f;

    /* renamed from: g  reason: collision with root package name */
    private final kc.b f33542g;

    /* renamed from: h  reason: collision with root package name */
    private final f f33543h;

    /* renamed from: i  reason: collision with root package name */
    private final g f33544i;

    /* renamed from: j  reason: collision with root package name */
    private final kc.h f33545j;

    /* renamed from: k  reason: collision with root package name */
    private final i f33546k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final m f33547l;

    /* renamed from: m  reason: collision with root package name */
    private final j f33548m;

    /* renamed from: n  reason: collision with root package name */
    private final n f33549n;

    /* renamed from: o  reason: collision with root package name */
    private final o f33550o;

    /* renamed from: p  reason: collision with root package name */
    private final p f33551p;

    /* renamed from: q  reason: collision with root package name */
    private final q f33552q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final io.flutter.plugin.platform.q f33553r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final Set<b> f33554s;

    /* renamed from: t  reason: collision with root package name */
    private final b f33555t;

    /* renamed from: io.flutter.embedding.engine.a$a  reason: collision with other inner class name */
    /* compiled from: FlutterEngine */
    class C0381a implements b {
        C0381a() {
        }

        public void a() {
        }

        public void b() {
            xb.b.f("FlutterEngine", "onPreEngineRestart()");
            for (b b10 : a.this.f33554s) {
                b10.b();
            }
            a.this.f33553r.m0();
            a.this.f33547l.g();
        }
    }

    /* compiled from: FlutterEngine */
    public interface b {
        void a();

        void b();
    }

    public a(Context context) {
        this(context, (String[]) null);
    }

    private void f() {
        xb.b.f("FlutterEngine", "Attaching to JNI.");
        this.f33536a.attachToNative();
        if (!x()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean x() {
        return this.f33536a.isAttached();
    }

    public void a(float f10, float f11, float f12) {
        this.f33536a.updateDisplayMetrics(0, f10, f11, f12);
    }

    public void e(b bVar) {
        this.f33554s.add(bVar);
    }

    public void g() {
        xb.b.f("FlutterEngine", "Destroying.");
        for (b a10 : this.f33554s) {
            a10.a();
        }
        this.f33539d.j();
        this.f33553r.i0();
        this.f33538c.q();
        this.f33536a.removeEngineLifecycleListener(this.f33555t);
        this.f33536a.setDeferredComponentManager((ac.a) null);
        this.f33536a.detachFromNativeAndReleaseResources();
        if (xb.a.e().a() != null) {
            xb.a.e().a().destroy();
            this.f33542g.c((ac.a) null);
        }
    }

    public kc.a h() {
        return this.f33541f;
    }

    public ec.b i() {
        return this.f33539d;
    }

    public zb.a j() {
        return this.f33538c;
    }

    public f k() {
        return this.f33543h;
    }

    public mc.a l() {
        return this.f33540e;
    }

    public kc.h m() {
        return this.f33545j;
    }

    public i n() {
        return this.f33546k;
    }

    public j o() {
        return this.f33548m;
    }

    public io.flutter.plugin.platform.q p() {
        return this.f33553r;
    }

    public dc.b q() {
        return this.f33539d;
    }

    public jc.a r() {
        return this.f33537b;
    }

    public m s() {
        return this.f33547l;
    }

    public n t() {
        return this.f33549n;
    }

    public o u() {
        return this.f33550o;
    }

    public p v() {
        return this.f33551p;
    }

    public q w() {
        return this.f33552q;
    }

    /* access modifiers changed from: package-private */
    public a y(Context context, a.c cVar, String str, List<String> list, io.flutter.plugin.platform.q qVar, boolean z10, boolean z11) {
        a.c cVar2 = cVar;
        if (x()) {
            String str2 = str;
            return new a(context, (bc.f) null, this.f33536a.spawn(cVar2.f39493c, cVar2.f39492b, str, list), qVar, (String[]) null, z10, z11);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public a(Context context, String[] strArr) {
        this(context, (bc.f) null, (FlutterJNI) null, strArr, true);
    }

    public a(Context context, String[] strArr, boolean z10) {
        this(context, (bc.f) null, (FlutterJNI) null, strArr, z10);
    }

    public a(Context context, bc.f fVar, FlutterJNI flutterJNI, String[] strArr, boolean z10) {
        this(context, fVar, flutterJNI, new io.flutter.plugin.platform.q(), strArr, z10);
    }

    public a(Context context, bc.f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.q qVar, String[] strArr, boolean z10) {
        this(context, fVar, flutterJNI, qVar, strArr, z10, false);
    }

    public a(Context context, bc.f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.q qVar, String[] strArr, boolean z10, boolean z11) {
        this(context, fVar, flutterJNI, qVar, strArr, z10, z11, (d) null);
    }

    public a(Context context, bc.f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.q qVar, String[] strArr, boolean z10, boolean z11, d dVar) {
        AssetManager assetManager;
        this.f33554s = new HashSet();
        this.f33555t = new C0381a();
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        xb.a e10 = xb.a.e();
        flutterJNI = flutterJNI == null ? e10.d().a() : flutterJNI;
        this.f33536a = flutterJNI;
        zb.a aVar = new zb.a(flutterJNI, assetManager);
        this.f33538c = aVar;
        aVar.p();
        ac.a a10 = xb.a.e().a();
        this.f33541f = new kc.a(aVar, flutterJNI);
        kc.b bVar = new kc.b(aVar);
        this.f33542g = bVar;
        this.f33543h = new f(aVar);
        g gVar = new g(aVar);
        this.f33544i = gVar;
        this.f33545j = new kc.h(aVar);
        this.f33546k = new i(aVar);
        this.f33548m = new j(aVar);
        this.f33547l = new m(aVar, z11);
        this.f33549n = new n(aVar);
        this.f33550o = new o(aVar);
        this.f33551p = new p(aVar);
        this.f33552q = new q(aVar);
        if (a10 != null) {
            a10.e(bVar);
        }
        mc.a aVar2 = new mc.a(context, gVar);
        this.f33540e = aVar2;
        fVar = fVar == null ? e10.c() : fVar;
        if (!flutterJNI.isAttached()) {
            fVar.r(context.getApplicationContext());
            fVar.g(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f33555t);
        flutterJNI.setPlatformViewsController(qVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        flutterJNI.setDeferredComponentManager(e10.a());
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.f33537b = new jc.a(flutterJNI);
        this.f33553r = qVar;
        qVar.g0();
        this.f33539d = new c(context.getApplicationContext(), this, fVar, dVar);
        aVar2.d(context.getResources().getConfiguration());
        if (z10 && fVar.f()) {
            ic.a.a(this);
        }
        h.c(context, this);
    }
}
