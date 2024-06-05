package w0;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.core.os.n;
import androidx.profileinstaller.g;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.p;
import sd.w;
import xd.d;

/* compiled from: MeasurementManager.kt */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0243b f23501a = new C0243b((h) null);

    /* renamed from: w0.b$b  reason: collision with other inner class name */
    /* compiled from: MeasurementManager.kt */
    public static final class C0243b {
        private C0243b() {
        }

        public /* synthetic */ C0243b(h hVar) {
            this();
        }

        public final b a(Context context) {
            m.e(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            t0.a aVar = t0.a.f22549a;
            sb2.append(aVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (aVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(a aVar, d<? super w> dVar);

    public abstract Object b(d<? super Integer> dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, d<? super w> dVar);

    public abstract Object d(Uri uri, d<? super w> dVar);

    public abstract Object e(c cVar, d<? super w> dVar);

    public abstract Object f(d dVar, d<? super w> dVar2);

    /* compiled from: MeasurementManager.kt */
    private static final class a extends b {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final MeasurementManager f23502b;

        public a(MeasurementManager measurementManager) {
            m.e(measurementManager, "mMeasurementManager");
            this.f23502b = measurementManager;
        }

        /* access modifiers changed from: private */
        public final DeletionRequest k(a aVar) {
            new DeletionRequest.Builder();
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(c cVar) {
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(d dVar) {
            throw null;
        }

        public Object a(a aVar, d<? super w> dVar) {
            p pVar = new p(c.b(dVar), 1);
            pVar.C();
            this.f23502b.deleteRegistrations(k(aVar), g.f4296a, n.a(pVar));
            Object z10 = pVar.z();
            if (z10 == d.c()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (z10 == d.c()) {
                return z10;
            }
            return w.f38141a;
        }

        public Object b(d<? super Integer> dVar) {
            p pVar = new p(c.b(dVar), 1);
            pVar.C();
            this.f23502b.getMeasurementApiStatus(g.f4296a, n.a(pVar));
            Object z10 = pVar.z();
            if (z10 == d.c()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z10;
        }

        public Object c(Uri uri, InputEvent inputEvent, d<? super w> dVar) {
            p pVar = new p(c.b(dVar), 1);
            pVar.C();
            this.f23502b.registerSource(uri, inputEvent, g.f4296a, n.a(pVar));
            Object z10 = pVar.z();
            if (z10 == d.c()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (z10 == d.c()) {
                return z10;
            }
            return w.f38141a;
        }

        public Object d(Uri uri, d<? super w> dVar) {
            p pVar = new p(c.b(dVar), 1);
            pVar.C();
            this.f23502b.registerTrigger(uri, g.f4296a, n.a(pVar));
            Object z10 = pVar.z();
            if (z10 == d.c()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (z10 == d.c()) {
                return z10;
            }
            return w.f38141a;
        }

        public Object e(c cVar, d<? super w> dVar) {
            p pVar = new p(c.b(dVar), 1);
            pVar.C();
            this.f23502b.registerWebSource(l(cVar), g.f4296a, n.a(pVar));
            Object z10 = pVar.z();
            if (z10 == d.c()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (z10 == d.c()) {
                return z10;
            }
            return w.f38141a;
        }

        public Object f(d dVar, d<? super w> dVar2) {
            p pVar = new p(c.b(dVar2), 1);
            pVar.C();
            this.f23502b.registerWebTrigger(m(dVar), g.f4296a, n.a(pVar));
            Object z10 = pVar.z();
            if (z10 == d.c()) {
                kotlin.coroutines.jvm.internal.h.c(dVar2);
            }
            if (z10 == d.c()) {
                return z10;
            }
            return w.f38141a;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.m.e(r2, r0)
                java.lang.Class<android.adservices.measurement.MeasurementManager> r0 = android.adservices.measurement.MeasurementManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.m.d(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = (android.adservices.measurement.MeasurementManager) r2
                r1.<init>((android.adservices.measurement.MeasurementManager) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w0.b.a.<init>(android.content.Context):void");
        }
    }
}
