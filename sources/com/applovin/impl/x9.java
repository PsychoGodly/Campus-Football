package com.applovin.impl;

import com.applovin.impl.we;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class x9 {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f13303c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f13304a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f13305b = -1;

    public boolean a() {
        return (this.f13304a == -1 || this.f13305b == -1) ? false : true;
    }

    public boolean a(we weVar) {
        for (int i10 = 0; i10 < weVar.c(); i10++) {
            we.b a10 = weVar.a(i10);
            if (a10 instanceof s3) {
                s3 s3Var = (s3) a10;
                if ("iTunSMPB".equals(s3Var.f11288c) && a(s3Var.f11289d)) {
                    return true;
                }
            } else if (a10 instanceof nb) {
                nb nbVar = (nb) a10;
                if ("com.apple.iTunes".equals(nbVar.f9963b) && "iTunSMPB".equals(nbVar.f9964c) && a(nbVar.f9965d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean a(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f13304a = i11;
        this.f13305b = i12;
        return true;
    }

    private boolean a(String str) {
        Matcher matcher = f13303c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) yp.a((Object) matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) yp.a((Object) matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f13304a = parseInt;
            this.f13305b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
