package dd;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Context */
public class r {

    /* renamed from: c  reason: collision with root package name */
    static final Logger f32334c = Logger.getLogger(r.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final r f32335d = new r();

    /* renamed from: a  reason: collision with root package name */
    final e1<Object, Object> f32336a = null;

    /* renamed from: b  reason: collision with root package name */
    final int f32337b = 0;

    /* compiled from: Context */
    public interface a {
    }

    /* compiled from: Context */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final c f32338a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f32338a = a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                r.f32334c.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        private static c a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                atomicReference.set(e10);
                return new o1();
            } catch (Exception e11) {
                throw new RuntimeException("Storage override failed to initialize", e11);
            }
        }
    }

    /* compiled from: Context */
    public static abstract class c {
        @Deprecated
        public void a(r rVar) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        public abstract r b();

        public abstract void c(r rVar, r rVar2);

        public r d(r rVar) {
            r b10 = b();
            a(rVar);
            return b10;
        }
    }

    private r() {
        k(0);
    }

    static <T> T d(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static r e() {
        r b10 = j().b();
        return b10 == null ? f32335d : b10;
    }

    static c j() {
        return b.f32338a;
    }

    private static void k(int i10) {
        if (i10 == 1000) {
            f32334c.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }

    public void a(a aVar, Executor executor) {
        d(aVar, "cancellationListener");
        d(executor, "executor");
    }

    public r b() {
        r d10 = j().d(this);
        return d10 == null ? f32335d : d10;
    }

    public Throwable c() {
        return null;
    }

    public void f(r rVar) {
        d(rVar, "toAttach");
        j().c(this, rVar);
    }

    public t g() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public void i(a aVar) {
    }
}
