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
import com.google.android.gms.ads.nativead.b;
import java.util.ArrayList;
import java.util.List;
import n4.o;
import n4.p;
import n4.q;
import n4.s;
import n4.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbqk extends b {
    private final zzbfu zza;
    private final List zzb = new ArrayList();
    private final zzbqj zzc;
    private final b.a zzd;
    private final List zze = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097 A[Catch:{ RemoteException -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbqk(com.google.android.gms.internal.ads.zzbfu r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zze = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch:{ RemoteException -> 0x0043 }
            if (r6 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0043 }
        L_0x0020:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0043 }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0043 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0043 }
            if (r3 == 0) goto L_0x0035
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.internal.ads.zzbdw.zzg(r2)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0036
        L_0x0035:
            r2 = r1
        L_0x0036:
            if (r2 == 0) goto L_0x0020
            java.util.List r3 = r5.zzb     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.zzbqj r4 = new com.google.android.gms.internal.ads.zzbqj     // Catch:{ RemoteException -> 0x0043 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0043 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0020
        L_0x0043:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbza.zzh(r0, r6)
        L_0x0047:
            com.google.android.gms.internal.ads.zzbfu r6 = r5.zza     // Catch:{ RemoteException -> 0x0076 }
            java.util.List r6 = r6.zzv()     // Catch:{ RemoteException -> 0x0076 }
            if (r6 == 0) goto L_0x007a
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0076 }
        L_0x0053:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0076 }
            if (r2 == 0) goto L_0x007a
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0076 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0076 }
            if (r3 == 0) goto L_0x0068
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0076 }
            com.google.android.gms.ads.internal.client.x1 r2 = com.google.android.gms.ads.internal.client.w1.M0(r2)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0069
        L_0x0068:
            r2 = r1
        L_0x0069:
            if (r2 == 0) goto L_0x0053
            java.util.List r3 = r5.zze     // Catch:{ RemoteException -> 0x0076 }
            com.google.android.gms.ads.internal.client.y1 r4 = new com.google.android.gms.ads.internal.client.y1     // Catch:{ RemoteException -> 0x0076 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0076 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0053
        L_0x0076:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbza.zzh(r0, r6)
        L_0x007a:
            com.google.android.gms.internal.ads.zzbfu r6 = r5.zza     // Catch:{ RemoteException -> 0x0088 }
            com.google.android.gms.internal.ads.zzbdx r6 = r6.zzk()     // Catch:{ RemoteException -> 0x0088 }
            if (r6 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzbqj r2 = new com.google.android.gms.internal.ads.zzbqj     // Catch:{ RemoteException -> 0x0088 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x0088 }
            goto L_0x008d
        L_0x0088:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbza.zzh(r0, r6)
        L_0x008c:
            r2 = r1
        L_0x008d:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzbfu r6 = r5.zza     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.zzbdp r6 = r6.zzi()     // Catch:{ RemoteException -> 0x00a4 }
            if (r6 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.zzbqh r6 = new com.google.android.gms.internal.ads.zzbqh     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.zzbfu r2 = r5.zza     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.zzbdp r2 = r2.zzi()     // Catch:{ RemoteException -> 0x00a4 }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00a4 }
            r1 = r6
            goto L_0x00a8
        L_0x00a4:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbza.zzh(r0, r6)
        L_0x00a8:
            r5.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqk.<init>(com.google.android.gms.internal.ads.zzbfu):void");
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

    public final b.a getAdChoicesInfo() {
        return this.zzd;
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
            Bundle zzf = this.zza.zzf();
            if (zzf != null) {
                return zzf;
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

    public final b.C0153b getIcon() {
        return this.zzc;
    }

    public final List<b.C0153b> getImages() {
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

    public final List<q> getMuteThisAdReasons() {
        return this.zze;
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

    public final void setUnconfirmedClickListener(b.d dVar) {
        try {
            this.zza.zzF(new zzbqs(dVar));
        } catch (RemoteException e10) {
            zzbza.zzh("Failed to setUnconfirmedClickListener", e10);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }
}
