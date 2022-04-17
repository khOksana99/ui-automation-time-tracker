package com.timetracker.auto.util;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface PropsConfig extends Config {
    @Config.Key("ui_base_url") String UI_BASE_URL();
}
