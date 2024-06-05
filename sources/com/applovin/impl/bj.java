package com.applovin.impl;

import android.text.SpannedString;
import com.applovin.impl.yb;

public class bj extends yb {
    public bj(String str) {
        super(yb.c.SECTION);
        this.f13563c = new SpannedString(str);
    }

    public String toString() {
        return "SectionListItemViewModel{text=" + this.f13563c + "}";
    }
}
