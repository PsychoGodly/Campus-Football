package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.t;
import java.util.Set;
import java.util.TreeSet;

public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a  reason: collision with root package name */
    private final String f14063a;

    /* renamed from: b  reason: collision with root package name */
    private String f14064b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f14065c = new TreeSet();

    /* renamed from: d  reason: collision with root package name */
    private int f14066d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f14067e = 256;

    /* renamed from: f  reason: collision with root package name */
    private int f14068f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f14063a = str;
    }

    public void addFixedPosition(int i10) {
        this.f14065c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f14063a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f14065c;
    }

    public int getMaxAdCount() {
        return this.f14067e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f14068f;
    }

    public String getPlacement() {
        return this.f14064b;
    }

    public int getRepeatingInterval() {
        return this.f14066d;
    }

    public boolean hasValidPositioning() {
        return !this.f14065c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f14066d >= 2;
    }

    public void resetFixedPositions() {
        this.f14065c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f14067e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f14068f = i10;
    }

    public void setPlacement(String str) {
        this.f14064b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f14066d = i10;
            t.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f14066d = 0;
        t.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of " + 2);
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f14063a + '\'' + ", fixedPositions=" + this.f14065c + ", repeatingInterval=" + this.f14066d + ", maxAdCount=" + this.f14067e + ", maxPreloadedAdCount=" + this.f14068f + '}';
    }
}
