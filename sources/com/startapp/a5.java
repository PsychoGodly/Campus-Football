package com.startapp;

import u9.a;

/* compiled from: Sta */
public final class a5 {

    /* renamed from: a  reason: collision with root package name */
    public final eb f15606a;

    public a5(eb ebVar) {
        this.f15606a = ebVar;
    }

    public static a5 a(o oVar) {
        eb ebVar = (eb) oVar;
        if (!ebVar.e()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        } else if (ebVar.f15796f) {
            throw new IllegalStateException("AdSession is started");
        } else if (!ebVar.f15797g) {
            a aVar = ebVar.f15795e;
            if (aVar.f30668c == null) {
                a5 a5Var = new a5(ebVar);
                aVar.f30668c = a5Var;
                return a5Var;
            }
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public final void a(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }
}
