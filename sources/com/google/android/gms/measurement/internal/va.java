package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzqd;
import com.google.android.gms.measurement.internal.y6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.e;
import o5.c;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public class va implements w6 {
    private static volatile va H;
    private long A;
    private final Map<String, y6> B;
    private final Map<String, v> C;
    private final Map<String, b> D;
    private p8 E;
    private String F;
    private final kb G;

    /* renamed from: a  reason: collision with root package name */
    private i5 f25139a;

    /* renamed from: b  reason: collision with root package name */
    private u4 f25140b;

    /* renamed from: c  reason: collision with root package name */
    private m f25141c;

    /* renamed from: d  reason: collision with root package name */
    private w4 f25142d;

    /* renamed from: e  reason: collision with root package name */
    private pa f25143e;

    /* renamed from: f  reason: collision with root package name */
    private pb f25144f;

    /* renamed from: g  reason: collision with root package name */
    private final db f25145g;

    /* renamed from: h  reason: collision with root package name */
    private n8 f25146h;

    /* renamed from: i  reason: collision with root package name */
    private y9 f25147i;

    /* renamed from: j  reason: collision with root package name */
    private final ta f25148j;

    /* renamed from: k  reason: collision with root package name */
    private g5 f25149k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final w5 f25150l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f25151m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f25152n;

    /* renamed from: o  reason: collision with root package name */
    private long f25153o;

    /* renamed from: p  reason: collision with root package name */
    private List<Runnable> f25154p;

    /* renamed from: q  reason: collision with root package name */
    private final Set<String> f25155q;

    /* renamed from: r  reason: collision with root package name */
    private int f25156r;

    /* renamed from: s  reason: collision with root package name */
    private int f25157s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f25158t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f25159u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f25160v;

    /* renamed from: w  reason: collision with root package name */
    private FileLock f25161w;

    /* renamed from: x  reason: collision with root package name */
    private FileChannel f25162x;

    /* renamed from: y  reason: collision with root package name */
    private List<Long> f25163y;

    /* renamed from: z  reason: collision with root package name */
    private List<Long> f25164z;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    private class a implements q {

        /* renamed from: a  reason: collision with root package name */
        zzfi.zzj f25165a;

        /* renamed from: b  reason: collision with root package name */
        List<Long> f25166b;

        /* renamed from: c  reason: collision with root package name */
        List<zzfi.zze> f25167c;

        /* renamed from: d  reason: collision with root package name */
        private long f25168d;

        private a() {
        }

        private static long c(zzfi.zze zze) {
            return ((zze.zzd() / 1000) / 60) / 60;
        }

        public final void a(zzfi.zzj zzj) {
            q.k(zzj);
            this.f25165a = zzj;
        }

        public final boolean b(long j10, zzfi.zze zze) {
            q.k(zze);
            if (this.f25167c == null) {
                this.f25167c = new ArrayList();
            }
            if (this.f25166b == null) {
                this.f25166b = new ArrayList();
            }
            if (!this.f25167c.isEmpty() && c(this.f25167c.get(0)) != c(zze)) {
                return false;
            }
            long zzbw = this.f25168d + ((long) zze.zzbw());
            va.this.X();
            if (zzbw >= ((long) Math.max(0, e0.f24512k.a(null).intValue()))) {
                return false;
            }
            this.f25168d = zzbw;
            this.f25167c.add(zze);
            this.f25166b.add(Long.valueOf(j10));
            int size = this.f25167c.size();
            va.this.X();
            if (size >= Math.max(1, e0.f24514l.a(null).intValue())) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        final String f25170a;

        /* renamed from: b  reason: collision with root package name */
        long f25171b;

        private b(va vaVar) {
            this(vaVar, vaVar.i0().N0());
        }

        private b(va vaVar, String str) {
            this.f25170a = str;
            this.f25171b = vaVar.zzb().b();
        }
    }

    private va(fb fbVar) {
        this(fbVar, (w5) null);
    }

    private final void A(String str, boolean z10) {
        r5 y02 = Z().y0(str);
        if (y02 != null) {
            y02.G(z10);
            if (y02.s()) {
                Z().Q(y02);
            }
        }
    }

    private final void B(List<Long> list) {
        q.a(!list.isEmpty());
        if (this.f25163y != null) {
            zzj().B().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f25163y = new ArrayList(list);
        }
    }

    private final boolean E(int i10, FileChannel fileChannel) {
        zzl().i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().B().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i10);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                zzj().B().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e10) {
            zzj().B().b("Failed to write to channel", e10);
            return false;
        }
    }

    private final boolean F(zzfi.zze.zza zza, zzfi.zze.zza zza2) {
        String str;
        q.a("_e".equals(zza.zze()));
        h0();
        zzfi.zzg z10 = db.z((zzfi.zze) ((zzix) zza.zzab()), "_sc");
        String str2 = null;
        if (z10 == null) {
            str = null;
        } else {
            str = z10.zzh();
        }
        h0();
        zzfi.zzg z11 = db.z((zzfi.zze) ((zzix) zza2.zzab()), "_pc");
        if (z11 != null) {
            str2 = z11.zzh();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        q.a("_e".equals(zza.zze()));
        h0();
        zzfi.zzg z12 = db.z((zzfi.zze) ((zzix) zza.zzab()), "_et");
        if (z12 == null || !z12.zzl() || z12.zzd() <= 0) {
            return true;
        }
        long zzd = z12.zzd();
        h0();
        zzfi.zzg z13 = db.z((zzfi.zze) ((zzix) zza2.zzab()), "_et");
        if (z13 != null && z13.zzd() > 0) {
            zzd += z13.zzd();
        }
        h0();
        db.M(zza2, "_et", Long.valueOf(zzd));
        h0();
        db.M(zza, "_fr", 1L);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x022e A[SYNTHETIC, Splitter:B:107:0x022e] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0235 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0241 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03ba A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03bc A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03bf A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03c0 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0598 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0663 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x06b5 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0b2f A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0b42 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0b45 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0b6a A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0eac A[SYNTHETIC, Splitter:B:533:0x0eac] */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x0ec0 A[SYNTHETIC, Splitter:B:540:0x0ec0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean G(java.lang.String r41, long r42) {
        /*
            r40 = this;
            r1 = r40
            java.lang.String r2 = "_ai"
            com.google.android.gms.measurement.internal.m r3 = r40.Z()
            r3.L0()
            com.google.android.gms.measurement.internal.va$a r3 = new com.google.android.gms.measurement.internal.va$a     // Catch:{ all -> 0x0ec4 }
            r4 = 0
            r3.<init>()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.m r5 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            long r6 = r1.A     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.common.internal.q.k(r3)     // Catch:{ all -> 0x0ec4 }
            r5.i()     // Catch:{ all -> 0x0ec4 }
            r5.p()     // Catch:{ all -> 0x0ec4 }
            r9 = -1
            r11 = 2
            r12 = 1
            r13 = 0
            android.database.sqlite.SQLiteDatabase r15 = r5.w()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            boolean r14 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r16 = ""
            if (r14 == 0) goto L_0x0085
            int r14 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x0049
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0044 }
            r8[r13] = r17     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r42)     // Catch:{ SQLiteException -> 0x0044 }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0044 }
            goto L_0x0051
        L_0x0044:
            r0 = move-exception
            r6 = r0
            r8 = r4
            goto L_0x021b
        L_0x0049:
            java.lang.String[] r8 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r17 = java.lang.String.valueOf(r42)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r8[r13] = r17     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
        L_0x0051:
            if (r14 == 0) goto L_0x0055
            java.lang.String r16 = "rowid <= ? and "
        L_0x0055:
            r14 = r16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r11 = "select app_id, metadata_fingerprint from raw_events where "
            r4.<init>(r11)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r4.append(r14)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r11 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r11)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            android.database.Cursor r4 = r15.rawQuery(r4, r8)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            boolean r8 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020f }
            if (r8 != 0) goto L_0x0079
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x0079:
            java.lang.String r8 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x020f }
            java.lang.String r11 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x020c }
            r4.close()     // Catch:{ SQLiteException -> 0x020c }
            goto L_0x00cb
        L_0x0085:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0096
            r8 = 2
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r8 = 0
            r11[r13] = r8     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r11[r12] = r8     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            goto L_0x009b
        L_0x0096:
            r8 = 0
            java.lang.String[] r11 = new java.lang.String[]{r8}     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
        L_0x009b:
            if (r4 == 0) goto L_0x009f
            java.lang.String r16 = " and rowid <= ?"
        L_0x009f:
            r4 = r16
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r14 = "select metadata_fingerprint from raw_events where app_id = ?"
            r8.<init>(r14)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r8.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r4 = " order by rowid limit 1;"
            r8.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r4 = r8.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            android.database.Cursor r4 = r15.rawQuery(r4, r11)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            boolean r8 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020f }
            if (r8 != 0) goto L_0x00c3
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x00c3:
            java.lang.String r11 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x020f }
            r4.close()     // Catch:{ SQLiteException -> 0x020f }
            r8 = 0
        L_0x00cb:
            java.lang.String r16 = "raw_events_metadata"
            java.lang.String r14 = "metadata"
            java.lang.String[] r17 = new java.lang.String[]{r14}     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r18 = "app_id = ? and metadata_fingerprint = ?"
            r14 = 2
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x020c }
            r9[r13] = r8     // Catch:{ SQLiteException -> 0x020c }
            r9[r12] = r11     // Catch:{ SQLiteException -> 0x020c }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "2"
            r14 = r15
            r10 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r9
            android.database.Cursor r4 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x020c }
            boolean r9 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020c }
            if (r9 != 0) goto L_0x010e
            com.google.android.gms.measurement.internal.n4 r6 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.p4 r6 = r6.B()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r7 = "Raw event metadata record is missing. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ SQLiteException -> 0x020c }
            r6.b(r7, r9)     // Catch:{ SQLiteException -> 0x020c }
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x010e:
            byte[] r9 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r14 = com.google.android.gms.internal.measurement.zzfi.zzj.zzu()     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.measurement.internal.db.A(r14, r9)     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzkj r9 = r9.zzab()     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = (com.google.android.gms.internal.measurement.zzfi.zzj) r9     // Catch:{ IOException -> 0x01f5 }
            boolean r14 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x020c }
            if (r14 == 0) goto L_0x013b
            com.google.android.gms.measurement.internal.n4 r14 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.p4 r14 = r14.G()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r15 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ SQLiteException -> 0x020c }
            r14.b(r15, r12)     // Catch:{ SQLiteException -> 0x020c }
        L_0x013b:
            r4.close()     // Catch:{ SQLiteException -> 0x020c }
            r3.a(r9)     // Catch:{ SQLiteException -> 0x020c }
            r14 = -1
            int r9 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x015d
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r12 = 3
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x020c }
            r14[r13] = r8     // Catch:{ SQLiteException -> 0x020c }
            r12 = 1
            r14[r12] = r11     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x020c }
            r7 = 2
            r14[r7] = r6     // Catch:{ SQLiteException -> 0x020c }
            r17 = r9
            r18 = r14
            goto L_0x016b
        L_0x015d:
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            r7 = 2
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x020c }
            r9[r13] = r8     // Catch:{ SQLiteException -> 0x020c }
            r7 = 1
            r9[r7] = r11     // Catch:{ SQLiteException -> 0x020c }
            r17 = r6
            r18 = r9
        L_0x016b:
            java.lang.String r15 = "raw_events"
            java.lang.String r6 = "rowid"
            java.lang.String r7 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r11 = "data"
            java.lang.String[] r16 = new java.lang.String[]{r6, r7, r9, r11}     // Catch:{ SQLiteException -> 0x020c }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            r22 = 0
            r14 = r10
            android.database.Cursor r4 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x020c }
            boolean r6 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020c }
            if (r6 != 0) goto L_0x01a2
            com.google.android.gms.measurement.internal.n4 r6 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.p4 r6 = r6.G()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ SQLiteException -> 0x020c }
            r6.b(r7, r9)     // Catch:{ SQLiteException -> 0x020c }
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x01a2:
            long r6 = r4.getLong(r13)     // Catch:{ SQLiteException -> 0x020c }
            r9 = 3
            byte[] r10 = r4.getBlob(r9)     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r9 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch:{ IOException -> 0x01d8 }
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.measurement.internal.db.A(r9, r10)     // Catch:{ IOException -> 0x01d8 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r9     // Catch:{ IOException -> 0x01d8 }
            r10 = 1
            java.lang.String r11 = r4.getString(r10)     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r10 = r9.zza((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x020c }
            r11 = 2
            long r14 = r4.getLong(r11)     // Catch:{ SQLiteException -> 0x020c }
            r10.zzb((long) r14)     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzkj r9 = r9.zzab()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzfi$zze r9 = (com.google.android.gms.internal.measurement.zzfi.zze) r9     // Catch:{ SQLiteException -> 0x020c }
            boolean r6 = r3.b(r6, r9)     // Catch:{ SQLiteException -> 0x020c }
            if (r6 != 0) goto L_0x01eb
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x01d8:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.n4 r7 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.p4 r7 = r7.B()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ SQLiteException -> 0x020c }
            r7.c(r9, r10, r6)     // Catch:{ SQLiteException -> 0x020c }
        L_0x01eb:
            boolean r6 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x020c }
            if (r6 != 0) goto L_0x01a2
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x01f5:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.n4 r7 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.p4 r7 = r7.B()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r9 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ SQLiteException -> 0x020c }
            r7.c(r9, r10, r6)     // Catch:{ SQLiteException -> 0x020c }
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x020c:
            r0 = move-exception
            r6 = r0
            goto L_0x021b
        L_0x020f:
            r0 = move-exception
            r6 = r0
            goto L_0x021a
        L_0x0212:
            r0 = move-exception
            r1 = r0
            r4 = 0
            goto L_0x0ebe
        L_0x0217:
            r0 = move-exception
            r6 = r0
            r4 = 0
        L_0x021a:
            r8 = 0
        L_0x021b:
            com.google.android.gms.measurement.internal.n4 r5 = r5.zzj()     // Catch:{ all -> 0x0ebc }
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch:{ all -> 0x0ebc }
            java.lang.String r7 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ all -> 0x0ebc }
            r5.c(r7, r8, r6)     // Catch:{ all -> 0x0ebc }
            if (r4 == 0) goto L_0x0231
            r4.close()     // Catch:{ all -> 0x0ec4 }
        L_0x0231:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r4 = r3.f25167c     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x023e
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x023c
            goto L_0x023e
        L_0x023c:
            r4 = 0
            goto L_0x023f
        L_0x023e:
            r4 = 1
        L_0x023f:
            if (r4 != 0) goto L_0x0eac
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r4.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r4.zzi()     // Catch:{ all -> 0x0ec4 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
        L_0x0254:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r14 = r3.f25167c     // Catch:{ all -> 0x0ec4 }
            int r14 = r14.size()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = "_fr"
            java.lang.String r13 = "_et"
            java.lang.String r5 = "_e"
            r17 = r9
            java.lang.String r9 = "_c"
            r43 = r10
            r18 = r11
            if (r8 >= r14) goto L_0x0730
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r14 = r3.f25167c     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r14 = r14.get(r8)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r14 = (com.google.android.gms.internal.measurement.zzfi.zze) r14     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r14 = r14.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r14 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r14     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.i5 r10 = r40.c0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ec4 }
            r21 = r8
            java.lang.String r8 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r8 = r10.J(r11, r8)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = "_err"
            if (r8 == 0) goto L_0x030f
            com.google.android.gms.measurement.internal.n4 r5 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.G()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = r9.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.n4.q(r9)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.w5 r11 = r1.f25150l     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.m4 r11 = r11.y()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.c(r13)     // Catch:{ all -> 0x0ec4 }
            r5.c(r8, r9, r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.i5 r5 = r40.c0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r5.S(r8)     // Catch:{ all -> 0x0ec4 }
            if (r5 != 0) goto L_0x02d8
            com.google.android.gms.measurement.internal.i5 r5 = r40.c0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r5.U(r8)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x02d6
            goto L_0x02d8
        L_0x02d6:
            r5 = 0
            goto L_0x02d9
        L_0x02d8:
            r5 = 1
        L_0x02d9:
            if (r5 != 0) goto L_0x02ff
            java.lang.String r5 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r10.equals(r5)     // Catch:{ all -> 0x0ec4 }
            if (r5 != 0) goto L_0x02ff
            r40.i0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.kb r5 = r1.G     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r24 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            r25 = 11
            java.lang.String r26 = "_ev"
            java.lang.String r27 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            r28 = 0
            r23 = r5
            com.google.android.gms.measurement.internal.ib.T(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0ec4 }
        L_0x02ff:
            r23 = r2
            r8 = r7
            r9 = r17
            r11 = r18
            r13 = r21
            r10 = 3
            r2 = r43
            r7 = r4
            r4 = -1
            goto L_0x0725
        L_0x030f:
            java.lang.String r8 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r5.r.a(r2)     // Catch:{ all -> 0x0ec4 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0ec4 }
            if (r8 == 0) goto L_0x0381
            r14.zza((java.lang.String) r2)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.n4 r8 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r8 = r8.F()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "Renaming ad_impression to _ai"
            r8.a(r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.n4 r8 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            r11 = 5
            boolean r8 = r8.x(r11)     // Catch:{ all -> 0x0ec4 }
            if (r8 == 0) goto L_0x0381
            r8 = 0
        L_0x0339:
            int r11 = r14.zza()     // Catch:{ all -> 0x0ec4 }
            if (r8 >= r11) goto L_0x0381
            java.lang.String r11 = "ad_platform"
            com.google.android.gms.internal.measurement.zzfi$zzg r22 = r14.zzb((int) r8)     // Catch:{ all -> 0x0ec4 }
            r23 = r2
            java.lang.String r2 = r22.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x037c
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = r14.zzb((int) r8)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzh()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0ec4 }
            if (r2 != 0) goto L_0x037c
            java.lang.String r2 = "admob"
            com.google.android.gms.internal.measurement.zzfi$zzg r11 = r14.zzb((int) r8)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zzh()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.equalsIgnoreCase(r11)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x037c
            com.google.android.gms.measurement.internal.n4 r2 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r2 = r2.H()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "AdMob ad impression logged from app. Potentially duplicative."
            r2.a(r11)     // Catch:{ all -> 0x0ec4 }
        L_0x037c:
            int r8 = r8 + 1
            r2 = r23
            goto L_0x0339
        L_0x0381:
            r23 = r2
            com.google.android.gms.measurement.internal.i5 r2 = r40.c0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.H(r8, r11)     // Catch:{ all -> 0x0ec4 }
            if (r2 != 0) goto L_0x03c9
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.common.internal.q.g(r8)     // Catch:{ all -> 0x0ec4 }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0ec4 }
            r22 = r6
            r6 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r6) goto L_0x03ad
            goto L_0x03b7
        L_0x03ad:
            java.lang.String r6 = "_ui"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x03b7
            r6 = 0
            goto L_0x03b8
        L_0x03b7:
            r6 = -1
        L_0x03b8:
            if (r6 == 0) goto L_0x03bc
            r6 = 0
            goto L_0x03bd
        L_0x03bc:
            r6 = 1
        L_0x03bd:
            if (r6 == 0) goto L_0x03c0
            goto L_0x03cb
        L_0x03c0:
            r25 = r4
            r8 = r7
            r26 = r12
            r24 = r13
            goto L_0x0596
        L_0x03c9:
            r22 = r6
        L_0x03cb:
            r24 = r13
            r6 = 0
            r8 = 0
            r11 = 0
        L_0x03d0:
            int r13 = r14.zza()     // Catch:{ all -> 0x0ec4 }
            r25 = r4
            java.lang.String r4 = "_r"
            if (r6 >= r13) goto L_0x043a
            com.google.android.gms.internal.measurement.zzfi$zzg r13 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0ec4 }
            if (r13 == 0) goto L_0x0407
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r4.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r4     // Catch:{ all -> 0x0ec4 }
            r26 = r12
            r12 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = r4.zza((long) r12)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r4 = r4.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = (com.google.android.gms.internal.measurement.zzfi.zzg) r4     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zzg) r4)     // Catch:{ all -> 0x0ec4 }
            r8 = 1
            goto L_0x0433
        L_0x0407:
            r26 = r12
            com.google.android.gms.internal.measurement.zzfi$zzg r12 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r12.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r4 = r4.equals(r12)     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0433
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r4.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r4     // Catch:{ all -> 0x0ec4 }
            r11 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = r4.zza((long) r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r4 = r4.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = (com.google.android.gms.internal.measurement.zzfi.zzg) r4     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zzg) r4)     // Catch:{ all -> 0x0ec4 }
            r11 = 1
        L_0x0433:
            int r6 = r6 + 1
            r4 = r25
            r12 = r26
            goto L_0x03d0
        L_0x043a:
            r26 = r12
            if (r8 != 0) goto L_0x046c
            if (r2 == 0) goto L_0x046c
            com.google.android.gms.measurement.internal.n4 r6 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r6 = r6.F()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.w5 r12 = r1.f25150l     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.m4 r12 = r12.y()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r12.c(r13)     // Catch:{ all -> 0x0ec4 }
            r6.b(r8, r12)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r9)     // Catch:{ all -> 0x0ec4 }
            r12 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((long) r12)     // Catch:{ all -> 0x0ec4 }
            r14.zza((com.google.android.gms.internal.measurement.zzfi.zzg.zza) r6)     // Catch:{ all -> 0x0ec4 }
        L_0x046c:
            if (r11 != 0) goto L_0x049a
            com.google.android.gms.measurement.internal.n4 r6 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r6 = r6.F()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.w5 r11 = r1.f25150l     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.m4 r11 = r11.y()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.c(r12)     // Catch:{ all -> 0x0ec4 }
            r6.b(r8, r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r4)     // Catch:{ all -> 0x0ec4 }
            r11 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((long) r11)     // Catch:{ all -> 0x0ec4 }
            r14.zza((com.google.android.gms.internal.measurement.zzfi.zzg.zza) r6)     // Catch:{ all -> 0x0ec4 }
        L_0x049a:
            com.google.android.gms.measurement.internal.m r27 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            long r28 = r40.p0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r30 = r6.zzx()     // Catch:{ all -> 0x0ec4 }
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 1
            com.google.android.gms.measurement.internal.n r6 = r27.E(r28, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0ec4 }
            long r11 = r6.f24842e     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.f r6 = r40.X()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            int r6 = r6.v(r8)     // Catch:{ all -> 0x0ec4 }
            r8 = r7
            long r6 = (long) r6     // Catch:{ all -> 0x0ec4 }
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x04d0
            k(r14, r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x04d2
        L_0x04d0:
            r17 = 1
        L_0x04d2:
            java.lang.String r4 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r4 = com.google.android.gms.measurement.internal.ib.E0(r4)     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0596
            if (r2 == 0) goto L_0x0596
            com.google.android.gms.measurement.internal.m r27 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            long r28 = r40.p0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r30 = r4.zzx()     // Catch:{ all -> 0x0ec4 }
            r31 = 0
            r32 = 0
            r33 = 1
            r34 = 0
            r35 = 0
            com.google.android.gms.measurement.internal.n r4 = r27.E(r28, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0ec4 }
            long r6 = r4.f24840c     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.f r4 = r40.X()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.e0.f24522p     // Catch:{ all -> 0x0ec4 }
            int r4 = r4.p(r11, r12)     // Catch:{ all -> 0x0ec4 }
            long r11 = (long) r4     // Catch:{ all -> 0x0ec4 }
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0596
            com.google.android.gms.measurement.internal.n4 r4 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r7 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.n4.q(r7)     // Catch:{ all -> 0x0ec4 }
            r4.b(r6, r7)     // Catch:{ all -> 0x0ec4 }
            r4 = -1
            r6 = 0
            r7 = 0
            r11 = 0
        L_0x052c:
            int r12 = r14.zza()     // Catch:{ all -> 0x0ec4 }
            if (r6 >= r12) goto L_0x0557
            com.google.android.gms.internal.measurement.zzfi$zzg r12 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = r12.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0ec4 }
            if (r13 == 0) goto L_0x0549
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r12.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r4     // Catch:{ all -> 0x0ec4 }
            r7 = r4
            r4 = r6
            goto L_0x0554
        L_0x0549:
            java.lang.String r12 = r12.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r12 = r10.equals(r12)     // Catch:{ all -> 0x0ec4 }
            if (r12 == 0) goto L_0x0554
            r11 = 1
        L_0x0554:
            int r6 = r6 + 1
            goto L_0x052c
        L_0x0557:
            if (r11 == 0) goto L_0x055f
            if (r7 == 0) goto L_0x055f
            r14.zza((int) r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0596
        L_0x055f:
            if (r7 == 0) goto L_0x057f
            java.lang.Object r6 = r7.clone()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r6 = (com.google.android.gms.internal.measurement.zzix.zzb) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r10)     // Catch:{ all -> 0x0ec4 }
            r10 = 10
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((long) r10)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r6 = r6.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r6 = (com.google.android.gms.internal.measurement.zzix) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = (com.google.android.gms.internal.measurement.zzfi.zzg) r6     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r4, (com.google.android.gms.internal.measurement.zzfi.zzg) r6)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0596
        L_0x057f:
            com.google.android.gms.measurement.internal.n4 r4 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r4 = r4.B()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r7 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.n4.q(r7)     // Catch:{ all -> 0x0ec4 }
            r4.b(r6, r7)     // Catch:{ all -> 0x0ec4 }
        L_0x0596:
            if (r2 == 0) goto L_0x0655
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0ec4 }
            java.util.List r4 = r14.zzf()     // Catch:{ all -> 0x0ec4 }
            r2.<init>(r4)     // Catch:{ all -> 0x0ec4 }
            r4 = 0
            r6 = -1
            r7 = -1
        L_0x05a4:
            int r10 = r2.size()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "currency"
            java.lang.String r12 = "value"
            if (r4 >= r10) goto L_0x05d4
            java.lang.Object r10 = r2.get(r4)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r10 = (com.google.android.gms.internal.measurement.zzfi.zzg) r10     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r10 = r12.equals(r10)     // Catch:{ all -> 0x0ec4 }
            if (r10 == 0) goto L_0x05c0
            r6 = r4
            goto L_0x05d1
        L_0x05c0:
            java.lang.Object r10 = r2.get(r4)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r10 = (com.google.android.gms.internal.measurement.zzfi.zzg) r10     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0ec4 }
            if (r10 == 0) goto L_0x05d1
            r7 = r4
        L_0x05d1:
            int r4 = r4 + 1
            goto L_0x05a4
        L_0x05d4:
            r4 = -1
            if (r6 == r4) goto L_0x0656
            java.lang.Object r4 = r2.get(r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = (com.google.android.gms.internal.measurement.zzfi.zzg) r4     // Catch:{ all -> 0x0ec4 }
            boolean r4 = r4.zzl()     // Catch:{ all -> 0x0ec4 }
            if (r4 != 0) goto L_0x0608
            java.lang.Object r4 = r2.get(r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = (com.google.android.gms.internal.measurement.zzfi.zzg) r4     // Catch:{ all -> 0x0ec4 }
            boolean r4 = r4.zzj()     // Catch:{ all -> 0x0ec4 }
            if (r4 != 0) goto L_0x0608
            com.google.android.gms.measurement.internal.n4 r2 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r2 = r2.H()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Value must be specified with a numeric type."
            r2.a(r4)     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r6)     // Catch:{ all -> 0x0ec4 }
            k(r14, r9)     // Catch:{ all -> 0x0ec4 }
            r2 = 18
            j(r14, r2, r12)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0655
        L_0x0608:
            r4 = -1
            if (r7 != r4) goto L_0x060e
            r2 = 1
            r10 = 3
            goto L_0x063a
        L_0x060e:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = (com.google.android.gms.internal.measurement.zzfi.zzg) r2     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzh()     // Catch:{ all -> 0x0ec4 }
            int r7 = r2.length()     // Catch:{ all -> 0x0ec4 }
            r10 = 3
            if (r7 == r10) goto L_0x0621
        L_0x061f:
            r2 = 1
            goto L_0x063a
        L_0x0621:
            r7 = 0
        L_0x0622:
            int r12 = r2.length()     // Catch:{ all -> 0x0ec4 }
            if (r7 >= r12) goto L_0x0639
            int r12 = r2.codePointAt(r7)     // Catch:{ all -> 0x0ec4 }
            boolean r13 = java.lang.Character.isLetter(r12)     // Catch:{ all -> 0x0ec4 }
            if (r13 != 0) goto L_0x0633
            goto L_0x061f
        L_0x0633:
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0ec4 }
            int r7 = r7 + r12
            goto L_0x0622
        L_0x0639:
            r2 = 0
        L_0x063a:
            if (r2 == 0) goto L_0x0657
            com.google.android.gms.measurement.internal.n4 r2 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r2 = r2.H()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r7)     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r6)     // Catch:{ all -> 0x0ec4 }
            k(r14, r9)     // Catch:{ all -> 0x0ec4 }
            r2 = 19
            j(r14, r2, r11)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0657
        L_0x0655:
            r4 = -1
        L_0x0656:
            r10 = 3
        L_0x0657:
            java.lang.String r2 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0ec4 }
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x06b5
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r2 = r14.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = com.google.android.gms.measurement.internal.db.z(r2, r15)     // Catch:{ all -> 0x0ec4 }
            if (r2 != 0) goto L_0x06b0
            if (r8 == 0) goto L_0x06a5
            long r11 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            long r19 = r14.zzc()     // Catch:{ all -> 0x0ec4 }
            long r11 = r11 - r19
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0ec4 }
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x06a5
            java.lang.Object r2 = r8.clone()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r2 = (com.google.android.gms.internal.measurement.zzix.zzb) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r1.F(r14, r2)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x06a5
            r7 = r25
            r9 = r26
            r7.zza((int) r9, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2)     // Catch:{ all -> 0x0ec4 }
            r12 = r9
            r11 = r18
        L_0x06a0:
            r8 = 0
            r22 = 0
            goto L_0x070d
        L_0x06a5:
            r7 = r25
            r9 = r26
            r11 = r43
            r12 = r9
            r22 = r14
            goto L_0x070d
        L_0x06b0:
            r7 = r25
            r9 = r26
            goto L_0x0709
        L_0x06b5:
            r7 = r25
            r9 = r26
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0709
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r2 = r14.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ all -> 0x0ec4 }
            r11 = r24
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = com.google.android.gms.measurement.internal.db.z(r2, r11)     // Catch:{ all -> 0x0ec4 }
            if (r2 != 0) goto L_0x0709
            if (r22 == 0) goto L_0x0702
            long r11 = r22.zzc()     // Catch:{ all -> 0x0ec4 }
            long r19 = r14.zzc()     // Catch:{ all -> 0x0ec4 }
            long r11 = r11 - r19
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0ec4 }
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0702
            java.lang.Object r2 = r22.clone()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r2 = (com.google.android.gms.internal.measurement.zzix.zzb) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r1.F(r2, r14)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x0702
            r5 = r18
            r7.zza((int) r5, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2)     // Catch:{ all -> 0x0ec4 }
            r11 = r5
            r12 = r9
            goto L_0x06a0
        L_0x0702:
            r5 = r18
            r12 = r43
            r11 = r5
            r8 = r14
            goto L_0x070d
        L_0x0709:
            r5 = r18
            r11 = r5
            r12 = r9
        L_0x070d:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r2 = r3.f25167c     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r5 = r14.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r5 = (com.google.android.gms.internal.measurement.zzix) r5     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r5 = (com.google.android.gms.internal.measurement.zzfi.zze) r5     // Catch:{ all -> 0x0ec4 }
            r13 = r21
            r2.set(r13, r5)     // Catch:{ all -> 0x0ec4 }
            int r2 = r43 + 1
            r7.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14)     // Catch:{ all -> 0x0ec4 }
            r9 = r17
            r6 = r22
        L_0x0725:
            int r5 = r13 + 1
            r10 = r2
            r4 = r7
            r7 = r8
            r2 = r23
            r13 = 0
            r8 = r5
            goto L_0x0254
        L_0x0730:
            r7 = r4
            r11 = r13
            r12 = 0
            r10 = r43
            r36 = r12
            r2 = 0
        L_0x0739:
            if (r2 >= r10) goto L_0x078f
            com.google.android.gms.internal.measurement.zzfi$zze r4 = r7.zza((int) r2)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = r4.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r6 = r5.equals(r6)     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x075a
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = com.google.android.gms.measurement.internal.db.z(r4, r15)     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x075a
            r7.zzb((int) r2)     // Catch:{ all -> 0x0ec4 }
            int r10 = r10 + -1
            int r2 = r2 + -1
            goto L_0x078a
        L_0x075a:
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = com.google.android.gms.measurement.internal.db.z(r4, r11)     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0786
            boolean r6 = r4.zzl()     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x0772
            long r21 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r4 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0773
        L_0x0772:
            r4 = 0
        L_0x0773:
            if (r4 == 0) goto L_0x0786
            long r21 = r4.longValue()     // Catch:{ all -> 0x0ec4 }
            int r6 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x0786
            long r21 = r4.longValue()     // Catch:{ all -> 0x0ec4 }
            r12 = r36
            long r36 = r12 + r21
            goto L_0x078a
        L_0x0786:
            r12 = r36
            r36 = r12
        L_0x078a:
            r4 = 1
            int r2 = r2 + r4
            r12 = 0
            goto L_0x0739
        L_0x078f:
            r12 = r36
            r2 = 0
            r1.l(r7, r12, r2)     // Catch:{ all -> 0x0ec4 }
            java.util.List r2 = r7.zzw()     // Catch:{ all -> 0x0ec4 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ec4 }
        L_0x079d:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x07b7
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r4 = (com.google.android.gms.internal.measurement.zzfi.zze) r4     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = "_s"
            java.lang.String r4 = r4.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x079d
            r2 = 1
            goto L_0x07b8
        L_0x07b7:
            r2 = 0
        L_0x07b8:
            java.lang.String r4 = "_se"
            if (r2 == 0) goto L_0x07c7
            com.google.android.gms.measurement.internal.m r2 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r7.zzr()     // Catch:{ all -> 0x0ec4 }
            r2.G0(r5, r4)     // Catch:{ all -> 0x0ec4 }
        L_0x07c7:
            java.lang.String r2 = "_sid"
            int r2 = com.google.android.gms.measurement.internal.db.t(r7, r2)     // Catch:{ all -> 0x0ec4 }
            if (r2 < 0) goto L_0x07d1
            r2 = 1
            goto L_0x07d2
        L_0x07d1:
            r2 = 0
        L_0x07d2:
            if (r2 == 0) goto L_0x07d9
            r2 = 1
            r1.l(r7, r12, r2)     // Catch:{ all -> 0x0ec4 }
            goto L_0x07f9
        L_0x07d9:
            int r2 = com.google.android.gms.measurement.internal.db.t(r7, r4)     // Catch:{ all -> 0x0ec4 }
            if (r2 < 0) goto L_0x07f9
            r7.zzc((int) r2)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.n4 r2 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.n4.q(r5)     // Catch:{ all -> 0x0ec4 }
            r2.b(r4, r5)     // Catch:{ all -> 0x0ec4 }
        L_0x07f9:
            com.google.android.gms.measurement.internal.db r2 = r40.h0()     // Catch:{ all -> 0x0ec4 }
            r2.O(r7)     // Catch:{ all -> 0x0ec4 }
            boolean r2 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0847
            com.google.android.gms.measurement.internal.f r2 = r40.X()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.e0.T0     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.n(r4)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0847
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.q5 r4 = r40.zzl()     // Catch:{ all -> 0x0ec4 }
            r4.i()     // Catch:{ all -> 0x0ec4 }
            r40.k0()     // Catch:{ all -> 0x0ec4 }
            boolean r4 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0847
            com.google.android.gms.measurement.internal.m r4 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.r5 r4 = r4.y0(r2)     // Catch:{ all -> 0x0ec4 }
            if (r4 != 0) goto L_0x0844
            com.google.android.gms.measurement.internal.n4 r4 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r4 = r4.B()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = "Cannot fix consent fields without appInfo. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.n4.q(r2)     // Catch:{ all -> 0x0ec4 }
            r4.b(r5, r2)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0847
        L_0x0844:
            r1.q(r4, r7)     // Catch:{ all -> 0x0ec4 }
        L_0x0847:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = r7.zzi((long) r4)     // Catch:{ all -> 0x0ec4 }
            r4 = -9223372036854775808
            r2.zze((long) r4)     // Catch:{ all -> 0x0ec4 }
            r2 = 0
        L_0x0856:
            int r4 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r2 >= r4) goto L_0x0889
            com.google.android.gms.internal.measurement.zzfi$zze r4 = r7.zza((int) r2)     // Catch:{ all -> 0x0ec4 }
            long r5 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            long r10 = r7.zzd()     // Catch:{ all -> 0x0ec4 }
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0873
            long r5 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            r7.zzi((long) r5)     // Catch:{ all -> 0x0ec4 }
        L_0x0873:
            long r5 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            long r10 = r7.zzc()     // Catch:{ all -> 0x0ec4 }
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0886
            long r4 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            r7.zze((long) r4)     // Catch:{ all -> 0x0ec4 }
        L_0x0886:
            int r2 = r2 + 1
            goto L_0x0856
        L_0x0889:
            r7.zzq()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            com.google.android.gms.measurement.internal.f r2 = r40.X()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.e0.L0     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.w(r4, r5)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            r40.i0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzx()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = com.google.android.gms.measurement.internal.ib.y0(r2)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.y6 r2 = r1.L(r2)     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.x()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.zzar()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            r2 = 0
        L_0x08cc:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r4 = r3.f25167c     // Catch:{ all -> 0x0ec4 }
            int r4 = r4.size()     // Catch:{ all -> 0x0ec4 }
            if (r2 >= r4) goto L_0x09bb
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r4 = r3.f25167c     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r4 = (com.google.android.gms.internal.measurement.zzfi.zze) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r4.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r4     // Catch:{ all -> 0x0ec4 }
            java.util.List r5 = r4.zzf()     // Catch:{ all -> 0x0ec4 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0ec4 }
        L_0x08ea:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x0902
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = (com.google.android.gms.internal.measurement.zzfi.zzg) r6     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = r6.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x08ea
            r5 = 1
            goto L_0x0903
        L_0x0902:
            r5 = 0
        L_0x0903:
            if (r5 == 0) goto L_0x09b7
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            int r5 = r5.zza()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.f r6 = r40.X()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.e0.X     // Catch:{ all -> 0x0ec4 }
            int r6 = r6.p(r8, r10)     // Catch:{ all -> 0x0ec4 }
            if (r5 < r6) goto L_0x09ac
            com.google.android.gms.measurement.internal.f r5 = r40.X()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.e0.N0     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r5.w(r6, r8)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x0951
            com.google.android.gms.measurement.internal.ib r5 = r40.i0()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r5.N0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "_tu"
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zzb(r5)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r6 = r6.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r6 = (com.google.android.gms.internal.measurement.zzix) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = (com.google.android.gms.internal.measurement.zzfi.zzg) r6     // Catch:{ all -> 0x0ec4 }
            r4.zza((com.google.android.gms.internal.measurement.zzfi.zzg) r6)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0952
        L_0x0951:
            r5 = 0
        L_0x0952:
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "_tr"
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ec4 }
            r10 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((long) r10)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r6 = r6.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r6 = (com.google.android.gms.internal.measurement.zzix) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = (com.google.android.gms.internal.measurement.zzfi.zzg) r6     // Catch:{ all -> 0x0ec4 }
            r4.zza((com.google.android.gms.internal.measurement.zzfi.zzg) r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.db r6 = r40.h0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.na r5 = r6.C(r8, r10, r4, r5)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x09ac
            com.google.android.gms.measurement.internal.n4 r6 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r6 = r6.F()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "Generated trigger URI. appId, uri"
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = r10.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r5.f24870a     // Catch:{ all -> 0x0ec4 }
            r6.c(r8, r10, r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.m r6 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            r6.d0(r8, r5)     // Catch:{ all -> 0x0ec4 }
            java.util.Set<java.lang.String> r5 = r1.f25155q     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ec4 }
            r5.add(r6)     // Catch:{ all -> 0x0ec4 }
        L_0x09ac:
            com.google.android.gms.internal.measurement.zzkj r4 = r4.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r4 = (com.google.android.gms.internal.measurement.zzfi.zze) r4     // Catch:{ all -> 0x0ec4 }
            r7.zza((int) r2, (com.google.android.gms.internal.measurement.zzfi.zze) r4)     // Catch:{ all -> 0x0ec4 }
        L_0x09b7:
            int r2 = r2 + 1
            goto L_0x08cc
        L_0x09bb:
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = r7.zzf()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.pb r8 = r40.S()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = r7.zzr()     // Catch:{ all -> 0x0ec4 }
            java.util.List r10 = r7.zzw()     // Catch:{ all -> 0x0ec4 }
            java.util.List r11 = r7.zzx()     // Catch:{ all -> 0x0ec4 }
            long r4 = r7.zzd()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r12 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ec4 }
            long r4 = r7.zzc()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r13 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ec4 }
            java.util.List r4 = r8.u(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0ec4 }
            r2.zza((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfi.zzc>) r4)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.f r2 = r40.X()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.G(r4)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0d28
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0ec4 }
            r2.<init>()     // Catch:{ all -> 0x0ec4 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0ec4 }
            r4.<init>()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.ib r5 = r40.i0()     // Catch:{ all -> 0x0ec4 }
            java.security.SecureRandom r5 = r5.P0()     // Catch:{ all -> 0x0ec4 }
            r6 = 0
        L_0x0a09:
            int r8 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r6 >= r8) goto L_0x0cef
            com.google.android.gms.internal.measurement.zzfi$zze r8 = r7.zza((int) r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r8 = r8.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r8 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0aa7
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r9 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r9 = (com.google.android.gms.internal.measurement.zzfi.zze) r9     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.db.Z(r9, r11)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.a0 r11 = (com.google.android.gms.measurement.internal.a0) r11     // Catch:{ all -> 0x0ec4 }
            if (r11 != 0) goto L_0x0a5b
            com.google.android.gms.measurement.internal.m r11 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r12 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r13 = com.google.android.gms.common.internal.q.k(r9)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.a0 r11 = r11.x0(r12, r13)     // Catch:{ all -> 0x0ec4 }
            if (r11 == 0) goto L_0x0a5b
            r2.put(r9, r11)     // Catch:{ all -> 0x0ec4 }
        L_0x0a5b:
            if (r11 == 0) goto L_0x0a9a
            java.lang.Long r9 = r11.f24345i     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0a9a
            java.lang.Long r9 = r11.f24346j     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0a77
            long r12 = r9.longValue()     // Catch:{ all -> 0x0ec4 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0a77
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r9 = r11.f24346j     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.db.M(r8, r10, r9)     // Catch:{ all -> 0x0ec4 }
        L_0x0a77:
            java.lang.Boolean r9 = r11.f24347k     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0a8f
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0a8f
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.db.M(r8, r9, r12)     // Catch:{ all -> 0x0ec4 }
        L_0x0a8f:
            com.google.android.gms.internal.measurement.zzkj r9 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r9 = (com.google.android.gms.internal.measurement.zzfi.zze) r9     // Catch:{ all -> 0x0ec4 }
            r4.add(r9)     // Catch:{ all -> 0x0ec4 }
        L_0x0a9a:
            r7.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8)     // Catch:{ all -> 0x0ec4 }
        L_0x0a9d:
            r18 = r3
            r43 = r5
            r1 = r6
            r5 = 1
            r3 = r2
            goto L_0x0ce3
        L_0x0aa7:
            com.google.android.gms.measurement.internal.i5 r9 = r40.c0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ec4 }
            long r11 = r9.t(r11)     // Catch:{ all -> 0x0ec4 }
            r40.i0()     // Catch:{ all -> 0x0ec4 }
            long r13 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            long r13 = com.google.android.gms.measurement.internal.ib.t(r13, r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r9 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r9 = (com.google.android.gms.internal.measurement.zzfi.zze) r9     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = "_dbg"
            r18 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0ec4 }
            boolean r18 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0ec4 }
            if (r18 != 0) goto L_0x0b2c
            if (r1 != 0) goto L_0x0ad9
            goto L_0x0b2c
        L_0x0ad9:
            java.util.List r9 = r9.zzh()     // Catch:{ all -> 0x0ec4 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0ec4 }
        L_0x0ae1:
            boolean r18 = r9.hasNext()     // Catch:{ all -> 0x0ec4 }
            if (r18 == 0) goto L_0x0b2c
            java.lang.Object r18 = r9.next()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r18 = (com.google.android.gms.internal.measurement.zzfi.zzg) r18     // Catch:{ all -> 0x0ec4 }
            r43 = r9
            java.lang.String r9 = r18.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0b29
            long r21 = r18.zzd()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r9 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0ec4 }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0b27
            boolean r9 = r1 instanceof java.lang.String     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0b15
            java.lang.String r9 = r18.zzh()     // Catch:{ all -> 0x0ec4 }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0b27
        L_0x0b15:
            boolean r9 = r1 instanceof java.lang.Double     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0b2c
            double r21 = r18.zza()     // Catch:{ all -> 0x0ec4 }
            java.lang.Double r9 = java.lang.Double.valueOf(r21)     // Catch:{ all -> 0x0ec4 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0b2c
        L_0x0b27:
            r1 = 1
            goto L_0x0b2d
        L_0x0b29:
            r9 = r43
            goto L_0x0ae1
        L_0x0b2c:
            r1 = 0
        L_0x0b2d:
            if (r1 != 0) goto L_0x0b42
            com.google.android.gms.measurement.internal.i5 r1 = r40.c0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = r9.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            int r1 = r1.D(r9, r15)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0b43
        L_0x0b42:
            r1 = 1
        L_0x0b43:
            if (r1 > 0) goto L_0x0b6a
            com.google.android.gms.measurement.internal.n4 r9 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.G()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ec4 }
            r9.c(r10, r11, r1)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r1 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ec4 }
            r4.add(r1)     // Catch:{ all -> 0x0ec4 }
            r7.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0a9d
        L_0x0b6a:
            java.lang.String r9 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r9 = r2.get(r9)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.a0 r9 = (com.google.android.gms.measurement.internal.a0) r9     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0bc9
            com.google.android.gms.measurement.internal.m r9 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r15 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = r15.zzx()     // Catch:{ all -> 0x0ec4 }
            r21 = r11
            java.lang.String r11 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.a0 r9 = r9.x0(r15, r11)     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0bcb
            com.google.android.gms.measurement.internal.n4 r9 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.G()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzfi$zzj r12 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            r9.c(r11, r12, r15)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.a0 r9 = new com.google.android.gms.measurement.internal.a0     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r3.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r24 = r11.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r25 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            r26 = 1
            r28 = 1
            r30 = 1
            long r32 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r23 = r9
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0bcb
        L_0x0bc9:
            r21 = r11
        L_0x0bcb:
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r11 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r11 = (com.google.android.gms.internal.measurement.zzix) r11     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r11 = (com.google.android.gms.internal.measurement.zzfi.zze) r11     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.db.Z(r11, r12)     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0ec4 }
            if (r11 == 0) goto L_0x0be2
            r12 = 1
            goto L_0x0be3
        L_0x0be2:
            r12 = 0
        L_0x0be3:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0ec4 }
            r15 = 1
            if (r1 != r15) goto L_0x0c18
            com.google.android.gms.internal.measurement.zzkj r1 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ec4 }
            r4.add(r1)     // Catch:{ all -> 0x0ec4 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0c13
            java.lang.Long r1 = r9.f24345i     // Catch:{ all -> 0x0ec4 }
            if (r1 != 0) goto L_0x0c07
            java.lang.Long r1 = r9.f24346j     // Catch:{ all -> 0x0ec4 }
            if (r1 != 0) goto L_0x0c07
            java.lang.Boolean r1 = r9.f24347k     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0c13
        L_0x0c07:
            r1 = 0
            com.google.android.gms.measurement.internal.a0 r9 = r9.c(r1, r1, r1)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r1 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            r2.put(r1, r9)     // Catch:{ all -> 0x0ec4 }
        L_0x0c13:
            r7.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0a9d
        L_0x0c18:
            int r15 = r5.nextInt(r1)     // Catch:{ all -> 0x0ec4 }
            if (r15 != 0) goto L_0x0c5d
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            r43 = r5
            r15 = r6
            long r5 = (long) r1     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.db.M(r8, r10, r1)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r1 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ec4 }
            r4.add(r1)     // Catch:{ all -> 0x0ec4 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0c46
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ec4 }
            r5 = 0
            com.google.android.gms.measurement.internal.a0 r9 = r9.c(r5, r1, r5)     // Catch:{ all -> 0x0ec4 }
        L_0x0c46:
            java.lang.String r1 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            long r5 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.a0 r5 = r9.b(r5, r13)     // Catch:{ all -> 0x0ec4 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0ec4 }
            r18 = r3
            r1 = r15
            r5 = 1
            r3 = r2
            goto L_0x0ce0
        L_0x0c5d:
            r43 = r5
            r15 = r6
            java.lang.Long r5 = r9.f24344h     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x0c6d
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ec4 }
            r23 = r2
            r18 = r3
            goto L_0x0c7e
        L_0x0c6d:
            r40.i0()     // Catch:{ all -> 0x0ec4 }
            long r5 = r8.zzb()     // Catch:{ all -> 0x0ec4 }
            r23 = r2
            r18 = r3
            r2 = r21
            long r5 = com.google.android.gms.measurement.internal.ib.t(r5, r2)     // Catch:{ all -> 0x0ec4 }
        L_0x0c7e:
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0cc9
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = "_efs"
            r5 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.db.M(r8, r2, r3)     // Catch:{ all -> 0x0ec4 }
            r40.h0()     // Catch:{ all -> 0x0ec4 }
            long r1 = (long) r1     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.db.M(r8, r10, r3)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r3 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r3 = (com.google.android.gms.internal.measurement.zzix) r3     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r3 = (com.google.android.gms.internal.measurement.zzfi.zze) r3     // Catch:{ all -> 0x0ec4 }
            r4.add(r3)     // Catch:{ all -> 0x0ec4 }
            boolean r3 = r12.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r3 == 0) goto L_0x0cb7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ec4 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0ec4 }
            r3 = 0
            com.google.android.gms.measurement.internal.a0 r9 = r9.c(r3, r1, r2)     // Catch:{ all -> 0x0ec4 }
        L_0x0cb7:
            java.lang.String r1 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            long r2 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.a0 r2 = r9.b(r2, r13)     // Catch:{ all -> 0x0ec4 }
            r3 = r23
            r3.put(r1, r2)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0cdf
        L_0x0cc9:
            r3 = r23
            r5 = 1
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0cdf
            java.lang.String r1 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            r2 = 0
            com.google.android.gms.measurement.internal.a0 r9 = r9.c(r11, r2, r2)     // Catch:{ all -> 0x0ec4 }
            r3.put(r1, r9)     // Catch:{ all -> 0x0ec4 }
        L_0x0cdf:
            r1 = r15
        L_0x0ce0:
            r7.zza((int) r1, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8)     // Catch:{ all -> 0x0ec4 }
        L_0x0ce3:
            int r1 = r1 + 1
            r5 = r43
            r6 = r1
            r2 = r3
            r3 = r18
            r1 = r40
            goto L_0x0a09
        L_0x0cef:
            r18 = r3
            r3 = r2
            int r1 = r4.size()     // Catch:{ all -> 0x0ec4 }
            int r2 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r1 >= r2) goto L_0x0d03
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r1 = r7.zzi()     // Catch:{ all -> 0x0ec4 }
            r1.zzb((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfi.zze>) r4)     // Catch:{ all -> 0x0ec4 }
        L_0x0d03:
            java.util.Set r1 = r3.entrySet()     // Catch:{ all -> 0x0ec4 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0ec4 }
        L_0x0d0b:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0d25
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0ec4 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.m r3 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.a0 r2 = (com.google.android.gms.measurement.internal.a0) r2     // Catch:{ all -> 0x0ec4 }
            r3.P(r2)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0d0b
        L_0x0d25:
            r1 = r18
            goto L_0x0d29
        L_0x0d28:
            r1 = r3
        L_0x0d29:
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r1.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.m r3 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.r5 r3 = r3.y0(r2)     // Catch:{ all -> 0x0ec4 }
            if (r3 != 0) goto L_0x0d51
            com.google.android.gms.measurement.internal.n4 r3 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r1.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.n4.q(r5)     // Catch:{ all -> 0x0ec4 }
            r3.b(r4, r5)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0dac
        L_0x0d51:
            int r4 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r4 <= 0) goto L_0x0dac
            long r4 = r3.i0()     // Catch:{ all -> 0x0ec4 }
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0d65
            r7.zzg((long) r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0d68
        L_0x0d65:
            r7.zzm()     // Catch:{ all -> 0x0ec4 }
        L_0x0d68:
            long r8 = r3.m0()     // Catch:{ all -> 0x0ec4 }
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0d73
            goto L_0x0d74
        L_0x0d73:
            r4 = r8
        L_0x0d74:
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0d7c
            r7.zzh((long) r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0d7f
        L_0x0d7c:
            r7.zzn()     // Catch:{ all -> 0x0ec4 }
        L_0x0d7f:
            r3.p()     // Catch:{ all -> 0x0ec4 }
            long r4 = r3.k0()     // Catch:{ all -> 0x0ec4 }
            int r5 = (int) r4     // Catch:{ all -> 0x0ec4 }
            r7.zzf((int) r5)     // Catch:{ all -> 0x0ec4 }
            long r4 = r7.zzd()     // Catch:{ all -> 0x0ec4 }
            r3.j0(r4)     // Catch:{ all -> 0x0ec4 }
            long r4 = r7.zzc()     // Catch:{ all -> 0x0ec4 }
            r3.f0(r4)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = r3.s0()     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0da2
            r7.zzn(r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0da5
        L_0x0da2:
            r7.zzj()     // Catch:{ all -> 0x0ec4 }
        L_0x0da5:
            com.google.android.gms.measurement.internal.m r4 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            r4.Q(r3)     // Catch:{ all -> 0x0ec4 }
        L_0x0dac:
            int r3 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r3 <= 0) goto L_0x0e0b
            com.google.android.gms.measurement.internal.i5 r3 = r40.c0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r1.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfc$zzd r3 = r3.G(r4)     // Catch:{ all -> 0x0ec4 }
            if (r3 == 0) goto L_0x0dd1
            boolean r4 = r3.zzs()     // Catch:{ all -> 0x0ec4 }
            if (r4 != 0) goto L_0x0dc9
            goto L_0x0dd1
        L_0x0dc9:
            long r3 = r3.zzc()     // Catch:{ all -> 0x0ec4 }
            r7.zzb((long) r3)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0dfa
        L_0x0dd1:
            com.google.android.gms.internal.measurement.zzfi$zzj r3 = r1.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r3 = r3.zzah()     // Catch:{ all -> 0x0ec4 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0ec4 }
            if (r3 == 0) goto L_0x0de3
            r3 = -1
            r7.zzb((long) r3)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0dfa
        L_0x0de3:
            com.google.android.gms.measurement.internal.n4 r3 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.G()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r1.f25165a     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.n4.q(r5)     // Catch:{ all -> 0x0ec4 }
            r3.b(r4, r5)     // Catch:{ all -> 0x0ec4 }
        L_0x0dfa:
            com.google.android.gms.measurement.internal.m r3 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r4 = r7.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = (com.google.android.gms.internal.measurement.zzfi.zzj) r4     // Catch:{ all -> 0x0ec4 }
            r13 = r17
            r3.W(r4, r13)     // Catch:{ all -> 0x0ec4 }
        L_0x0e0b:
            com.google.android.gms.measurement.internal.m r3 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            java.util.List<java.lang.Long> r1 = r1.f25166b     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.common.internal.q.k(r1)     // Catch:{ all -> 0x0ec4 }
            r3.i()     // Catch:{ all -> 0x0ec4 }
            r3.p()     // Catch:{ all -> 0x0ec4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x0ec4 }
            r5 = 0
        L_0x0e22:
            int r6 = r1.size()     // Catch:{ all -> 0x0ec4 }
            if (r5 >= r6) goto L_0x0e3f
            if (r5 == 0) goto L_0x0e2f
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ all -> 0x0ec4 }
        L_0x0e2f:
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0ec4 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0ec4 }
            r4.append(r6)     // Catch:{ all -> 0x0ec4 }
            int r5 = r5 + 1
            goto L_0x0e22
        L_0x0e3f:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x0ec4 }
            android.database.sqlite.SQLiteDatabase r5 = r3.w()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0ec4 }
            r7 = 0
            int r4 = r5.delete(r6, r4, r7)     // Catch:{ all -> 0x0ec4 }
            int r5 = r1.size()     // Catch:{ all -> 0x0ec4 }
            if (r4 == r5) goto L_0x0e72
            com.google.android.gms.measurement.internal.n4 r3 = r3.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0ec4 }
            int r1 = r1.size()     // Catch:{ all -> 0x0ec4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ec4 }
            r3.c(r5, r4, r1)     // Catch:{ all -> 0x0ec4 }
        L_0x0e72:
            com.google.android.gms.measurement.internal.m r1 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            android.database.sqlite.SQLiteDatabase r3 = r1.w()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0e89 }
            r6 = 0
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0e89 }
            r6 = 1
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0e89 }
            r3.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x0e89 }
            goto L_0x0e9c
        L_0x0e89:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.n4 r1 = r1.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.n4.q(r2)     // Catch:{ all -> 0x0ec4 }
            r1.c(r4, r2, r3)     // Catch:{ all -> 0x0ec4 }
        L_0x0e9c:
            com.google.android.gms.measurement.internal.m r1 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            r1.O0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.m r1 = r40.Z()
            r1.M0()
            r1 = 1
            return r1
        L_0x0eac:
            com.google.android.gms.measurement.internal.m r1 = r40.Z()     // Catch:{ all -> 0x0ec4 }
            r1.O0()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.m r1 = r40.Z()
            r1.M0()
            r1 = 0
            return r1
        L_0x0ebc:
            r0 = move-exception
            r1 = r0
        L_0x0ebe:
            if (r4 == 0) goto L_0x0ec3
            r4.close()     // Catch:{ all -> 0x0ec4 }
        L_0x0ec3:
            throw r1     // Catch:{ all -> 0x0ec4 }
        L_0x0ec4:
            r0 = move-exception
            r1 = r0
            com.google.android.gms.measurement.internal.m r2 = r40.Z()
            r2.M0()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.G(java.lang.String, long):boolean");
    }

    private final void H() {
        zzl().i();
        if (this.f25158t || this.f25159u || this.f25160v) {
            zzj().F().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f25158t), Boolean.valueOf(this.f25159u), Boolean.valueOf(this.f25160v));
            return;
        }
        zzj().F().a("Stopping uploading service(s)");
        List<Runnable> list = this.f25154p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) q.k(this.f25154p)).clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void I() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.measurement.internal.q5 r1 = r21.zzl()
            r1.i()
            r21.k0()
            long r1 = r0.f25153o
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            m5.e r1 = r21.zzb()
            long r1 = r1.b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f25153o
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.n4 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.F()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.w4 r1 = r21.q0()
            r1.c()
            com.google.android.gms.measurement.internal.pa r1 = r21.r0()
            r1.u()
            return
        L_0x004b:
            r0.f25153o = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.w5 r1 = r0.f25150l
            boolean r1 = r1.n()
            if (r1 == 0) goto L_0x024f
            boolean r1 = r21.J()
            if (r1 != 0) goto L_0x005d
            goto L_0x024f
        L_0x005d:
            m5.e r1 = r21.zzb()
            long r1 = r1.a()
            r21.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Long> r5 = com.google.android.gms.measurement.internal.e0.C
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.m r5 = r21.Z()
            boolean r5 = r5.R0()
            if (r5 != 0) goto L_0x0090
            com.google.android.gms.measurement.internal.m r5 = r21.Z()
            boolean r5 = r5.Q0()
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r5 = 0
            goto L_0x0091
        L_0x0090:
            r5 = 1
        L_0x0091:
            if (r5 == 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.f r10 = r21.X()
            java.lang.String r10 = r10.I()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bd
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bd
            r21.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Long> r10 = com.google.android.gms.measurement.internal.e0.f24538x
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00bd:
            r21.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Long> r10 = com.google.android.gms.measurement.internal.e0.f24536w
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00d1:
            r21.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Long> r10 = com.google.android.gms.measurement.internal.e0.f24534v
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00e4:
            com.google.android.gms.measurement.internal.y9 r12 = r0.f25147i
            com.google.android.gms.measurement.internal.d5 r12 = r12.f25304g
            long r12 = r12.a()
            com.google.android.gms.measurement.internal.y9 r14 = r0.f25147i
            com.google.android.gms.measurement.internal.d5 r14 = r14.f25305h
            long r14 = r14.a()
            com.google.android.gms.measurement.internal.m r16 = r21.Z()
            r17 = r10
            long r9 = r16.u()
            com.google.android.gms.measurement.internal.m r11 = r21.Z()
            r19 = r7
            long r6 = r11.v()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0113
        L_0x0110:
            r10 = r3
            goto L_0x018e
        L_0x0113:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0139
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0139
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0139:
            com.google.android.gms.measurement.internal.db r5 = r21.h0()
            r12 = r17
            boolean r5 = r5.W(r8, r12)
            if (r5 != 0) goto L_0x0147
            long r10 = r8 + r12
        L_0x0147:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018e
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x018e
            r5 = 0
        L_0x0150:
            r21.X()
            r6 = 20
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.e0.E
            r8 = 0
            java.lang.Object r7 = r7.a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0110
            r6 = 1
            long r6 = r6 << r5
            r21.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Long> r12 = com.google.android.gms.measurement.internal.e0.D
            java.lang.Object r12 = r12.a(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x018b
            goto L_0x018e
        L_0x018b:
            int r5 = r5 + 1
            goto L_0x0150
        L_0x018e:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01ae
            com.google.android.gms.measurement.internal.n4 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.F()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.w4 r1 = r21.q0()
            r1.c()
            com.google.android.gms.measurement.internal.pa r1 = r21.r0()
            r1.u()
            return
        L_0x01ae:
            com.google.android.gms.measurement.internal.u4 r1 = r21.b0()
            boolean r1 = r1.v()
            if (r1 != 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.n4 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.F()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.w4 r1 = r21.q0()
            r1.b()
            com.google.android.gms.measurement.internal.pa r1 = r21.r0()
            r1.u()
            return
        L_0x01d4:
            com.google.android.gms.measurement.internal.y9 r1 = r0.f25147i
            com.google.android.gms.measurement.internal.d5 r1 = r1.f25303f
            long r1 = r1.a()
            r21.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Long> r5 = com.google.android.gms.measurement.internal.e0.f24530t
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.db r7 = r21.h0()
            boolean r7 = r7.W(r1, r5)
            if (r7 != 0) goto L_0x01ff
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01ff:
            com.google.android.gms.measurement.internal.w4 r1 = r21.q0()
            r1.c()
            m5.e r1 = r21.zzb()
            long r1 = r1.a()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0236
            r21.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Long> r1 = com.google.android.gms.measurement.internal.e0.f24540y
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.y9 r1 = r0.f25147i
            com.google.android.gms.measurement.internal.d5 r1 = r1.f25304g
            m5.e r2 = r21.zzb()
            long r2 = r2.a()
            r1.b(r2)
        L_0x0236:
            com.google.android.gms.measurement.internal.n4 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.F()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.pa r1 = r21.r0()
            r1.t(r10)
            return
        L_0x024f:
            com.google.android.gms.measurement.internal.n4 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.F()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.w4 r1 = r21.q0()
            r1.c()
            com.google.android.gms.measurement.internal.pa r1 = r21.r0()
            r1.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.I():void");
    }

    private final boolean J() {
        zzl().i();
        k0();
        return Z().P0() || !TextUtils.isEmpty(Z().x());
    }

    private final boolean K() {
        zzl().i();
        FileLock fileLock = this.f25161w;
        if (fileLock == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f25150l.zza().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f25162x = channel;
                FileLock tryLock = channel.tryLock();
                this.f25161w = tryLock;
                if (tryLock != null) {
                    zzj().F().a("Storage concurrent access okay");
                    return true;
                }
                zzj().B().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e10) {
                zzj().B().b("Failed to acquire storage lock", e10);
                return false;
            } catch (IOException e11) {
                zzj().B().b("Failed to access storage lock file", e11);
                return false;
            } catch (OverlappingFileLockException e12) {
                zzj().G().b("Storage lock already acquired", e12);
                return false;
            }
        } else {
            zzj().F().a("Storage concurrent access okay");
            return true;
        }
    }

    private final void P(d0 d0Var, lb lbVar) {
        q.g(lbVar.f24779a);
        r4 b10 = r4.b(d0Var);
        i0().H(b10.f24995d, Z().v0(lbVar.f24779a));
        i0().Q(b10, X().t(lbVar.f24779a));
        d0 a10 = b10.a();
        if ("_cmp".equals(a10.f24457a) && "referrer API v2".equals(a10.f24458b.z("_cis"))) {
            String z10 = a10.f24458b.z("gclid");
            if (!TextUtils.isEmpty(z10)) {
                s(new hb("_lgclid", a10.f24460d, z10, "auto"), lbVar);
            }
        }
        if (zzoi.zza() && zzoi.zzc() && "_cmp".equals(a10.f24457a) && "referrer API v2".equals(a10.f24458b.z("_cis"))) {
            String z11 = a10.f24458b.z("gbraid");
            if (!TextUtils.isEmpty(z11)) {
                s(new hb("_gbraid", a10.f24460d, z11, "auto"), lbVar);
            }
        }
        o(a10, lbVar);
    }

    private final void Q(r5 r5Var) {
        zzl().i();
        if (!TextUtils.isEmpty(r5Var.j()) || !TextUtils.isEmpty(r5Var.r0())) {
            Uri.Builder builder = new Uri.Builder();
            String j10 = r5Var.j();
            if (TextUtils.isEmpty(j10)) {
                j10 = r5Var.r0();
            }
            androidx.collection.a aVar = null;
            Uri.Builder encodedAuthority = builder.scheme(e0.f24504g.a(null)).encodedAuthority(e0.f24506h.a(null));
            encodedAuthority.path("config/app/" + j10).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "82001").appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String str = (String) q.k(r5Var.t0());
                URL url = new URL(uri);
                zzj().F().b("Fetching remote configuration", str);
                zzfc.zzd G2 = c0().G(str);
                String K = c0().K(str);
                if (G2 != null) {
                    if (!TextUtils.isEmpty(K)) {
                        aVar = new androidx.collection.a();
                        aVar.put("If-Modified-Since", K);
                    }
                    String I = c0().I(str);
                    if (!TextUtils.isEmpty(I)) {
                        if (aVar == null) {
                            aVar = new androidx.collection.a();
                        }
                        aVar.put("If-None-Match", I);
                    }
                }
                this.f25158t = true;
                u4 b02 = b0();
                ab abVar = new ab(this);
                b02.i();
                b02.p();
                q.k(url);
                q.k(abVar);
                b02.zzl().u(new x4(b02, str, url, (byte[]) null, aVar, abVar));
            } catch (MalformedURLException unused) {
                zzj().B().c("Failed to parse config URL. Not fetching. appId", n4.q(r5Var.t0()), uri);
            }
        } else {
            u((String) q.k(r5Var.t0()), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
        }
    }

    private final lb R(String str) {
        String str2;
        int i10;
        String str3 = str;
        r5 y02 = Z().y0(str3);
        if (y02 == null || TextUtils.isEmpty(y02.h())) {
            zzj().A().b("No app data available; dropping", str3);
            return null;
        }
        Boolean h10 = h(y02);
        if (h10 == null || h10.booleanValue()) {
            y6 L = L(str);
            if (!zznp.zza() || !X().n(e0.T0)) {
                str2 = MaxReward.DEFAULT_LABEL;
                i10 = 100;
            } else {
                str2 = V(str).i();
                i10 = L.b();
            }
            r5 r5Var = y02;
            return new lb(str, y02.j(), y02.h(), y02.z(), y02.v0(), y02.g0(), y02.a0(), (String) null, y02.r(), false, y02.i(), y02.v(), 0, 0, r5Var.q(), false, r5Var.r0(), r5Var.q0(), r5Var.c0(), r5Var.n(), (String) null, L.v(), MaxReward.DEFAULT_LABEL, (String) null, r5Var.t(), r5Var.p0(), i10, str2, r5Var.a(), r5Var.D());
        }
        zzj().B().b("App version does not match; dropping. appId", n4.q(str));
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x030c A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0342 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03ac A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x073d A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x074f A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0795 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x083a A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0853 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x08da A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x08f8 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x096e A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x09c6 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c6 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ce A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void T(com.google.android.gms.measurement.internal.d0 r29, com.google.android.gms.measurement.internal.lb r30) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r4 = "_fx"
            java.lang.String r5 = "_sno"
            com.google.android.gms.common.internal.q.k(r30)
            java.lang.String r6 = r3.f24779a
            com.google.android.gms.common.internal.q.g(r6)
            long r6 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.q5 r8 = r28.zzl()
            r8.i()
            r28.k0()
            java.lang.String r8 = r3.f24779a
            r28.h0()
            boolean r9 = com.google.android.gms.measurement.internal.db.X(r29, r30)
            if (r9 != 0) goto L_0x002c
            return
        L_0x002c:
            boolean r9 = r3.f24786i
            if (r9 != 0) goto L_0x0034
            r1.d(r3)
            return
        L_0x0034:
            com.google.android.gms.measurement.internal.i5 r9 = r28.c0()
            java.lang.String r10 = r2.f24457a
            boolean r9 = r9.J(r8, r10)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r9 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.n4 r3 = r28.zzj()
            com.google.android.gms.measurement.internal.p4 r3 = r3.G()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.n4.q(r8)
            com.google.android.gms.measurement.internal.w5 r5 = r1.f25150l
            com.google.android.gms.measurement.internal.m4 r5 = r5.y()
            java.lang.String r6 = r2.f24457a
            java.lang.String r5 = r5.c(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.i5 r3 = r28.c0()
            boolean r3 = r3.S(r8)
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.i5 r3 = r28.c0()
            boolean r3 = r3.U(r8)
            if (r3 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r3 = 0
            goto L_0x0078
        L_0x0077:
            r3 = 1
        L_0x0078:
            if (r3 != 0) goto L_0x0095
            java.lang.String r4 = r2.f24457a
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0095
            r28.i0()
            com.google.android.gms.measurement.internal.kb r9 = r1.G
            r11 = 11
            java.lang.String r13 = r2.f24457a
            r2 = 0
            java.lang.String r12 = "_ev"
            r10 = r8
            r4 = r14
            r14 = r2
            com.google.android.gms.measurement.internal.ib.T(r9, r10, r11, r12, r13, r14)
            goto L_0x0096
        L_0x0095:
            r4 = r14
        L_0x0096:
            if (r3 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.m r2 = r28.Z()
            com.google.android.gms.measurement.internal.r5 r2 = r2.y0(r8)
            if (r2 == 0) goto L_0x00de
            long r5 = r2.e0()
            long r7 = r2.H()
            long r5 = java.lang.Math.max(r5, r7)
            m5.e r3 = r28.zzb()
            long r7 = r3.a()
            long r7 = r7 - r5
            long r5 = java.lang.Math.abs(r7)
            r28.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Long> r3 = com.google.android.gms.measurement.internal.e0.B
            java.lang.Object r3 = r3.a(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.n4 r3 = r28.zzj()
            com.google.android.gms.measurement.internal.p4 r3 = r3.A()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.Q(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.r4 r2 = com.google.android.gms.measurement.internal.r4.b(r29)
            com.google.android.gms.measurement.internal.ib r9 = r28.i0()
            com.google.android.gms.measurement.internal.f r10 = r28.X()
            int r10 = r10.t(r8)
            r9.Q(r2, r10)
            boolean r9 = com.google.android.gms.internal.measurement.zzot.zza()
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.f r9 = r28.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.e0.J0
            boolean r9 = r9.n(r10)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.f r9 = r28.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.e0.S
            r11 = 10
            r12 = 35
            int r9 = r9.l(r8, r10, r11, r12)
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            java.util.TreeSet r10 = new java.util.TreeSet
            android.os.Bundle r11 = r2.f24995d
            java.util.Set r11 = r11.keySet()
            r10.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x0123:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015b
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "items"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x0159
            com.google.android.gms.measurement.internal.ib r12 = r28.i0()
            android.os.Bundle r13 = r2.f24995d
            android.os.Parcelable[] r11 = r13.getParcelableArray(r11)
            boolean r13 = com.google.android.gms.internal.measurement.zzot.zza()
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.measurement.internal.f r13 = r28.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.e0.J0
            boolean r13 = r13.n(r14)
            if (r13 == 0) goto L_0x0155
            r13 = 1
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            r12.V(r11, r9, r13)
        L_0x0159:
            r14 = 0
            goto L_0x0123
        L_0x015b:
            com.google.android.gms.measurement.internal.d0 r2 = r2.a()
            com.google.android.gms.measurement.internal.n4 r9 = r28.zzj()
            r10 = 2
            boolean r9 = r9.x(r10)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.measurement.internal.n4 r9 = r28.zzj()
            com.google.android.gms.measurement.internal.p4 r9 = r9.F()
            com.google.android.gms.measurement.internal.w5 r11 = r1.f25150l
            com.google.android.gms.measurement.internal.m4 r11 = r11.y()
            java.lang.String r11 = r11.b(r2)
            java.lang.String r12 = "Logging event"
            r9.b(r12, r11)
        L_0x0181:
            boolean r9 = com.google.android.gms.internal.measurement.zzon.zza()
            if (r9 == 0) goto L_0x0190
            com.google.android.gms.measurement.internal.f r9 = r28.X()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.e0.G0
            r9.n(r11)
        L_0x0190:
            com.google.android.gms.measurement.internal.m r9 = r28.Z()
            r9.L0()
            r1.d(r3)     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r11 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = "refund"
            if (r9 != 0) goto L_0x01bb
            java.lang.String r9 = "purchase"
            java.lang.String r12 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x01bb
            java.lang.String r9 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r9 = 0
            goto L_0x01bc
        L_0x01bb:
            r9 = 1
        L_0x01bc:
            java.lang.String r12 = "_iap"
            java.lang.String r13 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0a11 }
            if (r12 != 0) goto L_0x01cb
            if (r9 == 0) goto L_0x01c9
            goto L_0x01cb
        L_0x01c9:
            r12 = 0
            goto L_0x01cc
        L_0x01cb:
            r12 = 1
        L_0x01cc:
            if (r12 == 0) goto L_0x0351
            com.google.android.gms.measurement.internal.z r12 = r2.f24458b     // Catch:{ all -> 0x0a11 }
            java.lang.String r13 = "currency"
            java.lang.String r12 = r12.z(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x0235
            com.google.android.gms.measurement.internal.z r9 = r2.f24458b     // Catch:{ all -> 0x0a11 }
            java.lang.Double r9 = r9.v(r13)     // Catch:{ all -> 0x0a11 }
            double r19 = r9.doubleValue()     // Catch:{ all -> 0x0a11 }
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r19 = r19 * r21
            r23 = 0
            int r9 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x01fe
            com.google.android.gms.measurement.internal.z r9 = r2.f24458b     // Catch:{ all -> 0x0a11 }
            java.lang.Long r9 = r9.x(r13)     // Catch:{ all -> 0x0a11 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a11 }
            double r13 = (double) r13     // Catch:{ all -> 0x0a11 }
            double r19 = r13 * r21
        L_0x01fe:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x0218
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x0218
            long r13 = java.lang.Math.round(r19)     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x023f
            long r13 = -r13
            goto L_0x023f
        L_0x0218:
            com.google.android.gms.measurement.internal.n4 r9 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.G()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Data lost. Currency value is too big. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.Double r12 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x0a11 }
            r9.c(r10, r11, r12)     // Catch:{ all -> 0x0a11 }
            r24 = r6
            r26 = r15
            r7 = 0
            r13 = 0
            goto L_0x0340
        L_0x0235:
            com.google.android.gms.measurement.internal.z r9 = r2.f24458b     // Catch:{ all -> 0x0a11 }
            java.lang.Long r9 = r9.x(r13)     // Catch:{ all -> 0x0a11 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a11 }
        L_0x023f:
            boolean r9 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x033a
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r12.toUpperCase(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0a11 }
            if (r11 == 0) goto L_0x033a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = "_ltv_"
            r11.<init>(r12)     // Catch:{ all -> 0x0a11 }
            r11.append(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = r11.toString()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r9 = r28.Z()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.jb r9 = r9.A0(r8, r12)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x029d
            java.lang.Object r9 = r9.f24735e     // Catch:{ all -> 0x0a11 }
            boolean r11 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0a11 }
            if (r11 != 0) goto L_0x0272
            goto L_0x029d
        L_0x0272:
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0a11 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.jb r19 = new com.google.android.gms.measurement.internal.jb     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r2.f24459c     // Catch:{ all -> 0x0a11 }
            m5.e r20 = r28.zzb()     // Catch:{ all -> 0x0a11 }
            long r20 = r20.a()     // Catch:{ all -> 0x0a11 }
            long r9 = r9 + r13
            java.lang.Long r22 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a11 }
            r9 = r19
            r10 = r8
            r13 = 0
            r24 = r6
            r6 = 1
            r7 = 0
            r13 = r20
            r26 = r15
            r15 = r22
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0a11 }
        L_0x029a:
            r6 = r19
            goto L_0x0302
        L_0x029d:
            r24 = r6
            r26 = r15
            r6 = 1
            r7 = 0
            com.google.android.gms.measurement.internal.m r9 = r28.Z()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.f r11 = r28.X()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.e0.G     // Catch:{ all -> 0x0a11 }
            int r11 = r11.p(r8, r15)     // Catch:{ all -> 0x0a11 }
            int r11 = r11 - r6
            com.google.android.gms.common.internal.q.g(r8)     // Catch:{ all -> 0x0a11 }
            r9.i()     // Catch:{ all -> 0x0a11 }
            r9.p()     // Catch:{ all -> 0x0a11 }
            android.database.sqlite.SQLiteDatabase r15 = r9.w()     // Catch:{ SQLiteException -> 0x02d6 }
            java.lang.String r10 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02d6 }
            r6[r7] = r8     // Catch:{ SQLiteException -> 0x02d6 }
            r17 = 1
            r6[r17] = r8     // Catch:{ SQLiteException -> 0x02d6 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x02d6 }
            r16 = 2
            r6[r16] = r11     // Catch:{ SQLiteException -> 0x02d6 }
            r15.execSQL(r10, r6)     // Catch:{ SQLiteException -> 0x02d6 }
            goto L_0x02e9
        L_0x02d6:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.n4 r9 = r9.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.B()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Error pruning currencies. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ all -> 0x0a11 }
            r9.c(r10, r11, r6)     // Catch:{ all -> 0x0a11 }
        L_0x02e9:
            com.google.android.gms.measurement.internal.jb r19 = new com.google.android.gms.measurement.internal.jb     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r2.f24459c     // Catch:{ all -> 0x0a11 }
            m5.e r6 = r28.zzb()     // Catch:{ all -> 0x0a11 }
            long r15 = r6.a()     // Catch:{ all -> 0x0a11 }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0a11 }
            r9 = r19
            r10 = r8
            r13 = r15
            r15 = r6
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0a11 }
            goto L_0x029a
        L_0x0302:
            com.google.android.gms.measurement.internal.m r9 = r28.Z()     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.Z(r6)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x033f
            com.google.android.gms.measurement.internal.n4 r9 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.B()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w5 r12 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m4 r12 = r12.y()     // Catch:{ all -> 0x0a11 }
            java.lang.String r13 = r6.f24733c     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = r12.g(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r6 = r6.f24735e     // Catch:{ all -> 0x0a11 }
            r9.d(r10, r11, r12, r6)     // Catch:{ all -> 0x0a11 }
            r28.i0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.kb r9 = r1.G     // Catch:{ all -> 0x0a11 }
            r11 = 9
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.ib.T(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0a11 }
            goto L_0x033f
        L_0x033a:
            r24 = r6
            r26 = r15
            r7 = 0
        L_0x033f:
            r13 = 1
        L_0x0340:
            if (r13 != 0) goto L_0x0356
            com.google.android.gms.measurement.internal.m r2 = r28.Z()     // Catch:{ all -> 0x0a11 }
            r2.O0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r2 = r28.Z()
            r2.M0()
            return
        L_0x0351:
            r24 = r6
            r26 = r15
            r7 = 0
        L_0x0356:
            java.lang.String r6 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            boolean r6 = com.google.android.gms.measurement.internal.ib.E0(r6)     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            r10 = r26
            boolean r20 = r10.equals(r9)     // Catch:{ all -> 0x0a11 }
            r28.i0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z r9 = r2.f24458b     // Catch:{ all -> 0x0a11 }
            long r9 = com.google.android.gms.measurement.internal.ib.v(r9)     // Catch:{ all -> 0x0a11 }
            r13 = 1
            long r15 = r9 + r13
            com.google.android.gms.measurement.internal.m r9 = r28.Z()     // Catch:{ all -> 0x0a11 }
            long r10 = r28.p0()     // Catch:{ all -> 0x0a11 }
            r17 = 1
            r18 = 0
            r19 = 0
            r12 = r8
            r21 = r8
            r7 = r13
            r13 = r15
            r15 = r17
            r16 = r6
            r17 = r18
            r18 = r20
            com.google.android.gms.measurement.internal.n r9 = r9.D(r10, r12, r13, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0a11 }
            long r10 = r9.f24839b     // Catch:{ all -> 0x0a11 }
            r28.X()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.e0.f24516m     // Catch:{ all -> 0x0a11 }
            r13 = 0
            java.lang.Object r12 = r12.a(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0a11 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0a11 }
            long r12 = (long) r12     // Catch:{ all -> 0x0a11 }
            long r10 = r10 - r12
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x03d7
            long r10 = r10 % r12
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x03c8
            com.google.android.gms.measurement.internal.n4 r2 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()     // Catch:{ all -> 0x0a11 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.n4.q(r21)     // Catch:{ all -> 0x0a11 }
            long r5 = r9.f24839b     // Catch:{ all -> 0x0a11 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a11 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0a11 }
        L_0x03c8:
            com.google.android.gms.measurement.internal.m r2 = r28.Z()     // Catch:{ all -> 0x0a11 }
            r2.O0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r2 = r28.Z()
            r2.M0()
            return
        L_0x03d7:
            if (r6 == 0) goto L_0x042f
            long r10 = r9.f24838a     // Catch:{ all -> 0x0a11 }
            r28.X()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.e0.f24520o     // Catch:{ all -> 0x0a11 }
            r8 = 0
            java.lang.Object r7 = r7.a(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0a11 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0a11 }
            long r7 = (long) r7     // Catch:{ all -> 0x0a11 }
            long r10 = r10 - r7
            int r7 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x042f
            long r10 = r10 % r12
            r3 = 1
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x040f
            com.google.android.gms.measurement.internal.n4 r3 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.n4.q(r21)     // Catch:{ all -> 0x0a11 }
            long r6 = r9.f24838a     // Catch:{ all -> 0x0a11 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a11 }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x0a11 }
        L_0x040f:
            r28.i0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.kb r9 = r1.G     // Catch:{ all -> 0x0a11 }
            r11 = 16
            java.lang.String r12 = "_ev"
            java.lang.String r13 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            r14 = 0
            r10 = r21
            com.google.android.gms.measurement.internal.ib.T(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r2 = r28.Z()     // Catch:{ all -> 0x0a11 }
            r2.O0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r2 = r28.Z()
            r2.M0()
            return
        L_0x042f:
            if (r20 == 0) goto L_0x047d
            long r7 = r9.f24841d     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.f r10 = r28.X()     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.e0.f24518n     // Catch:{ all -> 0x0a11 }
            int r10 = r10.p(r11, r12)     // Catch:{ all -> 0x0a11 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x0a11 }
            r11 = 0
            int r10 = java.lang.Math.max(r11, r10)     // Catch:{ all -> 0x0a11 }
            long r10 = (long) r10     // Catch:{ all -> 0x0a11 }
            long r7 = r7 - r10
            int r10 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x047d
            r10 = 1
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x046e
            com.google.android.gms.measurement.internal.n4 r2 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()     // Catch:{ all -> 0x0a11 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.n4.q(r21)     // Catch:{ all -> 0x0a11 }
            long r5 = r9.f24841d     // Catch:{ all -> 0x0a11 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a11 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0a11 }
        L_0x046e:
            com.google.android.gms.measurement.internal.m r2 = r28.Z()     // Catch:{ all -> 0x0a11 }
            r2.O0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r2 = r28.Z()
            r2.M0()
            return
        L_0x047d:
            com.google.android.gms.measurement.internal.z r7 = r2.f24458b     // Catch:{ all -> 0x0a11 }
            android.os.Bundle r7 = r7.w()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.ib r8 = r28.i0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "_o"
            java.lang.String r10 = r2.f24459c     // Catch:{ all -> 0x0a11 }
            r8.I(r7, r9, r10)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.ib r8 = r28.i0()     // Catch:{ all -> 0x0a11 }
            r13 = r21
            boolean r8 = r8.A0(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = "_r"
            if (r8 == 0) goto L_0x04b6
            com.google.android.gms.measurement.internal.ib r8 = r28.i0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "_dbg"
            r10 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a11 }
            r8.I(r7, r9, r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.ib r8 = r28.i0()     // Catch:{ all -> 0x0a11 }
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a11 }
            r8.I(r7, r12, r9)     // Catch:{ all -> 0x0a11 }
        L_0x04b6:
            java.lang.String r8 = "_s"
            java.lang.String r9 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x04db
            com.google.android.gms.measurement.internal.m r8 = r28.Z()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.jb r8 = r8.A0(r9, r5)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x04db
            java.lang.Object r9 = r8.f24735e     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x04db
            com.google.android.gms.measurement.internal.ib r9 = r28.i0()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r8 = r8.f24735e     // Catch:{ all -> 0x0a11 }
            r9.I(r7, r5, r8)     // Catch:{ all -> 0x0a11 }
        L_0x04db:
            com.google.android.gms.measurement.internal.m r5 = r28.Z()     // Catch:{ all -> 0x0a11 }
            long r8 = r5.A(r13)     // Catch:{ all -> 0x0a11 }
            r14 = 0
            int r5 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x04fe
            com.google.android.gms.measurement.internal.n4 r5 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.G()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.n4.q(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0a11 }
            r5.c(r10, r11, r8)     // Catch:{ all -> 0x0a11 }
        L_0x04fe:
            com.google.android.gms.measurement.internal.w r5 = new com.google.android.gms.measurement.internal.w     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w5 r10 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r2.f24459c     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r2.f24457a     // Catch:{ all -> 0x0a11 }
            long r14 = r2.f24460d     // Catch:{ all -> 0x0a11 }
            r18 = 0
            r9 = r5
            r2 = r12
            r12 = r13
            r27 = r2
            r2 = r13
            r13 = r8
            r16 = r18
            r18 = r7
            r9.<init>((com.google.android.gms.measurement.internal.w5) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (long) r14, (long) r16, (android.os.Bundle) r18)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r7 = r28.Z()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r5.f25173b     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.a0 r7 = r7.x0(r2, r8)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x0596
            com.google.android.gms.measurement.internal.m r7 = r28.Z()     // Catch:{ all -> 0x0a11 }
            long r7 = r7.q0(r2)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.f r9 = r28.X()     // Catch:{ all -> 0x0a11 }
            int r9 = r9.k(r2)     // Catch:{ all -> 0x0a11 }
            long r9 = (long) r9     // Catch:{ all -> 0x0a11 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x057a
            if (r6 == 0) goto L_0x057a
            com.google.android.gms.measurement.internal.n4 r3 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.n4.q(r2)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w5 r7 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m4 r7 = r7.y()     // Catch:{ all -> 0x0a11 }
            java.lang.String r5 = r5.f25173b     // Catch:{ all -> 0x0a11 }
            java.lang.String r5 = r7.c(r5)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.f r7 = r28.X()     // Catch:{ all -> 0x0a11 }
            int r7 = r7.k(r2)     // Catch:{ all -> 0x0a11 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0a11 }
            r3.d(r4, r6, r5, r7)     // Catch:{ all -> 0x0a11 }
            r28.i0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.kb r9 = r1.G     // Catch:{ all -> 0x0a11 }
            r11 = 8
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r2
            com.google.android.gms.measurement.internal.ib.T(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r2 = r28.Z()
            r2.M0()
            return
        L_0x057a:
            com.google.android.gms.measurement.internal.a0 r6 = new com.google.android.gms.measurement.internal.a0     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r5.f25173b     // Catch:{ all -> 0x0a11 }
            r12 = 0
            r14 = 0
            long r7 = r5.f25175d     // Catch:{ all -> 0x0a11 }
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r9 = r6
            r10 = r2
            r16 = r7
            r9.<init>(r10, r11, r12, r14, r16, r18, r20, r21, r22, r23)     // Catch:{ all -> 0x0a11 }
            goto L_0x05a4
        L_0x0596:
            com.google.android.gms.measurement.internal.w5 r2 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            long r8 = r7.f24342f     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w r5 = r5.a(r2, r8)     // Catch:{ all -> 0x0a11 }
            long r8 = r5.f25175d     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.a0 r6 = r7.a(r8)     // Catch:{ all -> 0x0a11 }
        L_0x05a4:
            com.google.android.gms.measurement.internal.m r2 = r28.Z()     // Catch:{ all -> 0x0a11 }
            r2.P(r6)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.q5 r2 = r28.zzl()     // Catch:{ all -> 0x0a11 }
            r2.i()     // Catch:{ all -> 0x0a11 }
            r28.k0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.internal.q.k(r5)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.internal.q.k(r30)     // Catch:{ all -> 0x0a11 }
            java.lang.String r2 = r5.f25172a     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.internal.q.g(r2)     // Catch:{ all -> 0x0a11 }
            java.lang.String r2 = r5.f25172a     // Catch:{ all -> 0x0a11 }
            java.lang.String r6 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.internal.q.a(r2)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = com.google.android.gms.internal.measurement.zzfi.zzj.zzu()     // Catch:{ all -> 0x0a11 }
            r6 = 1
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = r2.zzg((int) r6)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = "android"
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = r2.zzp(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x05e7
            java.lang.String r7 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            r2.zzb((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x05e7:
            java.lang.String r7 = r3.f24782d     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x05f4
            java.lang.String r7 = r3.f24782d     // Catch:{ all -> 0x0a11 }
            r2.zzd((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x05f4:
            java.lang.String r7 = r3.f24781c     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x0601
            java.lang.String r7 = r3.f24781c     // Catch:{ all -> 0x0a11 }
            r2.zze((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x0601:
            boolean r7 = com.google.android.gms.internal.measurement.zzps.zza()     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x062e
            java.lang.String r7 = r3.f24802y     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x062e
            com.google.android.gms.measurement.internal.f r7 = r28.X()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.e0.f24537w0     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.n(r8)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x0629
            com.google.android.gms.measurement.internal.f r7 = r28.X()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.e0.f24541y0     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.w(r8, r9)     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x062e
        L_0x0629:
            java.lang.String r7 = r3.f24802y     // Catch:{ all -> 0x0a11 }
            r2.zzr(r7)     // Catch:{ all -> 0x0a11 }
        L_0x062e:
            long r7 = r3.f24788k     // Catch:{ all -> 0x0a11 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x063b
            int r8 = (int) r7     // Catch:{ all -> 0x0a11 }
            r2.zze((int) r8)     // Catch:{ all -> 0x0a11 }
        L_0x063b:
            long r7 = r3.f24783f     // Catch:{ all -> 0x0a11 }
            r2.zzf((long) r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = r3.f24780b     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x064d
            java.lang.String r7 = r3.f24780b     // Catch:{ all -> 0x0a11 }
            r2.zzm(r7)     // Catch:{ all -> 0x0a11 }
        L_0x064d:
            java.lang.String r7 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = com.google.android.gms.common.internal.q.k(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y6 r7 = r1.L(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24800w     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y6 r8 = com.google.android.gms.measurement.internal.y6.e(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y6 r7 = r7.d(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r7.v()     // Catch:{ all -> 0x0a11 }
            r2.zzg((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r2.zzt()     // Catch:{ all -> 0x0a11 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0681
            java.lang.String r8 = r3.f24795r     // Catch:{ all -> 0x0a11 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a11 }
            if (r8 != 0) goto L_0x0681
            java.lang.String r8 = r3.f24795r     // Catch:{ all -> 0x0a11 }
            r2.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
        L_0x0681:
            boolean r8 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0735
            com.google.android.gms.measurement.internal.f r8 = r28.X()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.e0.L0     // Catch:{ all -> 0x0a11 }
            boolean r8 = r8.w(r9, r10)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0735
            r28.i0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            boolean r8 = com.google.android.gms.measurement.internal.ib.y0(r8)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0735
            int r8 = r3.D     // Catch:{ all -> 0x0a11 }
            r2.zzd((int) r8)     // Catch:{ all -> 0x0a11 }
            long r8 = r3.E     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.x()     // Catch:{ all -> 0x0a11 }
            r10 = 32
            r12 = 0
            if (r7 != 0) goto L_0x06bb
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x06bb
            r14 = -2
            long r7 = r8 & r14
            long r8 = r7 | r10
        L_0x06bb:
            r14 = 1
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x06c3
            r7 = 1
            goto L_0x06c4
        L_0x06c3:
            r7 = 0
        L_0x06c4:
            r2.zza((boolean) r7)     // Catch:{ all -> 0x0a11 }
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0737
            com.google.android.gms.internal.measurement.zzfi$zzb$zza r7 = com.google.android.gms.internal.measurement.zzfi.zzb.zza()     // Catch:{ all -> 0x0a11 }
            r14 = 1
            long r16 = r8 & r14
            int r14 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x06d9
            r14 = 1
            goto L_0x06da
        L_0x06d9:
            r14 = 0
        L_0x06da:
            r7.zzc(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 2
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x06e6
            r14 = 1
            goto L_0x06e7
        L_0x06e6:
            r14 = 0
        L_0x06e7:
            r7.zze(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 4
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x06f3
            r14 = 1
            goto L_0x06f4
        L_0x06f3:
            r14 = 0
        L_0x06f4:
            r7.zzf(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 8
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x0700
            r14 = 1
            goto L_0x0701
        L_0x0700:
            r14 = 0
        L_0x0701:
            r7.zzg(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 16
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x070d
            r14 = 1
            goto L_0x070e
        L_0x070d:
            r14 = 0
        L_0x070e:
            r7.zzb(r14)     // Catch:{ all -> 0x0a11 }
            long r10 = r10 & r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0718
            r10 = 1
            goto L_0x0719
        L_0x0718:
            r10 = 0
        L_0x0719:
            r7.zza(r10)     // Catch:{ all -> 0x0a11 }
            r10 = 64
            long r8 = r8 & r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0725
            r8 = 1
            goto L_0x0726
        L_0x0725:
            r8 = 0
        L_0x0726:
            r7.zzd(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzkj r7 = r7.zzab()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzix r7 = (com.google.android.gms.internal.measurement.zzix) r7     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzb r7 = (com.google.android.gms.internal.measurement.zzfi.zzb) r7     // Catch:{ all -> 0x0a11 }
            r2.zza((com.google.android.gms.internal.measurement.zzfi.zzb) r7)     // Catch:{ all -> 0x0a11 }
            goto L_0x0737
        L_0x0735:
            r12 = 0
        L_0x0737:
            long r7 = r3.f24784g     // Catch:{ all -> 0x0a11 }
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0740
            r2.zzc((long) r7)     // Catch:{ all -> 0x0a11 }
        L_0x0740:
            long r7 = r3.f24797t     // Catch:{ all -> 0x0a11 }
            r2.zzd((long) r7)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.db r7 = r28.h0()     // Catch:{ all -> 0x0a11 }
            java.util.List r7 = r7.e0()     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x0752
            r2.zzc((java.lang.Iterable<? extends java.lang.Integer>) r7)     // Catch:{ all -> 0x0a11 }
        L_0x0752:
            java.lang.String r7 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = com.google.android.gms.common.internal.q.k(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y6 r7 = r1.L(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24800w     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y6 r8 = com.google.android.gms.measurement.internal.y6.e(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y6 r7 = r7.d(r8)     // Catch:{ all -> 0x0a11 }
            boolean r8 = r7.x()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            boolean r8 = r3.f24793p     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.y9 r8 = r1.f25147i     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            android.util.Pair r8 = r8.u(r9, r7)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0a11 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x0a11 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x07f0
            boolean r9 = r3.f24793p     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x07f0
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0a11 }
            r2.zzq(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r9 = r8.second     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x079e
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0a11 }
            r2.zzc((boolean) r9)     // Catch:{ all -> 0x0a11 }
        L_0x079e:
            boolean r9 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.f r9 = r28.X()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.e0.Y0     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.n(r10)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x07f0
            java.lang.String r9 = r5.f25173b     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.equals(r4)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x07f0
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "00000000-0000-0000-0000-000000000000"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r8 != 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.m r8 = r28.Z()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.r5 r8 = r8.y0(r9)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            boolean r8 = r8.u()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            java.lang.String r8 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            r9 = 0
            r1.A(r8, r9)     // Catch:{ all -> 0x0a11 }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x0a11 }
            r8.<init>()     // Catch:{ all -> 0x0a11 }
            r10 = r27
            r14 = 1
            r8.putLong(r10, r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.kb r11 = r1.G     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            r11.a(r14, r4, r8)     // Catch:{ all -> 0x0a11 }
            goto L_0x07f3
        L_0x07f0:
            r10 = r27
            r9 = 0
        L_0x07f3:
            com.google.android.gms.measurement.internal.w5 r4 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y r4 = r4.v()     // Catch:{ all -> 0x0a11 }
            r4.j()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r2.zzi((java.lang.String) r4)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w5 r8 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y r8 = r8.v()     // Catch:{ all -> 0x0a11 }
            r8.j()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r4.zzo(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w5 r8 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y r8 = r8.v()     // Catch:{ all -> 0x0a11 }
            long r14 = r8.q()     // Catch:{ all -> 0x0a11 }
            int r8 = (int) r14     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r4.zzi((int) r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w5 r8 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.y r8 = r8.v()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r8.r()     // Catch:{ all -> 0x0a11 }
            r4.zzs(r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.A     // Catch:{ all -> 0x0a11 }
            r2.zzj((long) r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w5 r4 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            boolean r4 = r4.k()     // Catch:{ all -> 0x0a11 }
            if (r4 == 0) goto L_0x0847
            r2.zzr()     // Catch:{ all -> 0x0a11 }
            r4 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a11 }
            if (r8 != 0) goto L_0x0847
            r2.zzj((java.lang.String) r4)     // Catch:{ all -> 0x0a11 }
        L_0x0847:
            com.google.android.gms.measurement.internal.m r4 = r28.Z()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.r5 r4 = r4.y0(r8)     // Catch:{ all -> 0x0a11 }
            if (r4 != 0) goto L_0x08b3
            com.google.android.gms.measurement.internal.r5 r4 = new com.google.android.gms.measurement.internal.r5     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w5 r8 = r1.f25150l     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            r4.<init>(r8, r11)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r1.i(r7)     // Catch:{ all -> 0x0a11 }
            r4.x(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24789l     // Catch:{ all -> 0x0a11 }
            r4.J(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24780b     // Catch:{ all -> 0x0a11 }
            r4.M(r8)     // Catch:{ all -> 0x0a11 }
            boolean r8 = r7.x()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0880
            com.google.android.gms.measurement.internal.y9 r8 = r1.f25147i     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            boolean r14 = r3.f24793p     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r8.v(r11, r14)     // Catch:{ all -> 0x0a11 }
            r4.S(r8)     // Catch:{ all -> 0x0a11 }
        L_0x0880:
            r4.h0(r12)     // Catch:{ all -> 0x0a11 }
            r4.j0(r12)     // Catch:{ all -> 0x0a11 }
            r4.f0(r12)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24781c     // Catch:{ all -> 0x0a11 }
            r4.F(r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.f24788k     // Catch:{ all -> 0x0a11 }
            r4.c(r14)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24782d     // Catch:{ all -> 0x0a11 }
            r4.B(r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.f24783f     // Catch:{ all -> 0x0a11 }
            r4.d0(r14)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.f24784g     // Catch:{ all -> 0x0a11 }
            r4.X(r14)     // Catch:{ all -> 0x0a11 }
            boolean r8 = r3.f24786i     // Catch:{ all -> 0x0a11 }
            r4.y(r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.f24797t     // Catch:{ all -> 0x0a11 }
            r4.Z(r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r8 = r28.Z()     // Catch:{ all -> 0x0a11 }
            r8.Q(r4)     // Catch:{ all -> 0x0a11 }
        L_0x08b3:
            boolean r7 = r7.y()     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x08d0
            java.lang.String r7 = r4.u0()     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x08d0
            java.lang.String r7 = r4.u0()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = com.google.android.gms.common.internal.q.k(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            r2.zzc((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x08d0:
            java.lang.String r7 = r4.i()     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x08e7
            java.lang.String r7 = r4.i()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = com.google.android.gms.common.internal.q.k(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            r2.zzl((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x08e7:
            com.google.android.gms.measurement.internal.m r7 = r28.Z()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f24779a     // Catch:{ all -> 0x0a11 }
            java.util.List r7 = r7.H0(r8)     // Catch:{ all -> 0x0a11 }
            r8 = 0
        L_0x08f2:
            int r11 = r7.size()     // Catch:{ all -> 0x0a11 }
            if (r8 >= r11) goto L_0x0956
            com.google.android.gms.internal.measurement.zzfi$zzn$zza r11 = com.google.android.gms.internal.measurement.zzfi.zzn.zze()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r14 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.jb r14 = (com.google.android.gms.measurement.internal.jb) r14     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r14.f24733c     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzn$zza r11 = r11.zza((java.lang.String) r14)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r14 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.jb r14 = (com.google.android.gms.measurement.internal.jb) r14     // Catch:{ all -> 0x0a11 }
            long r14 = r14.f24734d     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzn$zza r11 = r11.zzb((long) r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.db r14 = r28.h0()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r15 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.jb r15 = (com.google.android.gms.measurement.internal.jb) r15     // Catch:{ all -> 0x0a11 }
            java.lang.Object r15 = r15.f24735e     // Catch:{ all -> 0x0a11 }
            r14.P(r11, r15)     // Catch:{ all -> 0x0a11 }
            r2.zza((com.google.android.gms.internal.measurement.zzfi.zzn.zza) r11)     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = "_sid"
            java.lang.Object r14 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.jb r14 = (com.google.android.gms.measurement.internal.jb) r14     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r14.f24733c     // Catch:{ all -> 0x0a11 }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x0a11 }
            if (r11 == 0) goto L_0x0953
            long r14 = r4.o0()     // Catch:{ all -> 0x0a11 }
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x0953
            com.google.android.gms.measurement.internal.db r11 = r28.h0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r3.f24802y     // Catch:{ all -> 0x0a11 }
            long r14 = r11.u(r14)     // Catch:{ all -> 0x0a11 }
            long r16 = r4.o0()     // Catch:{ all -> 0x0a11 }
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0953
            r2.zzp()     // Catch:{ all -> 0x0a11 }
        L_0x0953:
            int r8 = r8 + 1
            goto L_0x08f2
        L_0x0956:
            com.google.android.gms.measurement.internal.m r3 = r28.Z()     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.internal.measurement.zzkj r4 = r2.zzab()     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = (com.google.android.gms.internal.measurement.zzfi.zzj) r4     // Catch:{ IOException -> 0x09c9 }
            long r2 = r3.z(r4)     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.measurement.internal.m r4 = r28.Z()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z r7 = r5.f25177f     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x09bf
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0a11 }
        L_0x0972:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0985
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a11 }
            boolean r8 = r10.equals(r8)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0972
            goto L_0x09c0
        L_0x0985:
            com.google.android.gms.measurement.internal.i5 r7 = r28.c0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r5.f25172a     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = r5.f25173b     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.H(r8, r10)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r14 = r28.Z()     // Catch:{ all -> 0x0a11 }
            long r15 = r28.p0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r5.f25172a     // Catch:{ all -> 0x0a11 }
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r8
            com.google.android.gms.measurement.internal.n r8 = r14.E(r15, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x09bf
            long r7 = r8.f24842e     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.f r10 = r28.X()     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r5.f25172a     // Catch:{ all -> 0x0a11 }
            int r10 = r10.v(r11)     // Catch:{ all -> 0x0a11 }
            long r10 = (long) r10     // Catch:{ all -> 0x0a11 }
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x09bf
            goto L_0x09c0
        L_0x09bf:
            r6 = 0
        L_0x09c0:
            boolean r2 = r4.Y(r5, r2, r6)     // Catch:{ all -> 0x0a11 }
            if (r2 == 0) goto L_0x09e0
            r1.f25153o = r12     // Catch:{ all -> 0x0a11 }
            goto L_0x09e0
        L_0x09c9:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.n4 r4 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p4 r4 = r4.B()     // Catch:{ all -> 0x0a11 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.zzr()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.n4.q(r2)     // Catch:{ all -> 0x0a11 }
            r4.c(r5, r2, r3)     // Catch:{ all -> 0x0a11 }
        L_0x09e0:
            com.google.android.gms.measurement.internal.m r2 = r28.Z()     // Catch:{ all -> 0x0a11 }
            r2.O0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m r2 = r28.Z()
            r2.M0()
            r28.I()
            com.google.android.gms.measurement.internal.n4 r2 = r28.zzj()
            com.google.android.gms.measurement.internal.p4 r2 = r2.F()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r24
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x0a11:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.m r3 = r28.Z()
            r3.M0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.T(com.google.android.gms.measurement.internal.d0, com.google.android.gms.measurement.internal.lb):void");
    }

    private final v V(String str) {
        zzl().i();
        k0();
        if (!zznp.zza()) {
            return v.f25107f;
        }
        v vVar = this.C.get(str);
        if (vVar != null) {
            return vVar;
        }
        v B0 = Z().B0(str);
        this.C.put(str, B0);
        return B0;
    }

    private static boolean Y(lb lbVar) {
        return !TextUtils.isEmpty(lbVar.f24780b) || !TextUtils.isEmpty(lbVar.f24795r);
    }

    private final int a(FileChannel fileChannel) {
        zzl().i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().B().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    zzj().G().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e10) {
            zzj().B().b("Failed to read from channel", e10);
            return 0;
        }
    }

    private final v c(String str, v vVar, y6 y6Var, k kVar) {
        if (!zznp.zza()) {
            return v.f25107f;
        }
        int i10 = 90;
        if (c0().E(str) == null) {
            Boolean f10 = vVar.f();
            Boolean bool = Boolean.FALSE;
            if (f10 == bool) {
                i10 = vVar.a();
                kVar.c(y6.a.AD_USER_DATA, i10);
            } else {
                kVar.d(y6.a.AD_USER_DATA, j.FAILSAFE);
            }
            return new v(bool, i10, Boolean.TRUE, "-");
        }
        Boolean f11 = vVar.f();
        if (f11 != null) {
            i10 = vVar.a();
            kVar.c(y6.a.AD_USER_DATA, i10);
        } else {
            i5 i5Var = this.f25139a;
            y6.a aVar = y6.a.AD_USER_DATA;
            if (i5Var.x(str, aVar) == y6.a.AD_STORAGE && y6Var.s() != null) {
                f11 = y6Var.s();
                kVar.d(aVar, j.REMOTE_DELEGATION);
            }
            if (f11 == null) {
                f11 = Boolean.valueOf(this.f25139a.F(str, aVar));
                kVar.d(aVar, j.REMOTE_DEFAULT);
            }
        }
        q.k(f11);
        boolean T = this.f25139a.T(str);
        SortedSet<String> N = c0().N(str);
        if (!f11.booleanValue() || N.isEmpty()) {
            return new v(Boolean.FALSE, i10, Boolean.valueOf(T), "-");
        }
        Boolean bool2 = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(T);
        String str2 = MaxReward.DEFAULT_LABEL;
        if (T) {
            str2 = TextUtils.join(str2, N);
        }
        return new v(bool2, i10, valueOf, str2);
    }

    private static ua f(ua uaVar) {
        if (uaVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (uaVar.r()) {
            return uaVar;
        } else {
            String valueOf = String.valueOf(uaVar.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    public static va g(Context context) {
        q.k(context);
        q.k(context.getApplicationContext());
        if (H == null) {
            synchronized (va.class) {
                if (H == null) {
                    H = new va((fb) q.k(new fb(context)));
                }
            }
        }
        return H;
    }

    private final Boolean h(r5 r5Var) {
        try {
            if (r5Var.z() != -2147483648L) {
                if (r5Var.z() == ((long) c.a(this.f25150l.zza()).f(r5Var.t0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = c.a(this.f25150l.zza()).f(r5Var.t0(), 0).versionName;
                String h10 = r5Var.h();
                if (h10 != null && h10.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String i(y6 y6Var) {
        if (!y6Var.y()) {
            return null;
        }
        byte[] bArr = new byte[16];
        i0().P0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    private static void j(zzfi.zze.zza zza, int i10, String str) {
        List<zzfi.zzg> zzf = zza.zzf();
        int i11 = 0;
        while (i11 < zzf.size()) {
            if (!"_err".equals(zzf.get(i11).zzg())) {
                i11++;
            } else {
                return;
            }
        }
        zza.zza((zzfi.zzg) ((zzix) zzfi.zzg.zze().zza("_err").zza(Long.valueOf((long) i10).longValue()).zzab())).zza((zzfi.zzg) ((zzix) zzfi.zzg.zze().zza("_ev").zzb(str).zzab()));
    }

    private static void k(zzfi.zze.zza zza, String str) {
        List<zzfi.zzg> zzf = zza.zzf();
        for (int i10 = 0; i10 < zzf.size(); i10++) {
            if (str.equals(zzf.get(i10).zzg())) {
                zza.zza(i10);
                return;
            }
        }
    }

    private final void l(zzfi.zzj.zza zza, long j10, boolean z10) {
        jb jbVar;
        String str = z10 ? "_se" : "_lte";
        jb A0 = Z().A0(zza.zzr(), str);
        if (A0 == null || A0.f24735e == null) {
            jbVar = new jb(zza.zzr(), "auto", str, zzb().a(), Long.valueOf(j10));
        } else {
            jbVar = new jb(zza.zzr(), "auto", str, zzb().a(), Long.valueOf(((Long) A0.f24735e).longValue() + j10));
        }
        zzfi.zzn zzn = (zzfi.zzn) ((zzix) zzfi.zzn.zze().zza(str).zzb(zzb().a()).zza(((Long) jbVar.f24735e).longValue()).zzab());
        boolean z11 = false;
        int t10 = db.t(zza, str);
        if (t10 >= 0) {
            zza.zza(t10, zzn);
            z11 = true;
        }
        if (!z11) {
            zza.zza(zzn);
        }
        if (j10 > 0) {
            Z().Z(jbVar);
            zzj().F().c("Updated engagement user property. scope, value", z10 ? "session-scoped" : "lifetime", jbVar.f24735e);
        }
    }

    private final long p0() {
        long a10 = zzb().a();
        y9 y9Var = this.f25147i;
        y9Var.p();
        y9Var.i();
        long a11 = y9Var.f25306i.a();
        if (a11 == 0) {
            a11 = 1 + ((long) y9Var.f().P0().nextInt(86400000));
            y9Var.f25306i.b(a11);
        }
        return ((((a10 + a11) / 1000) / 60) / 60) / 24;
    }

    private final w4 q0() {
        w4 w4Var = this.f25142d;
        if (w4Var != null) {
            return w4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    static /* synthetic */ void r(va vaVar, fb fbVar) {
        vaVar.zzl().i();
        vaVar.f25149k = new g5(vaVar);
        m mVar = new m(vaVar);
        mVar.q();
        vaVar.f25141c = mVar;
        vaVar.X().m((h) q.k(vaVar.f25139a));
        y9 y9Var = new y9(vaVar);
        y9Var.q();
        vaVar.f25147i = y9Var;
        pb pbVar = new pb(vaVar);
        pbVar.q();
        vaVar.f25144f = pbVar;
        n8 n8Var = new n8(vaVar);
        n8Var.q();
        vaVar.f25146h = n8Var;
        pa paVar = new pa(vaVar);
        paVar.q();
        vaVar.f25143e = paVar;
        vaVar.f25142d = new w4(vaVar);
        if (vaVar.f25156r != vaVar.f25157s) {
            vaVar.zzj().B().c("Not all upload components initialized", Integer.valueOf(vaVar.f25156r), Integer.valueOf(vaVar.f25157s));
        }
        vaVar.f25151m = true;
    }

    private final pa r0() {
        return (pa) f(this.f25143e);
    }

    /* access modifiers changed from: package-private */
    public final void C(boolean z10) {
        I();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A[Catch:{ all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0131 A[Catch:{ SQLiteException -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0135 A[Catch:{ SQLiteException -> 0x0149 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(boolean r9, int r10, java.lang.Throwable r11, byte[] r12, java.lang.String r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.q5 r13 = r8.zzl()
            r13.i()
            r8.k0()
            r13 = 0
            if (r12 != 0) goto L_0x000f
            byte[] r12 = new byte[r13]     // Catch:{ all -> 0x01c0 }
        L_0x000f:
            java.util.List<java.lang.Long> r0 = r8.f25163y     // Catch:{ all -> 0x01c0 }
            java.lang.Object r0 = com.google.android.gms.common.internal.q.k(r0)     // Catch:{ all -> 0x01c0 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01c0 }
            r1 = 0
            r8.f25163y = r1     // Catch:{ all -> 0x01c0 }
            boolean r2 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x01c0 }
            r3 = 1
            if (r2 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.f r2 = r8.X()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.e0.Y0     // Catch:{ all -> 0x01c0 }
            boolean r2 = r2.n(r4)     // Catch:{ all -> 0x01c0 }
            if (r2 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x0039
        L_0x002f:
            r2 = 200(0xc8, float:2.8E-43)
            if (r10 == r2) goto L_0x0037
            r2 = 204(0xcc, float:2.86E-43)
            if (r10 != r2) goto L_0x0175
        L_0x0037:
            if (r11 != 0) goto L_0x0175
        L_0x0039:
            boolean r11 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x004d
            com.google.android.gms.measurement.internal.f r11 = r8.X()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.e0.Y0     // Catch:{ SQLiteException -> 0x0149 }
            boolean r11 = r11.n(r2)     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x004d
            if (r9 == 0) goto L_0x005c
        L_0x004d:
            com.google.android.gms.measurement.internal.y9 r11 = r8.f25147i     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.d5 r11 = r11.f25304g     // Catch:{ SQLiteException -> 0x0149 }
            m5.e r2 = r8.zzb()     // Catch:{ SQLiteException -> 0x0149 }
            long r4 = r2.a()     // Catch:{ SQLiteException -> 0x0149 }
            r11.b(r4)     // Catch:{ SQLiteException -> 0x0149 }
        L_0x005c:
            com.google.android.gms.measurement.internal.y9 r11 = r8.f25147i     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.d5 r11 = r11.f25305h     // Catch:{ SQLiteException -> 0x0149 }
            r4 = 0
            r11.b(r4)     // Catch:{ SQLiteException -> 0x0149 }
            r8.I()     // Catch:{ SQLiteException -> 0x0149 }
            boolean r11 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x009b
            com.google.android.gms.measurement.internal.f r11 = r8.X()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.e0.Y0     // Catch:{ SQLiteException -> 0x0149 }
            boolean r11 = r11.n(r2)     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x009b
            if (r9 == 0) goto L_0x007d
            goto L_0x009b
        L_0x007d:
            boolean r9 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x00b1
            com.google.android.gms.measurement.internal.f r9 = r8.X()     // Catch:{ SQLiteException -> 0x0149 }
            boolean r9 = r9.n(r2)     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x00b1
            com.google.android.gms.measurement.internal.n4 r9 = r8.zzj()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.F()     // Catch:{ SQLiteException -> 0x0149 }
            java.lang.String r10 = "Purged empty bundles"
            r9.a(r10)     // Catch:{ SQLiteException -> 0x0149 }
            goto L_0x00b1
        L_0x009b:
            com.google.android.gms.measurement.internal.n4 r9 = r8.zzj()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.F()     // Catch:{ SQLiteException -> 0x0149 }
            java.lang.String r11 = "Successful upload. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x0149 }
            int r12 = r12.length     // Catch:{ SQLiteException -> 0x0149 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0149 }
            r9.c(r11, r10, r12)     // Catch:{ SQLiteException -> 0x0149 }
        L_0x00b1:
            com.google.android.gms.measurement.internal.m r9 = r8.Z()     // Catch:{ SQLiteException -> 0x0149 }
            r9.L0()     // Catch:{ SQLiteException -> 0x0149 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0140 }
        L_0x00bc:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0140 }
            if (r10 == 0) goto L_0x0111
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0140 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0140 }
            com.google.android.gms.measurement.internal.m r11 = r8.Z()     // Catch:{ SQLiteException -> 0x0104 }
            long r6 = r10.longValue()     // Catch:{ SQLiteException -> 0x0104 }
            r11.i()     // Catch:{ SQLiteException -> 0x0104 }
            r11.p()     // Catch:{ SQLiteException -> 0x0104 }
            android.database.sqlite.SQLiteDatabase r12 = r11.w()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0104 }
            r0[r13] = r2     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r2 = "queue"
            java.lang.String r6 = "rowid=?"
            int r12 = r12.delete(r2, r6, r0)     // Catch:{ SQLiteException -> 0x00f5 }
            if (r12 != r3) goto L_0x00ed
            goto L_0x00bc
        L_0x00ed:
            android.database.sqlite.SQLiteException r12 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00f5 }
            java.lang.String r0 = "Deleted fewer rows from queue than expected"
            r12.<init>(r0)     // Catch:{ SQLiteException -> 0x00f5 }
            throw r12     // Catch:{ SQLiteException -> 0x00f5 }
        L_0x00f5:
            r12 = move-exception
            com.google.android.gms.measurement.internal.n4 r11 = r11.zzj()     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.p4 r11 = r11.B()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r0 = "Failed to delete a bundle in a queue table"
            r11.b(r0, r12)     // Catch:{ SQLiteException -> 0x0104 }
            throw r12     // Catch:{ SQLiteException -> 0x0104 }
        L_0x0104:
            r11 = move-exception
            java.util.List<java.lang.Long> r12 = r8.f25164z     // Catch:{ all -> 0x0140 }
            if (r12 == 0) goto L_0x0110
            boolean r10 = r12.contains(r10)     // Catch:{ all -> 0x0140 }
            if (r10 == 0) goto L_0x0110
            goto L_0x00bc
        L_0x0110:
            throw r11     // Catch:{ all -> 0x0140 }
        L_0x0111:
            com.google.android.gms.measurement.internal.m r9 = r8.Z()     // Catch:{ all -> 0x0140 }
            r9.O0()     // Catch:{ all -> 0x0140 }
            com.google.android.gms.measurement.internal.m r9 = r8.Z()     // Catch:{ SQLiteException -> 0x0149 }
            r9.M0()     // Catch:{ SQLiteException -> 0x0149 }
            r8.f25164z = r1     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.u4 r9 = r8.b0()     // Catch:{ SQLiteException -> 0x0149 }
            boolean r9 = r9.v()     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x0135
            boolean r9 = r8.J()     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x0135
            r8.o0()     // Catch:{ SQLiteException -> 0x0149 }
            goto L_0x013c
        L_0x0135:
            r9 = -1
            r8.A = r9     // Catch:{ SQLiteException -> 0x0149 }
            r8.I()     // Catch:{ SQLiteException -> 0x0149 }
        L_0x013c:
            r8.f25153o = r4     // Catch:{ SQLiteException -> 0x0149 }
            goto L_0x01ba
        L_0x0140:
            r9 = move-exception
            com.google.android.gms.measurement.internal.m r10 = r8.Z()     // Catch:{ SQLiteException -> 0x0149 }
            r10.M0()     // Catch:{ SQLiteException -> 0x0149 }
            throw r9     // Catch:{ SQLiteException -> 0x0149 }
        L_0x0149:
            r9 = move-exception
            com.google.android.gms.measurement.internal.n4 r10 = r8.zzj()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.p4 r10 = r10.B()     // Catch:{ all -> 0x01c0 }
            java.lang.String r11 = "Database error while trying to delete uploaded bundles"
            r10.b(r11, r9)     // Catch:{ all -> 0x01c0 }
            m5.e r9 = r8.zzb()     // Catch:{ all -> 0x01c0 }
            long r9 = r9.b()     // Catch:{ all -> 0x01c0 }
            r8.f25153o = r9     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.n4 r9 = r8.zzj()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.F()     // Catch:{ all -> 0x01c0 }
            java.lang.String r10 = "Disable upload, time"
            long r11 = r8.f25153o     // Catch:{ all -> 0x01c0 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01c0 }
            r9.b(r10, r11)     // Catch:{ all -> 0x01c0 }
            goto L_0x01ba
        L_0x0175:
            com.google.android.gms.measurement.internal.n4 r9 = r8.zzj()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.F()     // Catch:{ all -> 0x01c0 }
            java.lang.String r12 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01c0 }
            r9.c(r12, r1, r11)     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.y9 r9 = r8.f25147i     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.d5 r9 = r9.f25305h     // Catch:{ all -> 0x01c0 }
            m5.e r11 = r8.zzb()     // Catch:{ all -> 0x01c0 }
            long r11 = r11.a()     // Catch:{ all -> 0x01c0 }
            r9.b(r11)     // Catch:{ all -> 0x01c0 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x019f
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r3 = 0
        L_0x019f:
            if (r3 == 0) goto L_0x01b0
            com.google.android.gms.measurement.internal.y9 r9 = r8.f25147i     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.d5 r9 = r9.f25303f     // Catch:{ all -> 0x01c0 }
            m5.e r10 = r8.zzb()     // Catch:{ all -> 0x01c0 }
            long r10 = r10.a()     // Catch:{ all -> 0x01c0 }
            r9.b(r10)     // Catch:{ all -> 0x01c0 }
        L_0x01b0:
            com.google.android.gms.measurement.internal.m r9 = r8.Z()     // Catch:{ all -> 0x01c0 }
            r9.V(r0)     // Catch:{ all -> 0x01c0 }
            r8.I()     // Catch:{ all -> 0x01c0 }
        L_0x01ba:
            r8.f25159u = r13
            r8.H()
            return
        L_0x01c0:
            r9 = move-exception
            r8.f25159u = r13
            r8.H()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.D(boolean, int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final y6 L(String str) {
        zzl().i();
        k0();
        y6 y6Var = this.B.get(str);
        if (y6Var == null) {
            y6Var = Z().D0(str);
            if (y6Var == null) {
                y6Var = y6.f25289c;
            }
            x(str, y6Var);
        }
        return y6Var;
    }

    /* access modifiers changed from: package-private */
    public final String M(lb lbVar) {
        try {
            return (String) zzl().r(new za(this, lbVar)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzj().B().c("Failed to get app instance id. appId", n4.q(lbVar.f24779a), e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void N(d dVar) {
        lb R = R((String) q.k(dVar.f24446a));
        if (R != null) {
            O(dVar, R);
        }
    }

    /* access modifiers changed from: package-private */
    public final void O(d dVar, lb lbVar) {
        boolean z10;
        q.k(dVar);
        q.g(dVar.f24446a);
        q.k(dVar.f24447b);
        q.k(dVar.f24448c);
        q.g(dVar.f24448c.f24640b);
        zzl().i();
        k0();
        if (Y(lbVar)) {
            if (!lbVar.f24786i) {
                d(lbVar);
                return;
            }
            d dVar2 = new d(dVar);
            boolean z11 = false;
            dVar2.f24450f = false;
            Z().L0();
            try {
                d w02 = Z().w0((String) q.k(dVar2.f24446a), dVar2.f24448c.f24640b);
                if (w02 != null && !w02.f24447b.equals(dVar2.f24447b)) {
                    zzj().G().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f25150l.y().g(dVar2.f24448c.f24640b), dVar2.f24447b, w02.f24447b);
                }
                if (w02 != null && (z10 = w02.f24450f)) {
                    dVar2.f24447b = w02.f24447b;
                    dVar2.f24449d = w02.f24449d;
                    dVar2.f24453i = w02.f24453i;
                    dVar2.f24451g = w02.f24451g;
                    dVar2.f24454j = w02.f24454j;
                    dVar2.f24450f = z10;
                    hb hbVar = dVar2.f24448c;
                    dVar2.f24448c = new hb(hbVar.f24640b, w02.f24448c.f24641c, hbVar.v(), w02.f24448c.f24645h);
                } else if (TextUtils.isEmpty(dVar2.f24451g)) {
                    hb hbVar2 = dVar2.f24448c;
                    dVar2.f24448c = new hb(hbVar2.f24640b, dVar2.f24449d, hbVar2.v(), dVar2.f24448c.f24645h);
                    dVar2.f24450f = true;
                    z11 = true;
                }
                if (dVar2.f24450f) {
                    hb hbVar3 = dVar2.f24448c;
                    jb jbVar = new jb((String) q.k(dVar2.f24446a), dVar2.f24447b, hbVar3.f24640b, hbVar3.f24641c, q.k(hbVar3.v()));
                    if (Z().Z(jbVar)) {
                        zzj().A().d("User property updated immediately", dVar2.f24446a, this.f25150l.y().g(jbVar.f24733c), jbVar.f24735e);
                    } else {
                        zzj().B().d("(2)Too many active user properties, ignoring", n4.q(dVar2.f24446a), this.f25150l.y().g(jbVar.f24733c), jbVar.f24735e);
                    }
                    if (z11 && dVar2.f24454j != null) {
                        T(new d0(dVar2.f24454j, dVar2.f24449d), lbVar);
                    }
                }
                if (Z().X(dVar2)) {
                    zzj().A().d("Conditional property added", dVar2.f24446a, this.f25150l.y().g(dVar2.f24448c.f24640b), dVar2.f24448c.v());
                } else {
                    zzj().B().d("Too many conditional properties, ignoring", n4.q(dVar2.f24446a), this.f25150l.y().g(dVar2.f24448c.f24640b), dVar2.f24448c.v());
                }
                Z().O0();
            } finally {
                Z().M0();
            }
        }
    }

    public final pb S() {
        return (pb) f(this.f25144f);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03c3 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ee A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0405 A[SYNTHETIC, Splitter:B:131:0x0405] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04c1 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x052e A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d9 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0210 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0231 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0237 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0244 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0257 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(com.google.android.gms.measurement.internal.lb r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "com.android.vending"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.google.android.gms.measurement.internal.q5 r9 = r23.zzl()
            r9.i()
            r23.k0()
            com.google.android.gms.common.internal.q.k(r24)
            java.lang.String r9 = r2.f24779a
            com.google.android.gms.common.internal.q.g(r9)
            boolean r9 = Y(r24)
            if (r9 != 0) goto L_0x002b
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.m r9 = r23.Z()
            java.lang.String r10 = r2.f24779a
            com.google.android.gms.measurement.internal.r5 r9 = r9.y0(r10)
            r10 = 0
            if (r9 == 0) goto L_0x005e
            java.lang.String r12 = r9.j()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x005e
            java.lang.String r12 = r2.f24780b
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x005e
            r9.A(r10)
            com.google.android.gms.measurement.internal.m r12 = r23.Z()
            r12.Q(r9)
            com.google.android.gms.measurement.internal.i5 r9 = r23.c0()
            java.lang.String r12 = r2.f24779a
            r9.P(r12)
        L_0x005e:
            boolean r9 = r2.f24786i
            if (r9 != 0) goto L_0x0066
            r23.d(r24)
            return
        L_0x0066:
            long r12 = r2.f24791n
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0074
            m5.e r9 = r23.zzb()
            long r12 = r9.a()
        L_0x0074:
            com.google.android.gms.measurement.internal.w5 r9 = r1.f25150l
            com.google.android.gms.measurement.internal.y r9 = r9.v()
            r9.s()
            int r9 = r2.f24792o
            r15 = 1
            if (r9 == 0) goto L_0x009c
            if (r9 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.n4 r16 = r23.zzj()
            com.google.android.gms.measurement.internal.p4 r14 = r16.G()
            java.lang.String r15 = r2.f24779a
            java.lang.Object r15 = com.google.android.gms.measurement.internal.n4.q(r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r14.c(r10, r15, r9)
            r9 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.m r10 = r23.Z()
            r10.L0()
            com.google.android.gms.measurement.internal.m r10 = r23.Z()     // Catch:{ all -> 0x055c }
            java.lang.String r11 = r2.f24779a     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.jb r10 = r10.A0(r11, r0)     // Catch:{ all -> 0x055c }
            if (r10 == 0) goto L_0x00c1
            java.lang.String r11 = "auto"
            java.lang.String r14 = r10.f24732b     // Catch:{ all -> 0x055c }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x055c }
            if (r11 == 0) goto L_0x00ba
            goto L_0x00c1
        L_0x00ba:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            goto L_0x0107
        L_0x00c1:
            java.lang.Boolean r11 = r2.f24796s     // Catch:{ all -> 0x055c }
            if (r11 == 0) goto L_0x00fc
            com.google.android.gms.measurement.internal.hb r0 = new com.google.android.gms.measurement.internal.hb     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_npa"
            java.lang.Boolean r11 = r2.f24796s     // Catch:{ all -> 0x055c }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x055c }
            if (r11 == 0) goto L_0x00d4
            r20 = 1
            goto L_0x00d6
        L_0x00d4:
            r20 = 0
        L_0x00d6:
            java.lang.Long r11 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x055c }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 0
            r14 = r0
            r4 = 1
            r16 = r12
            r18 = r11
            r19 = r20
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x055c }
            if (r10 == 0) goto L_0x00f8
            java.lang.Object r10 = r10.f24735e     // Catch:{ all -> 0x055c }
            java.lang.Long r11 = r0.f24642d     // Catch:{ all -> 0x055c }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x055c }
            if (r10 != 0) goto L_0x0107
        L_0x00f8:
            r1.s(r0, r2)     // Catch:{ all -> 0x055c }
            goto L_0x0107
        L_0x00fc:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0107
            r1.z(r0, r2)     // Catch:{ all -> 0x055c }
        L_0x0107:
            com.google.android.gms.measurement.internal.m r0 = r23.Z()     // Catch:{ all -> 0x055c }
            java.lang.String r10 = r2.f24779a     // Catch:{ all -> 0x055c }
            java.lang.Object r10 = com.google.android.gms.common.internal.q.k(r10)     // Catch:{ all -> 0x055c }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.r5 r0 = r0.y0(r10)     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x01d7
            r23.i0()     // Catch:{ all -> 0x055c }
            java.lang.String r11 = r2.f24780b     // Catch:{ all -> 0x055c }
            java.lang.String r14 = r0.j()     // Catch:{ all -> 0x055c }
            java.lang.String r15 = r2.f24795r     // Catch:{ all -> 0x055c }
            java.lang.String r10 = r0.r0()     // Catch:{ all -> 0x055c }
            boolean r10 = com.google.android.gms.measurement.internal.ib.g0(r11, r14, r15, r10)     // Catch:{ all -> 0x055c }
            if (r10 == 0) goto L_0x01d7
            com.google.android.gms.measurement.internal.n4 r10 = r23.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r10 = r10.G()     // Catch:{ all -> 0x055c }
            java.lang.String r11 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r0.t0()     // Catch:{ all -> 0x055c }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.n4.q(r14)     // Catch:{ all -> 0x055c }
            r10.b(r11, r14)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.m r10 = r23.Z()     // Catch:{ all -> 0x055c }
            java.lang.String r11 = r0.t0()     // Catch:{ all -> 0x055c }
            r10.p()     // Catch:{ all -> 0x055c }
            r10.i()     // Catch:{ all -> 0x055c }
            com.google.android.gms.common.internal.q.g(r11)     // Catch:{ all -> 0x055c }
            android.database.sqlite.SQLiteDatabase r0 = r10.w()     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String[] r14 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01c4 }
            r14[r3] = r11     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String r15 = "events"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "user_attributes"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "conditional_properties"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "apps"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "raw_events"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "raw_events_metadata"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "event_filters"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "property_filters"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "audience_filter_values"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "consent_settings"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "default_event_params"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "trigger_uris"
            int r0 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r0
            if (r15 <= 0) goto L_0x01d6
            com.google.android.gms.measurement.internal.n4 r0 = r10.zzj()     // Catch:{ SQLiteException -> 0x01c4 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.F()     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String r3 = "Deleted application data. app, records"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x01c4 }
            r0.c(r3, r11, r8)     // Catch:{ SQLiteException -> 0x01c4 }
            goto L_0x01d6
        L_0x01c4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r10.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ all -> 0x055c }
            java.lang.String r8 = "Error deleting application data. appId, error"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.n4.q(r11)     // Catch:{ all -> 0x055c }
            r3.c(r8, r10, r0)     // Catch:{ all -> 0x055c }
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            if (r0 == 0) goto L_0x0231
            long r10 = r0.z()     // Catch:{ all -> 0x055c }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x01f1
            long r10 = r0.z()     // Catch:{ all -> 0x055c }
            r3 = r5
            long r4 = r2.f24788k     // Catch:{ all -> 0x055c }
            int r16 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x01f2
            r4 = 1
            goto L_0x01f3
        L_0x01f1:
            r3 = r5
        L_0x01f2:
            r4 = 0
        L_0x01f3:
            java.lang.String r5 = r0.h()     // Catch:{ all -> 0x055c }
            long r10 = r0.z()     // Catch:{ all -> 0x055c }
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x020b
            if (r5 == 0) goto L_0x020b
            java.lang.String r0 = r2.f24781c     // Catch:{ all -> 0x055c }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x055c }
            if (r0 != 0) goto L_0x020b
            r15 = 1
            goto L_0x020c
        L_0x020b:
            r15 = 0
        L_0x020c:
            r0 = r4 | r15
            if (r0 == 0) goto L_0x0232
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x055c }
            r0.<init>()     // Catch:{ all -> 0x055c }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r5)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.d0 r4 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_au"
            com.google.android.gms.measurement.internal.z r5 = new com.google.android.gms.measurement.internal.z     // Catch:{ all -> 0x055c }
            r5.<init>(r0)     // Catch:{ all -> 0x055c }
            java.lang.String r17 = "auto"
            r14 = r4
            r16 = r5
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x055c }
            r1.o(r4, r2)     // Catch:{ all -> 0x055c }
            goto L_0x0232
        L_0x0231:
            r3 = r5
        L_0x0232:
            r23.d(r24)     // Catch:{ all -> 0x055c }
            if (r9 != 0) goto L_0x0244
            com.google.android.gms.measurement.internal.m r0 = r23.Z()     // Catch:{ all -> 0x055c }
            java.lang.String r4 = r2.f24779a     // Catch:{ all -> 0x055c }
            java.lang.String r5 = "_f"
            com.google.android.gms.measurement.internal.a0 r0 = r0.x0(r4, r5)     // Catch:{ all -> 0x055c }
            goto L_0x0255
        L_0x0244:
            r4 = 1
            if (r9 != r4) goto L_0x0254
            com.google.android.gms.measurement.internal.m r0 = r23.Z()     // Catch:{ all -> 0x055c }
            java.lang.String r4 = r2.f24779a     // Catch:{ all -> 0x055c }
            java.lang.String r5 = "_v"
            com.google.android.gms.measurement.internal.a0 r0 = r0.x0(r4, r5)     // Catch:{ all -> 0x055c }
            goto L_0x0255
        L_0x0254:
            r0 = 0
        L_0x0255:
            if (r0 != 0) goto L_0x052e
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r10 = r12 / r4
            r14 = 1
            long r10 = r10 + r14
            long r10 = r10 * r4
            java.lang.String r4 = "_dac"
            java.lang.String r5 = "_et"
            java.lang.String r15 = "_r"
            java.lang.String r14 = "_c"
            if (r9 != 0) goto L_0x04de
            com.google.android.gms.measurement.internal.hb r0 = new com.google.android.gms.measurement.internal.hb     // Catch:{ all -> 0x055c }
            java.lang.String r9 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x055c }
            java.lang.String r19 = "auto"
            r10 = r14
            r14 = r0
            r11 = r15
            r15 = r9
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x055c }
            r1.s(r0, r2)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.q5 r0 = r23.zzl()     // Catch:{ all -> 0x055c }
            r0.i()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.g5 r0 = r1.f25149k     // Catch:{ all -> 0x055c }
            java.lang.Object r0 = com.google.android.gms.common.internal.q.k(r0)     // Catch:{ all -> 0x055c }
            r9 = r0
            com.google.android.gms.measurement.internal.g5 r9 = (com.google.android.gms.measurement.internal.g5) r9     // Catch:{ all -> 0x055c }
            java.lang.String r0 = r2.f24779a     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x0382
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x055c }
            if (r14 == 0) goto L_0x029d
            goto L_0x0382
        L_0x029d:
            com.google.android.gms.measurement.internal.w5 r14 = r9.f24597a     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.q5 r14 = r14.zzl()     // Catch:{ all -> 0x055c }
            r14.i()     // Catch:{ all -> 0x055c }
            boolean r14 = r9.b()     // Catch:{ all -> 0x055c }
            if (r14 != 0) goto L_0x02bd
            com.google.android.gms.measurement.internal.w5 r0 = r9.f24597a     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r0 = r0.E()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Install Referrer Reporter is not available"
            r0.a(r6)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x02bd:
            com.google.android.gms.measurement.internal.f5 r14 = new com.google.android.gms.measurement.internal.f5     // Catch:{ all -> 0x055c }
            r14.<init>(r9, r0)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.w5 r0 = r9.f24597a     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.q5 r0 = r0.zzl()     // Catch:{ all -> 0x055c }
            r0.i()     // Catch:{ all -> 0x055c }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x055c }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x055c }
            java.lang.String r8 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r6, r8)     // Catch:{ all -> 0x055c }
            r0.setComponent(r15)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.w5 r8 = r9.f24597a     // Catch:{ all -> 0x055c }
            android.content.Context r8 = r8.zza()     // Catch:{ all -> 0x055c }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x055c }
            if (r8 != 0) goto L_0x02f9
            com.google.android.gms.measurement.internal.w5 r0 = r9.f24597a     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r0 = r0.I()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.a(r6)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x02f9:
            r15 = 0
            java.util.List r8 = r8.queryIntentServices(r0, r15)     // Catch:{ all -> 0x055c }
            if (r8 == 0) goto L_0x0372
            boolean r17 = r8.isEmpty()     // Catch:{ all -> 0x055c }
            if (r17 != 0) goto L_0x0372
            java.lang.Object r8 = r8.get(r15)     // Catch:{ all -> 0x055c }
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8     // Catch:{ all -> 0x055c }
            android.content.pm.ServiceInfo r8 = r8.serviceInfo     // Catch:{ all -> 0x055c }
            if (r8 == 0) goto L_0x0391
            java.lang.String r15 = r8.packageName     // Catch:{ all -> 0x055c }
            java.lang.String r8 = r8.name     // Catch:{ all -> 0x055c }
            if (r8 == 0) goto L_0x0362
            boolean r6 = r6.equals(r15)     // Catch:{ all -> 0x055c }
            if (r6 == 0) goto L_0x0362
            boolean r6 = r9.b()     // Catch:{ all -> 0x055c }
            if (r6 == 0) goto L_0x0362
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x055c }
            r6.<init>(r0)     // Catch:{ all -> 0x055c }
            l5.a r0 = l5.a.b()     // Catch:{ RuntimeException -> 0x034d }
            com.google.android.gms.measurement.internal.w5 r8 = r9.f24597a     // Catch:{ RuntimeException -> 0x034d }
            android.content.Context r8 = r8.zza()     // Catch:{ RuntimeException -> 0x034d }
            r15 = 1
            boolean r0 = r0.a(r8, r6, r14, r15)     // Catch:{ RuntimeException -> 0x034d }
            com.google.android.gms.measurement.internal.w5 r6 = r9.f24597a     // Catch:{ RuntimeException -> 0x034d }
            com.google.android.gms.measurement.internal.n4 r6 = r6.zzj()     // Catch:{ RuntimeException -> 0x034d }
            com.google.android.gms.measurement.internal.p4 r6 = r6.F()     // Catch:{ RuntimeException -> 0x034d }
            java.lang.String r14 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0347
            java.lang.String r0 = "available"
            goto L_0x0349
        L_0x0347:
            java.lang.String r0 = "not available"
        L_0x0349:
            r6.b(r14, r0)     // Catch:{ RuntimeException -> 0x034d }
            goto L_0x0391
        L_0x034d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.w5 r6 = r9.f24597a     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.n4 r6 = r6.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r6 = r6.B()     // Catch:{ all -> 0x055c }
            java.lang.String r9 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x055c }
            r6.b(r9, r0)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x0362:
            com.google.android.gms.measurement.internal.w5 r0 = r9.f24597a     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r0 = r0.G()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.a(r6)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x0372:
            com.google.android.gms.measurement.internal.w5 r0 = r9.f24597a     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r0 = r0.E()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.a(r6)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x0382:
            com.google.android.gms.measurement.internal.w5 r0 = r9.f24597a     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r0 = r0.I()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Install Referrer Reporter was called with invalid app package name"
            r0.a(r6)     // Catch:{ all -> 0x055c }
        L_0x0391:
            com.google.android.gms.measurement.internal.q5 r0 = r23.zzl()     // Catch:{ all -> 0x055c }
            r0.i()     // Catch:{ all -> 0x055c }
            r23.k0()     // Catch:{ all -> 0x055c }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x055c }
            r6.<init>()     // Catch:{ all -> 0x055c }
            r14 = 1
            r6.putLong(r10, r14)     // Catch:{ all -> 0x055c }
            r6.putLong(r11, r14)     // Catch:{ all -> 0x055c }
            r9 = 0
            r6.putLong(r7, r9)     // Catch:{ all -> 0x055c }
            r6.putLong(r3, r9)     // Catch:{ all -> 0x055c }
            r11 = r22
            r6.putLong(r11, r9)     // Catch:{ all -> 0x055c }
            r15 = r21
            r6.putLong(r15, r9)     // Catch:{ all -> 0x055c }
            r9 = 1
            r6.putLong(r5, r9)     // Catch:{ all -> 0x055c }
            boolean r0 = r2.f24794q     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x03c6
            r6.putLong(r4, r9)     // Catch:{ all -> 0x055c }
        L_0x03c6:
            java.lang.String r0 = r2.f24779a     // Catch:{ all -> 0x055c }
            java.lang.Object r0 = com.google.android.gms.common.internal.q.k(r0)     // Catch:{ all -> 0x055c }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.m r0 = r23.Z()     // Catch:{ all -> 0x055c }
            com.google.android.gms.common.internal.q.g(r4)     // Catch:{ all -> 0x055c }
            r0.i()     // Catch:{ all -> 0x055c }
            r0.p()     // Catch:{ all -> 0x055c }
            java.lang.String r5 = "first_open_count"
            long r9 = r0.r0(r4, r5)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.w5 r0 = r1.f25150l     // Catch:{ all -> 0x055c }
            android.content.Context r0 = r0.zza()     // Catch:{ all -> 0x055c }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x055c }
            if (r0 != 0) goto L_0x0405
            com.google.android.gms.measurement.internal.n4 r0 = r23.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()     // Catch:{ all -> 0x055c }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.n4.q(r4)     // Catch:{ all -> 0x055c }
            r0.b(r5, r4)     // Catch:{ all -> 0x055c }
            r22 = r3
        L_0x0401:
            r3 = 0
            goto L_0x04bd
        L_0x0405:
            com.google.android.gms.measurement.internal.w5 r0 = r1.f25150l     // Catch:{ NameNotFoundException -> 0x0415 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0415 }
            o5.b r0 = o5.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0415 }
            r5 = 0
            android.content.pm.PackageInfo r0 = r0.f(r4, r5)     // Catch:{ NameNotFoundException -> 0x0415 }
            goto L_0x0428
        L_0x0415:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r5 = r23.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch:{ all -> 0x055c }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r4)     // Catch:{ all -> 0x055c }
            r5.c(r14, r8, r0)     // Catch:{ all -> 0x055c }
            r0 = 0
        L_0x0428:
            if (r0 == 0) goto L_0x047c
            r8 = r15
            long r14 = r0.firstInstallTime     // Catch:{ all -> 0x055c }
            r16 = 0
            int r5 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r22 = r3
            if (r5 == 0) goto L_0x0479
            r5 = r4
            long r3 = r0.lastUpdateTime     // Catch:{ all -> 0x055c }
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x045b
            com.google.android.gms.measurement.internal.f r0 = r23.X()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.e0.f24521o0     // Catch:{ all -> 0x055c }
            boolean r0 = r0.n(r3)     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x0454
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0459
            r3 = 1
            r6.putLong(r7, r3)     // Catch:{ all -> 0x055c }
            goto L_0x0459
        L_0x0454:
            r3 = 1
            r6.putLong(r7, r3)     // Catch:{ all -> 0x055c }
        L_0x0459:
            r15 = 0
            goto L_0x045c
        L_0x045b:
            r15 = 1
        L_0x045c:
            com.google.android.gms.measurement.internal.hb r0 = new com.google.android.gms.measurement.internal.hb     // Catch:{ all -> 0x055c }
            java.lang.String r3 = "_fi"
            if (r15 == 0) goto L_0x0465
            r14 = 1
            goto L_0x0467
        L_0x0465:
            r14 = 0
        L_0x0467:
            java.lang.Long r18 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x055c }
            java.lang.String r19 = "auto"
            r14 = r0
            r4 = r8
            r15 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x055c }
            r1.s(r0, r2)     // Catch:{ all -> 0x055c }
            goto L_0x0480
        L_0x0479:
            r5 = r4
            r4 = r8
            goto L_0x0480
        L_0x047c:
            r22 = r3
            r5 = r4
            r4 = r15
        L_0x0480:
            com.google.android.gms.measurement.internal.w5 r0 = r1.f25150l     // Catch:{ NameNotFoundException -> 0x0490 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0490 }
            o5.b r0 = o5.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0490 }
            r3 = 0
            android.content.pm.ApplicationInfo r0 = r0.c(r5, r3)     // Catch:{ NameNotFoundException -> 0x0490 }
            goto L_0x04a3
        L_0x0490:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r23.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ all -> 0x055c }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.n4.q(r5)     // Catch:{ all -> 0x055c }
            r3.c(r7, r5, r0)     // Catch:{ all -> 0x055c }
            r0 = 0
        L_0x04a3:
            if (r0 == 0) goto L_0x0401
            int r3 = r0.flags     // Catch:{ all -> 0x055c }
            r5 = 1
            r3 = r3 & r5
            if (r3 == 0) goto L_0x04b0
            r7 = 1
            r6.putLong(r11, r7)     // Catch:{ all -> 0x055c }
        L_0x04b0:
            int r0 = r0.flags     // Catch:{ all -> 0x055c }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0401
            r7 = 1
            r6.putLong(r4, r7)     // Catch:{ all -> 0x055c }
            goto L_0x0401
        L_0x04bd:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04c6
            r3 = r22
            r6.putLong(r3, r9)     // Catch:{ all -> 0x055c }
        L_0x04c6:
            com.google.android.gms.measurement.internal.d0 r0 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_f"
            com.google.android.gms.measurement.internal.z r3 = new com.google.android.gms.measurement.internal.z     // Catch:{ all -> 0x055c }
            r3.<init>(r6)     // Catch:{ all -> 0x055c }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x055c }
            r1.P(r0, r2)     // Catch:{ all -> 0x055c }
            goto L_0x054d
        L_0x04de:
            r6 = r14
            r3 = r15
            r7 = 1
            if (r9 != r7) goto L_0x054d
            com.google.android.gms.measurement.internal.hb r0 = new com.google.android.gms.measurement.internal.hb     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x055c }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x055c }
            r1.s(r0, r2)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.q5 r0 = r23.zzl()     // Catch:{ all -> 0x055c }
            r0.i()     // Catch:{ all -> 0x055c }
            r23.k0()     // Catch:{ all -> 0x055c }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x055c }
            r0.<init>()     // Catch:{ all -> 0x055c }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x055c }
            r0.putLong(r3, r7)     // Catch:{ all -> 0x055c }
            r0.putLong(r5, r7)     // Catch:{ all -> 0x055c }
            boolean r3 = r2.f24794q     // Catch:{ all -> 0x055c }
            if (r3 == 0) goto L_0x0517
            r0.putLong(r4, r7)     // Catch:{ all -> 0x055c }
        L_0x0517:
            com.google.android.gms.measurement.internal.d0 r3 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_v"
            com.google.android.gms.measurement.internal.z r4 = new com.google.android.gms.measurement.internal.z     // Catch:{ all -> 0x055c }
            r4.<init>(r0)     // Catch:{ all -> 0x055c }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x055c }
            r1.P(r3, r2)     // Catch:{ all -> 0x055c }
            goto L_0x054d
        L_0x052e:
            boolean r0 = r2.f24787j     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x054d
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x055c }
            r0.<init>()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.d0 r3 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_cd"
            com.google.android.gms.measurement.internal.z r4 = new com.google.android.gms.measurement.internal.z     // Catch:{ all -> 0x055c }
            r4.<init>(r0)     // Catch:{ all -> 0x055c }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x055c }
            r1.P(r3, r2)     // Catch:{ all -> 0x055c }
        L_0x054d:
            com.google.android.gms.measurement.internal.m r0 = r23.Z()     // Catch:{ all -> 0x055c }
            r0.O0()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.m r0 = r23.Z()
            r0.M0()
            return
        L_0x055c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.m r2 = r23.Z()
            r2.M0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.U(com.google.android.gms.measurement.internal.lb):void");
    }

    /* access modifiers changed from: package-private */
    public final void W(lb lbVar) {
        if (this.f25163y != null) {
            ArrayList arrayList = new ArrayList();
            this.f25164z = arrayList;
            arrayList.addAll(this.f25163y);
        }
        m Z = Z();
        String str = (String) q.k(lbVar.f24779a);
        q.g(str);
        Z.i();
        Z.p();
        try {
            SQLiteDatabase w10 = Z.w();
            String[] strArr = {str};
            int delete = w10.delete("apps", "app_id=?", strArr) + 0 + w10.delete("events", "app_id=?", strArr) + w10.delete("user_attributes", "app_id=?", strArr) + w10.delete("conditional_properties", "app_id=?", strArr) + w10.delete("raw_events", "app_id=?", strArr) + w10.delete("raw_events_metadata", "app_id=?", strArr) + w10.delete("queue", "app_id=?", strArr) + w10.delete("audience_filter_values", "app_id=?", strArr) + w10.delete("main_event_params", "app_id=?", strArr) + w10.delete("default_event_params", "app_id=?", strArr) + w10.delete("trigger_uris", "app_id=?", strArr);
            if (delete > 0) {
                Z.zzj().F().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            Z.zzj().B().c("Error resetting analytics data. appId, error", n4.q(str), e10);
        }
        if (lbVar.f24786i) {
            U(lbVar);
        }
    }

    public final f X() {
        return ((w5) q.k(this.f25150l)).u();
    }

    public final m Z() {
        return (m) f(this.f25141c);
    }

    public final m4 a0() {
        return this.f25150l.y();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle b(java.lang.String r6) {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.q5 r0 = r5.zzl()
            r0.i()
            r5.k0()
            boolean r0 = com.google.android.gms.internal.measurement.zznp.zza()
            r1 = 0
            if (r0 == 0) goto L_0x007e
            com.google.android.gms.measurement.internal.i5 r0 = r5.c0()
            com.google.android.gms.internal.measurement.zzfc$zza r0 = r0.E(r6)
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.y6 r1 = r5.L(r6)
            android.os.Bundle r2 = r1.o()
            r0.putAll(r2)
            com.google.android.gms.measurement.internal.v r2 = r5.V(r6)
            com.google.android.gms.measurement.internal.k r3 = new com.google.android.gms.measurement.internal.k
            r3.<init>()
            com.google.android.gms.measurement.internal.v r1 = r5.c(r6, r2, r1, r3)
            android.os.Bundle r1 = r1.e()
            r0.putAll(r1)
            com.google.android.gms.measurement.internal.db r1 = r5.h0()
            boolean r1 = r1.c0(r6)
            r2 = 1
            if (r1 != 0) goto L_0x0070
            com.google.android.gms.measurement.internal.m r1 = r5.Z()
            java.lang.String r3 = "_npa"
            com.google.android.gms.measurement.internal.jb r1 = r1.A0(r6, r3)
            if (r1 == 0) goto L_0x0064
            java.lang.Object r6 = r1.f24735e
            r3 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            boolean r6 = r6.equals(r1)
            goto L_0x0071
        L_0x0064:
            com.google.android.gms.measurement.internal.i5 r1 = r5.f25139a
            com.google.android.gms.measurement.internal.y6$a r3 = com.google.android.gms.measurement.internal.y6.a.AD_PERSONALIZATION
            boolean r6 = r1.F(r6, r3)
            if (r6 == 0) goto L_0x0070
            r6 = 0
            goto L_0x0071
        L_0x0070:
            r6 = 1
        L_0x0071:
            if (r6 != r2) goto L_0x0076
            java.lang.String r6 = "denied"
            goto L_0x0078
        L_0x0076:
            java.lang.String r6 = "granted"
        L_0x0078:
            java.lang.String r1 = "ad_personalization"
            r0.putString(r1, r6)
            return r0
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.b(java.lang.String):android.os.Bundle");
    }

    public final u4 b0() {
        return (u4) f(this.f25140b);
    }

    public final i5 c0() {
        return (i5) f(this.f25139a);
    }

    /* access modifiers changed from: package-private */
    public final r5 d(lb lbVar) {
        zzl().i();
        k0();
        q.k(lbVar);
        q.g(lbVar.f24779a);
        if (!lbVar.f24801x.isEmpty()) {
            this.D.put(lbVar.f24779a, new b(lbVar.f24801x));
        }
        r5 y02 = Z().y0(lbVar.f24779a);
        y6 d10 = L(lbVar.f24779a).d(y6.e(lbVar.f24800w));
        String v10 = d10.x() ? this.f25147i.v(lbVar.f24779a, lbVar.f24793p) : MaxReward.DEFAULT_LABEL;
        if (y02 == null) {
            y02 = new r5(this.f25150l, lbVar.f24779a);
            if (d10.y()) {
                y02.x(i(d10));
            }
            if (d10.x()) {
                y02.S(v10);
            }
        } else if (d10.x() && v10 != null && !v10.equals(y02.l())) {
            y02.S(v10);
            if (lbVar.f24793p && !"00000000-0000-0000-0000-000000000000".equals(this.f25147i.u(lbVar.f24779a, d10).first)) {
                y02.x(i(d10));
                if (Z().A0(lbVar.f24779a, "_id") != null && Z().A0(lbVar.f24779a, "_lair") == null) {
                    Z().Z(new jb(lbVar.f24779a, "auto", "_lair", zzb().a(), 1L));
                }
            }
        } else if (TextUtils.isEmpty(y02.u0()) && d10.y()) {
            y02.x(i(d10));
        }
        y02.M(lbVar.f24780b);
        y02.e(lbVar.f24795r);
        if (!TextUtils.isEmpty(lbVar.f24789l)) {
            y02.J(lbVar.f24789l);
        }
        long j10 = lbVar.f24783f;
        if (j10 != 0) {
            y02.d0(j10);
        }
        if (!TextUtils.isEmpty(lbVar.f24781c)) {
            y02.F(lbVar.f24781c);
        }
        y02.c(lbVar.f24788k);
        String str = lbVar.f24782d;
        if (str != null) {
            y02.B(str);
        }
        y02.X(lbVar.f24784g);
        y02.y(lbVar.f24786i);
        if (!TextUtils.isEmpty(lbVar.f24785h)) {
            y02.P(lbVar.f24785h);
        }
        y02.g(lbVar.f24793p);
        y02.d(lbVar.f24796s);
        y02.Z(lbVar.f24797t);
        if (zzps.zza() && (X().n(e0.f24537w0) || X().w(lbVar.f24779a, e0.f24541y0))) {
            y02.V(lbVar.f24802y);
        }
        if (zznq.zza() && X().n(e0.f24535v0)) {
            y02.f(lbVar.f24798u);
        } else if (zznq.zza() && X().n(e0.f24533u0)) {
            y02.f((List<String>) null);
        }
        if (zzqd.zza() && X().n(e0.A0)) {
            y02.C(lbVar.f24803z);
        }
        if (zzpg.zza() && X().n(e0.L0)) {
            y02.b(lbVar.D);
        }
        y02.n0(lbVar.A);
        if (y02.s()) {
            Z().Q(y02);
        }
        return y02;
    }

    /* access modifiers changed from: package-private */
    public final w5 d0() {
        return this.f25150l;
    }

    public final n8 e0() {
        return (n8) f(this.f25146h);
    }

    public final y9 f0() {
        return this.f25147i;
    }

    public final ta g0() {
        return this.f25148j;
    }

    public final db h0() {
        return (db) f(this.f25145g);
    }

    public final ib i0() {
        return ((w5) q.k(this.f25150l)).G();
    }

    /* access modifiers changed from: package-private */
    public final void j0() {
        zzl().i();
        k0();
        if (!this.f25152n) {
            this.f25152n = true;
            if (K()) {
                int a10 = a(this.f25162x);
                int y10 = this.f25150l.w().y();
                zzl().i();
                if (a10 > y10) {
                    zzj().B().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a10), Integer.valueOf(y10));
                } else if (a10 >= y10) {
                } else {
                    if (E(y10, this.f25162x)) {
                        zzj().F().c("Storage version upgraded. Previous, current version", Integer.valueOf(a10), Integer.valueOf(y10));
                    } else {
                        zzj().B().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(a10), Integer.valueOf(y10));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void k0() {
        if (!this.f25151m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    public final void l0() {
        this.f25157s++;
    }

    /* access modifiers changed from: package-private */
    public final void m(d dVar) {
        lb R = R((String) q.k(dVar.f24446a));
        if (R != null) {
            n(dVar, R);
        }
    }

    /* access modifiers changed from: package-private */
    public final void m0() {
        this.f25156r++;
    }

    /* access modifiers changed from: package-private */
    public final void n(d dVar, lb lbVar) {
        q.k(dVar);
        q.g(dVar.f24446a);
        q.k(dVar.f24448c);
        q.g(dVar.f24448c.f24640b);
        zzl().i();
        k0();
        if (Y(lbVar)) {
            if (!lbVar.f24786i) {
                d(lbVar);
                return;
            }
            Z().L0();
            try {
                d(lbVar);
                String str = (String) q.k(dVar.f24446a);
                d w02 = Z().w0(str, dVar.f24448c.f24640b);
                if (w02 != null) {
                    zzj().A().c("Removing conditional user property", dVar.f24446a, this.f25150l.y().g(dVar.f24448c.f24640b));
                    Z().y(str, dVar.f24448c.f24640b);
                    if (w02.f24450f) {
                        Z().G0(str, dVar.f24448c.f24640b);
                    }
                    d0 d0Var = dVar.f24456l;
                    if (d0Var != null) {
                        z zVar = d0Var.f24458b;
                        T((d0) q.k(i0().B(str, ((d0) q.k(dVar.f24456l)).f24457a, zVar != null ? zVar.w() : null, w02.f24447b, dVar.f24456l.f24460d, true, true)), lbVar);
                    }
                } else {
                    zzj().G().c("Conditional user property doesn't exist", n4.q(dVar.f24446a), this.f25150l.y().g(dVar.f24448c.f24640b));
                }
                Z().O0();
            } finally {
                Z().M0();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void n0() {
        zzl().i();
        Z().N0();
        if (this.f25147i.f25304g.a() == 0) {
            this.f25147i.f25304g.b(zzb().a());
        }
        I();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002b, code lost:
        r4 = r1.F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(com.google.android.gms.measurement.internal.d0 r20, com.google.android.gms.measurement.internal.lb r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            com.google.android.gms.common.internal.q.k(r21)
            java.lang.String r2 = r0.f24779a
            com.google.android.gms.common.internal.q.g(r2)
            com.google.android.gms.measurement.internal.q5 r2 = r19.zzl()
            r2.i()
            r19.k0()
            java.lang.String r2 = r0.f24779a
            r3 = r20
            long r10 = r3.f24460d
            com.google.android.gms.measurement.internal.r4 r3 = com.google.android.gms.measurement.internal.r4.b(r20)
            com.google.android.gms.measurement.internal.q5 r4 = r19.zzl()
            r4.i()
            com.google.android.gms.measurement.internal.p8 r4 = r1.E
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = r1.F
            if (r4 == 0) goto L_0x0039
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            com.google.android.gms.measurement.internal.p8 r4 = r1.E
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            android.os.Bundle r5 = r3.f24995d
            r12 = 0
            com.google.android.gms.measurement.internal.ib.R(r4, r5, r12)
            com.google.android.gms.measurement.internal.d0 r3 = r3.a()
            r19.h0()
            boolean r4 = com.google.android.gms.measurement.internal.db.X(r3, r0)
            if (r4 != 0) goto L_0x004e
            return
        L_0x004e:
            boolean r4 = r0.f24786i
            if (r4 != 0) goto L_0x0056
            r1.d(r0)
            return
        L_0x0056:
            java.util.List<java.lang.String> r4 = r0.f24798u
            if (r4 == 0) goto L_0x0097
            java.lang.String r5 = r3.f24457a
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0085
            com.google.android.gms.measurement.internal.z r4 = r3.f24458b
            android.os.Bundle r4 = r4.w()
            r5 = 1
            java.lang.String r7 = "ga_safelisted"
            r4.putLong(r7, r5)
            com.google.android.gms.measurement.internal.d0 r5 = new com.google.android.gms.measurement.internal.d0
            java.lang.String r14 = r3.f24457a
            com.google.android.gms.measurement.internal.z r15 = new com.google.android.gms.measurement.internal.z
            r15.<init>(r4)
            java.lang.String r4 = r3.f24459c
            long r6 = r3.f24460d
            r13 = r5
            r16 = r4
            r17 = r6
            r13.<init>(r14, r15, r16, r17)
            goto L_0x0098
        L_0x0085:
            com.google.android.gms.measurement.internal.n4 r0 = r19.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.A()
            java.lang.String r4 = r3.f24457a
            java.lang.String r3 = r3.f24459c
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r0.d(r5, r2, r4, r3)
            return
        L_0x0097:
            r13 = r3
        L_0x0098:
            com.google.android.gms.measurement.internal.m r3 = r19.Z()
            r3.L0()
            com.google.android.gms.measurement.internal.m r3 = r19.Z()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.common.internal.q.g(r2)     // Catch:{ all -> 0x02f2 }
            r3.i()     // Catch:{ all -> 0x02f2 }
            r3.p()     // Catch:{ all -> 0x02f2 }
            r4 = 0
            r6 = 2
            r14 = 1
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.n4 r3 = r3.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.G()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = "Invalid time querying timed out conditional properties"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.n4.q(r2)     // Catch:{ all -> 0x02f2 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r3.c(r4, r5, r8)     // Catch:{ all -> 0x02f2 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f2 }
            goto L_0x00de
        L_0x00ce:
            java.lang.String r4 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x02f2 }
            r5[r12] = r2     // Catch:{ all -> 0x02f2 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r5[r14] = r8     // Catch:{ all -> 0x02f2 }
            java.util.List r3 = r3.N(r4, r5)     // Catch:{ all -> 0x02f2 }
        L_0x00de:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02f2 }
        L_0x00e2:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x02f2 }
            if (r4 == 0) goto L_0x012e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.d r4 = (com.google.android.gms.measurement.internal.d) r4     // Catch:{ all -> 0x02f2 }
            if (r4 == 0) goto L_0x00e2
            com.google.android.gms.measurement.internal.n4 r5 = r19.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.F()     // Catch:{ all -> 0x02f2 }
            java.lang.String r8 = "User property timed out"
            java.lang.String r9 = r4.f24446a     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.w5 r15 = r1.f25150l     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.m4 r15 = r15.y()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.hb r14 = r4.f24448c     // Catch:{ all -> 0x02f2 }
            java.lang.String r14 = r14.f24640b     // Catch:{ all -> 0x02f2 }
            java.lang.String r14 = r15.g(r14)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.hb r15 = r4.f24448c     // Catch:{ all -> 0x02f2 }
            java.lang.Object r15 = r15.v()     // Catch:{ all -> 0x02f2 }
            r5.d(r8, r9, r14, r15)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.d0 r5 = r4.f24452h     // Catch:{ all -> 0x02f2 }
            if (r5 == 0) goto L_0x0121
            com.google.android.gms.measurement.internal.d0 r5 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.d0 r8 = r4.f24452h     // Catch:{ all -> 0x02f2 }
            r5.<init>(r8, r10)     // Catch:{ all -> 0x02f2 }
            r1.T(r5, r0)     // Catch:{ all -> 0x02f2 }
        L_0x0121:
            com.google.android.gms.measurement.internal.m r5 = r19.Z()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.hb r4 = r4.f24448c     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = r4.f24640b     // Catch:{ all -> 0x02f2 }
            r5.y(r2, r4)     // Catch:{ all -> 0x02f2 }
            r14 = 1
            goto L_0x00e2
        L_0x012e:
            com.google.android.gms.measurement.internal.m r3 = r19.Z()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.common.internal.q.g(r2)     // Catch:{ all -> 0x02f2 }
            r3.i()     // Catch:{ all -> 0x02f2 }
            r3.p()     // Catch:{ all -> 0x02f2 }
            if (r7 >= 0) goto L_0x0157
            com.google.android.gms.measurement.internal.n4 r3 = r3.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.G()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = "Invalid time querying expired conditional properties"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.n4.q(r2)     // Catch:{ all -> 0x02f2 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r3.c(r4, r5, r8)     // Catch:{ all -> 0x02f2 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f2 }
            goto L_0x0168
        L_0x0157:
            java.lang.String r4 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x02f2 }
            r5[r12] = r2     // Catch:{ all -> 0x02f2 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r9 = 1
            r5[r9] = r8     // Catch:{ all -> 0x02f2 }
            java.util.List r3 = r3.N(r4, r5)     // Catch:{ all -> 0x02f2 }
        L_0x0168:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02f2 }
            int r5 = r3.size()     // Catch:{ all -> 0x02f2 }
            r4.<init>(r5)     // Catch:{ all -> 0x02f2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02f2 }
        L_0x0175:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x02f2 }
            if (r5 == 0) goto L_0x01c5
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.d r5 = (com.google.android.gms.measurement.internal.d) r5     // Catch:{ all -> 0x02f2 }
            if (r5 == 0) goto L_0x0175
            com.google.android.gms.measurement.internal.n4 r8 = r19.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.p4 r8 = r8.F()     // Catch:{ all -> 0x02f2 }
            java.lang.String r9 = "User property expired"
            java.lang.String r14 = r5.f24446a     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.w5 r15 = r1.f25150l     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.m4 r15 = r15.y()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.hb r6 = r5.f24448c     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r6.f24640b     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r15.g(r6)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.hb r15 = r5.f24448c     // Catch:{ all -> 0x02f2 }
            java.lang.Object r15 = r15.v()     // Catch:{ all -> 0x02f2 }
            r8.d(r9, r14, r6, r15)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.m r6 = r19.Z()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.hb r8 = r5.f24448c     // Catch:{ all -> 0x02f2 }
            java.lang.String r8 = r8.f24640b     // Catch:{ all -> 0x02f2 }
            r6.G0(r2, r8)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.d0 r6 = r5.f24456l     // Catch:{ all -> 0x02f2 }
            if (r6 == 0) goto L_0x01b8
            r4.add(r6)     // Catch:{ all -> 0x02f2 }
        L_0x01b8:
            com.google.android.gms.measurement.internal.m r6 = r19.Z()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.hb r5 = r5.f24448c     // Catch:{ all -> 0x02f2 }
            java.lang.String r5 = r5.f24640b     // Catch:{ all -> 0x02f2 }
            r6.y(r2, r5)     // Catch:{ all -> 0x02f2 }
            r6 = 2
            goto L_0x0175
        L_0x01c5:
            int r3 = r4.size()     // Catch:{ all -> 0x02f2 }
            r5 = 0
        L_0x01ca:
            if (r5 >= r3) goto L_0x01dd
            java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x02f2 }
            int r5 = r5 + 1
            com.google.android.gms.measurement.internal.d0 r6 = (com.google.android.gms.measurement.internal.d0) r6     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.d0 r8 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x02f2 }
            r8.<init>(r6, r10)     // Catch:{ all -> 0x02f2 }
            r1.T(r8, r0)     // Catch:{ all -> 0x02f2 }
            goto L_0x01ca
        L_0x01dd:
            com.google.android.gms.measurement.internal.m r3 = r19.Z()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = r13.f24457a     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.common.internal.q.g(r2)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.common.internal.q.g(r4)     // Catch:{ all -> 0x02f2 }
            r3.i()     // Catch:{ all -> 0x02f2 }
            r3.p()     // Catch:{ all -> 0x02f2 }
            if (r7 >= 0) goto L_0x0213
            com.google.android.gms.measurement.internal.n4 r5 = r3.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.G()     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = "Invalid time querying triggered conditional properties"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.n4.q(r2)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.m4 r3 = r3.d()     // Catch:{ all -> 0x02f2 }
            java.lang.String r3 = r3.c(r4)     // Catch:{ all -> 0x02f2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r5.d(r6, r2, r3, r4)     // Catch:{ all -> 0x02f2 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f2 }
            goto L_0x0228
        L_0x0213:
            java.lang.String r5 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x02f2 }
            r6[r12] = r2     // Catch:{ all -> 0x02f2 }
            r2 = 1
            r6[r2] = r4     // Catch:{ all -> 0x02f2 }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r4 = 2
            r6[r4] = r2     // Catch:{ all -> 0x02f2 }
            java.util.List r2 = r3.N(r5, r6)     // Catch:{ all -> 0x02f2 }
        L_0x0228:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x02f2 }
            int r3 = r2.size()     // Catch:{ all -> 0x02f2 }
            r14.<init>(r3)     // Catch:{ all -> 0x02f2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x02f2 }
        L_0x0235:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x02f2 }
            if (r3 == 0) goto L_0x02c8
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x02f2 }
            r15 = r3
            com.google.android.gms.measurement.internal.d r15 = (com.google.android.gms.measurement.internal.d) r15     // Catch:{ all -> 0x02f2 }
            if (r15 == 0) goto L_0x0235
            com.google.android.gms.measurement.internal.hb r3 = r15.f24448c     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.jb r9 = new com.google.android.gms.measurement.internal.jb     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = r15.f24446a     // Catch:{ all -> 0x02f2 }
            java.lang.Object r4 = com.google.android.gms.common.internal.q.k(r4)     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x02f2 }
            java.lang.String r5 = r15.f24447b     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r3.f24640b     // Catch:{ all -> 0x02f2 }
            java.lang.Object r3 = r3.v()     // Catch:{ all -> 0x02f2 }
            java.lang.Object r16 = com.google.android.gms.common.internal.q.k(r3)     // Catch:{ all -> 0x02f2 }
            r3 = r9
            r7 = r10
            r12 = r9
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.m r3 = r19.Z()     // Catch:{ all -> 0x02f2 }
            boolean r3 = r3.Z(r12)     // Catch:{ all -> 0x02f2 }
            if (r3 == 0) goto L_0x028c
            com.google.android.gms.measurement.internal.n4 r3 = r19.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.F()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = "User property triggered"
            java.lang.String r5 = r15.f24446a     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.w5 r6 = r1.f25150l     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.m4 r6 = r6.y()     // Catch:{ all -> 0x02f2 }
            java.lang.String r7 = r12.f24733c     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r6.g(r7)     // Catch:{ all -> 0x02f2 }
            java.lang.Object r7 = r12.f24735e     // Catch:{ all -> 0x02f2 }
            r3.d(r4, r5, r6, r7)     // Catch:{ all -> 0x02f2 }
            goto L_0x02ad
        L_0x028c:
            com.google.android.gms.measurement.internal.n4 r3 = r19.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = "Too many active user properties, ignoring"
            java.lang.String r5 = r15.f24446a     // Catch:{ all -> 0x02f2 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.n4.q(r5)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.w5 r6 = r1.f25150l     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.m4 r6 = r6.y()     // Catch:{ all -> 0x02f2 }
            java.lang.String r7 = r12.f24733c     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r6.g(r7)     // Catch:{ all -> 0x02f2 }
            java.lang.Object r7 = r12.f24735e     // Catch:{ all -> 0x02f2 }
            r3.d(r4, r5, r6, r7)     // Catch:{ all -> 0x02f2 }
        L_0x02ad:
            com.google.android.gms.measurement.internal.d0 r3 = r15.f24454j     // Catch:{ all -> 0x02f2 }
            if (r3 == 0) goto L_0x02b4
            r14.add(r3)     // Catch:{ all -> 0x02f2 }
        L_0x02b4:
            com.google.android.gms.measurement.internal.hb r3 = new com.google.android.gms.measurement.internal.hb     // Catch:{ all -> 0x02f2 }
            r3.<init>(r12)     // Catch:{ all -> 0x02f2 }
            r15.f24448c = r3     // Catch:{ all -> 0x02f2 }
            r3 = 1
            r15.f24450f = r3     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.m r4 = r19.Z()     // Catch:{ all -> 0x02f2 }
            r4.X(r15)     // Catch:{ all -> 0x02f2 }
            r12 = 0
            goto L_0x0235
        L_0x02c8:
            r1.T(r13, r0)     // Catch:{ all -> 0x02f2 }
            int r2 = r14.size()     // Catch:{ all -> 0x02f2 }
            r12 = 0
        L_0x02d0:
            if (r12 >= r2) goto L_0x02e3
            java.lang.Object r3 = r14.get(r12)     // Catch:{ all -> 0x02f2 }
            int r12 = r12 + 1
            com.google.android.gms.measurement.internal.d0 r3 = (com.google.android.gms.measurement.internal.d0) r3     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.d0 r4 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x02f2 }
            r4.<init>(r3, r10)     // Catch:{ all -> 0x02f2 }
            r1.T(r4, r0)     // Catch:{ all -> 0x02f2 }
            goto L_0x02d0
        L_0x02e3:
            com.google.android.gms.measurement.internal.m r0 = r19.Z()     // Catch:{ all -> 0x02f2 }
            r0.O0()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.m r0 = r19.Z()
            r0.M0()
            return
        L_0x02f2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.m r2 = r19.Z()
            r2.M0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.o(com.google.android.gms.measurement.internal.d0, com.google.android.gms.measurement.internal.lb):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        zzj().B().c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.n4.q(r6), r3.a());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x0406 */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x030d A[Catch:{ all -> 0x0448 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x030e A[Catch:{ all -> 0x0448 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o0() {
        /*
            r21 = this;
            r7 = r21
            com.google.android.gms.measurement.internal.q5 r0 = r21.zzl()
            r0.i()
            r21.k0()
            r0 = 1
            r7.f25160v = r0
            r8 = 0
            com.google.android.gms.measurement.internal.w5 r1 = r7.f25150l     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.v8 r1 = r1.E()     // Catch:{ all -> 0x0448 }
            java.lang.Boolean r1 = r1.R()     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x002f
            com.google.android.gms.measurement.internal.n4 r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.G()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Upload data called on the client side before use of service was decided"
            r0.a(r1)     // Catch:{ all -> 0x0448 }
            r7.f25160v = r8
            r21.H()
            return
        L_0x002f:
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x0048
            com.google.android.gms.measurement.internal.n4 r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Upload called in the client side when service should be used"
            r0.a(r1)     // Catch:{ all -> 0x0448 }
            r7.f25160v = r8
            r21.H()
            return
        L_0x0048:
            long r1 = r7.f25153o     // Catch:{ all -> 0x0448 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0059
            r21.I()     // Catch:{ all -> 0x0448 }
            r7.f25160v = r8
            r21.H()
            return
        L_0x0059:
            com.google.android.gms.measurement.internal.q5 r1 = r21.zzl()     // Catch:{ all -> 0x0448 }
            r1.i()     // Catch:{ all -> 0x0448 }
            java.util.List<java.lang.Long> r1 = r7.f25163y     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x0066
            r1 = 1
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 == 0) goto L_0x007c
            com.google.android.gms.measurement.internal.n4 r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.F()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Uploading requested multiple times"
            r0.a(r1)     // Catch:{ all -> 0x0448 }
            r7.f25160v = r8
            r21.H()
            return
        L_0x007c:
            com.google.android.gms.measurement.internal.u4 r1 = r21.b0()     // Catch:{ all -> 0x0448 }
            boolean r1 = r1.v()     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x009c
            com.google.android.gms.measurement.internal.n4 r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.F()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Network not connected, ignoring upload request"
            r0.a(r1)     // Catch:{ all -> 0x0448 }
            r21.I()     // Catch:{ all -> 0x0448 }
            r7.f25160v = r8
            r21.H()
            return
        L_0x009c:
            m5.e r1 = r21.zzb()     // Catch:{ all -> 0x0448 }
            long r1 = r1.a()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.f r5 = r21.X()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.e0.U     // Catch:{ all -> 0x0448 }
            r9 = 0
            int r5 = r5.p(r9, r6)     // Catch:{ all -> 0x0448 }
            r21.X()     // Catch:{ all -> 0x0448 }
            long r10 = com.google.android.gms.measurement.internal.f.B()     // Catch:{ all -> 0x0448 }
            long r10 = r1 - r10
            r6 = 0
        L_0x00b9:
            if (r6 >= r5) goto L_0x00c4
            boolean r12 = r7.G(r9, r10)     // Catch:{ all -> 0x0448 }
            if (r12 == 0) goto L_0x00c4
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x00c4:
            boolean r5 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0448 }
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.measurement.internal.q5 r5 = r21.zzl()     // Catch:{ all -> 0x0448 }
            r5.i()     // Catch:{ all -> 0x0448 }
            java.util.Set<java.lang.String> r5 = r7.f25155q     // Catch:{ all -> 0x0448 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0448 }
        L_0x00d7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0448 }
            if (r6 == 0) goto L_0x0119
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0448 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0448 }
            boolean r10 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0448 }
            if (r10 == 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.f r10 = r21.X()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.e0.L0     // Catch:{ all -> 0x0448 }
            boolean r10 = r10.w(r6, r11)     // Catch:{ all -> 0x0448 }
            if (r10 == 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.n4 r10 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.p4 r10 = r10.A()     // Catch:{ all -> 0x0448 }
            java.lang.String r11 = "Notifying app that trigger URIs are available. App ID"
            r10.b(r11, r6)     // Catch:{ all -> 0x0448 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x0448 }
            r10.<init>()     // Catch:{ all -> 0x0448 }
            java.lang.String r11 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r10.setAction(r11)     // Catch:{ all -> 0x0448 }
            r10.setPackage(r6)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.w5 r6 = r7.f25150l     // Catch:{ all -> 0x0448 }
            android.content.Context r6 = r6.zza()     // Catch:{ all -> 0x0448 }
            r6.sendBroadcast(r10)     // Catch:{ all -> 0x0448 }
            goto L_0x00d7
        L_0x0119:
            java.util.Set<java.lang.String> r5 = r7.f25155q     // Catch:{ all -> 0x0448 }
            r5.clear()     // Catch:{ all -> 0x0448 }
        L_0x011e:
            com.google.android.gms.measurement.internal.y9 r5 = r7.f25147i     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.d5 r5 = r5.f25304g     // Catch:{ all -> 0x0448 }
            long r5 = r5.a()     // Catch:{ all -> 0x0448 }
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0141
            com.google.android.gms.measurement.internal.n4 r3 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.p4 r3 = r3.A()     // Catch:{ all -> 0x0448 }
            java.lang.String r4 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0448 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0448 }
            r3.b(r4, r5)     // Catch:{ all -> 0x0448 }
        L_0x0141:
            com.google.android.gms.measurement.internal.m r3 = r21.Z()     // Catch:{ all -> 0x0448 }
            java.lang.String r6 = r3.x()     // Catch:{ all -> 0x0448 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0448 }
            r4 = -1
            if (r3 != 0) goto L_0x041c
            long r10 = r7.A     // Catch:{ all -> 0x0448 }
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0161
            com.google.android.gms.measurement.internal.m r3 = r21.Z()     // Catch:{ all -> 0x0448 }
            long r3 = r3.t()     // Catch:{ all -> 0x0448 }
            r7.A = r3     // Catch:{ all -> 0x0448 }
        L_0x0161:
            com.google.android.gms.measurement.internal.f r3 = r21.X()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r4 = com.google.android.gms.measurement.internal.e0.f24508i     // Catch:{ all -> 0x0448 }
            int r3 = r3.p(r6, r4)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.f r4 = r21.X()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.h4<java.lang.Integer> r5 = com.google.android.gms.measurement.internal.e0.f24510j     // Catch:{ all -> 0x0448 }
            int r4 = r4.p(r6, r5)     // Catch:{ all -> 0x0448 }
            int r4 = java.lang.Math.max(r8, r4)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.m r5 = r21.Z()     // Catch:{ all -> 0x0448 }
            java.util.List r3 = r5.L(r6, r3, r4)     // Catch:{ all -> 0x0448 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0448 }
            if (r4 != 0) goto L_0x0441
            com.google.android.gms.measurement.internal.y6 r4 = r7.L(r6)     // Catch:{ all -> 0x0448 }
            boolean r4 = r4.x()     // Catch:{ all -> 0x0448 }
            if (r4 == 0) goto L_0x01e4
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0448 }
        L_0x0195:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0448 }
            if (r5 == 0) goto L_0x01b4
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0448 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x0448 }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = (com.google.android.gms.internal.measurement.zzfi.zzj) r5     // Catch:{ all -> 0x0448 }
            java.lang.String r10 = r5.zzal()     // Catch:{ all -> 0x0448 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0448 }
            if (r10 != 0) goto L_0x0195
            java.lang.String r4 = r5.zzal()     // Catch:{ all -> 0x0448 }
            goto L_0x01b5
        L_0x01b4:
            r4 = r9
        L_0x01b5:
            if (r4 == 0) goto L_0x01e4
            r5 = 0
        L_0x01b8:
            int r10 = r3.size()     // Catch:{ all -> 0x0448 }
            if (r5 >= r10) goto L_0x01e4
            java.lang.Object r10 = r3.get(r5)     // Catch:{ all -> 0x0448 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0448 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = (com.google.android.gms.internal.measurement.zzfi.zzj) r10     // Catch:{ all -> 0x0448 }
            java.lang.String r11 = r10.zzal()     // Catch:{ all -> 0x0448 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0448 }
            if (r11 != 0) goto L_0x01e1
            java.lang.String r10 = r10.zzal()     // Catch:{ all -> 0x0448 }
            boolean r10 = r10.equals(r4)     // Catch:{ all -> 0x0448 }
            if (r10 != 0) goto L_0x01e1
            java.util.List r3 = r3.subList(r8, r5)     // Catch:{ all -> 0x0448 }
            goto L_0x01e4
        L_0x01e1:
            int r5 = r5 + 1
            goto L_0x01b8
        L_0x01e4:
            com.google.android.gms.internal.measurement.zzfi$zzi$zza r4 = com.google.android.gms.internal.measurement.zzfi.zzi.zzb()     // Catch:{ all -> 0x0448 }
            int r5 = r3.size()     // Catch:{ all -> 0x0448 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0448 }
            int r11 = r3.size()     // Catch:{ all -> 0x0448 }
            r10.<init>(r11)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.f r11 = r21.X()     // Catch:{ all -> 0x0448 }
            boolean r11 = r11.F(r6)     // Catch:{ all -> 0x0448 }
            if (r11 == 0) goto L_0x020b
            com.google.android.gms.measurement.internal.y6 r11 = r7.L(r6)     // Catch:{ all -> 0x0448 }
            boolean r11 = r11.x()     // Catch:{ all -> 0x0448 }
            if (r11 == 0) goto L_0x020b
            r11 = 1
            goto L_0x020c
        L_0x020b:
            r11 = 0
        L_0x020c:
            com.google.android.gms.measurement.internal.y6 r12 = r7.L(r6)     // Catch:{ all -> 0x0448 }
            boolean r12 = r12.x()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.y6 r13 = r7.L(r6)     // Catch:{ all -> 0x0448 }
            boolean r13 = r13.y()     // Catch:{ all -> 0x0448 }
            boolean r14 = com.google.android.gms.internal.measurement.zzps.zza()     // Catch:{ all -> 0x0448 }
            if (r14 == 0) goto L_0x0230
            com.google.android.gms.measurement.internal.f r14 = r21.X()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.e0.f24541y0     // Catch:{ all -> 0x0448 }
            boolean r14 = r14.w(r6, r15)     // Catch:{ all -> 0x0448 }
            if (r14 == 0) goto L_0x0230
            r14 = 1
            goto L_0x0231
        L_0x0230:
            r14 = 0
        L_0x0231:
            r15 = 0
        L_0x0232:
            if (r15 >= r5) goto L_0x0345
            java.lang.Object r16 = r3.get(r15)     // Catch:{ all -> 0x0448 }
            r9 = r16
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x0448 }
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = (com.google.android.gms.internal.measurement.zzfi.zzj) r9     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzix$zzb r9 = r9.zzby()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9     // Catch:{ all -> 0x0448 }
            java.lang.Object r16 = r3.get(r15)     // Catch:{ all -> 0x0448 }
            r0 = r16
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0448 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0448 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0448 }
            r10.add(r0)     // Catch:{ all -> 0x0448 }
            r21.X()     // Catch:{ all -> 0x0448 }
            r0 = r3
            r16 = r4
            r3 = 82001(0x14051, double:4.0514E-319)
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r3 = r9.zzl((long) r3)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r3 = r3.zzk((long) r1)     // Catch:{ all -> 0x0448 }
            r3.zzd((boolean) r8)     // Catch:{ all -> 0x0448 }
            if (r11 != 0) goto L_0x026e
            r9.zzh()     // Catch:{ all -> 0x0448 }
        L_0x026e:
            if (r12 != 0) goto L_0x0276
            r9.zzo()     // Catch:{ all -> 0x0448 }
            r9.zzk()     // Catch:{ all -> 0x0448 }
        L_0x0276:
            if (r13 != 0) goto L_0x027b
            r9.zze()     // Catch:{ all -> 0x0448 }
        L_0x027b:
            r7.v(r6, r9)     // Catch:{ all -> 0x0448 }
            if (r14 != 0) goto L_0x0283
            r9.zzp()     // Catch:{ all -> 0x0448 }
        L_0x0283:
            boolean r3 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0311
            com.google.android.gms.measurement.internal.f r3 = r21.X()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.e0.Y0     // Catch:{ all -> 0x0448 }
            boolean r3 = r3.n(r4)     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0311
            java.lang.String r3 = r9.zzv()     // Catch:{ all -> 0x0448 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0448 }
            if (r4 != 0) goto L_0x02ab
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x02a8
            goto L_0x02ab
        L_0x02a8:
            r20 = r0
            goto L_0x0307
        L_0x02ab:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0448 }
            java.util.List r4 = r9.zzw()     // Catch:{ all -> 0x0448 }
            r3.<init>(r4)     // Catch:{ all -> 0x0448 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0448 }
            r17 = 0
            r18 = 0
        L_0x02bc:
            boolean r19 = r4.hasNext()     // Catch:{ all -> 0x0448 }
            if (r19 == 0) goto L_0x02f3
            java.lang.Object r19 = r4.next()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zze r19 = (com.google.android.gms.internal.measurement.zzfi.zze) r19     // Catch:{ all -> 0x0448 }
            java.lang.String r8 = "_fx"
            r20 = r0
            java.lang.String r0 = r19.zzg()     // Catch:{ all -> 0x0448 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x02e1
            r4.remove()     // Catch:{ all -> 0x0448 }
            r0 = r20
            r8 = 0
            r17 = 1
            r18 = 1
            goto L_0x02bc
        L_0x02e1:
            java.lang.String r0 = "_f"
            java.lang.String r8 = r19.zzg()     // Catch:{ all -> 0x0448 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x02ef
            r18 = 1
        L_0x02ef:
            r0 = r20
            r8 = 0
            goto L_0x02bc
        L_0x02f3:
            r20 = r0
            if (r17 == 0) goto L_0x02fd
            r9.zzi()     // Catch:{ all -> 0x0448 }
            r9.zzb((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfi.zze>) r3)     // Catch:{ all -> 0x0448 }
        L_0x02fd:
            if (r18 == 0) goto L_0x0307
            java.lang.String r0 = r9.zzr()     // Catch:{ all -> 0x0448 }
            r3 = 1
            r7.A(r0, r3)     // Catch:{ all -> 0x0448 }
        L_0x0307:
            int r0 = r9.zza()     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x030e
            goto L_0x0313
        L_0x030e:
            r0 = r16
            goto L_0x033b
        L_0x0311:
            r20 = r0
        L_0x0313:
            com.google.android.gms.measurement.internal.f r0 = r21.X()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.e0.f24505g0     // Catch:{ all -> 0x0448 }
            boolean r0 = r0.w(r6, r3)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x0336
            com.google.android.gms.internal.measurement.zzkj r0 = r9.zzab()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzix r0 = (com.google.android.gms.internal.measurement.zzix) r0     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj r0 = (com.google.android.gms.internal.measurement.zzfi.zzj) r0     // Catch:{ all -> 0x0448 }
            byte[] r0 = r0.zzbv()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.db r3 = r21.h0()     // Catch:{ all -> 0x0448 }
            long r3 = r3.v(r0)     // Catch:{ all -> 0x0448 }
            r9.zza((long) r3)     // Catch:{ all -> 0x0448 }
        L_0x0336:
            r0 = r16
            r0.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9)     // Catch:{ all -> 0x0448 }
        L_0x033b:
            int r15 = r15 + 1
            r4 = r0
            r3 = r20
            r0 = 1
            r8 = 0
            r9 = 0
            goto L_0x0232
        L_0x0345:
            r0 = r4
            boolean r3 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0372
            com.google.android.gms.measurement.internal.f r3 = r21.X()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.e0.Y0     // Catch:{ all -> 0x0448 }
            boolean r3 = r3.n(r4)     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0372
            int r3 = r0.zza()     // Catch:{ all -> 0x0448 }
            if (r3 != 0) goto L_0x0372
            r7.B(r10)     // Catch:{ all -> 0x0448 }
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r1 = r21
            r1.D(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0448 }
            r1 = 0
            r7.f25160v = r1
            r21.H()
            return
        L_0x0372:
            com.google.android.gms.measurement.internal.n4 r3 = r21.zzj()     // Catch:{ all -> 0x0448 }
            r4 = 2
            boolean r3 = r3.x(r4)     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x038e
            com.google.android.gms.measurement.internal.db r3 = r21.h0()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzkj r4 = r0.zzab()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzi r4 = (com.google.android.gms.internal.measurement.zzfi.zzi) r4     // Catch:{ all -> 0x0448 }
            java.lang.String r9 = r3.F(r4)     // Catch:{ all -> 0x0448 }
            goto L_0x038f
        L_0x038e:
            r9 = 0
        L_0x038f:
            r21.h0()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzkj r3 = r0.zzab()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzix r3 = (com.google.android.gms.internal.measurement.zzix) r3     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzi r3 = (com.google.android.gms.internal.measurement.zzfi.zzi) r3     // Catch:{ all -> 0x0448 }
            byte[] r14 = r3.zzbv()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.ta r3 = r7.f25148j     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.wa r3 = r3.p(r6)     // Catch:{ all -> 0x0448 }
            r7.B(r10)     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.y9 r4 = r7.f25147i     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.d5 r4 = r4.f25305h     // Catch:{ MalformedURLException -> 0x0406 }
            r4.b(r1)     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.String r1 = "?"
            if (r5 <= 0) goto L_0x03bb
            r2 = 0
            com.google.android.gms.internal.measurement.zzfi$zzj r0 = r0.zza((int) r2)     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.String r1 = r0.zzx()     // Catch:{ MalformedURLException -> 0x0406 }
        L_0x03bb:
            com.google.android.gms.measurement.internal.n4 r0 = r21.zzj()     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.F()     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.String r2 = "Uploading data. app, uncompressed size, data"
            int r4 = r14.length     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ MalformedURLException -> 0x0406 }
            r0.d(r2, r1, r4, r9)     // Catch:{ MalformedURLException -> 0x0406 }
            r0 = 1
            r7.f25159u = r0     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.u4 r11 = r21.b0()     // Catch:{ MalformedURLException -> 0x0406 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.String r0 = r3.a()     // Catch:{ MalformedURLException -> 0x0406 }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x0406 }
            java.util.Map r15 = r3.b()     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.xa r0 = new com.google.android.gms.measurement.internal.xa     // Catch:{ MalformedURLException -> 0x0406 }
            r0.<init>(r7, r6)     // Catch:{ MalformedURLException -> 0x0406 }
            r11.i()     // Catch:{ MalformedURLException -> 0x0406 }
            r11.p()     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.common.internal.q.k(r13)     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.common.internal.q.k(r14)     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.common.internal.q.k(r0)     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.q5 r1 = r11.zzl()     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.x4 r2 = new com.google.android.gms.measurement.internal.x4     // Catch:{ MalformedURLException -> 0x0406 }
            r10 = r2
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0406 }
            r1.u(r2)     // Catch:{ MalformedURLException -> 0x0406 }
            goto L_0x0441
        L_0x0406:
            com.google.android.gms.measurement.internal.n4 r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.n4.q(r6)     // Catch:{ all -> 0x0448 }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x0448 }
            r0.c(r1, r2, r3)     // Catch:{ all -> 0x0448 }
            goto L_0x0441
        L_0x041c:
            r7.A = r4     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.m r0 = r21.Z()     // Catch:{ all -> 0x0448 }
            r21.X()     // Catch:{ all -> 0x0448 }
            long r3 = com.google.android.gms.measurement.internal.f.B()     // Catch:{ all -> 0x0448 }
            long r1 = r1 - r3
            java.lang.String r0 = r0.J(r1)     // Catch:{ all -> 0x0448 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x0441
            com.google.android.gms.measurement.internal.m r1 = r21.Z()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.r5 r0 = r1.y0(r0)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x0441
            r7.Q(r0)     // Catch:{ all -> 0x0448 }
        L_0x0441:
            r1 = 0
            r7.f25160v = r1
            r21.H()
            return
        L_0x0448:
            r0 = move-exception
            r1 = 0
            r7.f25160v = r1
            r21.H()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.o0():void");
    }

    /* access modifiers changed from: package-private */
    public final void p(d0 d0Var, String str) {
        String str2;
        int i10;
        d0 d0Var2 = d0Var;
        String str3 = str;
        r5 y02 = Z().y0(str3);
        if (y02 == null || TextUtils.isEmpty(y02.h())) {
            zzj().A().b("No app data available; dropping event", str3);
            return;
        }
        Boolean h10 = h(y02);
        if (h10 == null) {
            if (!"_ui".equals(d0Var2.f24457a)) {
                zzj().G().b("Could not find package. appId", n4.q(str));
            }
        } else if (!h10.booleanValue()) {
            zzj().B().b("App version does not match; dropping event. appId", n4.q(str));
            return;
        }
        y6 L = L(str3);
        if (!zznp.zza() || !X().n(e0.T0)) {
            str2 = MaxReward.DEFAULT_LABEL;
            i10 = 100;
        } else {
            str2 = V(str3).i();
            i10 = L.b();
        }
        lb lbVar = r2;
        r5 r5Var = y02;
        lb lbVar2 = new lb(str, y02.j(), y02.h(), y02.z(), y02.v0(), y02.g0(), y02.a0(), (String) null, y02.r(), false, r5Var.i(), r5Var.v(), 0, 0, r5Var.q(), false, r5Var.r0(), r5Var.q0(), r5Var.c0(), r5Var.n(), (String) null, L.v(), MaxReward.DEFAULT_LABEL, (String) null, r5Var.t(), r5Var.p0(), i10, str2, r5Var.a(), r5Var.D());
        P(d0Var2, lbVar);
    }

    /* access modifiers changed from: package-private */
    public final void q(r5 r5Var, zzfi.zzj.zza zza) {
        zzl().i();
        k0();
        if (zznp.zza()) {
            k b10 = k.b(zza.zzs());
            String t02 = r5Var.t0();
            zzl().i();
            k0();
            if (zznp.zza()) {
                y6 L = L(t02);
                if (zznp.zza() && X().n(e0.V0)) {
                    zza.zzg(L.w());
                }
                if (L.s() != null) {
                    b10.c(y6.a.AD_STORAGE, L.b());
                } else {
                    b10.d(y6.a.AD_STORAGE, j.FAILSAFE);
                }
                if (L.u() != null) {
                    b10.c(y6.a.ANALYTICS_STORAGE, L.b());
                } else {
                    b10.d(y6.a.ANALYTICS_STORAGE, j.FAILSAFE);
                }
            }
            String t03 = r5Var.t0();
            zzl().i();
            k0();
            if (zznp.zza()) {
                v c10 = c(t03, V(t03), L(t03), b10);
                zza.zzb(((Boolean) q.k(c10.g())).booleanValue());
                if (!TextUtils.isEmpty(c10.h())) {
                    zza.zzh(c10.h());
                }
            }
            zzl().i();
            k0();
            if (zznp.zza()) {
                zzfi.zzn zzn = null;
                Iterator<zzfi.zzn> it = zza.zzx().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfi.zzn next = it.next();
                    if ("_npa".equals(next.zzg())) {
                        zzn = next;
                        break;
                    }
                }
                if (zzn != null) {
                    y6.a aVar = y6.a.AD_PERSONALIZATION;
                    if (b10.a(aVar) == j.UNSET) {
                        Boolean q02 = r5Var.q0();
                        if (q02 == null || ((q02 == Boolean.TRUE && zzn.zzc() != 1) || (q02 == Boolean.FALSE && zzn.zzc() != 0))) {
                            b10.d(aVar, j.API);
                        } else {
                            b10.d(aVar, j.MANIFEST);
                        }
                    }
                } else if (zznp.zza() && X().n(e0.W0)) {
                    boolean z10 = true;
                    if (this.f25139a.E(r5Var.t0()) == null) {
                        b10.d(y6.a.AD_PERSONALIZATION, j.FAILSAFE);
                    } else {
                        i5 i5Var = this.f25139a;
                        String t04 = r5Var.t0();
                        y6.a aVar2 = y6.a.AD_PERSONALIZATION;
                        z10 = true ^ i5Var.F(t04, aVar2);
                        b10.d(aVar2, j.REMOTE_DEFAULT);
                    }
                    zza.zza((zzfi.zzn) ((zzix) zzfi.zzn.zze().zza("_npa").zzb(zzb().a()).zza(z10 ? 1 : 0).zzab()));
                }
            }
            zza.zzf(b10.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void s(hb hbVar, lb lbVar) {
        jb A0;
        zzl().i();
        k0();
        if (Y(lbVar)) {
            if (!lbVar.f24786i) {
                d(lbVar);
                return;
            }
            int l02 = i0().l0(hbVar.f24640b);
            if (l02 != 0) {
                i0();
                String str = hbVar.f24640b;
                X();
                String D2 = ib.D(str, 24, true);
                String str2 = hbVar.f24640b;
                int length = str2 != null ? str2.length() : 0;
                i0();
                ib.T(this.G, lbVar.f24779a, l02, "_ev", D2, length);
                return;
            }
            int r10 = i0().r(hbVar.f24640b, hbVar.v());
            if (r10 != 0) {
                i0();
                String str3 = hbVar.f24640b;
                X();
                String D3 = ib.D(str3, 24, true);
                Object v10 = hbVar.v();
                int length2 = (v10 == null || (!(v10 instanceof String) && !(v10 instanceof CharSequence))) ? 0 : String.valueOf(v10).length();
                i0();
                ib.T(this.G, lbVar.f24779a, r10, "_ev", D3, length2);
                return;
            }
            Object v02 = i0().v0(hbVar.f24640b, hbVar.v());
            if (v02 != null) {
                if ("_sid".equals(hbVar.f24640b)) {
                    long j10 = hbVar.f24641c;
                    String str4 = hbVar.f24645h;
                    String str5 = (String) q.k(lbVar.f24779a);
                    long j11 = 0;
                    jb A02 = Z().A0(str5, "_sno");
                    if (A02 != null) {
                        Object obj = A02.f24735e;
                        if (obj instanceof Long) {
                            j11 = ((Long) obj).longValue();
                            s(new hb("_sno", j10, Long.valueOf(j11 + 1), str4), lbVar);
                        }
                    }
                    if (A02 != null) {
                        zzj().G().b("Retrieved last session number from database does not contain a valid (long) value", A02.f24735e);
                    }
                    a0 x02 = Z().x0(str5, "_s");
                    if (x02 != null) {
                        j11 = x02.f24339c;
                        zzj().F().b("Backfill the session number. Last used session number", Long.valueOf(j11));
                    }
                    s(new hb("_sno", j10, Long.valueOf(j11 + 1), str4), lbVar);
                }
                jb jbVar = new jb((String) q.k(lbVar.f24779a), (String) q.k(hbVar.f24645h), hbVar.f24640b, hbVar.f24641c, v02);
                zzj().F().c("Setting user property", this.f25150l.y().g(jbVar.f24733c), v02);
                Z().L0();
                try {
                    if ("_id".equals(jbVar.f24733c) && (A0 = Z().A0(lbVar.f24779a, "_id")) != null && !jbVar.f24735e.equals(A0.f24735e)) {
                        Z().G0(lbVar.f24779a, "_lair");
                    }
                    d(lbVar);
                    boolean Z = Z().Z(jbVar);
                    if ("_sid".equals(hbVar.f24640b)) {
                        long u10 = h0().u(lbVar.f24802y);
                        r5 y02 = Z().y0(lbVar.f24779a);
                        if (y02 != null) {
                            y02.l0(u10);
                            if (y02.s()) {
                                Z().Q(y02);
                            }
                        }
                    }
                    Z().O0();
                    if (!Z) {
                        zzj().B().c("Too many unique user properties are set. Ignoring user property", this.f25150l.y().g(jbVar.f24733c), jbVar.f24735e);
                        i0();
                        ib.T(this.G, lbVar.f24779a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    Z().M0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void t(Runnable runnable) {
        zzl().i();
        if (this.f25154p == null) {
            this.f25154p = new ArrayList();
        }
        this.f25154p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0144 A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0152 A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0178 A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017c A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.q5 r0 = r6.zzl()
            r0.i()
            r6.k0()
            com.google.android.gms.common.internal.q.g(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x019c }
        L_0x0012:
            com.google.android.gms.measurement.internal.n4 r1 = r6.zzj()     // Catch:{ all -> 0x019c }
            com.google.android.gms.measurement.internal.p4 r1 = r1.F()     // Catch:{ all -> 0x019c }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x019c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x019c }
            r1.b(r2, r3)     // Catch:{ all -> 0x019c }
            com.google.android.gms.measurement.internal.m r1 = r6.Z()     // Catch:{ all -> 0x019c }
            r1.L0()     // Catch:{ all -> 0x019c }
            com.google.android.gms.measurement.internal.m r1 = r6.Z()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.r5 r1 = r1.y0(r7)     // Catch:{ all -> 0x0193 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x0040
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0040
            if (r8 != r3) goto L_0x0044
        L_0x0040:
            if (r9 != 0) goto L_0x0044
            r2 = 1
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.n4 r8 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.p4 r8 = r8.G()     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.n4.q(r7)     // Catch:{ all -> 0x0193 }
            r8.b(r9, r7)     // Catch:{ all -> 0x0193 }
            goto L_0x017f
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ba
            if (r8 != r5) goto L_0x0061
            goto L_0x00ba
        L_0x0061:
            m5.e r10 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r10 = r10.a()     // Catch:{ all -> 0x0193 }
            r1.b0(r10)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.m r10 = r6.Z()     // Catch:{ all -> 0x0193 }
            r10.Q(r1)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.n4 r10 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.p4 r10 = r10.F()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0193 }
            r10.c(r11, r1, r9)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.i5 r9 = r6.c0()     // Catch:{ all -> 0x0193 }
            r9.O(r7)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.y9 r7 = r6.f25147i     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.d5 r7 = r7.f25305h     // Catch:{ all -> 0x0193 }
            m5.e r9 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r9 = r9.a()     // Catch:{ all -> 0x0193 }
            r7.b(r9)     // Catch:{ all -> 0x0193 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a4
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r4 = 0
        L_0x00a4:
            if (r4 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.y9 r7 = r6.f25147i     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.d5 r7 = r7.f25303f     // Catch:{ all -> 0x0193 }
            m5.e r8 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r8 = r8.a()     // Catch:{ all -> 0x0193 }
            r7.b(r8)     // Catch:{ all -> 0x0193 }
        L_0x00b5:
            r6.I()     // Catch:{ all -> 0x0193 }
            goto L_0x017f
        L_0x00ba:
            r9 = 0
            if (r11 == 0) goto L_0x00c6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r2 = r11.get(r2)     // Catch:{ all -> 0x0193 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0193 }
            goto L_0x00c7
        L_0x00c6:
            r2 = r9
        L_0x00c7:
            if (r2 == 0) goto L_0x00d6
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r4 != 0) goto L_0x00d6
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0193 }
            goto L_0x00d7
        L_0x00d6:
            r2 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e2
            java.lang.String r4 = "ETag"
            java.lang.Object r11 = r11.get(r4)     // Catch:{ all -> 0x0193 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0193 }
            goto L_0x00e3
        L_0x00e2:
            r11 = r9
        L_0x00e3:
            if (r11 == 0) goto L_0x00f2
            boolean r4 = r11.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r4 != 0) goto L_0x00f2
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0193 }
            goto L_0x00f3
        L_0x00f2:
            r11 = r9
        L_0x00f3:
            if (r8 == r5) goto L_0x010f
            if (r8 != r3) goto L_0x00f8
            goto L_0x010f
        L_0x00f8:
            com.google.android.gms.measurement.internal.i5 r9 = r6.c0()     // Catch:{ all -> 0x0193 }
            boolean r9 = r9.C(r7, r10, r2, r11)     // Catch:{ all -> 0x0193 }
            if (r9 != 0) goto L_0x0130
            com.google.android.gms.measurement.internal.m r7 = r6.Z()     // Catch:{ all -> 0x019c }
            r7.M0()     // Catch:{ all -> 0x019c }
            r6.f25158t = r0
            r6.H()
            return
        L_0x010f:
            com.google.android.gms.measurement.internal.i5 r11 = r6.c0()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.internal.measurement.zzfc$zzd r11 = r11.G(r7)     // Catch:{ all -> 0x0193 }
            if (r11 != 0) goto L_0x0130
            com.google.android.gms.measurement.internal.i5 r11 = r6.c0()     // Catch:{ all -> 0x0193 }
            boolean r9 = r11.C(r7, r9, r9, r9)     // Catch:{ all -> 0x0193 }
            if (r9 != 0) goto L_0x0130
            com.google.android.gms.measurement.internal.m r7 = r6.Z()     // Catch:{ all -> 0x019c }
            r7.M0()     // Catch:{ all -> 0x019c }
            r6.f25158t = r0
            r6.H()
            return
        L_0x0130:
            m5.e r9 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r2 = r9.a()     // Catch:{ all -> 0x0193 }
            r1.A(r2)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.m r9 = r6.Z()     // Catch:{ all -> 0x0193 }
            r9.Q(r1)     // Catch:{ all -> 0x0193 }
            if (r8 != r5) goto L_0x0152
            com.google.android.gms.measurement.internal.n4 r8 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.p4 r8 = r8.H()     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.b(r9, r7)     // Catch:{ all -> 0x0193 }
            goto L_0x0168
        L_0x0152:
            com.google.android.gms.measurement.internal.n4 r7 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.p4 r7 = r7.F()     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0193 }
            int r10 = r10.length     // Catch:{ all -> 0x0193 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0193 }
            r7.c(r9, r8, r10)     // Catch:{ all -> 0x0193 }
        L_0x0168:
            com.google.android.gms.measurement.internal.u4 r7 = r6.b0()     // Catch:{ all -> 0x0193 }
            boolean r7 = r7.v()     // Catch:{ all -> 0x0193 }
            if (r7 == 0) goto L_0x017c
            boolean r7 = r6.J()     // Catch:{ all -> 0x0193 }
            if (r7 == 0) goto L_0x017c
            r6.o0()     // Catch:{ all -> 0x0193 }
            goto L_0x017f
        L_0x017c:
            r6.I()     // Catch:{ all -> 0x0193 }
        L_0x017f:
            com.google.android.gms.measurement.internal.m r7 = r6.Z()     // Catch:{ all -> 0x0193 }
            r7.O0()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.m r7 = r6.Z()     // Catch:{ all -> 0x019c }
            r7.M0()     // Catch:{ all -> 0x019c }
            r6.f25158t = r0
            r6.H()
            return
        L_0x0193:
            r7 = move-exception
            com.google.android.gms.measurement.internal.m r8 = r6.Z()     // Catch:{ all -> 0x019c }
            r8.M0()     // Catch:{ all -> 0x019c }
            throw r7     // Catch:{ all -> 0x019c }
        L_0x019c:
            r7 = move-exception
            r6.f25158t = r0
            r6.H()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.u(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void v(String str, zzfi.zzj.zza zza) {
        int t10;
        int indexOf;
        Set<String> M = c0().M(str);
        if (M != null) {
            zza.zzd((Iterable<String>) M);
        }
        if (c0().W(str)) {
            zza.zzg();
        }
        if (c0().Z(str)) {
            if (X().w(str, e0.B0)) {
                String zzu = zza.zzu();
                if (!TextUtils.isEmpty(zzu) && (indexOf = zzu.indexOf(".")) != -1) {
                    zza.zzo(zzu.substring(0, indexOf));
                }
            } else {
                zza.zzl();
            }
        }
        if (c0().a0(str) && (t10 = db.t(zza, "_id")) != -1) {
            zza.zzc(t10);
        }
        if (c0().Y(str)) {
            zza.zzh();
        }
        if (c0().V(str)) {
            zza.zze();
            b bVar = this.D.get(str);
            if (bVar == null || bVar.f25171b + X().s(str, e0.W) < zzb().b()) {
                bVar = new b();
                this.D.put(str, bVar);
            }
            zza.zzk(bVar.f25170a);
        }
        if (c0().X(str)) {
            zza.zzp();
        }
    }

    /* access modifiers changed from: package-private */
    public final void w(String str, v vVar) {
        zzl().i();
        k0();
        if (zznp.zza()) {
            this.C.put(str, vVar);
            Z().R(str, vVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void x(String str, y6 y6Var) {
        zzl().i();
        k0();
        this.B.put(str, y6Var);
        Z().S(str, y6Var);
    }

    public final void y(String str, p8 p8Var) {
        zzl().i();
        String str2 = this.F;
        if (str2 == null || str2.equals(str) || p8Var != null) {
            this.F = str;
            this.E = p8Var;
        }
    }

    /* access modifiers changed from: package-private */
    public final void z(String str, lb lbVar) {
        zzl().i();
        k0();
        if (Y(lbVar)) {
            if (!lbVar.f24786i) {
                d(lbVar);
            } else if (!"_npa".equals(str) || lbVar.f24796s == null) {
                zzj().A().b("Removing user property", this.f25150l.y().g(str));
                Z().L0();
                try {
                    d(lbVar);
                    if ("_id".equals(str)) {
                        Z().G0((String) q.k(lbVar.f24779a), "_lair");
                    }
                    Z().G0((String) q.k(lbVar.f24779a), str);
                    Z().O0();
                    zzj().A().b("User property removed", this.f25150l.y().g(str));
                } finally {
                    Z().M0();
                }
            } else {
                zzj().A().a("Falling back to manifest metadata value for ad personalization");
                s(new hb("_npa", zzb().a(), Long.valueOf(lbVar.f24796s.booleanValue() ? 1 : 0), "auto"), lbVar);
            }
        }
    }

    public final Context zza() {
        return this.f25150l.zza();
    }

    public final e zzb() {
        return ((w5) q.k(this.f25150l)).zzb();
    }

    public final e zzd() {
        return this.f25150l.zzd();
    }

    public final n4 zzj() {
        return ((w5) q.k(this.f25150l)).zzj();
    }

    public final q5 zzl() {
        return ((w5) q.k(this.f25150l)).zzl();
    }

    private va(fb fbVar, w5 w5Var) {
        this.f25151m = false;
        this.f25155q = new HashSet();
        this.G = new cb(this);
        q.k(fbVar);
        this.f25150l = w5.a(fbVar.f24592a, (zzdd) null, (Long) null);
        this.A = -1;
        this.f25148j = new ta(this);
        db dbVar = new db(this);
        dbVar.q();
        this.f25145g = dbVar;
        u4 u4Var = new u4(this);
        u4Var.q();
        this.f25140b = u4Var;
        i5 i5Var = new i5(this);
        i5Var.q();
        this.f25139a = i5Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        zzl().y(new ya(this, fbVar));
    }
}
