package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.applovin.sdk.AppLovinMediationProvider;
import com.startapp.d9;
import com.startapp.j9;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.utils.UniversalIntParser;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class ACMConfig implements Serializable {
    private static final long serialVersionUID = 5818859951358287830L;
    private long adCacheTTL = 3600;
    @d9(type = EnumSet.class, value = StartAppAd.AdMode.class)
    private Set<StartAppAd.AdMode> autoLoad = EnumSet.of(StartAppAd.AdMode.FULLPAGE);
    @d9(parser = UniversalIntParser.class)
    private int autoLoadEnabled = 1;
    @d9(complex = true)
    private FailuresHandler failuresHandler = new FailuresHandler();
    private boolean localCache = true;
    private int maxCacheSize = 7;
    @d9(type = HashSet.class)
    private Set<String> mediators = new HashSet(Arrays.asList(new String[]{"applovin", AppLovinMediationProvider.ADMOB, AppLovinMediationProvider.IRONSOURCE}));
    private long returnAdCacheTTL = 3600;
    private boolean returnAdShouldLoadInBg = true;

    public long a() {
        return TimeUnit.SECONDS.toMillis(this.adCacheTTL);
    }

    public Set<StartAppAd.AdMode> b() {
        return this.autoLoad;
    }

    public FailuresHandler c() {
        return this.failuresHandler;
    }

    public int d() {
        return this.maxCacheSize;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.returnAdCacheTTL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ACMConfig aCMConfig = (ACMConfig) obj;
        if (this.adCacheTTL == aCMConfig.adCacheTTL && this.returnAdCacheTTL == aCMConfig.returnAdCacheTTL && this.autoLoadEnabled == aCMConfig.autoLoadEnabled && this.localCache == aCMConfig.localCache && this.returnAdShouldLoadInBg == aCMConfig.returnAdShouldLoadInBg && this.maxCacheSize == aCMConfig.maxCacheSize && j9.a(this.autoLoad, aCMConfig.autoLoad) && j9.a(this.mediators, aCMConfig.mediators) && j9.a(this.failuresHandler, aCMConfig.failuresHandler)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.localCache;
    }

    public boolean g() {
        return this.returnAdShouldLoadInBg;
    }

    public int hashCode() {
        Object[] objArr = {Long.valueOf(this.adCacheTTL), Long.valueOf(this.returnAdCacheTTL), this.autoLoad, Integer.valueOf(this.autoLoadEnabled), this.mediators, Boolean.valueOf(this.localCache), Boolean.valueOf(this.returnAdShouldLoadInBg), this.failuresHandler, Integer.valueOf(this.maxCacheSize)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public boolean a(Map<String, String> map) {
        Set<String> set;
        int i10 = this.autoLoadEnabled;
        if (i10 == 2) {
            if (!(map == null || (set = this.mediators) == null)) {
                for (String next : set) {
                    Iterator<String> it = map.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equalsIgnoreCase(next)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        } else if (i10 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
