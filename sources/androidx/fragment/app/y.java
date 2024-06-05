package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21 */
class y extends z {

    /* compiled from: FragmentTransitionCompat21 */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f3793a;

        a(Rect rect) {
            this.f3793a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f3793a;
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f3795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f3796b;

        b(View view, ArrayList arrayList) {
            this.f3795a = view;
            this.f3796b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3795a.setVisibility(8);
            int size = this.f3796b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f3796b.get(i10)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f3798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f3799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f3800c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f3801d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f3802e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f3803f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3798a = obj;
            this.f3799b = arrayList;
            this.f3800c = obj2;
            this.f3801d = arrayList2;
            this.f3802e = obj3;
            this.f3803f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f3798a;
            if (obj != null) {
                y.this.q(obj, this.f3799b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3800c;
            if (obj2 != null) {
                y.this.q(obj2, this.f3801d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3802e;
            if (obj3 != null) {
                y.this.q(obj3, this.f3803f, (ArrayList<View>) null);
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    class d implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f3805a;

        d(Runnable runnable) {
            this.f3805a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f3805a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    class e extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f3807a;

        e(Rect rect) {
            this.f3807a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3807a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3807a;
        }
    }

    y() {
    }

    private static boolean C(Transition transition) {
        return !z.l(transition.getTargetIds()) || !z.l(transition.getTargetNames()) || !z.l(transition.getTargetTypes());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            q(transitionSet, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i10 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i10 < transitionCount) {
                    b(transitionSet.getTransitionAt(i10), arrayList);
                    i10++;
                }
            } else if (!C(transition) && z.l(transition.getTargets())) {
                int size = arrayList.size();
                while (i10 < size) {
                    transition.addTarget(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i10;
        Transition transition = (Transition) obj;
        int i11 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i11 < transitionCount) {
                q(transitionSet.getTransitionAt(i11), arrayList, arrayList2);
                i11++;
            }
        } else if (!C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
            }
            while (i11 < i10) {
                transition.addTarget(arrayList2.get(i11));
                i11++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    public void w(Fragment fragment, Object obj, androidx.core.os.e eVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z.d(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }
}
