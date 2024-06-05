package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.a0;
import androidx.work.c;
import androidx.work.q;
import androidx.work.r;
import androidx.work.z;
import kotlin.jvm.internal.m;

/* compiled from: BackgroundWorker.kt */
public final class BackgroundWorker {
    private final z workManager;

    public BackgroundWorker(Context context) {
        m.e(context, "applicationContext");
        z g10 = z.g(context);
        m.d(g10, "getInstance(applicationContext)");
        this.workManager = g10;
    }

    public final z getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        m.e(universalRequestWorkerData, "universalRequestWorkerData");
        c a10 = new c.a().b(q.CONNECTED).a();
        m.d(a10, "Builder()\n            .s…TED)\n            .build()");
        m.j(4, "T");
        a0 b10 = ((r.a) ((r.a) new r.a(ListenableWorker.class).f(a10)).h(universalRequestWorkerData.invoke())).b();
        m.d(b10, "OneTimeWorkRequestBuilde…a())\n            .build()");
        getWorkManager().c((r) b10);
    }
}
