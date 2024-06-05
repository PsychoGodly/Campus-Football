package dd;

import dd.i1;
import fd.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;

/* compiled from: ManagedChannelRegistry */
public final class x0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f32381c = Logger.getLogger(x0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    private static x0 f32382d;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<w0> f32383a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private List<w0> f32384b = Collections.emptyList();

    /* compiled from: ManagedChannelRegistry */
    class a implements Comparator<w0> {
        a() {
        }

        /* renamed from: a */
        public int compare(w0 w0Var, w0 w0Var2) {
            return w0Var.c() - w0Var2.c();
        }
    }

    /* compiled from: ManagedChannelRegistry */
    private static final class b implements i1.b<w0> {
        private b() {
        }

        /* renamed from: c */
        public int b(w0 w0Var) {
            return w0Var.c();
        }

        /* renamed from: d */
        public boolean a(w0 w0Var) {
            return w0Var.b();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private synchronized void a(w0 w0Var) {
        o.e(w0Var.b(), "isAvailable() returned false");
        this.f32383a.add(w0Var);
    }

    public static synchronized x0 b() {
        x0 x0Var;
        Class<w0> cls = w0.class;
        synchronized (x0.class) {
            if (f32382d == null) {
                List<T> e10 = i1.e(cls, c(), cls.getClassLoader(), new b((a) null));
                f32382d = new x0();
                for (T t10 : e10) {
                    Logger logger = f32381c;
                    logger.fine("Service loader found " + t10);
                    f32382d.a(t10);
                }
                f32382d.f();
            }
            x0Var = f32382d;
        }
        return x0Var;
    }

    static List<Class<?>> c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(g.class);
        } catch (ClassNotFoundException e10) {
            f32381c.log(Level.FINE, "Unable to find OkHttpChannelProvider", e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            f32381c.log(Level.FINE, "Unable to find NettyChannelProvider", e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            f32381c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", e12);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void f() {
        ArrayList arrayList = new ArrayList(this.f32383a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f32384b = Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public w0 d() {
        List<w0> e10 = e();
        if (e10.isEmpty()) {
            return null;
        }
        return e10.get(0);
    }

    /* access modifiers changed from: package-private */
    public synchronized List<w0> e() {
        return this.f32384b;
    }
}
