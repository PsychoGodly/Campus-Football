package com.google.protobuf;

import java.lang.reflect.Type;

/* compiled from: FieldType */
public enum w {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r9),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r11),
    FIXED64(5, r4, r10),
    FIXED32(6, r4, r11),
    BOOL(7, r4, r12),
    STRING(8, r4, r13),
    MESSAGE(9, r4, r14),
    BYTES(10, r4, r15),
    UINT32(11, r4, r11),
    ENUM(12, r4, r16),
    SFIXED32(13, r4, r11),
    SFIXED64(14, r4, r10),
    SINT32(15, r4, r11),
    SINT64(16, r4, r10),
    GROUP(17, r4, r14),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r9),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r11),
    FIXED64_LIST(23, r4, r10),
    FIXED32_LIST(24, r4, r11),
    BOOL_LIST(25, r4, r12),
    STRING_LIST(26, r4, r13),
    MESSAGE_LIST(27, r4, r14),
    BYTES_LIST(28, r4, r15),
    UINT32_LIST(29, r4, r11),
    ENUM_LIST(30, r4, r16),
    SFIXED32_LIST(31, r4, r11),
    SFIXED64_LIST(32, r4, r10),
    SINT32_LIST(33, r4, r11),
    SINT64_LIST(34, r4, r10),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r9),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r11),
    FIXED64_LIST_PACKED(40, r4, r10),
    FIXED32_LIST_PACKED(41, r4, r11),
    BOOL_LIST_PACKED(42, r4, r12),
    UINT32_LIST_PACKED(43, r4, r11),
    ENUM_LIST_PACKED(44, r4, r16),
    SFIXED32_LIST_PACKED(45, r4, r11),
    SFIXED64_LIST_PACKED(46, r4, r10),
    SINT32_LIST_PACKED(47, r4, r11),
    SINT64_LIST_PACKED(48, r4, r10),
    GROUP_LIST(49, r7, r14),
    MAP(50, b.MAP, g0.VOID);
    

    /* renamed from: f0  reason: collision with root package name */
    private static final w[] f27227f0 = null;

    /* renamed from: g0  reason: collision with root package name */
    private static final Type[] f27229g0 = null;

    /* renamed from: a  reason: collision with root package name */
    private final g0 f27250a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27251b;

    /* renamed from: c  reason: collision with root package name */
    private final b f27252c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<?> f27253d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f27254f;

    /* compiled from: FieldType */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27255a = null;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f27256b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.protobuf.g0[] r0 = com.google.protobuf.g0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27256b = r0
                r1 = 1
                com.google.protobuf.g0 r2 = com.google.protobuf.g0.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f27256b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.g0 r3 = com.google.protobuf.g0.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f27256b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.g0 r4 = com.google.protobuf.g0.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.protobuf.w$b[] r3 = com.google.protobuf.w.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f27255a = r3
                com.google.protobuf.w$b r4 = com.google.protobuf.w.b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f27255a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.protobuf.w$b r3 = com.google.protobuf.w.b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f27255a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.protobuf.w$b r1 = com.google.protobuf.w.b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.a.<clinit>():void");
        }
    }

    /* compiled from: FieldType */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: a  reason: collision with root package name */
        private final boolean f27262a;

        private b(boolean z10) {
            this.f27262a = z10;
        }
    }

    static {
        f27229g0 = new Type[0];
        w[] values = values();
        f27227f0 = new w[values.length];
        for (w wVar : values) {
            f27227f0[wVar.f27251b] = wVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r5 = com.google.protobuf.w.a.f27256b[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private w(int r4, com.google.protobuf.w.b r5, com.google.protobuf.g0 r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.f27251b = r4
            r1.f27252c = r5
            r1.f27250a = r6
            int[] r2 = com.google.protobuf.w.a.f27255a
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0022
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r1.f27253d = r2
            goto L_0x0028
        L_0x001b:
            java.lang.Class r2 = r6.c()
            r1.f27253d = r2
            goto L_0x0028
        L_0x0022:
            java.lang.Class r2 = r6.c()
            r1.f27253d = r2
        L_0x0028:
            r2 = 0
            com.google.protobuf.w$b r0 = com.google.protobuf.w.b.SCALAR
            if (r5 != r0) goto L_0x003d
            int[] r5 = com.google.protobuf.w.a.f27256b
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L_0x003d
            if (r5 == r3) goto L_0x003d
            r3 = 3
            if (r5 == r3) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r1.f27254f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.<init>(java.lang.String, int, int, com.google.protobuf.w$b, com.google.protobuf.g0):void");
    }

    public int c() {
        return this.f27251b;
    }
}
