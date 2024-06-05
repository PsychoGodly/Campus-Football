package pe;

import fe.l;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import xd.b;
import xd.g;

/* compiled from: Executors.kt */
public abstract class s1 extends k0 implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37396b = new a((h) null);

    /* compiled from: Executors.kt */
    public static final class a extends b<k0, s1> {

        /* renamed from: pe.s1$a$a  reason: collision with other inner class name */
        /* compiled from: Executors.kt */
        static final class C0424a extends n implements l<g.b, s1> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0424a f37397a = new C0424a();

            C0424a() {
                super(1);
            }

            /* renamed from: a */
            public final s1 invoke(g.b bVar) {
                if (bVar instanceof s1) {
                    return (s1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(k0.f37328a, C0424a.f37397a);
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public abstract Executor b1();
}
