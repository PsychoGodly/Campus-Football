package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class v implements AppLovinCommunicatorSubscriber {

    /* renamed from: a  reason: collision with root package name */
    private final k f12642a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f12643b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashMap f12644c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final Set f12645d = Collections.synchronizedSet(new HashSet());

    class a extends LinkedHashMap {
        a() {
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public v(k kVar) {
        this.f12642a = kVar;
        if (StringUtils.isValidString(b())) {
            AppLovinCommunicator.getInstance(k.k()).subscribe((AppLovinCommunicatorSubscriber) this, "safedk_ad_info");
        }
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f12643b) {
            bundle = (Bundle) this.f12644c.get(str);
        }
        this.f12642a.L();
        if (t.a()) {
            t L = this.f12642a.L();
            L.a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    public void b(b bVar) {
        this.f12645d.remove(bVar);
    }

    public void c(String str) {
        this.f12642a.L();
        if (t.a()) {
            t L = this.f12642a.L();
            L.a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f12643b) {
                this.f12644c.remove(str);
            }
        }
    }

    public String getCommunicatorId() {
        return v.class.getSimpleName();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f12642a.L();
                if (t.a()) {
                    this.f12642a.L().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f12642a.L();
                if (t.a()) {
                    this.f12642a.L().k("AdReviewManager", "Received SafeDK ad info without private data");
                }
            } else if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f12642a.L();
                if (t.a()) {
                    this.f12642a.L().k("AdReviewManager", "Received SafeDK ad info without ad format");
                }
            } else {
                String string = bundle2.getString("id");
                if (TextUtils.isEmpty(string)) {
                    this.f12642a.L();
                    if (t.a()) {
                        this.f12642a.L().k("AdReviewManager", "Received SafeDK ad info without serve id");
                        return;
                    }
                    return;
                }
                synchronized (this.f12643b) {
                    this.f12642a.L();
                    if (t.a()) {
                        t L = this.f12642a.L();
                        L.a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f12644c.put(string, bundle);
                }
                String string2 = bundle.getString("ad_review_creative_id");
                this.f12642a.L();
                if (t.a()) {
                    t L2 = this.f12642a.L();
                    L2.a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
                }
                if (StringUtils.isValidString(string2) && !this.f12645d.isEmpty()) {
                    HashSet hashSet = new HashSet(this.f12645d);
                    this.f12642a.L();
                    if (t.a()) {
                        t L3 = this.f12642a.L();
                        L3.a("AdReviewManager", "Notifying listeners: " + this.f12645d);
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        this.f12642a.l0().a((xl) new kn(this.f12642a, "creativeIdGenerated", new b60(this, (b) it.next(), string, string2)), sm.b.OTHER);
                    }
                }
            }
        }
    }

    public static String b() {
        return b(MobileAdsBridge.versionMethodName);
    }

    private static String b(String str) {
        Class<?> cls;
        try {
            cls = Class.forName("com.applovin.quality.AppLovinQualityService");
        } catch (Throwable unused) {
            return MaxReward.DEFAULT_LABEL;
        }
        return (String) cls.getMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f12642a.L();
        if (t.a()) {
            t L = this.f12642a.L();
            L.a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public void a(b bVar) {
        this.f12645d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }
}
