package com.iab.omid.library.applovin.internal;

import com.iab.omid.library.applovin.adsession.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f27383c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<a> f27384a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<a> f27385b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f27383c;
    }

    public Collection<a> a() {
        return Collections.unmodifiableCollection(this.f27385b);
    }

    public Collection<a> b() {
        return Collections.unmodifiableCollection(this.f27384a);
    }

    public boolean d() {
        return this.f27385b.size() > 0;
    }

    public void a(a aVar) {
        this.f27384a.add(aVar);
    }

    public void b(a aVar) {
        boolean d10 = d();
        this.f27384a.remove(aVar);
        this.f27385b.remove(aVar);
        if (d10 && !d()) {
            i.c().e();
        }
    }

    public void c(a aVar) {
        boolean d10 = d();
        this.f27385b.add(aVar);
        if (!d10) {
            i.c().d();
        }
    }
}
