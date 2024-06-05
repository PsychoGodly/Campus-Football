package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzapt implements zzaps {
    protected static volatile zzaqx zza;
    protected MotionEvent zzb;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected boolean zzp = false;
    protected DisplayMetrics zzq;
    protected zzaqp zzr;
    private double zzs;
    private double zzt;
    private boolean zzu = false;

    protected zzapt(Context context) {
        try {
            if (((Boolean) a0.c().zzb(zzbar.zzcO)).booleanValue()) {
                zzaol.zzd();
            } else {
                zzaqz.zza(zza);
            }
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) a0.c().zzb(zzbar.zzcn)).booleanValue()) {
                this.zzr = new zzaqp();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzj = 0;
        if (this.zzc.size() > 0) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc A[SYNTHETIC, Splitter:B:47:0x00bc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String zzm(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            long r5 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.zzbaj r7 = com.google.android.gms.internal.ads.zzbar.zzcf
            com.google.android.gms.internal.ads.zzbap r8 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r7 = r8.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzaqx r10 = zza
            if (r10 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzaqx r10 = zza
            com.google.android.gms.internal.ads.zzapr r10 = r10.zzd()
            goto L_0x002e
        L_0x002d:
            r10 = r9
        L_0x002e:
            com.google.android.gms.internal.ads.zzbaj r11 = com.google.android.gms.internal.ads.zzbar.zzcO
            com.google.android.gms.internal.ads.zzbap r12 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r11 = r12.zzb(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r8 == r11) goto L_0x0043
            java.lang.String r11 = "te"
            goto L_0x0048
        L_0x0043:
            java.lang.String r11 = "be"
            goto L_0x0048
        L_0x0046:
            r10 = r9
            r11 = r10
        L_0x0048:
            r15 = 2
            r14 = 3
            if (r2 != r14) goto L_0x005f
            com.google.android.gms.internal.ads.zzamv r9 = r1.zzb(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r1.zzu = r8     // Catch:{ Exception -> 0x0057 }
            r0 = 1002(0x3ea, float:1.404E-42)
            r13 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0074
        L_0x0057:
            r0 = move-exception
            r18 = r0
            r8 = 3
            goto L_0x0091
        L_0x005c:
            r0 = move-exception
            r8 = 3
            goto L_0x008f
        L_0x005f:
            if (r2 != r15) goto L_0x006b
            com.google.android.gms.internal.ads.zzamv r0 = r1.zzd(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r3 = 1008(0x3f0, float:1.413E-42)
            r9 = r0
            r13 = 1008(0x3f0, float:1.413E-42)
            goto L_0x0074
        L_0x006b:
            com.google.android.gms.internal.ads.zzamv r0 = r1.zzc(r0, r9)     // Catch:{ Exception -> 0x005c }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9 = r0
            r13 = 1000(0x3e8, float:1.401E-42)
        L_0x0074:
            if (r7 == 0) goto L_0x008c
            if (r10 == 0) goto L_0x008c
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005c }
            long r3 = r3 - r5
            r0 = -1
            r18 = 0
            r12 = r10
            r8 = 3
            r14 = r0
            r15 = r3
            r17 = r11
            r12.zzc(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x008a }
            goto L_0x008d
        L_0x008a:
            r0 = move-exception
            goto L_0x008f
        L_0x008c:
            r8 = 3
        L_0x008d:
            r3 = 2
            goto L_0x00b6
        L_0x008f:
            r18 = r0
        L_0x0091:
            if (r7 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x008d
            if (r2 != r8) goto L_0x009d
            r0 = 1003(0x3eb, float:1.406E-42)
            r3 = 2
            r13 = 1003(0x3eb, float:1.406E-42)
            goto L_0x00aa
        L_0x009d:
            r3 = 2
            if (r2 != r3) goto L_0x00a5
            r0 = 1009(0x3f1, float:1.414E-42)
            r13 = 1009(0x3f1, float:1.414E-42)
            goto L_0x00aa
        L_0x00a5:
            r0 = 1001(0x3e9, float:1.403E-42)
            r2 = 1
            r13 = 1001(0x3e9, float:1.403E-42)
        L_0x00aa:
            r14 = -1
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r5
            r12 = r10
            r17 = r11
            r12.zzc(r13, r14, r15, r17, r18)
        L_0x00b6:
            long r4 = java.lang.System.currentTimeMillis()
            if (r9 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzgqm r0 = r9.zzal()     // Catch:{ Exception -> 0x0101 }
            com.google.android.gms.internal.ads.zzans r0 = (com.google.android.gms.internal.ads.zzans) r0     // Catch:{ Exception -> 0x0101 }
            int r0 = r0.zzaz()     // Catch:{ Exception -> 0x0101 }
            if (r0 != 0) goto L_0x00c9
            goto L_0x00fb
        L_0x00c9:
            com.google.android.gms.internal.ads.zzgqm r0 = r9.zzal()     // Catch:{ Exception -> 0x0101 }
            com.google.android.gms.internal.ads.zzans r0 = (com.google.android.gms.internal.ads.zzans) r0     // Catch:{ Exception -> 0x0101 }
            r6 = r21
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaol.zza(r0, r6)     // Catch:{ Exception -> 0x0101 }
            if (r7 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            if (r2 != r8) goto L_0x00e0
            r6 = 1006(0x3ee, float:1.41E-42)
            r13 = 1006(0x3ee, float:1.41E-42)
            goto L_0x00eb
        L_0x00e0:
            if (r2 != r3) goto L_0x00e7
            r6 = 1010(0x3f2, float:1.415E-42)
            r13 = 1010(0x3f2, float:1.415E-42)
            goto L_0x00eb
        L_0x00e7:
            r6 = 1004(0x3ec, float:1.407E-42)
            r13 = 1004(0x3ec, float:1.407E-42)
        L_0x00eb:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0101 }
            long r15 = r14 - r4
            r14 = -1
            r18 = 0
            r12 = r10
            r17 = r11
            r12.zzc(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x0101 }
            goto L_0x012c
        L_0x00fb:
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x0101 }
            goto L_0x012c
        L_0x0101:
            r0 = move-exception
            r18 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r7 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            if (r2 != r8) goto L_0x0114
            r2 = 1007(0x3ef, float:1.411E-42)
            r13 = 1007(0x3ef, float:1.411E-42)
            goto L_0x011f
        L_0x0114:
            if (r2 != r3) goto L_0x011b
            r2 = 1011(0x3f3, float:1.417E-42)
            r13 = 1011(0x3f3, float:1.417E-42)
            goto L_0x011f
        L_0x011b:
            r2 = 1005(0x3ed, float:1.408E-42)
            r13 = 1005(0x3ed, float:1.408E-42)
        L_0x011f:
            r14 = -1
            long r2 = java.lang.System.currentTimeMillis()
            long r15 = r2 - r4
            r12 = r10
            r17 = r11
            r12.zzc(r13, r14, r15, r17, r18)
        L_0x012c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapt.zzm(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzaqn;

    /* access modifiers changed from: protected */
    public abstract zzamv zzb(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract zzamv zzc(Context context, zzamo zzamo);

    /* access modifiers changed from: protected */
    public abstract zzamv zzd(Context context, View view, Activity activity);

    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, (Activity) null, (byte[]) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, (byte[]) null);
    }

    public final String zzg(Context context) {
        if (!zzarb.zzf()) {
            return zzm(context, (String) null, 1, (View) null, (Activity) null, (byte[]) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, (String) null, 2, view, activity, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public abstract zzara zzi(MotionEvent motionEvent) throws zzaqn;

    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l10;
        if (this.zzu) {
            zzj();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = (double) motionEvent.getRawX();
            this.zzt = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d10 = rawX - this.zzs;
            double d11 = rawY - this.zzt;
            this.zzk += Math.sqrt((d10 * d10) + (d11 * d11));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.zzb = obtain;
            this.zzc.add(obtain);
            if (this.zzc.size() > 6) {
                ((MotionEvent) this.zzc.remove()).recycle();
            }
            this.zzf++;
            this.zzh = zza(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.zze += (long) (motionEvent.getHistorySize() + 1);
            try {
                zzara zzi2 = zzi(motionEvent);
                Long l11 = zzi2.zzd;
                if (!(l11 == null || zzi2.zzg == null)) {
                    this.zzi += l11.longValue() + zzi2.zzg.longValue();
                }
                if (!(this.zzq == null || (l10 = zzi2.zze) == null || zzi2.zzh == null)) {
                    this.zzj += l10.longValue() + zzi2.zzh.longValue();
                }
            } catch (zzaqn unused) {
            }
        } else if (action2 == 3) {
            this.zzg++;
        }
        this.zzp = true;
    }

    public final synchronized void zzl(int i10, int i11, int i12) {
        synchronized (this) {
            if (this.zzb != null) {
                if (((Boolean) a0.c().zzb(zzbar.zzcd)).booleanValue()) {
                    zzj();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0, (long) i12, 1, ((float) i10) * f10, ((float) i11) * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        }
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaqp zzaqp;
        if (((Boolean) a0.c().zzb(zzbar.zzcn)).booleanValue() && (zzaqp = this.zzr) != null) {
            zzaqp.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    public void zzo(View view) {
    }
}
