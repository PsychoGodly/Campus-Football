package ld;

import dd.a1;
import dd.j1;
import dd.r0;
import dd.s0;
import dd.t0;
import io.grpc.internal.b1;
import io.grpc.internal.e2;
import io.grpc.internal.l2;
import java.util.List;
import java.util.Map;
import ld.e;

/* compiled from: OutlierDetectionLoadBalancerProvider */
public final class g extends s0 {
    public r0 a(r0.d dVar) {
        return new e(dVar, l2.f35171a);
    }

    public String b() {
        return "outlier_detection_experimental";
    }

    public int c() {
        return 5;
    }

    public boolean d() {
        return true;
    }

    public a1.c e(Map<String, ?> map) {
        Long l10 = b1.l(map, "interval");
        Long l11 = b1.l(map, "baseEjectionTime");
        Long l12 = b1.l(map, "maxEjectionTime");
        Integer i10 = b1.i(map, "maxEjectionPercentage");
        e.g.a aVar = new e.g.a();
        if (l10 != null) {
            aVar.e(l10);
        }
        if (l11 != null) {
            aVar.b(l11);
        }
        if (l12 != null) {
            aVar.g(l12);
        }
        if (i10 != null) {
            aVar.f(i10);
        }
        Map<String, ?> j10 = b1.j(map, "successRateEjection");
        if (j10 != null) {
            e.g.c.a aVar2 = new e.g.c.a();
            Integer i11 = b1.i(j10, "stdevFactor");
            Integer i12 = b1.i(j10, "enforcementPercentage");
            Integer i13 = b1.i(j10, "minimumHosts");
            Integer i14 = b1.i(j10, "requestVolume");
            if (i11 != null) {
                aVar2.e(i11);
            }
            if (i12 != null) {
                aVar2.b(i12);
            }
            if (i13 != null) {
                aVar2.c(i13);
            }
            if (i14 != null) {
                aVar2.d(i14);
            }
            aVar.h(aVar2.a());
        }
        Map<String, ?> j11 = b1.j(map, "failurePercentageEjection");
        if (j11 != null) {
            e.g.b.a aVar3 = new e.g.b.a();
            Integer i15 = b1.i(j11, "threshold");
            Integer i16 = b1.i(j11, "enforcementPercentage");
            Integer i17 = b1.i(j11, "minimumHosts");
            Integer i18 = b1.i(j11, "requestVolume");
            if (i15 != null) {
                aVar3.e(i15);
            }
            if (i16 != null) {
                aVar3.b(i16);
            }
            if (i17 != null) {
                aVar3.c(i17);
            }
            if (i18 != null) {
                aVar3.d(i18);
            }
            aVar.d(aVar3.a());
        }
        List<e2.a> A = e2.A(b1.f(map, "childPolicy"));
        if (A == null || A.isEmpty()) {
            j1 j1Var = j1.f32247t;
            return a1.c.b(j1Var.q("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        a1.c y10 = e2.y(A, t0.b());
        if (y10.d() != null) {
            return y10;
        }
        aVar.c((e2.b) y10.c());
        return a1.c.a(aVar.a());
    }
}
