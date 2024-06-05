package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f3085c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f3086a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f3087b;

    /* renamed from: androidx.core.view.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C0044a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f3088a;

        C0044a(a aVar) {
            this.f3088a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3088a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d b10 = this.f3088a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3088a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c v02 = c.v0(accessibilityNodeInfo);
            v02.n0(a0.U(view));
            v02.h0(a0.P(view));
            v02.k0(a0.p(view));
            v02.r0(a0.I(view));
            this.f3088a.g(view, v02);
            v02.e(accessibilityNodeInfo.getText(), view);
            List<c.a> c10 = a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                v02.b(c10.get(i10));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3088a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3088a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f3088a.j(view, i10, bundle);
        }

        public void sendAccessibilityEvent(View view, int i10) {
            this.f3088a.l(view, i10);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3088a.m(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat */
    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(f3085c);
    }

    static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(z.d.P);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] p10 = c.p(view.createAccessibilityNodeInfo().getText());
            int i10 = 0;
            while (p10 != null && i10 < p10.length) {
                if (clickableSpan.equals(p10[i10])) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(z.d.Q);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3086a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public d b(View view) {
        AccessibilityNodeProvider a10;
        if (Build.VERSION.SDK_INT < 16 || (a10 = b.a(this.f3086a, view)) == null) {
            return null;
        }
        return new d(a10);
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f3087b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f3086a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, c cVar) {
        this.f3086a.onInitializeAccessibilityNodeInfo(view, cVar.u0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f3086a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3086a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<c.a> c10 = c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            c.a aVar = c10.get(i11);
            if (aVar.b() == i10) {
                z10 = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10 && Build.VERSION.SDK_INT >= 16) {
            z10 = b.b(this.f3086a, view, i10, bundle);
        }
        return (z10 || i10 != z.d.f24042a || bundle == null) ? z10 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f3086a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f3086a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3086a = accessibilityDelegate;
        this.f3087b = new C0044a(this);
    }
}
