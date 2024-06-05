package v;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.c;
import s.i;
import w.o;

/* compiled from: ConstraintAnchor */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private HashSet<d> f23049a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f23050b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23051c;

    /* renamed from: d  reason: collision with root package name */
    public final e f23052d;

    /* renamed from: e  reason: collision with root package name */
    public final b f23053e;

    /* renamed from: f  reason: collision with root package name */
    public d f23054f;

    /* renamed from: g  reason: collision with root package name */
    public int f23055g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f23056h = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: i  reason: collision with root package name */
    i f23057i;

    /* compiled from: ConstraintAnchor */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23058a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v.d$b[] r0 = v.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23058a = r0
                v.d$b r1 = v.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23058a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.d$b r1 = v.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23058a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.d$b r1 = v.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23058a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.d$b r1 = v.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23058a     // Catch:{ NoSuchFieldError -> 0x003e }
                v.d$b r1 = v.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23058a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v.d$b r1 = v.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23058a     // Catch:{ NoSuchFieldError -> 0x0054 }
                v.d$b r1 = v.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f23058a     // Catch:{ NoSuchFieldError -> 0x0060 }
                v.d$b r1 = v.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f23058a     // Catch:{ NoSuchFieldError -> 0x006c }
                v.d$b r1 = v.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v.d.a.<clinit>():void");
        }
    }

    /* compiled from: ConstraintAnchor */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f23052d = eVar;
        this.f23053e = bVar;
    }

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            p();
            return true;
        } else if (!z10 && !o(dVar)) {
            return false;
        } else {
            this.f23054f = dVar;
            if (dVar.f23049a == null) {
                dVar.f23049a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f23054f.f23049a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f23055g = i10;
            this.f23056h = i11;
            return true;
        }
    }

    public void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f23049a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                w.i.a(it.next().f23052d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f23049a;
    }

    public int d() {
        if (!this.f23051c) {
            return 0;
        }
        return this.f23050b;
    }

    public int e() {
        d dVar;
        if (this.f23052d.T() == 8) {
            return 0;
        }
        if (this.f23056h == Integer.MIN_VALUE || (dVar = this.f23054f) == null || dVar.f23052d.T() != 8) {
            return this.f23055g;
        }
        return this.f23056h;
    }

    public final d f() {
        switch (a.f23058a[this.f23053e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f23052d.Q;
            case 3:
                return this.f23052d.O;
            case 4:
                return this.f23052d.R;
            case 5:
                return this.f23052d.P;
            default:
                throw new AssertionError(this.f23053e.name());
        }
    }

    public e g() {
        return this.f23052d;
    }

    public i h() {
        return this.f23057i;
    }

    public d i() {
        return this.f23054f;
    }

    public b j() {
        return this.f23053e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f23049a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f23049a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean m() {
        return this.f23051c;
    }

    public boolean n() {
        return this.f23054f != null;
    }

    public boolean o(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return false;
        }
        b j10 = dVar.j();
        b bVar = this.f23053e;
        if (j10 != bVar) {
            switch (a.f23058a[bVar.ordinal()]) {
                case 1:
                    if (j10 == b.BASELINE || j10 == b.CENTER_X || j10 == b.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    boolean z11 = j10 == b.LEFT || j10 == b.RIGHT;
                    if (!(dVar.g() instanceof g)) {
                        return z11;
                    }
                    if (z11 || j10 == b.CENTER_X) {
                        z10 = true;
                    }
                    return z10;
                case 4:
                case 5:
                    boolean z12 = j10 == b.TOP || j10 == b.BOTTOM;
                    if (!(dVar.g() instanceof g)) {
                        return z12;
                    }
                    if (z12 || j10 == b.CENTER_Y) {
                        z10 = true;
                    }
                    return z10;
                case 6:
                    if (j10 == b.LEFT || j10 == b.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f23053e.name());
            }
        } else if (bVar != b.BASELINE || (dVar.g().X() && g().X())) {
            return true;
        } else {
            return false;
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f23054f;
        if (!(dVar == null || (hashSet = dVar.f23049a) == null)) {
            hashSet.remove(this);
            if (this.f23054f.f23049a.size() == 0) {
                this.f23054f.f23049a = null;
            }
        }
        this.f23049a = null;
        this.f23054f = null;
        this.f23055g = 0;
        this.f23056h = RecyclerView.UNDEFINED_DURATION;
        this.f23051c = false;
        this.f23050b = 0;
    }

    public void q() {
        this.f23051c = false;
        this.f23050b = 0;
    }

    public void r(c cVar) {
        i iVar = this.f23057i;
        if (iVar == null) {
            this.f23057i = new i(i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.f();
        }
    }

    public void s(int i10) {
        this.f23050b = i10;
        this.f23051c = true;
    }

    public String toString() {
        return this.f23052d.r() + ":" + this.f23053e.toString();
    }
}
