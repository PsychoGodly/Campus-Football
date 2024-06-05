package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper */
final class m implements l {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f2981a;

    m(Object obj) {
        this.f2981a = (LocaleList) obj;
    }

    public String a() {
        return this.f2981a.toLanguageTags();
    }

    public Object b() {
        return this.f2981a;
    }

    public boolean equals(Object obj) {
        return this.f2981a.equals(((l) obj).b());
    }

    public Locale get(int i10) {
        return this.f2981a.get(i10);
    }

    public int hashCode() {
        return this.f2981a.hashCode();
    }

    public boolean isEmpty() {
        return this.f2981a.isEmpty();
    }

    public int size() {
        return this.f2981a.size();
    }

    public String toString() {
        return this.f2981a.toString();
    }
}
