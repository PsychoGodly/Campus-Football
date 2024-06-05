package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.t0;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeaf extends SQLiteOpenHelper {
    private final Context zza;
    private final zzfuu zzb;

    public zzeaf(Context context, zzfuu zzfuu) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) a0.c().zzb(zzbar.zzhJ)).intValue());
        this.zza = context;
        this.zzb = zzfuu;
    }

    static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzbzf zzbzf) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzbzf);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* access modifiers changed from: private */
    public static void zzj(SQLiteDatabase sQLiteDatabase, zzbzf zzbzf) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = " + 1, (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i10] = query.getString(columnIndex);
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                zzbzf.zza(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(zzeah zzeah, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeah.zza));
        contentValues.put("gws_query_id", zzeah.zzb);
        contentValues.put("url", zzeah.zzc);
        contentValues.put("event_state", Integer.valueOf(zzeah.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        t.r();
        t0 U = b2.U(this.zza);
        if (U != null) {
            try {
                U.zze(b.B1(this.zza));
            } catch (RemoteException e10) {
                n1.b("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    public final void zzc(String str) {
        zze(new zzeac(this, str));
    }

    public final void zzd(zzeah zzeah) {
        zze(new zzeaa(this, zzeah));
    }

    /* access modifiers changed from: package-private */
    public final void zze(zzfcd zzfcd) {
        zzfuj.zzq(this.zzb.zzb(new zzdzy(this)), new zzeae(this, zzfcd), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(SQLiteDatabase sQLiteDatabase, zzbzf zzbzf, String str) {
        this.zzb.execute(new zzdzz(sQLiteDatabase, str, zzbzf));
    }

    public final void zzh(zzbzf zzbzf, String str) {
        zze(new zzead(this, zzbzf, str));
    }
}
