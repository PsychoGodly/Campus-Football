package com.pichillilorenzo.flutter_inappwebview_android;

import android.os.Build;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import lc.j;
import lc.k;

public class PlatformUtil extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "PlatformUtil";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_platformutil";
    public InAppWebViewFlutterPlugin plugin;

    public PlatformUtil(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String formatDate(long j10, String str, Locale locale, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j10));
    }

    public static Locale getLocaleFromString(String str) {
        if (str == null) {
            return Locale.US;
        }
        String[] split = str.split("_");
        String str2 = split[0];
        int length = split.length;
        String str3 = MaxReward.DEFAULT_LABEL;
        String str4 = length > 1 ? split[1] : str3;
        if (split.length > 2) {
            str3 = split[2];
        }
        return new Locale(str2, str4, str3);
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        if (str.equals("formatDate")) {
            long longValue = ((Long) jVar.a("date")).longValue();
            String str2 = (String) jVar.a("format");
            Locale localeFromString = getLocaleFromString((String) jVar.a("locale"));
            String str3 = (String) jVar.a("timezone");
            if (str3 == null) {
                str3 = "UTC";
            }
            dVar.success(formatDate(longValue, str2, localeFromString, TimeZone.getTimeZone(str3)));
        } else if (!str.equals("getSystemVersion")) {
            dVar.notImplemented();
        } else {
            dVar.success(String.valueOf(Build.VERSION.SDK_INT));
        }
    }
}
