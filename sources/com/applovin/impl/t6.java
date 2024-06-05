package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.yb;
import com.applovin.sdk.R;

public class t6 extends yb {

    /* renamed from: n  reason: collision with root package name */
    private final u6 f12264n;

    /* renamed from: o  reason: collision with root package name */
    private final Context f12265o;

    public t6(u6 u6Var, Context context) {
        super(yb.c.DETAIL);
        this.f12264n = u6Var;
        this.f12265o = context;
        this.f13563c = r();
        this.f13564d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + zp.a(this.f12264n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f12264n.c());
        spannableStringBuilder.append(" - ");
        spannableStringBuilder.append(this.f12264n.d());
        return new SpannedString(spannableStringBuilder);
    }

    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    public int e() {
        return r3.a(R.color.applovin_sdk_disclosureButtonColor, this.f12265o);
    }

    public boolean o() {
        return true;
    }
}
