package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.h4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.s3;
import com.google.android.gms.ads.internal.client.u1;
import com.google.android.gms.ads.internal.client.x1;
import com.google.android.gms.ads.internal.client.y1;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.List;
import n4.a0;
import n4.o;
import n4.p;
import n4.q;
import n4.s;
import n4.y;
import q4.c;
import q4.d;
import q4.i;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbfv extends i {
    private final zzbfu zza;
    private final List zzb = new ArrayList();
    private final zzbdy zzc;
    private final a0 zzd = new a0();
    private final c zze;
    private final List zzf = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[Catch:{ RemoteException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af A[Catch:{ RemoteException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbfv(com.google.android.gms.internal.ads.zzbfu r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            n4.a0 r1 = new n4.a0
            r1.<init>()
            r5.zzd = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzf = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch:{ RemoteException -> 0x005b }
            if (r6 == 0) goto L_0x005f
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x005b }
        L_0x0027:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x005b }
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x005b }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005b }
            if (r3 == 0) goto L_0x004d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005b }
            if (r2 != 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005b }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzbdx     // Catch:{ RemoteException -> 0x005b }
            if (r4 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.zzbdx r3 = (com.google.android.gms.internal.ads.zzbdx) r3     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x0047:
            com.google.android.gms.internal.ads.zzbdv r3 = new com.google.android.gms.internal.ads.zzbdv     // Catch:{ RemoteException -> 0x005b }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x004d:
            r3 = r1
        L_0x004e:
            if (r3 == 0) goto L_0x0027
            java.util.List r2 = r5.zzb     // Catch:{ RemoteException -> 0x005b }
            com.google.android.gms.internal.ads.zzbdy r4 = new com.google.android.gms.internal.ads.zzbdy     // Catch:{ RemoteException -> 0x005b }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x005b }
            r2.add(r4)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0027
        L_0x005b:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbza.zzh(r0, r6)
        L_0x005f:
            com.google.android.gms.internal.ads.zzbfu r6 = r5.zza     // Catch:{ RemoteException -> 0x008e }
            java.util.List r6 = r6.zzv()     // Catch:{ RemoteException -> 0x008e }
            if (r6 == 0) goto L_0x0092
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x008e }
        L_0x006b:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x008e }
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x008e }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x008e }
            if (r3 == 0) goto L_0x0080
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.ads.internal.client.x1 r2 = com.google.android.gms.ads.internal.client.w1.M0(r2)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x0081
        L_0x0080:
            r2 = r1
        L_0x0081:
            if (r2 == 0) goto L_0x006b
            java.util.List r3 = r5.zzf     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.ads.internal.client.y1 r4 = new com.google.android.gms.ads.internal.client.y1     // Catch:{ RemoteException -> 0x008e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x008e }
            r3.add(r4)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x006b
        L_0x008e:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbza.zzh(r0, r6)
        L_0x0092:
            com.google.android.gms.internal.ads.zzbfu r6 = r5.zza     // Catch:{ RemoteException -> 0x00a0 }
            com.google.android.gms.internal.ads.zzbdx r6 = r6.zzk()     // Catch:{ RemoteException -> 0x00a0 }
            if (r6 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.zzbdy r2 = new com.google.android.gms.internal.ads.zzbdy     // Catch:{ RemoteException -> 0x00a0 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbza.zzh(r0, r6)
        L_0x00a4:
            r2 = r1
        L_0x00a5:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzbfu r6 = r5.zza     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.zzbdp r6 = r6.zzi()     // Catch:{ RemoteException -> 0x00bc }
            if (r6 == 0) goto L_0x00c0
            com.google.android.gms.internal.ads.zzbdq r6 = new com.google.android.gms.internal.ads.zzbdq     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.zzbfu r2 = r5.zza     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.zzbdp r2 = r2.zzi()     // Catch:{ RemoteException -> 0x00bc }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00bc }
            r1 = r6
            goto L_0x00c0
        L_0x00bc:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbza.zzh(r0, r6)
        L_0x00c0:
            r5.zze = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfv.<init>(com.google.android.gms.internal.ads.zzbfu):void");
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        } catch (RemoteException e10) {
            zzbza.zzh("Failed to cancelUnconfirmedClick", e10);
        }
    }

    public final void destroy() {
        try {
            this.zza.zzx();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.zza.zzC();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final c getAdChoicesInfo() {
        return this.zze;
    }

    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final String getBody() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle zzf2 = this.zza.zzf();
            if (zzf2 != null) {
                return zzf2;
            }
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
        return new Bundle();
    }

    public final String getHeadline() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final d getIcon() {
        return this.zzc;
    }

    public final List<d> getImages() {
        return this.zzb;
    }

    public final o getMediaContent() {
        try {
            if (this.zza.zzj() != null) {
                return new s3(this.zza.zzj(), (zzber) null);
            }
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
        return null;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.zza.zzr();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final List<q> getMuteThisAdReasons() {
        return this.zzf;
    }

    public final String getPrice() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final y getResponseInfo() {
        p2 p2Var;
        try {
            p2Var = this.zza.zzg();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            p2Var = null;
        }
        return y.f(p2Var);
    }

    public final Double getStarRating() {
        try {
            double zze2 = this.zza.zze();
            if (zze2 == -1.0d) {
                return null;
            }
            return Double.valueOf(zze2);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final a0 getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.c(this.zza.zzh());
            }
        } catch (RemoteException e10) {
            zzbza.zzh("Exception occurred while getting video controller", e10);
        }
        return this.zzd;
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return false;
        }
    }

    public final void muteThisAd(q qVar) {
        try {
            if (this.zza.zzH()) {
                if (qVar == null) {
                    try {
                        this.zza.zzy((x1) null);
                        return;
                    } catch (RemoteException e10) {
                        zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                        return;
                    }
                } else if (qVar instanceof y1) {
                    this.zza.zzy(((y1) qVar).a());
                    return;
                } else {
                    zzbza.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                    return;
                }
            }
        } catch (RemoteException e11) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e11);
        }
        zzbza.zzg("Ad is not custom mute enabled");
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzI(bundle);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void setMuteThisAdListener(p pVar) {
        try {
            this.zza.zzD(new u1(pVar));
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void setOnPaidEventListener(s sVar) {
        try {
            this.zza.zzE(new h4(sVar));
        } catch (RemoteException e10) {
            zzbza.zzh("Failed to setOnPaidEventListener", e10);
        }
    }

    public final void setUnconfirmedClickListener(i.b bVar) {
        try {
            this.zza.zzF(new zzbgg(bVar));
        } catch (RemoteException e10) {
            zzbza.zzh("Failed to setUnconfirmedClickListener", e10);
        }
    }

    public final Object zza() {
        try {
            a zzl = this.zza.zzl();
            if (zzl != null) {
                return b.A1(zzl);
            }
            return null;
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }
}
