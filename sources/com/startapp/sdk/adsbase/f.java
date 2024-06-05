package com.startapp.sdk.adsbase;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.a3;
import com.startapp.g2;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.n7;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.z5;

/* compiled from: Sta */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f17017a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ComponentLocator f17018b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f17019c;

    public f(StartAppSDKInternal startAppSDKInternal, Context context, ComponentLocator componentLocator, e eVar) {
        this.f17017a = context;
        this.f17018b = componentLocator;
        this.f17019c = eVar;
    }

    public void run() {
        a3 m10;
        Boolean bool;
        z5.a aVar;
        try {
            n7 n7Var = new n7(this.f17017a);
            n7Var.a(this.f17017a, new AdPreferences());
            m10 = this.f17018b.m();
            StringBuilder sb2 = new StringBuilder();
            MetaData metaData = MetaData.f17070k;
            String str = metaData.trackDownloadHost;
            if (str == null) {
                str = metaData.d();
            }
            sb2.append(str);
            sb2.append(AdsConstants.f16773c);
            bool = null;
            aVar = m10.a(sb2.toString(), n7Var, (g2<Throwable, Void>) null);
        } catch (Throwable th) {
            i3.a(th);
            return;
        }
        if (aVar != null) {
            String str2 = aVar.f17586b;
            if (!TextUtils.isEmpty(str2)) {
                String a10 = j9.a(str2, "@ct@", "@ct@");
                String a11 = j9.a(str2, "@tsc@", "@tsc@");
                String a12 = j9.a(str2, "@apc@", "@apc@");
                try {
                    Integer valueOf = !TextUtils.isEmpty(a10) ? Integer.valueOf(Integer.parseInt(a10)) : null;
                    Long valueOf2 = !TextUtils.isEmpty(a11) ? Long.valueOf(Long.parseLong(a11)) : null;
                    if (!TextUtils.isEmpty(a12)) {
                        bool = Boolean.valueOf(Boolean.parseBoolean(a12));
                    }
                    Boolean bool2 = bool;
                    if (!(valueOf == null && valueOf2 == null && bool2 == null)) {
                        this.f17018b.g().a(valueOf, valueOf2, bool2, false, true);
                    }
                } catch (Throwable th2) {
                    i3.a(th2);
                }
            }
        }
        e.a a13 = this.f17019c.edit();
        a13.a("shared_prefs_first_init", Boolean.FALSE);
        a13.f17013a.putBoolean("shared_prefs_first_init", false);
        a13.apply();
    }
}
