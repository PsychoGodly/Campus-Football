package com.h2.dynamic_app;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.b;
import com.houssamelouafi.campusfootball.pro.R;
import io.flutter.plugins.googlemobileads.h0;
import java.util.Map;

/* compiled from: NativeAdmobFactory */
public class a implements h0.c {

    /* renamed from: a  reason: collision with root package name */
    private final LayoutInflater f27346a;

    a(LayoutInflater layoutInflater) {
        this.f27346a = layoutInflater;
    }

    public NativeAdView a(b bVar, Map<String, Object> map) {
        NativeAdView nativeAdView = (NativeAdView) this.f27346a.inflate(R.layout.native_ad, (ViewGroup) null);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.ad_media);
        TextView textView = (TextView) nativeAdView.findViewById(R.id.ad_headline);
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.ad_advertiser);
        TextView textView3 = (TextView) nativeAdView.findViewById(R.id.ad_body);
        TextView textView4 = (TextView) nativeAdView.findViewById(R.id.ad_price);
        TextView textView5 = (TextView) nativeAdView.findViewById(R.id.ad_store);
        TextView textView6 = (TextView) nativeAdView.findViewById(R.id.ad_attribution);
        RatingBar ratingBar = (RatingBar) nativeAdView.findViewById(R.id.ad_stars);
        Button button = (Button) nativeAdView.findViewById(R.id.ad_call_to_action);
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.ad_icon);
        nativeAdView.setMediaView(mediaView);
        nativeAdView.setHeadlineView(textView);
        nativeAdView.setBodyView(textView3);
        nativeAdView.setCallToActionView(button);
        nativeAdView.setIconView(imageView);
        nativeAdView.setPriceView(textView4);
        nativeAdView.setStarRatingView(ratingBar);
        nativeAdView.setStoreView(textView5);
        nativeAdView.setAdvertiserView(textView2);
        if (bVar.getMediaContent() != null) {
            mediaView.setMediaContent(bVar.getMediaContent());
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            mediaView.setVisibility(0);
        } else {
            mediaView.setVisibility(4);
        }
        textView.setText(bVar.getHeadline());
        textView3.setText(bVar.getBody());
        button.setText(bVar.getCallToAction());
        button.setText(bVar.getCallToAction());
        if (bVar.getIcon() != null) {
            imageView.setImageDrawable(bVar.getIcon().getDrawable());
        } else {
            imageView.setVisibility(4);
        }
        if (bVar.getPrice() != null) {
            textView4.setText(bVar.getPrice());
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(4);
        }
        if (bVar.getStore() == null) {
            textView5.setVisibility(4);
        } else {
            textView5.setVisibility(0);
            textView5.setText(bVar.getStore());
        }
        if (bVar.getStarRating() == null) {
            ratingBar.setVisibility(4);
        } else {
            ratingBar.setVisibility(0);
            ratingBar.setRating(bVar.getStarRating().floatValue());
        }
        if (bVar.getAdvertiser() == null) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
            textView2.setText(bVar.getAdvertiser());
        }
        nativeAdView.setNativeAd(bVar);
        return nativeAdView;
    }
}
