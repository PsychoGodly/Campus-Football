package com.applovin.impl;

import com.applovin.impl.sdk.t;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class uc {

    /* renamed from: a  reason: collision with root package name */
    private final sg f12546a = new sg();

    /* renamed from: b  reason: collision with root package name */
    private final TreeSet f12547b = new TreeSet();

    /* renamed from: c  reason: collision with root package name */
    private final Map f12548c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private int f12549d;

    /* renamed from: e  reason: collision with root package name */
    private int f12550e;

    public uc(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    public void a() {
        this.f12548c.clear();
        this.f12547b.clear();
    }

    public int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public int c(int i10) {
        return i10 + a(i10, false);
    }

    public int d(int i10) {
        if (g(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public Collection e(int i10) {
        return new TreeSet(this.f12547b.tailSet(Integer.valueOf(i10), false));
    }

    public void f(int i10) {
        int b10 = this.f12546a.b((Comparable) Integer.valueOf(i10));
        for (int size = this.f12546a.size() - 1; size >= b10; size--) {
            Integer num = (Integer) this.f12546a.a(size);
            int intValue = num.intValue() + 1;
            a(num.intValue(), intValue);
            this.f12546a.a(size, Integer.valueOf(intValue));
        }
    }

    public boolean g(int i10) {
        return this.f12546a.contains(Integer.valueOf(i10));
    }

    public boolean h(int i10) {
        return this.f12547b.contains(Integer.valueOf(i10));
    }

    public void i(int i10) {
        int b10 = this.f12546a.b((Comparable) Integer.valueOf(i10));
        if (g(i10)) {
            this.f12548c.remove(Integer.valueOf(i10));
            this.f12547b.remove(Integer.valueOf(i10));
            this.f12546a.b(b10);
        }
        while (b10 < this.f12546a.size()) {
            Integer num = (Integer) this.f12546a.a(b10);
            int intValue = num.intValue() - 1;
            a(num.intValue(), intValue);
            this.f12546a.a(b10, Integer.valueOf(intValue));
            b10++;
        }
    }

    public void b(int i10, int i11) {
        i(i10);
        f(i11);
    }

    public int c() {
        int i10 = this.f12549d;
        if (!(i10 == -1 || this.f12550e == -1)) {
            while (i10 <= this.f12550e) {
                if (g(i10) && !h(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f12548c.remove(num);
            this.f12547b.remove(num);
        }
    }

    public Collection b() {
        return new TreeSet(this.f12547b);
    }

    public void c(int i10, int i11) {
        this.f12549d = i10;
        this.f12550e = i11;
    }

    public MaxAd a(int i10) {
        return (MaxAd) this.f12548c.get(Integer.valueOf(i10));
    }

    private int a(int i10, boolean z10) {
        int c10 = this.f12546a.c(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + c10;
            while (c10 < this.f12546a.size() && i11 >= ((Integer) this.f12546a.a(c10)).intValue()) {
                i11++;
                c10++;
            }
        }
        return c10;
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            t.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f12546a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (maxAdPlacerSettings.isRepeatingEnabled()) {
            int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
            if (this.f12546a.isEmpty()) {
                this.f12546a.add((Comparable) Integer.valueOf(repeatingInterval - 1));
            }
            int intValue = ((Integer) this.f12546a.a()).intValue();
            while (true) {
                intValue += repeatingInterval;
                if (this.f12546a.size() < maxAdPlacerSettings.getMaxAdCount()) {
                    this.f12546a.add((Comparable) Integer.valueOf(intValue));
                } else {
                    return;
                }
            }
        }
    }

    public void a(MaxAd maxAd, int i10) {
        this.f12548c.put(Integer.valueOf(i10), maxAd);
        this.f12547b.add(Integer.valueOf(i10));
    }

    private void a(int i10, int i11) {
        if (this.f12548c.containsKey(Integer.valueOf(i10))) {
            this.f12548c.put(Integer.valueOf(i11), (MaxAd) this.f12548c.get(Integer.valueOf(i10)));
            this.f12547b.add(Integer.valueOf(i11));
            this.f12548c.remove(Integer.valueOf(i10));
            this.f12547b.remove(Integer.valueOf(i10));
        }
    }
}
