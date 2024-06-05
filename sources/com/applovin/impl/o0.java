package com.applovin.impl;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

public class o0 implements DTBAdCallback {

    /* renamed from: a  reason: collision with root package name */
    private final MaxAdFormat f10038a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10039b;

    /* renamed from: c  reason: collision with root package name */
    private DTBAdRequest f10040c;

    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public o0(p0 p0Var, MaxAdFormat maxAdFormat, a aVar) {
        this(Arrays.asList(new DTBAdSize[]{p0Var.a()}), maxAdFormat, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f10040c;
        if (dTBAdRequest == null) {
            this.f10039b.onAdLoadFailed((AdError) null, this.f10038a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f10039b.onAdLoadFailed(adError, this.f10038a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f10039b.onAdResponseLoaded(dTBAdResponse, this.f10038a);
    }

    public o0(List list, MaxAdFormat maxAdFormat, a aVar) {
        this.f10038a = maxAdFormat;
        this.f10039b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i10] = (DTBAdSize) obj;
                }
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f10040c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
