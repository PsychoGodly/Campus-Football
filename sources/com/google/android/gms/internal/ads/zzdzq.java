package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdzq {
    public static int zza(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11 = 0;
        if (i10 == 2) {
            return 0;
        }
        Cursor zzh = zzh(sQLiteDatabase, i10);
        if (zzh.getCount() > 0) {
            zzh.moveToNext();
            i11 = zzh.getInt(zzh.getColumnIndexOrThrow("value"));
        }
        zzh.close();
        return i11;
    }

    public static long zzb(SQLiteDatabase sQLiteDatabase, int i10) {
        long j10;
        Cursor zzh = zzh(sQLiteDatabase, 2);
        if (zzh.getCount() > 0) {
            zzh.moveToNext();
            j10 = zzh.getLong(zzh.getColumnIndexOrThrow("value"));
        } else {
            j10 = 0;
        }
        zzh.close();
        return j10;
    }

    public static ArrayList zzc(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(zzayn.zzi(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzgqy e10) {
                zzbza.zzg("Unable to deserialize proto from offline signals database:");
                zzbza.zzg(e10.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static void zzd(SQLiteDatabase sQLiteDatabase, long j10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j10));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j10)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
        }
    }

    public static void zze(SQLiteDatabase sQLiteDatabase) {
        zzi(sQLiteDatabase, "failed_requests", 0);
        zzi(sQLiteDatabase, "total_requests", 0);
        zzi(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", 0L);
        sQLiteDatabase.insert("offline_signal_statistics", (String) null, contentValues);
    }

    public static void zzf(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", (String) null, (String[]) null);
        zzj(sQLiteDatabase, "failed_requests", 0);
        zzj(sQLiteDatabase, "total_requests", 0);
        zzj(sQLiteDatabase, "completed_requests", 0);
    }

    public static void zzg(SQLiteDatabase sQLiteDatabase, boolean z10, boolean z11) {
        if (!z11) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"completed_requests"}));
        if (!z10) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
        }
    }

    private static Cursor zzh(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 == 1) {
            strArr2[0] = "total_requests";
        } else if (i10 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, (String) null, (String) null, (String) null);
    }

    private static void zzi(SQLiteDatabase sQLiteDatabase, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", 0);
        sQLiteDatabase.insert("offline_signal_statistics", (String) null, contentValues);
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
