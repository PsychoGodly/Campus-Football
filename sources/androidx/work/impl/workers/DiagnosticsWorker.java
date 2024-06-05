package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k1.i;
import r1.g;
import r1.h;
import r1.k;
import r1.q;
import r1.t;

public class DiagnosticsWorker extends Worker {

    /* renamed from: b  reason: collision with root package name */
    private static final String f5323b = p.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(r1.p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.f21926a, pVar.f21928c, num, pVar.f21927b.name(), str, str2});
    }

    private static String c(k kVar, t tVar, h hVar, List<r1.p> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"}));
        for (r1.p next : list) {
            Integer num = null;
            g c10 = hVar.c(next.f21926a);
            if (c10 != null) {
                num = Integer.valueOf(c10.f21904b);
            }
            sb2.append(a(next, TextUtils.join(",", kVar.b(next.f21926a)), num, TextUtils.join(",", tVar.a(next.f21926a))));
        }
        return sb2.toString();
    }

    public ListenableWorker.a doWork() {
        WorkDatabase q10 = i.m(getApplicationContext()).q();
        q B = q10.B();
        k z10 = q10.z();
        t C = q10.C();
        h y10 = q10.y();
        List<r1.p> e10 = B.e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<r1.p> i10 = B.i();
        List<r1.p> t10 = B.t(200);
        if (e10 != null && !e10.isEmpty()) {
            p c10 = p.c();
            String str = f5323b;
            c10.d(str, "Recently completed work:\n\n", new Throwable[0]);
            p.c().d(str, c(z10, C, y10, e10), new Throwable[0]);
        }
        if (i10 != null && !i10.isEmpty()) {
            p c11 = p.c();
            String str2 = f5323b;
            c11.d(str2, "Running work:\n\n", new Throwable[0]);
            p.c().d(str2, c(z10, C, y10, i10), new Throwable[0]);
        }
        if (t10 != null && !t10.isEmpty()) {
            p c12 = p.c();
            String str3 = f5323b;
            c12.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            p.c().d(str3, c(z10, C, y10, t10), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
