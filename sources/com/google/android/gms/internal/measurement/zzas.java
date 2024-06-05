package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzas implements zzaq, Iterable<zzaq> {
    /* access modifiers changed from: private */
    public final String zza;

    public zzas(String str) {
        if (str != null) {
            this.zza = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        return this.zza.equals(((zzas) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        String str = this.zza;
        return "\"" + str + "\"";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0216, code lost:
        if (r24.size() > 0) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0218, code lost:
        r4 = com.google.android.gms.internal.measurement.zzaq.zzc.zzf();
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0221, code lost:
        r5 = r23;
        r4 = r5.zza(r2.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0237, code lost:
        if (r24.size() >= 2) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023a, code lost:
        r0 = r5.zza(r2.get(1)).zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0260, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r3.indexOf(r4, (int) com.google.android.gms.internal.measurement.zzg.zza(r0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0261, code lost:
        r6 = r21;
        r5 = r23;
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zzc("replace", 2, r2);
        r0 = com.google.android.gms.internal.measurement.zzaq.zzc;
        r1 = r0.zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0275, code lost:
        if (r24.isEmpty() != false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0277, code lost:
        r1 = r5.zza(r2.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028b, code lost:
        if (r24.size() <= 1) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028d, code lost:
        r0 = r5.zza(r2.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0297, code lost:
        r2 = r6.zza;
        r3 = r2.indexOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x029d, code lost:
        if (r3 >= 0) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x029f, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a2, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzal) == false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02a4, code lost:
        r0 = ((com.google.android.gms.internal.measurement.zzal) r0).zza(r5, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzaq[]{new com.google.android.gms.internal.measurement.zzas(r1), new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r3)), r6}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f2, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r2.substring(0, r3) + r0.zzf() + r2.substring(r3 + r1.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f3, code lost:
        r5 = r23;
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zzc("substring", 2, r2);
        r0 = r21.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0303, code lost:
        if (r24.isEmpty() != false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0305, code lost:
        r1 = (int) com.google.android.gms.internal.measurement.zzg.zza(r5.zza(r2.get(0)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x031e, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0324, code lost:
        if (r24.size() <= 1) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0326, code lost:
        r2 = (int) com.google.android.gms.internal.measurement.zzg.zza(r5.zza(r2.get(1)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x033e, code lost:
        r2 = r0.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0342, code lost:
        r1 = java.lang.Math.min(java.lang.Math.max(r1, 0), r0.length());
        r2 = java.lang.Math.min(java.lang.Math.max(r2, 0), r0.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x036c, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r0.substring(java.lang.Math.min(r1, r2), java.lang.Math.max(r1, r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x036d, code lost:
        r6 = r21;
        r5 = r23;
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zzc("split", 2, r2);
        r0 = r6.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x037d, code lost:
        if (r0.length() != 0) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x038a, code lost:
        return new com.google.android.gms.internal.measurement.zzaf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x038b, code lost:
        r1 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0395, code lost:
        if (r24.isEmpty() == false) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0397, code lost:
        r1.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039c, code lost:
        r3 = r5.zza(r2.get(0)).zzf();
        r7 = 2147483647L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03b2, code lost:
        if (r24.size() <= 1) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03b4, code lost:
        r7 = com.google.android.gms.internal.measurement.zzg.zzc(r5.zza(r2.get(1)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03ce, code lost:
        if (r7 != 0) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03d5, code lost:
        return new com.google.android.gms.internal.measurement.zzaf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03d6, code lost:
        r0 = r0.split(java.util.regex.Pattern.quote(r3), ((int) r7) + 1);
        r2 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03e6, code lost:
        if (r3.isEmpty() == false) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03e9, code lost:
        if (r0.length <= 0) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03eb, code lost:
        r14 = r0[0].isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03fb, code lost:
        if (r0[r0.length - 1].isEmpty() == false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03fd, code lost:
        r2 = r0.length - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0400, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0405, code lost:
        if (((long) r0.length) <= r7) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0407, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0409, code lost:
        if (r14 >= r2) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x040b, code lost:
        r1.add(new com.google.android.gms.internal.measurement.zzas(r0[r14]));
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x041d, code lost:
        return new com.google.android.gms.internal.measurement.zzaf((java.util.List<com.google.android.gms.internal.measurement.zzaq>) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x041e, code lost:
        r5 = r23;
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zzc("slice", 2, r2);
        r3 = r21.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x042e, code lost:
        if (r24.isEmpty() != false) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0430, code lost:
        r7 = r5.zza(r2.get(0)).zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0444, code lost:
        r7 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0445, code lost:
        r7 = com.google.android.gms.internal.measurement.zzg.zza(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x044b, code lost:
        if (r7 >= 0.0d) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x044d, code lost:
        r7 = java.lang.Math.max(((double) r3.length()) + r7, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0458, code lost:
        r7 = java.lang.Math.min(r7, (double) r3.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0461, code lost:
        r4 = (int) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0467, code lost:
        if (r24.size() <= 1) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0469, code lost:
        r7 = r5.zza(r2.get(1)).zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x047c, code lost:
        r7 = (double) r3.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0481, code lost:
        r7 = com.google.android.gms.internal.measurement.zzg.zza(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0487, code lost:
        if (r7 >= 0.0d) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0489, code lost:
        r0 = java.lang.Math.max(((double) r3.length()) + r7, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0494, code lost:
        r0 = java.lang.Math.min(r7, (double) r3.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04ae, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r3.substring(r4, java.lang.Math.max(0, ((int) r0) - r4) + r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04af, code lost:
        r5 = r23;
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zzc("match", 1, r2);
        r0 = r21.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04bf, code lost:
        if (r24.size() > 0) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04c1, code lost:
        r1 = com.applovin.mediation.MaxReward.DEFAULT_LABEL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04c4, code lost:
        r1 = r5.zza(r2.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04d3, code lost:
        r0 = java.util.regex.Pattern.compile(r1).matcher(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04df, code lost:
        if (r0.find() == false) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04f5, code lost:
        return new com.google.android.gms.internal.measurement.zzaf(new com.google.android.gms.internal.measurement.zzas(r0.group()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04f8, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04f9, code lost:
        com.google.android.gms.internal.measurement.zzg.zza(r5, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x050c, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.zza.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x050d, code lost:
        com.google.android.gms.internal.measurement.zzg.zza(r5, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0522, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.zza.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0523, code lost:
        r5 = r23;
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zzc("lastIndexOf", 2, r2);
        r0 = r21.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0533, code lost:
        if (r24.size() > 0) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0535, code lost:
        r1 = com.google.android.gms.internal.measurement.zzaq.zzc.zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x053c, code lost:
        r1 = r5.zza(r2.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0550, code lost:
        if (r24.size() >= 2) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0552, code lost:
        r2 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0555, code lost:
        r2 = r5.zza(r2.get(1)).zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x056c, code lost:
        if (java.lang.Double.isNaN(r2) == false) goto L_0x0571;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x056e, code lost:
        r2 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0571, code lost:
        r2 = com.google.android.gms.internal.measurement.zzg.zza(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0584, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r0.lastIndexOf(r1, (int) r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0585, code lost:
        com.google.android.gms.internal.measurement.zzg.zza(r14, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0598, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.zza.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0599, code lost:
        r6 = r21;
        r5 = r23;
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zzc(com.applovin.sdk.AppLovinEventTypes.USER_EXECUTED_SEARCH, 1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05a8, code lost:
        if (r24.isEmpty() != false) goto L_0x05b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05aa, code lost:
        r0 = r5.zza(r2.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05b9, code lost:
        r0 = com.google.android.gms.internal.measurement.zzaq.zzc.zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05bf, code lost:
        r0 = java.util.regex.Pattern.compile(r0).matcher(r6.zza);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05cd, code lost:
        if (r0.find() == false) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05dd, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r0.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05e9, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05ea, code lost:
        com.google.android.gms.internal.measurement.zzg.zza("toLowerCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0600, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.zza.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0601, code lost:
        r6 = r21;
        r5 = r23;
        r2 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x060b, code lost:
        if (r24.isEmpty() == false) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x060d, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x060e, code lost:
        r0 = new java.lang.StringBuilder(r6.zza);
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x061a, code lost:
        if (r14 >= r24.size()) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x061c, code lost:
        r0.append(r5.zza(r2.get(r14)).zzf());
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0639, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x063a, code lost:
        r6 = r21;
        r5 = r23;
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zzc(r4, 1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0648, code lost:
        if (r24.isEmpty() != false) goto L_0x0663;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x064a, code lost:
        r14 = (int) com.google.android.gms.internal.measurement.zzg.zza(r5.zza(r2.get(0)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0663, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0664, code lost:
        r0 = r6.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0666, code lost:
        if (r14 < 0) goto L_0x067d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x066c, code lost:
        if (r14 < r0.length()) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x067c, code lost:
        return new com.google.android.gms.internal.measurement.zzas(java.lang.String.valueOf(r0.charAt(r14)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x067f, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzj;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0680, code lost:
        com.google.android.gms.internal.measurement.zzg.zza(r17, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0695, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.zza.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0696, code lost:
        r0 = r6;
        r6 = r21;
        com.google.android.gms.internal.measurement.zzg.zza(r0, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x069f, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06a0, code lost:
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zza(r3, 1, r2);
        r0 = r21.zza;
        r1 = r23.zza(r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x06c1, code lost:
        if ("length".equals(r1.zzf()) == false) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x06c5, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x06c6, code lost:
        r1 = r1.zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x06d4, code lost:
        if (r1 != java.lang.Math.floor(r1)) goto L_0x06e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x06d6, code lost:
        r1 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06d7, code lost:
        if (r1 < 0) goto L_0x06e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06dd, code lost:
        if (r1 >= r0.length()) goto L_0x06e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06e1, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06e4, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b6, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        r3 = r17;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
        r17 = "toLocaleLowerCase";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fb, code lost:
        r0 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fd, code lost:
        switch(r20) {
            case 0: goto L_0x06a0;
            case 1: goto L_0x0696;
            case 2: goto L_0x0680;
            case 3: goto L_0x063a;
            case 4: goto L_0x0601;
            case 5: goto L_0x05ea;
            case 6: goto L_0x0599;
            case 7: goto L_0x0585;
            case 8: goto L_0x0523;
            case 9: goto L_0x050d;
            case 10: goto L_0x04f9;
            case 11: goto L_0x04af;
            case 12: goto L_0x041e;
            case 13: goto L_0x036d;
            case 14: goto L_0x02f3;
            case 15: goto L_0x0261;
            case 16: goto L_0x0208;
            default: goto L_0x0200;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0207, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0208, code lost:
        r2 = r24;
        com.google.android.gms.internal.measurement.zzg.zzc("indexOf", 2, r2);
        r3 = r21.zza;
     */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r22, com.google.android.gms.internal.measurement.zzh r23, java.util.List<com.google.android.gms.internal.measurement.zzaq> r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "concat"
            java.lang.String r7 = "indexOf"
            java.lang.String r8 = "replace"
            java.lang.String r9 = "substring"
            java.lang.String r10 = "split"
            java.lang.String r11 = "slice"
            java.lang.String r12 = "match"
            java.lang.String r13 = "lastIndexOf"
            java.lang.String r14 = "toLocaleUpperCase"
            java.lang.String r15 = "search"
            java.lang.String r2 = "toLowerCase"
            java.lang.String r0 = "toLocaleLowerCase"
            java.lang.String r3 = "toString"
            r16 = r4
            java.lang.String r4 = "hasOwnProperty"
            r17 = r14
            java.lang.String r14 = "toUpperCase"
            r18 = r14
            if (r5 != 0) goto L_0x009f
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x009f
            r5 = r18
            boolean r18 = r5.equals(r1)
            r14 = r17
            if (r18 != 0) goto L_0x00a3
            boolean r17 = r14.equals(r1)
            if (r17 != 0) goto L_0x00a3
            r17 = r4
            java.lang.String r4 = "trim"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x009d
            goto L_0x00a5
        L_0x009d:
            r4 = 0
            goto L_0x00a6
        L_0x009f:
            r14 = r17
            r5 = r18
        L_0x00a3:
            r17 = r4
        L_0x00a5:
            r4 = 1
        L_0x00a6:
            if (r4 == 0) goto L_0x06e5
            r22.hashCode()
            int r4 = r22.hashCode()
            r19 = r3
            r20 = -1
            switch(r4) {
                case -1789698943: goto L_0x01ea;
                case -1776922004: goto L_0x01d8;
                case -1464939364: goto L_0x01c6;
                case -1361633751: goto L_0x01b5;
                case -1354795244: goto L_0x01a2;
                case -1137582698: goto L_0x018f;
                case -906336856: goto L_0x017c;
                case -726908483: goto L_0x0169;
                case -467511597: goto L_0x0155;
                case -399551817: goto L_0x0141;
                case 3568674: goto L_0x012c;
                case 103668165: goto L_0x011a;
                case 109526418: goto L_0x0108;
                case 109648666: goto L_0x00f6;
                case 530542161: goto L_0x00e4;
                case 1094496948: goto L_0x00d2;
                case 1943291465: goto L_0x00c0;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r4 = r16
        L_0x00b8:
            r3 = r17
            r6 = r19
        L_0x00bc:
            r17 = r0
            goto L_0x01fb
        L_0x00c0:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x00c7
            goto L_0x00b6
        L_0x00c7:
            r1 = 16
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 16
            goto L_0x00bc
        L_0x00d2:
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x00d9
            goto L_0x00b6
        L_0x00d9:
            r1 = 15
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 15
            goto L_0x00bc
        L_0x00e4:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00eb
            goto L_0x00b6
        L_0x00eb:
            r1 = 14
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 14
            goto L_0x00bc
        L_0x00f6:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x00fd
            goto L_0x00b6
        L_0x00fd:
            r1 = 13
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 13
            goto L_0x00bc
        L_0x0108:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x010f
            goto L_0x00b6
        L_0x010f:
            r1 = 12
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 12
            goto L_0x00bc
        L_0x011a:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x0121
            goto L_0x00b6
        L_0x0121:
            r1 = 11
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 11
            goto L_0x00bc
        L_0x012c:
            java.lang.String r4 = "trim"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0135
            goto L_0x00b6
        L_0x0135:
            r1 = 10
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 10
            goto L_0x00bc
        L_0x0141:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0149
            goto L_0x00b6
        L_0x0149:
            r1 = 9
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 9
            goto L_0x00bc
        L_0x0155:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x015d
            goto L_0x00b6
        L_0x015d:
            r1 = 8
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 8
            goto L_0x00bc
        L_0x0169:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0171
            goto L_0x00b6
        L_0x0171:
            r1 = 7
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 7
            goto L_0x00bc
        L_0x017c:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0184
            goto L_0x00b6
        L_0x0184:
            r1 = 6
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 6
            goto L_0x00bc
        L_0x018f:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0197
            goto L_0x00b6
        L_0x0197:
            r1 = 5
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 5
            goto L_0x00bc
        L_0x01a2:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01aa
            goto L_0x00b6
        L_0x01aa:
            r1 = 4
            r4 = r16
            r3 = r17
            r6 = r19
            r20 = 4
            goto L_0x00bc
        L_0x01b5:
            r4 = r16
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x01be
            goto L_0x01ce
        L_0x01be:
            r3 = r17
            r6 = r19
            r20 = 3
            goto L_0x00bc
        L_0x01c6:
            r4 = r16
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x01d0
        L_0x01ce:
            goto L_0x00b8
        L_0x01d0:
            r3 = r17
            r6 = r19
            r20 = 2
            goto L_0x00bc
        L_0x01d8:
            r4 = r16
            r6 = r19
            boolean r1 = r1.equals(r6)
            r3 = r17
            if (r1 != 0) goto L_0x01e6
            goto L_0x00bc
        L_0x01e6:
            r20 = 1
            goto L_0x00bc
        L_0x01ea:
            r4 = r16
            r3 = r17
            r6 = r19
            boolean r1 = r1.equals(r3)
            r17 = r0
            if (r1 != 0) goto L_0x01f9
            goto L_0x01fb
        L_0x01f9:
            r20 = 0
        L_0x01fb:
            r0 = 0
            switch(r20) {
                case 0: goto L_0x06a0;
                case 1: goto L_0x0696;
                case 2: goto L_0x0680;
                case 3: goto L_0x063a;
                case 4: goto L_0x0601;
                case 5: goto L_0x05ea;
                case 6: goto L_0x0599;
                case 7: goto L_0x0585;
                case 8: goto L_0x0523;
                case 9: goto L_0x050d;
                case 10: goto L_0x04f9;
                case 11: goto L_0x04af;
                case 12: goto L_0x041e;
                case 13: goto L_0x036d;
                case 14: goto L_0x02f3;
                case 15: goto L_0x0261;
                case 16: goto L_0x0208;
                default: goto L_0x0200;
            }
        L_0x0200:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0208:
            r2 = r24
            r3 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r7, r3, r2)
            r6 = r21
            java.lang.String r3 = r6.zza
            int r4 = r24.size()
            if (r4 > 0) goto L_0x0221
            com.google.android.gms.internal.measurement.zzaq r4 = com.google.android.gms.internal.measurement.zzaq.zzc
            java.lang.String r4 = r4.zzf()
            r5 = r23
            goto L_0x0232
        L_0x0221:
            r4 = 0
            java.lang.Object r4 = r2.get(r4)
            com.google.android.gms.internal.measurement.zzaq r4 = (com.google.android.gms.internal.measurement.zzaq) r4
            r5 = r23
            com.google.android.gms.internal.measurement.zzaq r4 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r4)
            java.lang.String r4 = r4.zzf()
        L_0x0232:
            int r7 = r24.size()
            r8 = 2
            if (r7 >= r8) goto L_0x023a
            goto L_0x024d
        L_0x023a:
            r0 = 1
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            java.lang.Double r0 = r0.zze()
            double r0 = r0.doubleValue()
        L_0x024d:
            double r0 = com.google.android.gms.internal.measurement.zzg.zza((double) r0)
            com.google.android.gms.internal.measurement.zzai r2 = new com.google.android.gms.internal.measurement.zzai
            int r0 = (int) r0
            int r0 = r3.indexOf(r4, r0)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.<init>(r0)
            return r2
        L_0x0261:
            r6 = r21
            r5 = r23
            r2 = r24
            r0 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r8, r0, r2)
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzc
            java.lang.String r1 = r0.zzf()
            boolean r3 = r24.isEmpty()
            if (r3 != 0) goto L_0x0297
            r3 = 0
            java.lang.Object r1 = r2.get(r3)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.String r1 = r1.zzf()
            int r3 = r24.size()
            r4 = 1
            if (r3 <= r4) goto L_0x0297
            java.lang.Object r0 = r2.get(r4)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r0)
        L_0x0297:
            java.lang.String r2 = r6.zza
            int r3 = r2.indexOf(r1)
            if (r3 >= 0) goto L_0x02a0
            return r6
        L_0x02a0:
            boolean r4 = r0 instanceof com.google.android.gms.internal.measurement.zzal
            if (r4 == 0) goto L_0x02c9
            com.google.android.gms.internal.measurement.zzal r0 = (com.google.android.gms.internal.measurement.zzal) r0
            r4 = 3
            com.google.android.gms.internal.measurement.zzaq[] r4 = new com.google.android.gms.internal.measurement.zzaq[r4]
            com.google.android.gms.internal.measurement.zzas r7 = new com.google.android.gms.internal.measurement.zzas
            r7.<init>(r1)
            r8 = 0
            r4[r8] = r7
            com.google.android.gms.internal.measurement.zzai r7 = new com.google.android.gms.internal.measurement.zzai
            double r8 = (double) r3
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.<init>(r8)
            r8 = 1
            r4[r8] = r7
            r7 = 2
            r4[r7] = r6
            java.util.List r4 = java.util.Arrays.asList(r4)
            com.google.android.gms.internal.measurement.zzaq r0 = r0.zza((com.google.android.gms.internal.measurement.zzh) r5, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r4)
        L_0x02c9:
            com.google.android.gms.internal.measurement.zzas r4 = new com.google.android.gms.internal.measurement.zzas
            r5 = 0
            java.lang.String r5 = r2.substring(r5, r3)
            java.lang.String r0 = r0.zzf()
            int r1 = r1.length()
            int r3 = r3 + r1
            java.lang.String r1 = r2.substring(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            return r4
        L_0x02f3:
            r6 = r21
            r5 = r23
            r2 = r24
            r0 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r9, r0, r2)
            java.lang.String r0 = r6.zza
            boolean r1 = r24.isEmpty()
            if (r1 != 0) goto L_0x031e
            r1 = 0
            java.lang.Object r3 = r2.get(r1)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r1 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            java.lang.Double r1 = r1.zze()
            double r3 = r1.doubleValue()
            double r3 = com.google.android.gms.internal.measurement.zzg.zza((double) r3)
            int r1 = (int) r3
            goto L_0x031f
        L_0x031e:
            r1 = 0
        L_0x031f:
            int r3 = r24.size()
            r4 = 1
            if (r3 <= r4) goto L_0x033e
            java.lang.Object r2 = r2.get(r4)
            com.google.android.gms.internal.measurement.zzaq r2 = (com.google.android.gms.internal.measurement.zzaq) r2
            com.google.android.gms.internal.measurement.zzaq r2 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r2)
            java.lang.Double r2 = r2.zze()
            double r2 = r2.doubleValue()
            double r2 = com.google.android.gms.internal.measurement.zzg.zza((double) r2)
            int r2 = (int) r2
            goto L_0x0342
        L_0x033e:
            int r2 = r0.length()
        L_0x0342:
            r3 = 0
            int r1 = java.lang.Math.max(r1, r3)
            int r4 = r0.length()
            int r1 = java.lang.Math.min(r1, r4)
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r0.length()
            int r2 = java.lang.Math.min(r2, r3)
            com.google.android.gms.internal.measurement.zzas r3 = new com.google.android.gms.internal.measurement.zzas
            int r4 = java.lang.Math.min(r1, r2)
            int r1 = java.lang.Math.max(r1, r2)
            java.lang.String r0 = r0.substring(r4, r1)
            r3.<init>(r0)
            return r3
        L_0x036d:
            r6 = r21
            r5 = r23
            r2 = r24
            r0 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r10, r0, r2)
            java.lang.String r0 = r6.zza
            int r1 = r0.length()
            if (r1 != 0) goto L_0x038b
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r1 = 1
            com.google.android.gms.internal.measurement.zzaq[] r1 = new com.google.android.gms.internal.measurement.zzaq[r1]
            r3 = 0
            r1[r3] = r6
            r0.<init>((com.google.android.gms.internal.measurement.zzaq[]) r1)
            return r0
        L_0x038b:
            r3 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r4 = r24.isEmpty()
            if (r4 == 0) goto L_0x039c
            r1.add(r6)
            goto L_0x0418
        L_0x039c:
            java.lang.Object r4 = r2.get(r3)
            com.google.android.gms.internal.measurement.zzaq r4 = (com.google.android.gms.internal.measurement.zzaq) r4
            com.google.android.gms.internal.measurement.zzaq r3 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r4)
            java.lang.String r3 = r3.zzf()
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = r24.size()
            r9 = 1
            if (r4 <= r9) goto L_0x03ca
            java.lang.Object r2 = r2.get(r9)
            com.google.android.gms.internal.measurement.zzaq r2 = (com.google.android.gms.internal.measurement.zzaq) r2
            com.google.android.gms.internal.measurement.zzaq r2 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r2)
            java.lang.Double r2 = r2.zze()
            double r4 = r2.doubleValue()
            long r7 = com.google.android.gms.internal.measurement.zzg.zzc(r4)
        L_0x03ca:
            r4 = 0
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x03d6
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r0.<init>()
            return r0
        L_0x03d6:
            java.lang.String r2 = java.util.regex.Pattern.quote(r3)
            int r4 = (int) r7
            r5 = 1
            int r4 = r4 + r5
            java.lang.String[] r0 = r0.split(r2, r4)
            int r2 = r0.length
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0400
            int r3 = r0.length
            if (r3 <= 0) goto L_0x0400
            r3 = 0
            r3 = r0[r3]
            boolean r14 = r3.isEmpty()
            int r3 = r0.length
            r4 = 1
            int r3 = r3 - r4
            r3 = r0[r3]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0401
            int r2 = r0.length
            int r2 = r2 - r4
            goto L_0x0401
        L_0x0400:
            r14 = 0
        L_0x0401:
            int r3 = r0.length
            long r3 = (long) r3
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0409
            int r2 = r2 + -1
        L_0x0409:
            if (r14 >= r2) goto L_0x0418
            com.google.android.gms.internal.measurement.zzas r3 = new com.google.android.gms.internal.measurement.zzas
            r4 = r0[r14]
            r3.<init>(r4)
            r1.add(r3)
            int r14 = r14 + 1
            goto L_0x0409
        L_0x0418:
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r0.<init>((java.util.List<com.google.android.gms.internal.measurement.zzaq>) r1)
            return r0
        L_0x041e:
            r6 = r21
            r5 = r23
            r2 = r24
            r3 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r11, r3, r2)
            java.lang.String r3 = r6.zza
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x0444
            r4 = 0
            java.lang.Object r7 = r2.get(r4)
            com.google.android.gms.internal.measurement.zzaq r7 = (com.google.android.gms.internal.measurement.zzaq) r7
            com.google.android.gms.internal.measurement.zzaq r4 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r7)
            java.lang.Double r4 = r4.zze()
            double r7 = r4.doubleValue()
            goto L_0x0445
        L_0x0444:
            r7 = r0
        L_0x0445:
            double r7 = com.google.android.gms.internal.measurement.zzg.zza((double) r7)
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0458
            int r4 = r3.length()
            double r9 = (double) r4
            double r9 = r9 + r7
            double r7 = java.lang.Math.max(r9, r0)
            goto L_0x0461
        L_0x0458:
            int r4 = r3.length()
            double r9 = (double) r4
            double r7 = java.lang.Math.min(r7, r9)
        L_0x0461:
            int r4 = (int) r7
            int r7 = r24.size()
            r8 = 1
            if (r7 <= r8) goto L_0x047c
            java.lang.Object r2 = r2.get(r8)
            com.google.android.gms.internal.measurement.zzaq r2 = (com.google.android.gms.internal.measurement.zzaq) r2
            com.google.android.gms.internal.measurement.zzaq r2 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r2)
            java.lang.Double r2 = r2.zze()
            double r7 = r2.doubleValue()
            goto L_0x0481
        L_0x047c:
            int r2 = r3.length()
            double r7 = (double) r2
        L_0x0481:
            double r7 = com.google.android.gms.internal.measurement.zzg.zza((double) r7)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0494
            int r2 = r3.length()
            double r9 = (double) r2
            double r9 = r9 + r7
            double r0 = java.lang.Math.max(r9, r0)
            goto L_0x049d
        L_0x0494:
            int r0 = r3.length()
            double r0 = (double) r0
            double r0 = java.lang.Math.min(r7, r0)
        L_0x049d:
            int r0 = (int) r0
            int r0 = r0 - r4
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = r0 + r4
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r3.substring(r4, r0)
            r1.<init>(r0)
            return r1
        L_0x04af:
            r6 = r21
            r5 = r23
            r2 = r24
            r0 = 1
            com.google.android.gms.internal.measurement.zzg.zzc(r12, r0, r2)
            java.lang.String r0 = r6.zza
            int r1 = r24.size()
            if (r1 > 0) goto L_0x04c4
            java.lang.String r1 = ""
            goto L_0x04d3
        L_0x04c4:
            r1 = 0
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.measurement.zzaq r2 = (com.google.android.gms.internal.measurement.zzaq) r2
            com.google.android.gms.internal.measurement.zzaq r1 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r2)
            java.lang.String r1 = r1.zzf()
        L_0x04d3:
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x04f6
            com.google.android.gms.internal.measurement.zzaf r1 = new com.google.android.gms.internal.measurement.zzaf
            r2 = 1
            com.google.android.gms.internal.measurement.zzaq[] r2 = new com.google.android.gms.internal.measurement.zzaq[r2]
            com.google.android.gms.internal.measurement.zzas r3 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r0.group()
            r3.<init>(r0)
            r0 = 0
            r2[r0] = r3
            r1.<init>((com.google.android.gms.internal.measurement.zzaq[]) r2)
            return r1
        L_0x04f6:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzd
            return r0
        L_0x04f9:
            r0 = 0
            r6 = r21
            r2 = r24
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r5, (int) r0, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r2)
            java.lang.String r0 = r6.zza
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r0.trim()
            r1.<init>(r0)
            return r1
        L_0x050d:
            r0 = 0
            r6 = r21
            r2 = r24
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r5, (int) r0, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r2)
            java.lang.String r0 = r6.zza
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r2)
            r1.<init>(r0)
            return r1
        L_0x0523:
            r6 = r21
            r5 = r23
            r2 = r24
            r0 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r13, r0, r2)
            java.lang.String r0 = r6.zza
            int r1 = r24.size()
            if (r1 > 0) goto L_0x053c
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzaq.zzc
            java.lang.String r1 = r1.zzf()
            goto L_0x054b
        L_0x053c:
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.String r1 = r1.zzf()
        L_0x054b:
            int r3 = r24.size()
            r4 = 2
            if (r3 >= r4) goto L_0x0555
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0568
        L_0x0555:
            r3 = 1
            java.lang.Object r2 = r2.get(r3)
            com.google.android.gms.internal.measurement.zzaq r2 = (com.google.android.gms.internal.measurement.zzaq) r2
            com.google.android.gms.internal.measurement.zzaq r2 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r2)
            java.lang.Double r2 = r2.zze()
            double r2 = r2.doubleValue()
        L_0x0568:
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 == 0) goto L_0x0571
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x0575
        L_0x0571:
            double r2 = com.google.android.gms.internal.measurement.zzg.zza((double) r2)
        L_0x0575:
            com.google.android.gms.internal.measurement.zzai r4 = new com.google.android.gms.internal.measurement.zzai
            int r2 = (int) r2
            int r0 = r0.lastIndexOf(r1, r2)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.<init>(r0)
            return r4
        L_0x0585:
            r0 = 0
            r6 = r21
            r2 = r24
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r14, (int) r0, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r2)
            java.lang.String r0 = r6.zza
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r0.toUpperCase()
            r1.<init>(r0)
            return r1
        L_0x0599:
            r6 = r21
            r5 = r23
            r2 = r24
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.zzg.zzc(r15, r1, r2)
            boolean r1 = r24.isEmpty()
            if (r1 != 0) goto L_0x05b9
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            java.lang.String r0 = r0.zzf()
            goto L_0x05bf
        L_0x05b9:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzc
            java.lang.String r0 = r0.zzf()
        L_0x05bf:
            java.lang.String r1 = r6.zza
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x05de
            com.google.android.gms.internal.measurement.zzai r1 = new com.google.android.gms.internal.measurement.zzai
            int r0 = r0.start()
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.<init>(r0)
            return r1
        L_0x05de:
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x05ea:
            r1 = 0
            r6 = r21
            r0 = r2
            r2 = r24
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r0, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r2)
            java.lang.String r0 = r6.zza
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r2)
            r1.<init>(r0)
            return r1
        L_0x0601:
            r6 = r21
            r5 = r23
            r2 = r24
            boolean r0 = r24.isEmpty()
            if (r0 == 0) goto L_0x060e
            return r6
        L_0x060e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r6.zza
            r0.<init>(r1)
            r14 = 0
        L_0x0616:
            int r1 = r24.size()
            if (r14 >= r1) goto L_0x0630
            java.lang.Object r1 = r2.get(r14)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.String r1 = r1.zzf()
            r0.append(r1)
            int r14 = r14 + 1
            goto L_0x0616
        L_0x0630:
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            return r1
        L_0x063a:
            r6 = r21
            r5 = r23
            r2 = r24
            r0 = 1
            com.google.android.gms.internal.measurement.zzg.zzc(r4, r0, r2)
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x0663
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            java.lang.Double r0 = r0.zze()
            double r0 = r0.doubleValue()
            double r0 = com.google.android.gms.internal.measurement.zzg.zza((double) r0)
            int r14 = (int) r0
            goto L_0x0664
        L_0x0663:
            r14 = 0
        L_0x0664:
            java.lang.String r0 = r6.zza
            if (r14 < 0) goto L_0x067d
            int r1 = r0.length()
            if (r14 < r1) goto L_0x066f
            goto L_0x067d
        L_0x066f:
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            char r0 = r0.charAt(r14)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            return r1
        L_0x067d:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzj
            return r0
        L_0x0680:
            r1 = 0
            r6 = r21
            r2 = r24
            r0 = r17
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r0, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r2)
            java.lang.String r0 = r6.zza
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r0.toLowerCase()
            r1.<init>(r0)
            return r1
        L_0x0696:
            r1 = 0
            r2 = r24
            r0 = r6
            r6 = r21
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r0, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r2)
            return r6
        L_0x06a0:
            r6 = r21
            r5 = r23
            r2 = r24
            r0 = 1
            r1 = 0
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r3, (int) r0, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r2)
            java.lang.String r0 = r6.zza
            java.lang.Object r1 = r2.get(r1)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r5.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.String r2 = r1.zzf()
            java.lang.String r3 = "length"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x06c6
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzh
            return r0
        L_0x06c6:
            java.lang.Double r1 = r1.zze()
            double r1 = r1.doubleValue()
            double r3 = java.lang.Math.floor(r1)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x06e2
            int r1 = (int) r1
            if (r1 < 0) goto L_0x06e2
            int r0 = r0.length()
            if (r1 >= r0) goto L_0x06e2
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzh
            return r0
        L_0x06e2:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzi
            return r0
        L_0x06e5:
            r6 = r21
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzas.zza(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }

    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final String zzf() {
        return this.zza;
    }

    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }
}
