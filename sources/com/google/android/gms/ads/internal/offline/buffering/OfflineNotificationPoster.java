package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbqv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: b  reason: collision with root package name */
    private final zzbqv f14695b;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f14695b = x.a().k(context, new zzbnc());
    }

    public final ListenableWorker.a doWork() {
        try {
            this.f14695b.zzg(b.B1(getApplicationContext()), getInputData().l("uri"), getInputData().l("gws_query_id"));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
