package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import n4.o;
import n4.p;
import n4.q;
import n4.s;
import n4.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class b {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static abstract class a {
        public abstract List<C0153b> getImages();

        public abstract CharSequence getText();
    }

    /* renamed from: com.google.android.gms.ads.nativead.b$b  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static abstract class C0153b {
        public abstract Drawable getDrawable();

        public abstract double getScale();

        public abstract Uri getUri();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public interface c {
        void onNativeAdLoaded(b bVar);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public interface d {
        void a(String str);

        void b();
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    @Deprecated
    public abstract void enableCustomClickGesture();

    public abstract a getAdChoicesInfo();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract Bundle getExtras();

    public abstract String getHeadline();

    public abstract C0153b getIcon();

    public abstract List<C0153b> getImages();

    public abstract o getMediaContent();

    public abstract List<q> getMuteThisAdReasons();

    public abstract String getPrice();

    public abstract y getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    @Deprecated
    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(q qVar);

    public abstract void performClick(Bundle bundle);

    @Deprecated
    public abstract void recordCustomClickGesture();

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);

    public abstract void setMuteThisAdListener(p pVar);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void setUnconfirmedClickListener(d dVar);

    /* access modifiers changed from: protected */
    public abstract Object zza();
}
