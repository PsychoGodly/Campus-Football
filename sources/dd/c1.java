package dd;

import androidx.recyclerview.widget.RecyclerView;
import dd.a1;
import dd.i1;
import io.grpc.internal.d0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;
import s6.v;

/* compiled from: NameResolverRegistry */
public final class c1 {

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f32175e = Logger.getLogger(c1.class.getName());

    /* renamed from: f  reason: collision with root package name */
    private static c1 f32176f;

    /* renamed from: a  reason: collision with root package name */
    private final a1.d f32177a = new b();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f32178b = "unknown";

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<b1> f32179c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private v<String, b1> f32180d = v.k();

    /* compiled from: NameResolverRegistry */
    private final class b extends a1.d {
        private b() {
        }

        public String a() {
            String a10;
            synchronized (c1.this) {
                a10 = c1.this.f32178b;
            }
            return a10;
        }

        public a1 b(URI uri, a1.b bVar) {
            b1 b1Var = c1.this.f().get(uri.getScheme());
            if (b1Var == null) {
                return null;
            }
            return b1Var.b(uri, bVar);
        }
    }

    /* compiled from: NameResolverRegistry */
    private static final class c implements i1.b<b1> {
        private c() {
        }

        /* renamed from: c */
        public int b(b1 b1Var) {
            return b1Var.e();
        }

        /* renamed from: d */
        public boolean a(b1 b1Var) {
            return b1Var.d();
        }
    }

    private synchronized void b(b1 b1Var) {
        o.e(b1Var.d(), "isAvailable() returned false");
        this.f32179c.add(b1Var);
    }

    public static synchronized c1 d() {
        c1 c1Var;
        Class<b1> cls = b1.class;
        synchronized (c1.class) {
            if (f32176f == null) {
                List<T> e10 = i1.e(cls, e(), cls.getClassLoader(), new c());
                if (e10.isEmpty()) {
                    f32175e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f32176f = new c1();
                for (T t10 : e10) {
                    Logger logger = f32175e;
                    logger.fine("Service loader found " + t10);
                    f32176f.b(t10);
                }
                f32176f.g();
            }
            c1Var = f32176f;
        }
        return c1Var;
    }

    static List<Class<?>> e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(d0.class);
        } catch (ClassNotFoundException e10) {
            f32175e.log(Level.FINE, "Unable to find DNS NameResolver", e10);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void g() {
        HashMap hashMap = new HashMap();
        int i10 = RecyclerView.UNDEFINED_DURATION;
        String str = "unknown";
        Iterator it = this.f32179c.iterator();
        while (it.hasNext()) {
            b1 b1Var = (b1) it.next();
            String c10 = b1Var.c();
            b1 b1Var2 = (b1) hashMap.get(c10);
            if (b1Var2 == null || b1Var2.e() < b1Var.e()) {
                hashMap.put(c10, b1Var);
            }
            if (i10 < b1Var.e()) {
                i10 = b1Var.e();
                str = b1Var.c();
            }
        }
        this.f32180d = v.d(hashMap);
        this.f32178b = str;
    }

    public a1.d c() {
        return this.f32177a;
    }

    /* access modifiers changed from: package-private */
    public synchronized Map<String, b1> f() {
        return this.f32180d;
    }
}
