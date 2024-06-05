package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import j1.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TracingSettings implements ISettings<k> {
    public static final String LOG_TAG = "TracingSettings";
    public List<Object> categories = new ArrayList();
    public Integer tracingMode;

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("categories", this.categories);
        hashMap.put("tracingMode", this.tracingMode);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(k kVar) {
        return toMap();
    }

    public TracingSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                if (str.equals("tracingMode")) {
                    this.tracingMode = (Integer) value;
                } else if (str.equals("categories")) {
                    this.categories = (List) value;
                }
            }
        }
        return this;
    }
}
