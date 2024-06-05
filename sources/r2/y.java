package r2;

import android.os.Looper;
import com.facebook.ads.AdError;
import n2.r1;
import o2.u1;
import r2.o;
import r2.w;

/* compiled from: DrmSessionManager */
public interface y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f22097a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final y f22098b;

    /* compiled from: DrmSessionManager */
    class a implements y {
        a() {
        }

        public /* synthetic */ void a() {
            x.b(this);
        }

        public int b(r1 r1Var) {
            return r1Var.f20657p != null ? 1 : 0;
        }

        public void c(Looper looper, u1 u1Var) {
        }

        public /* synthetic */ b d(w.a aVar, r1 r1Var) {
            return x.a(this, aVar, r1Var);
        }

        public o e(w.a aVar, r1 r1Var) {
            if (r1Var.f20657p == null) {
                return null;
            }
            return new e0(new o.a(new p0(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        public /* synthetic */ void release() {
            x.c(this);
        }
    }

    /* compiled from: DrmSessionManager */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f22099a = z.f37804b;

        void release();
    }

    static {
        a aVar = new a();
        f22097a = aVar;
        f22098b = aVar;
    }

    void a();

    int b(r1 r1Var);

    void c(Looper looper, u1 u1Var);

    b d(w.a aVar, r1 r1Var);

    o e(w.a aVar, r1 r1Var);

    void release();
}
