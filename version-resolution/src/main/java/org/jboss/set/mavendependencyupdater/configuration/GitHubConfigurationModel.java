package org.jboss.set.mavendependencyupdater.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration model related to GitHub repository access.
 */
public class GitHubConfigurationModel {

    @JsonProperty
    private String originRepository;

    @JsonProperty
    private String upstreamRepository;

    @JsonProperty(defaultValue = "master")
    private String upstreamBaseBranch;

    @JsonProperty
    private String login;

    @JsonProperty
    private String accessToken;

    public String getOriginRepository() {
        return originRepository;
    }

    public String getUpstreamRepository() {
        return upstreamRepository;
    }

    public String getUpstreamBaseBranch() {
        return upstreamBaseBranch;
    }

    public String getLogin() {
        return login;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
