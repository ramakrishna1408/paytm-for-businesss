package io.curity.identityserver.plugin.paytm;

import se.curity.identityserver.sdk.config.Configuration;
import se.curity.identityserver.sdk.config.annotation.Description;

public interface paytmEmailProviderConfig extends Configuration
{
    @Description("A parameter used for demo purposes")
    Integer getDemoParameter();
}
