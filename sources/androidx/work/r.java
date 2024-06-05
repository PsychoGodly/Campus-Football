package androidx.work;

import android.os.Build;
import androidx.work.a0;

/* compiled from: OneTimeWorkRequest */
public final class r extends a0 {

    /* compiled from: OneTimeWorkRequest */
    public static final class a extends a0.a<a, r> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f5115c.f21929d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public r c() {
            if (!this.f5113a || Build.VERSION.SDK_INT < 23 || !this.f5115c.f21935j.h()) {
                return new r(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public a d() {
            return this;
        }
    }

    r(a aVar) {
        super(aVar.f5114b, aVar.f5115c, aVar.f5116d);
    }

    public static r e(Class<? extends ListenableWorker> cls) {
        return (r) new a(cls).b();
    }
}
