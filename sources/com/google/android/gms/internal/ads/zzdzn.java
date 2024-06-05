package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.p1;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdzn extends zzdzo {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzctt zzd;
    private final TelephonyManager zze;
    /* access modifiers changed from: private */
    public final zzdzf zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzayr.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzayr zzayr = zzayr.CONNECTING;
        sparseArray.put(ordinal, zzayr);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzayr);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzayr);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzayr.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzayr zzayr2 = zzayr.DISCONNECTED;
        sparseArray.put(ordinal2, zzayr2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzayr2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzayr2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzayr2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzayr2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzayr.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzayr);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzayr);
    }

    zzdzn(Context context, zzctt zzctt, zzdzf zzdzf, zzdzb zzdzb, p1 p1Var) {
        super(zzdzb, p1Var);
        this.zzc = context;
        this.zzd = zzctt;
        this.zzf = zzdzf;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzayi zza(zzdzn zzdzn, Bundle bundle) {
        zzayb zza = zzayi.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        int i12 = 2;
        if (i10 == -1) {
            zzdzn.zzg = 2;
        } else {
            zzdzn.zzg = 1;
            if (i10 == 0) {
                zza.zzb(2);
            } else if (i10 != 1) {
                zza.zzb(1);
            } else {
                zza.zzb(3);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 5;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            zza.zza(i12);
        }
        return (zzayi) zza.zzal();
    }

    static /* bridge */ /* synthetic */ zzayr zzb(zzdzn zzdzn, Bundle bundle) {
        return (zzayr) zzb.get(zzezi.zza(zzezi.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzayr.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzdzn zzdzn, boolean z10, ArrayList arrayList, zzayi zzayi, zzayr zzayr) {
        zzaym zzg2 = zzayn.zzg();
        zzg2.zza(arrayList);
        boolean z11 = false;
        zzg2.zzi(zzg(Settings.Global.getInt(zzdzn.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg2.zzj(t.s().h(zzdzn.zzc, zzdzn.zze));
        zzg2.zzf(zzdzn.zzf.zze());
        zzg2.zze(zzdzn.zzf.zzb());
        zzg2.zzb(zzdzn.zzf.zza());
        zzg2.zzc(zzayr);
        zzg2.zzd(zzayi);
        zzg2.zzk(zzdzn.zzg);
        zzg2.zzl(zzg(z10));
        zzg2.zzh(zzdzn.zzf.zzd());
        zzg2.zzg(t.b().a());
        if (Settings.Global.getInt(zzdzn.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z11 = true;
        }
        zzg2.zzm(zzg(z11));
        return ((zzayn) zzg2.zzal()).zzax();
    }

    private static final int zzg(boolean z10) {
        return z10 ? 2 : 1;
    }

    public final void zzd(boolean z10) {
        zzfuj.zzq(this.zzd.zzb(), new zzdzm(this, z10), zzbzn.zzf);
    }
}
