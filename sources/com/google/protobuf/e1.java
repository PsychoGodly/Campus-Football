package com.google.protobuf;

import com.google.protobuf.d0;

/* compiled from: NullValue */
public enum e1 implements d0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: d  reason: collision with root package name */
    private static final d0.d<e1> f26999d = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f27001a;

    /* compiled from: NullValue */
    class a implements d0.d<e1> {
        a() {
        }

        /* renamed from: b */
        public e1 a(int i10) {
            return e1.c(i10);
        }
    }

    static {
        f26999d = new a();
    }

    private e1(int i10) {
        this.f27001a = i10;
    }

    public static e1 c(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f27001a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
