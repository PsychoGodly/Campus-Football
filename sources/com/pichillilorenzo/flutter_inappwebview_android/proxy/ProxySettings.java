package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import j1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxySettings implements ISettings<c> {
    List<String> bypassRules = new ArrayList();
    Boolean bypassSimpleHostnames = null;
    List<String> directs = new ArrayList();
    List<ProxyRuleExt> proxyRules = new ArrayList();
    Boolean removeImplicitRules = null;
    Boolean reverseBypassEnabled = Boolean.FALSE;

    public Map<String, Object> toMap() {
        ArrayList arrayList = new ArrayList();
        for (ProxyRuleExt map : this.proxyRules) {
            arrayList.add(map.toMap());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bypassRules", this.bypassRules);
        hashMap.put("directs", this.directs);
        hashMap.put("proxyRules", arrayList);
        hashMap.put("bypassSimpleHostnames", this.bypassSimpleHostnames);
        hashMap.put("removeImplicitRules", this.removeImplicitRules);
        hashMap.put("reverseBypassEnabled", this.reverseBypassEnabled);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(c cVar) {
        Map<String, Object> map = toMap();
        ArrayList arrayList = new ArrayList();
        for (c.b next : cVar.b()) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", next.b());
            hashMap.put("schemeFilter", next.a());
            arrayList.add(hashMap);
        }
        map.put("bypassRules", cVar.a());
        map.put("proxyRules", arrayList);
        map.put("reverseBypassEnabled", Boolean.valueOf(cVar.c()));
        return map;
    }

    public ProxySettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -2059288826:
                        if (str.equals("bypassSimpleHostnames")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1872895191:
                        if (str.equals("proxyRules")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1033831049:
                        if (str.equals("reverseBypassEnabled")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -940646418:
                        if (str.equals("removeImplicitRules")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1021951215:
                        if (str.equals("bypassRules")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 1670504874:
                        if (str.equals("directs")) {
                            c10 = 5;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.bypassSimpleHostnames = (Boolean) value;
                        break;
                    case 1:
                        this.proxyRules = new ArrayList();
                        for (Map fromMap : (List) value) {
                            ProxyRuleExt fromMap2 = ProxyRuleExt.fromMap(fromMap);
                            if (fromMap2 != null) {
                                this.proxyRules.add(fromMap2);
                            }
                        }
                        break;
                    case 2:
                        this.reverseBypassEnabled = (Boolean) value;
                        break;
                    case 3:
                        this.removeImplicitRules = (Boolean) value;
                        break;
                    case 4:
                        this.bypassRules = (List) value;
                        break;
                    case 5:
                        this.directs = (List) value;
                        break;
                }
            }
        }
        return this;
    }
}
