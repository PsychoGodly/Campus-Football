package com.google.firebase.firestore;

import android.util.SparseArray;
import y6.l;
import y7.b;
import y7.x;

/* compiled from: FirebaseFirestoreException */
public class z extends l {

    /* renamed from: a  reason: collision with root package name */
    private final a f26567a;

    /* compiled from: FirebaseFirestoreException */
    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: t  reason: collision with root package name */
        private static final SparseArray<a> f26585t = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f26587a;

        static {
            f26585t = a();
        }

        private a(int i10) {
            this.f26587a = i10;
        }

        private static SparseArray<a> a() {
            SparseArray<a> sparseArray = new SparseArray<>();
            a[] values = values();
            int length = values.length;
            int i10 = 0;
            while (i10 < length) {
                a aVar = values[i10];
                a aVar2 = sparseArray.get(aVar.d());
                if (aVar2 == null) {
                    sparseArray.put(aVar.d(), aVar);
                    i10++;
                } else {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
            }
            return sparseArray;
        }

        public static a c(int i10) {
            return f26585t.get(i10, UNKNOWN);
        }

        public int d() {
            return this.f26587a;
        }
    }

    public z(String str, a aVar) {
        super(str);
        x.c(str, "Provided message must not be null.");
        b.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f26567a = (a) x.c(aVar, "Provided code must not be null.");
    }

    public a a() {
        return this.f26567a;
    }

    public z(String str, a aVar, Throwable th) {
        super(str, th);
        x.c(str, "Provided message must not be null.");
        b.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f26567a = (a) x.c(aVar, "Provided code must not be null.");
    }
}
