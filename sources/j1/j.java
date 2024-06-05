package j1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: TracingConfig */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private int f19204a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f19205b;

    /* renamed from: c  reason: collision with root package name */
    private int f19206c;

    /* compiled from: TracingConfig */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f19207a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f19208b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private int f19209c = 1;

        public a a(int... iArr) {
            for (int i10 : iArr) {
                this.f19207a = i10 | this.f19207a;
            }
            return this;
        }

        public a b(String... strArr) {
            this.f19208b.addAll(Arrays.asList(strArr));
            return this;
        }

        public j c() {
            return new j(this.f19207a, this.f19208b, this.f19209c);
        }

        public a d(int i10) {
            this.f19209c = i10;
            return this;
        }
    }

    public j(int i10, List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f19205b = arrayList;
        this.f19204a = i10;
        arrayList.addAll(list);
        this.f19206c = i11;
    }

    public List<String> a() {
        return this.f19205b;
    }

    public int b() {
        return this.f19204a;
    }

    public int c() {
        return this.f19206c;
    }
}
