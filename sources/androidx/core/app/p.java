package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import com.applovin.mediation.MaxReward;

/* compiled from: Person */
public class p {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f2821a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f2822b;

    /* renamed from: c  reason: collision with root package name */
    String f2823c;

    /* renamed from: d  reason: collision with root package name */
    String f2824d;

    /* renamed from: e  reason: collision with root package name */
    boolean f2825e;

    /* renamed from: f  reason: collision with root package name */
    boolean f2826f;

    /* compiled from: Person */
    static class a {
        static p a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.f(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(p pVar) {
            return new Person.Builder().setName(pVar.c()).setIcon(pVar.a() != null ? pVar.a().x() : null).setUri(pVar.d()).setKey(pVar.b()).setBot(pVar.e()).setImportant(pVar.f()).build();
        }
    }

    /* compiled from: Person */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f2827a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f2828b;

        /* renamed from: c  reason: collision with root package name */
        String f2829c;

        /* renamed from: d  reason: collision with root package name */
        String f2830d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2831e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2832f;

        public p a() {
            return new p(this);
        }

        public b b(boolean z10) {
            this.f2831e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f2828b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f2832f = z10;
            return this;
        }

        public b e(String str) {
            this.f2830d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f2827a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f2829c = str;
            return this;
        }
    }

    p(b bVar) {
        this.f2821a = bVar.f2827a;
        this.f2822b = bVar.f2828b;
        this.f2823c = bVar.f2829c;
        this.f2824d = bVar.f2830d;
        this.f2825e = bVar.f2831e;
        this.f2826f = bVar.f2832f;
    }

    public IconCompat a() {
        return this.f2822b;
    }

    public String b() {
        return this.f2824d;
    }

    public CharSequence c() {
        return this.f2821a;
    }

    public String d() {
        return this.f2823c;
    }

    public boolean e() {
        return this.f2825e;
    }

    public boolean f() {
        return this.f2826f;
    }

    public String g() {
        String str = this.f2823c;
        if (str != null) {
            return str;
        }
        if (this.f2821a == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return "name:" + this.f2821a;
    }

    public Person h() {
        return a.b(this);
    }
}
