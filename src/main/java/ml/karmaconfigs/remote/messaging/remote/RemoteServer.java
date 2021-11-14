package ml.karmaconfigs.remote.messaging.remote;

/*
 * GNU LESSER GENERAL PUBLIC LICENSE
 * Version 2.1, February 1999
 * <p>
 * Copyright (C) 1991, 1999 Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed.
 * <p>
 * [This is the first released version of the Lesser GPL.  It also counts
 * as the successor of the GNU Library Public License, version 2, hence
 * the version number 2.1.]
 */

import java.net.InetAddress;

/**
 * Remote server information
 */
public abstract class RemoteServer {

    /**
     * Get the server address
     *
     * @return the server address
     */
    public abstract InetAddress getHost();

    /**
     * Get the server MAC address
     *
     * @return the server MAC address
     */
    public abstract String getMAC();

    /**
     * Get the server port
     *
     * @return the server port
     */
    public abstract int getPort();

    /**
     * Send a message to the server
     *
     * @param message the message to send
     * @return if the message could be sent
     */
    public abstract boolean sendMessage(final byte[] message);
}
