package com.applovin.impl;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.fe;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.sdk.R;

public class xf extends yb {

    /* renamed from: n  reason: collision with root package name */
    private final fe f13322n;

    /* renamed from: o  reason: collision with root package name */
    private final Context f13323o;

    public xf(fe feVar, Context context) {
        super(yb.c.DETAIL);
        this.f13322n = feVar;
        this.f13323o = context;
        this.f13563c = t();
        this.f13564d = s();
    }

    private SpannedString q() {
        if (!this.f13322n.y()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
        }
        if (TextUtils.isEmpty(this.f13322n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f13322n.c(), -16777216));
        if (this.f13322n.z()) {
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f13322n.k(), -16777216));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(u());
        spannableStringBuilder.append(new SpannableString("\n"));
        spannableStringBuilder.append(q());
        if (this.f13322n.q() == fe.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append(new SpannableString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        return StringUtils.createSpannedString(this.f13322n.g(), o() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString u() {
        if (!this.f13322n.C()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
        }
        if (StringUtils.isValidString(this.f13322n.p())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f13322n.p(), -16777216));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString(this.f13322n.y() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
    }

    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    public int e() {
        return r3.a(R.color.applovin_sdk_disclosureButtonColor, this.f13323o);
    }

    public int h() {
        int h10 = this.f13322n.h();
        return h10 > 0 ? h10 : R.drawable.applovin_ic_mediation_placeholder;
    }

    public boolean o() {
        return this.f13322n.q() != fe.a.MISSING;
    }

    public fe r() {
        return this.f13322n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + this.f13563c + ", detailText=" + this.f13564d + ", network=" + this.f13322n + "}";
    }
}
