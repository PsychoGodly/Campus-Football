package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.o0;
import k5.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzacd {
    private final zzace zza;
    private final a zzb;

    public zzacd(zzacd zzacd) {
        this(zzacd.zza, zzacd.zzb);
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e10, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending send verification code response.", e10, new Object[0]);
        }
    }

    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending set account info response.", e10, new Object[0]);
        }
    }

    public final void zza(zzaen zzaen) {
        try {
            this.zza.zza(zzaen);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending create auth uri response.", e10, new Object[0]);
        }
    }

    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending email verification response.", e10, new Object[0]);
        }
    }

    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e10, new Object[0]);
        }
    }

    public zzacd(zzace zzace, a aVar) {
        this.zza = (zzace) q.k(zzace);
        this.zzb = (a) q.k(aVar);
    }

    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending delete account response.", e10, new Object[0]);
        }
    }

    public final void zza(zzyh zzyh) {
        try {
            this.zza.zza(zzyh);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result with credential", e10, new Object[0]);
        }
    }

    public final void zza(zzyk zzyk) {
        try {
            this.zza.zza(zzyk);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void zza(Status status, o0 o0Var) {
        try {
            this.zza.zza(status, o0Var);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void zza(zzafj zzafj) {
        try {
            this.zza.zza(zzafj);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending Play Integrity Producer project response.", e10, new Object[0]);
        }
    }

    public final void zza(zzafk zzafk) {
        try {
            this.zza.zza(zzafk);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending get recaptcha config response.", e10, new Object[0]);
        }
    }

    public final void zza(zzafn zzafn, zzafc zzafc) {
        try {
            this.zza.zza(zzafn, zzafc);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zza(zzafw zzafw) {
        try {
            this.zza.zza(zzafw);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending password reset response.", e10, new Object[0]);
        }
    }

    public final void zza(zzagb zzagb) {
        try {
            this.zza.zza(zzagb);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending revoke token response.", e10, new Object[0]);
        }
    }

    public final void zza(zzagj zzagj) {
        try {
            this.zza.zza(zzagj);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending start mfa enrollment response.", e10, new Object[0]);
        }
    }

    public final void zza(zzafn zzafn) {
        try {
            this.zza.zza(zzafn);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void zza(o0 o0Var) {
        try {
            this.zza.zza(o0Var);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending verification completed response.", e10, new Object[0]);
        }
    }
}
