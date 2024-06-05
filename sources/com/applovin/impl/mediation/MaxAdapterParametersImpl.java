package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.be;
import com.applovin.impl.ke;
import com.applovin.impl.wj;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a  reason: collision with root package name */
    private String f9373a;

    /* renamed from: b  reason: collision with root package name */
    private Map f9374b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f9375c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f9376d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f9377e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f9378f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f9379g;

    /* renamed from: h  reason: collision with root package name */
    private String f9380h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9381i;

    /* renamed from: j  reason: collision with root package name */
    private String f9382j;

    /* renamed from: k  reason: collision with root package name */
    private String f9383k;

    /* renamed from: l  reason: collision with root package name */
    private long f9384l;

    /* renamed from: m  reason: collision with root package name */
    private MaxAdFormat f9385m;

    private MaxAdapterParametersImpl() {
    }

    static MaxAdapterParametersImpl a(be beVar) {
        MaxAdapterParametersImpl a10 = a((ke) beVar);
        a10.f9382j = beVar.S();
        a10.f9383k = beVar.C();
        a10.f9384l = beVar.B();
        return a10;
    }

    public MaxAdFormat getAdFormat() {
        return this.f9385m;
    }

    public String getAdUnitId() {
        return this.f9373a;
    }

    public long getBidExpirationMillis() {
        return this.f9384l;
    }

    public String getBidResponse() {
        return this.f9383k;
    }

    public String getConsentString() {
        return this.f9380h;
    }

    public Bundle getCustomParameters() {
        return this.f9376d;
    }

    public Map<String, Object> getLocalExtraParameters() {
        return this.f9374b;
    }

    public Bundle getServerParameters() {
        return this.f9375c;
    }

    public String getThirdPartyAdPlacementId() {
        return this.f9382j;
    }

    public Boolean hasUserConsent() {
        return this.f9377e;
    }

    public Boolean isAgeRestrictedUser() {
        return this.f9378f;
    }

    public Boolean isDoNotSell() {
        return this.f9379g;
    }

    public boolean isTesting() {
        return this.f9381i;
    }

    static MaxAdapterParametersImpl a(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a10 = a((ke) wjVar);
        a10.f9373a = str;
        a10.f9385m = maxAdFormat;
        return a10;
    }

    static MaxAdapterParametersImpl a(ke keVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f9373a = keVar.getAdUnitId();
        maxAdapterParametersImpl.f9377e = keVar.n();
        maxAdapterParametersImpl.f9378f = keVar.o();
        maxAdapterParametersImpl.f9379g = keVar.p();
        maxAdapterParametersImpl.f9380h = keVar.d();
        maxAdapterParametersImpl.f9374b = keVar.i();
        maxAdapterParametersImpl.f9375c = keVar.l();
        maxAdapterParametersImpl.f9376d = keVar.f();
        maxAdapterParametersImpl.f9381i = keVar.q();
        return maxAdapterParametersImpl;
    }
}
