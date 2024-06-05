package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import java.util.HashMap;
import java.util.Map;

public class ContextMenuSettings implements ISettings<Object> {
    public static final String LOG_TAG = "ContextMenuOptions";
    public Boolean hideDefaultSystemContextMenuItems = Boolean.FALSE;

    public Map<String, Object> getRealSettings(Object obj) {
        return toMap();
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("hideDefaultSystemContextMenuItems", this.hideDefaultSystemContextMenuItems);
        return hashMap;
    }

    public ContextMenuSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                if (str.equals("hideDefaultSystemContextMenuItems")) {
                    this.hideDefaultSystemContextMenuItems = (Boolean) value;
                }
            }
        }
        return this;
    }
}
