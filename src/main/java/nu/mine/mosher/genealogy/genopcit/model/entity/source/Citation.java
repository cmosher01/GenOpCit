package nu.mine.mosher.genealogy.genopcit.model.entity.source;

import nu.mine.mosher.genealogy.genopcit.model.entity.extract.ExtractedFrom;
import nu.mine.mosher.genealogy.genopcit.model.type.Descriptor;
import nu.mine.mosher.genealogy.genopcit.model.type.Uncategorized;

import java.util.ArrayList;
import java.util.List;

public class Citation extends Descriptor<Uncategorized> {
    public List<ExtractedFrom> extracts = new ArrayList<>();
}
