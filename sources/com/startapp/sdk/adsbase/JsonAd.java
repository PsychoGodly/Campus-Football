package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public abstract class JsonAd extends Ad {
    private static final long serialVersionUID = 1;
    private List<AdDetails> adsDetails = null;

    public JsonAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    public void a(List<AdDetails> list) {
        this.adsDetails = list;
        Long l10 = null;
        for (AdDetails next : list) {
            if (!(next == null || next.x() == null)) {
                if (l10 == null || next.x().longValue() < l10.longValue()) {
                    l10 = next.x();
                }
            }
        }
        if (l10 != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l10.longValue()));
        }
        boolean z10 = true;
        Iterator<AdDetails> it = this.adsDetails.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it.next().n()) {
                    z10 = false;
                    break;
                }
            } else {
                break;
            }
        }
        this.belowMinCPM = z10;
    }

    public List<AdDetails> g() {
        return this.adsDetails;
    }

    public String getAdId() {
        List<AdDetails> list = this.adsDetails;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.adsDetails.get(0).a();
    }

    public String getBidToken() {
        List<AdDetails> list = this.adsDetails;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.adsDetails.get(0).d();
    }

    public String getDParam() {
        List<AdDetails> list = this.adsDetails;
        if (list == null) {
            return null;
        }
        try {
            String str = null;
            for (AdDetails next : list) {
                try {
                    if (next != null) {
                        String g10 = next.g();
                        String[] u10 = next.u();
                        str = a.a(g10, (u10 == null || u10.length <= 0) ? null : u10[0]);
                        if (str != null) {
                            break;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return str;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
