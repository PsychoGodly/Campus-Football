package com.applovin.impl;

import com.applovin.impl.z4;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Collections;

public final class lf extends bk {

    /* renamed from: o  reason: collision with root package name */
    private final yg f9217o = new yg();

    public lf() {
        super("Mp4WebvttDecoder");
    }

    /* access modifiers changed from: protected */
    public kl a(byte[] bArr, int i10, boolean z10) {
        this.f9217o.a(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f9217o.a() > 0) {
            if (this.f9217o.a() >= 8) {
                int j10 = this.f9217o.j();
                if (this.f9217o.j() == 1987343459) {
                    arrayList.add(a(this.f9217o, j10 - 8));
                } else {
                    this.f9217o.g(j10 - 8);
                }
            } else {
                throw new ml("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new mf(arrayList);
    }

    private static z4 a(yg ygVar, int i10) {
        CharSequence charSequence = null;
        z4.b bVar = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int j10 = ygVar.j();
                int j11 = ygVar.j();
                int i11 = j10 - 8;
                String a10 = yp.a(ygVar.c(), ygVar.d(), i11);
                ygVar.g(i11);
                i10 = (i10 - 8) - i11;
                if (j11 == 1937011815) {
                    bVar = yr.c(a10);
                } else if (j11 == 1885436268) {
                    charSequence = yr.a((String) null, a10.trim(), Collections.emptyList());
                }
            } else {
                throw new ml("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = MaxReward.DEFAULT_LABEL;
        }
        if (bVar != null) {
            return bVar.a(charSequence).a();
        }
        return yr.a(charSequence);
    }
}
