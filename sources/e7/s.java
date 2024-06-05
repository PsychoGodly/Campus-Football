package e7;

import java.util.Arrays;
import java.util.List;

/* compiled from: DependencyCycleException */
public class s extends t {

    /* renamed from: a  reason: collision with root package name */
    private final List<c<?>> f28792a;

    public s(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f28792a = list;
    }
}
