package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s.d;
import v.b;
import v.e;
import v.f;

/* compiled from: WidgetGroup */
public class o {

    /* renamed from: g  reason: collision with root package name */
    static int f23470g;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<e> f23471a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f23472b = -1;

    /* renamed from: c  reason: collision with root package name */
    boolean f23473c = false;

    /* renamed from: d  reason: collision with root package name */
    int f23474d = 0;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<a> f23475e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f23476f = -1;

    /* compiled from: WidgetGroup */
    class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<e> f23477a;

        /* renamed from: b  reason: collision with root package name */
        int f23478b;

        /* renamed from: c  reason: collision with root package name */
        int f23479c;

        /* renamed from: d  reason: collision with root package name */
        int f23480d;

        /* renamed from: e  reason: collision with root package name */
        int f23481e;

        /* renamed from: f  reason: collision with root package name */
        int f23482f;

        /* renamed from: g  reason: collision with root package name */
        int f23483g;

        public a(e eVar, d dVar, int i10) {
            this.f23477a = new WeakReference<>(eVar);
            this.f23478b = dVar.x(eVar.O);
            this.f23479c = dVar.x(eVar.P);
            this.f23480d = dVar.x(eVar.Q);
            this.f23481e = dVar.x(eVar.R);
            this.f23482f = dVar.x(eVar.S);
            this.f23483g = i10;
        }
    }

    public o(int i10) {
        int i11 = f23470g;
        f23470g = i11 + 1;
        this.f23472b = i11;
        this.f23474d = i10;
    }

    private String e() {
        int i10 = this.f23474d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        return i10 == 2 ? "Both" : "Unknown";
    }

    private int j(d dVar, ArrayList<e> arrayList, int i10) {
        int x10;
        int x11;
        f fVar = (f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.W0 > 0) {
            b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.X0 > 0) {
            b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f23475e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f23475e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            x10 = dVar.x(fVar.O);
            x11 = dVar.x(fVar.Q);
            dVar.D();
        } else {
            x10 = dVar.x(fVar.P);
            x11 = dVar.x(fVar.R);
            dVar.D();
        }
        return x11 - x10;
    }

    public boolean a(e eVar) {
        if (this.f23471a.contains(eVar)) {
            return false;
        }
        this.f23471a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f23471a.size();
        if (this.f23476f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f23476f == oVar.f23472b) {
                    g(this.f23474d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f23472b;
    }

    public int d() {
        return this.f23474d;
    }

    public int f(d dVar, int i10) {
        if (this.f23471a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f23471a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<e> it = this.f23471a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.I0 = oVar.c();
            } else {
                next.J0 = oVar.c();
            }
        }
        this.f23476f = oVar.f23472b;
    }

    public void h(boolean z10) {
        this.f23473c = z10;
    }

    public void i(int i10) {
        this.f23474d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f23472b + "] <";
        Iterator<e> it = this.f23471a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
