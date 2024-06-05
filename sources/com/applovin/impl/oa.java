package com.applovin.impl;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class oa {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f10079a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f10080b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append("-");
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "HttpUtil"
            java.lang.String r2 = "]"
            if (r0 != 0) goto L_0x0026
            long r3 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x000f }
            goto L_0x0028
        L_0x000f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected Content-Length ["
            r0.append(r3)
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.kc.b(r1, r0)
        L_0x0026:
            r3 = -1
        L_0x0028:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00a3
            java.util.regex.Pattern r0 = f10079a
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r5 = r0.matches()
            if (r5 == 0) goto L_0x00a3
            r5 = 2
            java.lang.String r5 = r0.group(r5)     // Catch:{ NumberFormatException -> 0x008c }
            java.lang.Object r5 = com.applovin.impl.a1.a((java.lang.Object) r5)     // Catch:{ NumberFormatException -> 0x008c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x008c }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x008c }
            r7 = 1
            java.lang.String r0 = r0.group(r7)     // Catch:{ NumberFormatException -> 0x008c }
            java.lang.Object r0 = com.applovin.impl.a1.a((java.lang.Object) r0)     // Catch:{ NumberFormatException -> 0x008c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x008c }
            long r7 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x008c }
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            r3 = r5
            goto L_0x00a3
        L_0x0064:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00a3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x008c }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x008c }
            java.lang.String r7 = "Inconsistent headers ["
            r0.append(r7)     // Catch:{ NumberFormatException -> 0x008c }
            r0.append(r9)     // Catch:{ NumberFormatException -> 0x008c }
            java.lang.String r9 = "] ["
            r0.append(r9)     // Catch:{ NumberFormatException -> 0x008c }
            r0.append(r10)     // Catch:{ NumberFormatException -> 0x008c }
            r0.append(r2)     // Catch:{ NumberFormatException -> 0x008c }
            java.lang.String r9 = r0.toString()     // Catch:{ NumberFormatException -> 0x008c }
            com.applovin.impl.kc.d(r1, r9)     // Catch:{ NumberFormatException -> 0x008c }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ NumberFormatException -> 0x008c }
            goto L_0x00a3
        L_0x008c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Unexpected Content-Range ["
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.applovin.impl.kc.b(r1, r9)
        L_0x00a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.oa.a(java.lang.String, java.lang.String):long");
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Matcher matcher = f10080b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) a1.a((Object) matcher.group(1)));
        }
        return -1;
    }
}
