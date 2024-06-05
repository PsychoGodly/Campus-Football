package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.b3;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.k2;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.s2;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.q;
import h5.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import u5.f;

@Deprecated
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class GoogleApiClient {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Set<GoogleApiClient> f14987a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f14988a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Scope> f14989b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<Scope> f14990c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private int f14991d;

        /* renamed from: e  reason: collision with root package name */
        private View f14992e;

        /* renamed from: f  reason: collision with root package name */
        private String f14993f;

        /* renamed from: g  reason: collision with root package name */
        private String f14994g;

        /* renamed from: h  reason: collision with root package name */
        private final Map<a<?>, b0> f14995h = new androidx.collection.a();

        /* renamed from: i  reason: collision with root package name */
        private final Context f14996i;

        /* renamed from: j  reason: collision with root package name */
        private final Map<a<?>, a.d> f14997j = new androidx.collection.a();

        /* renamed from: k  reason: collision with root package name */
        private h f14998k;

        /* renamed from: l  reason: collision with root package name */
        private int f14999l = -1;

        /* renamed from: m  reason: collision with root package name */
        private c f15000m;

        /* renamed from: n  reason: collision with root package name */
        private Looper f15001n;

        /* renamed from: o  reason: collision with root package name */
        private e f15002o = e.q();

        /* renamed from: p  reason: collision with root package name */
        private a.C0154a<? extends f, u5.a> f15003p = u5.e.f30580c;

        /* renamed from: q  reason: collision with root package name */
        private final ArrayList<b> f15004q = new ArrayList<>();

        /* renamed from: r  reason: collision with root package name */
        private final ArrayList<c> f15005r = new ArrayList<>();

        public a(Context context) {
            this.f14996i = context;
            this.f15001n = context.getMainLooper();
            this.f14993f = context.getPackageName();
            this.f14994g = context.getClass().getName();
        }

        public a a(a<Object> aVar) {
            q.l(aVar, "Api must not be null");
            this.f14997j.put(aVar, (Object) null);
            List<Scope> impliedScopes = ((a.e) q.l(aVar.c(), "Base client builder must not be null")).getImpliedScopes(null);
            this.f14990c.addAll(impliedScopes);
            this.f14989b.addAll(impliedScopes);
            return this;
        }

        public a b(b bVar) {
            q.l(bVar, "Listener must not be null");
            this.f15004q.add(bVar);
            return this;
        }

        public a c(c cVar) {
            q.l(cVar, "Listener must not be null");
            this.f15005r.add(cVar);
            return this;
        }

        public GoogleApiClient d() {
            q.b(!this.f14997j.isEmpty(), "must call addApi() to add at least one API");
            d f10 = f();
            Map<a<?>, b0> i10 = f10.i();
            androidx.collection.a aVar = new androidx.collection.a();
            androidx.collection.a aVar2 = new androidx.collection.a();
            ArrayList arrayList = new ArrayList();
            a aVar3 = null;
            boolean z10 = false;
            for (a next : this.f14997j.keySet()) {
                a.d dVar = this.f14997j.get(next);
                boolean z11 = i10.get(next) != null;
                aVar.put(next, Boolean.valueOf(z11));
                b3 b3Var = new b3(next, z11);
                arrayList.add(b3Var);
                a.C0154a aVar4 = (a.C0154a) q.k(next.a());
                a aVar5 = next;
                a.f buildClient = aVar4.buildClient(this.f14996i, this.f15001n, f10, dVar, (b) b3Var, (c) b3Var);
                aVar2.put(aVar5.b(), buildClient);
                if (aVar4.getPriority() == 1) {
                    z10 = dVar != null;
                }
                if (buildClient.providesSignIn()) {
                    if (aVar3 == null) {
                        aVar3 = aVar5;
                    } else {
                        String d10 = aVar5.d();
                        String d11 = aVar3.d();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 21 + String.valueOf(d11).length());
                        sb2.append(d10);
                        sb2.append(" cannot be used with ");
                        sb2.append(d11);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            }
            if (aVar3 != null) {
                if (!z10) {
                    q.p(this.f14988a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.d());
                    q.p(this.f14989b.equals(this.f14990c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.d());
                } else {
                    String d12 = aVar3.d();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(d12).length() + 82);
                    sb3.append("With using ");
                    sb3.append(d12);
                    sb3.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb3.toString());
                }
            }
            w0 w0Var = new w0(this.f14996i, new ReentrantLock(), this.f15001n, f10, this.f15002o, this.f15003p, aVar, this.f15004q, this.f15005r, aVar2, this.f14999l, w0.l(aVar2.values(), true), arrayList);
            synchronized (GoogleApiClient.f14987a) {
                GoogleApiClient.f14987a.add(w0Var);
            }
            if (this.f14999l >= 0) {
                s2.i(this.f14998k).j(this.f14999l, w0Var, this.f15000m);
            }
            return w0Var;
        }

        public a e(Handler handler) {
            q.l(handler, "Handler must not be null");
            this.f15001n = handler.getLooper();
            return this;
        }

        public final d f() {
            u5.a aVar = u5.a.f30568k;
            Map<a<?>, a.d> map = this.f14997j;
            a<u5.a> aVar2 = u5.e.f30584g;
            if (map.containsKey(aVar2)) {
                aVar = (u5.a) this.f14997j.get(aVar2);
            }
            return new d(this.f14988a, this.f14989b, this.f14995h, this.f14991d, this.f14992e, this.f14993f, this.f14994g, aVar, false);
        }
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface b extends com.google.android.gms.common.api.internal.e {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface c extends m {
    }

    public abstract void connect();

    public abstract void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void disconnect();

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends i, A>> T e(T t10) {
        throw new UnsupportedOperationException();
    }

    public Looper f() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean g();

    public abstract void h(c cVar);

    public abstract void i(c cVar);

    public void j(k2 k2Var) {
        throw new UnsupportedOperationException();
    }
}
