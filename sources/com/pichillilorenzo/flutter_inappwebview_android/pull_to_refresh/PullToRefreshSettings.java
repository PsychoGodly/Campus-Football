package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import java.util.HashMap;
import java.util.Map;

public class PullToRefreshSettings implements ISettings<PullToRefreshLayout> {
    public static final String LOG_TAG = "PullToRefreshSettings";
    public String backgroundColor;
    public String color;
    public Integer distanceToTriggerSync;
    public Boolean enabled = Boolean.TRUE;
    public Integer size;
    public Integer slingshotDistance;

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", this.enabled);
        hashMap.put("color", this.color);
        hashMap.put("backgroundColor", this.backgroundColor);
        hashMap.put("distanceToTriggerSync", this.distanceToTriggerSync);
        hashMap.put("slingshotDistance", this.slingshotDistance);
        hashMap.put("size", this.size);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(PullToRefreshLayout pullToRefreshLayout) {
        return toMap();
    }

    public PullToRefreshSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1878912765:
                        if (str.equals("distanceToTriggerSync")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1609594047:
                        if (str.equals("enabled")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 3530753:
                        if (str.equals("size")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 94842723:
                        if (str.equals("color")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1287124693:
                        if (str.equals("backgroundColor")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 1719097976:
                        if (str.equals("slingshotDistance")) {
                            c10 = 5;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.distanceToTriggerSync = (Integer) value;
                        break;
                    case 1:
                        this.enabled = (Boolean) value;
                        break;
                    case 2:
                        this.size = (Integer) value;
                        break;
                    case 3:
                        this.color = (String) value;
                        break;
                    case 4:
                        this.backgroundColor = (String) value;
                        break;
                    case 5:
                        this.slingshotDistance = (Integer) value;
                        break;
                }
            }
        }
        return this;
    }
}
