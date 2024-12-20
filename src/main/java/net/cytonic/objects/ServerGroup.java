package net.cytonic.objects;

import com.google.gson.Gson;


/**
 * A record representing a server group
 *
 * @param id the id of the server group
 * @param mapName the map name of the server group
 * @param canFallback whether you can fall back to this server group
 */
public record ServerGroup(String id, String mapName, boolean canFallback) {

    /**
     * Deserializes the given json into a {@link ServerGroup}
     *
     * @param json The raw json string
     * @return the deserialized {@link ServerGroup}
     **/
    public static ServerGroup deserialize(String json) {
        return new Gson().fromJson(json, ServerGroup.class);
    }

    /**
     * Serializes the server group into a json string
     *
     * @return the serialized string
     */
    public String serialize() {
        return new Gson().toJson(this);
    }

    /**
     * Serializes the server group into a json string
     *
     * @return the serialized string
     */
    @Override
    public String toString() {
        return serialize();
    }

}
