package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class o4 extends ArrayAdapter<s4> {

    /* renamed from: a  reason: collision with root package name */
    public String f16223a;

    /* renamed from: b  reason: collision with root package name */
    public String f16224b;

    public o4(Context context, List list, String str, String str2) {
        super(context, 0, list);
        this.f16223a = str;
        this.f16224b = str2;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        t4 t4Var;
        long j10;
        if (view == null) {
            t4Var = new t4(getContext());
            view2 = t4Var.f17290a;
        } else {
            view2 = view;
            t4Var = (t4) view.getTag();
        }
        s4 s4Var = (s4) getItem(i10);
        MetaDataStyle a10 = AdsCommonMetaData.f16770h.a(s4Var.f16390q);
        boolean z10 = true;
        if (t4Var.f17296g != a10) {
            t4Var.f17296g = a10;
            t4Var.f17290a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a10.e().intValue(), a10.d().intValue()}));
            t4Var.f17292c.setTextSize((float) a10.h().intValue());
            t4Var.f17292c.setTextColor(a10.f().intValue());
            f9.a(t4Var.f17292c, a10.g());
            t4Var.f17293d.setTextSize((float) a10.c().intValue());
            t4Var.f17293d.setTextColor(a10.a().intValue());
            f9.a(t4Var.f17293d, a10.b());
        }
        t4Var.f17292c.setText(s4Var.f16380g);
        t4Var.f17293d.setText(s4Var.f16381h);
        u4 a11 = v4.f17398b.a(this.f16224b);
        Bitmap a12 = a11.f17363a.a(i10, s4Var.f16374a, s4Var.f16382i);
        if (a12 == null) {
            t4Var.f17291b.setImageResource(17301651);
            t4Var.f17291b.setTag("tag_error");
        } else {
            t4Var.f17291b.setImageBitmap(a12);
            t4Var.f17291b.setTag("tag_ok");
        }
        t4Var.f17295f.setRating(s4Var.f16383j);
        if (s4Var.f16387n == null) {
            z10 = false;
        }
        t4Var.a(z10);
        u4 a13 = v4.f17398b.a(this.f16224b);
        Context context = getContext();
        String[] strArr = s4Var.f16376c;
        TrackingParams trackingParams = new TrackingParams(this.f16223a);
        Long l10 = s4Var.f16388o;
        if (l10 != null) {
            j10 = TimeUnit.SECONDS.toMillis(l10.longValue());
        } else {
            j10 = TimeUnit.SECONDS.toMillis(MetaData.f17070k.s());
        }
        long j11 = j10;
        g3 g3Var = a13.f17363a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OFFER_WALL;
        String a14 = g3Var.a(strArr, a13.f17365c);
        if (!g3Var.f15831a.containsKey(a14)) {
            k7 k7Var = new k7(context, placement, strArr, trackingParams, j11);
            g3Var.f15831a.put(a14, k7Var);
            k7Var.c();
        }
        return view2;
    }
}
