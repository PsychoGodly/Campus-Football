package androidx.webkit.internal;

import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: WebSettingsAdapter */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final WebSettingsBoundaryInterface f4995a;

    public f0(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f4995a = webSettingsBoundaryInterface;
    }

    public int a() {
        return this.f4995a.getDisabledActionModeMenuItems();
    }

    public boolean b() {
        return this.f4995a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int c() {
        return this.f4995a.getForceDark();
    }

    public boolean d() {
        return this.f4995a.getOffscreenPreRaster();
    }

    public Set<String> e() {
        return this.f4995a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean f() {
        return this.f4995a.getSafeBrowsingEnabled();
    }

    public boolean g() {
        return this.f4995a.isAlgorithmicDarkeningAllowed();
    }

    public void h(boolean z10) {
        this.f4995a.setAlgorithmicDarkeningAllowed(z10);
    }

    public void i(int i10) {
        this.f4995a.setDisabledActionModeMenuItems(i10);
    }

    public void j(boolean z10) {
        this.f4995a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z10);
    }

    public void k(int i10) {
        this.f4995a.setForceDark(i10);
    }

    public void l(int i10) {
        this.f4995a.setForceDarkBehavior(i10);
    }

    public void m(boolean z10) {
        this.f4995a.setOffscreenPreRaster(z10);
    }

    public void n(Set<String> set) {
        this.f4995a.setRequestedWithHeaderOriginAllowList(set);
    }

    public void o(boolean z10) {
        this.f4995a.setSafeBrowsingEnabled(z10);
    }

    public void p(boolean z10) {
        this.f4995a.setWillSuppressErrorPage(z10);
    }

    public boolean q() {
        return this.f4995a.getWillSuppressErrorPage();
    }
}
