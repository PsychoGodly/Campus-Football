package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.aa;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final String f11998a = "FileManager";

    /* renamed from: b  reason: collision with root package name */
    private final k f11999b;

    /* renamed from: c  reason: collision with root package name */
    private final t f12000c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f12001d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Set f12002e = new HashSet();

    p(k kVar) {
        this.f11999b = kVar;
        this.f12000c = kVar.L();
    }

    /* JADX INFO: finally extract failed */
    private boolean f(File file) {
        if (t.a()) {
            t tVar = this.f12000c;
            tVar.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            c(file);
            boolean delete = file.delete();
            if (!delete) {
                this.f11999b.B().a(o.b.FILE_ERROR, "removeFile", (Map) CollectionUtils.hashMap("path", file.getAbsolutePath()));
            }
            g(file);
            return delete;
        } catch (Throwable th) {
            g(file);
            throw th;
        }
    }

    private void g(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f12001d) {
            if (!this.f12002e.remove(absolutePath)) {
                this.f11999b.B().a(o.b.FILE_ERROR, "unlockFile", (Map) CollectionUtils.hashMap("path", absolutePath));
            }
            this.f12001d.notifyAll();
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z10, s2 s2Var) {
        return a(context, str, str2, list, z10, false, s2Var);
    }

    public void b(Context context) {
        if (this.f11999b.A0()) {
            if (t.a()) {
                this.f12000c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    public void c(b bVar, Context context) {
        this.f11999b.l0().a((xl) new kn(this.f11999b, false, "removeCachedResourcesForAd", new m1(this, bVar, context)), sm.b.CACHING);
    }

    public void d(b bVar, Context context) {
        this.f11999b.l0().a((xl) new kn(this.f11999b, false, "removeCachedVideoResourceForAd", new n1(this, bVar, context)), sm.b.CACHING);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c2 A[Catch:{ all -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x020e A[Catch:{ all -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x018f A[Catch:{ all -> 0x0234 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:122:0x0208=Splitter:B:122:0x0208, B:94:0x0189=Splitter:B:94:0x0189, B:107:0x01bc=Splitter:B:107:0x01bc} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:98:0x0194=Splitter:B:98:0x0194, B:111:0x01dd=Splitter:B:111:0x01dd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String e(java.io.File r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = com.applovin.impl.sdk.t.a()
            java.lang.String r2 = "FileManager"
            if (r1 == 0) goto L_0x0026
            com.applovin.impl.sdk.t r1 = r13.f12000c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading resource from filesystem: "
            r3.append(r4)
            java.lang.String r4 = r14.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.a((java.lang.String) r2, (java.lang.String) r3)
        L_0x0026:
            com.applovin.impl.sdk.k r1 = r13.f11999b
            com.applovin.impl.oj r3 = com.applovin.impl.oj.M
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r3 = "readFile"
            java.lang.String r4 = "Failed to read file: "
            java.lang.String r5 = "readFileIO"
            java.lang.String r6 = "File not found. "
            java.lang.String r7 = "readFileNotFound"
            java.lang.String r8 = "Unknown failure to read file."
            r9 = 0
            r10 = 1
            java.lang.String r11 = "removeFileAfterReadFail"
            if (r1 == 0) goto L_0x0152
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ac, all -> 0x007b }
            r1.<init>(r14)     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ac, all -> 0x007b }
            r13.c((java.io.File) r14)     // Catch:{ all -> 0x0071 }
            java.lang.String r12 = r13.a((java.io.InputStream) r1)     // Catch:{ all -> 0x0071 }
            if (r12 != 0) goto L_0x0055
            r9 = 1
        L_0x0055:
            r1.close()     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ac, all -> 0x007b }
            if (r9 == 0) goto L_0x006d
            com.applovin.impl.sdk.k r0 = r13.f11999b
            com.applovin.impl.oj r1 = com.applovin.impl.oj.f10305g1
            java.lang.Object r0 = r0.a((com.applovin.impl.oj) r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006d
            r13.a((java.io.File) r14, (java.lang.String) r11)
        L_0x006d:
            r13.g(r14)
            return r12
        L_0x0071:
            r12 = move-exception
            r1.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r1 = move-exception
            r12.addSuppressed(r1)     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ac, all -> 0x007b }
        L_0x007a:
            throw r12     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00ac, all -> 0x007b }
        L_0x007b:
            r1 = move-exception
            boolean r4 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0137 }
            if (r4 == 0) goto L_0x0087
            com.applovin.impl.sdk.t r4 = r13.f12000c     // Catch:{ all -> 0x0137 }
            r4.a(r2, r8, r1)     // Catch:{ all -> 0x0137 }
        L_0x0087:
            com.applovin.impl.sdk.t r4 = r13.f12000c     // Catch:{ all -> 0x0137 }
            r4.a((java.lang.String) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0137 }
            com.applovin.impl.sdk.k r4 = r13.f11999b     // Catch:{ all -> 0x00f3 }
            com.applovin.impl.sdk.o r4 = r4.B()     // Catch:{ all -> 0x00f3 }
            r4.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00f3 }
            com.applovin.impl.sdk.k r1 = r13.f11999b
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10305g1
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00a8
            r13.a((java.io.File) r14, (java.lang.String) r11)
        L_0x00a8:
            r13.g(r14)
            return r0
        L_0x00ac:
            r1 = move-exception
            boolean r3 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0137 }
            if (r3 == 0) goto L_0x00ce
            com.applovin.impl.sdk.t r3 = r13.f12000c     // Catch:{ all -> 0x0137 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0137 }
            r6.<init>()     // Catch:{ all -> 0x0137 }
            r6.append(r4)     // Catch:{ all -> 0x0137 }
            java.lang.String r4 = r14.getName()     // Catch:{ all -> 0x0137 }
            r6.append(r4)     // Catch:{ all -> 0x0137 }
            r6.append(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0137 }
            r3.a((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x0137 }
        L_0x00ce:
            com.applovin.impl.sdk.t r3 = r13.f12000c     // Catch:{ all -> 0x0137 }
            r3.a((java.lang.String) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0137 }
            com.applovin.impl.sdk.k r3 = r13.f11999b     // Catch:{ all -> 0x00f3 }
            com.applovin.impl.sdk.o r3 = r3.B()     // Catch:{ all -> 0x00f3 }
            r3.a((java.lang.String) r2, (java.lang.String) r5, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00f3 }
            com.applovin.impl.sdk.k r1 = r13.f11999b
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10305g1
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00ef
            r13.a((java.io.File) r14, (java.lang.String) r11)
        L_0x00ef:
            r13.g(r14)
            return r0
        L_0x00f3:
            r0 = move-exception
            goto L_0x0139
        L_0x00f5:
            r1 = move-exception
            boolean r3 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0137 }
            if (r3 == 0) goto L_0x0110
            com.applovin.impl.sdk.t r3 = r13.f12000c     // Catch:{ all -> 0x0137 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0137 }
            r4.<init>()     // Catch:{ all -> 0x0137 }
            r4.append(r6)     // Catch:{ all -> 0x0137 }
            r4.append(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0137 }
            r3.d(r2, r4)     // Catch:{ all -> 0x0137 }
        L_0x0110:
            com.applovin.impl.sdk.t r3 = r13.f12000c     // Catch:{ all -> 0x0137 }
            r3.a((java.lang.String) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0137 }
            com.applovin.impl.sdk.k r3 = r13.f11999b     // Catch:{ all -> 0x0137 }
            com.applovin.impl.sdk.o r3 = r3.B()     // Catch:{ all -> 0x0137 }
            r3.a((java.lang.String) r2, (java.lang.String) r7, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0137 }
            if (r9 == 0) goto L_0x0133
            com.applovin.impl.sdk.k r1 = r13.f11999b
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10305g1
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0133
            r13.a((java.io.File) r14, (java.lang.String) r11)
        L_0x0133:
            r13.g(r14)
            return r0
        L_0x0137:
            r0 = move-exception
            r10 = r9
        L_0x0139:
            if (r10 == 0) goto L_0x014e
            com.applovin.impl.sdk.k r1 = r13.f11999b
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10305g1
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x014e
            r13.a((java.io.File) r14, (java.lang.String) r11)
        L_0x014e:
            r13.g(r14)
            throw r0
        L_0x0152:
            r13.c((java.io.File) r14)     // Catch:{ FileNotFoundException -> 0x0205, IOException -> 0x01b9, all -> 0x0186 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0205, IOException -> 0x01b9, all -> 0x0186 }
            r1.<init>(r14)     // Catch:{ FileNotFoundException -> 0x0205, IOException -> 0x01b9, all -> 0x0186 }
            java.lang.String r0 = r13.a((java.io.InputStream) r1)     // Catch:{ FileNotFoundException -> 0x0183, IOException -> 0x0181, all -> 0x017f }
            if (r0 != 0) goto L_0x0161
            r9 = 1
        L_0x0161:
            com.applovin.impl.sdk.k r2 = r13.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r1, (com.applovin.impl.sdk.k) r2)
            if (r9 == 0) goto L_0x017b
            com.applovin.impl.sdk.k r1 = r13.f11999b
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10305g1
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x017b
            r13.a((java.io.File) r14, (java.lang.String) r11)
        L_0x017b:
            r13.g(r14)
            return r0
        L_0x017f:
            r4 = move-exception
            goto L_0x0189
        L_0x0181:
            r3 = move-exception
            goto L_0x01bc
        L_0x0183:
            r3 = move-exception
            goto L_0x0208
        L_0x0186:
            r1 = move-exception
            r4 = r1
            r1 = r0
        L_0x0189:
            boolean r5 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0234 }
            if (r5 == 0) goto L_0x0194
            com.applovin.impl.sdk.t r5 = r13.f12000c     // Catch:{ all -> 0x0234 }
            r5.a(r2, r8, r4)     // Catch:{ all -> 0x0234 }
        L_0x0194:
            com.applovin.impl.sdk.k r5 = r13.f11999b     // Catch:{ all -> 0x0202 }
            com.applovin.impl.sdk.o r5 = r5.B()     // Catch:{ all -> 0x0202 }
            r5.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0202 }
            com.applovin.impl.sdk.k r2 = r13.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r1, (com.applovin.impl.sdk.k) r2)
            com.applovin.impl.sdk.k r1 = r13.f11999b
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10305g1
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01b5
            r13.a((java.io.File) r14, (java.lang.String) r11)
        L_0x01b5:
            r13.g(r14)
            return r0
        L_0x01b9:
            r1 = move-exception
            r3 = r1
            r1 = r0
        L_0x01bc:
            boolean r6 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0234 }
            if (r6 == 0) goto L_0x01dd
            com.applovin.impl.sdk.t r6 = r13.f12000c     // Catch:{ all -> 0x0234 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0234 }
            r7.<init>()     // Catch:{ all -> 0x0234 }
            r7.append(r4)     // Catch:{ all -> 0x0234 }
            java.lang.String r4 = r14.getName()     // Catch:{ all -> 0x0234 }
            r7.append(r4)     // Catch:{ all -> 0x0234 }
            r7.append(r3)     // Catch:{ all -> 0x0234 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x0234 }
            r6.a((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x0234 }
        L_0x01dd:
            com.applovin.impl.sdk.k r4 = r13.f11999b     // Catch:{ all -> 0x0202 }
            com.applovin.impl.sdk.o r4 = r4.B()     // Catch:{ all -> 0x0202 }
            r4.a((java.lang.String) r2, (java.lang.String) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0202 }
            com.applovin.impl.sdk.k r2 = r13.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r1, (com.applovin.impl.sdk.k) r2)
            com.applovin.impl.sdk.k r1 = r13.f11999b
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10305g1
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01fe
            r13.a((java.io.File) r14, (java.lang.String) r11)
        L_0x01fe:
            r13.g(r14)
            return r0
        L_0x0202:
            r0 = move-exception
            r9 = 1
            goto L_0x0235
        L_0x0205:
            r1 = move-exception
            r3 = r1
            r1 = r0
        L_0x0208:
            boolean r4 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0234 }
            if (r4 == 0) goto L_0x0222
            com.applovin.impl.sdk.t r4 = r13.f12000c     // Catch:{ all -> 0x0234 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0234 }
            r5.<init>()     // Catch:{ all -> 0x0234 }
            r5.append(r6)     // Catch:{ all -> 0x0234 }
            r5.append(r3)     // Catch:{ all -> 0x0234 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0234 }
            r4.d(r2, r5)     // Catch:{ all -> 0x0234 }
        L_0x0222:
            com.applovin.impl.sdk.k r4 = r13.f11999b     // Catch:{ all -> 0x0234 }
            com.applovin.impl.sdk.o r4 = r4.B()     // Catch:{ all -> 0x0234 }
            r4.a((java.lang.String) r2, (java.lang.String) r7, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0234 }
            com.applovin.impl.sdk.k r2 = r13.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r1, (com.applovin.impl.sdk.k) r2)
            r13.g(r14)
            return r0
        L_0x0234:
            r0 = move-exception
        L_0x0235:
            com.applovin.impl.sdk.k r2 = r13.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r1, (com.applovin.impl.sdk.k) r2)
            if (r9 == 0) goto L_0x024f
            com.applovin.impl.sdk.k r1 = r13.f11999b
            com.applovin.impl.oj r2 = com.applovin.impl.oj.f10305g1
            java.lang.Object r1 = r1.a((com.applovin.impl.oj) r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x024f
            r13.a((java.io.File) r14, (java.lang.String) r11)
        L_0x024f:
            r13.g(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p.e(java.io.File):java.lang.String");
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f12001d) {
            boolean add = this.f12002e.add(absolutePath);
            while (!add) {
                try {
                    this.f12001d.wait();
                    add = this.f12002e.add(absolutePath);
                } catch (InterruptedException e10) {
                    if (t.a()) {
                        t tVar = this.f12000c;
                        tVar.a("FileManager", "Lock '" + absolutePath + "' interrupted", e10);
                    }
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    private boolean d(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f12001d) {
            if (this.f12002e.contains(absolutePath)) {
                return false;
            }
            c(file);
            return true;
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z10, boolean z11, s2 s2Var) {
        if (!StringUtils.isValidString(str)) {
            if (t.a()) {
                this.f12000c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f11999b.B().a(o.b.FILE_ERROR, "cacheResource");
            return null;
        }
        String str3 = str2;
        String a10 = zp.a(Uri.parse(str), str2, this.f11999b);
        Context context2 = context;
        File a11 = a(a10, context);
        if (!a(a11, str, list, z10, s2Var)) {
            return null;
        }
        if (t.a()) {
            t tVar = this.f12000c;
            tVar.a("FileManager", "Caching succeeded for file " + a10);
        }
        return z11 ? Uri.fromFile(a11).toString() : a10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(b bVar, Context context) {
        f(a(bVar.s0().getLastPathSegment(), context));
    }

    private boolean b(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f12001d) {
            contains = this.f12002e.contains(absolutePath);
        }
        return contains;
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    private List c(Context context) {
        File[] listFiles;
        File d10 = d(context);
        if (!d10.isDirectory() || (listFiles = d10.listFiles()) == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(listFiles);
    }

    public boolean a(File file, String str, List list, s2 s2Var) {
        return a(file, str, list, true, s2Var);
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    private boolean a(File file, String str, List list, boolean z10, s2 s2Var) {
        InputStream a10;
        if (a(file)) {
            if (t.a()) {
                t tVar = this.f12000c;
                tVar.a("FileManager", "File exists for " + str);
            }
            if (s2Var == null) {
                return true;
            }
            s2Var.a(file.length());
            return true;
        } else if (((Boolean) this.f11999b.a(oj.M)).booleanValue()) {
            try {
                a10 = a(str, list, z10, s2Var);
                boolean a11 = a(a10, file);
                if (a10 != null) {
                    a10.close();
                }
                return a11;
            } catch (Throwable th) {
                this.f12000c.a("FileManager", th);
                this.f11999b.B().a("FileManager", "loadAndCacheResource", th);
                return false;
            }
        } else {
            InputStream inputStream = null;
            try {
                inputStream = a(str, list, z10, s2Var);
                return a(inputStream, file);
            } finally {
                zp.a(inputStream, this.f11999b);
            }
        }
        throw th;
    }

    public boolean c(String str, Context context) {
        boolean z10 = false;
        File a10 = a(str, false, context);
        if (!d(a10)) {
            return false;
        }
        if (a10.exists() && !a10.isDirectory()) {
            z10 = true;
        }
        g(a10);
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0120 A[Catch:{ all -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0158 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream a(java.lang.String r7, java.util.List r8, boolean r9, com.applovin.impl.s2 r10) {
        /*
            r6 = this;
            java.lang.String r0 = "loadResource"
            r1 = 0
            java.lang.String r2 = "FileManager"
            if (r9 == 0) goto L_0x002a
            boolean r8 = com.applovin.impl.zp.a((java.lang.String) r7, (java.util.List) r8)
            if (r8 != 0) goto L_0x002a
            boolean r8 = com.applovin.impl.sdk.t.a()
            if (r8 == 0) goto L_0x0029
            com.applovin.impl.sdk.t r8 = r6.f12000c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Domain is not whitelisted, skipping precache for url: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.a((java.lang.String) r2, (java.lang.String) r7)
        L_0x0029:
            return r1
        L_0x002a:
            com.applovin.impl.sdk.k r8 = r6.f11999b
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10284d3
            java.lang.Object r8 = r8.a((com.applovin.impl.oj) r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0055
            java.lang.String r8 = "https://"
            boolean r9 = r7.contains(r8)
            if (r9 != 0) goto L_0x0055
            boolean r9 = com.applovin.impl.sdk.t.a()
            if (r9 == 0) goto L_0x004f
            com.applovin.impl.sdk.t r9 = r6.f12000c
            java.lang.String r3 = "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting..."
            r9.k(r2, r3)
        L_0x004f:
            java.lang.String r9 = "http://"
            java.lang.String r7 = r7.replace(r9, r8)
        L_0x0055:
            boolean r8 = com.applovin.impl.sdk.t.a()
            if (r8 == 0) goto L_0x0076
            com.applovin.impl.sdk.t r8 = r6.f12000c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "Loading "
            r9.append(r3)
            r9.append(r7)
            java.lang.String r3 = "..."
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.a((java.lang.String) r2, (java.lang.String) r9)
        L_0x0076:
            java.net.URL r8 = new java.net.URL     // Catch:{ all -> 0x0118 }
            r8.<init>(r7)     // Catch:{ all -> 0x0118 }
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ all -> 0x0118 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ all -> 0x0118 }
            com.applovin.impl.sdk.k r9 = r6.f11999b     // Catch:{ all -> 0x0116 }
            com.applovin.impl.oj r3 = com.applovin.impl.oj.f10268b3     // Catch:{ all -> 0x0116 }
            java.lang.Object r9 = r9.a((com.applovin.impl.oj) r3)     // Catch:{ all -> 0x0116 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0116 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0116 }
            r8.setConnectTimeout(r9)     // Catch:{ all -> 0x0116 }
            com.applovin.impl.sdk.k r9 = r6.f11999b     // Catch:{ all -> 0x0116 }
            com.applovin.impl.oj r3 = com.applovin.impl.oj.f10276c3     // Catch:{ all -> 0x0116 }
            java.lang.Object r9 = r9.a((com.applovin.impl.oj) r3)     // Catch:{ all -> 0x0116 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0116 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0116 }
            r8.setReadTimeout(r9)     // Catch:{ all -> 0x0116 }
            r9 = 1
            r8.setDefaultUseCaches(r9)     // Catch:{ all -> 0x0116 }
            r8.setUseCaches(r9)     // Catch:{ all -> 0x0116 }
            r3 = 0
            r8.setAllowUserInteraction(r3)     // Catch:{ all -> 0x0116 }
            r8.setInstanceFollowRedirects(r9)     // Catch:{ all -> 0x0116 }
            int r9 = r8.getResponseCode()     // Catch:{ all -> 0x0116 }
            r10.a((int) r9)     // Catch:{ all -> 0x0116 }
            com.applovin.impl.sdk.k r3 = r6.f11999b     // Catch:{ all -> 0x0116 }
            com.applovin.impl.sdk.o r3 = r3.B()     // Catch:{ all -> 0x0116 }
            r3.a((java.lang.String) r0, (java.lang.String) r7, (int) r9)     // Catch:{ all -> 0x0116 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r9 < r3) goto L_0x0100
            r3 = 300(0x12c, float:4.2E-43)
            if (r9 < r3) goto L_0x00ca
            goto L_0x0100
        L_0x00ca:
            boolean r9 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0116 }
            if (r9 == 0) goto L_0x00e6
            com.applovin.impl.sdk.t r9 = r6.f12000c     // Catch:{ all -> 0x0116 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0116 }
            r3.<init>()     // Catch:{ all -> 0x0116 }
            java.lang.String r4 = "Opened stream to resource "
            r3.append(r4)     // Catch:{ all -> 0x0116 }
            r3.append(r7)     // Catch:{ all -> 0x0116 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0116 }
            r9.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0116 }
        L_0x00e6:
            java.io.InputStream r7 = r8.getInputStream()     // Catch:{ all -> 0x0116 }
            com.applovin.impl.sdk.k r9 = r6.f11999b
            com.applovin.impl.oj r10 = com.applovin.impl.oj.A3
            java.lang.Object r9 = r9.a((com.applovin.impl.oj) r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00ff
            com.applovin.impl.sdk.k r9 = r6.f11999b
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r8, (com.applovin.impl.sdk.k) r9)
        L_0x00ff:
            return r7
        L_0x0100:
            com.applovin.impl.sdk.k r7 = r6.f11999b
            com.applovin.impl.oj r9 = com.applovin.impl.oj.A3
            java.lang.Object r7 = r7.a((com.applovin.impl.oj) r9)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0115
            com.applovin.impl.sdk.k r7 = r6.f11999b
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r8, (com.applovin.impl.sdk.k) r7)
        L_0x0115:
            return r1
        L_0x0116:
            r9 = move-exception
            goto L_0x011a
        L_0x0118:
            r9 = move-exception
            r8 = r1
        L_0x011a:
            boolean r3 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x0136
            com.applovin.impl.sdk.t r3 = r6.f12000c     // Catch:{ all -> 0x015e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            r4.<init>()     // Catch:{ all -> 0x015e }
            java.lang.String r5 = "Error loading "
            r4.append(r5)     // Catch:{ all -> 0x015e }
            r4.append(r7)     // Catch:{ all -> 0x015e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x015e }
            r3.a(r2, r4, r9)     // Catch:{ all -> 0x015e }
        L_0x0136:
            java.lang.String r3 = "url"
            java.util.HashMap r7 = com.applovin.impl.sdk.utils.CollectionUtils.hashMap(r3, r7)     // Catch:{ all -> 0x015e }
            com.applovin.impl.sdk.k r3 = r6.f11999b     // Catch:{ all -> 0x015e }
            com.applovin.impl.sdk.o r3 = r3.B()     // Catch:{ all -> 0x015e }
            r3.a((java.lang.String) r2, (java.lang.String) r0, (java.lang.Throwable) r9, (java.util.Map) r7)     // Catch:{ all -> 0x015e }
            r10.a((java.lang.Throwable) r9)     // Catch:{ all -> 0x015e }
            com.applovin.impl.sdk.k r7 = r6.f11999b
            com.applovin.impl.oj r9 = com.applovin.impl.oj.A3
            java.lang.Object r7 = r7.a((com.applovin.impl.oj) r9)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x015d
            com.applovin.impl.sdk.k r7 = r6.f11999b
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r8, (com.applovin.impl.sdk.k) r7)
        L_0x015d:
            return r1
        L_0x015e:
            r7 = move-exception
            com.applovin.impl.sdk.k r9 = r6.f11999b
            com.applovin.impl.oj r10 = com.applovin.impl.oj.A3
            java.lang.Object r9 = r9.a((com.applovin.impl.oj) r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0174
            com.applovin.impl.sdk.k r9 = r6.f11999b
            com.applovin.impl.zp.a((java.net.HttpURLConnection) r8, (com.applovin.impl.sdk.k) r9)
        L_0x0174:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p.a(java.lang.String, java.util.List, boolean, com.applovin.impl.s2):java.io.InputStream");
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (t.a()) {
                this.f12000c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (t.a()) {
            t tVar = this.f12000c;
            tVar.a("FileManager", "Looking up cached resource: " + str);
        }
        String replace = str.contains("icon") ? str.replace(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, "_").replace(".", "_") : str;
        File d10 = d(context);
        File file = new File(d10, replace);
        if (zp.a(oj.f10321i1, this.f11999b)) {
            boolean z11 = file.length() == 0;
            boolean equals = str.equals(".nomedia");
            if (file.exists() && z11 && !equals) {
                this.f11999b.B().a(o.b.FILE_ERROR, "removeEmptyCachedResource", (Map) CollectionUtils.hashMap("path", file.getAbsolutePath()));
                f(file);
            }
        }
        if (z10) {
            try {
                d10.mkdirs();
            } catch (Throwable th) {
                if (t.a()) {
                    t tVar2 = this.f12000c;
                    tVar2.a("FileManager", "Unable to make cache directory at " + d10, th);
                }
                this.f11999b.B().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (!a(file)) {
                if (t.a()) {
                    t tVar = this.f12000c;
                    tVar.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
                }
                if (!file.createNewFile()) {
                    if (t.a()) {
                        this.f12000c.b("FileManager", "Failed to create .nomedia file");
                    }
                    this.f11999b.B().a(o.b.FILE_ERROR, "createNoMediaFile");
                }
            }
        } catch (IOException e10) {
            if (t.a()) {
                this.f12000c.a("FileManager", "Failed to create .nomedia file", e10);
            }
        }
    }

    public String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (((Boolean) this.f11999b.a(oj.M)).booleanValue()) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream2;
                    }
                }
            } catch (Throwable th) {
                this.f12000c.a("FileManager", th);
                this.f11999b.B().a("FileManager", "readInputStreamAsString", th);
                return null;
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[8192];
            while (true) {
                int read2 = inputStream.read(bArr2, 0, 8192);
                if (read2 < 0) {
                    return byteArrayOutputStream3.toString("UTF-8");
                }
                try {
                    byteArrayOutputStream3.write(bArr2, 0, read2);
                } catch (Throwable th2) {
                    zp.a((Closeable) byteArrayOutputStream3, this.f11999b);
                    this.f11999b.B().a("FileManager", "readInputStreamAsString", th2);
                    return null;
                }
            }
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x01e8 A[Catch:{ all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb A[Catch:{ all -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.io.InputStream r17, java.io.File r18, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            boolean r3 = com.applovin.impl.sdk.t.a()
            java.lang.String r4 = "FileManager"
            if (r3 == 0) goto L_0x0028
            com.applovin.impl.sdk.t r3 = r1.f12000c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Writing resource to filesystem: "
            r5.append(r6)
            java.lang.String r6 = r18.getName()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.a((java.lang.String) r4, (java.lang.String) r5)
        L_0x0028:
            com.applovin.impl.sdk.k r3 = r1.f11999b
            com.applovin.impl.oj r5 = com.applovin.impl.oj.M
            java.lang.Object r3 = r3.a((com.applovin.impl.oj) r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r5 = "writeResourceStream"
            java.lang.String r6 = "Failed to write next buffer to file"
            java.lang.String r7 = "writeResource"
            java.lang.String r8 = "Unknown failure to write file."
            java.lang.String r10 = " - aborting write."
            java.lang.String r11 = "Overwrite not allowed for local resource: "
            java.lang.String r12 = "cacheResourceOverwriteAttempted"
            java.lang.String r13 = "path"
            java.lang.String r14 = "removeFileAfterCacheFail"
            r15 = 1
            if (r3 == 0) goto L_0x0137
            r1.c((java.io.File) r2)
            com.applovin.impl.oj r3 = com.applovin.impl.oj.f10353m1
            com.applovin.impl.sdk.k r9 = r1.f11999b
            boolean r3 = com.applovin.impl.zp.a((com.applovin.impl.oj) r3, (com.applovin.impl.sdk.k) r9)
            if (r3 == 0) goto L_0x0095
            if (r19 != 0) goto L_0x0095
            boolean r3 = r18.exists()
            if (r3 == 0) goto L_0x0095
            boolean r0 = com.applovin.impl.sdk.t.a()
            if (r0 == 0) goto L_0x0081
            com.applovin.impl.sdk.t r0 = r1.f12000c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r5 = r18.getName()
            r3.append(r5)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r0.a((java.lang.String) r4, (java.lang.String) r3)
        L_0x0081:
            java.lang.String r0 = r18.getAbsolutePath()
            java.util.HashMap r0 = com.applovin.impl.sdk.utils.CollectionUtils.hashMap(r13, r0)
            com.applovin.impl.sdk.k r2 = r1.f11999b
            com.applovin.impl.sdk.o r2 = r2.B()
            com.applovin.impl.sdk.o$b r3 = com.applovin.impl.sdk.o.b.FILE_ERROR
            r2.a((com.applovin.impl.sdk.o.b) r3, (java.lang.String) r12, (java.util.Map) r0)
            return r15
        L_0x0095:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f3 }
            r3.<init>(r2)     // Catch:{ all -> 0x00f3 }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r9]     // Catch:{ all -> 0x00e4 }
        L_0x009e:
            r11 = 0
            int r12 = r0.read(r10, r11, r9)     // Catch:{ all -> 0x00e4 }
            if (r12 < 0) goto L_0x00dd
            r3.write(r10, r11, r12)     // Catch:{ all -> 0x00ab }
            r9 = 8192(0x2000, float:1.14794E-41)
            goto L_0x009e
        L_0x00ab:
            r0 = move-exception
            r9 = r0
            boolean r0 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00b8
            com.applovin.impl.sdk.t r0 = r1.f12000c     // Catch:{ all -> 0x00e4 }
            r0.a(r4, r6, r9)     // Catch:{ all -> 0x00e4 }
        L_0x00b8:
            com.applovin.impl.sdk.k r0 = r1.f11999b     // Catch:{ all -> 0x00d9 }
            com.applovin.impl.sdk.o r0 = r0.B()     // Catch:{ all -> 0x00d9 }
            r0.a((java.lang.String) r4, (java.lang.String) r5, (java.lang.Throwable) r9)     // Catch:{ all -> 0x00d9 }
            r3.close()     // Catch:{ all -> 0x00d6 }
            com.applovin.impl.oj r0 = com.applovin.impl.oj.f10297f1
            com.applovin.impl.sdk.k r3 = r1.f11999b
            boolean r0 = com.applovin.impl.zp.a((com.applovin.impl.oj) r0, (com.applovin.impl.sdk.k) r3)
            if (r0 == 0) goto L_0x00d1
            r1.a((java.io.File) r2, (java.lang.String) r14)
        L_0x00d1:
            r1.g(r2)
            r2 = 0
            return r2
        L_0x00d6:
            r0 = move-exception
            r5 = 1
            goto L_0x00f5
        L_0x00d9:
            r0 = move-exception
            r6 = r0
            r5 = 1
            goto L_0x00e7
        L_0x00dd:
            r3.close()     // Catch:{ all -> 0x00f3 }
            r1.g(r2)
            return r15
        L_0x00e4:
            r0 = move-exception
            r6 = r0
            r5 = 0
        L_0x00e7:
            r3.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00f0
        L_0x00eb:
            r0 = move-exception
            r3 = r0
            r6.addSuppressed(r3)     // Catch:{ all -> 0x00f1 }
        L_0x00f0:
            throw r6     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            goto L_0x00f5
        L_0x00f3:
            r0 = move-exception
            r5 = 0
        L_0x00f5:
            boolean r3 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0122 }
            if (r3 == 0) goto L_0x0100
            com.applovin.impl.sdk.t r3 = r1.f12000c     // Catch:{ all -> 0x0122 }
            r3.a(r4, r8, r0)     // Catch:{ all -> 0x0122 }
        L_0x0100:
            com.applovin.impl.sdk.t r3 = r1.f12000c     // Catch:{ all -> 0x0122 }
            r3.a((java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0122 }
            com.applovin.impl.sdk.k r3 = r1.f11999b     // Catch:{ all -> 0x0120 }
            com.applovin.impl.sdk.o r3 = r3.B()     // Catch:{ all -> 0x0120 }
            r3.a((java.lang.String) r4, (java.lang.String) r7, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0120 }
            com.applovin.impl.oj r0 = com.applovin.impl.oj.f10297f1
            com.applovin.impl.sdk.k r3 = r1.f11999b
            boolean r0 = com.applovin.impl.zp.a((com.applovin.impl.oj) r0, (com.applovin.impl.sdk.k) r3)
            if (r0 == 0) goto L_0x011b
            r1.a((java.io.File) r2, (java.lang.String) r14)
        L_0x011b:
            r1.g(r2)
            r2 = 0
            return r2
        L_0x0120:
            r0 = move-exception
            goto L_0x0124
        L_0x0122:
            r0 = move-exception
            r15 = r5
        L_0x0124:
            if (r15 == 0) goto L_0x0133
            com.applovin.impl.oj r3 = com.applovin.impl.oj.f10297f1
            com.applovin.impl.sdk.k r4 = r1.f11999b
            boolean r3 = com.applovin.impl.zp.a((com.applovin.impl.oj) r3, (com.applovin.impl.sdk.k) r4)
            if (r3 == 0) goto L_0x0133
            r1.a((java.io.File) r2, (java.lang.String) r14)
        L_0x0133:
            r1.g(r2)
            throw r0
        L_0x0137:
            r3 = 0
            r1.c((java.io.File) r2)     // Catch:{ all -> 0x01df }
            com.applovin.impl.oj r9 = com.applovin.impl.oj.f10353m1     // Catch:{ all -> 0x01df }
            com.applovin.impl.sdk.k r15 = r1.f11999b     // Catch:{ all -> 0x01df }
            boolean r9 = com.applovin.impl.zp.a((com.applovin.impl.oj) r9, (com.applovin.impl.sdk.k) r15)     // Catch:{ all -> 0x01df }
            if (r9 == 0) goto L_0x018b
            if (r19 != 0) goto L_0x018b
            boolean r9 = r18.exists()     // Catch:{ all -> 0x01df }
            if (r9 == 0) goto L_0x018b
            boolean r0 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x016e
            com.applovin.impl.sdk.t r0 = r1.f12000c     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r5.<init>()     // Catch:{ all -> 0x01df }
            r5.append(r11)     // Catch:{ all -> 0x01df }
            java.lang.String r6 = r18.getName()     // Catch:{ all -> 0x01df }
            r5.append(r6)     // Catch:{ all -> 0x01df }
            r5.append(r10)     // Catch:{ all -> 0x01df }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01df }
            r0.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01df }
        L_0x016e:
            java.lang.String r0 = r18.getAbsolutePath()     // Catch:{ all -> 0x01df }
            java.util.HashMap r0 = com.applovin.impl.sdk.utils.CollectionUtils.hashMap(r13, r0)     // Catch:{ all -> 0x01df }
            com.applovin.impl.sdk.k r5 = r1.f11999b     // Catch:{ all -> 0x01df }
            com.applovin.impl.sdk.o r5 = r5.B()     // Catch:{ all -> 0x01df }
            com.applovin.impl.sdk.o$b r6 = com.applovin.impl.sdk.o.b.FILE_ERROR     // Catch:{ all -> 0x01df }
            r5.a((com.applovin.impl.sdk.o.b) r6, (java.lang.String) r12, (java.util.Map) r0)     // Catch:{ all -> 0x01df }
            com.applovin.impl.sdk.k r0 = r1.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r3, (com.applovin.impl.sdk.k) r0)
            r1.g(r2)
            r2 = 1
            return r2
        L_0x018b:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x01df }
            r9.<init>(r2)     // Catch:{ all -> 0x01df }
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r3]     // Catch:{ all -> 0x01da }
        L_0x0194:
            r11 = 0
            int r12 = r0.read(r10, r11, r3)     // Catch:{ all -> 0x01da }
            if (r12 < 0) goto L_0x01d0
            r9.write(r10, r11, r12)     // Catch:{ all -> 0x019f }
            goto L_0x0194
        L_0x019f:
            r0 = move-exception
            r3 = r0
            boolean r0 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x01ac
            com.applovin.impl.sdk.t r0 = r1.f12000c     // Catch:{ all -> 0x01da }
            r0.a(r4, r6, r3)     // Catch:{ all -> 0x01da }
        L_0x01ac:
            com.applovin.impl.sdk.k r0 = r1.f11999b     // Catch:{ all -> 0x01cc }
            com.applovin.impl.sdk.o r0 = r0.B()     // Catch:{ all -> 0x01cc }
            r0.a((java.lang.String) r4, (java.lang.String) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x01cc }
            com.applovin.impl.sdk.k r0 = r1.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r9, (com.applovin.impl.sdk.k) r0)
            com.applovin.impl.oj r0 = com.applovin.impl.oj.f10297f1
            com.applovin.impl.sdk.k r3 = r1.f11999b
            boolean r0 = com.applovin.impl.zp.a((com.applovin.impl.oj) r0, (com.applovin.impl.sdk.k) r3)
            if (r0 == 0) goto L_0x01c7
            r1.a((java.io.File) r2, (java.lang.String) r14)
        L_0x01c7:
            r1.g(r2)
            r2 = 0
            return r2
        L_0x01cc:
            r0 = move-exception
            r5 = 1
            r11 = 1
            goto L_0x01dd
        L_0x01d0:
            com.applovin.impl.sdk.k r0 = r1.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r9, (com.applovin.impl.sdk.k) r0)
            r1.g(r2)
            r5 = 1
            return r5
        L_0x01da:
            r0 = move-exception
            r5 = 1
            r11 = 0
        L_0x01dd:
            r3 = r9
            goto L_0x01e2
        L_0x01df:
            r0 = move-exception
            r5 = 1
            r11 = 0
        L_0x01e2:
            boolean r6 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0210 }
            if (r6 == 0) goto L_0x01ed
            com.applovin.impl.sdk.t r6 = r1.f12000c     // Catch:{ all -> 0x0210 }
            r6.a(r4, r8, r0)     // Catch:{ all -> 0x0210 }
        L_0x01ed:
            com.applovin.impl.sdk.k r6 = r1.f11999b     // Catch:{ all -> 0x020d }
            com.applovin.impl.sdk.o r6 = r6.B()     // Catch:{ all -> 0x020d }
            r6.a((java.lang.String) r4, (java.lang.String) r7, (java.lang.Throwable) r0)     // Catch:{ all -> 0x020d }
            com.applovin.impl.sdk.k r0 = r1.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r3, (com.applovin.impl.sdk.k) r0)
            com.applovin.impl.oj r0 = com.applovin.impl.oj.f10297f1
            com.applovin.impl.sdk.k r3 = r1.f11999b
            boolean r0 = com.applovin.impl.zp.a((com.applovin.impl.oj) r0, (com.applovin.impl.sdk.k) r3)
            if (r0 == 0) goto L_0x0208
            r1.a((java.io.File) r2, (java.lang.String) r14)
        L_0x0208:
            r1.g(r2)
            r2 = 0
            return r2
        L_0x020d:
            r0 = move-exception
            r15 = 1
            goto L_0x0212
        L_0x0210:
            r0 = move-exception
            r15 = r11
        L_0x0212:
            com.applovin.impl.sdk.k r4 = r1.f11999b
            com.applovin.impl.zp.a((java.io.Closeable) r3, (com.applovin.impl.sdk.k) r4)
            if (r15 == 0) goto L_0x0226
            com.applovin.impl.oj r3 = com.applovin.impl.oj.f10297f1
            com.applovin.impl.sdk.k r4 = r1.f11999b
            boolean r3 = com.applovin.impl.zp.a((com.applovin.impl.oj) r3, (com.applovin.impl.sdk.k) r4)
            if (r3 == 0) goto L_0x0226
            r1.a((java.io.File) r2, (java.lang.String) r14)
        L_0x0226:
            r1.g(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p.a(java.io.InputStream, java.io.File, boolean):boolean");
    }

    public boolean a(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (t.a()) {
            t tVar = this.f12000c;
            tVar.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file, false)) {
            if (t.a()) {
                t tVar2 = this.f12000c;
                tVar2.b("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        } else if (!t.a()) {
            return true;
        } else {
            t tVar3 = this.f12000c;
            tVar3.a("FileManager", "Caching completed for " + file);
            return true;
        }
    }

    private long a(Context context) {
        long a10 = a();
        boolean z10 = a10 != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List c10 = this.f11999b.c(oj.f10259a1);
        long j10 = 0;
        for (File file : c(context)) {
            if (z10 && !c10.contains(file.getName()) && !b(file) && seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) > a10) {
                if (t.a()) {
                    t tVar = this.f12000c;
                    tVar.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                if (f(file)) {
                    this.f11999b.F().c(aa.f6348j);
                }
            }
            j10 += file.length();
        }
        return j10;
    }

    private void a(long j10, Context context) {
        long intValue = (long) ((Integer) this.f11999b.a(oj.W0)).intValue();
        if (intValue == -1) {
            if (t.a()) {
                this.f12000c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else if (a(j10) > intValue) {
            if (t.a()) {
                this.f12000c.a("FileManager", "Cache has exceeded maximum size; dropping...");
            }
            for (File f10 : c(context)) {
                f(f10);
            }
            this.f11999b.F().c(aa.f6349k);
        } else if (t.a()) {
            this.f12000c.a("FileManager", "Cache is present but under size limit; not dropping...");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, Context context) {
        ArrayList<Uri> arrayList = new ArrayList<>(bVar.i());
        arrayList.add(bVar.s0());
        for (Uri lastPathSegment : arrayList) {
            f(a(lastPathSegment.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (t.a()) {
            t tVar = this.f12000c;
            tVar.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (!file.delete()) {
                this.f11999b.B().a(o.b.FILE_ERROR, str, (Map) CollectionUtils.hashMap("path", file.getAbsolutePath()));
            }
        } catch (Throwable th) {
            if (t.a()) {
                t tVar2 = this.f12000c;
                tVar2.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f11999b.B().a("FileManager", str, th);
        }
    }

    private long a() {
        long longValue = ((Long) this.f11999b.a(oj.V0)).longValue();
        if (longValue >= 0) {
            return longValue;
        }
        return -1;
    }

    private long a(long j10) {
        return j10 / 1048576;
    }

    public boolean a(File file) {
        boolean z10 = true;
        if (zp.a(oj.f10345l1, this.f11999b)) {
            if (file == null) {
                return false;
            }
            zp.a();
            c(file);
            if (!file.exists() || file.isDirectory()) {
                z10 = false;
            }
            g(file);
            return z10;
        } else if (file == null || !file.exists() || file.isDirectory()) {
            return false;
        } else {
            return true;
        }
    }
}
