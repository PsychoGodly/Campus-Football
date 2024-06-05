package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import pe.e3;
import pe.p0;
import pe.x;
import sd.s;
import ye.a;
import ye.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzda {
    public static final zzct zza = new zzct((h) null);
    public x zzb;
    private final WebView zzc;
    /* access modifiers changed from: private */
    public final String zzd;
    /* access modifiers changed from: private */
    public final Context zze;
    /* access modifiers changed from: private */
    public final zzr zzf;
    /* access modifiers changed from: private */
    public final String zzg;
    /* access modifiers changed from: private */
    public final String zzh;
    private final zzaj zzi;
    /* access modifiers changed from: private */
    public final Map zzj;
    /* access modifiers changed from: private */
    public final Map zzk;
    private final Map zzl;
    private final zzas zzm;
    /* access modifiers changed from: private */
    public final zzdk zzn = zzdk.zzc();
    /* access modifiers changed from: private */
    public final a zzo = c.b(false, 1, (Object) null);
    private final zzcu zzp;

    public zzda(WebView webView, String str, Context context, zzr zzr, String str2, String str3, zzaj zzaj, p0 p0Var) {
        this.zzc = webView;
        this.zzd = str;
        this.zze = context;
        this.zzf = zzr;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzaj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzk = linkedHashMap;
        this.zzl = linkedHashMap;
        zzbc zzbc = new zzbc(webView, p0Var);
        zzp zzp2 = zzp.zza;
        this.zzm = new zzba(zzbc, zzp.zzc(), context);
        zzcu zzcu = new zzcu(this);
        this.zzp = zzcu;
        this.zzj = zzq();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzcu, "RN");
        webView.setWebViewClient(new zzcs(this));
    }

    private final zzh zzo(Exception exc) {
        if (exc instanceof e3) {
            return new zzh(zzf.zzc, zzd.zzj);
        }
        if (exc instanceof zzh) {
            return (zzh) exc;
        }
        return new zzh(zzf.zzc, zzd.zzu);
    }

    private final void zzp(List list, zzh zzh2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzai zzai = zzai.zza;
            String str = this.zzg;
            String str2 = this.zzh;
            zzai.zzd(new zzaf((zzkw) it.next(), str, str2, str2, (String) null), String.valueOf(zzh2.zzb().zza()), zzh2.zza().zza(), this.zze, this.zzf, (String) null);
        }
    }

    private static final Map zzq() {
        Map l10 = k0.l(s.a(-4, zzd.zzA), s.a(-12, zzd.zzB), s.a(-6, zzd.zzw), s.a(-11, zzd.zzy), s.a(-13, zzd.zzC), s.a(-14, zzd.zzD), s.a(-2, zzd.zzx), s.a(-7, zzd.zzE), s.a(-5, zzd.zzF), s.a(-9, zzd.zzG), s.a(-8, zzd.zzQ), s.a(-15, zzd.zzz), s.a(-1, zzd.zzH), s.a(-3, zzd.zzJ), s.a(-10, zzd.zzK));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            l10.put(-16, zzd.zzI);
        }
        if (i10 >= 27) {
            l10.put(1, zzd.zzM);
            l10.put(2, zzd.zzN);
            l10.put(0, zzd.zzO);
            l10.put(3, zzd.zzP);
        }
        if (i10 >= 29) {
            l10.put(4, zzd.zzL);
        }
        return l10;
    }

    public final WebView zzb() {
        return this.zzc;
    }

    public final zzas zzd() {
        return this.zzm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzf(com.google.android.recaptcha.RecaptchaAction r12, xd.d r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzcv
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.recaptcha.internal.zzcv r0 = (com.google.android.recaptcha.internal.zzcv) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzcv r0 = new com.google.android.recaptcha.internal.zzcv
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.zza
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.String r12 = r0.zze
            com.google.android.recaptcha.internal.zzda r0 = r0.zzd
            sd.p.b(r13)     // Catch:{ Exception -> 0x002d }
            goto L_0x008b
        L_0x002d:
            r13 = move-exception
            goto L_0x00b1
        L_0x0030:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0038:
            sd.p.b(r13)
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            com.google.android.recaptcha.internal.zzai r2 = com.google.android.recaptcha.internal.zzai.zza
            com.google.android.recaptcha.internal.zzaf r2 = new com.google.android.recaptcha.internal.zzaf
            com.google.android.recaptcha.internal.zzkw r5 = com.google.android.recaptcha.internal.zzkw.EXECUTE_TOTAL
            java.lang.String r6 = r11.zzg
            java.lang.String r7 = r11.zzh
            r9 = 0
            r4 = r2
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r4 = r11.zzd
            com.google.android.recaptcha.internal.zzs r5 = new com.google.android.recaptcha.internal.zzs
            r5.<init>()
            com.google.android.recaptcha.internal.zzai.zzb(r2, r4, r5)
            com.google.android.recaptcha.internal.zzaf r2 = new com.google.android.recaptcha.internal.zzaf
            com.google.android.recaptcha.internal.zzkw r5 = com.google.android.recaptcha.internal.zzkw.EXECUTE_NATIVE
            java.lang.String r6 = r11.zzg
            java.lang.String r7 = r11.zzh
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r4 = r11.zzd
            com.google.android.recaptcha.internal.zzs r5 = new com.google.android.recaptcha.internal.zzs
            r5.<init>()
            com.google.android.recaptcha.internal.zzai.zzb(r2, r4, r5)
            com.google.android.recaptcha.internal.zzcw r2 = new com.google.android.recaptcha.internal.zzcw     // Catch:{ Exception -> 0x00ac }
            r4 = 0
            r2.<init>(r12, r11, r13, r4)     // Catch:{ Exception -> 0x00ac }
            r0.zzd = r11     // Catch:{ Exception -> 0x00ac }
            r0.zze = r13     // Catch:{ Exception -> 0x00ac }
            r0.zzc = r3     // Catch:{ Exception -> 0x00ac }
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r12 = pe.g3.c(r3, r2, r0)     // Catch:{ Exception -> 0x00ac }
            if (r12 == r1) goto L_0x00ab
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x008b:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x002d }
            com.google.android.recaptcha.internal.zzai r1 = com.google.android.recaptcha.internal.zzai.zza     // Catch:{ Exception -> 0x002d }
            com.google.android.recaptcha.internal.zzaf r1 = new com.google.android.recaptcha.internal.zzaf     // Catch:{ Exception -> 0x002d }
            com.google.android.recaptcha.internal.zzkw r3 = com.google.android.recaptcha.internal.zzkw.EXECUTE_TOTAL     // Catch:{ Exception -> 0x002d }
            java.lang.String r4 = r0.zzg     // Catch:{ Exception -> 0x002d }
            java.lang.String r5 = r0.zzh     // Catch:{ Exception -> 0x002d }
            r7 = 0
            r2 = r1
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x002d }
            android.content.Context r2 = r0.zze     // Catch:{ Exception -> 0x002d }
            com.google.android.recaptcha.internal.zzr r3 = r0.zzf     // Catch:{ Exception -> 0x002d }
            com.google.android.recaptcha.internal.zzai.zzc(r1, r2, r3)     // Catch:{ Exception -> 0x002d }
            sd.o$a r1 = sd.o.f38128b     // Catch:{ Exception -> 0x002d }
            java.lang.Object r12 = sd.o.b(r13)     // Catch:{ Exception -> 0x002d }
            goto L_0x00dd
        L_0x00ab:
            return r1
        L_0x00ac:
            r12 = move-exception
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x00b1:
            com.google.android.recaptcha.internal.zzkw r1 = com.google.android.recaptcha.internal.zzkw.EXECUTE_TOTAL
            java.util.List r1 = td.p.b(r1)
            com.google.android.recaptcha.internal.zzh r13 = r0.zzo(r13)
            r0.zzp(r1, r13)
            com.google.android.recaptcha.RecaptchaException r13 = r13.zzc()
            java.util.Map r0 = r0.zzk
            java.lang.Object r12 = r0.remove(r12)
            pe.o r12 = (pe.o) r12
            if (r12 == 0) goto L_0x00d3
            boolean r12 = r12.p(r13)
            kotlin.coroutines.jvm.internal.b.a(r12)
        L_0x00d3:
            sd.o$a r12 = sd.o.f38128b
            java.lang.Object r12 = sd.p.a(r13)
            java.lang.Object r12 = sd.o.b(r12)
        L_0x00dd:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzf(com.google.android.recaptcha.RecaptchaAction, xd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzg(xd.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.recaptcha.internal.zzcx
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzcx r0 = new com.google.android.recaptcha.internal.zzcx
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.zza
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            com.google.android.recaptcha.internal.zzda r0 = r0.zzd
            sd.p.b(r11)     // Catch:{ Exception -> 0x002b }
            goto L_0x0076
        L_0x002b:
            r11 = move-exception
            goto L_0x0080
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0035:
            sd.p.b(r11)
            com.google.android.recaptcha.internal.zzai r11 = com.google.android.recaptcha.internal.zzai.zza
            com.google.android.recaptcha.internal.zzaf r11 = new com.google.android.recaptcha.internal.zzaf
            com.google.android.recaptcha.internal.zzkw r5 = com.google.android.recaptcha.internal.zzkw.INIT_NATIVE
            java.lang.String r6 = r10.zzg
            java.lang.String r8 = r10.zzh
            r9 = 0
            r4 = r11
            r7 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r2 = r10.zzd
            com.google.android.recaptcha.internal.zzs r4 = new com.google.android.recaptcha.internal.zzs
            r4.<init>()
            com.google.android.recaptcha.internal.zzai.zzb(r11, r2, r4)
            r11 = 0
            pe.x r2 = pe.z.b(r11, r3, r11)
            r10.zzb = r2
            pe.x r2 = r10.zzm()
            int r2 = r2.hashCode()
            kotlin.coroutines.jvm.internal.b.c(r2)
            com.google.android.recaptcha.internal.zzcz r2 = new com.google.android.recaptcha.internal.zzcz     // Catch:{ Exception -> 0x007e }
            r2.<init>(r10, r11)     // Catch:{ Exception -> 0x007e }
            r0.zzd = r10     // Catch:{ Exception -> 0x007e }
            r0.zzc = r3     // Catch:{ Exception -> 0x007e }
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r11 = pe.g3.c(r4, r2, r0)     // Catch:{ Exception -> 0x007e }
            if (r11 == r1) goto L_0x007d
            r0 = r10
        L_0x0076:
            sd.o r11 = (sd.o) r11     // Catch:{ Exception -> 0x002b }
            java.lang.Object r11 = r11.i()     // Catch:{ Exception -> 0x002b }
            goto L_0x00d3
        L_0x007d:
            return r1
        L_0x007e:
            r11 = move-exception
            r0 = r10
        L_0x0080:
            r11.getMessage()
            boolean r1 = r11 instanceof pe.e3
            if (r1 == 0) goto L_0x0098
            r2 = 2
            com.google.android.recaptcha.internal.zzkw[] r2 = new com.google.android.recaptcha.internal.zzkw[r2]
            r4 = 0
            com.google.android.recaptcha.internal.zzkw r5 = com.google.android.recaptcha.internal.zzkw.INIT_TOTAL
            r2[r4] = r5
            com.google.android.recaptcha.internal.zzkw r4 = com.google.android.recaptcha.internal.zzkw.INIT_NETWORK
            r2[r3] = r4
            java.util.List r2 = td.q.f(r2)
            goto L_0x009e
        L_0x0098:
            com.google.android.recaptcha.internal.zzkw r2 = com.google.android.recaptcha.internal.zzkw.INIT_TOTAL
            java.util.List r2 = td.p.b(r2)
        L_0x009e:
            com.google.android.recaptcha.internal.zzcu r3 = r0.zzp
            java.lang.Long r3 = r3.zza()
            if (r1 != 0) goto L_0x00a7
            goto L_0x00be
        L_0x00a7:
            if (r3 != 0) goto L_0x00aa
            goto L_0x00b4
        L_0x00aa:
            long r3 = r3.longValue()
            r5 = 8000(0x1f40, double:3.9525E-320)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00be
        L_0x00b4:
            com.google.android.recaptcha.internal.zzh r11 = new com.google.android.recaptcha.internal.zzh
            com.google.android.recaptcha.internal.zzf r1 = com.google.android.recaptcha.internal.zzf.zze
            com.google.android.recaptcha.internal.zzd r3 = com.google.android.recaptcha.internal.zzd.zzT
            r11.<init>(r1, r3)
            goto L_0x00c2
        L_0x00be:
            com.google.android.recaptcha.internal.zzh r11 = r0.zzo(r11)
        L_0x00c2:
            r0.zzp(r2, r11)
            sd.o$a r0 = sd.o.f38128b
            com.google.android.recaptcha.RecaptchaException r11 = r11.zzc()
            java.lang.Object r11 = sd.p.a(r11)
            java.lang.Object r11 = sd.o.b(r11)
        L_0x00d3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzg(xd.d):java.lang.Object");
    }

    public final x zzm() {
        x xVar = this.zzb;
        if (xVar != null) {
            return xVar;
        }
        return null;
    }
}
