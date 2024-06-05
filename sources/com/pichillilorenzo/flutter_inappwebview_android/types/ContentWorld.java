package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

public class ContentWorld {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ContentWorld DEFAULT_CLIENT = new ContentWorld("defaultClient");
    public static final ContentWorld PAGE = new ContentWorld("page");
    private String name;

    private ContentWorld(String str) {
        this.name = str;
    }

    public static ContentWorld fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ContentWorld((String) map.get(MediationMetaData.KEY_NAME));
    }

    public static ContentWorld world(String str) {
        return new ContentWorld(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.name.equals(((ContentWorld) obj).name);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "ContentWorld{name='" + this.name + '\'' + '}';
    }
}
