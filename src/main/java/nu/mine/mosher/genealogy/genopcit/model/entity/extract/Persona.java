package nu.mine.mosher.genealogy.genopcit.model.entity.extract;

import nu.mine.mosher.genealogy.genopcit.model.entity.conclude.Is;
import nu.mine.mosher.genealogy.genopcit.model.type.Descriptor;
import nu.mine.mosher.genealogy.genopcit.model.type.Uncategorized;

import java.util.ArrayList;
import java.util.List;

public class Persona extends Descriptor<Uncategorized> {
    public List<ExtractedFrom> citations = new ArrayList<>();
    public List<Is> xrefs = new ArrayList<>();
}
