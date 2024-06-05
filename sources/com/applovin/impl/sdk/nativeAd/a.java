package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.xl;
import java.io.File;
import java.util.Collections;

public class a extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final s2 f11850h = new s2();

    /* renamed from: i  reason: collision with root package name */
    private final AppLovinNativeAdImpl f11851i;

    /* renamed from: j  reason: collision with root package name */
    private final C0138a f11852j;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a  reason: collision with other inner class name */
    public interface C0138a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, C0138a aVar) {
        super("TaskCacheNativeAd", kVar);
        this.f11851i = appLovinNativeAdImpl;
        this.f11852j = aVar;
    }

    private Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Attempting to cache resource: " + uri);
        }
        String a10 = this.f13421a.D().a(a(), uri.toString(), this.f11851i.getCachePrefix(), Collections.emptyList(), false, false, this.f11850h);
        if (StringUtils.isValidString(a10)) {
            File a11 = this.f13421a.D().a(a10, a());
            if (a11 != null) {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile != null) {
                    return fromFile;
                }
                if (t.a()) {
                    this.f13423c.b(this.f13422b, "Unable to extract Uri from image file");
                }
            } else if (t.a()) {
                t tVar2 = this.f13423c;
                String str2 = this.f13422b;
                tVar2.b(str2, "Unable to retrieve File from cached image filename = " + a10);
            }
        }
        return null;
    }

    public void run() {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Begin caching ad #" + this.f11851i.getAdIdNumber() + "...");
        }
        Uri a10 = a(this.f11851i.getIconUri());
        if (a10 != null) {
            this.f11851i.setIconUri(a10);
        }
        Uri a11 = a(this.f11851i.getMainImageUri());
        if (a11 != null) {
            this.f11851i.setMainImageUri(a11);
        }
        Uri a12 = a(this.f11851i.getPrivacyIconUri());
        if (a12 != null) {
            this.f11851i.setPrivacyIconUri(a12);
        }
        if (t.a()) {
            t tVar2 = this.f13423c;
            String str2 = this.f13422b;
            tVar2.a(str2, "Finished caching ad #" + this.f11851i.getAdIdNumber());
        }
        this.f11852j.a(this.f11851i);
    }
}
