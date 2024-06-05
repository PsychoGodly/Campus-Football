package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.h;
import com.google.firebase.auth.o0;
import d7.w;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzacz implements zzace {
    final /* synthetic */ zzacx zza;

    zzacz(zzacx zzacx) {
        this.zza = zzacx;
    }

    private final void zza(zzadf zzadf) {
        this.zza.zzi.execute(new zzadc(this, zzadf));
    }

    public final void zzb(String str) throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 8;
        q.o(z10, "Unexpected response type " + i10);
        this.zza.zzo = str;
        zza((zzadf) new zzacy(this, str));
    }

    public final void zzc(String str) throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 7;
        q.o(z10, "Unexpected response type " + i10);
        zzacx zzacx = this.zza;
        zzacx.zzn = str;
        zzacx.zza(zzacx);
    }

    private final void zza(Status status, h hVar, String str, String str2) {
        zzacx.zza(this.zza, status);
        zzacx zzacx = this.zza;
        zzacx.zzp = hVar;
        zzacx.zzq = str;
        zzacx.zzr = str2;
        w wVar = zzacx.zzf;
        if (wVar != null) {
            wVar.zza(status);
        }
        this.zza.zza(status);
    }

    public final void zzb() throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 6;
        q.o(z10, "Unexpected response type " + i10);
        zzacx.zza(this.zza);
    }

    public final void zzc() throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 9;
        q.o(z10, "Unexpected response type " + i10);
        zzacx.zza(this.zza);
    }

    public final void zza(String str) throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 8;
        q.o(z10, "Unexpected response type " + i10);
        zzacx zzacx = this.zza;
        zzacx.zzo = str;
        zzacx.zzz = true;
        this.zza.zzx = true;
        zza((zzadf) new zzada(this, str));
    }

    public final void zza(zzaen zzaen) throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 3;
        q.o(z10, "Unexpected response type " + i10);
        zzacx zzacx = this.zza;
        zzacx.zzl = zzaen;
        zzacx.zza(zzacx);
    }

    public final void zza() throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 5;
        q.o(z10, "Unexpected response type " + i10);
        zzacx.zza(this.zza);
    }

    public final void zza(zzyh zzyh) {
        zza(zzyh.zza(), zzyh.zzb(), zzyh.zzc(), zzyh.zzd());
    }

    public final void zza(zzyk zzyk) {
        zzacx zzacx = this.zza;
        zzacx.zzs = zzyk;
        zzacx.zza(d7.q.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void zza(Status status, o0 o0Var) throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 2;
        q.o(z10, "Unexpected response type " + i10);
        zza(status, o0Var, (String) null, (String) null);
    }

    public final void zza(Status status) throws RemoteException {
        String x10 = status.x();
        if (x10 != null) {
            if (x10.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (x10.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (x10.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (x10.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (x10.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (x10.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (x10.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (x10.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (x10.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (x10.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzacx zzacx = this.zza;
        if (zzacx.zza == 8) {
            zzacx.zzz = true;
            this.zza.zzx = false;
            zza((zzadf) new zzadd(this, status));
            return;
        }
        zzacx.zza(zzacx, status);
        this.zza.zza(status);
    }

    public final void zza(zzafj zzafj) throws RemoteException {
        zzacx zzacx = this.zza;
        zzacx.zzu = zzafj;
        zzacx.zza(zzacx);
    }

    public final void zza(zzafk zzafk) throws RemoteException {
        zzacx zzacx = this.zza;
        zzacx.zzt = zzafk;
        zzacx.zza(zzacx);
    }

    public final void zza(zzafn zzafn, zzafc zzafc) throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 2;
        q.o(z10, "Unexpected response type: " + i10);
        zzacx zzacx = this.zza;
        zzacx.zzj = zzafn;
        zzacx.zzk = zzafc;
        zzacx.zza(zzacx);
    }

    public final void zza(zzafw zzafw) throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 4;
        q.o(z10, "Unexpected response type " + i10);
        zzacx zzacx = this.zza;
        zzacx.zzm = zzafw;
        zzacx.zza(zzacx);
    }

    public final void zza(zzagb zzagb) throws RemoteException {
        zzacx zzacx = this.zza;
        zzacx.zzw = zzagb;
        zzacx.zza(zzacx);
    }

    public final void zza(zzagj zzagj) throws RemoteException {
        zzacx zzacx = this.zza;
        zzacx.zzv = zzagj;
        zzacx.zza(zzacx);
    }

    public final void zza(zzafn zzafn) throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        q.o(z10, "Unexpected response type: " + i10);
        zzacx zzacx = this.zza;
        zzacx.zzj = zzafn;
        zzacx.zza(zzacx);
    }

    public final void zza(o0 o0Var) throws RemoteException {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 8;
        q.o(z10, "Unexpected response type " + i10);
        this.zza.zzz = true;
        this.zza.zzx = true;
        zza((zzadf) new zzadb(this, o0Var));
    }
}
