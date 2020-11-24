package nu.mine.mosher.genealogy.genopcit.model.entity.extract;

import nu.mine.mosher.genealogy.genopcit.model.entity.source.Citation;
import nu.mine.mosher.genealogy.genopcit.model.type.Descriptor;
import nu.mine.mosher.genealogy.genopcit.model.type.Uncategorized;

public class ExtractedFrom extends Descriptor<Uncategorized> {
    public Persona persona;
    public Citation citation;
}
