package y6;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.os.p;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.q;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.unity3d.ads.metadata.MediationMetaData;
import e7.g;
import e7.o;
import e7.x;
import f7.k;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m5.m;

/* compiled from: FirebaseApp */
public class f {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Object f31318k = new Object();

    /* renamed from: l  reason: collision with root package name */
    static final Map<String, f> f31319l = new androidx.collection.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f31320a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31321b;

    /* renamed from: c  reason: collision with root package name */
    private final n f31322c;

    /* renamed from: d  reason: collision with root package name */
    private final o f31323d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f31324e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f31325f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final x<h8.a> f31326g;

    /* renamed from: h  reason: collision with root package name */
    private final b8.b<z7.f> f31327h;

    /* renamed from: i  reason: collision with root package name */
    private final List<a> f31328i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<g> f31329j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp */
    public interface a {
        void a(boolean z10);
    }

    /* compiled from: FirebaseApp */
    private static class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<b> f31330a = new AtomicReference<>();

        private b() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f31330a.get() == null) {
                    b bVar = new b();
                    if (f31330a.compareAndSet((Object) null, bVar)) {
                        com.google.android.gms.common.api.internal.c.c(application);
                        com.google.android.gms.common.api.internal.c.b().a(bVar);
                    }
                }
            }
        }

        public void a(boolean z10) {
            synchronized (f.f31318k) {
                Iterator it = new ArrayList(f.f31319l.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f31324e.get()) {
                        fVar.C(z10);
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp */
    private static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<c> f31331b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f31332a;

        public c(Context context) {
            this.f31332a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (f31331b.get() == null) {
                c cVar = new c(context);
                if (f31331b.compareAndSet((Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f31332a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (f.f31318k) {
                for (f d10 : f.f31319l.values()) {
                    d10.t();
                }
            }
            c();
        }
    }

    protected f(Context context, String str, n nVar) {
        this.f31320a = (Context) q.k(context);
        this.f31321b = q.g(str);
        this.f31322c = (n) q.k(nVar);
        p b10 = FirebaseInitProvider.b();
        m8.c.b("Firebase");
        m8.c.b("ComponentDiscovery");
        List<b8.b<ComponentRegistrar>> b11 = g.c(context, ComponentDiscoveryService.class).b();
        m8.c.a();
        m8.c.b("Runtime");
        o.b g10 = o.m(k.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(e7.c.s(context, Context.class, new Class[0])).b(e7.c.s(this, f.class, new Class[0])).b(e7.c.s(nVar, n.class, new Class[0])).g(new m8.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            g10.b(e7.c.s(b10, p.class, new Class[0]));
        }
        o e10 = g10.e();
        this.f31323d = e10;
        m8.c.a();
        this.f31326g = new x<>(new d(this, context));
        this.f31327h = e10.c(z7.f.class);
        g(new e(this));
        m8.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(boolean z10) {
        if (!z10) {
            this.f31327h.get().l();
        }
    }

    private static String B(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void C(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a a10 : this.f31328i) {
            a10.a(z10);
        }
    }

    private void D() {
        for (g a10 : this.f31329j) {
            a10.a(this.f31321b, this.f31322c);
        }
    }

    private void i() {
        q.o(!this.f31325f.get(), "FirebaseApp was deleted");
    }

    private static List<String> l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f31318k) {
            for (f q10 : f31319l.values()) {
                arrayList.add(q10.q());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<f> n(Context context) {
        ArrayList arrayList;
        synchronized (f31318k) {
            arrayList = new ArrayList(f31319l.values());
        }
        return arrayList;
    }

    public static f o() {
        f fVar;
        synchronized (f31318k) {
            fVar = f31319l.get("[DEFAULT]");
            if (fVar != null) {
                fVar.f31327h.get().l();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + m5.o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return fVar;
    }

    public static f p(String str) {
        f fVar;
        String str2;
        synchronized (f31318k) {
            fVar = f31319l.get(B(str));
            if (fVar != null) {
                fVar.f31327h.get().l();
            } else {
                List<String> l10 = l();
                if (l10.isEmpty()) {
                    str2 = MaxReward.DEFAULT_LABEL;
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", l10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    public void t() {
        if (!p.a(this.f31320a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f31320a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f31323d.p(y());
        this.f31327h.get().l();
    }

    public static f u(Context context) {
        synchronized (f31318k) {
            if (f31319l.containsKey("[DEFAULT]")) {
                f o10 = o();
                return o10;
            }
            n a10 = n.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            f v10 = v(context, a10);
            return v10;
        }
    }

    public static f v(Context context, n nVar) {
        return w(context, nVar, "[DEFAULT]");
    }

    public static f w(Context context, n nVar, String str) {
        f fVar;
        b.c(context);
        String B = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f31318k) {
            Map<String, f> map = f31319l;
            boolean z10 = !map.containsKey(B);
            q.o(z10, "FirebaseApp name " + B + " already exists!");
            q.l(context, "Application context cannot be null.");
            fVar = new f(context, B, nVar);
            map.put(B, fVar);
        }
        fVar.t();
        return fVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ h8.a z(Context context) {
        return new h8.a(context, s(), (o7.c) this.f31323d.a(o7.c.class));
    }

    public void E(boolean z10) {
        i();
        if (this.f31324e.compareAndSet(!z10, z10)) {
            boolean d10 = com.google.android.gms.common.api.internal.c.b().d();
            if (z10 && d10) {
                C(true);
            } else if (!z10 && d10) {
                C(false);
            }
        }
    }

    public void F(Boolean bool) {
        i();
        this.f31326g.get().e(bool);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f31321b.equals(((f) obj).q());
    }

    public void g(a aVar) {
        i();
        if (this.f31324e.get() && com.google.android.gms.common.api.internal.c.b().d()) {
            aVar.a(true);
        }
        this.f31328i.add(aVar);
    }

    public void h(g gVar) {
        i();
        q.k(gVar);
        this.f31329j.add(gVar);
    }

    public int hashCode() {
        return this.f31321b.hashCode();
    }

    public void j() {
        if (this.f31325f.compareAndSet(false, true)) {
            synchronized (f31318k) {
                f31319l.remove(this.f31321b);
            }
            D();
        }
    }

    public <T> T k(Class<T> cls) {
        i();
        return this.f31323d.a(cls);
    }

    public Context m() {
        i();
        return this.f31320a;
    }

    public String q() {
        i();
        return this.f31321b;
    }

    public n r() {
        i();
        return this.f31322c;
    }

    public String s() {
        return m5.c.e(q().getBytes(Charset.defaultCharset())) + "+" + m5.c.e(r().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return com.google.android.gms.common.internal.p.c(this).a(MediationMetaData.KEY_NAME, this.f31321b).a("options", this.f31322c).toString();
    }

    public boolean x() {
        i();
        return this.f31326g.get().b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
