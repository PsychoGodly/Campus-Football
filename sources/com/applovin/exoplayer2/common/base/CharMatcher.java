package com.applovin.exoplayer2.common.base;

import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.BitSet;

public abstract class CharMatcher implements Predicate<Character> {

    private static final class a extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        final CharMatcher f6020a;

        /* renamed from: b  reason: collision with root package name */
        final CharMatcher f6021b;

        a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f6020a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f6021b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            return this.f6020a.matches(c10) && this.f6021b.matches(c10);
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f6020a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f6021b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        public String toString() {
            return "CharMatcher.and(" + this.f6020a + ", " + this.f6021b + ")";
        }
    }

    static final class a0 extends t {

        /* renamed from: b  reason: collision with root package name */
        static final int f6022b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c  reason: collision with root package name */
        static final a0 f6023c = new a0();

        a0() {
            super("CharMatcher.whitespace()");
        }

        public boolean matches(char c10) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c10) >>> f6022b) == c10;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            for (int i10 = 0; i10 < 32; i10++) {
                bitSet.set(" 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt(i10));
            }
        }
    }

    private static final class b extends t {

        /* renamed from: b  reason: collision with root package name */
        static final b f6024b = new b();

        private b() {
            super("CharMatcher.any()");
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.length() == 0 ? MaxReward.DEFAULT_LABEL : String.valueOf(c10);
        }

        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        public boolean matches(char c10) {
            return true;
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public CharMatcher negate() {
            return CharMatcher.none();
        }

        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return MaxReward.DEFAULT_LABEL;
        }

        public String replaceFrom(CharSequence charSequence, char c10) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c10);
            return new String(cArr);
        }

        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return MaxReward.DEFAULT_LABEL;
        }

        public int indexIn(CharSequence charSequence, int i10) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i10, length);
            if (i10 == length) {
                return -1;
            }
            return i10;
        }

        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }
    }

    private static final class c extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        private final char[] f6025a;

        public c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f6025a = charArray;
            Arrays.sort(charArray);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            return Arrays.binarySearch(this.f6025a, c10) >= 0;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            for (char c10 : this.f6025a) {
                bitSet.set(c10);
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char access$000 : this.f6025a) {
                sb2.append(CharMatcher.showCharacter(access$000));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    private static final class d extends t {

        /* renamed from: b  reason: collision with root package name */
        static final d f6026b = new d();

        d() {
            super("CharMatcher.ascii()");
        }

        public boolean matches(char c10) {
            return c10 <= 127;
        }
    }

    private static final class e extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final CharMatcher f6027a = new e();

        private e() {
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            if (!(c10 == ' ' || c10 == 133 || c10 == 5760)) {
                if (c10 == 8199) {
                    return false;
                }
                if (!(c10 == 8287 || c10 == 12288 || c10 == 8232 || c10 == 8233)) {
                    switch (c10) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return c10 >= 8192 && c10 <= 8202;
                    }
                }
            }
            return true;
        }

        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    private static final class f extends y {

        /* renamed from: d  reason: collision with root package name */
        static final f f6028d = new f();

        private f() {
            super("CharMatcher.digit()", b(), a());
        }

        private static char[] a() {
            char[] cArr = new char[37];
            for (int i10 = 0; i10 < 37; i10++) {
                cArr[i10] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i10) + 9);
            }
            return cArr;
        }

        private static char[] b() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }
    }

    static abstract class g extends CharMatcher {
        g() {
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public CharMatcher negate() {
            return new v(this);
        }
    }

    private static final class h extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        private final Predicate f6029a;

        h(Predicate predicate) {
            this.f6029a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        public boolean matches(char c10) {
            return this.f6029a.apply(Character.valueOf(c10));
        }

        public String toString() {
            return "CharMatcher.forPredicate(" + this.f6029a + ")";
        }

        public boolean apply(Character ch) {
            return this.f6029a.apply(Preconditions.checkNotNull(ch));
        }
    }

    private static final class i extends g {

        /* renamed from: a  reason: collision with root package name */
        private final char f6030a;

        /* renamed from: b  reason: collision with root package name */
        private final char f6031b;

        i(char c10, char c11) {
            Preconditions.checkArgument(c11 >= c10);
            this.f6030a = c10;
            this.f6031b = c11;
        }

        public boolean matches(char c10) {
            return this.f6030a <= c10 && c10 <= this.f6031b;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f6030a, this.f6031b + 1);
        }

        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.f6030a) + "', '" + CharMatcher.showCharacter(this.f6031b) + "')";
        }
    }

    private static final class j extends y {

        /* renamed from: d  reason: collision with root package name */
        static final j f6032d = new j();

        private j() {
            super("CharMatcher.invisible()", "\u0000­؀؜۝܏࣢ ᠎   ⁦　?﻿￹".toCharArray(), "  ­؅؜۝܏࣢ ᠎‏ ⁤⁯　﻿￻".toCharArray());
        }
    }

    private static final class k extends g {

        /* renamed from: a  reason: collision with root package name */
        private final char f6033a;

        k(char c10) {
            this.f6033a = c10;
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f6033a) ? this : CharMatcher.none();
        }

        public boolean matches(char c10) {
            return c10 == this.f6033a;
        }

        public CharMatcher negate() {
            return CharMatcher.isNot(this.f6033a);
        }

        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f6033a) ? charMatcher : CharMatcher.super.or(charMatcher);
        }

        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString().replace(this.f6033a, c10);
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f6033a);
        }

        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.f6033a) + "')";
        }
    }

    private static final class l extends g {

        /* renamed from: a  reason: collision with root package name */
        private final char f6034a;

        /* renamed from: b  reason: collision with root package name */
        private final char f6035b;

        l(char c10, char c11) {
            this.f6034a = c10;
            this.f6035b = c11;
        }

        public boolean matches(char c10) {
            return c10 == this.f6034a || c10 == this.f6035b;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f6034a);
            bitSet.set(this.f6035b);
        }

        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.f6034a) + CharMatcher.showCharacter(this.f6035b) + "\")";
        }
    }

    private static final class m extends g {

        /* renamed from: a  reason: collision with root package name */
        private final char f6036a;

        m(char c10) {
            this.f6036a = c10;
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f6036a) ? CharMatcher.super.and(charMatcher) : charMatcher;
        }

        public boolean matches(char c10) {
            return c10 != this.f6036a;
        }

        public CharMatcher negate() {
            return CharMatcher.is(this.f6036a);
        }

        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f6036a) ? CharMatcher.any() : this;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.f6036a);
            bitSet.set(this.f6036a + 1, 65536);
        }

        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.f6036a) + "')";
        }
    }

    private static final class n extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final n f6037a = new n();

        private n() {
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            return Character.isDigit(c10);
        }

        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class o extends t {

        /* renamed from: b  reason: collision with root package name */
        static final o f6038b = new o();

        private o() {
            super("CharMatcher.javaIsoControl()");
        }

        public boolean matches(char c10) {
            return c10 <= 31 || (c10 >= 127 && c10 <= 159);
        }
    }

    private static final class p extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final p f6039a = new p();

        private p() {
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            return Character.isLetter(c10);
        }

        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class q extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final q f6040a = new q();

        private q() {
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class r extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final r f6041a = new r();

        private r() {
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            return Character.isLowerCase(c10);
        }

        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class s extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final s f6042a = new s();

        private s() {
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            return Character.isUpperCase(c10);
        }

        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    static abstract class t extends g {

        /* renamed from: a  reason: collision with root package name */
        private final String f6043a;

        t(String str) {
            this.f6043a = (String) Preconditions.checkNotNull(str);
        }

        public final String toString() {
            return this.f6043a;
        }
    }

    private static class u extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        final CharMatcher f6044a;

        u(CharMatcher charMatcher) {
            this.f6044a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f6044a.countIn(charSequence);
        }

        public boolean matches(char c10) {
            return !this.f6044a.matches(c10);
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f6044a.matchesNoneOf(charSequence);
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f6044a.matchesAllOf(charSequence);
        }

        public CharMatcher negate() {
            return this.f6044a;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f6044a.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        public String toString() {
            return this.f6044a + ".negate()";
        }
    }

    static class v extends u {
        v(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    private static final class w extends t {

        /* renamed from: b  reason: collision with root package name */
        static final w f6045b = new w();

        private w() {
            super("CharMatcher.none()");
        }

        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public boolean matches(char c10) {
            return false;
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public CharMatcher negate() {
            return CharMatcher.any();
        }

        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public int indexIn(CharSequence charSequence, int i10) {
            Preconditions.checkPositionIndex(i10, charSequence.length());
            return -1;
        }

        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    private static final class x extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        final CharMatcher f6046a;

        /* renamed from: b  reason: collision with root package name */
        final CharMatcher f6047b;

        x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f6046a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f6047b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            return this.f6046a.matches(c10) || this.f6047b.matches(c10);
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            this.f6046a.setBits(bitSet);
            this.f6047b.setBits(bitSet);
        }

        public String toString() {
            return "CharMatcher.or(" + this.f6046a + ", " + this.f6047b + ")";
        }
    }

    private static class y extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        private final String f6048a;

        /* renamed from: b  reason: collision with root package name */
        private final char[] f6049b;

        /* renamed from: c  reason: collision with root package name */
        private final char[] f6050c;

        y(String str, char[] cArr, char[] cArr2) {
            this.f6048a = str;
            this.f6049b = cArr;
            this.f6050c = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i10 = 0;
            while (i10 < cArr.length) {
                Preconditions.checkArgument(cArr[i10] <= cArr2[i10]);
                int i11 = i10 + 1;
                if (i11 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i10] < cArr[i11]);
                }
                i10 = i11;
            }
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c10) {
            int binarySearch = Arrays.binarySearch(this.f6049b, c10);
            if (binarySearch >= 0) {
                return true;
            }
            int i10 = (~binarySearch) - 1;
            if (i10 < 0 || c10 > this.f6050c[i10]) {
                return false;
            }
            return true;
        }

        public String toString() {
            return this.f6048a;
        }
    }

    private static final class z extends y {

        /* renamed from: d  reason: collision with root package name */
        static final z f6051d = new z();

        private z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
        }
    }

    protected CharMatcher() {
    }

    public static CharMatcher any() {
        return b.f6024b;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length == 1) {
            return is(charSequence.charAt(0));
        }
        if (length != 2) {
            return new c(charSequence);
        }
        return isEither(charSequence.charAt(0), charSequence.charAt(1));
    }

    public static CharMatcher ascii() {
        return d.f6026b;
    }

    public static CharMatcher breakingWhitespace() {
        return e.f6027a;
    }

    @Deprecated
    public static CharMatcher digit() {
        return f.f6028d;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i10, int i11, char c10, StringBuilder sb2, boolean z10) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (!matches(charAt)) {
                sb2.append(charAt);
                z10 = false;
            } else if (!z10) {
                sb2.append(c10);
                z10 = true;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new h(predicate);
    }

    public static CharMatcher inRange(char c10, char c11) {
        return new i(c10, c11);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return j.f6032d;
    }

    public static CharMatcher is(char c10) {
        return new k(c10);
    }

    private static l isEither(char c10, char c11) {
        return new l(c10, c11);
    }

    public static CharMatcher isNot(char c10) {
        return new m(c10);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return n.f6037a;
    }

    public static CharMatcher javaIsoControl() {
        return o.f6038b;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return p.f6039a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return q.f6040a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return r.f6041a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return s.f6042a;
    }

    public static CharMatcher none() {
        return w.f6045b;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    /* access modifiers changed from: private */
    public static String showCharacter(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return z.f6051d;
    }

    public static CharMatcher whitespace() {
        return a0.f6023c;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new a(this, charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (matches(charAt)) {
                if (charAt != c10 || (i10 != length - 1 && matches(charSequence.charAt(i10 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                    sb2.append(c10);
                    return finishCollapseFrom(charSequence, i10 + 1, length, c10, sb2, true);
                }
                i10++;
            }
            i10++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (matches(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c10);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public CharMatcher negate() {
        return new u(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new x(this, charMatcher);
    }

    public String removeFrom(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i10 = 1;
        while (true) {
            indexIn++;
            while (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    i10++;
                } else {
                    charArray[indexIn - i10] = charArray[indexIn];
                    indexIn++;
                }
            }
            return new String(charArray, 0, indexIn - i10);
        }
    }

    public String replaceFrom(CharSequence charSequence, char c10) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[indexIn] = c10;
        while (true) {
            indexIn++;
            if (indexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[indexIn])) {
                charArray[indexIn] = c10;
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void setBits(BitSet bitSet) {
        for (int i10 = 65535; i10 >= 0; i10--) {
            if (matches((char) i10)) {
                bitSet.set(i10);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && matches(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && matches(charSequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return collapseFrom(charSequence, c10);
        }
        int i13 = i12 + 1;
        return finishCollapseFrom(charSequence, i11, i13, c10, new StringBuilder(i13 - i11), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && matches(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && matches(charSequence.charAt(i11))) {
            i11--;
        }
        return charSequence.subSequence(i10, i11 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!matches(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, length).toString();
            }
        }
        return MaxReward.DEFAULT_LABEL;
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return MaxReward.DEFAULT_LABEL;
    }

    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public int indexIn(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i10, length);
        while (i10 < length) {
            if (matches(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i10 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int indexIn = indexIn(charSequence3);
        if (indexIn == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append(charSequence3, i10, indexIn);
            sb2.append(charSequence2);
            i10 = indexIn + 1;
            indexIn = indexIn(charSequence3, i10);
        } while (indexIn != -1);
        sb2.append(charSequence3, i10, length2);
        return sb2.toString();
    }
}
