package com.startapp;

/* compiled from: Sta */
public class m5 {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a4, code lost:
        if (r0.containsKey("forceOrientation") != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        if (r0.containsKey("allowOffscreen") != false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> a(java.lang.String r14) {
        /*
            r0 = 8
            java.lang.String r14 = r14.substring(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 63
            int r1 = r14.indexOf(r1)
            r2 = 1
            r3 = 0
            r4 = -1
            if (r1 == r4) goto L_0x0041
            java.lang.String r4 = r14.substring(r3, r1)
            int r1 = r1 + r2
            java.lang.String r14 = r14.substring(r1)
            java.lang.String r1 = "&"
            java.lang.String[] r14 = r14.split(r1)
            int r1 = r14.length
            r5 = 0
        L_0x0027:
            if (r5 >= r1) goto L_0x0040
            r6 = r14[r5]
            r7 = 61
            int r7 = r6.indexOf(r7)
            java.lang.String r8 = r6.substring(r3, r7)
            int r7 = r7 + r2
            java.lang.String r6 = r6.substring(r7)
            r0.put(r8, r6)
            int r5 = r5 + 1
            goto L_0x0027
        L_0x0040:
            r14 = r4
        L_0x0041:
            java.lang.String r4 = "close"
            java.lang.String r5 = "createCalendarEvent"
            java.lang.String r6 = "expand"
            java.lang.String r7 = "open"
            java.lang.String r8 = "playVideo"
            java.lang.String r9 = "resize"
            java.lang.String r10 = "setOrientationProperties"
            java.lang.String r11 = "setResizeProperties"
            java.lang.String r12 = "storePicture"
            java.lang.String r13 = "useCustomClose"
            java.lang.String[] r1 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r1 = r1.contains(r14)
            r4 = 0
            if (r1 != 0) goto L_0x0065
            return r4
        L_0x0065:
            java.lang.String r1 = "createCalendarEvent"
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x0075
            java.lang.String r1 = "eventJSON"
            boolean r2 = r0.containsKey(r1)
            goto L_0x00f5
        L_0x0075:
            java.lang.String r1 = "open"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x00ef
            java.lang.String r1 = "playVideo"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x00ef
            java.lang.String r1 = "storePicture"
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x008e
            goto L_0x00ef
        L_0x008e:
            java.lang.String r1 = "setOrientationProperties"
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x00a7
            java.lang.String r1 = "allowOrientationChange"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = "forceOrientation"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x00e0
            goto L_0x00f5
        L_0x00a7:
            java.lang.String r1 = "setResizeProperties"
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x00e2
            java.lang.String r1 = "width"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = "height"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = "offsetX"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = "offsetY"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = "customClosePosition"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = "allowOffscreen"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x00e0
            goto L_0x00f5
        L_0x00e0:
            r2 = 0
            goto L_0x00f5
        L_0x00e2:
            java.lang.String r1 = "useCustomClose"
            boolean r3 = r14.equals(r1)
            if (r3 == 0) goto L_0x00f5
            boolean r2 = r0.containsKey(r1)
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r1 = "url"
            boolean r2 = r0.containsKey(r1)
        L_0x00f5:
            if (r2 != 0) goto L_0x00f8
            return r4
        L_0x00f8:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "command"
            r1.put(r2, r14)
            r1.putAll(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.m5.a(java.lang.String):java.util.Map");
    }
}
