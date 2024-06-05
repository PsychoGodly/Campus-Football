package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import androidx.annotation.Keep;
import com.startapp.d9;
import com.startapp.h9;
import com.startapp.j9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class RscMetadata implements Serializable {
    private static final long serialVersionUID = -5424519918396264553L;
    private boolean enabled;
    private int ief;
    @d9(parser = ItemsParser.class, type = ArrayList.class, value = RscMetadataItem.class)
    private List<RscMetadataItem> items;
    private String triggers;

    @Keep
    /* compiled from: Sta */
    public static class ItemsParser extends h9<RscMetadataItem> {
        public ItemsParser() {
            super(RscMetadataItem.class);
        }
    }

    public int a() {
        return this.ief;
    }

    public List<RscMetadataItem> b() {
        return this.items;
    }

    public String c() {
        return this.triggers;
    }

    public boolean d() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RscMetadata rscMetadata = (RscMetadata) obj;
        if (this.enabled != rscMetadata.enabled || this.ief != rscMetadata.ief || !j9.a(this.triggers, rscMetadata.triggers) || !j9.a(this.items, rscMetadata.items)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.triggers, this.items, Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public int a(RscMetadataItem rscMetadataItem) {
        return rscMetadataItem.b() != null ? rscMetadataItem.b().intValue() : this.ief;
    }
}
