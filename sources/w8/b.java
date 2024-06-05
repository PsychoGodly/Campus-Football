package w8;

import v8.l;

/* compiled from: AztecReader */
public final class b implements l {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[LOOP:0: B:29:0x005c->B:30:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v8.n a(v8.c r11, java.util.Map<v8.e, ?> r12) throws v8.j, v8.f {
        /*
            r10 = this;
            y8.a r0 = new y8.a
            z8.b r11 = r11.a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            w8.a r2 = r0.a(r11)     // Catch:{ j -> 0x002b, f -> 0x0025 }
            v8.p[] r3 = r2.b()     // Catch:{ j -> 0x002b, f -> 0x0025 }
            x8.a r4 = new x8.a     // Catch:{ j -> 0x0023, f -> 0x0021 }
            r4.<init>()     // Catch:{ j -> 0x0023, f -> 0x0021 }
            z8.e r2 = r4.c(r2)     // Catch:{ j -> 0x0023, f -> 0x0021 }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004e
            r1 = 1
            w8.a r0 = r0.a(r1)     // Catch:{ j -> 0x0046, f -> 0x0044 }
            v8.p[] r4 = r0.b()     // Catch:{ j -> 0x0046, f -> 0x0044 }
            x8.a r1 = new x8.a     // Catch:{ j -> 0x0046, f -> 0x0044 }
            r1.<init>()     // Catch:{ j -> 0x0046, f -> 0x0044 }
            z8.e r1 = r1.c(r0)     // Catch:{ j -> 0x0046, f -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            r11 = move-exception
            goto L_0x0047
        L_0x0046:
            r11 = move-exception
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x004c
            throw r3
        L_0x004c:
            throw r11
        L_0x004d:
            throw r2
        L_0x004e:
            r6 = r4
            if (r12 == 0) goto L_0x0066
            v8.e r0 = v8.e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            v8.q r12 = (v8.q) r12
            if (r12 == 0) goto L_0x0066
            int r0 = r6.length
        L_0x005c:
            if (r11 >= r0) goto L_0x0066
            r2 = r6[r11]
            r12.a(r2)
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0066:
            v8.n r11 = new v8.n
            java.lang.String r3 = r1.h()
            byte[] r4 = r1.e()
            int r5 = r1.c()
            v8.a r7 = v8.a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.a()
            if (r12 == 0) goto L_0x0089
            v8.o r0 = v8.o.BYTE_SEGMENTS
            r11.h(r0, r12)
        L_0x0089:
            java.lang.String r12 = r1.b()
            if (r12 == 0) goto L_0x0094
            v8.o r0 = v8.o.ERROR_CORRECTION_LEVEL
            r11.h(r0, r12)
        L_0x0094:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.b.a(v8.c, java.util.Map):v8.n");
    }

    public void reset() {
    }
}
