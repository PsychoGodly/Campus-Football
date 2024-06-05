package t3;

import k4.n0;

/* compiled from: ProgramInformation */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f22626a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22627b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22628c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22629d;

    /* renamed from: e  reason: collision with root package name */
    public final String f22630e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f22626a = str;
        this.f22627b = str2;
        this.f22628c = str3;
        this.f22629d = str4;
        this.f22630e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!n0.c(this.f22626a, hVar.f22626a) || !n0.c(this.f22627b, hVar.f22627b) || !n0.c(this.f22628c, hVar.f22628c) || !n0.c(this.f22629d, hVar.f22629d) || !n0.c(this.f22630e, hVar.f22630e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f22626a;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22627b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22628c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f22629d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f22630e;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode4 + i10;
    }
}
