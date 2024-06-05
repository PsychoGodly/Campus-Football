package com.applovin.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class zr extends bk {

    /* renamed from: o  reason: collision with root package name */
    private final yg f13972o = new yg();

    /* renamed from: p  reason: collision with root package name */
    private final vr f13973p = new vr();

    public zr() {
        super("WebvttDecoder");
    }

    private static void b(yg ygVar) {
        do {
        } while (!TextUtils.isEmpty(ygVar.l()));
    }

    /* access modifiers changed from: protected */
    public kl a(byte[] bArr, int i10, boolean z10) {
        xr a10;
        this.f13972o.a(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            as.b(this.f13972o);
            do {
            } while (!TextUtils.isEmpty(this.f13972o.l()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int a11 = a(this.f13972o);
                if (a11 == 0) {
                    return new bs(arrayList2);
                }
                if (a11 == 1) {
                    b(this.f13972o);
                } else if (a11 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f13972o.l();
                        arrayList.addAll(this.f13973p.c(this.f13972o));
                    } else {
                        throw new ml("A style block was found after the first cue.");
                    }
                } else if (a11 == 3 && (a10 = yr.a(this.f13972o, (List) arrayList)) != null) {
                    arrayList2.add(a10);
                }
            }
        } catch (ah e10) {
            throw new ml((Throwable) e10);
        }
    }

    private static int a(yg ygVar) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = ygVar.d();
            String l10 = ygVar.l();
            if (l10 == null) {
                i10 = 0;
            } else if ("STYLE".equals(l10)) {
                i10 = 2;
            } else {
                i10 = l10.startsWith("NOTE") ? 1 : 3;
            }
        }
        ygVar.f(i11);
        return i10;
    }
}
