package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.t3;

/* compiled from: UniversalRequestKt.kt */
public final class o3 {

    /* renamed from: a  reason: collision with root package name */
    public static final o3 f39052a = new o3();

    /* compiled from: UniversalRequestKt.kt */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0452a f39053b = new C0452a((h) null);

        /* renamed from: a  reason: collision with root package name */
        private final t3.a f39054a;

        /* renamed from: vb.o3$a$a  reason: collision with other inner class name */
        /* compiled from: UniversalRequestKt.kt */
        public static final class C0452a {
            private C0452a() {
            }

            public /* synthetic */ C0452a(h hVar) {
                this();
            }

            public final /* synthetic */ a a(t3.a aVar) {
                m.e(aVar, "builder");
                return new a(aVar, (h) null);
            }
        }

        private a(t3.a aVar) {
            this.f39054a = aVar;
        }

        public /* synthetic */ a(t3.a aVar, h hVar) {
            this(aVar);
        }

        public final /* synthetic */ t3 a() {
            z s10 = this.f39054a.build();
            m.d(s10, "_builder.build()");
            return (t3) s10;
        }

        public final t3.b b() {
            t3.b F = this.f39054a.F();
            m.d(F, "_builder.getPayload()");
            return F;
        }

        public final void c(t3.b bVar) {
            m.e(bVar, "value");
            this.f39054a.G(bVar);
        }

        public final void d(t3.c cVar) {
            m.e(cVar, "value");
            this.f39054a.H(cVar);
        }
    }

    private o3() {
    }
}
