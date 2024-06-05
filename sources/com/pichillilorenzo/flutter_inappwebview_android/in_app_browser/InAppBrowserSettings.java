package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.view.Menu;
import android.widget.ProgressBar;
import androidx.appcompat.app.a;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.HashMap;
import java.util.Map;

public class InAppBrowserSettings implements ISettings<InAppBrowserActivity> {
    public static final String LOG_TAG = "InAppBrowserSettings";
    public Boolean allowGoBackWithBackButton;
    public Boolean closeOnCannotGoBack;
    public Boolean hidden;
    public Boolean hideDefaultMenuItems;
    public Boolean hideProgressBar;
    public Boolean hideTitleBar;
    public Boolean hideToolbarTop;
    public Boolean hideUrlBar;
    public Boolean shouldCloseOnBackButtonPressed;
    public String toolbarTopBackgroundColor;
    public String toolbarTopFixedTitle;

    public InAppBrowserSettings() {
        Boolean bool = Boolean.FALSE;
        this.hidden = bool;
        this.hideToolbarTop = bool;
        this.hideUrlBar = bool;
        this.hideProgressBar = bool;
        this.hideTitleBar = bool;
        Boolean bool2 = Boolean.TRUE;
        this.closeOnCannotGoBack = bool2;
        this.allowGoBackWithBackButton = bool2;
        this.shouldCloseOnBackButtonPressed = bool;
        this.hideDefaultMenuItems = bool;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("hidden", this.hidden);
        hashMap.put("hideToolbarTop", this.hideToolbarTop);
        hashMap.put("toolbarTopBackgroundColor", this.toolbarTopBackgroundColor);
        hashMap.put("toolbarTopFixedTitle", this.toolbarTopFixedTitle);
        hashMap.put("hideUrlBar", this.hideUrlBar);
        hashMap.put("hideTitleBar", this.hideTitleBar);
        hashMap.put("closeOnCannotGoBack", this.closeOnCannotGoBack);
        hashMap.put("hideProgressBar", this.hideProgressBar);
        hashMap.put("allowGoBackWithBackButton", this.allowGoBackWithBackButton);
        hashMap.put("shouldCloseOnBackButtonPressed", this.shouldCloseOnBackButtonPressed);
        hashMap.put("hideDefaultMenuItems", this.hideDefaultMenuItems);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(InAppBrowserActivity inAppBrowserActivity) {
        Map<String, Object> map = toMap();
        map.put("hidden", Boolean.valueOf(inAppBrowserActivity.isHidden));
        a aVar = inAppBrowserActivity.actionBar;
        boolean z10 = false;
        map.put("hideToolbarTop", Boolean.valueOf(aVar == null || !aVar.m()));
        Menu menu = inAppBrowserActivity.menu;
        map.put("hideUrlBar", Boolean.valueOf(menu == null || !menu.findItem(R.id.menu_search).isVisible()));
        ProgressBar progressBar = inAppBrowserActivity.progressBar;
        if (progressBar == null || progressBar.getMax() == 0) {
            z10 = true;
        }
        map.put("hideProgressBar", Boolean.valueOf(z10));
        return map;
    }

    public InAppBrowserSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1307803139:
                        if (str.equals("hideTitleBar")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1217487446:
                        if (str.equals("hidden")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -842349289:
                        if (str.equals("allowGoBackWithBackButton")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -809085252:
                        if (str.equals("hideToolbarTop")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -299596350:
                        if (str.equals("hideDefaultMenuItems")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -118493506:
                        if (str.equals("toolbarTopFixedTitle")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 3851268:
                        if (str.equals("hideProgressBar")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 90270825:
                        if (str.equals("closeOnCannotGoBack")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 406250502:
                        if (str.equals("hideUrlBar")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case 2111633307:
                        if (str.equals("toolbarTopBackgroundColor")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case 2140270213:
                        if (str.equals("shouldCloseOnBackButtonPressed")) {
                            c10 = 10;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.hideTitleBar = (Boolean) value;
                        break;
                    case 1:
                        this.hidden = (Boolean) value;
                        break;
                    case 2:
                        this.allowGoBackWithBackButton = (Boolean) value;
                        break;
                    case 3:
                        this.hideToolbarTop = (Boolean) value;
                        break;
                    case 4:
                        this.hideDefaultMenuItems = (Boolean) value;
                        break;
                    case 5:
                        this.toolbarTopFixedTitle = (String) value;
                        break;
                    case 6:
                        this.hideProgressBar = (Boolean) value;
                        break;
                    case 7:
                        this.closeOnCannotGoBack = (Boolean) value;
                        break;
                    case 8:
                        this.hideUrlBar = (Boolean) value;
                        break;
                    case 9:
                        this.toolbarTopBackgroundColor = (String) value;
                        break;
                    case 10:
                        this.shouldCloseOnBackButtonPressed = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }
}
