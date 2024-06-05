package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgu {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final Map zzh = new WeakHashMap();
    private boolean zzi;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfgt zzb(View view) {
        zzfgt zzfgt = (zzfgt) this.zzb.get(view);
        if (zzfgt != null) {
            this.zzb.remove(view);
        }
        return zzfgt;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzi = false;
    }

    public final void zzh() {
        this.zzi = true;
    }

    public final void zzi() {
        Boolean bool;
        zzffz zza2 = zzffz.zza();
        if (zza2 != null) {
            for (zzffo zzffo : zza2.zzb()) {
                View zzf2 = zzffo.zzf();
                if (zzffo.zzj()) {
                    String zzh2 = zzffo.zzh();
                    if (zzf2 != null) {
                        String str = null;
                        if (!zzf2.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (zzf2.hasWindowFocus()) {
                                this.zzh.remove(zzf2);
                                bool = Boolean.FALSE;
                            } else if (this.zzh.containsKey(zzf2)) {
                                bool = (Boolean) this.zzh.get(zzf2);
                            } else {
                                Map map = this.zzh;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(zzf2, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = zzf2;
                                while (true) {
                                    if (view == null) {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                    String zzb2 = zzfgs.zzb(view);
                                    if (zzb2 != null) {
                                        str = zzb2;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        }
                        if (str == null) {
                            this.zze.add(zzh2);
                            this.zza.put(zzf2, zzh2);
                            for (zzfgb zzfgb : zzffo.zzi()) {
                                View view2 = (View) zzfgb.zzb().get();
                                if (view2 != null) {
                                    zzfgt zzfgt = (zzfgt) this.zzb.get(view2);
                                    if (zzfgt != null) {
                                        zzfgt.zzc(zzffo.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfgt(zzfgb, zzffo.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh2);
                            this.zzc.put(zzh2, zzf2);
                            this.zzg.put(zzh2, str);
                        }
                    } else {
                        this.zzf.add(zzh2);
                        this.zzg.put(zzh2, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(View view) {
        if (!this.zzh.containsKey(view)) {
            return true;
        }
        this.zzh.put(view, Boolean.TRUE);
        return false;
    }

    public final int zzk(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzi ? 2 : 3;
    }
}
