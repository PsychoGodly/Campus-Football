package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class pb extends ua {

    /* renamed from: d  reason: collision with root package name */
    private String f24948d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f24949e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, rb> f24950f;

    /* renamed from: g  reason: collision with root package name */
    private Long f24951g;

    /* renamed from: h  reason: collision with root package name */
    private Long f24952h;

    pb(va vaVar) {
        super(vaVar);
    }

    private final rb t(Integer num) {
        if (this.f24950f.containsKey(num)) {
            return this.f24950f.get(num);
        }
        rb rbVar = new rb(this, this.f24948d);
        this.f24950f.put(num, rbVar);
        return rbVar;
    }

    private final boolean v(int i10, int i11) {
        rb rbVar = this.f24950f.get(Integer.valueOf(i10));
        if (rbVar == null) {
            return false;
        }
        return rbVar.f25033d.get(i11);
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x02fc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.zzfi.zzc> u(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.zzfi.zze> r54, java.util.List<com.google.android.gms.internal.measurement.zzfi.zzn> r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            r52 = this;
            r10 = r52
            com.google.android.gms.common.internal.q.g(r53)
            com.google.android.gms.common.internal.q.k(r54)
            com.google.android.gms.common.internal.q.k(r55)
            r0 = r53
            r10.f24948d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f24949e = r0
            androidx.collection.a r0 = new androidx.collection.a
            r0.<init>()
            r10.f24950f = r0
            r0 = r56
            r10.f24951g = r0
            r0 = r57
            r10.f24952h = r0
            java.util.Iterator r0 = r54.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1
            java.lang.String r1 = r1.zzg()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r0 = com.google.android.gms.internal.measurement.zzob.zza()
            if (r0 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.f r0 = r52.a()
            java.lang.String r2 = r10.f24948d
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.e0.f24511j0
            boolean r0 = r0.y(r2, r3)
            if (r0 == 0) goto L_0x005c
            r13 = 1
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            boolean r0 = com.google.android.gms.internal.measurement.zzob.zza()
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.f r0 = r52.a()
            java.lang.String r2 = r10.f24948d
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.e0.f24509i0
            boolean r0 = r0.y(r2, r3)
            if (r0 == 0) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.m r2 = r52.l()
            java.lang.String r3 = r10.f24948d
            r2.p()
            r2.i()
            com.google.android.gms.common.internal.q.g(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.w()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r5 = "events"
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00a3 }
            r7[r11] = r3     // Catch:{ SQLiteException -> 0x00a3 }
            r4.update(r5, r0, r6, r7)     // Catch:{ SQLiteException -> 0x00a3 }
            goto L_0x00b5
        L_0x00a3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r2 = r2.zzj()
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.c(r4, r3, r0)
        L_0x00b5:
            java.util.Map r0 = java.util.Collections.emptyMap()
            if (r14 == 0) goto L_0x00c7
            if (r13 == 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.m r0 = r52.l()
            java.lang.String r2 = r10.f24948d
            java.util.Map r0 = r0.J0(r2)
        L_0x00c7:
            com.google.android.gms.measurement.internal.m r2 = r52.l()
            java.lang.String r3 = r10.f24948d
            java.util.Map r15 = r2.I0(r3)
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L_0x039b
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r3 = r15.keySet()
            r2.<init>(r3)
            if (r1 == 0) goto L_0x01f6
            java.lang.String r1 = r10.f24948d
            com.google.android.gms.measurement.internal.m r3 = r52.l()
            java.lang.String r4 = r10.f24948d
            java.util.Map r3 = r3.K0(r4)
            com.google.android.gms.common.internal.q.g(r1)
            com.google.android.gms.common.internal.q.k(r15)
            androidx.collection.a r1 = new androidx.collection.a
            r1.<init>()
            boolean r4 = r15.isEmpty()
            if (r4 != 0) goto L_0x01f4
            java.util.Set r4 = r15.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0107:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f4
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r15.get(r6)
            com.google.android.gms.internal.measurement.zzfi$zzl r6 = (com.google.android.gms.internal.measurement.zzfi.zzl) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r3.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x01e5
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0135
            goto L_0x01e5
        L_0x0135:
            com.google.android.gms.measurement.internal.db r8 = r52.j()
            java.util.List r9 = r6.zzi()
            java.util.List r8 = r8.I(r9, r7)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0107
            com.google.android.gms.internal.measurement.zzix$zzb r9 = r6.zzby()
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zzl.zza) r9
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r9 = r9.zzb()
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r8 = r9.zzb(r8)
            com.google.android.gms.measurement.internal.db r9 = r52.j()
            java.util.List r11 = r6.zzk()
            java.util.List r9 = r9.I(r11, r7)
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r11 = r8.zzd()
            r11.zzd(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r11 = r6.zzh()
            java.util.Iterator r11 = r11.iterator()
        L_0x0175:
            boolean r16 = r11.hasNext()
            if (r16 == 0) goto L_0x019a
            java.lang.Object r16 = r11.next()
            r12 = r16
            com.google.android.gms.internal.measurement.zzfi$zzd r12 = (com.google.android.gms.internal.measurement.zzfi.zzd) r12
            int r16 = r12.zza()
            r17 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x0196
            r9.add(r12)
        L_0x0196:
            r3 = r17
            r12 = 1
            goto L_0x0175
        L_0x019a:
            r17 = r3
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r3 = r8.zza()
            r3.zza(r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r6 = r6.zzj()
            java.util.Iterator r6 = r6.iterator()
        L_0x01b0:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x01ce
            java.lang.Object r9 = r6.next()
            com.google.android.gms.internal.measurement.zzfi$zzm r9 = (com.google.android.gms.internal.measurement.zzfi.zzm) r9
            int r11 = r9.zzb()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 != 0) goto L_0x01b0
            r3.add(r9)
            goto L_0x01b0
        L_0x01ce:
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r6 = r8.zzc()
            r6.zzc(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.internal.measurement.zzkj r5 = r8.zzab()
            com.google.android.gms.internal.measurement.zzix r5 = (com.google.android.gms.internal.measurement.zzix) r5
            com.google.android.gms.internal.measurement.zzfi$zzl r5 = (com.google.android.gms.internal.measurement.zzfi.zzl) r5
            r1.put(r3, r5)
            goto L_0x01ee
        L_0x01e5:
            r17 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1.put(r3, r6)
        L_0x01ee:
            r3 = r17
            r11 = 0
            r12 = 1
            goto L_0x0107
        L_0x01f4:
            r11 = r1
            goto L_0x01f7
        L_0x01f6:
            r11 = r15
        L_0x01f7:
            java.util.Iterator r12 = r2.iterator()
        L_0x01fb:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x039b
            java.lang.Object r1 = r12.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r16 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            java.lang.Object r1 = r11.get(r1)
            com.google.android.gms.internal.measurement.zzfi$zzl r1 = (com.google.android.gms.internal.measurement.zzfi.zzl) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            androidx.collection.a r7 = new androidx.collection.a
            r7.<init>()
            if (r1 == 0) goto L_0x0263
            int r2 = r1.zza()
            if (r2 != 0) goto L_0x022d
            goto L_0x0263
        L_0x022d:
            java.util.List r2 = r1.zzh()
            java.util.Iterator r2 = r2.iterator()
        L_0x0235:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0263
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfi$zzd r3 = (com.google.android.gms.internal.measurement.zzfi.zzd) r3
            boolean r4 = r3.zzf()
            if (r4 == 0) goto L_0x0235
            int r4 = r3.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.zze()
            if (r8 == 0) goto L_0x025e
            long r8 = r3.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x025f
        L_0x025e:
            r3 = 0
        L_0x025f:
            r7.put(r4, r3)
            goto L_0x0235
        L_0x0263:
            androidx.collection.a r8 = new androidx.collection.a
            r8.<init>()
            if (r1 == 0) goto L_0x02b0
            int r2 = r1.zzc()
            if (r2 != 0) goto L_0x0271
            goto L_0x02b0
        L_0x0271:
            java.util.List r2 = r1.zzj()
            java.util.Iterator r2 = r2.iterator()
        L_0x0279:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02b0
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfi$zzm r3 = (com.google.android.gms.internal.measurement.zzfi.zzm) r3
            boolean r4 = r3.zzf()
            if (r4 == 0) goto L_0x02ad
            int r4 = r3.zza()
            if (r4 <= 0) goto L_0x02ad
            int r4 = r3.zzb()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r9 = r3.zza()
            r17 = 1
            int r9 = r9 + -1
            long r18 = r3.zza((int) r9)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r4, r3)
            goto L_0x0279
        L_0x02ad:
            r17 = 1
            goto L_0x0279
        L_0x02b0:
            r17 = 1
            if (r1 == 0) goto L_0x0301
            r2 = 0
        L_0x02b5:
            int r3 = r1.zzd()
            int r3 = r3 << 6
            if (r2 >= r3) goto L_0x0301
            java.util.List r3 = r1.zzk()
            boolean r3 = com.google.android.gms.measurement.internal.db.Y(r3, r2)
            if (r3 == 0) goto L_0x02f0
            com.google.android.gms.measurement.internal.n4 r3 = r52.zzj()
            com.google.android.gms.measurement.internal.p4 r3 = r3.F()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r18 = r11
            java.lang.String r11 = "Filter already evaluated. audience ID, filter ID"
            r3.c(r11, r4, r9)
            r6.set(r2)
            java.util.List r3 = r1.zzi()
            boolean r3 = com.google.android.gms.measurement.internal.db.Y(r3, r2)
            if (r3 == 0) goto L_0x02f2
            r5.set(r2)
            r3 = 1
            goto L_0x02f3
        L_0x02f0:
            r18 = r11
        L_0x02f2:
            r3 = 0
        L_0x02f3:
            if (r3 != 0) goto L_0x02fc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.remove(r3)
        L_0x02fc:
            int r2 = r2 + 1
            r11 = r18
            goto L_0x02b5
        L_0x0301:
            r18 = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            java.lang.Object r1 = r15.get(r1)
            r4 = r1
            com.google.android.gms.internal.measurement.zzfi$zzl r4 = (com.google.android.gms.internal.measurement.zzfi.zzl) r4
            if (r14 == 0) goto L_0x037e
            if (r13 == 0) goto L_0x037e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x037e
            java.lang.Long r2 = r10.f24952h
            if (r2 == 0) goto L_0x037e
            java.lang.Long r2 = r10.f24951g
            if (r2 != 0) goto L_0x0327
            goto L_0x037e
        L_0x0327:
            java.util.Iterator r1 = r1.iterator()
        L_0x032b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x037e
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.zzew$zzb r2 = (com.google.android.gms.internal.measurement.zzew.zzb) r2
            int r3 = r2.zzb()
            java.lang.Long r9 = r10.f24952h
            long r19 = r9.longValue()
            r21 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 / r21
            boolean r2 = r2.zzi()
            if (r2 == 0) goto L_0x0353
            java.lang.Long r2 = r10.f24951g
            long r19 = r2.longValue()
            long r19 = r19 / r21
        L_0x0353:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x0368
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r9 = java.lang.Long.valueOf(r19)
            r7.put(r2, r9)
        L_0x0368:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L_0x032b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r19)
            r8.put(r2, r3)
            goto L_0x032b
        L_0x037e:
            com.google.android.gms.measurement.internal.rb r11 = new com.google.android.gms.measurement.internal.rb
            java.lang.String r3 = r10.f24948d
            r9 = 0
            r1 = r11
            r2 = r52
            r57 = r12
            r12 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.rb> r1 = r10.f24950f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.put(r2, r11)
            r12 = r57
            r11 = r18
            goto L_0x01fb
        L_0x039b:
            r12 = 0
            r17 = 1
            boolean r0 = r54.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 != 0) goto L_0x050f
            com.google.android.gms.measurement.internal.tb r0 = new com.google.android.gms.measurement.internal.tb
            r0.<init>(r10)
            androidx.collection.a r2 = new androidx.collection.a
            r2.<init>()
            java.util.Iterator r3 = r54.iterator()
        L_0x03b4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x050f
            java.lang.Object r4 = r3.next()
            com.google.android.gms.internal.measurement.zzfi$zze r4 = (com.google.android.gms.internal.measurement.zzfi.zze) r4
            java.lang.String r5 = r10.f24948d
            com.google.android.gms.internal.measurement.zzfi$zze r5 = r0.a(r5, r4)
            if (r5 == 0) goto L_0x03b4
            com.google.android.gms.measurement.internal.m r6 = r52.l()
            java.lang.String r7 = r10.f24948d
            java.lang.String r8 = r5.zzg()
            java.lang.String r9 = r4.zzg()
            com.google.android.gms.measurement.internal.a0 r9 = r6.x0(r7, r9)
            if (r9 != 0) goto L_0x0417
            com.google.android.gms.measurement.internal.n4 r9 = r6.zzj()
            com.google.android.gms.measurement.internal.p4 r9 = r9.G()
            java.lang.Object r11 = com.google.android.gms.measurement.internal.n4.q(r7)
            com.google.android.gms.measurement.internal.m4 r6 = r6.d()
            java.lang.String r6 = r6.c(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r9.c(r8, r11, r6)
            com.google.android.gms.measurement.internal.a0 r6 = new com.google.android.gms.measurement.internal.a0
            r18 = r6
            java.lang.String r20 = r4.zzg()
            r21 = 1
            r23 = 1
            r25 = 1
            long r27 = r4.zzd()
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r19 = r7
            r18.<init>(r19, r20, r21, r23, r25, r27, r29, r31, r32, r33, r34)
            goto L_0x044c
        L_0x0417:
            com.google.android.gms.measurement.internal.a0 r6 = new com.google.android.gms.measurement.internal.a0
            r35 = r6
            java.lang.String r4 = r9.f24337a
            r36 = r4
            java.lang.String r4 = r9.f24338b
            r37 = r4
            long r7 = r9.f24339c
            r13 = 1
            long r38 = r7 + r13
            long r7 = r9.f24340d
            long r40 = r7 + r13
            long r7 = r9.f24341e
            long r42 = r7 + r13
            long r7 = r9.f24342f
            r44 = r7
            long r7 = r9.f24343g
            r46 = r7
            java.lang.Long r4 = r9.f24344h
            r48 = r4
            java.lang.Long r4 = r9.f24345i
            r49 = r4
            java.lang.Long r4 = r9.f24346j
            r50 = r4
            java.lang.Boolean r4 = r9.f24347k
            r51 = r4
            r35.<init>(r36, r37, r38, r40, r42, r44, r46, r48, r49, r50, r51)
        L_0x044c:
            com.google.android.gms.measurement.internal.m r4 = r52.l()
            r4.P(r6)
            long r7 = r6.f24339c
            java.lang.String r4 = r5.zzg()
            java.lang.Object r9 = r2.get(r4)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x046e
            com.google.android.gms.measurement.internal.m r9 = r52.l()
            java.lang.String r11 = r10.f24948d
            java.util.Map r9 = r9.C0(r11, r4)
            r2.put(r4, r9)
        L_0x046e:
            java.util.Set r4 = r9.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0476:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x03b4
            java.lang.Object r11 = r4.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.util.Set<java.lang.Integer> r13 = r10.f24949e
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            boolean r13 = r13.contains(r14)
            if (r13 == 0) goto L_0x04a2
            com.google.android.gms.measurement.internal.n4 r13 = r52.zzj()
            com.google.android.gms.measurement.internal.p4 r13 = r13.F()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.b(r1, r11)
            goto L_0x0476
        L_0x04a2:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            java.lang.Object r13 = r9.get(r13)
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r13 = r13.iterator()
            r14 = 1
        L_0x04b1:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x04fd
            java.lang.Object r14 = r13.next()
            com.google.android.gms.internal.measurement.zzew$zzb r14 = (com.google.android.gms.internal.measurement.zzew.zzb) r14
            com.google.android.gms.measurement.internal.ub r15 = new com.google.android.gms.measurement.internal.ub
            java.lang.String r12 = r10.f24948d
            r15.<init>(r10, r12, r11, r14)
            java.lang.Long r12 = r10.f24951g
            r57 = r0
            java.lang.Long r0 = r10.f24952h
            int r14 = r14.zzb()
            boolean r25 = r10.v(r11, r14)
            r18 = r15
            r19 = r12
            r20 = r0
            r21 = r5
            r22 = r7
            r24 = r6
            boolean r14 = r18.k(r19, r20, r21, r22, r24, r25)
            if (r14 == 0) goto L_0x04f3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            com.google.android.gms.measurement.internal.rb r0 = r10.t(r0)
            r0.c(r15)
            r0 = r57
            r12 = 0
            goto L_0x04b1
        L_0x04f3:
            java.util.Set<java.lang.Integer> r0 = r10.f24949e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r0.add(r12)
            goto L_0x04ff
        L_0x04fd:
            r57 = r0
        L_0x04ff:
            if (r14 != 0) goto L_0x050a
            java.util.Set<java.lang.Integer> r0 = r10.f24949e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.add(r11)
        L_0x050a:
            r0 = r57
            r12 = 0
            goto L_0x0476
        L_0x050f:
            boolean r0 = r55.isEmpty()
            if (r0 != 0) goto L_0x0653
            androidx.collection.a r0 = new androidx.collection.a
            r0.<init>()
            java.util.Iterator r2 = r55.iterator()
        L_0x051e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0653
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfi$zzn r3 = (com.google.android.gms.internal.measurement.zzfi.zzn) r3
            java.lang.String r4 = r3.zzg()
            java.lang.Object r5 = r0.get(r4)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x0543
            com.google.android.gms.measurement.internal.m r5 = r52.l()
            java.lang.String r6 = r10.f24948d
            java.util.Map r5 = r5.E0(r6, r4)
            r0.put(r4, r5)
        L_0x0543:
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x054b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x051e
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set<java.lang.Integer> r7 = r10.f24949e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x0577
            com.google.android.gms.measurement.internal.n4 r3 = r52.zzj()
            com.google.android.gms.measurement.internal.p4 r3 = r3.F()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.b(r1, r4)
            goto L_0x051e
        L_0x0577:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r5.get(r7)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x0586:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0646
            java.lang.Object r8 = r7.next()
            com.google.android.gms.internal.measurement.zzew$zze r8 = (com.google.android.gms.internal.measurement.zzew.zze) r8
            com.google.android.gms.measurement.internal.n4 r9 = r52.zzj()
            r11 = 2
            boolean r9 = r9.x(r11)
            if (r9 == 0) goto L_0x05df
            com.google.android.gms.measurement.internal.n4 r9 = r52.zzj()
            com.google.android.gms.measurement.internal.p4 r9 = r9.F()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r12 = r8.zzi()
            if (r12 == 0) goto L_0x05b8
            int r12 = r8.zza()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x05b9
        L_0x05b8:
            r12 = 0
        L_0x05b9:
            com.google.android.gms.measurement.internal.m4 r13 = r52.d()
            java.lang.String r14 = r8.zze()
            java.lang.String r13 = r13.g(r14)
            java.lang.String r14 = "Evaluating filter. audience, filter, property"
            r9.d(r14, r11, r12, r13)
            com.google.android.gms.measurement.internal.n4 r9 = r52.zzj()
            com.google.android.gms.measurement.internal.p4 r9 = r9.F()
            com.google.android.gms.measurement.internal.db r11 = r52.j()
            java.lang.String r11 = r11.E(r8)
            java.lang.String r12 = "Filter definition"
            r9.b(r12, r11)
        L_0x05df:
            boolean r9 = r8.zzi()
            if (r9 == 0) goto L_0x061e
            int r9 = r8.zza()
            r11 = 256(0x100, float:3.59E-43)
            if (r9 <= r11) goto L_0x05ee
            goto L_0x061e
        L_0x05ee:
            com.google.android.gms.measurement.internal.b r9 = new com.google.android.gms.measurement.internal.b
            java.lang.String r11 = r10.f24948d
            r9.<init>(r10, r11, r6, r8)
            java.lang.Long r11 = r10.f24951g
            java.lang.Long r12 = r10.f24952h
            int r8 = r8.zza()
            boolean r8 = r10.v(r6, r8)
            boolean r8 = r9.k(r11, r12, r3, r8)
            if (r8 == 0) goto L_0x0614
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.measurement.internal.rb r11 = r10.t(r11)
            r11.c(r9)
            goto L_0x0586
        L_0x0614:
            java.util.Set<java.lang.Integer> r7 = r10.f24949e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.add(r9)
            goto L_0x0646
        L_0x061e:
            com.google.android.gms.measurement.internal.n4 r7 = r52.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.G()
            java.lang.String r9 = r10.f24948d
            java.lang.Object r9 = com.google.android.gms.measurement.internal.n4.q(r9)
            boolean r11 = r8.zzi()
            if (r11 == 0) goto L_0x063b
            int r8 = r8.zza()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x063c
        L_0x063b:
            r8 = 0
        L_0x063c:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r7.c(r11, r9, r8)
            r8 = 0
        L_0x0646:
            if (r8 != 0) goto L_0x054b
            java.util.Set<java.lang.Integer> r7 = r10.f24949e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            goto L_0x054b
        L_0x0653:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.rb> r0 = r10.f24950f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r10.f24949e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0667:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06fa
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.rb> r3 = r10.f24950f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.rb r3 = (com.google.android.gms.measurement.internal.rb) r3
            com.google.android.gms.common.internal.q.k(r3)
            com.google.android.gms.internal.measurement.zzfi$zzc r3 = r3.a(r0)
            r1.add(r3)
            com.google.android.gms.measurement.internal.m r4 = r52.l()
            java.lang.String r5 = r10.f24948d
            com.google.android.gms.internal.measurement.zzfi$zzl r3 = r3.zzd()
            r4.p()
            r4.i()
            com.google.android.gms.common.internal.q.g(r5)
            com.google.android.gms.common.internal.q.k(r3)
            byte[] r3 = r3.zzbv()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "audience_id"
            r6.put(r7, r0)
            java.lang.String r0 = "current_results"
            r6.put(r0, r3)
            android.database.sqlite.SQLiteDatabase r0 = r4.w()     // Catch:{ SQLiteException -> 0x06e5 }
            java.lang.String r3 = "audience_filter_values"
            r7 = 5
            r8 = 0
            long r6 = r0.insertWithOnConflict(r3, r8, r6, r7)     // Catch:{ SQLiteException -> 0x06e3 }
            r11 = -1
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0667
            com.google.android.gms.measurement.internal.n4 r0 = r4.zzj()     // Catch:{ SQLiteException -> 0x06e3 }
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()     // Catch:{ SQLiteException -> 0x06e3 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.n4.q(r5)     // Catch:{ SQLiteException -> 0x06e3 }
            r0.b(r3, r6)     // Catch:{ SQLiteException -> 0x06e3 }
            goto L_0x0667
        L_0x06e3:
            r0 = move-exception
            goto L_0x06e7
        L_0x06e5:
            r0 = move-exception
            r8 = 0
        L_0x06e7:
            com.google.android.gms.measurement.internal.n4 r3 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.n4.q(r5)
            java.lang.String r5 = "Error storing filter results. appId"
            r3.c(r5, r4, r0)
            goto L_0x0667
        L_0x06fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pb.u(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
