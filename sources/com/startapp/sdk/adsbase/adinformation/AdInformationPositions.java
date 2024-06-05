package com.startapp.sdk.adsbase.adinformation;

import android.widget.RelativeLayout;

/* compiled from: Sta */
public class AdInformationPositions {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16871a = Position.BOTTOM_LEFT.name();

    /* compiled from: Sta */
    public enum Position {
        TOP_LEFT(1, new int[]{10, 9}, -1),
        TOP_RIGHT(2, new int[]{10, 11}, 1),
        BOTTOM_LEFT(3, new int[]{12, 9}, -1),
        BOTTOM_RIGHT(4, new int[]{12, 11}, 1);
        
        private int animationMultiplier;
        private int index;
        private int[] rules;

        private Position(int i10, int[] iArr, int i11) {
            this.rules = iArr;
            this.animationMultiplier = i11;
            this.index = i10;
        }

        public static Position getByIndex(long j10) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (((long) values[i10].getIndex()) == j10) {
                    position = values[i10];
                }
            }
            return position;
        }

        public static Position getByName(String str) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    position = values[i10];
                }
            }
            return position;
        }

        public void addRules(RelativeLayout.LayoutParams layoutParams) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.rules;
                if (i10 < iArr.length) {
                    layoutParams.addRule(iArr[i10]);
                    i10++;
                } else {
                    return;
                }
            }
        }

        public Position flipHorizontal() {
            int i10 = a.f16872a[ordinal()];
            if (i10 == 1) {
                return TOP_RIGHT;
            }
            if (i10 == 2) {
                return TOP_LEFT;
            }
            if (i10 == 3) {
                return BOTTOM_RIGHT;
            }
            if (i10 == 4) {
                return BOTTOM_LEFT;
            }
            throw new IllegalStateException();
        }

        public int getAnimationStartMultiplier() {
            return this.animationMultiplier;
        }

        public int getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16872a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.startapp.sdk.adsbase.adinformation.AdInformationPositions$Position[] r0 = com.startapp.sdk.adsbase.adinformation.AdInformationPositions.Position.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16872a = r0
                com.startapp.sdk.adsbase.adinformation.AdInformationPositions$Position r1 = com.startapp.sdk.adsbase.adinformation.AdInformationPositions.Position.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16872a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.adsbase.adinformation.AdInformationPositions$Position r1 = com.startapp.sdk.adsbase.adinformation.AdInformationPositions.Position.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16872a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.sdk.adsbase.adinformation.AdInformationPositions$Position r1 = com.startapp.sdk.adsbase.adinformation.AdInformationPositions.Position.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16872a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.sdk.adsbase.adinformation.AdInformationPositions$Position r1 = com.startapp.sdk.adsbase.adinformation.AdInformationPositions.Position.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.adinformation.AdInformationPositions.a.<clinit>():void");
        }
    }
}
