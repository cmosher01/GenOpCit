package nu.mine.mosher.genealogy.genopcit.model.entity.conclude;


import nu.mine.mosher.genealogy.genopcit.model.entity.extract.Persona;
import nu.mine.mosher.genealogy.genopcit.model.type.Certainty;
import nu.mine.mosher.genealogy.genopcit.model.type.Descriptor;
import nu.mine.mosher.genealogy.genopcit.model.type.Uncategorized;

public class Is extends Descriptor<Uncategorized> {
    public Certainty certainty = Certainty.UNKNOWN;

    public Sameness sameness;
    public Persona persona;
}
