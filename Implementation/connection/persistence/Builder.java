package connection.persistence;

import com.mongodb.*;

/**
 * Utility for creating DBObject updating queries.
 */
public class Builder {

    /**
     * DBObject query.
     */
    private final DBObject query;

    /**
     * Initialize updating builder.
     */
    public Builder() {
        query = new BasicDBObject();
    }

    /**
     * Sets not null value to field. All datatypes are
     * supported.
     *
     * @param key    field name
     * @param object value to set
     * @return current Builder with an appended operand
     */
    public Builder set(final String key,
                             final Object object) {
        addToQuery(Operators.SET, key, object);

        return this;
    }

    /**
     * Increments field by the number value if field
     * is present in the object, otherwise sets field
     * to the number value.
     *
     * @param key   field name
     * @param value number value
     * @return current Builder with an appended operand
     */
    public Builder inc(final String key,
                             final int value) {
        addToQuery(Operators.INC, key, value);

        return this;
    }

    /**
     * Deletes a given field.
     *
     * @param key field name
     * @return current Builder with an appended operand
     */
    public Builder unset(final String key) {
        addToQuery(Operators.UNSET, key, 1);

        return this;
    }

    /**
     * Returns true if current Builder is empty.
     *
     * @return true if current Builder is empty.
     */
    public boolean isEmpty() {
        return query.keySet().isEmpty();
    }

    /**
     * Creates a DBObject query to be used for the driver's
     * update operations.
     *
     * @return DBObject query instance
     */
    public DBObject get() {
        return query;
    }

    /**
     * Adds key-value to query.
     *
     * @param operator update operator
     * @param key      param to update
     * @param object   value to set
     */
    private void addToQuery(final String operator,
                            final String key,
                            final Object object) {
        final BasicDBObject subQuery =
                query.get(operator) != null ?
                        (BasicDBObject) query.get(operator) :
                        new BasicDBObject();

        query.put(operator, subQuery.append(key, object));
    }
}
