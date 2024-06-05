package com.startapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;

/* compiled from: Sta */
public class l3 extends y1 {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f16091d = {"rowid", "timestamp", "sdkVersion", "category", "appActivity", "value", "details", "detailsJson", "dParam", "service", "tag"};

    /* renamed from: c  reason: collision with root package name */
    public final List<i2<Void>> f16092c = new LinkedList();

    public l3(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final boolean a(i3 i3Var, m3 m3Var, SQLiteDatabase sQLiteDatabase, Map<String, String> map, long j10) {
        i3 i3Var2 = i3Var;
        m3 m3Var2 = m3Var;
        Map<String, String> map2 = map;
        if (m3Var2.f16131a.size() > 0 && !m3Var2.f16131a.contains(i3Var2.f15914d)) {
            return false;
        }
        if (m3Var2.f16132b.size() > 0 && m3Var2.f16132b.contains(i3Var2.f15914d)) {
            return false;
        }
        if (m3Var2.f16133c.size() > 0 && !m3Var2.f16133c.contains(i3Var2.f15919i)) {
            return false;
        }
        if (m3Var2.f16134d.size() > 0 && m3Var2.f16134d.contains(i3Var2.f15919i)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2.containsKey("sdkVersion")) {
            linkedHashMap.put("sdkVersion", map2.get("sdkVersion"));
        }
        if (map2.containsKey("category")) {
            linkedHashMap.put("category", map2.get("category"));
        }
        for (String next : m3Var2.f16135e) {
            if (map2.containsKey(next)) {
                linkedHashMap.put(next, map2.get(next));
            }
        }
        int size = linkedHashMap.size();
        if (size >= 1) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = new ArrayList(size);
            String str = MaxReward.DEFAULT_LABEL;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                sb2.append(str);
                sb2.append((String) entry.getKey());
                if (entry.getValue() == null) {
                    sb2.append(" IS NULL");
                } else {
                    sb2.append(" = ?");
                    arrayList.add(entry.getValue());
                }
                str = " AND ";
            }
            Pair pair = new Pair(sb2.toString(), arrayList.toArray(new String[0]));
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, (String) null, (String) null, "sendSuccess DESC");
                if (cursor.moveToFirst()) {
                    long j11 = cursor.getLong(0);
                    if (j11 <= 0) {
                        return true;
                    }
                    long j12 = j10 - j11;
                    long j13 = m3Var2.f16136f;
                    if (j13 > 0 && j12 < j13) {
                        a(cursor);
                        return true;
                    }
                }
                a(cursor);
                return false;
            } finally {
                a(cursor);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void b() {
        for (i2<Void> a10 : this.f16092c) {
            a10.a();
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    public static i3 b(Cursor cursor) {
        boolean z10 = false;
        long j10 = cursor.getLong(0);
        long j11 = cursor.getLong(1);
        a(j10, j11);
        String string = cursor.getString(2);
        j3 a10 = j3.a(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        if (cursor.getInt(9) == 1) {
            z10 = true;
        }
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        } else if (a10 != null) {
            Object obj = null;
            if (string5 != null) {
                try {
                    obj = new JSONTokener(string5).nextValue();
                } catch (JSONException unused) {
                }
            }
            i3 i3Var = new i3(a10, j10);
            i3Var.f15918h = Long.valueOf(j11);
            i3Var.f15913c = string;
            i3Var.f15919i = string2;
            i3Var.f15914d = string3;
            i3Var.f15915e = string4;
            i3Var.f15916f = obj;
            i3Var.f15917g = string6;
            i3Var.f15920j = z10;
            i3Var.f15921k = string7;
            return i3Var;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void a(g2<i3, Void> g2Var, int i10, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor cursor = null;
        try {
            cursor = a().query("events", f16091d, "attempt < " + i10 + " AND " + "validTill" + " >= " + currentTimeMillis + " AND " + "sendSuccess" + " = 0  AND " + "send" + " <= " + "sendFailure", (String[]) null, (String) null, (String) null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i11)));
            while (cursor.moveToNext()) {
                g2Var.a(b(cursor));
            }
        } finally {
            a(cursor);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.String[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v4 */
    public boolean a(i3 i3Var, k3 k3Var) {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ? r14;
        String str7;
        String str8;
        i3 i3Var2 = i3Var;
        k3 k3Var2 = k3Var;
        SQLiteDatabase a10 = a();
        a10.beginTransaction();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis + k3Var2.f16023e;
            Long l10 = i3Var2.f15918h;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                i3Var2.f15918h = Long.valueOf(currentTimeMillis);
                j10 = currentTimeMillis;
            }
            Object obj = i3Var2.f15916f;
            String obj2 = obj != null ? obj.toString() : null;
            String str9 = i3Var2.f15913c;
            if (str9 == null) {
                str9 = "4.10.12";
            }
            String str10 = str9;
            List<m3> list = k3Var2.f16025g;
            String str11 = "service";
            String str12 = "dParam";
            String str13 = "detailsJson";
            long j12 = j11;
            String str14 = "details";
            String str15 = "value";
            long j13 = j10;
            String str16 = "events";
            String str17 = "sdkVersion";
            if (list.size() > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put(str17, str10);
                String str18 = str10;
                hashMap.put("category", i3Var2.f15911a.f15965a);
                hashMap.put("appActivity", i3Var2.f15919i);
                hashMap.put(str15, i3Var2.f15914d);
                hashMap.put(str14, i3Var2.f15915e);
                hashMap.put(str13, obj2);
                hashMap.put(str12, i3Var2.f15917g);
                hashMap.put(str11, i3Var2.f15920j ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
                for (m3 a11 : list) {
                    HashMap hashMap2 = hashMap;
                    String str19 = str12;
                    String str20 = str11;
                    String str21 = str13;
                    String str22 = str18;
                    String str23 = obj2;
                    String str24 = str14;
                    String str25 = str15;
                    String str26 = str17;
                    if (a(i3Var, a11, a10, hashMap2, currentTimeMillis)) {
                        a10.endTransaction();
                        return false;
                    }
                    str17 = str26;
                    str14 = str24;
                    str15 = str25;
                    hashMap = hashMap2;
                    str12 = str19;
                    str11 = str20;
                    obj2 = str23;
                    str18 = str22;
                    str13 = str21;
                }
                str4 = str12;
                str2 = str11;
                str = obj2;
                str3 = str13;
                str6 = str14;
                str8 = str18;
                str7 = str17;
                str5 = str15;
                r14 = 0;
            } else {
                str4 = str12;
                str2 = str11;
                str = obj2;
                str3 = str13;
                str6 = str14;
                str5 = str15;
                r14 = 0;
                str8 = str10;
                str7 = str17;
            }
            String str27 = str16;
            a10.delete(str27, "validTill < " + currentTimeMillis, r14);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(j13));
            contentValues.put("validTill", Long.valueOf(j12));
            contentValues.put(str7, str8);
            contentValues.put("category", i3Var2.f15911a.f15965a);
            contentValues.put("appActivity", i3Var2.f15919i);
            contentValues.put(str5, i3Var2.f15914d);
            contentValues.put(str6, i3Var2.f15915e);
            contentValues.put(str3, str);
            contentValues.put(str4, i3Var2.f15917g);
            contentValues.put(str2, Integer.valueOf(i3Var2.f15920j ? 1 : 0));
            contentValues.put("tag", i3Var2.f15921k);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(k3Var.f16021c));
            a10.insertOrThrow(str27, r14, contentValues);
            a10.setTransactionSuccessful();
            a10.endTransaction();
            b();
            return true;
        } catch (Throwable th) {
            a10.endTransaction();
            throw th;
        }
    }

    public static void a(long j10, long j11) {
        if (j10 <= 0) {
            throw new IllegalArgumentException();
        } else if (j11 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int a(SQLiteDatabase sQLiteDatabase, long j10) {
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            cursor = sQLiteDatabase2.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, (String) null);
            if (cursor.moveToFirst()) {
                return cursor.getInt(0);
            }
            throw new IllegalStateException();
        } finally {
            a(cursor);
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
