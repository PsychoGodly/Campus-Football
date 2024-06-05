package h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import h1.a;
import h1.m;

/* compiled from: Visibility */
public abstract class j0 extends m {
    private static final String[] M = {"android:visibility:visibility", "android:visibility:parent"};
    private int L = 3;

    /* compiled from: Visibility */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f18630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f18631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f18632c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f18630a = viewGroup;
            this.f18631b = view;
            this.f18632c = view2;
        }

        public void a(m mVar) {
            this.f18632c.setTag(j.save_overlay_view, (Object) null);
            x.a(this.f18630a).d(this.f18631b);
            mVar.U(this);
        }

        public void b(m mVar) {
            x.a(this.f18630a).d(this.f18631b);
        }

        public void e(m mVar) {
            if (this.f18631b.getParent() == null) {
                x.a(this.f18630a).c(this.f18631b);
            } else {
                j0.this.f();
            }
        }
    }

    /* compiled from: Visibility */
    private static class b extends AnimatorListenerAdapter implements m.f, a.C0197a {

        /* renamed from: a  reason: collision with root package name */
        private final View f18634a;

        /* renamed from: b  reason: collision with root package name */
        private final int f18635b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f18636c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f18637d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f18638e;

        /* renamed from: f  reason: collision with root package name */
        boolean f18639f = false;

        b(View view, int i10, boolean z10) {
            this.f18634a = view;
            this.f18635b = i10;
            this.f18636c = (ViewGroup) view.getParent();
            this.f18637d = z10;
            g(true);
        }

        private void f() {
            if (!this.f18639f) {
                c0.h(this.f18634a, this.f18635b);
                ViewGroup viewGroup = this.f18636c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (this.f18637d && this.f18638e != z10 && (viewGroup = this.f18636c) != null) {
                this.f18638e = z10;
                x.c(viewGroup, z10);
            }
        }

        public void a(m mVar) {
            f();
            mVar.U(this);
        }

        public void b(m mVar) {
            g(false);
        }

        public void c(m mVar) {
        }

        public void d(m mVar) {
        }

        public void e(m mVar) {
            g(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f18639f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f18639f) {
                c0.h(this.f18634a, this.f18635b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f18639f) {
                c0.h(this.f18634a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f18640a;

        /* renamed from: b  reason: collision with root package name */
        boolean f18641b;

        /* renamed from: c  reason: collision with root package name */
        int f18642c;

        /* renamed from: d  reason: collision with root package name */
        int f18643d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f18644e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f18645f;

        c() {
        }
    }

    private void h0(s sVar) {
        sVar.f18697a.put("android:visibility:visibility", Integer.valueOf(sVar.f18698b.getVisibility()));
        sVar.f18697a.put("android:visibility:parent", sVar.f18698b.getParent());
        int[] iArr = new int[2];
        sVar.f18698b.getLocationOnScreen(iArr);
        sVar.f18697a.put("android:visibility:screenLocation", iArr);
    }

    private c i0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f18640a = false;
        cVar.f18641b = false;
        if (sVar == null || !sVar.f18697a.containsKey("android:visibility:visibility")) {
            cVar.f18642c = -1;
            cVar.f18644e = null;
        } else {
            cVar.f18642c = ((Integer) sVar.f18697a.get("android:visibility:visibility")).intValue();
            cVar.f18644e = (ViewGroup) sVar.f18697a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f18697a.containsKey("android:visibility:visibility")) {
            cVar.f18643d = -1;
            cVar.f18645f = null;
        } else {
            cVar.f18643d = ((Integer) sVar2.f18697a.get("android:visibility:visibility")).intValue();
            cVar.f18645f = (ViewGroup) sVar2.f18697a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i10 = cVar.f18642c;
            int i11 = cVar.f18643d;
            if (i10 == i11 && cVar.f18644e == cVar.f18645f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f18641b = false;
                    cVar.f18640a = true;
                } else if (i11 == 0) {
                    cVar.f18641b = true;
                    cVar.f18640a = true;
                }
            } else if (cVar.f18645f == null) {
                cVar.f18641b = false;
                cVar.f18640a = true;
            } else if (cVar.f18644e == null) {
                cVar.f18641b = true;
                cVar.f18640a = true;
            }
        } else if (sVar == null && cVar.f18643d == 0) {
            cVar.f18641b = true;
            cVar.f18640a = true;
        } else if (sVar2 == null && cVar.f18642c == 0) {
            cVar.f18641b = false;
            cVar.f18640a = true;
        }
        return cVar;
    }

    public String[] I() {
        return M;
    }

    public boolean K(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f18697a.containsKey("android:visibility:visibility") != sVar.f18697a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c i02 = i0(sVar, sVar2);
        if (!i02.f18640a) {
            return false;
        }
        if (i02.f18642c == 0 || i02.f18643d == 0) {
            return true;
        }
        return false;
    }

    public void g(s sVar) {
        h0(sVar);
    }

    public abstract Animator j0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public void k(s sVar) {
        h0(sVar);
    }

    public Animator k0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.L & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f18698b.getParent();
            if (i0(x(view, false), J(view, false)).f18640a) {
                return null;
            }
        }
        return j0(viewGroup, sVar2.f18698b, sVar, sVar2);
    }

    public abstract Animator l0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f18673x != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator m0(android.view.ViewGroup r18, h1.s r19, int r20, h1.s r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.L
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f18698b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f18698b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = h1.j.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            h1.s r14 = r0.J(r13, r12)
            h1.s r15 = r0.x(r13, r12)
            h1.j0$c r14 = r0.i0(r14, r15)
            boolean r14 = r14.f18640a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = h1.r.a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f18673x
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f18697a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            h1.w r4 = h1.x.a(r18)
            r4.c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.l0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            h1.w r1 = h1.x.a(r18)
            r1.d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            h1.j0$a r3 = new h1.j0$a
            r3.<init>(r1, r10, r5)
            r0.a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            h1.c0.h(r8, r11)
            android.animation.Animator r1 = r0.l0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            h1.j0$b r2 = new h1.j0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            h1.a.a(r1, r2)
            r0.a(r2)
            goto L_0x0106
        L_0x0103:
            h1.c0.h(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.j0.m0(android.view.ViewGroup, h1.s, int, h1.s, int):android.animation.Animator");
    }

    public void n0(int i10) {
        if ((i10 & -4) == 0) {
            this.L = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c i02 = i0(sVar, sVar2);
        if (!i02.f18640a) {
            return null;
        }
        if (i02.f18644e == null && i02.f18645f == null) {
            return null;
        }
        if (i02.f18641b) {
            return k0(viewGroup, sVar, i02.f18642c, sVar2, i02.f18643d);
        }
        return m0(viewGroup, sVar, i02.f18642c, sVar2, i02.f18643d);
    }
}
