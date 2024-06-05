package com.applovin.exoplayer2.common.base;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Splitter {
    /* access modifiers changed from: private */
    public final int limit;
    /* access modifiers changed from: private */
    public final boolean omitEmptyStrings;
    private final e strategy;
    /* access modifiers changed from: private */
    public final CharMatcher trimmer;

    class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharMatcher f6086a;

        /* renamed from: com.applovin.exoplayer2.common.base.Splitter$a$a  reason: collision with other inner class name */
        class C0110a extends d {
            C0110a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            /* access modifiers changed from: package-private */
            public int a(int i10) {
                return i10 + 1;
            }

            /* access modifiers changed from: package-private */
            public int b(int i10) {
                return a.this.f6086a.indexIn(this.f6092c, i10);
            }
        }

        a(CharMatcher charMatcher) {
            this.f6086a = charMatcher;
        }

        /* renamed from: b */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new C0110a(splitter, charSequence);
        }
    }

    class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6088a;

        class a extends d {
            a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            public int a(int i10) {
                return i10 + b.this.f6088a.length();
            }

            public int b(int i10) {
                int length = b.this.f6088a.length();
                int length2 = this.f6092c.length() - length;
                while (i10 <= length2) {
                    int i11 = 0;
                    while (i11 < length) {
                        if (this.f6092c.charAt(i11 + i10) != b.this.f6088a.charAt(i11)) {
                            i10++;
                        } else {
                            i11++;
                        }
                    }
                    return i10;
                }
                return -1;
            }
        }

        b(String str) {
            this.f6088a = str;
        }

        /* renamed from: b */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6090a;

        class a extends d {
            a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            public int a(int i10) {
                return i10;
            }

            public int b(int i10) {
                int i11 = i10 + c.this.f6090a;
                if (i11 < this.f6092c.length()) {
                    return i11;
                }
                return -1;
            }
        }

        c(int i10) {
            this.f6090a = i10;
        }

        /* renamed from: b */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    private static abstract class d extends b {

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f6092c;

        /* renamed from: d  reason: collision with root package name */
        final CharMatcher f6093d;

        /* renamed from: f  reason: collision with root package name */
        final boolean f6094f;

        /* renamed from: g  reason: collision with root package name */
        int f6095g = 0;

        /* renamed from: h  reason: collision with root package name */
        int f6096h;

        protected d(Splitter splitter, CharSequence charSequence) {
            this.f6093d = splitter.trimmer;
            this.f6094f = splitter.omitEmptyStrings;
            this.f6096h = splitter.limit;
            this.f6092c = charSequence;
        }

        /* access modifiers changed from: package-private */
        public abstract int a(int i10);

        /* access modifiers changed from: package-private */
        public abstract int b(int i10);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String a() {
            int i10;
            int i11 = this.f6095g;
            while (true) {
                int i12 = this.f6095g;
                if (i12 == -1) {
                    return (String) b();
                }
                int b10 = b(i12);
                if (b10 == -1) {
                    b10 = this.f6092c.length();
                    this.f6095g = -1;
                } else {
                    this.f6095g = a(b10);
                }
                int i13 = this.f6095g;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.f6095g = i14;
                    if (i14 > this.f6092c.length()) {
                        this.f6095g = -1;
                    }
                } else {
                    while (i11 < b10 && this.f6093d.matches(this.f6092c.charAt(i11))) {
                        i11++;
                    }
                    while (i10 > i11 && this.f6093d.matches(this.f6092c.charAt(i10 - 1))) {
                        b10 = i10 - 1;
                    }
                    if (!this.f6094f || i11 != i10) {
                        int i15 = this.f6096h;
                    } else {
                        i11 = this.f6095g;
                    }
                }
            }
            int i152 = this.f6096h;
            if (i152 == 1) {
                i10 = this.f6092c.length();
                this.f6095g = -1;
                while (i10 > i11 && this.f6093d.matches(this.f6092c.charAt(i10 - 1))) {
                    i10--;
                }
            } else {
                this.f6096h = i152 - 1;
            }
            return this.f6092c.subSequence(i11, i10).toString();
        }
    }

    private interface e {
        Iterator a(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(e eVar) {
        this(eVar, false, CharMatcher.none(), a.e.API_PRIORITY_OTHER);
    }

    public static Splitter fixedLength(int i10) {
        Preconditions.checkArgument(i10 > 0, "The length may not be less than 1");
        return new Splitter(new c(i10));
    }

    public static Splitter on(char c10) {
        return on(CharMatcher.is(c10));
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.a(this, charSequence);
    }

    public Splitter limit(int i10) {
        Preconditions.checkArgument(i10 > 0, "must be greater than zero: %s", i10);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i10);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> splittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (splittingIterator.hasNext()) {
            arrayList.add(splittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    private Splitter(e eVar, boolean z10, CharMatcher charMatcher, int i10) {
        this.strategy = eVar;
        this.omitEmptyStrings = z10;
        this.trimmer = charMatcher;
        this.limit = i10;
    }

    public static Splitter on(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new a(charMatcher));
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    public static Splitter on(String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new Splitter(new b(str));
    }
}
