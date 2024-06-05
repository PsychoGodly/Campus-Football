package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.n;
import androidx.core.view.l0;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileNotFoundException;
import java.util.List;
import kc.j;

/* compiled from: PlatformPlugin */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f33694a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final j f33695b;

    /* renamed from: c  reason: collision with root package name */
    private final d f33696c;

    /* renamed from: d  reason: collision with root package name */
    private j.C0408j f33697d;

    /* renamed from: e  reason: collision with root package name */
    private int f33698e = 1280;

    /* renamed from: f  reason: collision with root package name */
    final j.h f33699f;

    /* compiled from: PlatformPlugin */
    class a implements j.h {
        a() {
        }

        public void a() {
            c.this.s();
        }

        public void b(j.c cVar) {
            c.this.w(cVar);
        }

        public void c(List<j.l> list) {
            c.this.z(list);
        }

        public void d(j.C0408j jVar) {
            c.this.B(jVar);
        }

        public void e(boolean z10) {
            c.this.v(z10);
        }

        public void f(j.k kVar) {
            c.this.y(kVar);
        }

        public void g(String str) {
            c.this.u(str);
        }

        public void h(j.i iVar) {
            c.this.r(iVar);
        }

        public void i(j.g gVar) {
            c.this.D(gVar);
        }

        public void j() {
            c.this.x();
        }

        public void k() {
            c.this.t();
        }

        public CharSequence l(j.e eVar) {
            return c.this.q(eVar);
        }

        public void m(int i10) {
            c.this.A(i10);
        }

        public boolean n() {
            return c.this.o();
        }
    }

    /* compiled from: PlatformPlugin */
    class b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f33701a;

        b(View view) {
            this.f33701a = view;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            if ((i10 & 4) == 0) {
                c.this.f33695b.m(true);
            } else {
                c.this.f33695b.m(false);
            }
        }

        public void onSystemUiVisibilityChange(int i10) {
            this.f33701a.post(new d(this, i10));
        }
    }

    /* renamed from: io.flutter.plugin.platform.c$c  reason: collision with other inner class name */
    /* compiled from: PlatformPlugin */
    static /* synthetic */ class C0383c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33703a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f33704b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f33705c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        static {
            /*
                kc.j$d[] r0 = kc.j.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33705c = r0
                r1 = 1
                kc.j$d r2 = kc.j.d.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f33705c     // Catch:{ NoSuchFieldError -> 0x001d }
                kc.j$d r3 = kc.j.d.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                kc.j$l[] r2 = kc.j.l.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f33704b = r2
                kc.j$l r3 = kc.j.l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f33704b     // Catch:{ NoSuchFieldError -> 0x0038 }
                kc.j$l r3 = kc.j.l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                kc.j$g[] r2 = kc.j.g.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f33703a = r2
                kc.j$g r3 = kc.j.g.STANDARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f33703a     // Catch:{ NoSuchFieldError -> 0x0053 }
                kc.j$g r2 = kc.j.g.LIGHT_IMPACT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f33703a     // Catch:{ NoSuchFieldError -> 0x005e }
                kc.j$g r1 = kc.j.g.MEDIUM_IMPACT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f33703a     // Catch:{ NoSuchFieldError -> 0x0069 }
                kc.j$g r1 = kc.j.g.HEAVY_IMPACT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f33703a     // Catch:{ NoSuchFieldError -> 0x0074 }
                kc.j$g r1 = kc.j.g.SELECTION_CLICK     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.c.C0383c.<clinit>():void");
        }
    }

    /* compiled from: PlatformPlugin */
    public interface d {
        boolean a();

        void e(boolean z10);
    }

    public c(Activity activity, j jVar, d dVar) {
        a aVar = new a();
        this.f33699f = aVar;
        this.f33694a = activity;
        this.f33695b = jVar;
        jVar.l(aVar);
        this.f33696c = dVar;
    }

    /* access modifiers changed from: private */
    public void A(int i10) {
        this.f33694a.setRequestedOrientation(i10);
    }

    /* access modifiers changed from: private */
    public void B(j.C0408j jVar) {
        Window window = this.f33694a.getWindow();
        l0 l0Var = new l0(window, window.getDecorView());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.clearFlags(201326592);
        }
        if (i10 >= 23) {
            j.d dVar = jVar.f35872b;
            if (dVar != null) {
                int i11 = C0383c.f33705c[dVar.ordinal()];
                if (i11 == 1) {
                    l0Var.b(true);
                } else if (i11 == 2) {
                    l0Var.b(false);
                }
            }
            Integer num = jVar.f35871a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = jVar.f35873c;
        if (bool != null && i10 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i10 >= 26) {
            j.d dVar2 = jVar.f35875e;
            if (dVar2 != null) {
                int i12 = C0383c.f33705c[dVar2.ordinal()];
                if (i12 == 1) {
                    l0Var.a(true);
                } else if (i12 == 2) {
                    l0Var.a(false);
                }
            }
            Integer num2 = jVar.f35874d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f35876f;
        if (num3 != null && i10 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f35877g;
        if (bool2 != null && i10 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f33697d = jVar;
    }

    /* access modifiers changed from: private */
    public boolean o() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f33694a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* access modifiers changed from: private */
    public CharSequence q(j.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f33694a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null) {
                if (eVar != j.e.PLAIN_TEXT) {
                    return null;
                }
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f33694a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", (Bundle) null);
            }
            return itemAt.coerceToText(this.f33694a);
        } catch (SecurityException e10) {
            xb.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e10);
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void r(j.i iVar) {
        if (iVar == j.i.CLICK) {
            this.f33694a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* access modifiers changed from: private */
    public void s() {
        d dVar = this.f33696c;
        if (dVar == null || !dVar.a()) {
            Activity activity = this.f33694a;
            if (activity instanceof n) {
                ((n) activity).getOnBackPressedDispatcher().e();
            } else {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    public void t() {
        C();
    }

    /* access modifiers changed from: private */
    public void u(String str) {
        ((ClipboardManager) this.f33694a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* access modifiers changed from: private */
    public void v(boolean z10) {
        this.f33696c.e(z10);
    }

    /* access modifiers changed from: private */
    public void w(j.c cVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            if (i10 < 28 && i10 > 21) {
                this.f33694a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f35846b, (Bitmap) null, cVar.f35845a));
            }
            if (i10 >= 28) {
                this.f33694a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f35846b, 0, cVar.f35845a));
            }
        }
    }

    /* access modifiers changed from: private */
    public void x() {
        View decorView = this.f33694a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    /* access modifiers changed from: private */
    public void y(j.k kVar) {
        int i10;
        if (kVar == j.k.LEAN_BACK) {
            i10 = 1798;
        } else if (kVar == j.k.IMMERSIVE && Build.VERSION.SDK_INT >= 19) {
            i10 = 3846;
        } else if (kVar == j.k.IMMERSIVE_STICKY && Build.VERSION.SDK_INT >= 19) {
            i10 = 5894;
        } else if (kVar == j.k.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            i10 = 1792;
        } else {
            return;
        }
        this.f33698e = i10;
        C();
    }

    /* access modifiers changed from: private */
    public void z(List<j.l> list) {
        int i10 = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = C0383c.f33704b[list.get(i11).ordinal()];
            if (i12 == 1) {
                i10 &= -5;
            } else if (i12 == 2) {
                i10 = i10 & -513 & -3;
            }
        }
        this.f33698e = i10;
        C();
    }

    public void C() {
        this.f33694a.getWindow().getDecorView().setSystemUiVisibility(this.f33698e);
        j.C0408j jVar = this.f33697d;
        if (jVar != null) {
            B(jVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void D(j.g gVar) {
        View decorView = this.f33694a.getWindow().getDecorView();
        int i10 = C0383c.f33703a[gVar.ordinal()];
        if (i10 == 1) {
            decorView.performHapticFeedback(0);
        } else if (i10 == 2) {
            decorView.performHapticFeedback(1);
        } else if (i10 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i10 != 4) {
            if (i10 == 5 && Build.VERSION.SDK_INT >= 21) {
                decorView.performHapticFeedback(4);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            decorView.performHapticFeedback(6);
        }
    }

    public void p() {
        this.f33695b.l((j.h) null);
    }
}
