package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.s;
import io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;
import io.flutter.plugin.editing.c;
import java.util.HashMap;
import kc.q;

/* compiled from: TextInputPlugin */
public class f implements c.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f33651a;

    /* renamed from: b  reason: collision with root package name */
    private final InputMethodManager f33652b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f33653c;

    /* renamed from: d  reason: collision with root package name */
    private final q f33654d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public d f33655e = new d(d.a.NO_TARGET, 0);

    /* renamed from: f  reason: collision with root package name */
    private q.b f33656f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray<q.b> f33657g;

    /* renamed from: h  reason: collision with root package name */
    private c f33658h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f33659i;

    /* renamed from: j  reason: collision with root package name */
    private InputConnection f33660j;

    /* renamed from: k  reason: collision with root package name */
    private io.flutter.plugin.platform.q f33661k;

    /* renamed from: l  reason: collision with root package name */
    private Rect f33662l;

    /* renamed from: m  reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f33663m;

    /* renamed from: n  reason: collision with root package name */
    private q.e f33664n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f33665o;

    /* compiled from: TextInputPlugin */
    class a implements ImeSyncDeferringInsetsCallback.b {
        a() {
        }

        public void a(boolean z10) {
            if (!z10) {
                f.this.z();
            }
        }
    }

    /* compiled from: TextInputPlugin */
    class b implements q.f {
        b() {
        }

        public void a(String str, Bundle bundle) {
            f.this.C(str, bundle);
        }

        public void b(int i10, boolean z10) {
            f.this.D(i10, z10);
        }

        public void c(double d10, double d11, double[] dArr) {
            f.this.B(d10, d11, dArr);
        }

        public void d(int i10, q.b bVar) {
            f.this.E(i10, bVar);
        }

        public void e(q.e eVar) {
            f fVar = f.this;
            fVar.F(fVar.f33651a, eVar);
        }

        public void f() {
            f.this.x();
        }

        public void g(boolean z10) {
            if (Build.VERSION.SDK_INT >= 26 && f.this.f33653c != null) {
                if (z10) {
                    f.this.f33653c.commit();
                } else {
                    f.this.f33653c.cancel();
                }
            }
        }

        public void h() {
            f.this.m();
        }

        public void i() {
            if (f.this.f33655e.f33672a == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                f.this.y();
                return;
            }
            f fVar = f.this;
            fVar.s(fVar.f33651a);
        }

        public void show() {
            f fVar = f.this;
            fVar.G(fVar.f33651a);
        }
    }

    /* compiled from: TextInputPlugin */
    class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f33668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double[] f33669b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double[] f33670c;

        c(boolean z10, double[] dArr, double[] dArr2) {
            this.f33668a = z10;
            this.f33669b = dArr;
            this.f33670c = dArr2;
        }

        public void a(double d10, double d11) {
            double d12 = 1.0d;
            if (!this.f33668a) {
                double[] dArr = this.f33669b;
                d12 = 1.0d / (((dArr[3] * d10) + (dArr[7] * d11)) + dArr[15]);
            }
            double[] dArr2 = this.f33669b;
            double d13 = ((dArr2[0] * d10) + (dArr2[4] * d11) + dArr2[12]) * d12;
            double d14 = ((dArr2[1] * d10) + (dArr2[5] * d11) + dArr2[13]) * d12;
            double[] dArr3 = this.f33670c;
            if (d13 < dArr3[0]) {
                dArr3[0] = d13;
            } else if (d13 > dArr3[1]) {
                dArr3[1] = d13;
            }
            if (d14 < dArr3[2]) {
                dArr3[2] = d14;
            } else if (d14 > dArr3[3]) {
                dArr3[3] = d14;
            }
        }
    }

    /* compiled from: TextInputPlugin */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        a f33672a;

        /* renamed from: b  reason: collision with root package name */
        int f33673b;

        /* compiled from: TextInputPlugin */
        enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public d(a aVar, int i10) {
            this.f33672a = aVar;
            this.f33673b = i10;
        }
    }

    /* compiled from: TextInputPlugin */
    private interface e {
        void a(double d10, double d11);
    }

    public f(View view, q qVar, io.flutter.plugin.platform.q qVar2) {
        this.f33651a = view;
        this.f33658h = new c((q.e) null, view);
        this.f33652b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f33653c = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        } else {
            this.f33653c = null;
        }
        if (i10 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f33663m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            this.f33663m.setImeVisibleListener(new a());
        }
        this.f33654d = qVar;
        qVar.o(new b());
        qVar.l();
        this.f33661k = qVar2;
        qVar2.E(this);
    }

    /* access modifiers changed from: private */
    public void B(double d10, double d11, double[] dArr) {
        double d12 = d10;
        double d13 = d11;
        double[] dArr2 = dArr;
        double[] dArr3 = new double[4];
        boolean z10 = dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d;
        double d14 = dArr2[12] / dArr2[15];
        dArr3[1] = d14;
        dArr3[0] = d14;
        double d15 = dArr2[13] / dArr2[15];
        dArr3[3] = d15;
        dArr3[2] = d15;
        c cVar = new c(z10, dArr2, dArr3);
        cVar.a(d12, 0.0d);
        cVar.a(d12, d13);
        cVar.a(0.0d, d13);
        Float valueOf = Float.valueOf(this.f33651a.getContext().getResources().getDisplayMetrics().density);
        this.f33662l = new Rect((int) (dArr3[0] * ((double) valueOf.floatValue())), (int) (dArr3[2] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[1] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[3] * ((double) valueOf.floatValue())));
    }

    /* access modifiers changed from: private */
    public void D(int i10, boolean z10) {
        if (z10) {
            this.f33651a.requestFocus();
            this.f33655e = new d(d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i10);
            this.f33652b.restartInput(this.f33651a);
            this.f33659i = false;
            return;
        }
        this.f33655e = new d(d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i10);
        this.f33660j = null;
    }

    private void I(q.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (bVar == null || bVar.f35962j == null) {
                this.f33657g = null;
                return;
            }
            q.b[] bVarArr = bVar.f35964l;
            SparseArray<q.b> sparseArray = new SparseArray<>();
            this.f33657g = sparseArray;
            if (bVarArr == null) {
                sparseArray.put(bVar.f35962j.f35965a.hashCode(), bVar);
                return;
            }
            for (q.b bVar2 : bVarArr) {
                q.b.a aVar = bVar2.f35962j;
                if (aVar != null) {
                    this.f33657g.put(aVar.f35965a.hashCode(), bVar2);
                    this.f33653c.notifyValueChanged(this.f33651a, aVar.f35965a.hashCode(), AutofillValue.forText(aVar.f35967c.f35978a));
                }
            }
        }
    }

    private boolean k() {
        q.c cVar;
        q.b bVar = this.f33656f;
        if (bVar == null || (cVar = bVar.f35959g) == null || cVar.f35969a != q.g.NONE) {
            return true;
        }
        return false;
    }

    private static boolean n(q.e eVar, q.e eVar2) {
        int i10 = eVar.f35982e - eVar.f35981d;
        if (i10 != eVar2.f35982e - eVar2.f35981d) {
            return true;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (eVar.f35978a.charAt(eVar.f35981d + i11) != eVar2.f35978a.charAt(eVar2.f35981d + i11)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f33652b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(q.c cVar, boolean z10, boolean z11, boolean z12, boolean z13, q.d dVar) {
        q.g gVar = cVar.f35969a;
        if (gVar == q.g.DATETIME) {
            return 4;
        }
        if (gVar == q.g.NUMBER) {
            int i10 = 2;
            if (cVar.f35970b) {
                i10 = 4098;
            }
            return cVar.f35971c ? i10 | 8192 : i10;
        } else if (gVar == q.g.PHONE) {
            return 3;
        } else {
            if (gVar == q.g.NONE) {
                return 0;
            }
            int i11 = 1;
            if (gVar == q.g.MULTILINE) {
                i11 = 131073;
            } else if (gVar == q.g.EMAIL_ADDRESS) {
                i11 = 33;
            } else if (gVar == q.g.URL) {
                i11 = 17;
            } else if (gVar == q.g.VISIBLE_PASSWORD) {
                i11 = 145;
            } else if (gVar == q.g.NAME) {
                i11 = 97;
            } else if (gVar == q.g.POSTAL_ADDRESS) {
                i11 = 113;
            }
            if (z10) {
                i11 = i11 | 524288 | 128;
            } else {
                if (z11) {
                    i11 |= 32768;
                }
                if (!z12) {
                    i11 |= 524288;
                }
            }
            if (dVar == q.d.CHARACTERS) {
                return i11 | 4096;
            }
            if (dVar == q.d.WORDS) {
                return i11 | 8192;
            }
            return dVar == q.d.SENTENCES ? i11 | 16384 : i11;
        }
    }

    private boolean v() {
        return this.f33657g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT >= 26 && this.f33653c != null && v()) {
            this.f33653c.notifyValueChanged(this.f33651a, this.f33656f.f35962j.f35965a.hashCode(), AutofillValue.forText(str));
        }
    }

    /* access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT >= 26 && this.f33653c != null && v()) {
            String str = this.f33656f.f35962j.f35965a;
            int[] iArr = new int[2];
            this.f33651a.getLocationOnScreen(iArr);
            Rect rect = new Rect(this.f33662l);
            rect.offset(iArr[0], iArr[1]);
            this.f33653c.notifyViewEntered(this.f33651a, str.hashCode(), rect);
        }
    }

    /* access modifiers changed from: private */
    public void y() {
        q.b bVar;
        if (Build.VERSION.SDK_INT >= 26 && this.f33653c != null && (bVar = this.f33656f) != null && bVar.f35962j != null && v()) {
            this.f33653c.notifyViewExited(this.f33651a, this.f33656f.f35962j.f35965a.hashCode());
        }
    }

    public void A(ViewStructure viewStructure, int i10) {
        Rect rect;
        ViewStructure viewStructure2 = viewStructure;
        if (Build.VERSION.SDK_INT >= 26 && v()) {
            String str = this.f33656f.f35962j.f35965a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i11 = 0; i11 < this.f33657g.size(); i11++) {
                int keyAt = this.f33657g.keyAt(i11);
                q.b.a aVar = this.f33657g.valueAt(i11).f35962j;
                if (aVar != null) {
                    viewStructure2.addChildCount(1);
                    ViewStructure newChild = viewStructure2.newChild(i11);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = aVar.f35966b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = aVar.f35968d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.f33662l) == null) {
                        ViewStructure viewStructure3 = newChild;
                        viewStructure3.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructure3.setAutofillValue(AutofillValue.forText(aVar.f35967c.f35978a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f33662l.height());
                        newChild.setAutofillValue(AutofillValue.forText(this.f33658h));
                    }
                }
            }
        }
    }

    public void C(String str, Bundle bundle) {
        this.f33652b.sendAppPrivateCommand(this.f33651a, str, bundle);
    }

    /* access modifiers changed from: package-private */
    public void E(int i10, q.b bVar) {
        y();
        this.f33656f = bVar;
        if (k()) {
            this.f33655e = new d(d.a.FRAMEWORK_CLIENT, i10);
        } else {
            this.f33655e = new d(d.a.NO_TARGET, i10);
        }
        this.f33658h.l(this);
        q.b.a aVar = bVar.f35962j;
        this.f33658h = new c(aVar != null ? aVar.f35967c : null, this.f33651a);
        I(bVar);
        this.f33659i = true;
        H();
        this.f33662l = null;
        this.f33658h.a(this);
    }

    /* access modifiers changed from: package-private */
    public void F(View view, q.e eVar) {
        q.e eVar2;
        if (!this.f33659i && (eVar2 = this.f33664n) != null && eVar2.b()) {
            boolean n10 = n(this.f33664n, eVar);
            this.f33659i = n10;
            if (n10) {
                xb.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f33664n = eVar;
        this.f33658h.n(eVar);
        if (this.f33659i) {
            this.f33652b.restartInput(view);
            this.f33659i = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void G(View view) {
        if (k()) {
            view.requestFocus();
            this.f33652b.showSoftInput(view, 0);
            return;
        }
        s(view);
    }

    public void H() {
        if (this.f33655e.f33672a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f33665o = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r7 == r1.f35982e) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x000b
            io.flutter.plugin.editing.c r9 = r8.f33658h
            java.lang.String r9 = r9.toString()
            r8.w(r9)
        L_0x000b:
            io.flutter.plugin.editing.c r9 = r8.f33658h
            int r9 = r9.i()
            io.flutter.plugin.editing.c r10 = r8.f33658h
            int r10 = r10.h()
            io.flutter.plugin.editing.c r11 = r8.f33658h
            int r11 = r11.g()
            io.flutter.plugin.editing.c r0 = r8.f33658h
            int r7 = r0.f()
            io.flutter.plugin.editing.c r0 = r8.f33658h
            java.util.ArrayList r0 = r0.e()
            kc.q$e r1 = r8.f33664n
            if (r1 == 0) goto L_0x0052
            io.flutter.plugin.editing.c r1 = r8.f33658h
            java.lang.String r1 = r1.toString()
            kc.q$e r2 = r8.f33664n
            java.lang.String r2 = r2.f35978a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0050
            kc.q$e r1 = r8.f33664n
            int r2 = r1.f35979b
            if (r9 != r2) goto L_0x0050
            int r2 = r1.f35980c
            if (r10 != r2) goto L_0x0050
            int r2 = r1.f35981d
            if (r11 != r2) goto L_0x0050
            int r1 = r1.f35982e
            if (r7 != r1) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r1 = 0
            goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            if (r1 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.c r2 = r8.f33658h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            xb.b.f(r2, r1)
            kc.q$b r1 = r8.f33656f
            boolean r1 = r1.f35957e
            if (r1 == 0) goto L_0x0086
            kc.q r1 = r8.f33654d
            io.flutter.plugin.editing.f$d r2 = r8.f33655e
            int r2 = r2.f33673b
            r1.r(r2, r0)
            io.flutter.plugin.editing.c r0 = r8.f33658h
            r0.c()
            goto L_0x0099
        L_0x0086:
            kc.q r0 = r8.f33654d
            io.flutter.plugin.editing.f$d r1 = r8.f33655e
            int r1 = r1.f33673b
            io.flutter.plugin.editing.c r2 = r8.f33658h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.q(r1, r2, r3, r4, r5, r6)
        L_0x0099:
            kc.q$e r6 = new kc.q$e
            io.flutter.plugin.editing.c r0 = r8.f33658h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f33664n = r6
            goto L_0x00b1
        L_0x00ac:
            io.flutter.plugin.editing.c r9 = r8.f33658h
            r9.c()
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.f.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        q.b bVar;
        q.b.a aVar;
        q.b.a aVar2;
        if (Build.VERSION.SDK_INT >= 26 && (bVar = this.f33656f) != null && this.f33657g != null && (aVar = bVar.f35962j) != null) {
            HashMap hashMap = new HashMap();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                q.b bVar2 = this.f33657g.get(sparseArray.keyAt(i10));
                if (!(bVar2 == null || (aVar2 = bVar2.f35962j) == null)) {
                    String charSequence = sparseArray.valueAt(i10).getTextValue().toString();
                    q.e eVar = new q.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (aVar2.f35965a.equals(aVar.f35965a)) {
                        this.f33658h.n(eVar);
                    } else {
                        hashMap.put(aVar2.f35965a, eVar);
                    }
                }
            }
            this.f33654d.s(this.f33655e.f33673b, hashMap);
        }
    }

    public void l(int i10) {
        d dVar = this.f33655e;
        d.a aVar = dVar.f33672a;
        if ((aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && dVar.f33673b == i10) {
            this.f33655e = new d(d.a.NO_TARGET, 0);
            y();
            this.f33652b.hideSoftInputFromWindow(this.f33651a.getApplicationWindowToken(), 0);
            this.f33652b.restartInput(this.f33651a);
            this.f33659i = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (this.f33655e.f33672a != d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f33658h.l(this);
            y();
            this.f33656f = null;
            I((q.b) null);
            this.f33655e = new d(d.a.NO_TARGET, 0);
            H();
            this.f33662l = null;
        }
    }

    public InputConnection o(View view, s sVar, EditorInfo editorInfo) {
        int i10;
        d dVar = this.f33655e;
        d.a aVar = dVar.f33672a;
        if (aVar == d.a.NO_TARGET) {
            this.f33660j = null;
            return null;
        } else if (aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (aVar != d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                q.b bVar = this.f33656f;
                int t10 = t(bVar.f35959g, bVar.f35953a, bVar.f35954b, bVar.f35955c, bVar.f35956d, bVar.f35958f);
                editorInfo.inputType = t10;
                editorInfo.imeOptions = 33554432;
                if (Build.VERSION.SDK_INT >= 26 && !this.f33656f.f35956d) {
                    editorInfo.imeOptions = 33554432 | 16777216;
                }
                Integer num = this.f33656f.f35960h;
                if (num == null) {
                    i10 = (t10 & 131072) != 0 ? 1 : 6;
                } else {
                    i10 = num.intValue();
                }
                q.b bVar2 = this.f33656f;
                String str = bVar2.f35961i;
                if (str != null) {
                    editorInfo.actionLabel = str;
                    editorInfo.actionId = i10;
                }
                editorInfo.imeOptions = i10 | editorInfo.imeOptions;
                String[] strArr = bVar2.f35963k;
                if (strArr != null) {
                    c0.a.d(editorInfo, strArr);
                }
                b bVar3 = new b(view, this.f33655e.f33673b, this.f33654d, sVar, this.f33658h, editorInfo);
                editorInfo.initialSelStart = this.f33658h.i();
                editorInfo.initialSelEnd = this.f33658h.h();
                this.f33660j = bVar3;
                return bVar3;
            } else if (this.f33665o) {
                return this.f33660j;
            } else {
                InputConnection onCreateInputConnection = this.f33661k.b(dVar.f33673b).onCreateInputConnection(editorInfo);
                this.f33660j = onCreateInputConnection;
                return onCreateInputConnection;
            }
        }
    }

    public void p() {
        this.f33661k.R();
        this.f33654d.o((q.f) null);
        y();
        this.f33658h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f33663m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f33652b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f33660j) == null) {
            return false;
        }
        if (inputConnection instanceof b) {
            return ((b) inputConnection).f(keyEvent);
        }
        return inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f33655e.f33672a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f33665o = true;
        }
    }

    public void z() {
        this.f33654d.i(this.f33655e.f33673b);
    }
}
