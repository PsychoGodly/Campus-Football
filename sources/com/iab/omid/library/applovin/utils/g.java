package com.iab.omid.library.applovin.utils;

import android.text.TextUtils;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.a;

public class g {
    public static void a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(a aVar) {
        if (aVar.g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void c(a aVar) {
        if (aVar.j()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    private static void d(a aVar) {
        if (!aVar.j()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void e(a aVar) {
        if (!aVar.h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void f(a aVar) {
        if (!aVar.i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void g(a aVar) {
        if (aVar.getAdSessionStatePublisher().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void h(a aVar) {
        if (aVar.getAdSessionStatePublisher().d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    public static void a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void a(a aVar) {
        d(aVar);
        b(aVar);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(String str, int i10, String str2) {
        if (str.length() > i10) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
