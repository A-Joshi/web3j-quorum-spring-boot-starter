package org.web3j.quorum.spring.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static org.web3j.quorum.spring.autoconfigure.Web3jQuorumProperties.WEB3J_QUORUM_PREFIX;

/**
 * web3j property container.
 */
@ConfigurationProperties(prefix = WEB3J_QUORUM_PREFIX)
public class Web3jQuorumProperties {

    public static final String WEB3J_QUORUM_PREFIX = "web3j.quorum";

    private String clientAddress;

    private Boolean adminClient;

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public Boolean isAdminClient() {
        return adminClient;
    }

    public void setAdminClient(Boolean adminClient) {
        this.adminClient = adminClient;
    }
}
