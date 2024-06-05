package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdhc extends zzbeg implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdie {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdgd zze;
    private zzatg zzf;

    public zzdhc(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        t.z();
        zzcaa.zza(view, this);
        t.z();
        zzcaa.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzatg(view.getContext(), view);
    }

    public final synchronized void onClick(View view) {
        zzdgd zzdgd = this.zze;
        if (zzdgd != null) {
            zzdgd.zzC(view, zzf(), zzl(), zzm(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        zzdgd zzdgd = this.zze;
        if (zzdgd != null) {
            zzdgd.zzA(zzf(), zzl(), zzm(), zzdgd.zzW(zzf()));
        }
    }

    public final synchronized void onScrollChanged() {
        zzdgd zzdgd = this.zze;
        if (zzdgd != null) {
            zzdgd.zzA(zzf(), zzl(), zzm(), zzdgd.zzW(zzf()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdgd zzdgd = this.zze;
        if (zzdgd != null) {
            zzdgd.zzJ(view, motionEvent, zzf());
        }
        return false;
    }

    public final synchronized void zzb(a aVar) {
        if (this.zze != null) {
            Object A1 = b.A1(aVar);
            if (!(A1 instanceof View)) {
                zzbza.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zze.zzL((View) A1);
        }
    }

    public final synchronized void zzc(a aVar) {
        Object A1 = b.A1(aVar);
        if (!(A1 instanceof zzdgd)) {
            zzbza.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdgd zzdgd = this.zze;
        if (zzdgd != null) {
            zzdgd.zzR(this);
        }
        zzdgd zzdgd2 = (zzdgd) A1;
        if (zzdgd2.zzS()) {
            this.zze = zzdgd2;
            zzdgd2.zzQ(this);
            this.zze.zzI(zzf());
            return;
        }
        zzbza.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    public final synchronized void zzd() {
        zzdgd zzdgd = this.zze;
        if (zzdgd != null) {
            zzdgd.zzR(this);
            this.zze = null;
        }
    }

    public final View zzf() {
        return (View) this.zza.get();
    }

    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final FrameLayout zzh() {
        return null;
    }

    public final zzatg zzi() {
        return this.zzf;
    }

    public final synchronized a zzj() {
        return null;
    }

    public final synchronized String zzk() {
        return "1007";
    }

    public final synchronized Map zzl() {
        return this.zzd;
    }

    public final synchronized Map zzm() {
        return this.zzb;
    }

    public final synchronized Map zzn() {
        return this.zzc;
    }

    public final synchronized JSONObject zzo() {
        return null;
    }

    public final synchronized JSONObject zzp() {
        zzdgd zzdgd = this.zze;
        if (zzdgd == null) {
            return null;
        }
        return zzdgd.zzk(zzf(), zzl(), zzm());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzq(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r4 = r1.zzd     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            java.util.Map r4 = r1.zzb     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0034 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0034 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)
            return
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdhc.zzq(java.lang.String, android.view.View, boolean):void");
    }
}
