package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.f9;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class AdInformationView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f16873a;

    /* renamed from: b  reason: collision with root package name */
    public RelativeLayout f16874b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f16875c = null;

    /* renamed from: d  reason: collision with root package name */
    public AdInformationConfig f16876d;

    /* renamed from: e  reason: collision with root package name */
    public ImageResourceConfig f16877e;

    /* renamed from: f  reason: collision with root package name */
    public final AdInformationPositions.Position f16878f;

    /* compiled from: Sta */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f16879a;

        public a(AdInformationView adInformationView, View.OnClickListener onClickListener) {
            this.f16879a = onClickListener;
        }

        public void onClick(View view) {
            this.f16879a.onClick(view);
        }
    }

    public AdInformationView(Context context, AdInformationObject.Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, View.OnClickListener onClickListener) {
        super(context);
        this.f16875c = new a(this, onClickListener);
        AdInformationConfig a10 = AdInformationMetaData.c().a();
        this.f16876d = a10;
        if (a10 == null) {
            this.f16876d = AdInformationConfig.a();
        }
        this.f16877e = this.f16876d.a(size.a());
        if (adInformationOverrides == null || !adInformationOverrides.e()) {
            this.f16878f = this.f16876d.a(placement);
        } else {
            this.f16878f = adInformationOverrides.b();
        }
        ImageView imageView = new ImageView(getContext());
        this.f16873a = imageView;
        imageView.setContentDescription("info");
        this.f16873a.setId(1475346433);
        this.f16873a.setImageBitmap(this.f16877e.a(getContext()));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f16874b = relativeLayout;
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(d(), c());
        layoutParams.setMargins(0, 0, 0, 0);
        this.f16873a.setPadding(0, 0, 0, 0);
        this.f16878f.addRules(layoutParams);
        this.f16874b.addView(this.f16873a, layoutParams);
        this.f16874b.setOnClickListener(this.f16875c);
        addView(this.f16874b, new RelativeLayout.LayoutParams(b(), a()));
    }

    public int a() {
        return (int) (this.f16876d.e() * ((float) c()));
    }

    public int b() {
        return (int) (this.f16876d.e() * ((float) d()));
    }

    public int c() {
        return f9.a(getContext(), this.f16877e.a());
    }

    public int d() {
        return f9.a(getContext(), this.f16877e.d());
    }
}
