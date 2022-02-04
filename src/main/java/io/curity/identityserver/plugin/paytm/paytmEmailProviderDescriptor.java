package io.curity.identityserver.plugin.paytm;

import se.curity.identityserver.sdk.email.Emailer;
import se.curity.identityserver.sdk.plugin.descriptor.EmailProviderPluginDescriptor;

public final class paytmEmailProviderDescriptor implements EmailProviderPluginDescriptor<paytmEmailProviderConfig>
{
    @Override
    public Class<? extends Emailer> getEmailSenderType()
    {
        return paytmEmailSender.class;
    }

    @Override
    public String getPluginImplementationType()
    {
        return "paytm";
    }

    @Override
    public Class<? extends paytmEmailProviderConfig> getConfigurationType()
    {
        return paytmEmailProviderConfig.class;
    }    
}
