package x7;

import com.google.protobuf.i;
import dd.j1;
import java.util.List;
import u7.l;
import u7.s;

/* compiled from: WatchChange */
public abstract class x0 {

    /* compiled from: WatchChange */
    public static final class b extends x0 {

        /* renamed from: a  reason: collision with root package name */
        private final List<Integer> f31157a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Integer> f31158b;

        /* renamed from: c  reason: collision with root package name */
        private final l f31159c;

        /* renamed from: d  reason: collision with root package name */
        private final s f31160d;

        public b(List<Integer> list, List<Integer> list2, l lVar, s sVar) {
            super();
            this.f31157a = list;
            this.f31158b = list2;
            this.f31159c = lVar;
            this.f31160d = sVar;
        }

        public l a() {
            return this.f31159c;
        }

        public s b() {
            return this.f31160d;
        }

        public List<Integer> c() {
            return this.f31158b;
        }

        public List<Integer> d() {
            return this.f31157a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f31157a.equals(bVar.f31157a) || !this.f31158b.equals(bVar.f31158b) || !this.f31159c.equals(bVar.f31159c)) {
                return false;
            }
            s sVar = this.f31160d;
            s sVar2 = bVar.f31160d;
            if (sVar != null) {
                return sVar.equals(sVar2);
            }
            if (sVar2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f31157a.hashCode() * 31) + this.f31158b.hashCode()) * 31) + this.f31159c.hashCode()) * 31;
            s sVar = this.f31160d;
            return hashCode + (sVar != null ? sVar.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f31157a + ", removedTargetIds=" + this.f31158b + ", key=" + this.f31159c + ", newDocument=" + this.f31160d + '}';
        }
    }

    /* compiled from: WatchChange */
    public static final class c extends x0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f31161a;

        /* renamed from: b  reason: collision with root package name */
        private final r f31162b;

        public c(int i10, r rVar) {
            super();
            this.f31161a = i10;
            this.f31162b = rVar;
        }

        public r a() {
            return this.f31162b;
        }

        public int b() {
            return this.f31161a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f31161a + ", existenceFilter=" + this.f31162b + '}';
        }
    }

    /* compiled from: WatchChange */
    public static final class d extends x0 {

        /* renamed from: a  reason: collision with root package name */
        private final e f31163a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Integer> f31164b;

        /* renamed from: c  reason: collision with root package name */
        private final i f31165c;

        /* renamed from: d  reason: collision with root package name */
        private final j1 f31166d;

        public d(e eVar, List<Integer> list, i iVar, j1 j1Var) {
            super();
            y7.b.d(j1Var == null || eVar == e.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f31163a = eVar;
            this.f31164b = list;
            this.f31165c = iVar;
            if (j1Var == null || j1Var.o()) {
                this.f31166d = null;
            } else {
                this.f31166d = j1Var;
            }
        }

        public j1 a() {
            return this.f31166d;
        }

        public e b() {
            return this.f31163a;
        }

        public i c() {
            return this.f31165c;
        }

        public List<Integer> d() {
            return this.f31164b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f31163a != dVar.f31163a || !this.f31164b.equals(dVar.f31164b) || !this.f31165c.equals(dVar.f31165c)) {
                return false;
            }
            j1 j1Var = this.f31166d;
            if (j1Var != null) {
                if (dVar.f31166d == null || !j1Var.m().equals(dVar.f31166d.m())) {
                    return false;
                }
                return true;
            } else if (dVar.f31166d == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            int hashCode = ((((this.f31163a.hashCode() * 31) + this.f31164b.hashCode()) * 31) + this.f31165c.hashCode()) * 31;
            j1 j1Var = this.f31166d;
            return hashCode + (j1Var != null ? j1Var.m().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f31163a + ", targetIds=" + this.f31164b + '}';
        }
    }

    /* compiled from: WatchChange */
    public enum e {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private x0() {
    }
}
