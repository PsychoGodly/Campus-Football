package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.startapp.f5;
import com.startapp.f6;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.m7;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Sta */
public abstract class HtmlAd extends Ad {

    /* renamed from: c  reason: collision with root package name */
    public static String f16783c = null;
    private static final long serialVersionUID = 1;
    private List<AppPresenceDetails> apps;
    private String[] closingUrl = {MaxReward.DEFAULT_LABEL};
    private Long delayCloseInterval;
    private Long delayImpressionInSeconds;
    private int height;
    private String htmlUuid = MaxReward.DEFAULT_LABEL;
    public boolean[] inAppBrowserEnabled = {true};
    private boolean isMraidAd = false;
    private int orientation = 0;
    private String[] packageNames = {MaxReward.DEFAULT_LABEL};
    private int rewardDuration = 0;
    private boolean rewardedHideTimer = false;
    private Boolean[] sendRedirectHops = null;
    public boolean[] smartRedirect = {false};
    private String[] trackingClickUrls = {MaxReward.DEFAULT_LABEL};
    public String[] trackingUrls = {MaxReward.DEFAULT_LABEL};
    private int width;

    public HtmlAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
        if (f16783c == null) {
            r();
        }
    }

    public void a(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public void b(String str) {
        Long l10 = null;
        for (String str2 : str.split(",")) {
            if (!str2.equals(MaxReward.DEFAULT_LABEL)) {
                try {
                    long parseLong = Long.parseLong(str2);
                    if (parseLong > 0 && (l10 == null || parseLong < l10.longValue())) {
                        l10 = Long.valueOf(parseLong);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (l10 != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l10.longValue()));
        }
    }

    public void c(String str) {
        if (Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*([\\\"\\'])mraid\\.js\\1[^>]*>\\s*</script>\\n*", 2).matcher(new StringBuffer(str)).find()) {
            if (Build.VERSION.SDK_INT < 11) {
                StringBuffer stringBuffer = new StringBuffer(str);
                String property = System.getProperty("line.separator");
                Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*([\\\"\\'])mraid\\.js\\1[^>]*>\\s*</script>\\n*", 2).matcher(stringBuffer);
                if (matcher.find()) {
                    stringBuffer.delete(matcher.start(), matcher.end());
                }
                Matcher matcher2 = Pattern.compile("<head[^>]*>", 2).matcher(stringBuffer);
                for (int i10 = 0; matcher2.find(i10); i10 = matcher2.end()) {
                    stringBuffer.insert(matcher2.end(), property + "<script>" + property + f5.a() + property + "</script>");
                }
                str = stringBuffer.toString();
            }
            this.isMraidAd = true;
        }
        if (MetaData.f17070k.V()) {
            try {
                str = m7.a(f6.a(), str);
            } catch (Throwable th) {
                i3.a(th);
            }
        }
        Map<Activity, Integer> map = j9.f15982a;
        d dVar = d.f16928h;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        dVar.f16930b.put(uuid, str);
        this.htmlUuid = uuid;
        String a10 = j9.a(str, "@smartRedirect@", "@smartRedirect@");
        if (a10 != null) {
            String[] split = a10.split(",");
            this.smartRedirect = new boolean[split.length];
            for (int i11 = 0; i11 < split.length; i11++) {
                if (split[i11].compareTo("true") == 0) {
                    this.smartRedirect[i11] = true;
                } else {
                    this.smartRedirect[i11] = false;
                }
            }
        }
        String a11 = j9.a(str, "@trackingClickUrl@", "@trackingClickUrl@");
        if (a11 != null) {
            this.trackingClickUrls = a11.split(",");
        }
        String a12 = j9.a(str, "@closeUrl@", "@closeUrl@");
        if (a12 != null) {
            this.closingUrl = a12.split(",");
        }
        String a13 = j9.a(str, "@tracking@", "@tracking@");
        if (a13 != null) {
            this.trackingUrls = a13.split(",");
        }
        String a14 = j9.a(str, "@packageName@", "@packageName@");
        if (a14 != null) {
            this.packageNames = a14.split(",");
        }
        String a15 = j9.a(str, "@startappBrowserEnabled@", "@startappBrowserEnabled@");
        if (a15 != null) {
            String[] split2 = a15.split(",");
            this.inAppBrowserEnabled = new boolean[split2.length];
            for (int i12 = 0; i12 < split2.length; i12++) {
                if (split2[i12].compareTo("false") == 0) {
                    this.inAppBrowserEnabled[i12] = false;
                } else {
                    this.inAppBrowserEnabled[i12] = true;
                }
            }
        }
        String a16 = j9.a(str, "@orientation@", "@orientation@");
        if (a16 != null) {
            Map<Activity, Integer> map2 = j9.f15982a;
            a(SplashConfig.Orientation.getByName(a16));
        }
        String a17 = j9.a(str, "@adInfoEnable@", "@adInfoEnable@");
        if (a17 != null) {
            getAdInfoOverride().a(Boolean.parseBoolean(a17));
        }
        String a18 = j9.a(str, "@adInfoPosition@", "@adInfoPosition@");
        if (a18 != null) {
            getAdInfoOverride().a(AdInformationPositions.Position.getByName(a18));
        }
        String a19 = j9.a(str, "@ttl@", "@ttl@");
        if (a19 != null) {
            b(a19);
        }
        String a20 = j9.a(str, "@belowMinCPM@", "@belowMinCPM@");
        if (a20 != null) {
            if (Arrays.asList(a20.split(",")).contains("false")) {
                this.belowMinCPM = false;
            } else {
                this.belowMinCPM = true;
            }
        }
        String a21 = j9.a(str, "@delayCloseInterval@", "@delayCloseInterval@");
        if (a21 != null && a21.length() > 0) {
            try {
                this.delayCloseInterval = Long.valueOf(Long.parseLong(a21));
            } catch (NumberFormatException unused) {
            }
        }
        String a22 = j9.a(str, "@delayImpressionInSeconds@", "@delayImpressionInSeconds@");
        if (a22 != null && a22.length() > 0) {
            try {
                this.delayImpressionInSeconds = Long.valueOf(Long.parseLong(a22));
            } catch (NumberFormatException unused2) {
            }
        }
        String a23 = j9.a(str, "@rewardDuration@", "@rewardDuration@");
        if (a23 != null) {
            try {
                this.rewardDuration = Integer.parseInt(a23);
            } catch (Throwable th2) {
                i3.a(th2);
            }
        }
        String a24 = j9.a(str, "@rewardedHideTimer@", "@rewardedHideTimer@");
        if (a24 != null) {
            try {
                this.rewardedHideTimer = Boolean.parseBoolean(a24);
            } catch (Throwable th3) {
                i3.a(th3);
            }
        }
        String a25 = j9.a(str, "@sendRedirectHops@", "@sendRedirectHops@");
        if (a25 != null && !a25.equals(MaxReward.DEFAULT_LABEL)) {
            String[] split3 = a25.split(",");
            this.sendRedirectHops = new Boolean[split3.length];
            for (int i13 = 0; i13 < split3.length; i13++) {
                if (split3[i13].compareTo("true") == 0) {
                    this.sendRedirectHops[i13] = Boolean.TRUE;
                } else if (split3[i13].compareTo("false") == 0) {
                    this.sendRedirectHops[i13] = Boolean.FALSE;
                } else {
                    this.sendRedirectHops[i13] = null;
                }
            }
        }
        ConsentData consentData = new ConsentData();
        this.consentData = consentData;
        consentData.b(j9.a(str, "@infoDparam@", "@infoDparam@"));
        this.consentData.c(j9.a(str, "@infoImpUrl@", "@infoImpUrl@"));
        this.consentData.a(j9.a(str, "@infoClickUrl@", "@infoClickUrl@"));
        try {
            String a26 = j9.a(str, "@ct@", "@ct@");
            if (!TextUtils.isEmpty(a26)) {
                this.consentData.a(Integer.valueOf(Integer.parseInt(a26)));
            }
        } catch (Throwable th4) {
            i3.a(th4);
        }
        try {
            String a27 = j9.a(str, "@tsc@", "@tsc@");
            if (!TextUtils.isEmpty(a27)) {
                this.consentData.a(Long.valueOf(Long.parseLong(a27)));
            }
        } catch (Throwable th5) {
            i3.a(th5);
        }
        try {
            String a28 = j9.a(str, "@apc@", "@apc@");
            if (!TextUtils.isEmpty(a28)) {
                this.consentData.a(Boolean.valueOf(Boolean.parseBoolean(a28)));
            }
        } catch (Throwable th6) {
            i3.a(th6);
        }
        int length = this.smartRedirect.length;
        String[] strArr = this.trackingUrls;
        if (length < strArr.length) {
            boolean[] zArr = new boolean[strArr.length];
            int i14 = 0;
            while (true) {
                boolean[] zArr2 = this.smartRedirect;
                if (i14 >= zArr2.length) {
                    break;
                }
                zArr[i14] = zArr2[i14];
                i14++;
            }
            while (i14 < this.trackingUrls.length) {
                zArr[i14] = false;
                i14++;
            }
            this.smartRedirect = zArr;
        }
    }

    public String[] g() {
        return this.closingUrl;
    }

    public String getAdId() {
        return j9.a(k(), "@adId@", "@adId@");
    }

    public String getBidToken() {
        return j9.a(k(), "@bidToken@", "@bidToken@");
    }

    public String getDParam() {
        String[] strArr = this.trackingClickUrls;
        String[] strArr2 = this.trackingUrls;
        String str = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            str = strArr2[0];
        }
        return a.a(str2, str);
    }

    public Long h() {
        return this.delayCloseInterval;
    }

    public Long i() {
        return this.delayImpressionInSeconds;
    }

    public int j() {
        return this.height;
    }

    public String k() {
        d dVar = d.f16928h;
        return dVar.f16930b.get(this.htmlUuid);
    }

    public String l() {
        return this.htmlUuid;
    }

    public int m() {
        return this.orientation;
    }

    public String[] n() {
        return this.packageNames;
    }

    public int o() {
        return this.rewardDuration;
    }

    public String[] p() {
        return this.trackingClickUrls;
    }

    public int q() {
        return this.width;
    }

    public final void r() {
        f16783c = j9.a(getContext());
    }

    public boolean s() {
        return this.isMraidAd;
    }

    public boolean t() {
        return this.rewardedHideTimer;
    }

    public Boolean[] u() {
        return this.sendRedirectHops;
    }

    public void a(SplashConfig.Orientation orientation2) {
        this.orientation = 0;
        Map<Activity, Integer> map = j9.f15982a;
        if (orientation2 == null) {
            return;
        }
        if (orientation2.equals(SplashConfig.Orientation.PORTRAIT)) {
            this.orientation = 1;
        } else if (orientation2.equals(SplashConfig.Orientation.LANDSCAPE)) {
            this.orientation = 2;
        }
    }

    public Boolean b(int i10) {
        Boolean[] boolArr = this.sendRedirectHops;
        if (boolArr == null || i10 < 0 || i10 >= boolArr.length) {
            return null;
        }
        return boolArr[i10];
    }

    public boolean a(int i10) {
        boolean[] zArr = this.inAppBrowserEnabled;
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return true;
        }
        return zArr[i10];
    }

    public void a(List<AppPresenceDetails> list) {
        this.apps = list;
    }
}
