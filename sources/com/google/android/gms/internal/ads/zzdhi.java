package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.p1;
import com.google.android.gms.ads.internal.util.z0;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import q4.j;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdhi {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final p1 zzb;
    private final zzeyx zzc;
    private final zzdgn zzd;
    private final zzdgi zze;
    private final zzdhu zzf;
    private final zzdic zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbdl zzj;
    private final zzdgf zzk;

    public zzdhi(p1 p1Var, zzeyx zzeyx, zzdgn zzdgn, zzdgi zzdgi, zzdhu zzdhu, zzdic zzdic, Executor executor, Executor executor2, zzdgf zzdgf) {
        this.zzb = p1Var;
        this.zzc = zzeyx;
        this.zzj = zzeyx.zzi;
        this.zzd = zzdgn;
        this.zze = zzdgi;
        this.zzf = zzdhu;
        this.zzg = zzdic;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdgf;
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z10) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        if (z10) {
            view = this.zze.zzf();
        } else {
            view = this.zze.zzg();
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzds)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(view, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdgi zzdgi = this.zze;
        if (zzdgi.zzf() != null) {
            boolean z10 = viewGroup != null;
            if (zzdgi.zzc() == 2 || zzdgi.zzc() == 1) {
                this.zzb.q(this.zzc.zzf, String.valueOf(zzdgi.zzc()), z10);
            } else if (zzdgi.zzc() == 6) {
                this.zzb.q(this.zzc.zzf, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION, z10);
                this.zzb.q(this.zzc.zzf, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, z10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzdie zzdie) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        zzbdu zza2;
        Drawable drawable;
        Context context = null;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {"1098", "3011"};
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    break;
                }
                View zzg2 = zzdie.zzg(strArr[i10]);
                if (zzg2 != null && (zzg2 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg2;
                    break;
                }
                i10++;
            }
        }
        viewGroup = null;
        Context context2 = zzdie.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdgi zzdgi = this.zze;
        if (zzdgi.zze() != null) {
            view = zzdgi.zze();
            zzbdl zzbdl = this.zzj;
            if (zzbdl != null && viewGroup == null) {
                zzg(layoutParams, zzbdl.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(zzdgi.zzl() instanceof zzbdg)) {
            view = null;
        } else {
            zzbdg zzbdg = (zzbdg) zzdgi.zzl();
            if (viewGroup == null) {
                zzg(layoutParams, zzbdg.zzc());
            }
            zzbdh zzbdh = new zzbdh(context2, zzbdg, layoutParams);
            zzbdh.setContentDescription((CharSequence) a0.c().zzb(zzbar.zzdq));
            view = zzbdh;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                j jVar = new j(zzdie.zzf().getContext());
                jVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                jVar.addView(view);
                FrameLayout zzh2 = zzdie.zzh();
                if (zzh2 != null) {
                    zzh2.addView(jVar);
                }
            }
            zzdie.zzq(zzdie.zzk(), view, true);
        }
        zzfqk zzfqk = zzdhe.zza;
        int size = zzfqk.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg3 = zzdie.zzg((String) zzfqk.get(i11));
            i11++;
            if (zzg3 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg3;
                break;
            }
        }
        this.zzi.execute(new zzdhf(this, viewGroup2));
        if (viewGroup2 != null) {
            if (zzh(viewGroup2, true)) {
                zzdgi zzdgi2 = this.zze;
                if (zzdgi2.zzr() != null) {
                    zzdgi2.zzr().zzao(new zzdhh(zzdie, viewGroup2));
                    return;
                }
                return;
            }
            if (!((Boolean) a0.c().zzb(zzbar.zziT)).booleanValue() || !zzh(viewGroup2, false)) {
                viewGroup2.removeAllViews();
                View zzf2 = zzdie.zzf();
                if (zzf2 != null) {
                    context = zzf2.getContext();
                }
                if (context != null && (zza2 = this.zzk.zza()) != null) {
                    try {
                        a zzi2 = zza2.zzi();
                        if (zzi2 != null && (drawable = (Drawable) b.A1(zzi2)) != null) {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(drawable);
                            a zzj2 = zzdie.zzj();
                            if (zzj2 != null) {
                                if (((Boolean) a0.c().zzb(zzbar.zzfK)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) b.A1(zzj2));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(zza);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        zzbza.zzj("Could not get main image drawable");
                    }
                }
            } else {
                zzdgi zzdgi3 = this.zze;
                if (zzdgi3.zzp() != null) {
                    zzdgi3.zzp().zzao(new zzdhh(zzdie, viewGroup2));
                }
            }
        }
    }

    public final void zzc(zzdie zzdie) {
        if (zzdie != null && this.zzf != null && zzdie.zzh() != null && this.zzd.zzg()) {
            try {
                zzdie.zzh().addView(this.zzf.zza());
            } catch (zzcet e10) {
                n1.b("web view can not be obtained", e10);
            }
        }
    }

    public final void zzd(zzdie zzdie) {
        if (zzdie != null) {
            Context context = zzdie.zzf().getContext();
            if (z0.h(context, this.zzd.zza)) {
                if (!(context instanceof Activity)) {
                    zzbza.zze("Activity context is needed for policy validator.");
                } else if (this.zzg != null && zzdie.zzh() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.zzg.zza(zzdie.zzh(), windowManager), z0.b());
                    } catch (zzcet e10) {
                        n1.b("web view can not be obtained", e10);
                    }
                }
            }
        }
    }

    public final void zze(zzdie zzdie) {
        this.zzh.execute(new zzdhg(this, zzdie));
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }
}
