package h1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static m f18684a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<m>>>> f18685b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f18686c = new ArrayList<>();

    /* compiled from: TransitionManager */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        m f18687a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f18688b;

        /* renamed from: h1.o$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        class C0199a extends n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f18689a;

            C0199a(androidx.collection.a aVar) {
                this.f18689a = aVar;
            }

            public void a(m mVar) {
                ((ArrayList) this.f18689a.get(a.this.f18688b)).remove(mVar);
                mVar.U(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f18687a = mVar;
            this.f18688b = viewGroup;
        }

        private void a() {
            this.f18688b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f18688b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!o.f18686c.remove(this.f18688b)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<m>> b10 = o.b();
            ArrayList arrayList = b10.get(this.f18688b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b10.put(this.f18688b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f18687a);
            this.f18687a.a(new C0199a(b10));
            this.f18687a.l(this.f18688b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).W(this.f18688b);
                }
            }
            this.f18687a.T(this.f18688b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            o.f18686c.remove(this.f18688b);
            ArrayList arrayList = o.b().get(this.f18688b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).W(this.f18688b);
                }
            }
            this.f18687a.m(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (!f18686c.contains(viewGroup) && a0.R(viewGroup)) {
            f18686c.add(viewGroup);
            if (mVar == null) {
                mVar = f18684a;
            }
            m o10 = mVar.clone();
            d(viewGroup, o10);
            l.c(viewGroup, (l) null);
            c(viewGroup, o10);
        }
    }

    static androidx.collection.a<ViewGroup, ArrayList<m>> b() {
        androidx.collection.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference weakReference = f18685b.get();
        if (weakReference != null && (aVar = (androidx.collection.a) weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<m>> aVar2 = new androidx.collection.a<>();
        f18685b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar != null && viewGroup != null) {
            a aVar = new a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).S(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.l(viewGroup, true);
        }
        l b10 = l.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }
}
