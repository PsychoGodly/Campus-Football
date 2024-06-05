package io.flutter.plugin.platform;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bd.h;
import io.flutter.embedding.android.k;
import io.flutter.embedding.android.u;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.view.c;
import io.flutter.view.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kc.l;
import xb.b;

/* compiled from: PlatformViewsController */
public class q implements k {
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static Class[] f33738w = {SurfaceView.class};

    /* renamed from: a  reason: collision with root package name */
    private final i f33739a = new i();

    /* renamed from: b  reason: collision with root package name */
    private io.flutter.embedding.android.a f33740b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Context f33741c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public k f33742d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public f f33743e;

    /* renamed from: f  reason: collision with root package name */
    private io.flutter.plugin.editing.f f33744f;

    /* renamed from: g  reason: collision with root package name */
    private l f33745g;

    /* renamed from: h  reason: collision with root package name */
    private final a f33746h = new a();

    /* renamed from: i  reason: collision with root package name */
    final HashMap<Integer, r> f33747i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    final HashMap<Context, View> f33748j = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray<f> f33749k = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray<cc.a> f33750l = new SparseArray<>();

    /* renamed from: m  reason: collision with root package name */
    private final SparseArray<b> f33751m = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray<j> f33752n = new SparseArray<>();

    /* renamed from: o  reason: collision with root package name */
    private int f33753o = 0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f33754p = false;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f33755q = true;

    /* renamed from: r  reason: collision with root package name */
    private final HashSet<Integer> f33756r = new HashSet<>();

    /* renamed from: s  reason: collision with root package name */
    private final HashSet<Integer> f33757s = new HashSet<>();

    /* renamed from: t  reason: collision with root package name */
    private final u f33758t = u.a();
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f33759u = false;

    /* renamed from: v  reason: collision with root package name */
    private final l.g f33760v = new a();

    /* compiled from: PlatformViewsController */
    class a implements l.g {
        a() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(r rVar, float f10, l.b bVar) {
            q.this.x0(rVar);
            if (q.this.f33741c != null) {
                f10 = q.this.W();
            }
            bVar.a(new l.c(q.this.u0((double) rVar.d(), f10), q.this.u0((double) rVar.c(), f10)));
        }

        public void a(boolean z10) {
            boolean unused = q.this.f33755q = z10;
        }

        public void b(int i10, int i11) {
            View view;
            if (q.y0(i11)) {
                if (q.this.c(i10)) {
                    view = q.this.f33747i.get(Integer.valueOf(i10)).e();
                } else {
                    f fVar = (f) q.this.f33749k.get(i10);
                    if (fVar == null) {
                        b.b("PlatformViewsController", "Setting direction to an unknown view with id: " + i10);
                        return;
                    }
                    view = fVar.getView();
                }
                if (view == null) {
                    b.b("PlatformViewsController", "Setting direction to a null view with id: " + i10);
                    return;
                }
                view.setLayoutDirection(i11);
                return;
            }
            throw new IllegalStateException("Trying to set unknown direction value: " + i11 + "(view id: " + i10 + ")");
        }

        public void c(l.e eVar, l.b bVar) {
            int m10 = q.this.w0(eVar.f35909b);
            int m11 = q.this.w0(eVar.f35910c);
            int i10 = eVar.f35908a;
            if (q.this.c(i10)) {
                float n10 = q.this.W();
                r rVar = q.this.f33747i.get(Integer.valueOf(i10));
                q.this.e0(rVar);
                rVar.h(m10, m11, new p(this, rVar, n10, bVar));
                return;
            }
            f fVar = (f) q.this.f33749k.get(i10);
            j jVar = (j) q.this.f33752n.get(i10);
            if (fVar == null || jVar == null) {
                b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i10);
                return;
            }
            if (m10 > jVar.e() || m11 > jVar.d()) {
                jVar.i(m10, m11);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = m10;
            layoutParams.height = m11;
            jVar.setLayoutParams(layoutParams);
            View view = fVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = m10;
                layoutParams2.height = m11;
                view.setLayoutParams(layoutParams2);
            }
            bVar.a(new l.c(q.this.t0((double) jVar.e()), q.this.t0((double) jVar.d())));
        }

        public void d(l.f fVar) {
            int i10 = fVar.f35911a;
            float f10 = q.this.f33741c.getResources().getDisplayMetrics().density;
            if (q.this.c(i10)) {
                q.this.f33747i.get(Integer.valueOf(i10)).b(q.this.v0(f10, fVar, true));
                return;
            }
            f fVar2 = (f) q.this.f33749k.get(i10);
            if (fVar2 == null) {
                b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i10);
                return;
            }
            View view = fVar2.getView();
            if (view == null) {
                b.b("PlatformViewsController", "Sending touch to a null view with id: " + i10);
                return;
            }
            view.dispatchTouchEvent(q.this.v0(f10, fVar, false));
        }

        public void e(l.d dVar) {
            q.this.T(19);
            q.this.U(dVar);
            q.this.I(q.this.N(dVar, false), dVar);
        }

        public void f(int i10, double d10, double d11) {
            if (!q.this.c(i10)) {
                j jVar = (j) q.this.f33752n.get(i10);
                if (jVar == null) {
                    b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i10);
                    return;
                }
                int m10 = q.this.w0(d10);
                int m11 = q.this.w0(d11);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
                layoutParams.topMargin = m10;
                layoutParams.leftMargin = m11;
                jVar.j(layoutParams);
            }
        }

        public long g(l.d dVar) {
            q.this.U(dVar);
            int i10 = dVar.f35895a;
            if (q.this.f33752n.get(i10) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i10);
            } else if (q.this.f33743e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i10);
            } else if (q.this.f33742d != null) {
                boolean z10 = true;
                f N = q.this.N(dVar, true);
                View view = N.getView();
                if (view.getParent() == null) {
                    if (Build.VERSION.SDK_INT < 23 || h.g(view, q.f33738w)) {
                        z10 = false;
                    }
                    if (!z10) {
                        if (dVar.f35902h == l.d.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                            q.this.I(N, dVar);
                            return -2;
                        } else if (!q.this.f33759u) {
                            return q.this.K(N, dVar);
                        }
                    }
                    return q.this.J(N, dVar);
                }
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i10);
            }
        }

        public void h(int i10) {
            View view;
            if (q.this.c(i10)) {
                view = q.this.f33747i.get(Integer.valueOf(i10)).e();
            } else {
                f fVar = (f) q.this.f33749k.get(i10);
                if (fVar == null) {
                    b.b("PlatformViewsController", "Clearing focus on an unknown view with id: " + i10);
                    return;
                }
                view = fVar.getView();
            }
            if (view == null) {
                b.b("PlatformViewsController", "Clearing focus on a null view with id: " + i10);
                return;
            }
            view.clearFocus();
        }

        public void i(int i10) {
            f fVar = (f) q.this.f33749k.get(i10);
            if (fVar == null) {
                b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i10);
                return;
            }
            q.this.f33749k.remove(i10);
            try {
                fVar.dispose();
            } catch (RuntimeException e10) {
                b.c("PlatformViewsController", "Disposing platform view threw an exception", e10);
            }
            if (q.this.c(i10)) {
                View e11 = q.this.f33747i.get(Integer.valueOf(i10)).e();
                if (e11 != null) {
                    q.this.f33748j.remove(e11.getContext());
                }
                q.this.f33747i.remove(Integer.valueOf(i10));
                return;
            }
            j jVar = (j) q.this.f33752n.get(i10);
            if (jVar != null) {
                jVar.removeAllViews();
                jVar.h();
                jVar.o();
                ViewGroup viewGroup = (ViewGroup) jVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(jVar);
                }
                q.this.f33752n.remove(i10);
                return;
            }
            cc.a aVar = (cc.a) q.this.f33750l.get(i10);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                q.this.f33750l.remove(i10);
            }
        }
    }

    /* access modifiers changed from: private */
    public void I(f fVar, l.d dVar) {
        T(19);
        b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f35895a);
    }

    /* access modifiers changed from: private */
    public long J(f fVar, l.d dVar) {
        long j10;
        j jVar;
        T(23);
        b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f35895a);
        int w02 = w0(dVar.f35897c);
        int w03 = w0(dVar.f35898d);
        if (this.f33759u) {
            jVar = new j(this.f33741c);
            j10 = -1;
        } else {
            f.c h10 = this.f33743e.h();
            j jVar2 = new j(this.f33741c, h10);
            long c10 = h10.c();
            jVar = jVar2;
            j10 = c10;
        }
        jVar.m(this.f33740b);
        jVar.i(w02, w03);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(w02, w03);
        int w04 = w0(dVar.f35899e);
        int w05 = w0(dVar.f35900f);
        layoutParams.topMargin = w04;
        layoutParams.leftMargin = w05;
        jVar.j(layoutParams);
        View view = fVar.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(w02, w03));
        view.setImportantForAccessibility(4);
        jVar.addView(view);
        jVar.k(new n(this, dVar));
        this.f33742d.addView(jVar);
        this.f33752n.append(dVar.f35895a, jVar);
        f0(fVar);
        return j10;
    }

    /* access modifiers changed from: private */
    public long K(f fVar, l.d dVar) {
        T(20);
        b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f35895a);
        f.c h10 = this.f33743e.h();
        f fVar2 = fVar;
        f.c cVar = h10;
        r a10 = r.a(this.f33741c, this.f33746h, fVar2, cVar, w0(dVar.f35897c), w0(dVar.f35898d), dVar.f35895a, (Object) null, new m(this, dVar));
        if (a10 != null) {
            this.f33747i.put(Integer.valueOf(dVar.f35895a), a10);
            View view = fVar.getView();
            this.f33748j.put(view.getContext(), view);
            return h10.c();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + dVar.f35896b + " with id: " + dVar.f35895a);
    }

    private void S() {
        while (this.f33749k.size() > 0) {
            this.f33760v.i(this.f33749k.keyAt(0));
        }
    }

    /* access modifiers changed from: private */
    public void T(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < i10) {
            throw new IllegalStateException("Trying to use platform views with API " + i11 + ", required API level is: " + i10);
        }
    }

    /* access modifiers changed from: private */
    public void U(l.d dVar) {
        if (!y0(dVar.f35901g)) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f35901g + "(view id: " + dVar.f35895a + ")");
        }
    }

    private void V(boolean z10) {
        for (int i10 = 0; i10 < this.f33751m.size(); i10++) {
            int keyAt = this.f33751m.keyAt(i10);
            b valueAt = this.f33751m.valueAt(i10);
            if (this.f33756r.contains(Integer.valueOf(keyAt))) {
                this.f33742d.n(valueAt);
                z10 &= valueAt.c();
            } else {
                if (!this.f33754p) {
                    valueAt.b();
                }
                valueAt.setVisibility(8);
                this.f33742d.removeView(valueAt);
            }
        }
        for (int i11 = 0; i11 < this.f33750l.size(); i11++) {
            int keyAt2 = this.f33750l.keyAt(i11);
            View view = this.f33750l.get(keyAt2);
            if (!this.f33757s.contains(Integer.valueOf(keyAt2)) || (!z10 && this.f33755q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public float W() {
        return this.f33741c.getResources().getDisplayMetrics().density;
    }

    private void Z() {
        if (this.f33755q && !this.f33754p) {
            this.f33742d.q();
            this.f33754p = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a0(l.d dVar, View view, boolean z10) {
        if (z10) {
            this.f33745g.d(dVar.f35895a);
            return;
        }
        io.flutter.plugin.editing.f fVar = this.f33744f;
        if (fVar != null) {
            fVar.l(dVar.f35895a);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b0(l.d dVar, View view, boolean z10) {
        if (z10) {
            this.f33745g.d(dVar.f35895a);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c0(int i10, View view, boolean z10) {
        if (z10) {
            this.f33745g.d(i10);
            return;
        }
        io.flutter.plugin.editing.f fVar = this.f33744f;
        if (fVar != null) {
            fVar.l(i10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d0() {
        V(false);
    }

    /* access modifiers changed from: private */
    public void e0(r rVar) {
        io.flutter.plugin.editing.f fVar = this.f33744f;
        if (fVar != null) {
            fVar.u();
            rVar.f();
        }
    }

    private void f0(f fVar) {
        k kVar = this.f33742d;
        if (kVar == null) {
            b.e("PlatformViewsController", "null flutterView");
        } else {
            fVar.onFlutterViewAttached(kVar);
        }
    }

    private static MotionEvent.PointerCoords n0(Object obj, float f10) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f10;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f10;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f10;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f10;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f10;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f10;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> o0(Object obj, float f10) {
        ArrayList arrayList = new ArrayList();
        for (Object n02 : (List) obj) {
            arrayList.add(n0(n02, f10));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties p0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> q0(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object p02 : (List) obj) {
            arrayList.add(p0(p02));
        }
        return arrayList;
    }

    private void r0() {
        if (this.f33742d == null) {
            b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i10 = 0; i10 < this.f33751m.size(); i10++) {
            this.f33742d.removeView(this.f33751m.valueAt(i10));
        }
        this.f33751m.clear();
    }

    /* access modifiers changed from: private */
    public int t0(double d10) {
        return u0(d10, W());
    }

    /* access modifiers changed from: private */
    public int u0(double d10, float f10) {
        return (int) Math.round(d10 / ((double) f10));
    }

    /* access modifiers changed from: private */
    public int w0(double d10) {
        return (int) Math.round(d10 * ((double) W()));
    }

    /* access modifiers changed from: private */
    public void x0(r rVar) {
        io.flutter.plugin.editing.f fVar = this.f33744f;
        if (fVar != null) {
            fVar.H();
            rVar.g();
        }
    }

    /* access modifiers changed from: private */
    public static boolean y0(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public void D(Context context, f fVar, zb.a aVar) {
        if (this.f33741c == null) {
            this.f33741c = context;
            this.f33743e = fVar;
            l lVar = new l(aVar);
            this.f33745g = lVar;
            lVar.e(this.f33760v);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void E(io.flutter.plugin.editing.f fVar) {
        this.f33744f = fVar;
    }

    public void F(jc.a aVar) {
        this.f33740b = new io.flutter.embedding.android.a(aVar, true);
    }

    public void G(k kVar) {
        this.f33742d = kVar;
        for (int i10 = 0; i10 < this.f33752n.size(); i10++) {
            this.f33742d.addView(this.f33752n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f33750l.size(); i11++) {
            this.f33742d.addView(this.f33750l.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.f33749k.size(); i12++) {
            this.f33749k.valueAt(i12).onFlutterViewAttached(this.f33742d);
        }
    }

    public boolean H(View view) {
        if (view == null || !this.f33748j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f33748j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public FlutterOverlaySurface L() {
        return M(new b(this.f33742d.getContext(), this.f33742d.getWidth(), this.f33742d.getHeight(), this.f33746h));
    }

    public FlutterOverlaySurface M(b bVar) {
        int i10 = this.f33753o;
        this.f33753o = i10 + 1;
        this.f33751m.put(i10, bVar);
        return new FlutterOverlaySurface(i10, bVar.getSurface());
    }

    public f N(l.d dVar, boolean z10) {
        g b10 = this.f33739a.b(dVar.f35896b);
        if (b10 != null) {
            Object obj = null;
            if (dVar.f35903i != null) {
                obj = b10.getCreateArgsCodec().b(dVar.f35903i);
            }
            f create = b10.create(z10 ? new MutableContextWrapper(this.f33741c) : this.f33741c, dVar.f35895a, obj);
            View view = create.getView();
            if (view != null) {
                view.setLayoutDirection(dVar.f35901g);
                this.f33749k.put(dVar.f35895a, create);
                f0(create);
                return create;
            }
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f35896b);
    }

    public void O() {
        for (int i10 = 0; i10 < this.f33751m.size(); i10++) {
            b valueAt = this.f33751m.valueAt(i10);
            valueAt.b();
            valueAt.e();
        }
    }

    public void P() {
        l lVar = this.f33745g;
        if (lVar != null) {
            lVar.e((l.g) null);
        }
        O();
        this.f33745g = null;
        this.f33741c = null;
        this.f33743e = null;
    }

    public void Q() {
        for (int i10 = 0; i10 < this.f33752n.size(); i10++) {
            this.f33742d.removeView(this.f33752n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f33750l.size(); i11++) {
            this.f33742d.removeView(this.f33750l.valueAt(i11));
        }
        O();
        r0();
        this.f33742d = null;
        this.f33754p = false;
        for (int i12 = 0; i12 < this.f33749k.size(); i12++) {
            this.f33749k.valueAt(i12).onFlutterViewDetached();
        }
    }

    public void R() {
        this.f33744f = null;
    }

    public h X() {
        return this.f33739a;
    }

    /* access modifiers changed from: package-private */
    public void Y(int i10) {
        f fVar = this.f33749k.get(i10);
        if (fVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.f33750l.get(i10) == null) {
            View view = fVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            } else if (view.getParent() == null) {
                Context context = this.f33741c;
                cc.a aVar = new cc.a(context, context.getResources().getDisplayMetrics().density, this.f33740b);
                aVar.setOnDescendantFocusChangeListener(new l(this, i10));
                this.f33750l.put(i10, aVar);
                view.setImportantForAccessibility(4);
                aVar.addView(view);
                this.f33742d.addView(aVar);
            } else {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }
    }

    public void a(c cVar) {
        this.f33746h.c(cVar);
    }

    public View b(int i10) {
        if (c(i10)) {
            return this.f33747i.get(Integer.valueOf(i10)).e();
        }
        f fVar = this.f33749k.get(i10);
        if (fVar == null) {
            return null;
        }
        return fVar.getView();
    }

    public boolean c(int i10) {
        return this.f33747i.containsKey(Integer.valueOf(i10));
    }

    public void d() {
        this.f33746h.c((c) null);
    }

    public void g0() {
    }

    public void h0() {
        this.f33756r.clear();
        this.f33757s.clear();
    }

    public void i0() {
        S();
    }

    public void j0(int i10, int i11, int i12, int i13, int i14) {
        if (this.f33751m.get(i10) != null) {
            Z();
            b bVar = this.f33751m.get(i10);
            if (bVar.getParent() == null) {
                this.f33742d.addView(bVar);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
            layoutParams.leftMargin = i11;
            layoutParams.topMargin = i12;
            bVar.setLayoutParams(layoutParams);
            bVar.setVisibility(0);
            bVar.bringToFront();
            this.f33756r.add(Integer.valueOf(i10));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i10 + ") doesn't exist");
    }

    public void k0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        Z();
        Y(i10);
        cc.a aVar = this.f33750l.get(i10);
        aVar.a(flutterMutatorsStack, i11, i12, i13, i14);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i16);
        View view = this.f33749k.get(i10).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.f33757s.add(Integer.valueOf(i10));
    }

    public void l0() {
        boolean z10 = false;
        if (!this.f33754p || !this.f33757s.isEmpty()) {
            if (this.f33754p && this.f33742d.k()) {
                z10 = true;
            }
            V(z10);
            return;
        }
        this.f33754p = false;
        this.f33742d.D(new o(this));
    }

    public void m0() {
        S();
    }

    public void s0(boolean z10) {
        this.f33759u = z10;
    }

    public MotionEvent v0(float f10, l.f fVar, boolean z10) {
        l.f fVar2 = fVar;
        MotionEvent b10 = this.f33758t.b(u.a.c(fVar2.f35926p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) q0(fVar2.f35916f).toArray(new MotionEvent.PointerProperties[fVar2.f35915e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) o0(fVar2.f35917g, f10).toArray(new MotionEvent.PointerCoords[fVar2.f35915e]);
        if (!z10 && b10 != null) {
            return MotionEvent.obtain(b10.getDownTime(), b10.getEventTime(), fVar2.f35914d, fVar2.f35915e, pointerPropertiesArr, pointerCoordsArr, b10.getMetaState(), b10.getButtonState(), b10.getXPrecision(), b10.getYPrecision(), b10.getDeviceId(), b10.getEdgeFlags(), b10.getSource(), b10.getFlags());
        }
        return MotionEvent.obtain(fVar2.f35912b.longValue(), fVar2.f35913c.longValue(), fVar2.f35914d, fVar2.f35915e, pointerPropertiesArr, pointerCoordsArr, fVar2.f35918h, fVar2.f35919i, fVar2.f35920j, fVar2.f35921k, fVar2.f35922l, fVar2.f35923m, fVar2.f35924n, fVar2.f35925o);
    }
}
