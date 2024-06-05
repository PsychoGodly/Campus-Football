package com.startapp.sdk.ads.video;

import android.content.Context;
import android.util.Base64;
import com.startapp.f2;
import com.startapp.i3;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.j;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import com.unity3d.services.UnityAdsConstants;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

/* compiled from: Sta */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f16665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j.b f16666b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.a f16667c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f16668d;

    public e(h hVar, String str, j.b bVar, d.a aVar) {
        this.f16668d = hVar;
        this.f16665a = str;
        this.f16666b = bVar;
        this.f16667c = aVar;
    }

    public void run() {
        String str;
        h hVar = this.f16668d;
        Context context = hVar.f16675b;
        String str2 = this.f16665a;
        j.b bVar = this.f16666b;
        d.a aVar = this.f16667c;
        if (hVar.f16674a == null) {
            LinkedList<CachedVideoAd> linkedList = (LinkedList) f2.a(context, "CachedAds", LinkedList.class);
            hVar.f16674a = linkedList;
            if (linkedList == null) {
                hVar.f16674a = new LinkedList<>();
            }
            if (hVar.a(AdsCommonMetaData.f16770h.G().b())) {
                f2.b(context, "CachedAds", hVar.f16674a);
            }
        }
        try {
            URL url = new URL(str2);
            String str3 = url.getHost() + url.getPath().replace(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, "_");
            try {
                String substring = str3.substring(0, str3.lastIndexOf(46));
                str = Base64.encodeToString(MessageDigest.getInstance("MD5").digest(substring.getBytes()), 0).replaceAll("[^a-zA-Z0-9]+", "_") + str3.substring(str3.lastIndexOf(46));
            } catch (NoSuchAlgorithmException e10) {
                i3.a((Throwable) e10);
                str = str3;
            }
            new j(context, url, str, new f(hVar, bVar, new CachedVideoAd(str), context), new g(hVar, aVar)).a();
        } catch (MalformedURLException e11) {
            if (bVar != null) {
                bVar.a((String) null);
            }
            i3.a((Throwable) e11);
        }
    }
}
