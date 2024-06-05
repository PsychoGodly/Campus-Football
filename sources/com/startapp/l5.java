package com.startapp;

import java.util.Arrays;
import java.util.List;

/* compiled from: Sta */
public final class l5 {

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f16094c = Arrays.asList(new String[]{"portrait", "landscape", "none"});

    /* renamed from: a  reason: collision with root package name */
    public boolean f16095a;

    /* renamed from: b  reason: collision with root package name */
    public int f16096b;

    public l5() {
        this(true, 2);
    }

    public static int a(String str) {
        int indexOf = f16094c.indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    public l5(boolean z10, int i10) {
        this.f16095a = z10;
        this.f16096b = i10;
    }
}
