package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbza;
import n4.o;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class MediaView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private o f14945a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14946b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView.ScaleType f14947c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14948d;

    /* renamed from: f  reason: collision with root package name */
    private f f14949f;

    /* renamed from: g  reason: collision with root package name */
    private g f14950g;

    public MediaView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(f fVar) {
        this.f14949f = fVar;
        if (this.f14946b) {
            fVar.f14969a.c(this.f14945a);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void b(g gVar) {
        this.f14950g = gVar;
        if (this.f14948d) {
            gVar.f14970a.d(this.f14947c);
        }
    }

    public o getMediaContent() {
        return this.f14945a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f14948d = true;
        this.f14947c = scaleType;
        g gVar = this.f14950g;
        if (gVar != null) {
            gVar.f14970a.d(scaleType);
        }
    }

    public void setMediaContent(o oVar) {
        this.f14946b = true;
        this.f14945a = oVar;
        f fVar = this.f14949f;
        if (fVar != null) {
            fVar.f14969a.c(oVar);
        }
        if (oVar != null) {
            try {
                zzber zza = oVar.zza();
                if (zza != null && !zza.zzr(b.B1(this))) {
                    removeAllViews();
                }
            } catch (RemoteException e10) {
                removeAllViews();
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            }
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
