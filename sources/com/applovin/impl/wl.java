package com.applovin.impl;

abstract class wl {

    /* renamed from: a  reason: collision with root package name */
    protected final ro f13099a;

    public static final class a extends ah {
        public a(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    protected wl(ro roVar) {
        this.f13099a = roVar;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(yg ygVar);

    public final boolean a(yg ygVar, long j10) {
        return a(ygVar) && b(ygVar, j10);
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(yg ygVar, long j10);
}
