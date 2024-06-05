package io.grpc.internal;

import dd.u0;
import dd.v0;
import r6.i;

/* compiled from: AbstractManagedChannelImplBuilder */
public abstract class b<T extends v0<T>> extends v0<T> {

    /* renamed from: a  reason: collision with root package name */
    protected int f34737a = 4194304;

    protected b() {
    }

    public u0 a() {
        return e().a();
    }

    /* access modifiers changed from: protected */
    public abstract v0<?> e();

    public String toString() {
        return i.c(this).d("delegate", e()).toString();
    }
}
