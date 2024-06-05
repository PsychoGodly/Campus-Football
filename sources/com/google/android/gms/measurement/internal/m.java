package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.a;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzpg;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r5.r;
import r5.s;
import r5.t;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class m extends ua {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f24804f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f24805g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f24806h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f24807i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f24808j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f24809k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f24810l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f24811m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f24812n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f24813o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d  reason: collision with root package name */
    private final s f24814d = new s(this, zza(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final oa f24815e = new oa(zzb());

    m(va vaVar) {
        super(vaVar);
    }

    private final long B(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = w().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return j10;
        } catch (SQLiteException e10) {
            zzj().B().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object H(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            zzj().B().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i10));
            }
            if (type == 3) {
                return cursor.getString(i10);
            }
            if (type != 4) {
                zzj().B().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            zzj().B().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T I(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.p<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.w()     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0028 }
            if (r4 != 0) goto L_0x0020
            com.google.android.gms.measurement.internal.n4 r4 = r2.zzj()     // Catch:{ SQLiteException -> 0x0028 }
            com.google.android.gms.measurement.internal.p4 r4 = r4.F()     // Catch:{ SQLiteException -> 0x0028 }
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch:{ SQLiteException -> 0x0028 }
            r3.close()
            return r0
        L_0x0020:
            java.lang.Object r4 = r5.a(r3)     // Catch:{ SQLiteException -> 0x0028 }
            r3.close()
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x002e
        L_0x002a:
            r4 = move-exception
            goto L_0x0043
        L_0x002c:
            r4 = move-exception
            r3 = r0
        L_0x002e:
            com.google.android.gms.measurement.internal.n4 r5 = r2.zzj()     // Catch:{ all -> 0x0041 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0040
            r3.close()
        L_0x0040:
            return r0
        L_0x0041:
            r4 = move-exception
            r0 = r3
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            r0.close()
        L_0x0048:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.I(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.p):java.lang.Object");
    }

    private final String K(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = w().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                rawQuery.close();
                return string;
            }
            rawQuery.close();
            return str2;
        } catch (SQLiteException e10) {
            zzj().B().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static void O(ContentValues contentValues, String str, Object obj) {
        q.g(str);
        q.k(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final void T(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase w10 = w();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                zzj().C().b("Value of the primary key is not set.", n4.q(str2));
                return;
            }
            if (((long) w10.update(str, contentValues, str2 + " = ?", new String[]{asString})) == 0 && w10.insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                zzj().B().c("Failed to insert/update table (got -1). key", n4.q(str), n4.q(str2));
            }
        } catch (SQLiteException e10) {
            zzj().B().d("Error storing into table. key", n4.q(str), n4.q(str2), e10);
        }
    }

    private final boolean a0(String str, int i10, zzew.zzb zzb) {
        p();
        i();
        q.g(str);
        q.k(zzb);
        Integer num = null;
        if (zzb.zzf().isEmpty()) {
            p4 G = zzj().G();
            Object q10 = n4.q(str);
            Integer valueOf = Integer.valueOf(i10);
            if (zzb.zzl()) {
                num = Integer.valueOf(zzb.zzb());
            }
            G.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", q10, valueOf, String.valueOf(num));
            return false;
        }
        byte[] zzbv = zzb.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzb.zzl() ? Integer.valueOf(zzb.zzb()) : null);
        contentValues.put("event_name", zzb.zzf());
        contentValues.put("session_scoped", zzb.zzm() ? Boolean.valueOf(zzb.zzj()) : null);
        contentValues.put(JsonStorageKeyNames.DATA_KEY, zzbv);
        try {
            if (w().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert event filter (got -1). appId", n4.q(str));
            return true;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing event filter. appId", n4.q(str), e10);
            return false;
        }
    }

    private final boolean b0(String str, int i10, zzew.zze zze) {
        p();
        i();
        q.g(str);
        q.k(zze);
        Integer num = null;
        if (zze.zze().isEmpty()) {
            p4 G = zzj().G();
            Object q10 = n4.q(str);
            Integer valueOf = Integer.valueOf(i10);
            if (zze.zzi()) {
                num = Integer.valueOf(zze.zza());
            }
            G.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", q10, valueOf, String.valueOf(num));
            return false;
        }
        byte[] zzbv = zze.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zze.zzi() ? Integer.valueOf(zze.zza()) : null);
        contentValues.put("property_name", zze.zze());
        contentValues.put("session_scoped", zze.zzj() ? Boolean.valueOf(zze.zzh()) : null);
        contentValues.put(JsonStorageKeyNames.DATA_KEY, zzbv);
        try {
            if (w().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert property filter (got -1). appId", n4.q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing property filter. appId", n4.q(str), e10);
            return false;
        }
    }

    private final boolean p0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long s0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = w().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            zzj().B().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean u0(String str, List<Integer> list) {
        q.g(str);
        p();
        i();
        SQLiteDatabase w10 = w();
        try {
            long s02 = s0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(AdError.SERVER_ERROR_CODE, a().p(str, e0.H)));
            if (s02 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Integer num = list.get(i10);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            StringBuilder sb2 = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append("(" + TextUtils.join(",", arrayList) + ")");
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return w10.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e10) {
            zzj().B().c("Database error querying filters. appId", n4.q(str), e10);
            return false;
        }
    }

    public final long A(String str) {
        q.g(str);
        i();
        p();
        try {
            return (long) w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, a().p(str, e0.f24526r))))});
        } catch (SQLiteException e10) {
            zzj().B().c("Error deleting over the limit events. appId", n4.q(str), e10);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.jb A0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.q.g(r19)
            com.google.android.gms.common.internal.q.g(r20)
            r18.i()
            r18.p()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.w()     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            if (r3 != 0) goto L_0x003d
            r10.close()
            return r9
        L_0x003d:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            r11 = r18
            java.lang.Object r7 = r11.H(r10, r2)     // Catch:{ SQLiteException -> 0x0076 }
            if (r7 != 0) goto L_0x004d
            r10.close()
            return r9
        L_0x004d:
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.jb r0 = new com.google.android.gms.measurement.internal.jb     // Catch:{ SQLiteException -> 0x0076 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0076 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0072
            com.google.android.gms.measurement.internal.n4 r1 = r18.zzj()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r19)     // Catch:{ SQLiteException -> 0x0076 }
            r1.b(r2, r3)     // Catch:{ SQLiteException -> 0x0076 }
        L_0x0072:
            r10.close()
            return r0
        L_0x0076:
            r0 = move-exception
            goto L_0x0088
        L_0x0078:
            r0 = move-exception
            r11 = r18
            goto L_0x00a8
        L_0x007c:
            r0 = move-exception
            r11 = r18
            goto L_0x0088
        L_0x0080:
            r0 = move-exception
            r11 = r18
            goto L_0x00a9
        L_0x0084:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0088:
            com.google.android.gms.measurement.internal.n4 r1 = r18.zzj()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r19)     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.m4 r4 = r18.d()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.g(r8)     // Catch:{ all -> 0x00a7 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x00a7 }
            if (r10 == 0) goto L_0x00a6
            r10.close()
        L_0x00a6:
            return r9
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            r9 = r10
        L_0x00a9:
            if (r9 == 0) goto L_0x00ae
            r9.close()
        L_0x00ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.A0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.jb");
    }

    public final v B0(String str) {
        if (!zznp.zza() || !a().n(e0.T0)) {
            return v.f25107f;
        }
        q.k(str);
        i();
        p();
        return v.c(K("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, MaxReward.DEFAULT_LABEL));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zze, java.lang.Long> C(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.i()
            r7.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.w()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0071 }
            if (r2 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.n4 r8 = r7.zzj()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.measurement.internal.p4 r8 = r8.F()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r0
        L_0x0035:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0071 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r4 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzkm r2 = com.google.android.gms.measurement.internal.db.A(r4, r2)     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzkj r2 = r2.zzab()     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ IOException -> 0x005b }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r8
        L_0x005b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r7.zzj()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ SQLiteException -> 0x0071 }
            r3.d(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r0
        L_0x0071:
            r8 = move-exception
            goto L_0x0077
        L_0x0073:
            r8 = move-exception
            goto L_0x008c
        L_0x0075:
            r8 = move-exception
            r1 = r0
        L_0x0077:
            com.google.android.gms.measurement.internal.n4 r9 = r7.zzj()     // Catch:{ all -> 0x008a }
            com.google.android.gms.measurement.internal.p4 r9 = r9.B()     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0089
            r1.close()
        L_0x0089:
            return r0
        L_0x008a:
            r8 = move-exception
            r0 = r1
        L_0x008c:
            if (r0 == 0) goto L_0x0091
            r0.close()
        L_0x0091:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.C(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<zzew.zzb>> C0(String str, String str2) {
        p();
        i();
        q.g(str);
        q.g(str2);
        a aVar = new a();
        SQLiteDatabase w10 = w();
        Cursor cursor = null;
        try {
            cursor = w10.query("event_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=? AND event_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    zzew.zzb zzb = (zzew.zzb) ((zzix) ((zzew.zzb.zza) db.A(zzew.zzb.zzc(), cursor.getBlob(1))).zzab());
                    int i10 = cursor.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i10), list);
                    }
                    list.add(zzb);
                } catch (IOException e10) {
                    zzj().B().c("Failed to merge filter. appId", n4.q(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            zzj().B().c("Database error querying filters. appId", n4.q(str), e11);
            Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final n D(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        q.g(str);
        i();
        p();
        String[] strArr = {str};
        n nVar = new n();
        Cursor cursor = null;
        try {
            SQLiteDatabase w10 = w();
            cursor = w10.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                zzj().G().b("Not updating daily counts, app is not known. appId", n4.q(str));
                cursor.close();
                return nVar;
            }
            if (cursor.getLong(0) == j10) {
                nVar.f24839b = cursor.getLong(1);
                nVar.f24838a = cursor.getLong(2);
                nVar.f24840c = cursor.getLong(3);
                nVar.f24841d = cursor.getLong(4);
                nVar.f24842e = cursor.getLong(5);
            }
            if (z10) {
                nVar.f24839b += j11;
            }
            if (z11) {
                nVar.f24838a += j11;
            }
            if (z12) {
                nVar.f24840c += j11;
            }
            if (z13) {
                nVar.f24841d += j11;
            }
            if (z14) {
                nVar.f24842e += j11;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j10));
            contentValues.put("daily_public_events_count", Long.valueOf(nVar.f24838a));
            contentValues.put("daily_events_count", Long.valueOf(nVar.f24839b));
            contentValues.put("daily_conversions_count", Long.valueOf(nVar.f24840c));
            contentValues.put("daily_error_events_count", Long.valueOf(nVar.f24841d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(nVar.f24842e));
            w10.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return nVar;
        } catch (SQLiteException e10) {
            zzj().B().c("Error updating daily counts. appId", n4.q(str), e10);
            if (cursor != null) {
                cursor.close();
            }
            return nVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final y6 D0(String str) {
        q.k(str);
        i();
        p();
        if (!zznp.zza() || !a().n(e0.T0)) {
            return y6.e(K("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
        }
        y6 y6Var = (y6) I("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, l.f24755a);
        return y6Var == null ? y6.f25289c : y6Var;
    }

    public final n E(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return D(j10, str, 1, false, false, z12, false, z14);
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<zzew.zze>> E0(String str, String str2) {
        p();
        i();
        q.g(str);
        q.g(str2);
        a aVar = new a();
        SQLiteDatabase w10 = w();
        Cursor cursor = null;
        try {
            cursor = w10.query("property_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=? AND property_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<zzew.zze>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    zzew.zze zze = (zzew.zze) ((zzix) ((zzew.zze.zza) db.A(zzew.zze.zzc(), cursor.getBlob(1))).zzab());
                    int i10 = cursor.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i10), list);
                    }
                    list.add(zze);
                } catch (IOException e10) {
                    zzj().B().c("Failed to merge filter", n4.q(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            zzj().B().c("Database error querying filters. appId", n4.q(str), e11);
            Map<Integer, List<zzew.zze>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<na> F0(String str) {
        q.g(str);
        i();
        p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = w().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", (String) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                if (string == null) {
                    string = MaxReward.DEFAULT_LABEL;
                }
                arrayList.add(new na(string, cursor.getLong(1), cursor.getInt(2)));
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            zzj().B().c("Error querying trigger uris. appId", n4.q(str), e10);
            List<na> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void G0(String str, String str2) {
        q.g(str);
        q.g(str2);
        i();
        p();
        try {
            w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().B().d("Error deleting user property. appId", n4.q(str), d().g(str2), e10);
        }
    }

    public final List<jb> H0(String str) {
        q.g(str);
        i();
        p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = w().query("user_attributes", new String[]{MediationMetaData.KEY_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                if (string2 == null) {
                    string2 = MaxReward.DEFAULT_LABEL;
                }
                String str2 = string2;
                long j10 = cursor.getLong(2);
                Object H = H(cursor, 3);
                if (H == null) {
                    zzj().B().b("Read invalid user property value, ignoring it. appId", n4.q(str));
                } else {
                    arrayList.add(new jb(str, str2, string, j10, H));
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            zzj().B().c("Error querying user properties. appId", n4.q(str), e10);
            List<jb> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, zzfi.zzl> I0(String str) {
        p();
        i();
        q.g(str);
        Cursor cursor = null;
        try {
            cursor = w().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, zzfi.zzl> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            a aVar = new a();
            do {
                int i10 = cursor.getInt(0);
                try {
                    aVar.put(Integer.valueOf(i10), (zzfi.zzl) ((zzix) ((zzfi.zzl.zza) db.A(zzfi.zzl.zze(), cursor.getBlob(1))).zzab()));
                } catch (IOException e10) {
                    zzj().B().d("Failed to merge filter results. appId, audienceId, error", n4.q(str), Integer.valueOf(i10), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            zzj().B().c("Database error querying filter results. appId", n4.q(str), e11);
            Map<Integer, zzfi.zzl> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String J(long r5) {
        /*
            r4 = this;
            r4.i()
            r4.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.w()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003a }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.n4 r6 = r4.zzj()     // Catch:{ SQLiteException -> 0x003a }
            com.google.android.gms.measurement.internal.p4 r6 = r6.F()     // Catch:{ SQLiteException -> 0x003a }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r0
        L_0x0032:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r6
        L_0x003a:
            r6 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x0055
        L_0x003e:
            r6 = move-exception
            r5 = r0
        L_0x0040:
            com.google.android.gms.measurement.internal.n4 r1 = r4.zzj()     // Catch:{ all -> 0x0053 }
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x0052
            r5.close()
        L_0x0052:
            return r0
        L_0x0053:
            r6 = move-exception
            r0 = r5
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.J(long):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<zzew.zzb>> J0(String str) {
        q.g(str);
        a aVar = new a();
        SQLiteDatabase w10 = w();
        Cursor cursor = null;
        try {
            cursor = w10.query("event_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    zzew.zzb zzb = (zzew.zzb) ((zzix) ((zzew.zzb.zza) db.A(zzew.zzb.zzc(), cursor.getBlob(1))).zzab());
                    if (zzb.zzk()) {
                        int i10 = cursor.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i10));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i10), list);
                        }
                        list.add(zzb);
                    }
                } catch (IOException e10) {
                    zzj().B().c("Failed to merge filter. appId", n4.q(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            zzj().B().c("Database error querying filters. appId", n4.q(str), e11);
            Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<Integer>> K0(String str) {
        p();
        i();
        q.g(str);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = w().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
            if (!cursor.moveToFirst()) {
                Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                int i10 = cursor.getInt(0);
                List list = (List) aVar.get(Integer.valueOf(i10));
                if (list == null) {
                    list = new ArrayList();
                    aVar.put(Integer.valueOf(i10), list);
                }
                list.add(Integer.valueOf(cursor.getInt(1)));
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e10) {
            zzj().B().c("Database error querying scoped filters. appId", n4.q(str), e10);
            Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0181 A[EDGE_INSN: B:88:0x0181->B:76:0x0181 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zzj, java.lang.Long>> L(java.lang.String r19, int r20, int r21) {
        /*
            r18 = this;
            r1 = r21
            r18.i()
            r18.p()
            r2 = 1
            r3 = 0
            if (r20 <= 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            com.google.android.gms.common.internal.q.a(r0)
            if (r1 <= 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.google.android.gms.common.internal.q.a(r0)
            com.google.android.gms.common.internal.q.g(r19)
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r18.w()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r6 = "queue"
            java.lang.String r0 = "rowid"
            java.lang.String r7 = "data"
            java.lang.String r8 = "retry_count"
            java.lang.String[] r7 = new java.lang.String[]{r0, r7, r8}     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r8 = "app_id=?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0187 }
            r9[r3] = r19     // Catch:{ SQLiteException -> 0x0187 }
            r10 = 0
            r11 = 0
            java.lang.String r12 = "rowid"
            java.lang.String r13 = java.lang.String.valueOf(r20)     // Catch:{ SQLiteException -> 0x0187 }
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x0187 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0187 }
            if (r0 != 0) goto L_0x004e
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0187 }
            r4.close()
            return r0
        L_0x004e:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0187 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0187 }
            r6 = 0
        L_0x0054:
            long r7 = r4.getLong(r3)     // Catch:{ SQLiteException -> 0x0187 }
            byte[] r0 = r4.getBlob(r2)     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.measurement.internal.db r9 = r18.j()     // Catch:{ IOException -> 0x0163 }
            byte[] r0 = r9.d0(r0)     // Catch:{ IOException -> 0x0163 }
            boolean r9 = r5.isEmpty()     // Catch:{ SQLiteException -> 0x0187 }
            if (r9 != 0) goto L_0x006e
            int r9 = r0.length     // Catch:{ SQLiteException -> 0x0187 }
            int r9 = r9 + r6
            if (r9 > r1) goto L_0x0181
        L_0x006e:
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r9 = com.google.android.gms.internal.measurement.zzfi.zzj.zzu()     // Catch:{ IOException -> 0x0150 }
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.measurement.internal.db.A(r9, r0)     // Catch:{ IOException -> 0x0150 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9     // Catch:{ IOException -> 0x0150 }
            boolean r10 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 == 0) goto L_0x012c
            com.google.android.gms.measurement.internal.f r10 = r18.a()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.e0.X0     // Catch:{ SQLiteException -> 0x0187 }
            boolean r10 = r10.n(r11)     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 == 0) goto L_0x012c
            boolean r10 = r5.isEmpty()     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 != 0) goto L_0x012c
            java.lang.Object r10 = r5.get(r3)     // Catch:{ SQLiteException -> 0x0187 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.Object r10 = r10.first     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = (com.google.android.gms.internal.measurement.zzfi.zzj) r10     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzkj r11 = r9.zzab()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzix r11 = (com.google.android.gms.internal.measurement.zzix) r11     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = (com.google.android.gms.internal.measurement.zzfi.zzj) r11     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r12 = r10.zzac()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r13 = r11.zzac()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r12 = r12.equals(r13)     // Catch:{ SQLiteException -> 0x0187 }
            if (r12 == 0) goto L_0x0129
            java.lang.String r12 = r10.zzab()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r13 = r11.zzab()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r12 = r12.equals(r13)     // Catch:{ SQLiteException -> 0x0187 }
            if (r12 == 0) goto L_0x0129
            boolean r12 = r10.zzas()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r13 = r11.zzas()     // Catch:{ SQLiteException -> 0x0187 }
            if (r12 != r13) goto L_0x0129
            java.lang.String r12 = r10.zzad()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r13 = r11.zzad()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r12 = r12.equals(r13)     // Catch:{ SQLiteException -> 0x0187 }
            if (r12 == 0) goto L_0x0129
            java.util.List r10 = r10.zzaq()     // Catch:{ SQLiteException -> 0x0187 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ SQLiteException -> 0x0187 }
        L_0x00de:
            boolean r12 = r10.hasNext()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r13 = "_npa"
            r14 = -1
            if (r12 == 0) goto L_0x00ff
            java.lang.Object r12 = r10.next()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzn r12 = (com.google.android.gms.internal.measurement.zzfi.zzn) r12     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r2 = r12.zzg()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r2 = r13.equals(r2)     // Catch:{ SQLiteException -> 0x0187 }
            if (r2 == 0) goto L_0x00fd
            long r16 = r12.zzc()     // Catch:{ SQLiteException -> 0x0187 }
            goto L_0x0101
        L_0x00fd:
            r2 = 1
            goto L_0x00de
        L_0x00ff:
            r16 = r14
        L_0x0101:
            java.util.List r2 = r11.zzaq()     // Catch:{ SQLiteException -> 0x0187 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SQLiteException -> 0x0187 }
        L_0x0109:
            boolean r10 = r2.hasNext()     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 == 0) goto L_0x0123
            java.lang.Object r10 = r2.next()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzn r10 = (com.google.android.gms.internal.measurement.zzfi.zzn) r10     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r11 = r10.zzg()     // Catch:{ SQLiteException -> 0x0187 }
            boolean r11 = r13.equals(r11)     // Catch:{ SQLiteException -> 0x0187 }
            if (r11 == 0) goto L_0x0109
            long r14 = r10.zzc()     // Catch:{ SQLiteException -> 0x0187 }
        L_0x0123:
            int r2 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0129
            r2 = 1
            goto L_0x012a
        L_0x0129:
            r2 = 0
        L_0x012a:
            if (r2 == 0) goto L_0x0181
        L_0x012c:
            r2 = 2
            boolean r10 = r4.isNull(r2)     // Catch:{ SQLiteException -> 0x0187 }
            if (r10 != 0) goto L_0x013a
            int r2 = r4.getInt(r2)     // Catch:{ SQLiteException -> 0x0187 }
            r9.zzh((int) r2)     // Catch:{ SQLiteException -> 0x0187 }
        L_0x013a:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0187 }
            int r6 = r6 + r0
            com.google.android.gms.internal.measurement.zzkj r0 = r9.zzab()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzix r0 = (com.google.android.gms.internal.measurement.zzix) r0     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.internal.measurement.zzfi$zzj r0 = (com.google.android.gms.internal.measurement.zzfi.zzj) r0     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0187 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x0187 }
            r5.add(r0)     // Catch:{ SQLiteException -> 0x0187 }
            goto L_0x0175
        L_0x0150:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r2 = r18.zzj()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r7 = "Failed to merge queued bundle. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r19)     // Catch:{ SQLiteException -> 0x0187 }
            r2.c(r7, r8, r0)     // Catch:{ SQLiteException -> 0x0187 }
            goto L_0x0175
        L_0x0163:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r2 = r18.zzj()     // Catch:{ SQLiteException -> 0x0187 }
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()     // Catch:{ SQLiteException -> 0x0187 }
            java.lang.String r7 = "Failed to unzip queued bundle. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r19)     // Catch:{ SQLiteException -> 0x0187 }
            r2.c(r7, r8, r0)     // Catch:{ SQLiteException -> 0x0187 }
        L_0x0175:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0187 }
            if (r0 == 0) goto L_0x0181
            if (r6 <= r1) goto L_0x017e
            goto L_0x0181
        L_0x017e:
            r2 = 1
            goto L_0x0054
        L_0x0181:
            r4.close()
            return r5
        L_0x0185:
            r0 = move-exception
            goto L_0x01a3
        L_0x0187:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r1 = r18.zzj()     // Catch:{ all -> 0x0185 }
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "Error querying bundles. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r19)     // Catch:{ all -> 0x0185 }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x0185 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0185 }
            if (r4 == 0) goto L_0x01a2
            r4.close()
        L_0x01a2:
            return r0
        L_0x01a3:
            if (r4 == 0) goto L_0x01a8
            r4.close()
        L_0x01a8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.L(java.lang.String, int, int):java.util.List");
    }

    public final void L0() {
        p();
        w().beginTransaction();
    }

    public final List<d> M(String str, String str2, String str3) {
        q.g(str);
        i();
        p();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return N(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void M0() {
        p();
        w().endTransaction();
    }

    public final List<d> N(String str, String[] strArr) {
        i();
        p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = w().query("conditional_properties", new String[]{"app_id", "origin", MediationMetaData.KEY_NAME, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z10 = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object H = H(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z10 = true;
                    }
                    String string4 = cursor.getString(5);
                    long j10 = cursor.getLong(6);
                    db j11 = j();
                    byte[] blob = cursor.getBlob(7);
                    Parcelable.Creator creator = d0.CREATOR;
                    long j12 = cursor.getLong(8);
                    long j13 = cursor.getLong(10);
                    boolean z11 = z10;
                    d dVar = r3;
                    d dVar2 = new d(string, string2, new hb(string3, j13, H, string2), j12, z11, string4, (d0) j11.x(blob, creator), j10, (d0) j().x(cursor.getBlob(9), creator), cursor.getLong(11), (d0) j().x(cursor.getBlob(12), creator));
                    arrayList.add(dVar);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    zzj().B().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            zzj().B().b("Error querying conditional user property value", e10);
            List<d> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void N0() {
        int delete;
        i();
        p();
        if (p0()) {
            long a10 = n().f25302e.a();
            long b10 = zzb().b();
            if (Math.abs(b10 - a10) > e0.A.a(null).longValue()) {
                n().f25302e.b(b10);
                i();
                p();
                if (p0() && (delete = w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().a()), String.valueOf(f.H())})) > 0) {
                    zzj().F().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final void O0() {
        p();
        w().setTransactionSuccessful();
    }

    public final void P(a0 a0Var) {
        q.k(a0Var);
        i();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a0Var.f24337a);
        contentValues.put(MediationMetaData.KEY_NAME, a0Var.f24338b);
        contentValues.put("lifetime_count", Long.valueOf(a0Var.f24339c));
        contentValues.put("current_bundle_count", Long.valueOf(a0Var.f24340d));
        contentValues.put("last_fire_timestamp", Long.valueOf(a0Var.f24342f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(a0Var.f24343g));
        contentValues.put("last_bundled_day", a0Var.f24344h);
        contentValues.put("last_sampled_complex_event_id", a0Var.f24345i);
        contentValues.put("last_sampling_rate", a0Var.f24346j);
        contentValues.put("current_session_count", Long.valueOf(a0Var.f24341e));
        Boolean bool = a0Var.f24347k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (w().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                zzj().B().b("Failed to insert/update event aggregates (got -1). appId", n4.q(a0Var.f24337a));
            }
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing event aggregates. appId", n4.q(a0Var.f24337a), e10);
        }
    }

    public final boolean P0() {
        return s0("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final void Q(r5 r5Var) {
        q.k(r5Var);
        i();
        p();
        String t02 = r5Var.t0();
        q.k(t02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t02);
        contentValues.put("app_instance_id", r5Var.u0());
        contentValues.put("gmp_app_id", r5Var.j());
        contentValues.put("resettable_device_id_hash", r5Var.l());
        contentValues.put("last_bundle_index", Long.valueOf(r5Var.k0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(r5Var.m0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(r5Var.i0()));
        contentValues.put("app_version", r5Var.h());
        contentValues.put("app_store", r5Var.v0());
        contentValues.put("gmp_version", Long.valueOf(r5Var.g0()));
        contentValues.put("dev_cert_hash", Long.valueOf(r5Var.a0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(r5Var.r()));
        contentValues.put("day", Long.valueOf(r5Var.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(r5Var.T()));
        contentValues.put("daily_events_count", Long.valueOf(r5Var.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(r5Var.K()));
        contentValues.put("config_fetched_time", Long.valueOf(r5Var.H()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(r5Var.e0()));
        contentValues.put("app_version_int", Long.valueOf(r5Var.z()));
        contentValues.put("firebase_instance_id", r5Var.i());
        contentValues.put("daily_error_events_count", Long.valueOf(r5Var.N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(r5Var.W()));
        contentValues.put("health_monitor_sample", r5Var.k());
        contentValues.put("android_id", Long.valueOf(r5Var.v()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(r5Var.q()));
        contentValues.put("admob_app_id", r5Var.r0());
        contentValues.put("dynamite_version", Long.valueOf(r5Var.c0()));
        contentValues.put("session_stitching_token", r5Var.m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(r5Var.t()));
        contentValues.put("target_os_version", Long.valueOf(r5Var.p0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(r5Var.o0()));
        if (zzpg.zza() && a().w(t02, e0.L0)) {
            contentValues.put("ad_services_version", Integer.valueOf(r5Var.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(r5Var.D()));
        }
        if (zznk.zza() && a().w(t02, e0.Y0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(r5Var.u()));
        }
        List<String> n10 = r5Var.n();
        if (n10 != null) {
            if (n10.isEmpty()) {
                zzj().G().b("Safelisted events should not be an empty list. appId", t02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", n10));
            }
        }
        if (zznq.zza() && a().n(e0.f24533u0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zznp.zza() && a().w(t02, e0.T0)) {
            contentValues.put("npa_metadata_value", r5Var.q0());
        }
        try {
            SQLiteDatabase w10 = w();
            if (((long) w10.update("apps", contentValues, "app_id = ?", new String[]{t02})) == 0 && w10.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                zzj().B().b("Failed to insert/update app (got -1). appId", n4.q(t02));
            }
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing app. appId", n4.q(t02), e10);
        }
    }

    public final boolean Q0() {
        return s0("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final void R(String str, v vVar) {
        if (zznp.zza() && a().n(e0.T0)) {
            q.k(str);
            q.k(vVar);
            i();
            p();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", vVar.i());
            T("consent_settings", "app_id", contentValues);
        }
    }

    public final boolean R0() {
        return s0("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final void S(String str, y6 y6Var) {
        q.k(str);
        q.k(y6Var);
        i();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", y6Var.v());
        if (!zznp.zza() || !a().n(e0.T0)) {
            try {
                if (w().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                    zzj().B().b("Failed to insert/update consent setting (got -1). appId", n4.q(str));
                }
            } catch (SQLiteException e10) {
                zzj().B().c("Error storing consent setting. appId, error", n4.q(str), e10);
            }
        } else {
            contentValues.put("consent_source", Integer.valueOf(y6Var.b()));
            T("consent_settings", "app_id", contentValues);
        }
    }

    /* access modifiers changed from: package-private */
    public final void U(String str, List<zzew.zza> list) {
        boolean z10;
        boolean z11;
        String str2 = str;
        List<zzew.zza> list2 = list;
        q.k(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzew.zza.C0262zza zza = (zzew.zza.C0262zza) list2.get(i10).zzby();
            if (zza.zza() != 0) {
                for (int i11 = 0; i11 < zza.zza(); i11++) {
                    zzew.zzb.zza zza2 = (zzew.zzb.zza) zza.zza(i11).zzby();
                    zzew.zzb.zza zza3 = (zzew.zzb.zza) ((zzix.zzb) zza2.clone());
                    String b10 = r.b(zza2.zzb());
                    if (b10 != null) {
                        zza3.zza(b10);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    for (int i12 = 0; i12 < zza2.zza(); i12++) {
                        zzew.zzc zza4 = zza2.zza(i12);
                        String a10 = t.a(zza4.zze());
                        if (a10 != null) {
                            zza3.zza(i12, (zzew.zzc) ((zzix) ((zzew.zzc.zza) zza4.zzby()).zza(a10).zzab()));
                            z11 = true;
                        }
                    }
                    if (z11) {
                        zza = zza.zza(i11, zza3);
                        list2.set(i10, (zzew.zza) ((zzix) zza.zzab()));
                    }
                }
            }
            if (zza.zzb() != 0) {
                for (int i13 = 0; i13 < zza.zzb(); i13++) {
                    zzew.zze zzb = zza.zzb(i13);
                    String a11 = s.a(zzb.zze());
                    if (a11 != null) {
                        zza = zza.zza(i13, ((zzew.zze.zza) zzb.zzby()).zza(a11));
                        list2.set(i10, (zzew.zza) ((zzix) zza.zzab()));
                    }
                }
            }
        }
        p();
        i();
        q.g(str);
        q.k(list);
        SQLiteDatabase w10 = w();
        w10.beginTransaction();
        try {
            p();
            i();
            q.g(str);
            SQLiteDatabase w11 = w();
            w11.delete("property_filters", "app_id=?", new String[]{str2});
            w11.delete("event_filters", "app_id=?", new String[]{str2});
            for (zzew.zza next : list) {
                p();
                i();
                q.g(str);
                q.k(next);
                if (!next.zzg()) {
                    zzj().G().b("Audience with no ID. appId", n4.q(str));
                } else {
                    int zza5 = next.zza();
                    Iterator<zzew.zzb> it = next.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().G().c("Event filter with no ID. Audience definition ignored. appId, audienceId", n4.q(str), Integer.valueOf(zza5));
                                break;
                            }
                        } else {
                            Iterator<zzew.zze> it2 = next.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().G().c("Property filter with no ID. Audience definition ignored. appId, audienceId", n4.q(str), Integer.valueOf(zza5));
                                        break;
                                    }
                                } else {
                                    Iterator<zzew.zzb> it3 = next.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!a0(str2, zza5, it3.next())) {
                                                z10 = false;
                                                break;
                                            }
                                        } else {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                    if (z10) {
                                        Iterator<zzew.zze> it4 = next.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!b0(str2, zza5, it4.next())) {
                                                    z10 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z10) {
                                        p();
                                        i();
                                        q.g(str);
                                        SQLiteDatabase w12 = w();
                                        w12.delete("property_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(zza5)});
                                        w12.delete("event_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(zza5)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzew.zza next2 : list) {
                arrayList.add(next2.zzg() ? Integer.valueOf(next2.zza()) : null);
            }
            u0(str2, arrayList);
            w10.setTransactionSuccessful();
        } finally {
            w10.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    public final void V(List<Long> list) {
        i();
        p();
        q.k(list);
        q.m(list.size());
        if (p0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (s0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().G().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                w().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                zzj().B().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final boolean W(zzfi.zzj zzj, boolean z10) {
        i();
        p();
        q.k(zzj);
        q.g(zzj.zzx());
        q.n(zzj.zzbe());
        N0();
        long a10 = zzb().a();
        if (zzj.zzl() < a10 - f.H() || zzj.zzl() > f.H() + a10) {
            zzj().G().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", n4.q(zzj.zzx()), Long.valueOf(a10), Long.valueOf(zzj.zzl()));
        }
        try {
            byte[] b02 = j().b0(zzj.zzbv());
            zzj().F().b("Saving bundle, size", Integer.valueOf(b02.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzj.zzx());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzj.zzl()));
            contentValues.put(JsonStorageKeyNames.DATA_KEY, b02);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (zzj.zzbl()) {
                contentValues.put("retry_count", Integer.valueOf(zzj.zzf()));
            }
            try {
                if (w().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                zzj().B().b("Failed to insert bundle (got -1). appId", n4.q(zzj.zzx()));
                return false;
            } catch (SQLiteException e10) {
                zzj().B().c("Error storing bundle. appId", n4.q(zzj.zzx()), e10);
                return false;
            }
        } catch (IOException e11) {
            zzj().B().c("Data loss. Failed to serialize bundle. appId", n4.q(zzj.zzx()), e11);
            return false;
        }
    }

    public final boolean X(d dVar) {
        q.k(dVar);
        i();
        p();
        String str = dVar.f24446a;
        q.k(str);
        if (A0(str, dVar.f24448c.f24640b) == null) {
            if (s0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", dVar.f24447b);
        contentValues.put(MediationMetaData.KEY_NAME, dVar.f24448c.f24640b);
        O(contentValues, "value", q.k(dVar.f24448c.v()));
        contentValues.put("active", Boolean.valueOf(dVar.f24450f));
        contentValues.put("trigger_event_name", dVar.f24451g);
        contentValues.put("trigger_timeout", Long.valueOf(dVar.f24453i));
        f();
        contentValues.put("timed_out_event", ib.k0(dVar.f24452h));
        contentValues.put("creation_timestamp", Long.valueOf(dVar.f24449d));
        f();
        contentValues.put("triggered_event", ib.k0(dVar.f24454j));
        contentValues.put("triggered_timestamp", Long.valueOf(dVar.f24448c.f24641c));
        contentValues.put("time_to_live", Long.valueOf(dVar.f24455k));
        f();
        contentValues.put("expired_event", ib.k0(dVar.f24456l));
        try {
            if (w().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                zzj().B().b("Failed to insert/update conditional user property (got -1)", n4.q(str));
            }
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing conditional user property", n4.q(str), e10);
        }
        return true;
    }

    public final boolean Y(w wVar, long j10, boolean z10) {
        i();
        p();
        q.k(wVar);
        q.g(wVar.f25172a);
        byte[] zzbv = j().y(wVar).zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", wVar.f25172a);
        contentValues.put(MediationMetaData.KEY_NAME, wVar.f25173b);
        contentValues.put("timestamp", Long.valueOf(wVar.f25175d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put(JsonStorageKeyNames.DATA_KEY, zzbv);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (w().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert raw event (got -1). appId", n4.q(wVar.f25172a));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing raw event. appId", n4.q(wVar.f25172a), e10);
            return false;
        }
    }

    public final boolean Z(jb jbVar) {
        q.k(jbVar);
        i();
        p();
        if (A0(jbVar.f24731a, jbVar.f24733c) == null) {
            if (ib.E0(jbVar.f24733c)) {
                if (s0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{jbVar.f24731a}) >= ((long) a().l(jbVar.f24731a, e0.I, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(jbVar.f24733c)) {
                if (s0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{jbVar.f24731a, jbVar.f24732b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", jbVar.f24731a);
        contentValues.put("origin", jbVar.f24732b);
        contentValues.put(MediationMetaData.KEY_NAME, jbVar.f24733c);
        contentValues.put("set_timestamp", Long.valueOf(jbVar.f24734d));
        O(contentValues, "value", jbVar.f24735e);
        try {
            if (w().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                zzj().B().b("Failed to insert/update user property (got -1). appId", n4.q(jbVar.f24731a));
            }
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing user property. appId", n4.q(jbVar.f24731a), e10);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean c0(String str, Bundle bundle) {
        i();
        p();
        byte[] zzbv = j().y(new w(this.f25124a, MaxReward.DEFAULT_LABEL, str, "dep", 0, 0, bundle)).zzbv();
        zzj().F().c("Saving default event parameters, appId, data size", d().c(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbv);
        try {
            if (w().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert default event parameters (got -1). appId", n4.q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing default event parameters. appId", n4.q(str), e10);
            return false;
        }
    }

    public final boolean d0(String str, na naVar) {
        i();
        p();
        q.k(naVar);
        q.g(str);
        long a10 = zzb().a();
        if (naVar.f24871b < a10 - f.H() || naVar.f24871b > f.H() + a10) {
            zzj().G().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", n4.q(str), Long.valueOf(a10), Long.valueOf(naVar.f24871b));
        }
        zzj().F().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", naVar.f24870a);
        contentValues.put("source", Integer.valueOf(naVar.f24872c));
        contentValues.put("timestamp_millis", Long.valueOf(naVar.f24871b));
        try {
            if (w().insert("trigger_uris", (String) null, contentValues) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert trigger URI (got -1). appId", n4.q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing trigger URI. appId", n4.q(str), e10);
            return false;
        }
    }

    public final boolean e0(String str, Long l10, long j10, zzfi.zze zze) {
        i();
        p();
        q.k(zze);
        q.g(str);
        q.k(l10);
        byte[] zzbv = zze.zzbv();
        zzj().F().c("Saving complex main event, appId, data size", d().c(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbv);
        try {
            if (w().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert complex main event (got -1). appId", n4.q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing complex main event. appId", n4.q(str), e10);
            return false;
        }
    }

    public final long q0(String str) {
        q.g(str);
        return B("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: protected */
    public final long r0(String str, String str2) {
        long B;
        String str3 = str;
        String str4 = str2;
        q.g(str);
        q.g(str2);
        i();
        p();
        SQLiteDatabase w10 = w();
        w10.beginTransaction();
        long j10 = 0;
        try {
            try {
                B = B("select " + str4 + " from app2 where app_id=?", new String[]{str3}, -1);
                if (B == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (w10.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        zzj().B().c("Failed to insert column (got -1). appId", n4.q(str), str4);
                        w10.endTransaction();
                        return -1;
                    }
                    B = 0;
                }
            } catch (SQLiteException e10) {
                e = e10;
                try {
                    zzj().B().d("Error inserting column. appId", n4.q(str), str4, e);
                    w10.endTransaction();
                    return j10;
                } catch (Throwable th) {
                    th = th;
                    w10.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + B));
                if (((long) w10.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    zzj().B().c("Failed to update column (got 0). appId", n4.q(str), str4);
                    w10.endTransaction();
                    return -1;
                }
                w10.setTransactionSuccessful();
                w10.endTransaction();
                return B;
            } catch (SQLiteException e11) {
                e = e11;
                j10 = B;
                zzj().B().d("Error inserting column. appId", n4.q(str), str4, e);
                w10.endTransaction();
                return j10;
            }
        } catch (SQLiteException e12) {
            e = e12;
            zzj().B().d("Error inserting column. appId", n4.q(str), str4, e);
            w10.endTransaction();
            return j10;
        } catch (Throwable th2) {
            th = th2;
            w10.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    public final long t() {
        Cursor cursor = null;
        try {
            cursor = w().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j10 = cursor.getLong(0);
            cursor.close();
            return j10;
        } catch (SQLiteException e10) {
            zzj().B().b("Error querying raw events", e10);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fa, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fe, code lost:
        r13 = r22;
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0122, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v3 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v5 android.database.Cursor), (r2v0 android.database.Cursor) binds: [B:1:0x0011, B:2:?, B:4:0x0019, B:18:0x008f, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.jb> t0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r22 = this;
            r0 = r25
            com.google.android.gms.common.internal.q.g(r23)
            r22.i()
            r22.p()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00f9 }
            r4 = 3
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00f9 }
            r12 = r23
            r3.add(r12)     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            java.lang.String r6 = "app_id=?"
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            if (r6 != 0) goto L_0x0034
            r6 = r24
            r3.add(r6)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r7 = " and origin=?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            goto L_0x0036
        L_0x0034:
            r6 = r24
        L_0x0036:
            boolean r7 = android.text.TextUtils.isEmpty(r25)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            if (r7 != 0) goto L_0x0055
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r7.append(r0)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r8 = "*"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r3.add(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r7 = " and name glob ?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
        L_0x0055:
            int r7 = r3.size()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.Object[] r3 = r3.toArray(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r17 = r3
            java.lang.String[] r17 = (java.lang.String[]) r17     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            android.database.sqlite.SQLiteDatabase r13 = r22.w()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r14 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r15 = new java.lang.String[]{r3, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r16 = r5.toString()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "1001"
            android.database.Cursor r2 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            if (r3 != 0) goto L_0x008f
            r2.close()
            return r1
        L_0x008f:
            int r3 = r1.size()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r5) goto L_0x00ab
            com.google.android.gms.measurement.internal.n4 r0 = r22.zzj()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r0.b(r3, r4)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r13 = r22
            goto L_0x00e6
        L_0x00ab:
            r3 = 0
            java.lang.String r8 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r3 = 1
            long r9 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r3 = 2
            r13 = r22
            java.lang.Object r11 = r13.H(r2, r3)     // Catch:{ SQLiteException -> 0x00ef }
            java.lang.String r3 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00ef }
            if (r11 != 0) goto L_0x00d4
            com.google.android.gms.measurement.internal.n4 r5 = r22.zzj()     // Catch:{ SQLiteException -> 0x00ec }
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r6 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.n4.q(r23)     // Catch:{ SQLiteException -> 0x00ec }
            r5.d(r6, r7, r3, r0)     // Catch:{ SQLiteException -> 0x00ec }
            goto L_0x00e0
        L_0x00d4:
            com.google.android.gms.measurement.internal.jb r14 = new com.google.android.gms.measurement.internal.jb     // Catch:{ SQLiteException -> 0x00ec }
            r5 = r14
            r6 = r23
            r7 = r3
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ SQLiteException -> 0x00ec }
            r1.add(r14)     // Catch:{ SQLiteException -> 0x00ec }
        L_0x00e0:
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00ec }
            if (r5 != 0) goto L_0x00ea
        L_0x00e6:
            r2.close()
            return r1
        L_0x00ea:
            r6 = r3
            goto L_0x008f
        L_0x00ec:
            r0 = move-exception
            r6 = r3
            goto L_0x0104
        L_0x00ef:
            r0 = move-exception
            goto L_0x0104
        L_0x00f1:
            r0 = move-exception
            r13 = r22
            goto L_0x0104
        L_0x00f5:
            r0 = move-exception
            r13 = r22
            goto L_0x0102
        L_0x00f9:
            r0 = move-exception
            r13 = r22
            goto L_0x0120
        L_0x00fd:
            r0 = move-exception
            r13 = r22
            r12 = r23
        L_0x0102:
            r6 = r24
        L_0x0104:
            com.google.android.gms.measurement.internal.n4 r1 = r22.zzj()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.n4.q(r23)     // Catch:{ all -> 0x011f }
            r1.d(r3, r4, r6, r0)     // Catch:{ all -> 0x011f }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x011e
            r2.close()
        L_0x011e:
            return r0
        L_0x011f:
            r0 = move-exception
        L_0x0120:
            if (r2 == 0) goto L_0x0125
            r2.close()
        L_0x0125:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.t0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long u() {
        return B("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long v() {
        return B("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle v0(java.lang.String r8) {
        /*
            r7 = this;
            r7.i()
            r7.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.w()     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r2 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.n4 r8 = r7.zzj()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.measurement.internal.p4 r8 = r8.F()     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch:{ SQLiteException -> 0x00b6 }
            r1.close()
            return r0
        L_0x002e:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r3 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzkm r2 = com.google.android.gms.measurement.internal.db.A(r3, r2)     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzkj r2 = r2.zzab()     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ IOException -> 0x00a0 }
            r7.j()     // Catch:{ SQLiteException -> 0x00b6 }
            java.util.List r8 = r2.zzh()     // Catch:{ SQLiteException -> 0x00b6 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00b6 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00b6 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00b6 }
        L_0x0054:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r3 = (com.google.android.gms.internal.measurement.zzfi.zzg) r3     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r4 = r3.zzg()     // Catch:{ SQLiteException -> 0x00b6 }
            boolean r5 = r3.zzj()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x0072
            double r5 = r3.zza()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x0072:
            boolean r5 = r3.zzk()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x0080
            float r3 = r3.zzb()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x0080:
            boolean r5 = r3.zzn()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x008e
            java.lang.String r3 = r3.zzh()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x008e:
            boolean r5 = r3.zzl()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x0054
            long r5 = r3.zzd()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x009c:
            r1.close()
            return r2
        L_0x00a0:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r7.zzj()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ SQLiteException -> 0x00b6 }
            r3.c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00b6 }
            r1.close()
            return r0
        L_0x00b6:
            r8 = move-exception
            goto L_0x00bc
        L_0x00b8:
            r8 = move-exception
            goto L_0x00d1
        L_0x00ba:
            r8 = move-exception
            r1 = r0
        L_0x00bc:
            com.google.android.gms.measurement.internal.n4 r2 = r7.zzj()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00ce
            r1.close()
        L_0x00ce:
            return r0
        L_0x00cf:
            r8 = move-exception
            r0 = r1
        L_0x00d1:
            if (r0 == 0) goto L_0x00d6
            r0.close()
        L_0x00d6:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.v0(java.lang.String):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase w() {
        i();
        try {
            return this.f24814d.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzj().G().b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.d w0(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.q.g(r30)
            com.google.android.gms.common.internal.q.g(r31)
            r29.i()
            r29.p()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.w()     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r3 != 0) goto L_0x004c
            r9.close()
            return r8
        L_0x004c:
            java.lang.String r3 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = ""
        L_0x0054:
            r10 = r29
            r16 = r3
            java.lang.Object r5 = r10.H(r9, r2)     // Catch:{ SQLiteException -> 0x00ee }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00ee }
            if (r0 == 0) goto L_0x0065
            r20 = 1
            goto L_0x0067
        L_0x0065:
            r20 = 0
        L_0x0067:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.db r0 = r29.j()     // Catch:{ SQLiteException -> 0x00ee }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.d0> r2 = com.google.android.gms.measurement.internal.d0.CREATOR     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.x(r1, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r22 = r0
            com.google.android.gms.measurement.internal.d0 r22 = (com.google.android.gms.measurement.internal.d0) r22     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.db r0 = r29.j()     // Catch:{ SQLiteException -> 0x00ee }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.x(r1, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r25 = r0
            com.google.android.gms.measurement.internal.d0 r25 = (com.google.android.gms.measurement.internal.d0) r25     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.db r0 = r29.j()     // Catch:{ SQLiteException -> 0x00ee }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.x(r1, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r28 = r0
            com.google.android.gms.measurement.internal.d0 r28 = (com.google.android.gms.measurement.internal.d0) r28     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.hb r17 = new com.google.android.gms.measurement.internal.hb     // Catch:{ SQLiteException -> 0x00ee }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.d r0 = new com.google.android.gms.measurement.internal.d     // Catch:{ SQLiteException -> 0x00ee }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00ee }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00ee }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.n4 r1 = r29.zzj()     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r30)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.m4 r4 = r29.d()     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r4 = r4.g(r7)     // Catch:{ SQLiteException -> 0x00ee }
            r1.c(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00ee }
        L_0x00ea:
            r9.close()
            return r0
        L_0x00ee:
            r0 = move-exception
            goto L_0x0100
        L_0x00f0:
            r0 = move-exception
            r10 = r29
            goto L_0x0120
        L_0x00f4:
            r0 = move-exception
            r10 = r29
            goto L_0x0100
        L_0x00f8:
            r0 = move-exception
            r10 = r29
            goto L_0x0121
        L_0x00fc:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0100:
            com.google.android.gms.measurement.internal.n4 r1 = r29.zzj()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch:{ all -> 0x011f }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r30)     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.m4 r4 = r29.d()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = r4.g(r7)     // Catch:{ all -> 0x011f }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x011e
            r9.close()
        L_0x011e:
            return r8
        L_0x011f:
            r0 = move-exception
        L_0x0120:
            r8 = r9
        L_0x0121:
            if (r8 == 0) goto L_0x0126
            r8.close()
        L_0x0126:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.w0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String x() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.w()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003b
        L_0x0025:
            r2 = move-exception
            r0 = r1
        L_0x0027:
            com.google.android.gms.measurement.internal.n4 r3 = r6.zzj()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.x():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.a0 x0(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r15 = r27
            com.google.android.gms.common.internal.q.g(r26)
            com.google.android.gms.common.internal.q.g(r27)
            r25.i()
            r25.p()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r18 = 0
            android.database.sqlite.SQLiteDatabase r1 = r25.w()     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            java.lang.String r2 = "events"
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r5[r9] = r26     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r1 != 0) goto L_0x005a
            r14.close()
            return r18
        L_0x005a:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r2 = 0
            if (r1 == 0) goto L_0x0072
            r16 = r2
            goto L_0x0078
        L_0x0072:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r16 = r0
        L_0x0078:
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r1 == 0) goto L_0x0082
            r0 = r18
            goto L_0x008a
        L_0x0082:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
        L_0x008a:
            r1 = 5
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 == 0) goto L_0x0094
            r19 = r18
            goto L_0x009e
        L_0x0094:
            long r19 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r19 = r1
        L_0x009e:
            r1 = 6
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 == 0) goto L_0x00a8
            r20 = r18
            goto L_0x00b2
        L_0x00a8:
            long r20 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r20 = r1
        L_0x00b2:
            r1 = 7
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 != 0) goto L_0x00cd
            long r21 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00cb }
            r23 = 1
            int r1 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00c4
            r9 = 1
        L_0x00c4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00cb }
            r21 = r1
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            goto L_0x0125
        L_0x00cd:
            r21 = r18
        L_0x00cf:
            r1 = 8
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 == 0) goto L_0x00d9
            r8 = r2
            goto L_0x00de
        L_0x00d9:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r8 = r1
        L_0x00de:
            com.google.android.gms.measurement.internal.a0 r22 = new com.google.android.gms.measurement.internal.a0     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r1 = r22
            r2 = r26
            r3 = r27
            r10 = r11
            r12 = r16
            r23 = r14
            r14 = r0
            r15 = r19
            r16 = r20
            r17 = r21
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            boolean r0 = r23.moveToNext()     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            if (r0 == 0) goto L_0x010c
            com.google.android.gms.measurement.internal.n4 r0 = r25.zzj()     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.n4.q(r26)     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            r0.b(r1, r2)     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
        L_0x010c:
            r23.close()
            return r22
        L_0x0110:
            r0 = move-exception
            goto L_0x0119
        L_0x0112:
            r0 = move-exception
            r14 = r23
            goto L_0x0125
        L_0x0116:
            r0 = move-exception
            r23 = r14
        L_0x0119:
            r18 = r23
            goto L_0x0149
        L_0x011c:
            r0 = move-exception
            r23 = r14
            goto L_0x0125
        L_0x0120:
            r0 = move-exception
            goto L_0x0149
        L_0x0122:
            r0 = move-exception
            r14 = r18
        L_0x0125:
            com.google.android.gms.measurement.internal.n4 r1 = r25.zzj()     // Catch:{ all -> 0x0146 }
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r26)     // Catch:{ all -> 0x0146 }
            com.google.android.gms.measurement.internal.m4 r4 = r25.d()     // Catch:{ all -> 0x0146 }
            r5 = r27
            java.lang.String r4 = r4.c(r5)     // Catch:{ all -> 0x0146 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x0146 }
            if (r14 == 0) goto L_0x0145
            r14.close()
        L_0x0145:
            return r18
        L_0x0146:
            r0 = move-exception
            r18 = r14
        L_0x0149:
            if (r18 == 0) goto L_0x014e
            r18.close()
        L_0x014e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.x0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.a0");
    }

    public final int y(String str, String str2) {
        q.g(str);
        q.g(str2);
        i();
        p();
        try {
            return w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().B().d("Error deleting conditional property", n4.q(str), d().g(str2), e10);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0127 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x012b A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x015f A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017d A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0180 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018f A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e8 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ea A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0244 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0246 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0264 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0266 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x027e A[Catch:{ SQLiteException -> 0x0293 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.r5 y0(java.lang.String r42) {
        /*
            r41 = this;
            r1 = r42
            com.google.android.gms.common.internal.q.g(r42)
            r41.i()
            r41.p()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r41.w()     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String r33 = "session_stitching_token"
            java.lang.String r34 = "sgtm_upload_enabled"
            java.lang.String r35 = "target_os_version"
            java.lang.String r36 = "session_stitching_token_hash"
            java.lang.String r37 = "ad_services_version"
            java.lang.String r38 = "unmatched_first_open_without_ad_id"
            java.lang.String r39 = "npa_metadata_value"
            java.lang.String r40 = "attribution_eligibility_status"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40}     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0299, all -> 0x0295 }
            if (r4 != 0) goto L_0x0077
            r3.close()
            return r2
        L_0x0077:
            com.google.android.gms.measurement.internal.r5 r4 = new com.google.android.gms.measurement.internal.r5     // Catch:{ SQLiteException -> 0x0299, all -> 0x0295 }
            r5 = r41
            com.google.android.gms.measurement.internal.va r6 = r5.f25029b     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.w5 r6 = r6.d0()     // Catch:{ SQLiteException -> 0x0293 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0293 }
            r4.x(r6)     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0293 }
            r4.M(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.S(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.h0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.j0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.f0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.F(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.B(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.d0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.X(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x00e5
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r6 = 0
            goto L_0x00e6
        L_0x00e5:
            r6 = 1
        L_0x00e6:
            r4.y(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.U(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.O(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.L(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.E(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.A(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.b0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 == 0) goto L_0x012b
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0130
        L_0x012b:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0130:
            r4.c(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.J(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.I(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.R(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.P(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 23
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x0168
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r6 = 0
            goto L_0x0169
        L_0x0168:
            r6 = 1
        L_0x0169:
            r4.g(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 24
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.e(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 25
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 == 0) goto L_0x0180
            r6 = 0
            goto L_0x0184
        L_0x0180:
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0184:
            r4.Z(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 26
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x01a1
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r7 = ","
            r8 = -1
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch:{ SQLiteException -> 0x0293 }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.f(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x01a1:
            boolean r6 = com.google.android.gms.internal.measurement.zzps.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01c8
            com.google.android.gms.measurement.internal.f r6 = r41.a()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.f24541y0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.w(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 != 0) goto L_0x01bf
            com.google.android.gms.measurement.internal.f r6 = r41.a()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.f24537w0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.n(r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01c8
        L_0x01bf:
            r6 = 28
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.V(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x01c8:
            boolean r6 = com.google.android.gms.internal.measurement.zzqd.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01ee
            com.google.android.gms.measurement.internal.f r6 = r41.a()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.A0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.n(r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01ee
            r6 = 29
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x01ea
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01ea
            r6 = 1
            goto L_0x01eb
        L_0x01ea:
            r6 = 0
        L_0x01eb:
            r4.C(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x01ee:
            r6 = 30
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.n0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 31
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.l0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0224
            com.google.android.gms.measurement.internal.f r6 = r41.a()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.L0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.w(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0224
            r6 = 32
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.b(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 35
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.w(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0224:
            boolean r6 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x024a
            com.google.android.gms.measurement.internal.f r6 = r41.a()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.Y0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.w(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x024a
            r6 = 33
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x0246
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0246
            r6 = 1
            goto L_0x0247
        L_0x0246:
            r6 = 0
        L_0x0247:
            r4.G(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x024a:
            boolean r6 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0275
            com.google.android.gms.measurement.internal.f r6 = r41.a()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.T0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.w(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0275
            r6 = 34
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 == 0) goto L_0x0266
            r0 = r2
            goto L_0x0272
        L_0x0266:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x026d
            goto L_0x026e
        L_0x026d:
            r0 = 0
        L_0x026e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0272:
            r4.d(r0)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0275:
            r4.o()     // Catch:{ SQLiteException -> 0x0293 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0293 }
            if (r0 == 0) goto L_0x028f
            com.google.android.gms.measurement.internal.n4 r0 = r41.zzj()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.n4.q(r42)     // Catch:{ SQLiteException -> 0x0293 }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x028f:
            r3.close()
            return r4
        L_0x0293:
            r0 = move-exception
            goto L_0x02a5
        L_0x0295:
            r0 = move-exception
            r5 = r41
            goto L_0x02bd
        L_0x0299:
            r0 = move-exception
            r5 = r41
            goto L_0x02a5
        L_0x029d:
            r0 = move-exception
            r5 = r41
            goto L_0x02be
        L_0x02a1:
            r0 = move-exception
            r5 = r41
            r3 = r2
        L_0x02a5:
            com.google.android.gms.measurement.internal.n4 r4 = r41.zzj()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.p4 r4 = r4.B()     // Catch:{ all -> 0x02bc }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.n4.q(r42)     // Catch:{ all -> 0x02bc }
            r4.c(r6, r1, r0)     // Catch:{ all -> 0x02bc }
            if (r3 == 0) goto L_0x02bb
            r3.close()
        L_0x02bb:
            return r2
        L_0x02bc:
            r0 = move-exception
        L_0x02bd:
            r2 = r3
        L_0x02be:
            if (r2 == 0) goto L_0x02c3
            r2.close()
        L_0x02c3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.y0(java.lang.String):com.google.android.gms.measurement.internal.r5");
    }

    public final long z(zzfi.zzj zzj) throws IOException {
        i();
        p();
        q.k(zzj);
        q.g(zzj.zzx());
        byte[] zzbv = zzj.zzbv();
        long v10 = j().v(zzbv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzj.zzx());
        contentValues.put("metadata_fingerprint", Long.valueOf(v10));
        contentValues.put("metadata", zzbv);
        try {
            w().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return v10;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing raw event metadata. appId", n4.q(zzj.zzx()), e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.o z0(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.q.g(r12)
            r11.i()
            r11.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.w()     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            java.lang.String r4 = "app_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            r10 = 0
            r5[r10] = r12     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0066 }
            if (r2 != 0) goto L_0x0033
            r1.close()
            return r0
        L_0x0033:
            byte[] r2 = r1.getBlob(r10)     // Catch:{ SQLiteException -> 0x0066 }
            java.lang.String r3 = r1.getString(r9)     // Catch:{ SQLiteException -> 0x0066 }
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch:{ SQLiteException -> 0x0066 }
            boolean r5 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0066 }
            if (r5 == 0) goto L_0x0057
            com.google.android.gms.measurement.internal.n4 r5 = r11.zzj()     // Catch:{ SQLiteException -> 0x0066 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch:{ SQLiteException -> 0x0066 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.n4.q(r12)     // Catch:{ SQLiteException -> 0x0066 }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x0066 }
        L_0x0057:
            if (r2 != 0) goto L_0x005d
            r1.close()
            return r0
        L_0x005d:
            com.google.android.gms.measurement.internal.o r5 = new com.google.android.gms.measurement.internal.o     // Catch:{ SQLiteException -> 0x0066 }
            r5.<init>(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0066 }
            r1.close()
            return r5
        L_0x0066:
            r2 = move-exception
            goto L_0x006c
        L_0x0068:
            r12 = move-exception
            goto L_0x0085
        L_0x006a:
            r2 = move-exception
            r1 = r0
        L_0x006c:
            com.google.android.gms.measurement.internal.n4 r3 = r11.zzj()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.n4.q(r12)     // Catch:{ all -> 0x0083 }
            r3.c(r4, r12, r2)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0082
            r1.close()
        L_0x0082:
            return r0
        L_0x0083:
            r12 = move-exception
            r0 = r1
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.close()
        L_0x008a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.z0(java.lang.String):com.google.android.gms.measurement.internal.o");
    }
}
