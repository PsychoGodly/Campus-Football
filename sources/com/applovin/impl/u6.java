package com.applovin.impl;

import com.applovin.impl.sdk.ad.b;

public class u6 {

    /* renamed from: a  reason: collision with root package name */
    private final long f12528a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f12529b;

    /* renamed from: c  reason: collision with root package name */
    private String f12530c;

    /* renamed from: d  reason: collision with root package name */
    private String f12531d;

    public u6(Object obj, long j10) {
        this.f12529b = obj;
        this.f12528a = j10;
        if (obj instanceof b) {
            b bVar = (b) obj;
            this.f12530c = bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null;
            this.f12531d = "AppLovin";
        } else if (obj instanceof be) {
            be beVar = (be) obj;
            this.f12530c = beVar.getFormat().getLabel();
            this.f12531d = beVar.getNetworkName();
        }
    }

    public Object a() {
        return this.f12529b;
    }

    public long b() {
        return this.f12528a;
    }

    public String c() {
        String str = this.f12530c;
        return str != null ? str : "Unknown";
    }

    public String d() {
        String str = this.f12531d;
        return str != null ? str : "Unknown";
    }
}
