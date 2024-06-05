package h1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.z;
import h1.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport */
public class e extends z {

    /* compiled from: FragmentTransitionSupport */
    class a extends m.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f18602a;

        a(Rect rect) {
            this.f18602a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class b implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f18604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f18605b;

        b(View view, ArrayList arrayList) {
            this.f18604a = view;
            this.f18605b = arrayList;
        }

        public void a(m mVar) {
            mVar.U(this);
            this.f18604a.setVisibility(8);
            int size = this.f18605b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f18605b.get(i10)).setVisibility(0);
            }
        }

        public void b(m mVar) {
        }

        public void c(m mVar) {
        }

        public void d(m mVar) {
        }

        public void e(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class c extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f18607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f18608b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f18609c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f18610d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f18611e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f18612f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f18607a = obj;
            this.f18608b = arrayList;
            this.f18609c = obj2;
            this.f18610d = arrayList2;
            this.f18611e = obj3;
            this.f18612f = arrayList3;
        }

        public void a(m mVar) {
            mVar.U(this);
        }

        public void d(m mVar) {
            Object obj = this.f18607a;
            if (obj != null) {
                e.this.q(obj, this.f18608b, (ArrayList<View>) null);
            }
            Object obj2 = this.f18609c;
            if (obj2 != null) {
                e.this.q(obj2, this.f18610d, (ArrayList<View>) null);
            }
            Object obj3 = this.f18611e;
            if (obj3 != null) {
                e.this.q(obj3, this.f18612f, (ArrayList<View>) null);
            }
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class d extends m.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f18614a;

        d(Rect rect) {
            this.f18614a = rect;
        }
    }

    private static boolean C(m mVar) {
        return !z.l(mVar.E()) || !z.l(mVar.F()) || !z.l(mVar.G());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.H().clear();
            qVar.H().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.j0((m) obj);
        return qVar;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).b(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar != null) {
            int i10 = 0;
            if (mVar instanceof q) {
                q qVar = (q) mVar;
                int m02 = qVar.m0();
                while (i10 < m02) {
                    b(qVar.l0(i10), arrayList);
                    i10++;
                }
            } else if (!C(mVar) && z.l(mVar.H())) {
                int size = arrayList.size();
                while (i10 < size) {
                    mVar.b(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof m;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new q().j0(mVar).j0(mVar2).r0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        q qVar = new q();
        if (mVar != null) {
            qVar.j0(mVar);
        }
        qVar.j0(mVar3);
        return qVar;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.j0((m) obj);
        }
        if (obj2 != null) {
            qVar.j0((m) obj2);
        }
        if (obj3 != null) {
            qVar.j0((m) obj3);
        }
        return qVar;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).V(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i10;
        m mVar = (m) obj;
        int i11 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int m02 = qVar.m0();
            while (i11 < m02) {
                q(qVar.l0(i11), arrayList, arrayList2);
                i11++;
            }
        } else if (!C(mVar)) {
            List<View> H = mVar.H();
            if (H.size() == arrayList.size() && H.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i10 = 0;
                } else {
                    i10 = arrayList2.size();
                }
                while (i11 < i10) {
                    mVar.b(arrayList2.get(i11));
                    i11++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.V(arrayList.get(size));
                }
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).a(new b(view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).a0(new d(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).a0(new a(rect));
        }
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> H = qVar.H();
        H.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z.d(H, arrayList.get(i10));
        }
        H.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
