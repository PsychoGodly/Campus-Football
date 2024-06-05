package com.startapp;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class f {

    /* renamed from: d  reason: collision with root package name */
    public static f f15802d = new f();

    /* renamed from: a  reason: collision with root package name */
    public List<e> f15803a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public Map<AdPreferences.Placement, List<e>> f15804b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<e>> f15805c = new HashMap();

    public static f a() {
        return f15802d;
    }

    public int b() {
        return this.f15803a.size();
    }

    public synchronized void a(e eVar) {
        this.f15803a.add(0, eVar);
        List list = this.f15804b.get(eVar.f15769b);
        if (list == null) {
            list = new ArrayList();
            this.f15804b.put(eVar.f15769b, list);
        }
        list.add(0, eVar);
        List list2 = this.f15805c.get(eVar.f15770c);
        if (list2 == null) {
            list2 = new ArrayList();
            this.f15805c.put(eVar.f15770c, list2);
        }
        list2.add(0, eVar);
    }
}
