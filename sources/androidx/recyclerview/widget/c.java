package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator */
public class c extends m {

    /* renamed from: s  reason: collision with root package name */
    private static TimeInterpolator f4525s;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f4526h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f4527i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<j> f4528j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<i> f4529k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.d0>> f4530l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<ArrayList<j>> f4531m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    ArrayList<ArrayList<i>> f4532n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    ArrayList<RecyclerView.d0> f4533o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    ArrayList<RecyclerView.d0> f4534p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    ArrayList<RecyclerView.d0> f4535q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    ArrayList<RecyclerView.d0> f4536r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f4537a;

        a(ArrayList arrayList) {
            this.f4537a = arrayList;
        }

        public void run() {
            Iterator it = this.f4537a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f4571a, jVar.f4572b, jVar.f4573c, jVar.f4574d, jVar.f4575e);
            }
            this.f4537a.clear();
            c.this.f4531m.remove(this.f4537a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f4539a;

        b(ArrayList arrayList) {
            this.f4539a = arrayList;
        }

        public void run() {
            Iterator it = this.f4539a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f4539a.clear();
            c.this.f4532n.remove(this.f4539a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    class C0075c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f4541a;

        C0075c(ArrayList arrayList) {
            this.f4541a = arrayList;
        }

        public void run() {
            Iterator it = this.f4541a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.d0) it.next());
            }
            this.f4541a.clear();
            c.this.f4530l.remove(this.f4541a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f4543a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4544b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4545c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4543a = d0Var;
            this.f4544b = viewPropertyAnimator;
            this.f4545c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4544b.setListener((Animator.AnimatorListener) null);
            this.f4545c.setAlpha(1.0f);
            c.this.G(this.f4543a);
            c.this.f4535q.remove(this.f4543a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.H(this.f4543a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f4547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f4548b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4549c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4547a = d0Var;
            this.f4548b = view;
            this.f4549c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4548b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4549c.setListener((Animator.AnimatorListener) null);
            c.this.A(this.f4547a);
            c.this.f4533o.remove(this.f4547a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.B(this.f4547a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f4551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4552b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4553c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f4554d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4555e;

        f(RecyclerView.d0 d0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4551a = d0Var;
            this.f4552b = i10;
            this.f4553c = view;
            this.f4554d = i11;
            this.f4555e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f4552b != 0) {
                this.f4553c.setTranslationX(0.0f);
            }
            if (this.f4554d != 0) {
                this.f4553c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f4555e.setListener((Animator.AnimatorListener) null);
            c.this.E(this.f4551a);
            c.this.f4534p.remove(this.f4551a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.F(this.f4551a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4559c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4557a = iVar;
            this.f4558b = viewPropertyAnimator;
            this.f4559c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4558b.setListener((Animator.AnimatorListener) null);
            this.f4559c.setAlpha(1.0f);
            this.f4559c.setTranslationX(0.0f);
            this.f4559c.setTranslationY(0.0f);
            c.this.C(this.f4557a.f4565a, true);
            c.this.f4536r.remove(this.f4557a.f4565a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f4557a.f4565a, true);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4561a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4562b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4563c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4561a = iVar;
            this.f4562b = viewPropertyAnimator;
            this.f4563c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4562b.setListener((Animator.AnimatorListener) null);
            this.f4563c.setAlpha(1.0f);
            this.f4563c.setTranslationX(0.0f);
            this.f4563c.setTranslationY(0.0f);
            c.this.C(this.f4561a.f4566b, false);
            c.this.f4536r.remove(this.f4561a.f4566b);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f4561a.f4566b, false);
        }
    }

    /* compiled from: DefaultItemAnimator */
    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f4571a;

        /* renamed from: b  reason: collision with root package name */
        public int f4572b;

        /* renamed from: c  reason: collision with root package name */
        public int f4573c;

        /* renamed from: d  reason: collision with root package name */
        public int f4574d;

        /* renamed from: e  reason: collision with root package name */
        public int f4575e;

        j(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
            this.f4571a = d0Var;
            this.f4572b = i10;
            this.f4573c = i11;
            this.f4574d = i12;
            this.f4575e = i13;
        }
    }

    private void T(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f4535q.add(d0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void W(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, d0Var) && iVar.f4565a == null && iVar.f4566b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.d0 d0Var = iVar.f4565a;
        if (d0Var != null) {
            Y(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f4566b;
        if (d0Var2 != null) {
            Y(iVar, d0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.d0 d0Var) {
        boolean z10 = false;
        if (iVar.f4566b == d0Var) {
            iVar.f4566b = null;
        } else if (iVar.f4565a != d0Var) {
            return false;
        } else {
            iVar.f4565a = null;
            z10 = true;
        }
        d0Var.itemView.setAlpha(1.0f);
        d0Var.itemView.setTranslationX(0.0f);
        d0Var.itemView.setTranslationY(0.0f);
        C(d0Var, z10);
        return true;
    }

    private void Z(RecyclerView.d0 d0Var) {
        if (f4525s == null) {
            f4525s = new ValueAnimator().getInterpolator();
        }
        d0Var.itemView.animate().setInterpolator(f4525s);
        j(d0Var);
    }

    /* access modifiers changed from: package-private */
    public void Q(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f4533o.add(d0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(d0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void R(i iVar) {
        View view;
        RecyclerView.d0 d0Var = iVar.f4565a;
        View view2 = null;
        if (d0Var == null) {
            view = null;
        } else {
            view = d0Var.itemView;
        }
        RecyclerView.d0 d0Var2 = iVar.f4566b;
        if (d0Var2 != null) {
            view2 = d0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f4536r.add(iVar.f4565a);
            duration.translationX((float) (iVar.f4569e - iVar.f4567c));
            duration.translationY((float) (iVar.f4570f - iVar.f4568d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f4536r.add(iVar.f4566b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void S(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4534p.add(d0Var);
        animate.setDuration(n()).setListener(new f(d0Var, i14, view, i15, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void U(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        if (!p()) {
            i();
        }
    }

    public boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        view.animate().cancel();
        int size = this.f4528j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4528j.get(size).f4571a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d0Var);
                this.f4528j.remove(size);
            }
        }
        W(this.f4529k, d0Var);
        if (this.f4526h.remove(d0Var)) {
            view.setAlpha(1.0f);
            G(d0Var);
        }
        if (this.f4527i.remove(d0Var)) {
            view.setAlpha(1.0f);
            A(d0Var);
        }
        for (int size2 = this.f4532n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f4532n.get(size2);
            W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f4532n.remove(size2);
            }
        }
        for (int size3 = this.f4531m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f4531m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f4571a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4531m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4530l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f4530l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f4530l.remove(size5);
                }
            }
        }
        this.f4535q.remove(d0Var);
        this.f4533o.remove(d0Var);
        this.f4536r.remove(d0Var);
        this.f4534p.remove(d0Var);
        V();
    }

    public void k() {
        int size = this.f4528j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f4528j.get(size);
            View view = jVar.f4571a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f4571a);
            this.f4528j.remove(size);
        }
        for (int size2 = this.f4526h.size() - 1; size2 >= 0; size2--) {
            G(this.f4526h.get(size2));
            this.f4526h.remove(size2);
        }
        int size3 = this.f4527i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.f4527i.get(size3);
            d0Var.itemView.setAlpha(1.0f);
            A(d0Var);
            this.f4527i.remove(size3);
        }
        for (int size4 = this.f4529k.size() - 1; size4 >= 0; size4--) {
            X(this.f4529k.get(size4));
        }
        this.f4529k.clear();
        if (p()) {
            for (int size5 = this.f4531m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f4531m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f4571a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f4571a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4531m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4530l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f4530l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = (RecyclerView.d0) arrayList2.get(size8);
                    d0Var2.itemView.setAlpha(1.0f);
                    A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4530l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4532n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f4532n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4532n.remove(arrayList3);
                    }
                }
            }
            U(this.f4535q);
            U(this.f4534p);
            U(this.f4533o);
            U(this.f4536r);
            i();
        }
    }

    public boolean p() {
        return !this.f4527i.isEmpty() || !this.f4529k.isEmpty() || !this.f4528j.isEmpty() || !this.f4526h.isEmpty() || !this.f4534p.isEmpty() || !this.f4535q.isEmpty() || !this.f4533o.isEmpty() || !this.f4536r.isEmpty() || !this.f4531m.isEmpty() || !this.f4530l.isEmpty() || !this.f4532n.isEmpty();
    }

    public void u() {
        boolean z10 = !this.f4526h.isEmpty();
        boolean z11 = !this.f4528j.isEmpty();
        boolean z12 = !this.f4529k.isEmpty();
        boolean z13 = !this.f4527i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.d0> it = this.f4526h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.f4526h.clear();
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f4528j);
                this.f4531m.add(arrayList);
                this.f4528j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    a0.g0(((j) arrayList.get(0)).f4571a.itemView, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f4529k);
                this.f4532n.add(arrayList2);
                this.f4529k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    a0.g0(((i) arrayList2.get(0)).f4565a.itemView, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f4527i);
                this.f4530l.add(arrayList3);
                this.f4527i.clear();
                C0075c cVar = new C0075c(arrayList3);
                if (z10 || z11 || z12) {
                    long j10 = 0;
                    long o10 = z10 ? o() : 0;
                    long n10 = z11 ? n() : 0;
                    if (z12) {
                        j10 = m();
                    }
                    a0.g0(((RecyclerView.d0) arrayList3.get(0)).itemView, cVar, o10 + Math.max(n10, j10));
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean w(RecyclerView.d0 d0Var) {
        Z(d0Var);
        d0Var.itemView.setAlpha(0.0f);
        this.f4527i.add(d0Var);
        return true;
    }

    public boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
        if (d0Var == d0Var2) {
            return y(d0Var, i10, i11, i12, i13);
        }
        float translationX = d0Var.itemView.getTranslationX();
        float translationY = d0Var.itemView.getTranslationY();
        float alpha = d0Var.itemView.getAlpha();
        Z(d0Var);
        int i14 = (int) (((float) (i12 - i10)) - translationX);
        int i15 = (int) (((float) (i13 - i11)) - translationY);
        d0Var.itemView.setTranslationX(translationX);
        d0Var.itemView.setTranslationY(translationY);
        d0Var.itemView.setAlpha(alpha);
        if (d0Var2 != null) {
            Z(d0Var2);
            d0Var2.itemView.setTranslationX((float) (-i14));
            d0Var2.itemView.setTranslationY((float) (-i15));
            d0Var2.itemView.setAlpha(0.0f);
        }
        this.f4529k.add(new i(d0Var, d0Var2, i10, i11, i12, i13));
        return true;
    }

    public boolean y(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) d0Var.itemView.getTranslationY());
        Z(d0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(d0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.f4528j.add(new j(d0Var, translationX, translationY, i12, i13));
        return true;
    }

    public boolean z(RecyclerView.d0 d0Var) {
        Z(d0Var);
        this.f4526h.add(d0Var);
        return true;
    }

    /* compiled from: DefaultItemAnimator */
    private static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f4565a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.d0 f4566b;

        /* renamed from: c  reason: collision with root package name */
        public int f4567c;

        /* renamed from: d  reason: collision with root package name */
        public int f4568d;

        /* renamed from: e  reason: collision with root package name */
        public int f4569e;

        /* renamed from: f  reason: collision with root package name */
        public int f4570f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f4565a = d0Var;
            this.f4566b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4565a + ", newHolder=" + this.f4566b + ", fromX=" + this.f4567c + ", fromY=" + this.f4568d + ", toX=" + this.f4569e + ", toY=" + this.f4570f + '}';
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
            this(d0Var, d0Var2);
            this.f4567c = i10;
            this.f4568d = i11;
            this.f4569e = i12;
            this.f4570f = i13;
        }
    }
}
