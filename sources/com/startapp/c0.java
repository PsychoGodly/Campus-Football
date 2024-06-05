package com.startapp;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15668a;

    /* renamed from: b  reason: collision with root package name */
    public final List<AppPresenceDetails> f15669b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f15670c = new a();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c0 c0Var = c0.this;
            c0Var.getClass();
            try {
                h3.a(c0Var.f15668a, c0Var.a(c0Var.f15669b), new TrackingParams().a("APP_PRESENCE"));
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }

    public c0(Context context, List<AppPresenceDetails> list) {
        this.f15669b = list;
        this.f15668a = context;
    }

    public void a() {
        ComponentLocator.a(this.f15668a).r().execute(this.f15670c);
    }

    public final List<String> a(List<AppPresenceDetails> list) {
        String c10;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (AppPresenceDetails next : list) {
            if (!next.e() && (c10 = next.c()) != null) {
                try {
                    str = Uri.parse(c10).getQueryParameter("d");
                } catch (Throwable th) {
                    i3.a(th);
                    str = null;
                }
                if (str != null) {
                    if (next.d()) {
                        arrayList2.add("d=" + str);
                    } else {
                        arrayList3.add("d=" + str);
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(com.startapp.sdk.adsbase.a.a((List<String>) arrayList2, "false", "true"));
        }
        if (!arrayList3.isEmpty()) {
            arrayList.addAll(com.startapp.sdk.adsbase.a.a((List<String>) arrayList3, "false", "false"));
        }
        return arrayList;
    }
}
