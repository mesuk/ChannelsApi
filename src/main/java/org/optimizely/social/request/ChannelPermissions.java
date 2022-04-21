package org.optimizely.social.request;

import java.util.List;

public class ChannelPermissions {
    private List<String> permissions;

    public ChannelPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
