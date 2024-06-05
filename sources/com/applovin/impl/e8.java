package com.applovin.impl;

public final class e8 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final int f7374a;

    public e8(int i10) {
        super(a(i10));
        this.f7374a = i10;
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
