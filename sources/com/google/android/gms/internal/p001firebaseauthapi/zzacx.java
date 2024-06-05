package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.h;
import com.google.firebase.auth.q0;
import d7.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import y6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
abstract class zzacx<ResultT, CallbackT> implements zzadj<ResultT> {
    protected final int zza;
    private ResultT zzaa;
    private Status zzab;
    protected final zzacz zzb = new zzacz(this);
    protected f zzc;
    protected a0 zzd;
    protected CallbackT zze;
    protected w zzf;
    protected zzacv<ResultT> zzg;
    protected final List<q0.b> zzh = new ArrayList();
    protected Executor zzi;
    protected zzafn zzj;
    protected zzafc zzk;
    protected zzaen zzl;
    protected zzafw zzm;
    protected String zzn;
    protected String zzo;
    protected h zzp;
    protected String zzq;
    protected String zzr;
    protected zzyk zzs;
    protected zzafk zzt;
    protected zzafj zzu;
    protected zzagj zzv;
    protected zzagb zzw;
    boolean zzx;
    private boolean zzy = true;
    /* access modifiers changed from: private */
    public boolean zzz;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacx$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    private static class zza extends LifecycleCallback {
        private final List<q0.b> zza;

        private zza(i iVar, List<q0.b> list) {
            super(iVar);
            this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<q0.b> list) {
            i fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.b("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzacx(int i10) {
        this.zza = i10;
    }

    public final zzacx<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = q.l(callbackt, "external callback cannot be null");
        return this;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzz = true;
        this.zzx = true;
        this.zzaa = resultt;
        this.zzg.zza(resultt, (Status) null);
    }

    public final zzacx<ResultT, CallbackT> zza(w wVar) {
        this.zzf = (w) q.l(wVar, "external failure callback cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(f fVar) {
        this.zzc = (f) q.l(fVar, "firebaseApp cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(a0 a0Var) {
        this.zzd = (a0) q.l(a0Var, "firebaseUser cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(q0.b bVar, Activity activity, Executor executor, String str) {
        q0.b zza2 = zzadt.zza(str, bVar, this);
        synchronized (this.zzh) {
            this.zzh.add((q0.b) q.k(zza2));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) q.k(executor);
        return this;
    }

    static /* synthetic */ void zza(zzacx zzacx) {
        zzacx.zzb();
        q.o(zzacx.zzz, "no success or failure set on method implementation");
    }

    static /* synthetic */ void zza(zzacx zzacx, Status status) {
        w wVar = zzacx.zzf;
        if (wVar != null) {
            wVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzz = true;
        this.zzx = false;
        this.zzab = status;
        this.zzg.zza(null, status);
    }
}
