package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.p1;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdzx {
    private final zzawe zza;
    private final Context zzb;
    private final zzdzb zzc;
    private final zzbzg zzd;
    private final String zze;
    private final zzfdk zzf;
    private final p1 zzg = t.q().zzh();

    public zzdzx(Context context, zzbzg zzbzg, zzawe zzawe, zzdzb zzdzb, String str, zzfdk zzfdk) {
        this.zzb = context;
        this.zzd = zzbzg;
        this.zza = zzawe;
        this.zzc = zzdzb;
        this.zze = str;
        this.zzf = zzfdk;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zzayn zzayn = (zzayn) arrayList.get(i10);
            if (zzayn.zzw() == 2 && zzayn.zze() > j10) {
                j10 = zzayn.zze();
            }
        }
        if (j10 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j10));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z10, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z10) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i10 = 2;
        if (((Boolean) a0.c().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdj zzb2 = zzfdj.zzb("oa_upload");
            zzb2.zza("oa_failed_reqs", String.valueOf(zzdzq.zza(sQLiteDatabase, 0)));
            zzb2.zza("oa_total_reqs", String.valueOf(zzdzq.zza(sQLiteDatabase, 1)));
            zzb2.zza("oa_upload_time", String.valueOf(t.b().a()));
            zzb2.zza("oa_last_successful_time", String.valueOf(zzdzq.zzb(sQLiteDatabase, 2)));
            zzb2.zza("oa_session_id", this.zzg.zzP() ? MaxReward.DEFAULT_LABEL : this.zze);
            this.zzf.zzb(zzb2);
            ArrayList zzc2 = zzdzq.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc2);
            int size = zzc2.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzayn zzayn = (zzayn) zzc2.get(i11);
                zzfdj zzb3 = zzfdj.zzb("oa_signals");
                zzb3.zza("oa_session_id", this.zzg.zzP() ? MaxReward.DEFAULT_LABEL : this.zze);
                zzayi zzf2 = zzayn.zzf();
                String valueOf = zzf2.zzf() ? String.valueOf(zzf2.zzh() - 1) : "-1";
                String obj = zzfqy.zzb(zzayn.zzk(), zzdzw.zza).toString();
                zzb3.zza("oa_sig_ts", String.valueOf(zzayn.zze()));
                zzb3.zza("oa_sig_status", String.valueOf(zzayn.zzw() - 1));
                zzb3.zza("oa_sig_resp_lat", String.valueOf(zzayn.zzd()));
                zzb3.zza("oa_sig_render_lat", String.valueOf(zzayn.zzc()));
                zzb3.zza("oa_sig_formats", obj);
                zzb3.zza("oa_sig_nw_type", valueOf);
                zzb3.zza("oa_sig_wifi", String.valueOf(zzayn.zzx() - 1));
                zzb3.zza("oa_sig_airplane", String.valueOf(zzayn.zzt() - 1));
                zzb3.zza("oa_sig_data", String.valueOf(zzayn.zzu() - 1));
                zzb3.zza("oa_sig_nw_resp", String.valueOf(zzayn.zza()));
                zzb3.zza("oa_sig_offline", String.valueOf(zzayn.zzv() - 1));
                zzb3.zza("oa_sig_nw_state", String.valueOf(zzayn.zzj().zza()));
                if (zzf2.zze() && zzf2.zzf() && zzf2.zzh() == 2) {
                    zzb3.zza("oa_sig_cell_type", String.valueOf(zzf2.zzg() - 1));
                }
                this.zzf.zzb(zzb3);
            }
        } else {
            ArrayList zzc3 = zzdzq.zzc(sQLiteDatabase);
            zzayo zza2 = zzays.zza();
            zza2.zzb(this.zzb.getPackageName());
            zza2.zzd(Build.MODEL);
            zza2.zze(zzdzq.zza(sQLiteDatabase, 0));
            zza2.zza(zzc3);
            zza2.zzg(zzdzq.zza(sQLiteDatabase, 1));
            zza2.zzc(zzdzq.zza(sQLiteDatabase, 3));
            zza2.zzh(t.b().a());
            zza2.zzf(zzdzq.zzb(sQLiteDatabase, 2));
            zzc(sQLiteDatabase, zzc3);
            this.zza.zzb(new zzdzu((zzays) zza2.zzal()));
            zzazd zza3 = zzaze.zza();
            zza3.zza(this.zzd.zzb);
            zza3.zzc(this.zzd.zzc);
            if (true == this.zzd.zzd) {
                i10 = 0;
            }
            zza3.zzb(i10);
            this.zza.zzb(new zzdzv((zzaze) zza3.zzal()));
            this.zza.zzc(10004);
        }
        zzdzq.zzf(sQLiteDatabase);
        return null;
    }

    public final void zzb(boolean z10) {
        try {
            this.zzc.zza(new zzdzt(this, z10));
        } catch (Exception e10) {
            zzbza.zzg("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
