package r2;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import q2.b;
import r2.w;

/* compiled from: DrmSession */
public interface o {

    /* compiled from: DrmSession */
    public static class a extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f22086a;

        public a(Throwable th, int i10) {
            super(th);
            this.f22086a = i10;
        }
    }

    void a(w.a aVar);

    UUID b();

    boolean c();

    Map<String, String> d();

    void e(w.a aVar);

    boolean f(String str);

    b g();

    a getError();

    int getState();
}
