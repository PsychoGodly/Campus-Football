package ce;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import me.d;

/* compiled from: ReadWrite.kt */
final class h implements d<String> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final BufferedReader f31977a;

    /* compiled from: ReadWrite.kt */
    public static final class a implements Iterator<String>, ge.a {

        /* renamed from: a  reason: collision with root package name */
        private String f31978a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31979b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f31980c;

        a(h hVar) {
            this.f31980c = hVar;
        }

        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f31978a;
                this.f31978a = null;
                m.b(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f31978a == null && !this.f31979b) {
                String readLine = this.f31980c.f31977a.readLine();
                this.f31978a = readLine;
                if (readLine == null) {
                    this.f31979b = true;
                }
            }
            if (this.f31978a != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(BufferedReader bufferedReader) {
        m.e(bufferedReader, "reader");
        this.f31977a = bufferedReader;
    }

    public Iterator<String> iterator() {
        return new a(this);
    }
}
