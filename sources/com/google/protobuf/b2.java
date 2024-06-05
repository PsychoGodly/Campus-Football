package com.google.protobuf;

import com.applovin.mediation.MaxReward;

/* compiled from: WireFormat */
public final class b2 {

    /* renamed from: a  reason: collision with root package name */
    static final int f26937a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f26938b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f26939c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f26940d = c(3, 2);

    /* compiled from: WireFormat */
    public enum b {
        DOUBLE(c.DOUBLE, 1),
        FLOAT(c.FLOAT, 5),
        INT64(r1, 0),
        UINT64(r1, 0),
        INT32(r2, 0),
        FIXED64(r1, 1),
        FIXED32(r2, 5),
        BOOL(c.BOOLEAN, 0),
        STRING(c.STRING, 2) {
        },
        GROUP(r8, 3) {
        },
        MESSAGE(r8, 2) {
        },
        BYTES(c.BYTE_STRING, 2) {
        },
        UINT32(r2, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(r2, 5),
        SFIXED64(r1, 1),
        SINT32(r2, 0),
        SINT64(r1, 0);
        

        /* renamed from: a  reason: collision with root package name */
        private final c f26960a;

        /* renamed from: b  reason: collision with root package name */
        private final int f26961b;

        public c c() {
            return this.f26960a;
        }

        public int d() {
            return this.f26961b;
        }

        private b(c cVar, int i10) {
            this.f26960a = cVar;
            this.f26961b = i10;
        }
    }

    /* compiled from: WireFormat */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(MaxReward.DEFAULT_LABEL),
        BYTE_STRING(i.f27039b),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: a  reason: collision with root package name */
        private final Object f26972a;

        private c(Object obj) {
            this.f26972a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
