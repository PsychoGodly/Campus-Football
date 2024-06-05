package com.ryanheise.audioservice;

import com.ryanheise.audioservice.a;
import java.util.Map;
import lc.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.c f15577a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f15578b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k.d f15579c;

    public /* synthetic */ b(a.c cVar, Map map, k.d dVar) {
        this.f15577a = cVar;
        this.f15578b = map;
        this.f15579c = dVar;
    }

    public final void run() {
        this.f15577a.S(this.f15578b, this.f15579c);
    }
}
