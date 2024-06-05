package com.startapp;

import android.content.Context;
import android.webkit.WebView;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import s9.a;
import s9.b;
import s9.d;
import s9.e;

/* compiled from: Sta */
public class r {
    public static boolean a(Context context) {
        try {
            if (e6.f15779a.f15765a) {
                return true;
            }
            e6.a(context);
            return true;
        } catch (Throwable th) {
            i3.a(th);
            return false;
        }
    }

    public static o b(WebView webView) {
        try {
            return a(webView);
        } catch (Throwable th) {
            i3.a(th);
            return null;
        }
    }

    public static o b(Context context, List<VerificationDetails> list, boolean z10) {
        try {
            return a(context, list, z10);
        } catch (Throwable th) {
            i3.a(th);
            return null;
        }
    }

    public static o a(WebView webView) {
        if (!a(webView.getContext())) {
            return null;
        }
        fc.a("Startio", "Name is null or empty");
        fc.a("4.10.12", "Version is null or empty");
        return a(new q(new i6("Startio", "4.10.12"), webView, (String) null, (List<v9>) null, (String) null, MaxReward.DEFAULT_LABEL, a.HTML), false, false);
    }

    public static a5 b(o oVar) {
        if (oVar == null) {
            return null;
        }
        try {
            return a5.a(oVar);
        } catch (Throwable th) {
            i3.a(th);
            return null;
        }
    }

    public static o a(Context context, List<VerificationDetails> list, boolean z10) {
        URL url;
        if (!a(context)) {
            return null;
        }
        String a10 = f6.a();
        ArrayList arrayList = new ArrayList(list.size());
        for (VerificationDetails next : list) {
            try {
                url = new URL(next.c());
            } catch (Throwable th) {
                i3.a(th);
                url = null;
            }
            if (url != null) {
                String a11 = next.a();
                String b10 = next.b();
                fc.a(a11, "VendorKey is null or empty");
                fc.a(b10, "VerificationParameters is null or empty");
                arrayList.add(new v9(a11, url, b10));
            }
        }
        fc.a("Startio", "Name is null or empty");
        fc.a("4.10.12", "Version is null or empty");
        i6 i6Var = new i6("Startio", "4.10.12");
        fc.a((Object) a10, "OM SDK JS script content is null");
        return a(new q(i6Var, (WebView) null, a10, arrayList, (String) null, MaxReward.DEFAULT_LABEL, a.NATIVE), z10, true);
    }

    public static o a(q qVar, boolean z10, boolean z11) {
        e eVar;
        b bVar = z10 ? b.VIDEO : z11 ? b.NATIVE_DISPLAY : b.HTML_DISPLAY;
        d dVar = d.VIEWABLE;
        e eVar2 = e.NATIVE;
        if (z10) {
            eVar = eVar2;
        } else {
            eVar = e.NONE;
        }
        if (bVar != b.DEFINED_BY_JAVASCRIPT) {
            p pVar = new p(bVar, dVar, eVar2, eVar, false);
            if (e6.f15779a.f15765a) {
                return new eb(pVar, qVar);
            }
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    public static l a(o oVar) {
        if (oVar == null) {
            return null;
        }
        try {
            return l.a(oVar);
        } catch (Throwable th) {
            i3.a(th);
            return null;
        }
    }
}
