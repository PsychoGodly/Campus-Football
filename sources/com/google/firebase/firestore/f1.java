package com.google.firebase.firestore;

/* compiled from: TransactionOptions */
public final class f1 {

    /* renamed from: b  reason: collision with root package name */
    static final f1 f26456b = new b().a();

    /* renamed from: a  reason: collision with root package name */
    private final int f26457a;

    /* compiled from: TransactionOptions */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f26458a = 5;

        public f1 a() {
            return new f1(this.f26458a);
        }

        public b b(int i10) {
            if (i10 >= 1) {
                this.f26458a = i10;
                return this;
            }
            throw new IllegalArgumentException("Max attempts must be at least 1");
        }
    }

    public int a() {
        return this.f26457a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass() && this.f26457a == ((f1) obj).f26457a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f26457a;
    }

    public String toString() {
        return "TransactionOptions{maxAttempts=" + this.f26457a + '}';
    }

    private f1(int i10) {
        this.f26457a = i10;
    }
}
