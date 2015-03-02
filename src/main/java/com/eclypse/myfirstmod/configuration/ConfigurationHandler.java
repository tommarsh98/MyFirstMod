package com.eclypse.myfirstmod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void Init(File configFile)
    {
        //Create the configuration object form the given configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            //Load the configuration file
            configuration.load();

            //Read the properties form the configuration files
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example").getBoolean(true);
        }
        catch(Exception e)
        {
            //Log the exception
        }
        finally
        {
            //Save the configuration file
            configuration.save();
        }

        System.out.println(configValue);

    }
}
