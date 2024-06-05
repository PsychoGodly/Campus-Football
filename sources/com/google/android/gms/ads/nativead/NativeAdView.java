package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.s3;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbza;
import n4.o;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f14951a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbeb f14952b = f();

    public NativeAdView(Context context) {
        super(context);
        this.f14951a = e(context);
    }

    private final FrameLayout e(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzbeb f() {
        if (isInEditMode()) {
            return null;
        }
        return x.a().h(this.f14951a.getContext(), this, this.f14951a);
    }

    private final void g(String str, View view) {
        zzbeb zzbeb = this.f14952b;
        if (zzbeb != null) {
            try {
                zzbeb.zzbs(str, b.B1(view));
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to call setAssetView on delegate", e10);
            }
        }
    }

    public void a() {
        zzbeb zzbeb = this.f14952b;
        if (zzbeb != null) {
            try {
                zzbeb.zzc();
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to destroy native ad view", e10);
            }
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f14951a);
    }

    /* access modifiers changed from: protected */
    public final View b(String str) {
        zzbeb zzbeb = this.f14952b;
        if (zzbeb != null) {
            try {
                a zzb = zzbeb.zzb(str);
                if (zzb != null) {
                    return (View) b.A1(zzb);
                }
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f14951a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(o oVar) {
        zzbeb zzbeb = this.f14952b;
        if (zzbeb != null) {
            try {
                if (oVar instanceof s3) {
                    zzbeb.zzbu(((s3) oVar).a());
                } else if (oVar == null) {
                    zzbeb.zzbu((zzbdu) null);
                } else {
                    zzbza.zze("Use MediaContent provided by NativeAd.getMediaContent");
                }
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to call setMediaContent on delegate", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(ImageView.ScaleType scaleType) {
        zzbeb zzbeb = this.f14952b;
        if (zzbeb != null && scaleType != null) {
            try {
                zzbeb.zzbv(b.B1(scaleType));
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to call setMediaViewImageScaleType on delegate", e10);
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14952b != null) {
            if (((Boolean) a0.c().zzb(zzbar.zzjF)).booleanValue()) {
                try {
                    this.f14952b.zzd(b.B1(motionEvent));
                } catch (RemoteException e10) {
                    zzbza.zzh("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        View b10 = b("3011");
        if (b10 instanceof a) {
            return (a) b10;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return b("3005");
    }

    public final View getBodyView() {
        return b("3004");
    }

    public final View getCallToActionView() {
        return b("3002");
    }

    public final View getHeadlineView() {
        return b("3001");
    }

    public final View getIconView() {
        return b("3003");
    }

    public final View getImageView() {
        return b("3008");
    }

    public final MediaView getMediaView() {
        View b10 = b("3010");
        if (b10 instanceof MediaView) {
            return (MediaView) b10;
        }
        if (b10 == null) {
            return null;
        }
        zzbza.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return b("3007");
    }

    public final View getStarRatingView() {
        return b("3009");
    }

    public final View getStoreView() {
        return b("3006");
    }

    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        zzbeb zzbeb = this.f14952b;
        if (zzbeb != null) {
            try {
                zzbeb.zze(b.B1(view), i10);
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to call onVisibilityChanged on delegate", e10);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f14951a);
    }

    public final void removeView(View view) {
        if (this.f14951a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(a aVar) {
        g("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        g("3005", view);
    }

    public final void setBodyView(View view) {
        g("3004", view);
    }

    public final void setCallToActionView(View view) {
        g("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbeb zzbeb = this.f14952b;
        if (zzbeb != null) {
            try {
                zzbeb.zzbt(b.B1(view));
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to call setClickConfirmingView on delegate", e10);
            }
        }
    }

    public final void setHeadlineView(View view) {
        g("3001", view);
    }

    public final void setIconView(View view) {
        g("3003", view);
    }

    public final void setImageView(View view) {
        g("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        g("3010", mediaView);
        if (mediaView != null) {
            mediaView.a(new f(this));
            mediaView.b(new g(this));
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.google.android.gms.dynamic.a, java.lang.Object] */
    public void setNativeAd(b bVar) {
        zzbeb zzbeb = this.f14952b;
        if (zzbeb != null) {
            try {
                zzbeb.zzbw(bVar.zza());
            } catch (RemoteException e10) {
                zzbza.zzh("Unable to call setNativeAd on delegate", e10);
            }
        }
    }

    public final void setPriceView(View view) {
        g("3007", view);
    }

    public final void setStarRatingView(View view) {
        g("3009", view);
    }

    public final void setStoreView(View view) {
        g("3006", view);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14951a = e(context);
    }
}
