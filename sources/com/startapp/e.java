package com.startapp;

import com.applovin.mediation.MaxReward;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class e implements Comparable<e> {

    /* renamed from: a  reason: collision with root package name */
    public long f15768a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public AdPreferences.Placement f15769b;

    /* renamed from: c  reason: collision with root package name */
    public String f15770c;

    public e(AdPreferences.Placement placement, String str) {
        this.f15769b = placement;
        this.f15770c = str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public int compareTo(Object obj) {
        int i10 = ((this.f15768a - ((e) obj).f15768a) > 0 ? 1 : ((this.f15768a - ((e) obj).f15768a) == 0 ? 0 : -1));
        if (i10 > 0) {
            return 1;
        }
        return i10 == 0 ? 0 : -1;
    }

    public String toString() {
        StringBuilder a10 = p0.a("AdDisplayEvent [displayTime=");
        a10.append(this.f15768a);
        a10.append(", placement=");
        a10.append(this.f15769b);
        a10.append(", adTag=");
        a10.append(this.f15770c);
        a10.append("]");
        return a10.toString();
    }
}
