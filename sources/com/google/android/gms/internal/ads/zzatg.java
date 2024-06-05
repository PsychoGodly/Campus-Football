package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.b2;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzatg implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((Long) a0.c().zzb(zzbar.zzbf)).longValue();
    BroadcastReceiver zza;
    final WeakReference zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference zzi;
    private zzats zzj;
    private final b1 zzk = new b1(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final HashSet zzn = new HashSet();
    private final DisplayMetrics zzo;
    private final Rect zzp;

    public zzatg(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (PowerManager) applicationContext.getSystemService("power");
        this.zzh = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.zze = application;
            this.zzj = new zzats(application, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.zzb;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int zzh(int i10) {
        return (int) (((float) i10) / this.zzo.density);
    }

    private final void zzi(Activity activity, int i10) {
        Window window;
        if (this.zzb != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.zzb.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.zzm = i10;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0112, code lost:
        if (r11 == 0) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0128, code lost:
        if (r11 == 0) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(int r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            java.util.HashSet r0 = r1.zzn
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.ref.WeakReference r0 = r1.zzb
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r0 = 2
            int[] r8 = new int[r0]
            int[] r0 = new int[r0]
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x0068
            boolean r12 = r3.getGlobalVisibleRect(r5)
            boolean r13 = r3.getLocalVisibleRect(r6)
            r3.getHitRect(r7)
            r3.getLocationOnScreen(r8)     // Catch:{ Exception -> 0x0048 }
            r3.getLocationInWindow(r0)     // Catch:{ Exception -> 0x0048 }
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            java.lang.String r14 = "Failure getting view location."
            com.google.android.gms.internal.ads.zzbza.zzh(r14, r0)
        L_0x004e:
            r0 = r8[r11]
            r4.left = r0
            r8 = r8[r10]
            r4.top = r8
            int r8 = r3.getWidth()
            int r0 = r0 + r8
            r4.right = r0
            int r0 = r4.top
            int r8 = r3.getHeight()
            int r0 = r0 + r8
            r4.bottom = r0
            r8 = r3
            goto L_0x006b
        L_0x0068:
            r8 = 0
            r12 = 0
            r13 = 0
        L_0x006b:
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzbi
            com.google.android.gms.internal.ads.zzbap r14 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r14.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bc
            if (r8 == 0) goto L_0x00bc
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ad }
            r0.<init>()     // Catch:{ Exception -> 0x00ad }
            android.view.ViewParent r14 = r8.getParent()     // Catch:{ Exception -> 0x00ad }
        L_0x0088:
            boolean r15 = r14 instanceof android.view.View     // Catch:{ Exception -> 0x00ad }
            if (r15 == 0) goto L_0x00c0
            r15 = r14
            android.view.View r15 = (android.view.View) r15     // Catch:{ Exception -> 0x00ad }
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ Exception -> 0x00ad }
            r11.<init>()     // Catch:{ Exception -> 0x00ad }
            boolean r17 = r15.isScrollContainer()     // Catch:{ Exception -> 0x00ad }
            if (r17 == 0) goto L_0x00a7
            boolean r15 = r15.getGlobalVisibleRect(r11)     // Catch:{ Exception -> 0x00ad }
            if (r15 == 0) goto L_0x00a7
            android.graphics.Rect r11 = r1.zza(r11)     // Catch:{ Exception -> 0x00ad }
            r0.add(r11)     // Catch:{ Exception -> 0x00ad }
        L_0x00a7:
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00ad }
            r11 = 0
            goto L_0x0088
        L_0x00ad:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbyj r11 = com.google.android.gms.ads.internal.t.q()
            java.lang.String r14 = "PositionWatcher.getParentScrollViewRects"
            r11.zzu(r0, r14)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00c0
        L_0x00bc:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x00c0:
            r31 = r0
            if (r8 == 0) goto L_0x00c9
            int r11 = r8.getWindowVisibility()
            goto L_0x00cb
        L_0x00c9:
            r11 = 8
        L_0x00cb:
            int r14 = r1.zzm
            r15 = -1
            if (r14 == r15) goto L_0x00d1
            r11 = r14
        L_0x00d1:
            com.google.android.gms.ads.internal.t.r()
            long r26 = com.google.android.gms.ads.internal.util.b2.R(r8)
            com.google.android.gms.internal.ads.zzbaj r14 = com.google.android.gms.internal.ads.zzbar.zziV
            com.google.android.gms.internal.ads.zzbap r15 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r14 = r15.zzb(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0115
            if (r3 == 0) goto L_0x012d
            com.google.android.gms.ads.internal.t.r()
            android.os.PowerManager r3 = r1.zzg
            android.app.KeyguardManager r14 = r1.zzh
            boolean r3 = com.google.android.gms.ads.internal.util.b2.p(r8, r3, r14)
            if (r3 == 0) goto L_0x012d
            if (r12 == 0) goto L_0x012d
            if (r13 == 0) goto L_0x012d
            com.google.android.gms.internal.ads.zzbaj r3 = com.google.android.gms.internal.ads.zzbar.zziY
            com.google.android.gms.internal.ads.zzbap r14 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r3 = r14.zzb(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r14 = (long) r3
            int r3 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x012d
            if (r11 != 0) goto L_0x012d
            goto L_0x012a
        L_0x0115:
            if (r3 == 0) goto L_0x012d
            com.google.android.gms.ads.internal.t.r()
            android.os.PowerManager r3 = r1.zzg
            android.app.KeyguardManager r14 = r1.zzh
            boolean r3 = com.google.android.gms.ads.internal.util.b2.p(r8, r3, r14)
            if (r3 == 0) goto L_0x012d
            if (r12 == 0) goto L_0x012d
            if (r13 == 0) goto L_0x012d
            if (r11 != 0) goto L_0x012d
        L_0x012a:
            r3 = 1
            r11 = 0
            goto L_0x012e
        L_0x012d:
            r3 = 0
        L_0x012e:
            com.google.android.gms.internal.ads.zzbaj r14 = com.google.android.gms.internal.ads.zzbar.zzja
            com.google.android.gms.internal.ads.zzbap r15 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r14 = r15.zzb(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x018b
            com.google.android.gms.ads.internal.t.r()
            android.os.PowerManager r14 = r1.zzg
            android.app.KeyguardManager r15 = r1.zzh
            boolean r14 = com.google.android.gms.ads.internal.util.b2.p(r8, r14, r15)
            if (r10 == r14) goto L_0x014f
            r14 = 0
            goto L_0x0151
        L_0x014f:
            r14 = 64
        L_0x0151:
            if (r10 == r12) goto L_0x0155
            r15 = 0
            goto L_0x0157
        L_0x0155:
            r15 = 8
        L_0x0157:
            if (r10 == r13) goto L_0x015c
            r17 = 0
            goto L_0x015e
        L_0x015c:
            r17 = 16
        L_0x015e:
            if (r11 != 0) goto L_0x0163
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0164
        L_0x0163:
            r11 = 0
        L_0x0164:
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zziY
            com.google.android.gms.internal.ads.zzbap r10 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r10.zzb(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r9 = (long) r0
            int r0 = (r26 > r9 ? 1 : (r26 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x017c
            r0 = 32
            goto L_0x017d
        L_0x017c:
            r0 = 0
        L_0x017d:
            r9 = r14 | r15
            r9 = r9 | r17
            r9 = r9 | r11
            r0 = r0 | r9
            r0 = r0 | r3
            com.google.android.gms.ads.internal.t.r()
            r9 = 0
            com.google.android.gms.ads.internal.util.b2.f(r8, r0, r9)
        L_0x018b:
            r9 = 1
            if (r2 != r9) goto L_0x019c
            com.google.android.gms.ads.internal.util.b1 r0 = r1.zzk
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x019c
            boolean r0 = r1.zzl
            if (r3 == r0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            return
        L_0x019c:
            if (r3 != 0) goto L_0x01a7
            boolean r0 = r1.zzl
            if (r0 != 0) goto L_0x01a7
            r9 = 1
            if (r2 == r9) goto L_0x01a6
            goto L_0x01a8
        L_0x01a6:
            return
        L_0x01a7:
            r9 = 1
        L_0x01a8:
            com.google.android.gms.internal.ads.zzate r0 = new com.google.android.gms.internal.ads.zzate
            m5.e r2 = com.google.android.gms.ads.internal.t.b()
            long r10 = r2.b()
            android.os.PowerManager r2 = r1.zzg
            boolean r17 = r2.isScreenOn()
            if (r8 == 0) goto L_0x01c1
            boolean r2 = r8.isAttachedToWindow()
            if (r2 == 0) goto L_0x01c1
            goto L_0x01c2
        L_0x01c1:
            r9 = 0
        L_0x01c2:
            if (r8 == 0) goto L_0x01cb
            int r2 = r8.getWindowVisibility()
            r19 = r2
            goto L_0x01cd
        L_0x01cb:
            r19 = 8
        L_0x01cd:
            android.graphics.Rect r2 = r1.zzp
            android.graphics.Rect r20 = r1.zza(r2)
            android.graphics.Rect r21 = r1.zza(r4)
            android.graphics.Rect r22 = r1.zza(r5)
            android.graphics.Rect r24 = r1.zza(r6)
            android.graphics.Rect r28 = r1.zza(r7)
            android.util.DisplayMetrics r2 = r1.zzo
            float r2 = r2.density
            r29 = r2
            r14 = r0
            r15 = r10
            r18 = r9
            r23 = r12
            r25 = r13
            r30 = r3
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            java.util.HashSet r2 = r1.zzn
            java.util.Iterator r2 = r2.iterator()
        L_0x01fc:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x020c
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.ads.zzatf r4 = (com.google.android.gms.internal.ads.zzatf) r4
            r4.zzc(r0)
            goto L_0x01fc
        L_0x020c:
            r1.zzl = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatg.zzj(int):void");
    }

    private final void zzk() {
        b2.f14773i.post(new zzatc(this));
    }

    private final void zzl(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zza = new zzatd(this);
            t.x().c(this.zzd, this.zza, intentFilter);
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e10) {
                zzbza.zzh("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }

    private final void zzm(View view) {
        try {
            WeakReference weakReference = this.zzi;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (Exception e10) {
            zzbza.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e10);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e11) {
            zzbza.zzh("Error while unregistering listeners from the ViewTreeObserver.", e11);
        }
        if (this.zza != null) {
            try {
                t.x().d(this.zzd, this.zza);
            } catch (IllegalStateException e12) {
                zzbza.zzh("Failed trying to unregister the receiver", e12);
            } catch (Exception e13) {
                t.q().zzu(e13, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e14) {
                zzbza.zzh("Error registering activity lifecycle callbacks.", e14);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzj(3);
        zzk();
    }

    public final void onActivityPaused(Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzk();
    }

    public final void onActivityResumed(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzj(3);
        zzk();
    }

    public final void onActivityStarted(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    public final void onActivityStopped(Activity activity) {
        zzj(3);
        zzk();
    }

    public final void onGlobalLayout() {
        zzj(2);
        zzk();
    }

    public final void onScrollChanged() {
        zzj(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzm = -1;
        zzj(3);
        zzk();
        zzm(view);
    }

    /* access modifiers changed from: package-private */
    public final Rect zza(Rect rect) {
        return new Rect(zzh(rect.left), zzh(rect.top), zzh(rect.right), zzh(rect.bottom));
    }

    public final void zzc(zzatf zzatf) {
        this.zzn.add(zzatf);
        zzj(3);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzj(3);
    }

    public final void zze(zzatf zzatf) {
        this.zzn.remove(zzatf);
    }

    public final void zzf() {
        this.zzk.a(zzc);
    }

    public final void zzg(long j10) {
        this.zzk.a(j10);
    }
}
