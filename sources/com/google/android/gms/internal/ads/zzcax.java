package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.n1;
import java.util.HashMap;
import s4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcax extends FrameLayout implements zzcao {
    final zzcbl zza;
    private final zzcbj zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbbj zze;
    private final long zzf;
    private final zzcap zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;
    private final Integer zzs;

    /* JADX WARNING: type inference failed for: r13v0, types: [com.google.android.gms.internal.ads.zzcap, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.google.android.gms.internal.ads.zzcan] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.google.android.gms.internal.ads.zzccb] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcax(android.content.Context r16, com.google.android.gms.internal.ads.zzcbj r17, int r18, boolean r19, com.google.android.gms.internal.ads.zzbbj r20, com.google.android.gms.internal.ads.zzcbi r21, java.lang.Integer r22) {
        /*
            r15 = this;
            r0 = r15
            r9 = r16
            r10 = r20
            r15.<init>(r16)
            r7 = r17
            r0.zzb = r7
            r0.zze = r10
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r11.<init>(r9)
            r0.zzc = r11
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r12 = -1
            r1.<init>(r12, r12)
            r15.addView(r11, r1)
            com.google.android.gms.ads.internal.a r1 = r17.zzj()
            com.google.android.gms.common.internal.q.k(r1)
            com.google.android.gms.ads.internal.a r1 = r17.zzj()
            com.google.android.gms.internal.ads.zzcaq r1 = r1.f14402a
            com.google.android.gms.internal.ads.zzcbk r8 = new com.google.android.gms.internal.ads.zzcbk
            com.google.android.gms.internal.ads.zzbzg r3 = r17.zzn()
            java.lang.String r4 = r17.zzbm()
            com.google.android.gms.internal.ads.zzbbg r6 = r17.zzk()
            r1 = r8
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 2
            r2 = r18
            if (r2 != r1) goto L_0x005c
            com.google.android.gms.internal.ads.zzccb r13 = new com.google.android.gms.internal.ads.zzccb
            boolean r6 = com.google.android.gms.internal.ads.zzcaq.zza(r17)
            r1 = r13
            r2 = r16
            r3 = r8
            r4 = r17
            r5 = r19
            r7 = r21
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0086
        L_0x005c:
            com.google.android.gms.internal.ads.zzcan r13 = new com.google.android.gms.internal.ads.zzcan
            boolean r8 = com.google.android.gms.internal.ads.zzcaq.zza(r17)
            com.google.android.gms.internal.ads.zzcbk r14 = new com.google.android.gms.internal.ads.zzcbk
            com.google.android.gms.internal.ads.zzbzg r3 = r17.zzn()
            java.lang.String r4 = r17.zzbm()
            com.google.android.gms.internal.ads.zzbbg r6 = r17.zzk()
            r1 = r14
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r13
            r3 = r17
            r4 = r19
            r5 = r8
            r6 = r21
            r7 = r14
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x0086:
            r0.zzg = r13
            r1 = r22
            r0.zzs = r1
            android.view.View r1 = new android.view.View
            r1.<init>(r9)
            r0.zzd = r1
            r2 = 0
            r1.setBackgroundColor(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r2.<init>(r12, r12, r3)
            r11.addView(r13, r2)
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zzD
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00be
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r12, r12)
            r11.addView(r1, r2)
            r11.bringChildToFront(r1)
        L_0x00be:
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzA
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00d3
            r15.zzn()
        L_0x00d3:
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r9)
            r0.zzq = r1
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzF
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzC
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zzk = r1
            if (r10 == 0) goto L_0x010d
            r2 = 1
            if (r2 == r1) goto L_0x0106
            java.lang.String r1 = "0"
            goto L_0x0108
        L_0x0106:
            java.lang.String r1 = "1"
        L_0x0108:
            java.lang.String r2 = "spinner_used"
            r10.zzd(r2, r1)
        L_0x010d:
            com.google.android.gms.internal.ads.zzcbl r1 = new com.google.android.gms.internal.ads.zzcbl
            r1.<init>(r15)
            r0.zza = r1
            r13.zzr(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcax.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcbj, int, boolean, com.google.android.gms.internal.ads.zzbbj, com.google.android.gms.internal.ads.zzcbi, java.lang.Integer):void");
    }

    private final void zzJ() {
        if (this.zzb.zzi() != null && this.zzi && !this.zzj) {
            this.zzb.zzi().getWindow().clearFlags(128);
            this.zzi = false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl2 = zzl();
        if (zzl2 != null) {
            hashMap.put("playerId", zzl2.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            zzcap zzcap = this.zzg;
            if (zzcap != null) {
                zzbzn.zze.execute(new zzcar(zzcap));
            }
        } finally {
            super.finalize();
        }
    }

    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        b2.f14773i.post(new zzcas(this, z10));
    }

    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        b2.f14773i.post(new zzcaw(this, z10));
    }

    public final void zzA(int i10) {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzy(i10);
        }
    }

    public final void zzB(int i10) {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzz(i10);
        }
    }

    public final void zzC(int i10) {
        if (((Boolean) a0.c().zzb(zzbar.zzD)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzD(int i10) {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzA(i10);
        }
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i10, int i11, int i12, int i13) {
        if (n1.c()) {
            n1.a("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 != 0 && i13 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.setMargins(i10, i11, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzG(float f10) {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzb.zze(f10);
            zzcap.zzn();
        }
    }

    public final void zzH(float f10, float f11) {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzb.zzd(false);
            zzcap.zzn();
        }
    }

    public final void zza() {
        if (((Boolean) a0.c().zzb(zzbar.zzbI)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    public final void zze() {
        if (((Boolean) a0.c().zzb(zzbar.zzbI)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z10 = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z10;
            if (!z10) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    public final void zzf() {
        zzcap zzcap = this.zzg;
        if (zzcap != null && this.zzm == 0) {
            zzK("canplaythrough", "duration", String.valueOf(((float) zzcap.zzc()) / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd()));
        }
    }

    public final void zzg() {
        this.zzd.setVisibility(4);
        b2.f14773i.post(new zzcat(this));
    }

    public final void zzh() {
        this.zza.zzb();
        b2.f14773i.post(new zzcau(this));
    }

    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        b2.f14773i.post(new zzcav(this));
    }

    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbaj zzbaj = zzbar.zzE;
            int max = Math.max(i10 / ((Integer) a0.c().zzb(zzbaj)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) a0.c().zzb(zzbaj)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap == null || bitmap.getWidth() != max || this.zzp.getHeight() != max2) {
                this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.zzr = false;
            }
        }
    }

    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg != null && this.zzp != null) {
            long b10 = t.b().b();
            if (this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long b11 = t.b().b() - b10;
            if (n1.c()) {
                n1.a("Spinner frame grab took " + b11 + "ms");
            }
            if (b11 > this.zzf) {
                zzbza.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbbj zzbbj = this.zze;
                if (zzbbj != null) {
                    zzbbj.zzd("spinner_jank", Long.toString(b11));
                }
            }
        }
    }

    public final Integer zzl() {
        zzcap zzcap = this.zzg;
        return zzcap != null ? zzcap.zzc : this.zzs;
    }

    public final void zzn() {
        String str;
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            TextView textView = new TextView(zzcap.getContext());
            Resources zzd2 = t.q().zzd();
            if (zzd2 == null) {
                str = "AdMob - ";
            } else {
                str = zzd2.getString(b.watermark_label_prefix);
            }
            textView.setText(String.valueOf(str).concat(this.zzg.zzj()));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.zzc.bringChildToFront(textView);
        }
    }

    public final void zzo() {
        this.zza.zza();
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzt();
        }
        zzJ();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(boolean z10) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final void zzr() {
        if (this.zzg != null) {
            if (!TextUtils.isEmpty(this.zzn)) {
                this.zzg.zzB(this.zzn, this.zzo);
            } else {
                zzK("no_src", new String[0]);
            }
        }
    }

    public final void zzs() {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzb.zzd(true);
            zzcap.zzn();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt() {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            long zza2 = (long) zzcap.zza();
            if (this.zzl != zza2 && zza2 > 0) {
                float f10 = ((float) zza2) / 1000.0f;
                if (((Boolean) a0.c().zzb(zzbar.zzbG)).booleanValue()) {
                    zzK("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(t.b().a()));
                } else {
                    zzK("timeupdate", "time", String.valueOf(f10));
                }
                this.zzl = zza2;
            }
        }
    }

    public final void zzu() {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzo();
        }
    }

    public final void zzv() {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzp();
        }
    }

    public final void zzw(int i10) {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzq(i10);
        }
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.dispatchTouchEvent(motionEvent);
        }
    }

    public final void zzy(int i10) {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzw(i10);
        }
    }

    public final void zzz(int i10) {
        zzcap zzcap = this.zzg;
        if (zzcap != null) {
            zzcap.zzx(i10);
        }
    }
}
