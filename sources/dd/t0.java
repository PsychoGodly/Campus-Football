package dd;

import dd.i1;
import io.grpc.internal.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ld.i;
import r6.o;

/* compiled from: LoadBalancerRegistry */
public final class t0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f32366c = Logger.getLogger(t0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    private static t0 f32367d;

    /* renamed from: e  reason: collision with root package name */
    private static final Iterable<Class<?>> f32368e = c();

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<s0> f32369a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, s0> f32370b = new LinkedHashMap<>();

    /* compiled from: LoadBalancerRegistry */
    private static final class a implements i1.b<s0> {
        a() {
        }

        /* renamed from: c */
        public int b(s0 s0Var) {
            return s0Var.c();
        }

        /* renamed from: d */
        public boolean a(s0 s0Var) {
            return s0Var.d();
        }
    }

    private synchronized void a(s0 s0Var) {
        o.e(s0Var.d(), "isAvailable() returned false");
        this.f32369a.add(s0Var);
    }

    public static synchronized t0 b() {
        t0 t0Var;
        Class<s0> cls = s0.class;
        synchronized (t0.class) {
            if (f32367d == null) {
                List<Class<?>> e10 = i1.e(cls, f32368e, cls.getClassLoader(), new a());
                f32367d = new t0();
                Iterator<Class<?>> it = e10.iterator();
                while (it.hasNext()) {
                    s0 s0Var = (s0) it.next();
                    Logger logger = f32366c;
                    logger.fine("Service loader found " + s0Var);
                    f32367d.a(s0Var);
                }
                f32367d.e();
            }
            t0Var = f32367d;
        }
        return t0Var;
    }

    static List<Class<?>> c() {
        ArrayList arrayList = new ArrayList();
        Class<s1> cls = s1.class;
        try {
            int i10 = s1.f35381b;
            arrayList.add(cls);
        } catch (ClassNotFoundException e10) {
            f32366c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", e10);
        }
        Class<i> cls2 = i.class;
        try {
            int i11 = i.f36232b;
            arrayList.add(cls2);
        } catch (ClassNotFoundException e11) {
            f32366c.log(Level.FINE, "Unable to find round-robin LoadBalancer", e11);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void e() {
        this.f32370b.clear();
        Iterator it = this.f32369a.iterator();
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            String b10 = s0Var.b();
            s0 s0Var2 = this.f32370b.get(b10);
            if (s0Var2 == null || s0Var2.c() < s0Var.c()) {
                this.f32370b.put(b10, s0Var);
            }
        }
    }

    public synchronized s0 d(String str) {
        return this.f32370b.get(o.p(str, "policy"));
    }
}
