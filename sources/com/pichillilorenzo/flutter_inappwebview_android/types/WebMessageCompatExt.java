package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j1.l;
import j1.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class WebMessageCompatExt {
    private Object data;
    private List<WebMessagePortCompatExt> ports;
    private int type;

    public WebMessageCompatExt(Object obj, int i10, List<WebMessagePortCompatExt> list) {
        this.data = obj;
        this.type = i10;
        this.ports = list;
    }

    public static WebMessageCompatExt fromMap(Map<String, Object> map) {
        ArrayList arrayList = null;
        if (map == null) {
            return null;
        }
        Object obj = map.get(JsonStorageKeyNames.DATA_KEY);
        Integer num = (Integer) map.get("type");
        List<Map> list = (List) map.get("ports");
        if (list != null && !list.isEmpty()) {
            arrayList = new ArrayList();
            for (Map fromMap : list) {
                arrayList.add(WebMessagePortCompatExt.fromMap(fromMap));
            }
        }
        return new WebMessageCompatExt(obj, num.intValue(), arrayList);
    }

    public static WebMessageCompatExt fromMapWebMessageCompat(l lVar) {
        Object obj;
        if (!s.a("WEB_MESSAGE_ARRAY_BUFFER") || lVar.e() != 1) {
            obj = lVar.c();
        } else {
            obj = lVar.b();
        }
        return new WebMessageCompatExt(obj, lVar.e(), (List<WebMessagePortCompatExt>) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebMessageCompatExt webMessageCompatExt = (WebMessageCompatExt) obj;
        if (this.type == webMessageCompatExt.type && Objects.equals(this.data, webMessageCompatExt.data)) {
            return Objects.equals(this.ports, webMessageCompatExt.ports);
        }
        return false;
    }

    public Object getData() {
        return this.data;
    }

    public List<WebMessagePortCompatExt> getPorts() {
        return this.ports;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        Object obj = this.data;
        int i10 = 0;
        int hashCode = (((obj != null ? obj.hashCode() : 0) * 31) + this.type) * 31;
        List<WebMessagePortCompatExt> list = this.ports;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setPorts(List<WebMessagePortCompatExt> list) {
        this.ports = list;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(JsonStorageKeyNames.DATA_KEY, this.data);
        hashMap.put("type", Integer.valueOf(this.type));
        return hashMap;
    }

    public String toString() {
        return "WebMessageCompatExt{data=" + this.data + ", type=" + this.type + ", ports=" + this.ports + '}';
    }
}
