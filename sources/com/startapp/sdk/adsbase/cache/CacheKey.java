package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.j9;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class CacheKey implements Serializable {
    private static final long serialVersionUID = 5066050766568512916L;
    private String adTag;
    private String advertiserId;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    private String country;
    private boolean forceFullpage;
    private boolean forceOfferWall2D;
    private boolean forceOfferWall3D;
    private boolean forceOverlay;
    private Double minCpm;
    private AdPreferences.Placement placement;
    private String placementId;
    private String productId;
    private String template;
    private boolean testMode;
    private Ad.AdType type;
    private boolean videoMuted;

    public CacheKey(AdPreferences.Placement placement2, AdPreferences adPreferences) {
        this.placement = placement2;
        this.placementId = adPreferences.getPlacementId();
        this.categories = adPreferences.getCategories();
        this.categoriesExclude = adPreferences.getCategoriesExclude();
        this.videoMuted = adPreferences.isVideoMuted();
        this.minCpm = adPreferences.getMinCpm();
        this.forceOfferWall3D = adPreferences.isForceOfferWall3D();
        this.forceOfferWall2D = adPreferences.isForceOfferWall2D();
        this.forceFullpage = adPreferences.isForceFullpage();
        this.forceOverlay = adPreferences.isForceOverlay();
        this.testMode = adPreferences.isTestMode();
        this.adTag = adPreferences.getAdTag();
        this.productId = adPreferences.getCustomProductId();
        this.type = adPreferences.getType();
    }

    public AdPreferences.Placement a() {
        return this.placement;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheKey cacheKey = (CacheKey) obj;
        if (this.forceOfferWall3D != cacheKey.forceOfferWall3D || this.forceOfferWall2D != cacheKey.forceOfferWall2D || this.forceFullpage != cacheKey.forceFullpage || this.forceOverlay != cacheKey.forceOverlay || this.testMode != cacheKey.testMode || this.videoMuted != cacheKey.videoMuted || this.placement != cacheKey.placement || !j9.a(this.placementId, cacheKey.placementId) || !j9.a(this.categories, cacheKey.categories) || !j9.a(this.categoriesExclude, cacheKey.categoriesExclude) || !j9.a(this.minCpm, cacheKey.minCpm) || !j9.a(this.adTag, cacheKey.adTag) || !j9.a(this.productId, cacheKey.productId) || !j9.a(this.country, cacheKey.country) || !j9.a(this.advertiserId, cacheKey.advertiserId) || !j9.a(this.template, cacheKey.template) || this.type != cacheKey.type) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.placement, this.placementId, this.categories, this.categoriesExclude, this.minCpm, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), Boolean.valueOf(this.testMode), Boolean.valueOf(this.videoMuted), this.adTag, this.productId, this.country, this.advertiserId, this.template, this.type};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        return super.toString();
    }
}
