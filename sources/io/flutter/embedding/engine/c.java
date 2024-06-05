package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.i;
import dc.a;
import ec.c;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import lc.m;
import lc.n;
import lc.p;
import lc.q;

/* compiled from: FlutterEngineConnectionRegistry */
class c implements dc.b, ec.b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends dc.a>, dc.a> f33559a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final a f33560b;

    /* renamed from: c  reason: collision with root package name */
    private final a.b f33561c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends dc.a>, ec.a> f33562d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private io.flutter.embedding.android.c<Activity> f33563e;

    /* renamed from: f  reason: collision with root package name */
    private C0382c f33564f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f33565g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<? extends dc.a>, hc.a> f33566h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Service f33567i;

    /* renamed from: j  reason: collision with root package name */
    private f f33568j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<? extends dc.a>, fc.a> f33569k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private BroadcastReceiver f33570l;

    /* renamed from: m  reason: collision with root package name */
    private d f33571m;

    /* renamed from: n  reason: collision with root package name */
    private final Map<Class<? extends dc.a>, gc.a> f33572n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private ContentProvider f33573o;

    /* renamed from: p  reason: collision with root package name */
    private e f33574p;

    /* compiled from: FlutterEngineConnectionRegistry */
    private static class b implements a.C0360a {

        /* renamed from: a  reason: collision with root package name */
        final bc.f f33575a;

        public String a(String str) {
            return this.f33575a.k(str);
        }

        private b(bc.f fVar) {
            this.f33575a = fVar;
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$c  reason: collision with other inner class name */
    /* compiled from: FlutterEngineConnectionRegistry */
    private static class C0382c implements ec.c {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f33576a;

        /* renamed from: b  reason: collision with root package name */
        private final HiddenLifecycleReference f33577b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<p> f33578c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Set<m> f33579d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        private final Set<n> f33580e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        private final Set<q> f33581f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        private final Set<Object> f33582g = new HashSet();

        /* renamed from: h  reason: collision with root package name */
        private final Set<c.a> f33583h = new HashSet();

        public C0382c(Activity activity, i iVar) {
            this.f33576a = activity;
            this.f33577b = new HiddenLifecycleReference(iVar);
        }

        public void a(p pVar) {
            this.f33578c.add(pVar);
        }

        public void b(m mVar) {
            this.f33579d.add(mVar);
        }

        public void c(p pVar) {
            this.f33578c.remove(pVar);
        }

        public void d(n nVar) {
            this.f33580e.remove(nVar);
        }

        public void e(m mVar) {
            this.f33579d.remove(mVar);
        }

        public void f(n nVar) {
            this.f33580e.add(nVar);
        }

        /* access modifiers changed from: package-private */
        public boolean g(int i10, int i11, Intent intent) {
            Iterator it = new HashSet(this.f33579d).iterator();
            while (true) {
                boolean z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z10;
                    }
                    if (((m) it.next()).onActivityResult(i10, i11, intent) || z10) {
                        z10 = true;
                    }
                }
            }
        }

        public Activity getActivity() {
            return this.f33576a;
        }

        /* access modifiers changed from: package-private */
        public void h(Intent intent) {
            for (n d10 : this.f33580e) {
                d10.d(intent);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean i(int i10, String[] strArr, int[] iArr) {
            Iterator<p> it = this.f33578c.iterator();
            while (true) {
                boolean z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z10;
                    }
                    if (it.next().onRequestPermissionsResult(i10, strArr, iArr) || z10) {
                        z10 = true;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void j(Bundle bundle) {
            for (c.a b10 : this.f33583h) {
                b10.b(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(Bundle bundle) {
            for (c.a onSaveInstanceState : this.f33583h) {
                onSaveInstanceState.onSaveInstanceState(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        public void l() {
            for (q c10 : this.f33581f) {
                c10.c();
            }
        }
    }

    /* compiled from: FlutterEngineConnectionRegistry */
    private static class d implements fc.b {
    }

    /* compiled from: FlutterEngineConnectionRegistry */
    private static class e implements gc.b {
    }

    /* compiled from: FlutterEngineConnectionRegistry */
    private static class f implements hc.b {
    }

    c(Context context, a aVar, bc.f fVar, d dVar) {
        this.f33560b = aVar;
        this.f33561c = new a.b(context, aVar, aVar.j(), aVar.r(), aVar.p().X(), new b(fVar), dVar);
    }

    private void i(Activity activity, i iVar) {
        this.f33564f = new C0382c(activity, iVar);
        this.f33560b.p().s0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f33560b.p().D(activity, this.f33560b.r(), this.f33560b.j());
        for (ec.a next : this.f33562d.values()) {
            if (this.f33565g) {
                next.onReattachedToActivityForConfigChanges(this.f33564f);
            } else {
                next.onAttachedToActivity(this.f33564f);
            }
        }
        this.f33565g = false;
    }

    private void k() {
        this.f33560b.p().P();
        this.f33563e = null;
        this.f33564f = null;
    }

    private void l() {
        if (q()) {
            g();
        } else if (t()) {
            o();
        } else if (r()) {
            m();
        } else if (s()) {
            n();
        }
    }

    private boolean q() {
        return this.f33563e != null;
    }

    private boolean r() {
        return this.f33570l != null;
    }

    private boolean s() {
        return this.f33573o != null;
    }

    private boolean t() {
        return this.f33567i != null;
    }

    public dc.a a(Class<? extends dc.a> cls) {
        return this.f33559a.get(cls);
    }

    public void b(Bundle bundle) {
        if (q()) {
            bd.e.a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f33564f.j(bundle);
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    public void c() {
        if (q()) {
            bd.e.a("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f33564f.l();
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    public void d(Intent intent) {
        if (q()) {
            bd.e.a("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f33564f.h(intent);
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    public void e(io.flutter.embedding.android.c<Activity> cVar, i iVar) {
        bd.e.a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.c<Activity> cVar2 = this.f33563e;
            if (cVar2 != null) {
                cVar2.c();
            }
            l();
            this.f33563e = cVar;
            i(cVar.d(), iVar);
        } finally {
            bd.e.d();
        }
    }

    public void f(dc.a aVar) {
        bd.e.a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (p(aVar.getClass())) {
                xb.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f33560b + ").");
                return;
            }
            xb.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f33559a.put(aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.f33561c);
            if (aVar instanceof ec.a) {
                ec.a aVar2 = (ec.a) aVar;
                this.f33562d.put(aVar.getClass(), aVar2);
                if (q()) {
                    aVar2.onAttachedToActivity(this.f33564f);
                }
            }
            if (aVar instanceof hc.a) {
                hc.a aVar3 = (hc.a) aVar;
                this.f33566h.put(aVar.getClass(), aVar3);
                if (t()) {
                    aVar3.a(this.f33568j);
                }
            }
            if (aVar instanceof fc.a) {
                fc.a aVar4 = (fc.a) aVar;
                this.f33569k.put(aVar.getClass(), aVar4);
                if (r()) {
                    aVar4.a(this.f33571m);
                }
            }
            if (aVar instanceof gc.a) {
                gc.a aVar5 = (gc.a) aVar;
                this.f33572n.put(aVar.getClass(), aVar5);
                if (s()) {
                    aVar5.a(this.f33574p);
                }
            }
            bd.e.d();
        } finally {
            bd.e.d();
        }
    }

    public void g() {
        if (q()) {
            bd.e.a("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (ec.a onDetachedFromActivity : this.f33562d.values()) {
                    onDetachedFromActivity.onDetachedFromActivity();
                }
                k();
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void h() {
        if (q()) {
            bd.e.a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            try {
                this.f33565g = true;
                for (ec.a onDetachedFromActivityForConfigChanges : this.f33562d.values()) {
                    onDetachedFromActivityForConfigChanges.onDetachedFromActivityForConfigChanges();
                }
                k();
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void j() {
        xb.b.f("FlutterEngineCxnRegstry", "Destroying.");
        l();
        w();
    }

    public void m() {
        if (r()) {
            bd.e.a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                for (fc.a b10 : this.f33569k.values()) {
                    b10.b();
                }
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
        }
    }

    public void n() {
        if (s()) {
            bd.e.a("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                for (gc.a b10 : this.f33572n.values()) {
                    b10.b();
                }
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
        }
    }

    public void o() {
        if (t()) {
            bd.e.a("FlutterEngineConnectionRegistry#detachFromService");
            try {
                for (hc.a b10 : this.f33566h.values()) {
                    b10.b();
                }
                this.f33567i = null;
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
        }
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (q()) {
            bd.e.a("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                return this.f33564f.g(i10, i11, intent);
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (q()) {
            bd.e.a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                return this.f33564f.i(i10, strArr, iArr);
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (q()) {
            bd.e.a("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f33564f.k(bundle);
            } finally {
                bd.e.d();
            }
        } else {
            xb.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    public boolean p(Class<? extends dc.a> cls) {
        return this.f33559a.containsKey(cls);
    }

    public void u(Class<? extends dc.a> cls) {
        dc.a aVar = this.f33559a.get(cls);
        if (aVar != null) {
            bd.e.a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
            try {
                if (aVar instanceof ec.a) {
                    if (q()) {
                        ((ec.a) aVar).onDetachedFromActivity();
                    }
                    this.f33562d.remove(cls);
                }
                if (aVar instanceof hc.a) {
                    if (t()) {
                        ((hc.a) aVar).b();
                    }
                    this.f33566h.remove(cls);
                }
                if (aVar instanceof fc.a) {
                    if (r()) {
                        ((fc.a) aVar).b();
                    }
                    this.f33569k.remove(cls);
                }
                if (aVar instanceof gc.a) {
                    if (s()) {
                        ((gc.a) aVar).b();
                    }
                    this.f33572n.remove(cls);
                }
                aVar.onDetachedFromEngine(this.f33561c);
                this.f33559a.remove(cls);
            } finally {
                bd.e.d();
            }
        }
    }

    public void v(Set<Class<? extends dc.a>> set) {
        for (Class<? extends dc.a> u10 : set) {
            u(u10);
        }
    }

    public void w() {
        v(new HashSet(this.f33559a.keySet()));
        this.f33559a.clear();
    }
}
