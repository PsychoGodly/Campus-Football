package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.d1;

/* compiled from: ErrorKt.kt */
public final class b1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38926b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final d1.a f38927a;

    /* compiled from: ErrorKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ b1 a(d1.a aVar) {
            m.e(aVar, "builder");
            return new b1(aVar, (h) null);
        }
    }

    private b1(d1.a aVar) {
        this.f38927a = aVar;
    }

    public /* synthetic */ b1(d1.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ d1 a() {
        z s10 = this.f38927a.build();
        m.d(s10, "_builder.build()");
        return (d1) s10;
    }

    public final void b(String str) {
        m.e(str, "value");
        this.f38927a.F(str);
    }
}
