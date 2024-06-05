package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l0.c;

/* compiled from: FragmentLayoutInflaterFactory */
class l implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    final n f3627a;

    /* compiled from: FragmentLayoutInflaterFactory */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f3628a;

        a(u uVar) {
            this.f3628a = uVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k10 = this.f3628a.k();
            this.f3628a.m();
            c0.n((ViewGroup) k10.I.getParent(), l.this.f3627a).j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    l(n nVar) {
        this.f3627a = nVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        u uVar;
        if (h.class.getName().equals(str)) {
            return new h(context, attributeSet, this.f3627a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f19851d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.f19852e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.f19853f, -1);
        String string = obtainStyledAttributes.getString(c.f19854g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !j.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f3627a.h0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3627a.i0(string);
        }
        if (fragment == null && id2 != -1) {
            fragment = this.f3627a.h0(id2);
        }
        if (fragment == null) {
            fragment = this.f3627a.q0().a(context.getClassLoader(), attributeValue);
            fragment.f3432o = true;
            fragment.f3441x = resourceId != 0 ? resourceId : id2;
            fragment.f3442y = id2;
            fragment.f3443z = string;
            fragment.f3433p = true;
            n nVar = this.f3627a;
            fragment.f3437t = nVar;
            fragment.f3438u = nVar.t0();
            fragment.y0(this.f3627a.t0().f(), attributeSet, fragment.f3420b);
            uVar = this.f3627a.g(fragment);
            if (n.F0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!fragment.f3433p) {
            fragment.f3433p = true;
            n nVar2 = this.f3627a;
            fragment.f3437t = nVar2;
            fragment.f3438u = nVar2.t0();
            fragment.y0(this.f3627a.t0().f(), attributeSet, fragment.f3420b);
            uVar = this.f3627a.v(fragment);
            if (n.F0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
        }
        fragment.H = (ViewGroup) view;
        uVar.m();
        uVar.j();
        View view2 = fragment.I;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.I.getTag() == null) {
                fragment.I.setTag(string);
            }
            fragment.I.addOnAttachStateChangeListener(new a(uVar));
            return fragment.I;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
