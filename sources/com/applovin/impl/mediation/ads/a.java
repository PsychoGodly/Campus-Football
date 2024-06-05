package com.applovin.impl.mediation.ads;

import android.app.Activity;
import com.applovin.impl.be;
import com.applovin.impl.lc;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected MaxAdExpirationListener expirationListener;
    protected final Map<String, Object> extraParameters = Collections.synchronizedMap(new HashMap());
    protected final Map<String, Object> localExtraParameters = Collections.synchronizedMap(new HashMap());
    protected final t logger;
    protected MaxAdRequestListener requestListener;
    protected MaxAdRevenueListener revenueListener;
    protected final k sdk;
    protected final String tag;

    /* renamed from: com.applovin.impl.mediation.ads.a$a  reason: collision with other inner class name */
    public interface C0126a extends MaxAdListener, MaxAdRevenueListener, MaxAdRequestListener {
    }

    protected a(String str, MaxAdFormat maxAdFormat, String str2, k kVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = kVar;
        this.tag = str2;
        this.logger = kVar.L();
    }

    /* access modifiers changed from: package-private */
    public void a(be beVar) {
        lc lcVar = new lc();
        lcVar.a().a("MAX Ad").a(beVar).a();
        if (t.a()) {
            this.logger.a(this.tag, lcVar.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.expirationListener = null;
        this.adReviewListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (t.a()) {
            this.logger.a(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Setting expiration listener: " + maxAdExpirationListener);
        }
        this.expirationListener = maxAdExpirationListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        } else if (!zp.c(this.sdk) || (!"amazon_ad_response".equals(str) && !"amazon_ad_error".equals(str))) {
            if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
                int parseInt = Integer.parseInt(str2);
                if (((long) parseInt) > TimeUnit.MINUTES.toSeconds(2)) {
                    String str3 = this.tag;
                    t.h(str3, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + parseInt + "s) - this will be ignored");
                }
            }
            this.extraParameters.put(str, str2);
        } else {
            throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
        }
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        } else if (!(obj instanceof Activity)) {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            this.localExtraParameters.put(str, obj);
        } else if (t.a()) {
            this.logger.b(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
        }
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }

    public static void logApiCall(String str, String str2) {
        k kVar = k.A0;
        if (kVar != null) {
            kVar.L();
            if (t.a()) {
                k.A0.L().a(str, str2);
            }
        }
    }
}
