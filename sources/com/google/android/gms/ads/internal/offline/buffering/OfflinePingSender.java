package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbqv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class OfflinePingSender extends Worker {

    /* renamed from: b  reason: collision with root package name */
    private final zzbqv f14696b;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f14696b = x.a().k(context, new zzbnc());
    }

    public final ListenableWorker.a doWork() {
        try {
            this.f14696b.zzf();
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
