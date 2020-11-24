package nu.mine.mosher.genealogy.genopcit.model.entity.conclude;

import nu.mine.mosher.genealogy.genopcit.model.type.Descriptor;
import nu.mine.mosher.genealogy.genopcit.model.type.Uncategorized;

import java.util.ArrayList;
import java.util.List;

public class Sameness extends Descriptor<Uncategorized> {
    public List<Is> are = new ArrayList<>();
}
