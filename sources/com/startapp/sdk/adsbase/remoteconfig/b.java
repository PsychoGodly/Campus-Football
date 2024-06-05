package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;

/* compiled from: Sta */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f17119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MetaDataRequest.RequestReason f17120b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f17121c;

    public b(c cVar, MetaDataRequest.RequestReason requestReason, boolean z10) {
        this.f17119a = cVar;
        this.f17120b = requestReason;
        this.f17121c = z10;
    }

    public void run() {
        this.f17119a.a(this.f17120b, this.f17121c);
    }
}
