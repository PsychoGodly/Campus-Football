package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzew;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class ub extends c {

    /* renamed from: g  reason: collision with root package name */
    private zzew.zzb f25105g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ pb f25106h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ub(pb pbVar, String str, int i10, zzew.zzb zzb) {
        super(str, i10);
        this.f25106h = pbVar;
        this.f25105g = zzb;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f25105g.zzb();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.f25105g.zzk();
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v15, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.zzfi.zze r18, long r19, com.google.android.gms.measurement.internal.a0 r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = com.google.android.gms.internal.measurement.zzob.zza()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.measurement.internal.pb r1 = r0.f25106h
            com.google.android.gms.measurement.internal.f r1 = r1.a()
            java.lang.String r4 = r0.f24415a
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.e0.f24511j0
            boolean r1 = r1.y(r4, r5)
            if (r1 == 0) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            com.google.android.gms.internal.measurement.zzew$zzb r4 = r0.f25105g
            boolean r4 = r4.zzj()
            if (r4 == 0) goto L_0x0029
            r4 = r21
            long r4 = r4.f24341e
            goto L_0x002b
        L_0x0029:
            r4 = r19
        L_0x002b:
            com.google.android.gms.measurement.internal.pb r6 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r6 = r6.zzj()
            r7 = 2
            boolean r6 = r6.x(r7)
            r7 = 0
            if (r6 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.pb r6 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r6 = r6.zzj()
            com.google.android.gms.measurement.internal.p4 r6 = r6.F()
            int r8 = r0.f24416b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.android.gms.internal.measurement.zzew$zzb r9 = r0.f25105g
            boolean r9 = r9.zzl()
            if (r9 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.zzew$zzb r9 = r0.f25105g
            int r9 = r9.zzb()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x005d
        L_0x005c:
            r9 = r7
        L_0x005d:
            com.google.android.gms.measurement.internal.pb r10 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r10 = r10.d()
            com.google.android.gms.internal.measurement.zzew$zzb r11 = r0.f25105g
            java.lang.String r11 = r11.zzf()
            java.lang.String r10 = r10.c(r11)
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            r6.d(r11, r8, r9, r10)
            com.google.android.gms.measurement.internal.pb r6 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r6 = r6.zzj()
            com.google.android.gms.measurement.internal.p4 r6 = r6.F()
            com.google.android.gms.measurement.internal.pb r8 = r0.f25106h
            com.google.android.gms.measurement.internal.db r8 = r8.j()
            com.google.android.gms.internal.measurement.zzew$zzb r9 = r0.f25105g
            java.lang.String r8 = r8.D(r9)
            java.lang.String r9 = "Filter definition"
            r6.b(r9, r8)
        L_0x008d:
            com.google.android.gms.internal.measurement.zzew$zzb r6 = r0.f25105g
            boolean r6 = r6.zzl()
            if (r6 == 0) goto L_0x03fd
            com.google.android.gms.internal.measurement.zzew$zzb r6 = r0.f25105g
            int r6 = r6.zzb()
            r8 = 256(0x100, float:3.59E-43)
            if (r6 <= r8) goto L_0x00a1
            goto L_0x03fd
        L_0x00a1:
            com.google.android.gms.internal.measurement.zzew$zzb r6 = r0.f25105g
            boolean r6 = r6.zzh()
            com.google.android.gms.internal.measurement.zzew$zzb r8 = r0.f25105g
            boolean r8 = r8.zzi()
            com.google.android.gms.internal.measurement.zzew$zzb r9 = r0.f25105g
            boolean r9 = r9.zzj()
            if (r6 != 0) goto L_0x00bc
            if (r8 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r6 = 0
            goto L_0x00bd
        L_0x00bc:
            r6 = 1
        L_0x00bd:
            if (r22 == 0) goto L_0x00e9
            if (r6 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.pb r1 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r1 = r1.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.F()
            int r2 = r0.f24416b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.zzew$zzb r4 = r0.f25105g
            boolean r4 = r4.zzl()
            if (r4 == 0) goto L_0x00e3
            com.google.android.gms.internal.measurement.zzew$zzb r4 = r0.f25105g
            int r4 = r4.zzb()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x00e3:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r4, r2, r7)
            return r3
        L_0x00e9:
            com.google.android.gms.internal.measurement.zzew$zzb r8 = r0.f25105g
            java.lang.String r9 = r18.zzg()
            boolean r10 = r8.zzk()
            if (r10 == 0) goto L_0x010b
            com.google.android.gms.internal.measurement.zzew$zzd r10 = r8.zze()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.c.c(r4, r10)
            if (r4 != 0) goto L_0x0101
            goto L_0x03a2
        L_0x0101:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x010b
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x010b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r8.zzg()
            java.util.Iterator r5 = r5.iterator()
        L_0x0118:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0151
            java.lang.Object r10 = r5.next()
            com.google.android.gms.internal.measurement.zzew$zzc r10 = (com.google.android.gms.internal.measurement.zzew.zzc) r10
            java.lang.String r11 = r10.zze()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()
            com.google.android.gms.measurement.internal.pb r5 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            java.lang.String r8 = "null or empty param name in filter. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0149:
            java.lang.String r10 = r10.zze()
            r4.add(r10)
            goto L_0x0118
        L_0x0151:
            androidx.collection.a r5 = new androidx.collection.a
            r5.<init>()
            java.util.List r10 = r18.zzh()
            java.util.Iterator r10 = r10.iterator()
        L_0x015e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01eb
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.zzfi$zzg r11 = (com.google.android.gms.internal.measurement.zzfi.zzg) r11
            java.lang.String r12 = r11.zzg()
            boolean r12 = r4.contains(r12)
            if (r12 == 0) goto L_0x015e
            boolean r12 = r11.zzl()
            if (r12 == 0) goto L_0x0192
            java.lang.String r12 = r11.zzg()
            boolean r13 = r11.zzl()
            if (r13 == 0) goto L_0x018d
            long r13 = r11.zzd()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x018e
        L_0x018d:
            r11 = r7
        L_0x018e:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x0192:
            boolean r12 = r11.zzj()
            if (r12 == 0) goto L_0x01b0
            java.lang.String r12 = r11.zzg()
            boolean r13 = r11.zzj()
            if (r13 == 0) goto L_0x01ab
            double r13 = r11.zza()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ac
        L_0x01ab:
            r11 = r7
        L_0x01ac:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01b0:
            boolean r12 = r11.zzn()
            if (r12 == 0) goto L_0x01c2
            java.lang.String r12 = r11.zzg()
            java.lang.String r11 = r11.zzh()
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01c2:
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()
            com.google.android.gms.measurement.internal.pb r5 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.pb r8 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r8 = r8.d()
            java.lang.String r9 = r11.zzg()
            java.lang.String r8 = r8.f(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x01eb:
            java.util.List r4 = r8.zzg()
            java.util.Iterator r4 = r4.iterator()
        L_0x01f3:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x03a0
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.zzew$zzc r8 = (com.google.android.gms.internal.measurement.zzew.zzc) r8
            boolean r10 = r8.zzg()
            if (r10 == 0) goto L_0x020d
            boolean r10 = r8.zzf()
            if (r10 == 0) goto L_0x020d
            r10 = 1
            goto L_0x020e
        L_0x020d:
            r10 = 0
        L_0x020e:
            java.lang.String r11 = r8.zze()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0233
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()
            com.google.android.gms.measurement.internal.pb r5 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            java.lang.String r8 = "Event has empty param name. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0233:
            java.lang.Object r12 = r5.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0282
            boolean r13 = r8.zzh()
            if (r13 != 0) goto L_0x0266
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()
            com.google.android.gms.measurement.internal.pb r5 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.pb r8 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No number filter for long param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0266:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.zzew$zzd r8 = r8.zzc()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.c.c(r11, r8)
            if (r8 != 0) goto L_0x0278
            goto L_0x03a2
        L_0x0278:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x0282:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02cd
            boolean r13 = r8.zzh()
            if (r13 != 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()
            com.google.android.gms.measurement.internal.pb r5 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.pb r8 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No number filter for double param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x02b1:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.zzew$zzd r8 = r8.zzc()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.c.b(r11, r8)
            if (r8 != 0) goto L_0x02c3
            goto L_0x03a2
        L_0x02c3:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x02cd:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0354
            boolean r13 = r8.zzj()
            if (r13 == 0) goto L_0x02e8
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.zzew$zzf r8 = r8.zzd()
            com.google.android.gms.measurement.internal.pb r11 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r11 = r11.zzj()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.c.g(r12, r8, r11)
            goto L_0x02fe
        L_0x02e8:
            boolean r13 = r8.zzh()
            if (r13 == 0) goto L_0x0330
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.db.a0(r12)
            if (r13 == 0) goto L_0x030c
            com.google.android.gms.internal.measurement.zzew$zzd r8 = r8.zzc()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.c.e(r12, r8)
        L_0x02fe:
            if (r8 != 0) goto L_0x0302
            goto L_0x03a2
        L_0x0302:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x030c:
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()
            com.google.android.gms.measurement.internal.pb r5 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.pb r8 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0330:
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()
            com.google.android.gms.measurement.internal.pb r5 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.pb r8 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No filter for String param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0354:
            if (r12 != 0) goto L_0x037c
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.F()
            com.google.android.gms.measurement.internal.pb r5 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.pb r7 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r7 = r7.d()
            java.lang.String r7 = r7.f(r11)
            java.lang.String r8 = "Missing param for filter. event, param"
            r4.c(r8, r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x037c:
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()
            com.google.android.gms.measurement.internal.pb r5 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.pb r8 = r0.f25106h
            com.google.android.gms.measurement.internal.m4 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "Unknown param type. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x03a0:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x03a2:
            com.google.android.gms.measurement.internal.pb r4 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.F()
            if (r7 != 0) goto L_0x03b1
            java.lang.String r5 = "null"
            goto L_0x03b2
        L_0x03b1:
            r5 = r7
        L_0x03b2:
            java.lang.String r8 = "Event filter result"
            r4.b(r8, r5)
            if (r7 != 0) goto L_0x03ba
            return r2
        L_0x03ba:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f24417c = r2
            boolean r4 = r7.booleanValue()
            if (r4 != 0) goto L_0x03c5
            return r3
        L_0x03c5:
            r0.f24418d = r2
            if (r6 == 0) goto L_0x03fc
            boolean r2 = r18.zzk()
            if (r2 == 0) goto L_0x03fc
            long r4 = r18.zzd()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.measurement.zzew$zzb r4 = r0.f25105g
            boolean r4 = r4.zzi()
            if (r4 == 0) goto L_0x03ee
            if (r1 == 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzew$zzb r1 = r0.f25105g
            boolean r1 = r1.zzk()
            if (r1 == 0) goto L_0x03eb
            r2 = r16
        L_0x03eb:
            r0.f24420f = r2
            goto L_0x03fc
        L_0x03ee:
            if (r1 == 0) goto L_0x03fa
            com.google.android.gms.internal.measurement.zzew$zzb r1 = r0.f25105g
            boolean r1 = r1.zzk()
            if (r1 == 0) goto L_0x03fa
            r2 = r17
        L_0x03fa:
            r0.f24419e = r2
        L_0x03fc:
            return r3
        L_0x03fd:
            com.google.android.gms.measurement.internal.pb r1 = r0.f25106h
            com.google.android.gms.measurement.internal.n4 r1 = r1.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.G()
            java.lang.String r3 = r0.f24415a
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r3)
            com.google.android.gms.internal.measurement.zzew$zzb r4 = r0.f25105g
            boolean r4 = r4.zzl()
            if (r4 == 0) goto L_0x041f
            com.google.android.gms.internal.measurement.zzew$zzb r4 = r0.f25105g
            int r4 = r4.zzb()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x041f:
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r5 = "Invalid event filter ID. appId, id"
            r1.c(r5, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ub.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzfi$zze, long, com.google.android.gms.measurement.internal.a0, boolean):boolean");
    }
}
