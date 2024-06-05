package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.applovin.mediation.MaxReward;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzbe implements ConsentForm {
    boolean zza = false;
    private final Application zzb;
    private final zzae zzc;
    private final zzby zzd;
    private final zzas zze;
    private final zzbs zzf;
    private final zzdr zzg;
    private Dialog zzh;
    private zzbw zzi;
    private final AtomicBoolean zzj = new AtomicBoolean();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    private final AtomicReference zzm = new AtomicReference();

    public zzbe(Application application, zzae zzae, zzby zzby, zzas zzas, zzbs zzbs, zzdr zzdr) {
        this.zzb = application;
        this.zzc = zzae;
        this.zzd = zzby;
        this.zze = zzas;
        this.zzf = zzbs;
        this.zzg = zzdr;
    }

    private final void zzg() {
        Dialog dialog = this.zzh;
        if (dialog != null) {
            dialog.dismiss();
            this.zzh = null;
        }
        this.zzd.zza((Activity) null);
        zzbb zzbb = (zzbb) this.zzm.getAndSet((Object) null);
        if (zzbb != null) {
            zzbb.zza.zzb.unregisterActivityLifecycleCallbacks(zzbb);
        }
    }

    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzct.zza();
        if (!this.zzj.compareAndSet(false, true)) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzi(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        zzbb zzbb = new zzbb(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzbb);
        this.zzm.set(zzbb);
        this.zzd.zza(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.zzi);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzi(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        this.zzl.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzh = dialog;
        this.zzi.zzc("UMP_messagePresented", MaxReward.DEFAULT_LABEL);
    }

    /* access modifiers changed from: package-private */
    public final zzbw zza() {
        return this.zzi;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzbw zza2 = ((zzbx) this.zzg).zzb();
        this.zzi = zza2;
        zza2.setBackgroundColor(0);
        zza2.getSettings().setJavaScriptEnabled(true);
        zza2.setWebViewClient(new zzbv(zza2, (zzbu) null));
        this.zzk.set(new zzbd(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, (zzbc) null));
        this.zzi.loadDataWithBaseURL(this.zzf.zza(), this.zzf.zzb(), "text/html", "UTF-8", (String) null);
        zzct.zza.postDelayed(new zzba(this), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i10) {
        zzg();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzl.getAndSet((Object) null);
        if (onConsentFormDismissedListener != null) {
            this.zze.zzg(3);
            onConsentFormDismissedListener.onConsentFormDismissed((FormError) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzd(zzi zzi2) {
        zzg();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzl.getAndSet((Object) null);
        if (onConsentFormDismissedListener != null) {
            onConsentFormDismissedListener.onConsentFormDismissed(zzi2.zza());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zze() {
        zzbd zzbd = (zzbd) this.zzk.getAndSet((Object) null);
        if (zzbd != null) {
            zzbd.onConsentFormLoadSuccess(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(zzi zzi2) {
        zzbd zzbd = (zzbd) this.zzk.getAndSet((Object) null);
        if (zzbd != null) {
            zzbd.onConsentFormLoadFailure(zzi2.zza());
        }
    }
}
