package com.google.android.gms.ads.internal.client;

import java.util.Comparator;
import java.util.List;
import n4.x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class x4 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ x4 f14604a = new x4();

    private /* synthetic */ x4() {
    }

    public final int compare(Object obj, Object obj2) {
        List list = x.f20960e;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
