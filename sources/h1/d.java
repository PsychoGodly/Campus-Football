package h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;

/* compiled from: Fade */
public class d extends j0 {

    /* compiled from: Fade */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f18597a;

        a(View view) {
            this.f18597a = view;
        }

        public void a(m mVar) {
            c0.g(this.f18597a, 1.0f);
            c0.a(this.f18597a);
            mVar.U(this);
        }
    }

    /* compiled from: Fade */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f18599a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f18600b = false;

        b(View view) {
            this.f18599a = view;
        }

        public void onAnimationEnd(Animator animator) {
            c0.g(this.f18599a, 1.0f);
            if (this.f18600b) {
                this.f18599a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (a0.N(this.f18599a) && this.f18599a.getLayerType() == 0) {
                this.f18600b = true;
                this.f18599a.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i10) {
        n0(i10);
    }

    private Animator o0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        c0.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.f18595b, new float[]{f11});
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f18697a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float p0(h1.s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f18697a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.d.p0(h1.s, float):float");
    }

    public Animator j0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f10 = 0.0f;
        float p02 = p0(sVar, 0.0f);
        if (p02 != 1.0f) {
            f10 = p02;
        }
        return o0(view, f10, 1.0f);
    }

    public void k(s sVar) {
        super.k(sVar);
        sVar.f18697a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f18698b)));
    }

    public Animator l0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return o0(view, p0(sVar, 1.0f), 0.0f);
    }
}
