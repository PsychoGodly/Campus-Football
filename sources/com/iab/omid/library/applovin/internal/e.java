package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.applovin.weakreference.a;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final a f27389a;

    /* renamed from: b  reason: collision with root package name */
    private final String f27390b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f27391c;

    /* renamed from: d  reason: collision with root package name */
    private final String f27392d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f27389a = new a(view);
        this.f27390b = view.getClass().getCanonicalName();
        this.f27391c = friendlyObstructionPurpose;
        this.f27392d = str;
    }

    public String a() {
        return this.f27392d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f27391c;
    }

    public a c() {
        return this.f27389a;
    }

    public String d() {
        return this.f27390b;
    }
}
