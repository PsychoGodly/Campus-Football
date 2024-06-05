package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes;
import java.util.HashMap;
import java.util.Map;

public class MediaSizeExt {
    private int heightMils;

    /* renamed from: id  reason: collision with root package name */
    private String f28498id;
    private String label;
    private int widthMils;

    public MediaSizeExt(String str, String str2, int i10, int i11) {
        this.f28498id = str;
        this.label = str2;
        this.widthMils = i10;
        this.heightMils = i11;
    }

    public static MediaSizeExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MediaSizeExt((String) map.get("id"), (String) map.get("label"), ((Integer) map.get("widthMils")).intValue(), ((Integer) map.get("heightMils")).intValue());
    }

    public static MediaSizeExt fromMediaSize(PrintAttributes.MediaSize mediaSize) {
        if (mediaSize == null) {
            return null;
        }
        return new MediaSizeExt(mediaSize.getId(), (String) null, mediaSize.getHeightMils(), mediaSize.getWidthMils());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaSizeExt mediaSizeExt = (MediaSizeExt) obj;
        if (this.widthMils != mediaSizeExt.widthMils || this.heightMils != mediaSizeExt.heightMils || !this.f28498id.equals(mediaSizeExt.f28498id)) {
            return false;
        }
        String str = this.label;
        String str2 = mediaSizeExt.label;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int getHeightMils() {
        return this.heightMils;
    }

    public String getId() {
        return this.f28498id;
    }

    public String getLabel() {
        return this.label;
    }

    public int getWidthMils() {
        return this.widthMils;
    }

    public int hashCode() {
        int hashCode = this.f28498id.hashCode() * 31;
        String str = this.label;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.widthMils) * 31) + this.heightMils;
    }

    public void setHeightMils(int i10) {
        this.heightMils = i10;
    }

    public void setId(String str) {
        this.f28498id = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setWidthMils(int i10) {
        this.widthMils = i10;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.f28498id);
        hashMap.put("label", this.label);
        hashMap.put("heightMils", Integer.valueOf(this.heightMils));
        hashMap.put("widthMils", Integer.valueOf(this.widthMils));
        return hashMap;
    }

    public PrintAttributes.MediaSize toMediaSize() {
        return new PrintAttributes.MediaSize(this.f28498id, "Custom", this.widthMils, this.heightMils);
    }

    public String toString() {
        return "MediaSizeExt{id='" + this.f28498id + '\'' + ", label='" + this.label + '\'' + ", widthMils=" + this.widthMils + ", heightMils=" + this.heightMils + '}';
    }
}
