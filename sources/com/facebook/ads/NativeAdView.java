package com.facebook.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

@Keep
public class NativeAdView {

    @Keep
    @Deprecated
    public enum Type {
        HEIGHT_300(2),
        HEIGHT_400(3);
        
        private final int mEnumCode;
        private NativeAdViewTypeApi mNativeAdViewTypeApi;

        @Deprecated
        private Type(int i10) {
            this.mEnumCode = i10;
        }

        private NativeAdViewTypeApi getNativeAdViewTypeApi(int i10) {
            if (this.mNativeAdViewTypeApi == null) {
                this.mNativeAdViewTypeApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewTypeApi(i10);
            }
            return this.mNativeAdViewTypeApi;
        }

        public int getEnumCode() {
            return this.mEnumCode;
        }

        @Deprecated
        public int getHeight() {
            return getNativeAdViewTypeApi(this.mEnumCode).getHeight();
        }

        @Deprecated
        public int getValue() {
            return getNativeAdViewTypeApi(this.mEnumCode).getValue();
        }

        @Deprecated
        public int getWidth() {
            return getNativeAdViewTypeApi(this.mEnumCode).getWidth();
        }
    }

    public static View render(Context context, NativeAd nativeAd) {
        Preconditions.checkNotNull(context, "context must be not null");
        Preconditions.checkNotNull(nativeAd, "nativeAd must be not null");
        return DynamicLoaderFactory.makeLoader(context).createNativeAdViewApi().render(context, nativeAd);
    }

    public static View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        Preconditions.checkNotNull(context, "context must be not null");
        Preconditions.checkNotNull(nativeAd, "nativeAd must be not null");
        return DynamicLoaderFactory.makeLoader(context).createNativeAdViewApi().render(context, nativeAd, nativeAdViewAttributes);
    }

    @Deprecated
    public static View render(Context context, NativeAd nativeAd, Type type) {
        Preconditions.checkNotNull(context, "context must be not null");
        Preconditions.checkNotNull(nativeAd, "nativeAd must be not null");
        return DynamicLoaderFactory.makeLoader(context).createNativeAdViewApi().render(context, nativeAd, type);
    }

    @Deprecated
    public static View render(Context context, NativeAd nativeAd, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        Preconditions.checkNotNull(context, "context must be not null");
        Preconditions.checkNotNull(nativeAd, "nativeAd must be not null");
        Preconditions.checkNotNull(type, "type must be not null");
        return DynamicLoaderFactory.makeLoader(context).createNativeAdViewApi().render(context, nativeAd, type, nativeAdViewAttributes);
    }
}
