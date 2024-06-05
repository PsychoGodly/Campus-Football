package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbdh extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzb;

    public zzbdh(Context context, zzbdg zzbdg, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        q.k(zzbdg);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(zzbdg.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbdg.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbdg.zzg());
            textView.setTextColor(zzbdg.zze());
            textView.setTextSize((float) zzbdg.zzf());
            x.b();
            int zzy = zzbyt.zzy(context, 4);
            x.b();
            textView.setPadding(zzy, 0, zzbyt.zzy(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzbdj> zzi = zzbdg.zzi();
        if (zzi != null && zzi.size() > 1) {
            this.zzb = new AnimationDrawable();
            for (zzbdj zzf : zzi) {
                try {
                    this.zzb.addFrame((Drawable) b.A1(zzf.zzf()), zzbdg.zzb());
                } catch (Exception e10) {
                    zzbza.zzh("Error while getting drawable.", e10);
                }
            }
            imageView.setBackground(this.zzb);
        } else if (zzi.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) b.A1(((zzbdj) zzi.get(0)).zzf()));
            } catch (Exception e11) {
                zzbza.zzh("Error while getting drawable.", e11);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
