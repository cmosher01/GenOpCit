package nu.mine.mosher.genealogy.genopcit.model.type;

import java.util.Arrays;
import java.util.Objects;

public final class Opaque {
    public static final Opaque EMPTY = new Opaque(new byte[] {});

    private final byte[] blob;

    public Opaque(final byte[] blob) {
        this.blob = Arrays.copyOf(Objects.requireNonNull(blob), blob.length);
    }

    @Override
    public String toString() {
        final StringBuilder s = new StringBuilder(16);
        s.append("opaque{");
        for (int i = 0; i < Math.min(8, this.blob.length); ++i) {
            s.append(String.format("%02x", this.blob[i]));
        }
        s.append("}");
        return s.toString();
    }

    public boolean isEmpty() {
        return this.blob.length == 0;
    }

    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Opaque)) {
            return false;
        }
        final Opaque that = (Opaque)object;
        return Arrays.equals(this.blob, that.blob);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(blob);
    }
}
