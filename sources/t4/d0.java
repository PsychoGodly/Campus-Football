package t4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzdcc;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class d0 extends zzbrb {

    /* renamed from: a  reason: collision with root package name */
    private final AdOverlayInfoParcel f22685a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f22686b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22687c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f22688d = false;

    public d0(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f22685a = adOverlayInfoParcel;
        this.f22686b = activity;
    }

    private final synchronized void zzb() {
        if (!this.f22688d) {
            t tVar = this.f22685a.f14699c;
            if (tVar != null) {
                tVar.zzf(4);
            }
            this.f22688d = true;
        }
    }

    public final boolean zzE() throws RemoteException {
        return false;
    }

    public final void zzg(int i10, int i11, Intent intent) throws RemoteException {
    }

    public final void zzh() throws RemoteException {
    }

    public final void zzj(a aVar) throws RemoteException {
    }

    public final void zzk(Bundle bundle) {
        t tVar;
        if (((Boolean) a0.c().zzb(zzbar.zzid)).booleanValue()) {
            this.f22686b.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22685a;
        if (adOverlayInfoParcel == null) {
            this.f22686b.finish();
        } else if (z10) {
            this.f22686b.finish();
        } else {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.a aVar = adOverlayInfoParcel.f14698b;
                if (aVar != null) {
                    aVar.onAdClicked();
                }
                zzdcc zzdcc = this.f22685a.f14721z;
                if (zzdcc != null) {
                    zzdcc.zzr();
                }
                if (!(this.f22686b.getIntent() == null || !this.f22686b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (tVar = this.f22685a.f14699c) == null)) {
                    tVar.zzb();
                }
            }
            t.j();
            Activity activity = this.f22686b;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f22685a;
            i iVar = adOverlayInfoParcel2.f14697a;
            if (!a.b(activity, iVar, adOverlayInfoParcel2.f14705j, iVar.f22697j)) {
                this.f22686b.finish();
            }
        }
    }

    public final void zzl() throws RemoteException {
        if (this.f22686b.isFinishing()) {
            zzb();
        }
    }

    public final void zzn() throws RemoteException {
        t tVar = this.f22685a.f14699c;
        if (tVar != null) {
            tVar.zzbo();
        }
        if (this.f22686b.isFinishing()) {
            zzb();
        }
    }

    public final void zzo() throws RemoteException {
    }

    public final void zzp() throws RemoteException {
        if (this.f22687c) {
            this.f22686b.finish();
            return;
        }
        this.f22687c = true;
        t tVar = this.f22685a.f14699c;
        if (tVar != null) {
            tVar.zzbF();
        }
    }

    public final void zzq(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f22687c);
    }

    public final void zzr() throws RemoteException {
    }

    public final void zzs() throws RemoteException {
        if (this.f22686b.isFinishing()) {
            zzb();
        }
    }

    public final void zzt() throws RemoteException {
        t tVar = this.f22685a.f14699c;
        if (tVar != null) {
            tVar.zze();
        }
    }

    public final void zzv() throws RemoteException {
    }
}
