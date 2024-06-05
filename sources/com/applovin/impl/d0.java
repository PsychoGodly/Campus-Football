package com.applovin.impl;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;

public class d0 extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f7065a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinSdkUtils.Size f7066b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f7067c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f7068d;

    public d0(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.f7065a = viewGroup;
        this.f7066b = size;
        this.f7067c = activity;
        requestWindowFeature(1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }

    public void dismiss() {
        this.f7068d.removeView(this.f7065a);
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f7067c, this.f7066b.getWidth()), AppLovinSdkUtils.dpToPx(this.f7067c, this.f7066b.getHeight()));
        layoutParams.addRule(13);
        this.f7065a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f7067c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f7067c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f7067c.getResources().getDrawable(R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground((Drawable) null);
        imageButton.setOnClickListener(new aw(this));
        RelativeLayout relativeLayout = new RelativeLayout(this.f7067c);
        this.f7068d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f7068d.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
        this.f7068d.addView(imageButton);
        this.f7068d.addView(this.f7065a);
        this.f7068d.setOnClickListener(new zv(this));
        setContentView(this.f7068d);
    }
}
