package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.util.Map;
import java.util.Objects;

public class InAppBrowserMenuItem {
    private Object icon;
    private String iconColor;

    /* renamed from: id  reason: collision with root package name */
    private int f28497id;
    private Integer order;
    private boolean showAsAction;
    private String title;

    public InAppBrowserMenuItem(int i10, String str, Integer num, Object obj, String str2, boolean z10) {
        this.f28497id = i10;
        this.title = str;
        this.order = num;
        this.icon = obj;
        this.iconColor = str2;
        this.showAsAction = z10;
    }

    public static InAppBrowserMenuItem fromMap(Map<String, Object> map) {
        AndroidResource androidResource;
        AndroidResource androidResource2 = null;
        if (map == null) {
            return null;
        }
        int intValue = ((Integer) map.get("id")).intValue();
        String str = (String) map.get("title");
        Integer num = (Integer) map.get("order");
        Object obj = map.get("icon");
        if (obj instanceof Map) {
            androidResource2 = AndroidResource.fromMap((Map) map.get("icon"));
        } else if (obj instanceof byte[]) {
            androidResource = obj;
            return new InAppBrowserMenuItem(intValue, str, num, androidResource, (String) map.get("iconColor"), ((Boolean) Util.getOrDefault(map, "showAsAction", Boolean.FALSE)).booleanValue());
        }
        androidResource = androidResource2;
        return new InAppBrowserMenuItem(intValue, str, num, androidResource, (String) map.get("iconColor"), ((Boolean) Util.getOrDefault(map, "showAsAction", Boolean.FALSE)).booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InAppBrowserMenuItem inAppBrowserMenuItem = (InAppBrowserMenuItem) obj;
        if (this.f28497id == inAppBrowserMenuItem.f28497id && this.showAsAction == inAppBrowserMenuItem.showAsAction && this.title.equals(inAppBrowserMenuItem.title) && Objects.equals(this.order, inAppBrowserMenuItem.order) && Objects.equals(this.icon, inAppBrowserMenuItem.icon)) {
            return Objects.equals(this.iconColor, inAppBrowserMenuItem.iconColor);
        }
        return false;
    }

    public Object getIcon() {
        return this.icon;
    }

    public String getIconColor() {
        return this.iconColor;
    }

    public int getId() {
        return this.f28497id;
    }

    public Integer getOrder() {
        return this.order;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.f28497id * 31) + this.title.hashCode()) * 31;
        Integer num = this.order;
        int i10 = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Object obj = this.icon;
        int hashCode3 = (hashCode2 + (obj != null ? obj.hashCode() : 0)) * 31;
        String str = this.iconColor;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((hashCode3 + i10) * 31) + (this.showAsAction ? 1 : 0);
    }

    public boolean isShowAsAction() {
        return this.showAsAction;
    }

    public void setIcon(Object obj) {
        this.icon = obj;
    }

    public void setIconColor(String str) {
        this.iconColor = str;
    }

    public void setId(int i10) {
        this.f28497id = i10;
    }

    public void setOrder(Integer num) {
        this.order = num;
    }

    public void setShowAsAction(boolean z10) {
        this.showAsAction = z10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "InAppBrowserMenuItem{id=" + this.f28497id + ", title='" + this.title + '\'' + ", order=" + this.order + ", icon=" + this.icon + ", iconColor='" + this.iconColor + '\'' + ", showAsAction=" + this.showAsAction + '}';
    }
}
