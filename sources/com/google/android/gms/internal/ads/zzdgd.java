package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.t1;
import com.google.android.gms.ads.internal.client.x1;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdgd extends zzcqm {
    public static final zzfqk zzc = zzfqk.zzt("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzath zzA;
    /* access modifiers changed from: private */
    public zzfvc zzB;
    private final Executor zzd;
    /* access modifiers changed from: private */
    public final zzdgi zze;
    private final zzdgq zzf;
    private final zzdhi zzg;
    private final zzdgn zzh;
    private final zzdgt zzi;
    private final zzgws zzj;
    private final zzgws zzk;
    private final zzgws zzl;
    private final zzgws zzm;
    private final zzgws zzn;
    /* access modifiers changed from: private */
    public zzdie zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbwn zzs;
    private final zzapw zzt;
    private final zzbzg zzu;
    private final Context zzv;
    private final zzdgf zzw;
    private final zzeie zzx;
    /* access modifiers changed from: private */
    public final Map zzy = new HashMap();
    private final List zzz = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdgd(zzcql zzcql, Executor executor, zzdgi zzdgi, zzdgq zzdgq, zzdhi zzdhi, zzdgn zzdgn, zzdgt zzdgt, zzgws zzgws, zzgws zzgws2, zzgws zzgws3, zzgws zzgws4, zzgws zzgws5, zzbwn zzbwn, zzapw zzapw, zzbzg zzbzg, Context context, zzdgf zzdgf, zzeie zzeie, zzath zzath) {
        super(zzcql);
        this.zzd = executor;
        this.zze = zzdgi;
        this.zzf = zzdgq;
        this.zzg = zzdhi;
        this.zzh = zzdgn;
        this.zzi = zzdgt;
        this.zzj = zzgws;
        this.zzk = zzgws2;
        this.zzl = zzgws3;
        this.zzm = zzgws4;
        this.zzn = zzgws5;
        this.zzs = zzbwn;
        this.zzt = zzapw;
        this.zzu = zzbzg;
        this.zzv = context;
        this.zzw = zzdgf;
        this.zzx = zzeie;
        this.zzA = zzath;
    }

    public static boolean zzW(View view) {
        if (!((Boolean) a0.c().zzb(zzbar.zziX)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
        }
        t.r();
        long R = b2.R(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (R >= ((long) ((Integer) a0.c().zzb(zzbar.zziY)).intValue())) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzY(Map map) {
        if (map == null) {
            return null;
        }
        zzfqk zzfqk = zzc;
        int size = zzfqk.size();
        int i10 = 0;
        while (i10 < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfqk.get(i10));
            i10++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzZ() {
        if (!((Boolean) a0.c().zzb(zzbar.zzhp)).booleanValue()) {
            return null;
        }
        zzdie zzdie = this.zzo;
        if (zzdie == null) {
            zzbza.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        a zzj2 = zzdie.zzj();
        if (zzj2 != null) {
            return (ImageView.ScaleType) b.A1(zzj2);
        }
        return zzdhi.zza;
    }

    private final void zzaa(String str, boolean z10) {
        if (((Boolean) a0.c().zzb(zzbar.zzeI)).booleanValue()) {
            zzfut zzv2 = this.zze.zzv();
            if (zzv2 != null) {
                this.zzB = zzfvc.zzf();
                zzfuj.zzq(zzv2, new zzdgc(this, "Google", true), this.zzd);
                return;
            }
            return;
        }
        zzt("Google", true);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzZ());
        this.zzq = true;
    }

    private final void zzac(View view, a aVar) {
        zzcei zzq2 = this.zze.zzq();
        if (this.zzh.zzd() && aVar != null && zzq2 != null && view != null) {
            t.a().zzc(aVar, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzad */
    public final synchronized void zzy(zzdie zzdie) {
        View view;
        zzaps zzc2;
        if (!this.zzp) {
            this.zzo = zzdie;
            this.zzg.zze(zzdie);
            this.zzf.zzy(zzdie.zzf(), zzdie.zzm(), zzdie.zzn(), zzdie, zzdie);
            if (((Boolean) a0.c().zzb(zzbar.zzcj)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
                zzc2.zzo(zzdie.zzf());
            }
            if (((Boolean) a0.c().zzb(zzbar.zzbB)).booleanValue()) {
                zzeyc zzeyc = this.zzb;
                if (zzeyc.zzal) {
                    Iterator<String> keys = zzeyc.zzak.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                            this.zzy.put(next, Boolean.FALSE);
                            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                                zzatg zzatg = new zzatg(this.zzv, view);
                                this.zzz.add(zzatg);
                                zzatg.zzc(new zzdgb(this, next));
                            }
                        }
                    }
                }
            }
            if (zzdie.zzi() != null) {
                zzdie.zzi().zzc(this.zzs);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzae */
    public final void zzz(zzdie zzdie) {
        this.zzf.zzz(zzdie.zzf(), zzdie.zzl());
        if (zzdie.zzh() != null) {
            zzdie.zzh().setClickable(false);
            zzdie.zzh().removeAllViews();
        }
        if (zzdie.zzi() != null) {
            zzdie.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzq(zzdgd zzdgd) {
        try {
            zzdgi zzdgi = zzdgd.zze;
            int zzc2 = zzdgi.zzc();
            if (zzc2 != 1) {
                if (zzc2 != 2) {
                    if (zzc2 != 3) {
                        if (zzc2 != 6) {
                            if (zzc2 != 7) {
                                zzbza.zzg("Wrong native template id!");
                                return;
                            }
                            zzdgt zzdgt = zzdgd.zzi;
                            if (zzdgt.zzg() != null) {
                                zzdgt.zzg().zzg((zzbka) zzdgd.zzm.zzb());
                            }
                        } else if (zzdgd.zzi.zzf() != null) {
                            zzdgd.zzaa("Google", true);
                            zzdgd.zzi.zzf().zze((zzbfu) zzdgd.zzl.zzb());
                        }
                    } else if (zzdgd.zzi.zzd(zzdgi.zzz()) != null) {
                        if (zzdgd.zze.zzr() != null) {
                            zzdgd.zzt("Google", true);
                        }
                        zzdgd.zzi.zzd(zzdgd.zze.zzz()).zze((zzber) zzdgd.zzn.zzb());
                    }
                } else if (zzdgd.zzi.zza() != null) {
                    zzdgd.zzaa("Google", true);
                    zzdgd.zzi.zza().zze((zzbem) zzdgd.zzk.zzb());
                }
            } else if (zzdgd.zzi.zzb() != null) {
                zzdgd.zzaa("Google", true);
                zzdgd.zzi.zzb().zze((zzbeo) zzdgd.zzj.zzb());
            }
        } catch (RemoteException e10) {
            zzbza.zzh("RemoteException when notifyAdLoad is called", e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ec, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzA(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzbB     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzeyc r0 = r3.zzb     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.zzal     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0045
            java.util.Map r0 = r3.zzy     // Catch:{ all -> 0x00f2 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f2 }
            java.util.Map r2 = r3.zzy     // Catch:{ all -> 0x00f2 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00f2 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x0029
            monitor-exit(r3)
            return
        L_0x0045:
            if (r7 != 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzbaj r7 = com.google.android.gms.internal.ads.zzbar.zzdu     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbap r0 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r7 = r0.zzb(r7)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00f2 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x0088
            if (r5 == 0) goto L_0x0088
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00f2 }
        L_0x0063:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00f2 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00f2 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00f2 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = zzW(r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0063
            r3.zzab(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0088:
            monitor-exit(r3)
            return
        L_0x008a:
            android.view.View r7 = r3.zzY(r5)     // Catch:{ all -> 0x00f2 }
            if (r7 != 0) goto L_0x0095
            r3.zzab(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzdv     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00b4
            boolean r7 = zzW(r7)     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x00b2
            r3.zzab(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00b2:
            monitor-exit(r3)
            return
        L_0x00b4:
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzdw     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00ed
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ all -> 0x00f2 }
            r0.<init>()     // Catch:{ all -> 0x00f2 }
            r1 = 0
            boolean r1 = r7.getGlobalVisibleRect(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00eb
            int r1 = r7.getHeight()     // Catch:{ all -> 0x00f2 }
            int r2 = r0.height()     // Catch:{ all -> 0x00f2 }
            if (r1 != r2) goto L_0x00eb
            int r7 = r7.getWidth()     // Catch:{ all -> 0x00f2 }
            int r0 = r0.width()     // Catch:{ all -> 0x00f2 }
            if (r7 != r0) goto L_0x00eb
            r3.zzab(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00eb:
            monitor-exit(r3)
            return
        L_0x00ed:
            r3.zzab(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r3)
            return
        L_0x00f2:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdgd.zzA(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzB(x1 x1Var) {
        this.zzf.zzj(x1Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzC(android.view.View r10, android.view.View r11, java.util.Map r12, java.util.Map r13, boolean r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzdhi r0 = r9.zzg     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzdie r1 = r9.zzo     // Catch:{ all -> 0x0035 }
            r0.zzc(r1)     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzdgq r2 = r9.zzf     // Catch:{ all -> 0x0035 }
            android.widget.ImageView$ScaleType r8 = r9.zzZ()     // Catch:{ all -> 0x0035 }
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.zzk(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0035 }
            boolean r10 = r9.zzr     // Catch:{ all -> 0x0035 }
            if (r10 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzdgi r10 = r9.zze     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzcei r11 = r10.zzr()     // Catch:{ all -> 0x0035 }
            if (r11 != 0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            com.google.android.gms.internal.ads.zzcei r10 = r10.zzr()     // Catch:{ all -> 0x0035 }
            androidx.collection.a r11 = new androidx.collection.a     // Catch:{ all -> 0x0035 }
            r11.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r12 = "onSdkAdUserInteractionClick"
            r10.zzd(r12, r11)     // Catch:{ all -> 0x0035 }
            monitor-exit(r9)
            return
        L_0x0033:
            monitor-exit(r9)
            return
        L_0x0035:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdgd.zzC(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzD(View view, int i10) {
        if (((Boolean) a0.c().zzb(zzbar.zzjF)).booleanValue()) {
            zzdie zzdie = this.zzo;
            if (zzdie == null) {
                zzbza.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                this.zzd.execute(new zzdft(this, view, zzdie instanceof zzdhc, i10));
            }
        }
    }

    public final synchronized void zzE(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzF(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzG() {
        zzdie zzdie = this.zzo;
        if (zzdie == null) {
            zzbza.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.zzd.execute(new zzdfy(this, zzdie instanceof zzdhc));
        }
    }

    public final synchronized void zzH() {
        if (!this.zzq) {
            this.zzf.zzr();
        }
    }

    public final void zzI(View view) {
        if (((Boolean) a0.c().zzb(zzbar.zzeI)).booleanValue()) {
            zzfvc zzfvc = this.zzB;
            if (zzfvc != null) {
                zzfvc.zzc(new zzdfu(this, view), this.zzd);
                return;
            }
            return;
        }
        zzac(view, this.zze.zzu());
    }

    public final synchronized void zzJ(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzK(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzL(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzM() {
        this.zzf.zzv();
    }

    public final synchronized void zzN(t1 t1Var) {
        this.zzf.zzw(t1Var);
    }

    public final synchronized void zzO(i2 i2Var) {
        this.zzx.zza(i2Var);
    }

    public final synchronized void zzP(zzbfr zzbfr) {
        this.zzf.zzx(zzbfr);
    }

    public final synchronized void zzQ(zzdie zzdie) {
        if (((Boolean) a0.c().zzb(zzbar.zzbz)).booleanValue()) {
            b2.f14773i.post(new zzdfz(this, zzdie));
        } else {
            zzy(zzdie);
        }
    }

    public final synchronized void zzR(zzdie zzdie) {
        if (((Boolean) a0.c().zzb(zzbar.zzbz)).booleanValue()) {
            b2.f14773i.post(new zzdfv(this, zzdie));
        } else {
            zzz(zzdie);
        }
    }

    public final boolean zzS() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzU() {
        return this.zzf.zzB();
    }

    public final boolean zzV() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzX(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzC = this.zzf.zzC(bundle);
        this.zzq = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new zzdga(this));
        super.zzb();
    }

    public final zzdgf zzc() {
        return this.zzw;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzZ());
    }

    public final void zzj() {
        this.zzd.execute(new zzdfw(this));
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            zzdgq zzdgq = this.zzf;
            zzdgq.getClass();
            executor.execute(new zzdfx(zzdgq));
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzZ());
    }

    public final void zzr(View view) {
        a zzu2 = this.zze.zzu();
        if (this.zzh.zzd() && zzu2 != null && view != null) {
            t.a();
            if (((Boolean) a0.c().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
                Object A1 = b.A1(zzu2);
                if (A1 instanceof zzffk) {
                    ((zzffk) A1).zzb(view, zzffq.NOT_VISIBLE, "Ad overlay");
                }
            }
        }
    }

    public final synchronized void zzs() {
        this.zzf.zzh();
    }

    public final void zzt(String str, boolean z10) {
        String str2;
        zzear zzear;
        zzeas zzeas;
        if (this.zzh.zzd() && !TextUtils.isEmpty(str)) {
            zzdgi zzdgi = this.zze;
            zzcei zzq2 = zzdgi.zzq();
            zzcei zzr2 = zzdgi.zzr();
            if (zzq2 == null && zzr2 == null) {
                zzbza.zzj("Omid display and video webview are null. Skipping initialization.");
                return;
            }
            boolean z11 = false;
            boolean z12 = zzq2 != null;
            boolean z13 = zzr2 != null;
            if (((Boolean) a0.c().zzb(zzbar.zzeG)).booleanValue()) {
                this.zzh.zza();
                int zzb = this.zzh.zza().zzb();
                int i10 = zzb - 1;
                if (i10 != 0) {
                    if (i10 != 1) {
                        zzbza.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return;
                    } else if (zzq2 != null) {
                        z11 = true;
                        z13 = false;
                    } else {
                        zzbza.zzj("Omid media type was display but there was no display webview.");
                        return;
                    }
                } else if (zzr2 != null) {
                    z13 = true;
                } else {
                    zzbza.zzj("Omid media type was video but there was no video webview.");
                    return;
                }
            } else {
                z11 = z12;
            }
            if (z11) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzq2 = zzr2;
            }
            String str3 = str2;
            zzq2.zzG();
            if (!t.a().zze(this.zzv)) {
                zzbza.zzj("Failed to initialize omid in InternalNativeAd");
                return;
            }
            zzbzg zzbzg = this.zzu;
            String str4 = zzbzg.zzb + "." + zzbzg.zzc;
            if (z13) {
                zzear = zzear.VIDEO;
                zzeas = zzeas.DEFINED_BY_JAVASCRIPT;
            } else {
                zzear = zzear.NATIVE_DISPLAY;
                if (this.zze.zzc() == 3) {
                    zzeas = zzeas.UNSPECIFIED;
                } else {
                    zzeas = zzeas.ONE_PIXEL;
                }
            }
            a zzb2 = t.a().zzb(str4, zzq2.zzG(), MaxReward.DEFAULT_LABEL, "javascript", str3, str, zzeas, zzear, this.zzb.zzam);
            if (zzb2 == null) {
                zzbza.zzj("Failed to create omid session in InternalNativeAd");
                return;
            }
            this.zze.zzac(zzb2);
            zzq2.zzap(zzb2);
            if (z13) {
                t.a().zzc(zzb2, zzr2.zzF());
                this.zzr = true;
            }
            if (z10) {
                t.a().zzd(zzb2);
                zzq2.zzd("onSdkLoaded", new androidx.collection.a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzu() {
        this.zzf.zzi();
        this.zze.zzH();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzv(View view, boolean z10, int i10) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z10, zzZ(), i10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw(boolean z10) {
        this.zzf.zzo((View) null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z10, zzZ(), 0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzx(View view) {
        zzac(view, this.zze.zzu());
    }
}
