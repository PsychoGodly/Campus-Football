package t4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;
import m5.m;
import s4.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class w extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ImageButton f22736a;

    /* renamed from: b  reason: collision with root package name */
    private final e f22737b;

    public w(Context context, v vVar, e eVar) {
        super(context);
        this.f22737b = eVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f22736a = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        x.b();
        int zzy = zzbyt.zzy(context, vVar.f22732a);
        x.b();
        int zzy2 = zzbyt.zzy(context, 0);
        x.b();
        int zzy3 = zzbyt.zzy(context, vVar.f22733b);
        x.b();
        imageButton.setPadding(zzy, zzy2, zzy3, zzbyt.zzy(context, vVar.f22734c));
        imageButton.setContentDescription("Interstitial close button");
        x.b();
        int zzy4 = zzbyt.zzy(context, vVar.f22735d + vVar.f22732a + vVar.f22733b);
        x.b();
        addView(imageButton, new FrameLayout.LayoutParams(zzy4, zzbyt.zzy(context, vVar.f22735d + vVar.f22734c), 17));
        long longValue = ((Long) a0.c().zzb(zzbar.zzaW)).longValue();
        if (longValue > 0) {
            u uVar = ((Boolean) a0.c().zzb(zzbar.zzaX)).booleanValue() ? new u(this) : null;
            imageButton.setAlpha(0.0f);
            imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(uVar);
        }
    }

    private final void c() {
        String str = (String) a0.c().zzb(zzbar.zzaV);
        if (!m.f() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f22736a.setImageResource(17301527);
            return;
        }
        Resources zzd = t.q().zzd();
        if (zzd != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = zzd.getDrawable(a.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = zzd.getDrawable(a.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                zzbza.zze("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.f22736a.setImageResource(17301527);
                return;
            }
            this.f22736a.setImageDrawable(drawable);
            this.f22736a.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.f22736a.setImageResource(17301527);
    }

    public final void b(boolean z10) {
        if (z10) {
            this.f22736a.setVisibility(8);
            if (((Long) a0.c().zzb(zzbar.zzaW)).longValue() > 0) {
                this.f22736a.animate().cancel();
                this.f22736a.clearAnimation();
                return;
            }
            return;
        }
        this.f22736a.setVisibility(0);
    }

    public final void onClick(View view) {
        e eVar = this.f22737b;
        if (eVar != null) {
            eVar.zzi();
        }
    }
}
