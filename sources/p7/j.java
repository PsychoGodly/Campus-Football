package p7;

/* compiled from: User */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f29508b = new j((String) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f29509a;

    public j(String str) {
        this.f29509a = str;
    }

    public String a() {
        return this.f29509a;
    }

    public boolean b() {
        return this.f29509a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        String str = this.f29509a;
        String str2 = ((j) obj).f29509a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f29509a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "User(uid:" + this.f29509a + ")";
    }
}
