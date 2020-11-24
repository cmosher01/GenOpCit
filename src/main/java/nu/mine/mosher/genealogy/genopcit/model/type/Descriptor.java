package nu.mine.mosher.genealogy.genopcit.model.type;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

/*
 * Group of fields common to all entities
 *
 * pk  primary key, permanent, UUID, never null, always valid (whether persisted or not)
 * id  database-generated ID type of column, opaque, only used to indicate existence or (short-term) equality
 * version  used only for update operations, for example to implement optimistic locking;
 *   values greater than or equal to zero are valid version numbers, starting with zero at creation time (in app)
 *   and first persisted version begin 1. Use a value less than zero to indicate a non-savable record (for example,
 *   while only partially loading a pk and description).
 * persisted  has ever been persisted in database
 * dirty  has local (in app) modifications
 *
 * create  timestamp when record was created (in app) (should us database-generated time, not app-generated)
 * modified  timestamp when record was last modified (should us database-generated time, not app-generated)
 * snapshot  timestamp when record was loaded from database
 *
 * category  enumeration of entity's category (optional)
 * customCategory  used to allow category values that are not one of the enumerated categories
 *
 * description  main description, name, title, etc. for the entity
 * notes  free-form notes
 *
 * @param <T> enum type for category
 */
public class Descriptor<T extends Enum<T>> {
    public UUID pk = UUID.randomUUID();
    public Opaque id = Opaque.EMPTY;
    public long version = -1;
    public boolean persisted = false;
    public boolean dirty = true;

    public ZonedDateTime created;
    public ZonedDateTime modified;
    public ZonedDateTime snapshot;

    @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
    public Optional<T> category = Optional.empty();
    public String customCategory = "";

    public String description = "";
    public String notes = "";

    @Override
    public String toString() {
        return "Descriptor{" +
            "pk=" + pk +
            ", id=" + id +
            ", version=" + version +
            ", persisted=" + persisted +
            ", dirty=" + dirty +
            ", created=" + created +
            ", modified=" + modified +
            ", snapshot=" + snapshot +
            ", category=" + category +
            ", customCategory='" + customCategory + '\'' +
            ", description='" + description + '\'' +
            ", notes='" + notes + '\'' +
            '}';
    }
}
