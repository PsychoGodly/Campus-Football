package com.startapp;

/* compiled from: Sta */
public class m1 {
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0100, code lost:
        throw new java.lang.IllegalArgumentException(r14, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fa A[ExcHandler: IOException (r0v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.startapp.l1 a(java.lang.String r14) {
        /*
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r1.<init>(r14)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r0.<init>(r1)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.util.List r0 = com.startapp.m4.a(r0)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r1 = 0
            java.lang.Object r2 = r0.get(r1)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            if (r4 == 0) goto L_0x00f4
            r2 = 1
            java.lang.Object r3 = r0.get(r2)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            if (r5 == 0) goto L_0x00ee
            r3 = 2
            java.lang.Object r3 = r0.get(r3)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.util.List r3 = (java.util.List) r3     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            if (r3 == 0) goto L_0x00e8
            int r6 = r3.size()     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r10 = 0
        L_0x0038:
            if (r10 >= r6) goto L_0x00af
            java.lang.Object r11 = r3.get(r10)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.util.Map r11 = (java.util.Map) r11     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            if (r11 == 0) goto L_0x00a9
            int r12 = r11.size()     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            if (r12 != r2) goto L_0x00a3
            java.util.Set r11 = r11.entrySet()     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.lang.Object r11 = r11.next()     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.lang.Object r12 = r11.getKey()     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            if (r12 == 0) goto L_0x009d
            java.lang.Class r13 = com.startapp.o1.a(r12)     // Catch:{ ClassCastException -> 0x0096, ClassNotFoundException -> 0x008f, InstantiationException -> 0x0088, InvocationTargetException -> 0x0081, NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x0073, IOException -> 0x00fa }
            java.lang.Object r11 = r11.getValue()     // Catch:{ ClassCastException -> 0x0096, ClassNotFoundException -> 0x008f, InstantiationException -> 0x0088, InvocationTargetException -> 0x0081, NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x0073, IOException -> 0x00fa }
            java.lang.Object r11 = com.startapp.o1.a(r13, r11)     // Catch:{ ClassCastException -> 0x0096, ClassNotFoundException -> 0x008f, InstantiationException -> 0x0088, InvocationTargetException -> 0x0081, NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x0073, IOException -> 0x00fa }
            r7[r10] = r12     // Catch:{ ClassCastException -> 0x0096, ClassNotFoundException -> 0x008f, InstantiationException -> 0x0088, InvocationTargetException -> 0x0081, NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x0073, IOException -> 0x00fa }
            r8[r10] = r13     // Catch:{ ClassCastException -> 0x0096, ClassNotFoundException -> 0x008f, InstantiationException -> 0x0088, InvocationTargetException -> 0x0081, NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x0073, IOException -> 0x00fa }
            r9[r10] = r11     // Catch:{ ClassCastException -> 0x0096, ClassNotFoundException -> 0x008f, InstantiationException -> 0x0088, InvocationTargetException -> 0x0081, NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x0073, IOException -> 0x00fa }
            int r10 = r10 + 1
            goto L_0x0038
        L_0x0073:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r1.<init>(r14, r0)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r1     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x007a:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r1.<init>(r14, r0)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r1     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x0081:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r1.<init>(r14, r0)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r1     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x0088:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r1.<init>(r14, r0)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r1     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x008f:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r1.<init>(r14, r0)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r1     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x0096:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r1.<init>(r14, r0)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r1     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r0.<init>(r14)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x00a3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r0.<init>(r14)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x00a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r0.<init>(r14)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x00af:
            r2 = 3
            java.lang.Object r0 = r0.get(r2)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.util.List r0 = (java.util.List) r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            if (r0 == 0) goto L_0x00e2
            int r2 = r0.size()     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            int r3 = r0.size()     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x00c2:
            if (r1 >= r3) goto L_0x00d7
            java.lang.Object r6 = r0.get(r1)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            if (r6 == 0) goto L_0x00d1
            r2[r1] = r6     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            int r1 = r1 + 1
            goto L_0x00c2
        L_0x00d1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r0.<init>(r14)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x00d7:
            com.startapp.l1 r0 = new com.startapp.l1     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r3 = r0
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            return r0
        L_0x00e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r0.<init>(r14)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x00e8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r0.<init>(r14)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x00ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r0.<init>(r14)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x00f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            r0.<init>(r14)     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
            throw r0     // Catch:{ ClassCastException -> 0x0101, IOException -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r14, r0)
            throw r1
        L_0x0101:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r14, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.m1.a(java.lang.String):com.startapp.l1");
    }
}
