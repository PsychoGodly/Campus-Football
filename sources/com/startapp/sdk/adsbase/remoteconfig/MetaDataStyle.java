package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.applovin.mediation.MaxReward;
import com.startapp.d9;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class MetaDataStyle implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Integer f17100a = 18;

    /* renamed from: b  reason: collision with root package name */
    public static final Integer f17101b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final Set<String> f17102c = new HashSet(Arrays.asList(new String[]{"BOLD"}));

    /* renamed from: d  reason: collision with root package name */
    public static final Integer f17103d = 14;

    /* renamed from: e  reason: collision with root package name */
    public static final Integer f17104e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<String> f17105f = new HashSet();
    private static final long serialVersionUID = -8172457405775076403L;
    private Integer itemDescriptionTextColor = f17104e;
    @d9(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = f17105f;
    private Integer itemDescriptionTextSize = f17103d;
    private Integer itemGradientBottom = -8750199;
    private Integer itemGradientTop = -14014151;
    private Integer itemTitleTextColor = f17101b;
    @d9(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = f17102c;
    private Integer itemTitleTextSize = f17100a;
    private String name = MaxReward.DEFAULT_LABEL;

    public Integer a() {
        return this.itemDescriptionTextColor;
    }

    public Set<String> b() {
        return this.itemDescriptionTextDecoration;
    }

    public Integer c() {
        return this.itemDescriptionTextSize;
    }

    public Integer d() {
        return this.itemGradientBottom;
    }

    public Integer e() {
        return this.itemGradientTop;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaDataStyle metaDataStyle = (MetaDataStyle) obj;
        if (!j9.a(this.name, metaDataStyle.name) || !j9.a(this.itemGradientTop, metaDataStyle.itemGradientTop) || !j9.a(this.itemGradientBottom, metaDataStyle.itemGradientBottom) || !j9.a(this.itemTitleTextSize, metaDataStyle.itemTitleTextSize) || !j9.a(this.itemTitleTextColor, metaDataStyle.itemTitleTextColor) || !j9.a(this.itemTitleTextDecoration, metaDataStyle.itemTitleTextDecoration) || !j9.a(this.itemDescriptionTextSize, metaDataStyle.itemDescriptionTextSize) || !j9.a(this.itemDescriptionTextColor, metaDataStyle.itemDescriptionTextColor) || !j9.a(this.itemDescriptionTextDecoration, metaDataStyle.itemDescriptionTextDecoration)) {
            return false;
        }
        return true;
    }

    public Integer f() {
        return this.itemTitleTextColor;
    }

    public Set<String> g() {
        return this.itemTitleTextDecoration;
    }

    public Integer h() {
        return this.itemTitleTextSize;
    }

    public int hashCode() {
        Object[] objArr = {this.name, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
