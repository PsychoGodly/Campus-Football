package com.unity3d.ads.core.domain.events;

import androidx.work.a0;
import androidx.work.c;
import androidx.work.q;
import androidx.work.r;
import com.google.protobuf.i;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import fe.p;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.p0;
import pe.q0;
import s8.a;
import sd.w;
import se.g;
import se.v;
import se.z;
import vb.o3;
import vb.p3;
import vb.s0;
import vb.t3;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2", f = "DiagnosticEventObserver.kt", l = {}, m = "invokeSuspend")
/* compiled from: DiagnosticEventObserver.kt */
final class DiagnosticEventObserver$invoke$2 extends l implements p<p0, d<? super w>, Object> {
    int label;
    final /* synthetic */ DiagnosticEventObserver this$0;

    @f(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2", f = "DiagnosticEventObserver.kt", l = {42, 45}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2  reason: invalid class name */
    /* compiled from: DiagnosticEventObserver.kt */
    static final class AnonymousClass2 extends l implements p<List<? extends s0>, d<? super w>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            AnonymousClass2 r02 = new AnonymousClass2(diagnosticEventObserver, dVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invoke(List<s0> list, d<? super w> dVar) {
            return ((AnonymousClass2) create(list, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sd.p.b(obj);
                o3 o3Var = o3.f39052a;
                DiagnosticEventObserver diagnosticEventObserver = diagnosticEventObserver;
                p3.a aVar = p3.f39058b;
                t3.b.a q02 = t3.b.q0();
                m.d(q02, "newBuilder()");
                p3 a10 = aVar.a(q02);
                a10.f(diagnosticEventObserver.getDiagnosticEventBatchRequest.invoke((List) this.L$0));
                t3.b a11 = a10.a();
                GetUniversalRequestForPayLoad access$getGetUniversalRequestForPayLoad$p = diagnosticEventObserver.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = access$getGetUniversalRequestForPayLoad$p.invoke(a11, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sd.p.b(obj);
            } else if (i10 == 2) {
                str = (String) this.L$0;
                sd.p.b(obj);
                UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(str);
                BackgroundWorker access$getBackgroundWorker$p = diagnosticEventObserver.backgroundWorker;
                c a12 = new c.a().b(q.CONNECTED).a();
                m.d(a12, "Builder()\n            .s…TED)\n            .build()");
                a0 b10 = ((r.a) ((r.a) new r.a(DiagnosticEventJob.class).f(a12)).h(universalRequestWorkerData.invoke())).b();
                m.d(b10, "OneTimeWorkRequestBuilde…a())\n            .build()");
                access$getBackgroundWorker$p.getWorkManager().c((r) b10);
                return w.f38141a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String uuid = UUID.randomUUID().toString();
            m.d(uuid, "randomUUID().toString()");
            UniversalRequestDataSource access$getUniversalRequestDataSource$p = diagnosticEventObserver.universalRequestDataSource;
            byte[] i11 = ((t3) obj).i();
            m.d(i11, "fullRequest.toByteArray()");
            i a13 = a.a(i11);
            this.L$0 = uuid;
            this.label = 2;
            if (access$getUniversalRequestDataSource$p.set(uuid, a13, this) == c10) {
                return c10;
            }
            str = uuid;
            UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
            BackgroundWorker access$getBackgroundWorker$p2 = diagnosticEventObserver.backgroundWorker;
            c a122 = new c.a().b(q.CONNECTED).a();
            m.d(a122, "Builder()\n            .s…TED)\n            .build()");
            a0 b102 = ((r.a) ((r.a) new r.a(DiagnosticEventJob.class).f(a122)).h(universalRequestWorkerData2.invoke())).b();
            m.d(b102, "OneTimeWorkRequestBuilde…a())\n            .build()");
            access$getBackgroundWorker$p2.getWorkManager().c((r) b102);
            return w.f38141a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiagnosticEventObserver$invoke$2(DiagnosticEventObserver diagnosticEventObserver, d<? super DiagnosticEventObserver$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = diagnosticEventObserver;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new DiagnosticEventObserver$invoke$2(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((DiagnosticEventObserver$invoke$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Boolean bool;
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            v access$isRunning$p = this.this$0.isRunning;
            do {
                value = access$isRunning$p.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!access$isRunning$p.a(value, b.a(true)));
            if (bool.booleanValue()) {
                return w.f38141a;
            }
            z<List<s0>> diagnosticEvents = this.this$0.diagnosticEventRepository.getDiagnosticEvents();
            final DiagnosticEventObserver diagnosticEventObserver = this.this$0;
            g.u(g.x(diagnosticEvents, new AnonymousClass2((d<? super AnonymousClass2>) null)), q0.a(this.this$0.defaultDispatcher));
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
