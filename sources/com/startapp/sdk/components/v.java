package com.startapp.sdk.components;

import android.content.Context;
import com.startapp.h2;
import com.startapp.h3;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.components.ComponentLocator;
import java.util.List;

/* compiled from: Sta */
public class v implements h2<Context, List<String>, TrackingParams, h3> {
    public v(ComponentLocator.i0 i0Var) {
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        List list = (List) obj2;
        TrackingParams trackingParams = (TrackingParams) obj3;
        if (context == null || list == null) {
            return null;
        }
        return new h3(context, list, trackingParams, new u(this));
    }
}
