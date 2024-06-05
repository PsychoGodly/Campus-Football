package com.applovin.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class zb extends BaseAdapter implements View.OnClickListener {
    /* access modifiers changed from: protected */

    /* renamed from: a  reason: collision with root package name */
    public Context f13816a;

    /* renamed from: b  reason: collision with root package name */
    private List f13817b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Map f13818c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private a f13819d;

    public interface a {
        void a(hb hbVar, yb ybVar);
    }

    protected zb(Context context) {
        this.f13816a = context.getApplicationContext();
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(r3.a(R.color.applovin_sdk_highlightListItemColor, this.f13816a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    /* access modifiers changed from: protected */
    public yb a() {
        return null;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract int b();

    /* renamed from: b */
    public yb getItem(int i10) {
        return (yb) this.f13817b.get(i10);
    }

    /* access modifiers changed from: protected */
    public abstract List c(int i10);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new c90(this));
    }

    /* access modifiers changed from: protected */
    public abstract int d(int i10);

    /* access modifiers changed from: protected */
    public abstract yb e(int i10);

    public int getCount() {
        return this.f13817b.size();
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public int getItemViewType(int i10) {
        return getItem(i10).m();
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        xb xbVar;
        yb b10 = getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(b10.j(), viewGroup, false);
            xbVar = new xb();
            xbVar.f13309a = (TextView) view.findViewById(16908308);
            xbVar.f13310b = (TextView) view.findViewById(16908309);
            xbVar.f13311c = (ImageView) view.findViewById(R.id.imageView);
            xbVar.f13312d = (ImageView) view.findViewById(R.id.detailImageView);
            view.setTag(xbVar);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            xbVar = (xb) view.getTag();
        }
        xbVar.a(i10);
        xbVar.a(b10);
        view.setEnabled(b10.o());
        return view;
    }

    public int getViewTypeCount() {
        return yb.n();
    }

    public boolean isEnabled(int i10) {
        return getItem(i10).o();
    }

    public void notifyDataSetChanged() {
        int i10;
        this.f13817b = new ArrayList();
        int b10 = b();
        this.f13818c = new HashMap(b10);
        yb a10 = a();
        if (a10 != null) {
            this.f13817b.add(a10);
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < b10; i11++) {
            int d10 = d(i11);
            if (d10 != 0) {
                this.f13817b.add(e(i11));
                this.f13817b.addAll(c(i11));
                this.f13818c.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 += d10 + 1;
            }
        }
        this.f13817b.add(new bj(MaxReward.DEFAULT_LABEL));
        super.notifyDataSetChanged();
    }

    public void onClick(View view) {
        xb xbVar = (xb) view.getTag();
        yb b10 = xbVar.b();
        hb a10 = a(xbVar.a());
        a aVar = this.f13819d;
        if (aVar != null && a10 != null) {
            aVar.a(a10, b10);
        }
    }

    private hb a(int i10) {
        for (int i11 = 0; i11 < b(); i11++) {
            Integer num = (Integer) this.f13818c.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + d(i11)) {
                    return new hb(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.f13819d = aVar;
    }
}
