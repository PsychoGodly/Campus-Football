package defpackage;

import com.google.protobuf.i;
import com.google.protobuf.z;
import defpackage.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* renamed from: a  reason: default package */
/* compiled from: ByteStringStoreKt.kt */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0254a f24247b = new C0254a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final c.a f24248a;

    /* renamed from: a$a  reason: collision with other inner class name */
    /* compiled from: ByteStringStoreKt.kt */
    public static final class C0254a {
        private C0254a() {
        }

        public /* synthetic */ C0254a(h hVar) {
            this();
        }

        public final /* synthetic */ a a(c.a aVar) {
            m.e(aVar, "builder");
            return new a(aVar, (h) null);
        }
    }

    private a(c.a aVar) {
        this.f24248a = aVar;
    }

    public /* synthetic */ a(c.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ c a() {
        z s10 = this.f24248a.build();
        m.d(s10, "_builder.build()");
        return (c) s10;
    }

    public final void b(i iVar) {
        m.e(iVar, "value");
        this.f24248a.F(iVar);
    }
}
