package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.y3;
import com.applovin.impl.yb;

public class uh extends yb {

    /* renamed from: n  reason: collision with root package name */
    private final y3.a f12588n;

    /* renamed from: o  reason: collision with root package name */
    private final Context f12589o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f12590p;

    public uh(y3.a aVar, boolean z10, Context context) {
        super(yb.c.RIGHT_DETAIL);
        this.f12588n = aVar;
        this.f12589o = context;
        this.f13563c = new SpannedString(aVar.a());
        this.f12590p = z10;
    }

    public SpannedString f() {
        return new SpannedString(this.f12588n.a(this.f12589o));
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        Boolean b10 = this.f12588n.b(this.f12589o);
        if (b10 != null) {
            return b10.equals(Boolean.valueOf(this.f12590p));
        }
        return false;
    }
}
