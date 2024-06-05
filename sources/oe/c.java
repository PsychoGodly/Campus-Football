package oe;

import java.text.DecimalFormat;

/* compiled from: DurationJvm.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f36773a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat>[] f36774b;

    static {
        Class<b> cls = b.class;
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f36774b = threadLocalArr;
    }

    public static final boolean a() {
        return f36773a;
    }
}
