package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public enum zzaiw {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r10),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r15),
    FIXED64(5, r4, r12),
    FIXED32(6, r4, r15),
    BOOL(7, r4, r19),
    STRING(8, r4, r21),
    MESSAGE(9, r4, r23),
    BYTES(10, r4, r25),
    UINT32(11, r4, r15),
    ENUM(12, r4, r28),
    SFIXED32(13, r4, r15),
    SFIXED64(14, r4, r12),
    SINT32(15, r4, r15),
    SINT64(16, r4, r12),
    GROUP(17, r4, r23),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r10),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r15),
    FIXED64_LIST(23, r4, r12),
    FIXED32_LIST(24, r4, r15),
    BOOL_LIST(25, r4, r19),
    STRING_LIST(26, r4, r21),
    MESSAGE_LIST(27, r4, r23),
    BYTES_LIST(28, r4, r25),
    UINT32_LIST(29, r4, r15),
    ENUM_LIST(30, r4, r28),
    SFIXED32_LIST(31, r4, r15),
    SFIXED64_LIST(32, r4, r12),
    SINT32_LIST(33, r4, r15),
    SINT64_LIST(34, r4, r12),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r10),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r15),
    FIXED64_LIST_PACKED(40, r4, r12),
    FIXED32_LIST_PACKED(41, r4, r15),
    BOOL_LIST_PACKED(42, r4, r19),
    UINT32_LIST_PACKED(43, r4, r15),
    ENUM_LIST_PACKED(44, r4, r28),
    SFIXED32_LIST_PACKED(45, r4, r15),
    SFIXED64_LIST_PACKED(46, r4, r12),
    SINT32_LIST_PACKED(47, r4, r15),
    SINT64_LIST_PACKED(48, r4, r12),
    GROUP_LIST(49, r34, r23),
    MAP(50, zzaiy.MAP, zzajk.VOID);
    
    private static final zzaiw[] zzaz = null;
    private static final Type[] zzba = null;
    private final zzajk zzbc;
    private final int zzbd;
    private final zzaiy zzbe;
    private final Class<?> zzbf;
    private final boolean zzbg;

    static {
        int i10;
        zzba = new Type[0];
        zzaiw[] values = values();
        zzaz = new zzaiw[values.length];
        for (zzaiw zzaiw : values) {
            zzaz[zzaiw.zzbd] = zzaiw;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r5 = com.google.android.gms.internal.p001firebaseauthapi.zzaiz.zza[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzaiw(int r4, com.google.android.gms.internal.p001firebaseauthapi.zzaiy r5, com.google.android.gms.internal.p001firebaseauthapi.zzajk r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.zzbd = r4
            r1.zzbe = r5
            r1.zzbc = r6
            int r2 = r5.ordinal()
            r3 = 3
            r4 = 1
            if (r2 == r4) goto L_0x001e
            if (r2 == r3) goto L_0x0017
            r2 = 0
            r1.zzbf = r2
            goto L_0x0024
        L_0x0017:
            java.lang.Class r2 = r6.zza()
            r1.zzbf = r2
            goto L_0x0024
        L_0x001e:
            java.lang.Class r2 = r6.zza()
            r1.zzbf = r2
        L_0x0024:
            r2 = 0
            com.google.android.gms.internal.firebase-auth-api.zzaiy r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaiy.SCALAR
            if (r5 != r0) goto L_0x0039
            int[] r5 = com.google.android.gms.internal.p001firebaseauthapi.zzaiz.zza
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L_0x0039
            r6 = 2
            if (r5 == r6) goto L_0x0039
            if (r5 == r3) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            r1.zzbg = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaiw.<init>(java.lang.String, int, int, com.google.android.gms.internal.firebase-auth-api.zzaiy, com.google.android.gms.internal.firebase-auth-api.zzajk):void");
    }

    public final int zza() {
        return this.zzbd;
    }
}
