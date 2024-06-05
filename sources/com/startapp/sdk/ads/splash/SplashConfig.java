package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.AdError;
import com.startapp.d9;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.sdk.ads.splash.g;
import com.startapp.sdk.adsbase.a;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class SplashConfig implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Theme f16560c = Theme.OCEAN;

    /* renamed from: d  reason: collision with root package name */
    public static final MinSplashTime f16561d = MinSplashTime.REGULAR;

    /* renamed from: e  reason: collision with root package name */
    public static final long f16562e = 7500;

    /* renamed from: f  reason: collision with root package name */
    public static final MaxAdDisplayTime f16563f = MaxAdDisplayTime.FOR_EVER;

    /* renamed from: g  reason: collision with root package name */
    public static final Orientation f16564g = Orientation.AUTO;
    private static final long serialVersionUID = 995423687458599030L;

    /* renamed from: a  reason: collision with root package name */
    public transient Drawable f16565a = null;
    private String appName = MaxReward.DEFAULT_LABEL;

    /* renamed from: b  reason: collision with root package name */
    public transient String f16566b = MaxReward.DEFAULT_LABEL;
    private int customScreen = -1;
    @d9(type = MaxAdDisplayTime.class)
    private MaxAdDisplayTime defaultMaxAdDisplayTime = f16563f;
    private Long defaultMaxLoadTime = Long.valueOf(f16562e);
    @d9(type = MinSplashTime.class)
    private MinSplashTime defaultMinSplashTime = f16561d;
    @d9(type = Orientation.class)
    private Orientation defaultOrientation = f16564g;
    @d9(type = Theme.class)
    private Theme defaultTheme = f16560c;
    private boolean forceNative = false;
    private boolean htmlSplash = true;
    private byte[] logoByteArray = null;
    private int logoRes = -1;
    private String splashBgColor = "#066CAA";
    private String splashFontColor = "ffffff";
    private String splashLoadingType = "LoadingDots";

    /* renamed from: com.startapp.sdk.ads.splash.SplashConfig$1  reason: invalid class name */
    /* compiled from: Sta */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.startapp.sdk.ads.splash.SplashConfig$Theme[] r0 = com.startapp.sdk.ads.splash.SplashConfig.Theme.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme = r0
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.DEEP_BLUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.SKY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.ASHEN_SKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.BLAZE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.GLOOMY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.OCEAN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.startapp.sdk.ads.splash.SplashConfig$Theme r1 = com.startapp.sdk.ads.splash.SplashConfig.Theme.USER_DEFINED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.splash.SplashConfig.AnonymousClass1.<clinit>():void");
        }
    }

    /* compiled from: Sta */
    public enum MaxAdDisplayTime {
        SHORT(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS),
        LONG(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS),
        FOR_EVER(86400000);
        
        private long index;

        private MaxAdDisplayTime(long j10) {
            this.index = j10;
        }

        public static MaxAdDisplayTime getByIndex(long j10) {
            MaxAdDisplayTime maxAdDisplayTime = SHORT;
            MaxAdDisplayTime[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].getIndex() == j10) {
                    maxAdDisplayTime = values[i10];
                }
            }
            return maxAdDisplayTime;
        }

        public static MaxAdDisplayTime getByName(String str) {
            MaxAdDisplayTime maxAdDisplayTime = FOR_EVER;
            MaxAdDisplayTime[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    maxAdDisplayTime = values[i10];
                }
            }
            return maxAdDisplayTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    public enum MinSplashTime {
        REGULAR(3000),
        SHORT(AdError.SERVER_ERROR_CODE),
        LONG(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        
        private long index;

        private MinSplashTime(int i10) {
            this.index = (long) i10;
        }

        public static MinSplashTime getByIndex(long j10) {
            MinSplashTime minSplashTime = SHORT;
            MinSplashTime[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].getIndex() == j10) {
                    minSplashTime = values[i10];
                }
            }
            return minSplashTime;
        }

        public static MinSplashTime getByName(String str) {
            MinSplashTime minSplashTime = LONG;
            MinSplashTime[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    minSplashTime = values[i10];
                }
            }
            return minSplashTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    public enum Orientation {
        PORTRAIT(1),
        LANDSCAPE(2),
        AUTO(3);
        
        private int index;

        private Orientation(int i10) {
            this.index = i10;
        }

        public static Orientation getByIndex(int i10) {
            Orientation orientation = PORTRAIT;
            Orientation[] values = values();
            for (int i11 = 0; i11 < values.length; i11++) {
                if (values[i11].getIndex() == i10) {
                    orientation = values[i11];
                }
            }
            return orientation;
        }

        public static Orientation getByName(String str) {
            Orientation orientation = AUTO;
            Orientation[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    orientation = values[i10];
                }
            }
            return orientation;
        }

        public int getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    public enum Theme {
        DEEP_BLUE(1),
        SKY(2),
        ASHEN_SKY(3),
        BLAZE(4),
        GLOOMY(5),
        OCEAN(6),
        USER_DEFINED(0);
        
        private int index;

        private Theme(int i10) {
            this.index = i10;
        }

        public static Theme getByIndex(int i10) {
            Theme theme = DEEP_BLUE;
            Theme[] values = values();
            for (int i11 = 0; i11 < values.length; i11++) {
                if (values[i11].getIndex() == i10) {
                    theme = values[i11];
                }
            }
            return theme;
        }

        public static Theme getByName(String str) {
            Theme theme = DEEP_BLUE;
            Theme[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    theme = values[i10];
                }
            }
            return theme;
        }

        public int getIndex() {
            return this.index;
        }
    }

    public static SplashConfig getDefaultSplashConfig() {
        SplashConfig splashConfig = new SplashConfig();
        SplashConfig minSplashTime = splashConfig.setTheme(f16560c).setMinSplashTime(f16561d);
        minSplashTime.defaultMaxLoadTime = Long.valueOf(f16562e);
        minSplashTime.setMaxAdDisplayTime(f16563f).setOrientation(f16564g).setLoadingType("LoadingDots").setAppName(MaxReward.DEFAULT_LABEL);
        return splashConfig;
    }

    public Long a() {
        return this.defaultMaxLoadTime;
    }

    public boolean b() {
        return this.defaultTheme == Theme.USER_DEFINED || getCustomScreen() != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SplashConfig splashConfig = (SplashConfig) obj;
        if (this.forceNative == splashConfig.forceNative && this.customScreen == splashConfig.customScreen && this.logoRes == splashConfig.logoRes && this.htmlSplash == splashConfig.htmlSplash && j9.a(this.appName, splashConfig.appName) && Arrays.equals(this.logoByteArray, splashConfig.logoByteArray) && this.defaultTheme == splashConfig.defaultTheme && this.defaultMinSplashTime == splashConfig.defaultMinSplashTime && j9.a(this.defaultMaxLoadTime, splashConfig.defaultMaxLoadTime) && this.defaultMaxAdDisplayTime == splashConfig.defaultMaxAdDisplayTime && this.defaultOrientation == splashConfig.defaultOrientation && j9.a(this.splashBgColor, splashConfig.splashBgColor) && j9.a(this.splashFontColor, splashConfig.splashFontColor) && j9.a(this.splashLoadingType, splashConfig.splashLoadingType)) {
            return true;
        }
        return false;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getBgColor() {
        return this.splashBgColor;
    }

    public int getCustomScreen() {
        return this.customScreen;
    }

    public String getErrorMessage() {
        return this.f16566b;
    }

    public String getFontColor() {
        return this.splashFontColor;
    }

    public String getLoadingType() {
        return this.splashLoadingType;
    }

    public Drawable getLogo() {
        return this.f16565a;
    }

    public byte[] getLogoByteArray() {
        return this.logoByteArray;
    }

    public int getLogoRes() {
        return this.logoRes;
    }

    public MaxAdDisplayTime getMaxAdDisplayTime() {
        return this.defaultMaxAdDisplayTime;
    }

    public MinSplashTime getMinSplashTime() {
        return this.defaultMinSplashTime;
    }

    public Orientation getOrientation() {
        return this.defaultOrientation;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.forceNative), Integer.valueOf(this.customScreen), this.appName, Integer.valueOf(this.logoRes), this.defaultTheme, this.defaultMinSplashTime, this.defaultMaxLoadTime, this.defaultMaxAdDisplayTime, this.defaultOrientation, Boolean.valueOf(this.htmlSplash), this.splashBgColor, this.splashFontColor, this.splashLoadingType};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.hashCode(this.logoByteArray) + (Arrays.deepHashCode(objArr) * 31);
    }

    public boolean isHtmlSplash() {
        if (this.forceNative) {
            return false;
        }
        return this.htmlSplash;
    }

    public SplashConfig setAppName(String str) {
        this.appName = str;
        return this;
    }

    public SplashConfig setCustomScreen(int i10) {
        this.customScreen = i10;
        return this;
    }

    public void setDefaults(Context context) {
        ApplicationInfo applicationInfo;
        SplashConfig a10 = SplashMetaData.f16587a.a();
        if (a10 == null) {
            a10 = getDefaultSplashConfig();
        } else {
            this.htmlSplash = a10.isHtmlSplash();
        }
        SplashConfig defaultSplashConfig = getDefaultSplashConfig();
        if (a10.defaultTheme == null) {
            a10.setTheme(defaultSplashConfig.defaultTheme);
        }
        if (a10.getMinSplashTime() == null) {
            a10.setMinSplashTime(defaultSplashConfig.getMinSplashTime());
        }
        if (a10.defaultMaxLoadTime == null) {
            a10.defaultMaxLoadTime = Long.valueOf(defaultSplashConfig.defaultMaxLoadTime.longValue());
        }
        if (a10.getMaxAdDisplayTime() == null) {
            a10.setMaxAdDisplayTime(defaultSplashConfig.getMaxAdDisplayTime());
        }
        if (a10.getOrientation() == null) {
            a10.setOrientation(defaultSplashConfig.getOrientation());
        }
        if (a10.getLoadingType() == null) {
            a10.setLoadingType(defaultSplashConfig.getLoadingType());
        }
        if (a10.getAppName().equals(MaxReward.DEFAULT_LABEL)) {
            a10.setAppName(a.a(context, "Welcome!"));
        }
        if (getMaxAdDisplayTime() == null) {
            setMaxAdDisplayTime(a10.getMaxAdDisplayTime());
        }
        if (this.defaultMaxLoadTime == null) {
            this.defaultMaxLoadTime = Long.valueOf(a10.defaultMaxLoadTime.longValue());
        }
        if (getMinSplashTime() == null) {
            setMinSplashTime(a10.getMinSplashTime());
        }
        if (getOrientation() == null) {
            setOrientation(a10.getOrientation());
        }
        if (this.defaultTheme == null) {
            setTheme(a10.defaultTheme);
        }
        if (getLogoRes() == -1 && (applicationInfo = context.getApplicationInfo()) != null) {
            setLogo(applicationInfo.icon);
        }
        if (getAppName().equals(MaxReward.DEFAULT_LABEL)) {
            setAppName(a10.getAppName());
        }
    }

    public SplashConfig setLoadingType(String str) {
        this.splashLoadingType = str;
        return this;
    }

    public SplashConfig setLogo(int i10) {
        this.logoRes = i10;
        return this;
    }

    public SplashConfig setMaxAdDisplayTime(MaxAdDisplayTime maxAdDisplayTime) {
        this.defaultMaxAdDisplayTime = maxAdDisplayTime;
        return this;
    }

    public SplashConfig setMinSplashTime(MinSplashTime minSplashTime) {
        this.defaultMinSplashTime = minSplashTime;
        return this;
    }

    public SplashConfig setOrientation(Orientation orientation) {
        this.defaultOrientation = orientation;
        return this;
    }

    public SplashConfig setTheme(Theme theme) {
        this.defaultTheme = theme;
        return this;
    }

    public View a(Context context) {
        Theme theme = this.defaultTheme;
        if (theme == Theme.USER_DEFINED) {
            try {
                return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getCustomScreen(), (ViewGroup) null);
            } catch (Resources.NotFoundException e10) {
                Log.w("StartAppSDK", e10);
                return null;
            } catch (InflateException e11) {
                Log.w("StartAppSDK", e11);
                return null;
            } catch (Throwable th) {
                i3.a(th);
                return null;
            }
        } else {
            switch (g.a.f16616a[theme.ordinal()]) {
                case 1:
                    View a10 = g.a(context, this);
                    a10.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16356182, -15029533, -16356182}));
                    ((TextView) a10.findViewById(100)).setTextColor(Color.rgb(255, 255, 255));
                    ((TextView) a10.findViewById(105)).setTextColor(Color.rgb(208, 210, 210));
                    return a10;
                case 2:
                    View a11 = g.a(context, this);
                    int i10 = context.getResources().getDisplayMetrics().widthPixels;
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-921103, -6040347});
                    gradientDrawable.setGradientType(1);
                    gradientDrawable.setGradientRadius((float) (i10 / 2));
                    a11.setBackgroundDrawable(gradientDrawable);
                    ((TextView) a11.findViewById(100)).setTextColor(Color.rgb(51, 51, 51));
                    ((TextView) a11.findViewById(105)).setTextColor(Color.rgb(162, 172, 175));
                    return a11;
                case 3:
                    View a12 = g.a(context, this);
                    a12.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3881788, -1}));
                    ((TextView) a12.findViewById(100)).setTextColor(Color.rgb(51, 51, 51));
                    ((TextView) a12.findViewById(105)).setTextColor(Color.rgb(153, 153, 153));
                    return a12;
                case 4:
                    View a13 = g.a(context, this);
                    int i11 = context.getResources().getDisplayMetrics().widthPixels;
                    GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-92376, -40960});
                    gradientDrawable2.setGradientType(1);
                    gradientDrawable2.setGradientRadius((float) (i11 / 2));
                    a13.setBackgroundDrawable(gradientDrawable2);
                    ((TextView) a13.findViewById(100)).setTextColor(Color.rgb(255, 255, 255));
                    ((TextView) a13.findViewById(105)).setTextColor(Color.rgb(255, 198, 151));
                    return a13;
                case 5:
                    View a14 = g.a(context, this);
                    a14.setBackgroundColor(Color.rgb(47, 53, 63));
                    ((TextView) a14.findViewById(100)).setTextColor(Color.rgb(51, 181, 229));
                    ((TextView) a14.findViewById(105)).setTextColor(Color.rgb(122, 130, 139));
                    return a14;
                case 6:
                    View a15 = g.a(context, this);
                    a15.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-14451558, -7876130}));
                    ((TextView) a15.findViewById(100)).setTextColor(Color.rgb(6, 61, 82));
                    ((TextView) a15.findViewById(105)).setTextColor(Color.rgb(6, 61, 82));
                    return a15;
                default:
                    return null;
            }
        }
    }

    public SplashConfig setLogo(byte[] bArr) {
        this.logoByteArray = bArr;
        return this;
    }

    public boolean b(Context context) {
        if (AnonymousClass1.$SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[this.defaultTheme.ordinal()] != 7) {
            if (getAppName().equals(MaxReward.DEFAULT_LABEL)) {
                setAppName(a.a(context, "Welcome!"));
            }
            if (getLogo() == null && getLogoByteArray() == null) {
                try {
                    if (getLogoRes() == -1) {
                        setLogo(context.getApplicationInfo().icon);
                        this.f16565a = context.getResources().getDrawable(context.getApplicationInfo().icon);
                    } else {
                        this.f16565a = context.getResources().getDrawable(getLogoRes());
                    }
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
        } else if (getCustomScreen() == -1) {
            this.f16566b = "StartApp: Exception getting custom screen resource id, make sure it is set";
            return false;
        }
        return true;
    }

    public SplashHtml a(Activity activity) {
        String str = "#333333";
        String str2 = "#066CAA";
        switch (AnonymousClass1.$SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[this.defaultTheme.ordinal()]) {
            case 1:
                break;
            case 2:
                str2 = "#a3d4e5";
                break;
            case 3:
                str2 = "#E3E3E3";
                break;
            case 4:
                str2 = "#FF6600";
                break;
            case 5:
                str = "#33B5E5";
                str2 = "#2F353F";
                break;
            case 6:
                str = "#063D51";
                str2 = "#237C9A";
                break;
            default:
                str = "ffffff";
                break;
        }
        str = "#FFFFFF";
        this.splashBgColor = str2;
        this.splashFontColor = str;
        SplashHtml splashHtml = new SplashHtml(activity);
        splashHtml.a(this);
        splashHtml.d();
        return splashHtml;
    }
}
