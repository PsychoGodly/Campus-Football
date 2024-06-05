package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.a2;
import com.startapp.c0;
import com.startapp.d0;
import com.startapp.j9;
import com.startapp.k;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.d;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.u4;
import com.startapp.v4;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class DiskAdCacheManager {

    /* compiled from: Sta */
    public static class DiskCacheKey implements Serializable {
        private static final long serialVersionUID = 1;
        public AdPreferences adPreferences;
        private int numberOfLoadedAd;
        public AdPreferences.Placement placement;

        public DiskCacheKey(AdPreferences.Placement placement2, AdPreferences adPreferences2) {
            this.placement = placement2;
            this.adPreferences = adPreferences2;
        }

        public int a() {
            return this.numberOfLoadedAd;
        }

        public void a(int i10) {
            this.numberOfLoadedAd = i10;
        }
    }

    /* compiled from: Sta */
    public static class DiskCachedAd implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: ad  reason: collision with root package name */
        private d f16923ad;
        private String html;

        public DiskCachedAd(d dVar) {
            a(dVar);
            c();
        }

        public d a() {
            return this.f16923ad;
        }

        public String b() {
            return this.html;
        }

        public final void c() {
            d dVar = this.f16923ad;
            if (dVar != null && (dVar instanceof HtmlAd)) {
                this.html = ((HtmlAd) dVar).k();
            }
        }

        public final void a(d dVar) {
            this.f16923ad = dVar;
        }
    }

    /* compiled from: Sta */
    public interface a {
    }

    /* compiled from: Sta */
    public interface b {
    }

    /* compiled from: Sta */
    public interface c {
    }

    public static void a(Context context, AdEventListener adEventListener) {
        k.a(context, adEventListener, (Ad) null, true);
    }

    public static String b() {
        return "startapp_ads".concat(File.separator).concat("keys");
    }

    public static String a() {
        return "startapp_ads".concat(File.separator).concat("interstitials");
    }

    public static void a(Context context, DiskCachedAd diskCachedAd, a aVar, AdEventListener adEventListener) {
        d a10 = diskCachedAd.a();
        a10.setContext(context);
        Map<Activity, Integer> map = j9.f15982a;
        boolean z10 = true;
        if (a10 instanceof InterstitialAd) {
            InterstitialAd interstitialAd = (InterstitialAd) a10;
            String b10 = diskCachedAd.b();
            if (b10 == null || b10.equals(MaxReward.DEFAULT_LABEL)) {
                a(context, adEventListener);
                return;
            }
            if (AdsCommonMetaData.f16770h.H()) {
                List<AppPresenceDetails> a11 = d0.a(b10, 0);
                ArrayList arrayList = new ArrayList();
                if (d0.a(context, a11, 0, (Set<String>) new HashSet(), (List<AppPresenceDetails>) arrayList).booleanValue()) {
                    new c0(context, arrayList).a();
                    z10 = false;
                }
            }
            if (!z10) {
                a(context, adEventListener);
                return;
            }
            d dVar = d.f16928h;
            dVar.f16930b.put(interstitialAd.l(), b10);
            ((g) aVar).f16950a.f16955e = interstitialAd;
            ComponentLocator.a(context).f17139b.a().a(b10, new a2(context, adEventListener, interstitialAd));
        } else if (a10 instanceof OfferWall3DAd) {
            OfferWall3DAd offerWall3DAd = (OfferWall3DAd) a10;
            List<AdDetails> g10 = offerWall3DAd.g();
            if (g10 == null) {
                a(context, adEventListener);
                return;
            }
            if (AdsCommonMetaData.f16770h.H()) {
                g10 = d0.a(context, g10, 0, (Set<String>) new HashSet(), true);
            }
            if (g10.size() > 0) {
                ((g) aVar).f16950a.f16955e = offerWall3DAd;
                u4 a12 = v4.f17398b.a(offerWall3DAd.h());
                a12.getClass();
                a12.f17364b = new ArrayList();
                a12.f17365c = MaxReward.DEFAULT_LABEL;
                for (AdDetails a13 : g10) {
                    a12.a(a13);
                }
                k.b(context, adEventListener, offerWall3DAd, true);
                return;
            }
            a(context, adEventListener);
        } else {
            a(context, adEventListener);
        }
    }
}
