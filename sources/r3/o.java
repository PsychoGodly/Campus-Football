package r3;

import java.util.NoSuchElementException;

/* compiled from: MediaChunkIterator */
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f22179a = new a();

    /* compiled from: MediaChunkIterator */
    class a implements o {
        a() {
        }

        public long a() {
            throw new NoSuchElementException();
        }

        public long b() {
            throw new NoSuchElementException();
        }

        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
