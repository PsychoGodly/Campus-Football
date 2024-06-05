package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class t6 implements Callable<List<na>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f25071a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f25072b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a6 f25073c;

    t6(a6 a6Var, lb lbVar, Bundle bundle) {
        this.f25073c = a6Var;
        this.f25071a = lbVar;
        this.f25072b = bundle;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f25073c.f24356a.j0();
        va M0 = this.f25073c.f24356a;
        lb lbVar = this.f25071a;
        Bundle bundle = this.f25072b;
        M0.zzl().i();
        if (!zzpg.zza() || !M0.X().w(lbVar.f24779a, e0.L0) || lbVar.f24779a == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    M0.zzj().B().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        m Z = M0.Z();
                        String str = lbVar.f24779a;
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        q.g(str);
                        Z.i();
                        Z.p();
                        try {
                            int delete = Z.w().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            p4 F = Z.zzj().F();
                            F.d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            Z.zzj().B().c("Error pruning trigger URIs. appId", n4.q(str), e10);
                        }
                    }
                }
            }
        }
        return M0.Z().F0(lbVar.f24779a);
    }
}
