package cn.nukkit.swm.api.exceptions;

/**
 * Exception thrown when a
 * world could not be found.
 */
public class UnknownWorldException extends SlimeException {

    public UnknownWorldException(final String world) {
        super("Unknown world " + world);
    }

}