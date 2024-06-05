package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfmv {
    private static final Map zza = new HashMap();
    /* access modifiers changed from: private */
    public final Context zzb;
    /* access modifiers changed from: private */
    public final zzfmk zzc;
    private final String zzd;
    /* access modifiers changed from: private */
    public final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    /* access modifiers changed from: private */
    public final Object zzg = new Object();
    /* access modifiers changed from: private */
    public boolean zzh;
    private final Intent zzi;
    private final WeakReference zzj;
    private final IBinder.DeathRecipient zzk = new zzfmn(this);
    /* access modifiers changed from: private */
    public final AtomicInteger zzl = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public ServiceConnection zzm;
    /* access modifiers changed from: private */
    public IInterface zzn;
    private final zzfls zzo;

    public zzfmv(Context context, zzfmk zzfmk, String str, Intent intent, zzfls zzfls, zzfmq zzfmq, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzfmk;
        this.zzd = "OverlayDisplayService";
        this.zzi = intent;
        this.zzo = zzfls;
        this.zzj = new WeakReference((Object) null);
    }

    public static /* synthetic */ void zzj(zzfmv zzfmv) {
        zzfmv.zzc.zzc("reportBinderDeath", new Object[0]);
        zzfmq zzfmq = (zzfmq) zzfmv.zzj.get();
        if (zzfmq != null) {
            zzfmv.zzc.zzc("calling onBinderDied", new Object[0]);
            zzfmq.zza();
        } else {
            zzfmv.zzc.zzc("%s : Binder has died.", zzfmv.zzd);
            for (zzfml zzc2 : zzfmv.zze) {
                zzc2.zzc(zzfmv.zzv());
            }
            zzfmv.zze.clear();
        }
        synchronized (zzfmv.zzg) {
            zzfmv.zzw();
        }
    }

    static /* bridge */ /* synthetic */ void zzn(zzfmv zzfmv, TaskCompletionSource taskCompletionSource) {
        zzfmv.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new zzfmm(zzfmv, taskCompletionSource));
    }

    static /* bridge */ /* synthetic */ void zzp(zzfmv zzfmv, zzfml zzfml) {
        if (zzfmv.zzn == null && !zzfmv.zzh) {
            zzfmv.zzc.zzc("Initiate binding to the service.", new Object[0]);
            zzfmv.zze.add(zzfml);
            zzfmu zzfmu = new zzfmu(zzfmv, (zzfmt) null);
            zzfmv.zzm = zzfmu;
            zzfmv.zzh = true;
            if (!zzfmv.zzb.bindService(zzfmv.zzi, zzfmu, 1)) {
                zzfmv.zzc.zzc("Failed to bind to the service.", new Object[0]);
                zzfmv.zzh = false;
                for (zzfml zzc2 : zzfmv.zze) {
                    zzc2.zzc(new zzfmw());
                }
                zzfmv.zze.clear();
            }
        } else if (zzfmv.zzh) {
            zzfmv.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            zzfmv.zze.add(zzfml);
        } else {
            zzfml.run();
        }
    }

    static /* bridge */ /* synthetic */ void zzq(zzfmv zzfmv) {
        zzfmv.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zzfmv.zzn.asBinder().linkToDeath(zzfmv.zzk, 0);
        } catch (RemoteException e10) {
            zzfmv.zzc.zzb(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzr(zzfmv zzfmv) {
        zzfmv.zzc.zzc("unlinkToDeath", new Object[0]);
        zzfmv.zzn.asBinder().unlinkToDeath(zzfmv.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void zzw() {
        for (TaskCompletionSource trySetException : this.zzf) {
            trySetException.trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzfml zzfml, TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzfmo(this, zzfml.zzb(), taskCompletionSource, zzfml));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu() {
        zzc().post(new zzfmp(this));
    }
}
