package jd;

import com.google.android.gms.common.api.a;
import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.j;
import com.google.protobuf.q;
import com.google.protobuf.v0;
import dd.j1;
import dd.q0;
import dd.z0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import r6.o;

/* compiled from: ProtoLiteUtils */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static volatile q f35774a = q.b();

    /* compiled from: ProtoLiteUtils */
    private static final class a<T extends v0> implements z0.c {

        /* renamed from: c  reason: collision with root package name */
        private static final ThreadLocal<Reference<byte[]>> f35775c = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        private final f1<T> f35776a;

        /* renamed from: b  reason: collision with root package name */
        private final T f35777b;

        a(T t10) {
            this.f35777b = t10;
            this.f35776a = t10.k();
        }

        private T d(j jVar) throws e0 {
            T t10 = (v0) this.f35776a.b(jVar, b.f35774a);
            try {
                jVar.a(0);
                return t10;
            } catch (e0 e10) {
                e10.k(t10);
                throw e10;
            }
        }

        /* renamed from: c */
        public T a(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof a) && ((a) inputStream).j() == this.f35776a) {
                try {
                    return ((a) inputStream).i();
                } catch (IllegalStateException unused) {
                }
            }
            j jVar = null;
            try {
                if (inputStream instanceof q0) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal<Reference<byte[]>> threadLocal = f35775c;
                        Reference reference = threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i10 = available;
                        while (true) {
                            if (i10 <= 0) {
                                break;
                            }
                            int read = inputStream.read(bArr, available - i10, i10);
                            if (read == -1) {
                                break;
                            }
                            i10 -= read;
                        }
                        if (i10 == 0) {
                            jVar = j.k(bArr, 0, available);
                        } else {
                            throw new RuntimeException("size inaccurate: " + available + " != " + (available - i10));
                        }
                    } else if (available == 0) {
                        return this.f35777b;
                    }
                }
                if (jVar == null) {
                    jVar = j.f(inputStream);
                }
                jVar.G(a.e.API_PRIORITY_OTHER);
                try {
                    return d(jVar);
                } catch (e0 e10) {
                    throw j1.f32247t.q("Invalid protobuf byte sequence").p(e10).d();
                }
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        /* renamed from: e */
        public InputStream b(T t10) {
            return new a(t10, this.f35776a);
        }
    }

    static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        o.p(inputStream, "inputStream cannot be null!");
        o.p(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
        }
    }

    public static <T extends v0> z0.c<T> b(T t10) {
        return new a(t10);
    }
}
