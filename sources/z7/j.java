package z7;

/* compiled from: HeartBeatInfo */
public interface j {

    /* compiled from: HeartBeatInfo */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f31448a;

        private a(int i10) {
            this.f31448a = i10;
        }

        public int a() {
            return this.f31448a;
        }
    }

    a b(String str);
}
