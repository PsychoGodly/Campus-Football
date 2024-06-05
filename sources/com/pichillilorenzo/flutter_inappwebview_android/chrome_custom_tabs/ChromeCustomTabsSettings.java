package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Intent;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p.a;

public class ChromeCustomTabsSettings implements ISettings<ChromeCustomTabsActivity> {
    static final String LOG_TAG = "ChromeCustomTabsSettings";
    @Deprecated
    public Boolean addDefaultShareMenuItem;
    public List<String> additionalTrustedOrigins;
    public Boolean alwaysUseBrowserUI;
    public a displayMode;
    public Boolean enableUrlBarHiding;
    public List<AndroidResource> exitAnimations;
    public Boolean instantAppsEnabled;
    public Boolean isSingleInstance;
    public Boolean isTrustedWebActivity;
    public Boolean keepAliveEnabled;
    public String navigationBarColor;
    public String navigationBarDividerColor;
    public Boolean noHistory;
    public String packageName;
    public Integer screenOrientation;
    public String secondaryToolbarColor;
    public Integer shareState = 0;
    public Boolean showTitle = Boolean.TRUE;
    public List<AndroidResource> startAnimations;
    public String toolbarBackgroundColor;

    public ChromeCustomTabsSettings() {
        Boolean bool = Boolean.FALSE;
        this.enableUrlBarHiding = bool;
        this.instantAppsEnabled = bool;
        this.keepAliveEnabled = bool;
        this.isSingleInstance = bool;
        this.noHistory = bool;
        this.isTrustedWebActivity = bool;
        this.additionalTrustedOrigins = new ArrayList();
        this.displayMode = null;
        this.screenOrientation = 0;
        this.startAnimations = new ArrayList();
        this.exitAnimations = new ArrayList();
        this.alwaysUseBrowserUI = bool;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("addDefaultShareMenuItem", this.addDefaultShareMenuItem);
        hashMap.put("showTitle", this.showTitle);
        hashMap.put("toolbarBackgroundColor", this.toolbarBackgroundColor);
        hashMap.put("navigationBarColor", this.navigationBarColor);
        hashMap.put("navigationBarDividerColor", this.navigationBarDividerColor);
        hashMap.put("secondaryToolbarColor", this.secondaryToolbarColor);
        hashMap.put("enableUrlBarHiding", this.enableUrlBarHiding);
        hashMap.put("instantAppsEnabled", this.instantAppsEnabled);
        hashMap.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.packageName);
        hashMap.put("keepAliveEnabled", this.keepAliveEnabled);
        hashMap.put("isSingleInstance", this.isSingleInstance);
        hashMap.put("noHistory", this.noHistory);
        hashMap.put("isTrustedWebActivity", this.isTrustedWebActivity);
        hashMap.put("additionalTrustedOrigins", this.additionalTrustedOrigins);
        hashMap.put("screenOrientation", this.screenOrientation);
        hashMap.put("alwaysUseBrowserUI", this.alwaysUseBrowserUI);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(ChromeCustomTabsActivity chromeCustomTabsActivity) {
        Intent intent;
        Map<String, Object> map = toMap();
        if (!(chromeCustomTabsActivity == null || (intent = chromeCustomTabsActivity.getIntent()) == null)) {
            map.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, intent.getPackage());
            map.put("keepAliveEnabled", Boolean.valueOf(intent.hasExtra("android.support.customtabs.extra.KEEP_ALIVE")));
        }
        return map;
    }

    public ChromeCustomTabsSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -2112880751:
                        if (str.equals("addDefaultShareMenuItem")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -2080611471:
                        if (str.equals("startAnimations")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1913803429:
                        if (str.equals("showTitle")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1799055374:
                        if (str.equals("shareState")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -632275769:
                        if (str.equals("isSingleInstance")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -462720700:
                        if (str.equals("navigationBarColor")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -329366839:
                        if (str.equals("navigationBarDividerColor")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -227713574:
                        if (str.equals("toolbarBackgroundColor")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 137483238:
                        if (str.equals("enableUrlBarHiding")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case 227582404:
                        if (str.equals("screenOrientation")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case 317955373:
                        if (str.equals("exitAnimations")) {
                            c10 = 10;
                            break;
                        }
                        break;
                    case 378069052:
                        if (str.equals("secondaryToolbarColor")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 390710230:
                        if (str.equals("isTrustedWebActivity")) {
                            c10 = 12;
                            break;
                        }
                        break;
                    case 472764366:
                        if (str.equals("instantAppsEnabled")) {
                            c10 = 13;
                            break;
                        }
                        break;
                    case 908759025:
                        if (str.equals(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME)) {
                            c10 = 14;
                            break;
                        }
                        break;
                    case 1518510995:
                        if (str.equals("noHistory")) {
                            c10 = 15;
                            break;
                        }
                        break;
                    case 1578203421:
                        if (str.equals("additionalTrustedOrigins")) {
                            c10 = 16;
                            break;
                        }
                        break;
                    case 1603728804:
                        if (str.equals("alwaysUseBrowserUI")) {
                            c10 = 17;
                            break;
                        }
                        break;
                    case 1714132357:
                        if (str.equals("displayMode")) {
                            c10 = 18;
                            break;
                        }
                        break;
                    case 2126240217:
                        if (str.equals("keepAliveEnabled")) {
                            c10 = 19;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.addDefaultShareMenuItem = (Boolean) value;
                        break;
                    case 1:
                        for (Map map2 : (List) value) {
                            if (AndroidResource.fromMap(map2) != null) {
                                this.startAnimations.add(AndroidResource.fromMap(map2));
                            }
                        }
                        break;
                    case 2:
                        this.showTitle = (Boolean) value;
                        break;
                    case 3:
                        this.shareState = (Integer) value;
                        break;
                    case 4:
                        this.isSingleInstance = (Boolean) value;
                        break;
                    case 5:
                        this.navigationBarColor = (String) value;
                        break;
                    case 6:
                        this.navigationBarDividerColor = (String) value;
                        break;
                    case 7:
                        this.toolbarBackgroundColor = (String) value;
                        break;
                    case 8:
                        this.enableUrlBarHiding = (Boolean) value;
                        break;
                    case 9:
                        this.screenOrientation = (Integer) value;
                        break;
                    case 10:
                        for (Map map3 : (List) value) {
                            if (AndroidResource.fromMap(map3) != null) {
                                this.exitAnimations.add(AndroidResource.fromMap(map3));
                            }
                        }
                        break;
                    case 11:
                        this.secondaryToolbarColor = (String) value;
                        break;
                    case 12:
                        this.isTrustedWebActivity = (Boolean) value;
                        break;
                    case 13:
                        this.instantAppsEnabled = (Boolean) value;
                        break;
                    case 14:
                        this.packageName = (String) value;
                        break;
                    case 15:
                        this.noHistory = (Boolean) value;
                        break;
                    case 16:
                        this.additionalTrustedOrigins = (List) value;
                        break;
                    case 17:
                        this.alwaysUseBrowserUI = (Boolean) value;
                        break;
                    case 18:
                        Map map4 = (Map) value;
                        String str2 = (String) map4.get("type");
                        if (str2 != null) {
                            if (!str2.equals("IMMERSIVE_MODE")) {
                                if (str2.equals("DEFAULT_MODE")) {
                                    this.displayMode = new a.C0219a();
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                this.displayMode = new a.b(((Boolean) map4.get("isSticky")).booleanValue(), ((Integer) map4.get(AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE)).intValue());
                                break;
                            }
                        } else {
                            break;
                        }
                    case 19:
                        this.keepAliveEnabled = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }
}
