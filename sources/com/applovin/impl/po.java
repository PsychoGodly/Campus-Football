package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.List;

public final class po implements m2 {

    /* renamed from: d  reason: collision with root package name */
    public static final m2.a f10687d = s10.f11277a;

    /* renamed from: a  reason: collision with root package name */
    public final int f10688a;

    /* renamed from: b  reason: collision with root package name */
    private final d9[] f10689b;

    /* renamed from: c  reason: collision with root package name */
    private int f10690c;

    public po(d9... d9VarArr) {
        a1.a(d9VarArr.length > 0);
        this.f10689b = d9VarArr;
        this.f10688a = d9VarArr.length;
        a();
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    private static int c(int i10) {
        return i10 | 16384;
    }

    public d9 a(int i10) {
        return this.f10689b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || po.class != obj.getClass()) {
            return false;
        }
        po poVar = (po) obj;
        if (this.f10688a != poVar.f10688a || !Arrays.equals(this.f10689b, poVar.f10689b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f10690c == 0) {
            this.f10690c = Arrays.hashCode(this.f10689b) + 527;
        }
        return this.f10690c;
    }

    public int a(d9 d9Var) {
        int i10 = 0;
        while (true) {
            d9[] d9VarArr = this.f10689b;
            if (i10 >= d9VarArr.length) {
                return -1;
            }
            if (d9Var == d9VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    private static String a(String str) {
        return (str == null || str.equals("und")) ? MaxReward.DEFAULT_LABEL : str;
    }

    private void a() {
        String a10 = a(this.f10689b[0].f7144c);
        int c10 = c(this.f10689b[0].f7146f);
        int i10 = 1;
        while (true) {
            d9[] d9VarArr = this.f10689b;
            if (i10 >= d9VarArr.length) {
                return;
            }
            if (!a10.equals(a(d9VarArr[i10].f7144c))) {
                d9[] d9VarArr2 = this.f10689b;
                a("languages", d9VarArr2[0].f7144c, d9VarArr2[i10].f7144c, i10);
                return;
            } else if (c10 != c(this.f10689b[i10].f7146f)) {
                a("role flags", Integer.toBinaryString(this.f10689b[0].f7146f), Integer.toBinaryString(this.f10689b[i10].f7146f), i10);
                return;
            } else {
                i10++;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ po a(Bundle bundle) {
        return new po((d9[]) n2.a(d9.I, (List) bundle.getParcelableArrayList(b(0)), (List) ab.h()).toArray(new d9[0]));
    }

    private static void a(String str, String str2, String str3, int i10) {
        kc.a("TrackGroup", MaxReward.DEFAULT_LABEL, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }
}
