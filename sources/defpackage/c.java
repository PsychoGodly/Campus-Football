package defpackage;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c  reason: default package */
/* compiled from: ByteStringStoreOuterClass */
public final class c extends z<c, a> implements w0 {
    public static final int DATA_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final c DEFAULT_INSTANCE;
    private static volatile f1<c> PARSER;
    private i data_ = i.f27039b;

    /* renamed from: c$a */
    /* compiled from: ByteStringStoreOuterClass */
    public static final class a extends z.a<c, a> implements w0 {
        /* synthetic */ a(b bVar) {
            this();
        }

        public a F(i iVar) {
            w();
            ((c) this.f27301b).k0(iVar);
            return this;
        }

        private a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        z.b0(c.class, cVar);
    }

    private c() {
    }

    public static c h0() {
        return DEFAULT_INSTANCE;
    }

    public static a i0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    public static c j0(InputStream inputStream) throws IOException {
        return (c) z.W(DEFAULT_INSTANCE, inputStream);
    }

    /* access modifiers changed from: private */
    public void k0(i iVar) {
        iVar.getClass();
        this.data_ = iVar;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (b.f24264a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new a((b) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"data_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<c> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (c.class) {
                        f1Var = PARSER;
                        if (f1Var == null) {
                            f1Var = new z.b<>(DEFAULT_INSTANCE);
                            PARSER = f1Var;
                        }
                    }
                }
                return f1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public i g0() {
        return this.data_;
    }
}
