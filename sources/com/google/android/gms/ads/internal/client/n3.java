package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbza;
import o5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class n3 extends ContentProvider {
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Bundle bundle = null;
        try {
            bundle = c.a(context).c(context.getPackageName(), 128).metaData;
        } catch (NullPointerException e10) {
            zzbza.zzh("Failed to load metadata: Null pointer exception.", e10);
        } catch (PackageManager.NameNotFoundException e11) {
            zzbza.zzh("Failed to load metadata: Package name not found.", e11);
        }
        zzbmy zza = zzbmy.zza();
        if (bundle == null) {
            zzbza.zzg("Metadata was null.");
        } else {
            try {
                String str = (String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                    try {
                        String str2 = (String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                        if (str != null) {
                            if (str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                zzbza.zze("Publisher provided Google AdMob App ID in manifest: ".concat(str));
                                if (bool == null || !bool.booleanValue()) {
                                    zza.zzb(context, str);
                                }
                            } else {
                                throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                        } else if (!TextUtils.isEmpty(str2)) {
                            zzbza.zze("The Google Mobile Ads SDK is integrated by ".concat(String.valueOf(str2)));
                        } else {
                            throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                        }
                    } catch (ClassCastException e12) {
                        throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e12);
                    }
                } catch (ClassCastException e13) {
                    throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e13);
                }
            } catch (ClassCastException e14) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e14);
            }
        }
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z11 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if (z10) {
                zzbza.zze("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if (z11) {
                zzbza.zze("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
