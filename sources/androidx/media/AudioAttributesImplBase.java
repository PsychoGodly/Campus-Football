package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f3994a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f3995b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f3996c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f3997d = -1;

    static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        private int f3998a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f3999b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f4000c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f4001d = -1;

        a() {
        }

        private a g(int i10) {
            switch (i10) {
                case 0:
                    this.f3999b = 1;
                    break;
                case 1:
                    break;
                case 2:
                    this.f3999b = 4;
                    break;
                case 3:
                    this.f3999b = 2;
                    break;
                case 4:
                    this.f3999b = 4;
                    break;
                case 5:
                    this.f3999b = 4;
                    break;
                case 6:
                    this.f3999b = 1;
                    this.f4000c |= 4;
                    break;
                case 7:
                    this.f4000c = 1 | this.f4000c;
                    break;
                case 8:
                    this.f3999b = 4;
                    break;
                case 9:
                    this.f3999b = 4;
                    break;
                case 10:
                    this.f3999b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i10 + " for AudioAttributesCompat");
                    break;
            }
            this.f3999b = 4;
            this.f3998a = AudioAttributesImplBase.f(i10);
            return this;
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f3999b, this.f4000c, this.f3998a, this.f4001d);
        }

        /* renamed from: e */
        public a c(int i10) {
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                this.f3999b = i10;
            } else {
                this.f3999b = 0;
            }
            return this;
        }

        /* renamed from: f */
        public a a(int i10) {
            this.f4000c = (i10 & 1023) | this.f4000c;
            return this;
        }

        /* renamed from: h */
        public a b(int i10) {
            if (i10 != 10) {
                this.f4001d = i10;
                return g(i10);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        /* renamed from: i */
        public a d(int i10) {
            switch (i10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f3998a = i10;
                    break;
                case 16:
                    this.f3998a = 12;
                    break;
                default:
                    this.f3998a = 0;
                    break;
            }
            return this;
        }
    }

    public AudioAttributesImplBase() {
    }

    static int f(int i10) {
        switch (i10) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public int a() {
        int i10 = this.f3997d;
        if (i10 != -1) {
            return i10;
        }
        return AudioAttributesCompat.c(false, this.f3996c, this.f3994a);
    }

    public Object b() {
        return null;
    }

    public int c() {
        return this.f3995b;
    }

    public int d() {
        int i10 = this.f3996c;
        int a10 = a();
        if (a10 == 6) {
            i10 |= 4;
        } else if (a10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int e() {
        return this.f3994a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3995b == audioAttributesImplBase.c() && this.f3996c == audioAttributesImplBase.d() && this.f3994a == audioAttributesImplBase.e() && this.f3997d == audioAttributesImplBase.f3997d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3995b), Integer.valueOf(this.f3996c), Integer.valueOf(this.f3994a), Integer.valueOf(this.f3997d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f3997d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f3997d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.e(this.f3994a));
        sb2.append(" content=");
        sb2.append(this.f3995b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f3996c).toUpperCase());
        return sb2.toString();
    }

    AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f3995b = i10;
        this.f3996c = i11;
        this.f3994a = i12;
        this.f3997d = i13;
    }
}
