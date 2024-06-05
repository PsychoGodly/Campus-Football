package com.applovin.impl.mediation;

import com.applovin.impl.be;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a  reason: collision with root package name */
    private final be f9366a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9367b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9368c;

    /* renamed from: d  reason: collision with root package name */
    private final List f9369d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9370e;

    /* renamed from: f  reason: collision with root package name */
    private final List f9371f;

    /* renamed from: g  reason: collision with root package name */
    private final String f9372g;

    public MaxAdWaterfallInfoImpl(be beVar, long j10, List<MaxNetworkResponseInfo> list, String str) {
        this(beVar, beVar.U(), beVar.V(), j10, list, beVar.T(), str);
    }

    public long getLatencyMillis() {
        return this.f9370e;
    }

    public MaxAd getLoadedAd() {
        return this.f9366a;
    }

    public String getMCode() {
        return this.f9372g;
    }

    public String getName() {
        return this.f9367b;
    }

    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f9369d;
    }

    public List<String> getPostbackUrls() {
        return this.f9371f;
    }

    public String getTestName() {
        return this.f9368c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f9367b + ", testName=" + this.f9368c + ", networkResponses=" + this.f9369d + ", latencyMillis=" + this.f9370e + '}';
    }

    public MaxAdWaterfallInfoImpl(be beVar, String str, String str2, long j10, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.f9366a = beVar;
        this.f9367b = str;
        this.f9368c = str2;
        this.f9369d = list;
        this.f9370e = j10;
        this.f9371f = list2;
        this.f9372g = str3;
    }
}
