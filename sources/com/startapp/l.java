package com.startapp;

import u9.a;

/* compiled from: Sta */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final eb f16075a;

    public l(eb ebVar) {
        this.f16075a = ebVar;
    }

    public static l a(o oVar) {
        eb ebVar = (eb) oVar;
        a aVar = ebVar.f15795e;
        if (aVar.f30667b != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        } else if (!ebVar.f15797g) {
            l lVar = new l(ebVar);
            aVar.f30667b = lVar;
            return lVar;
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
