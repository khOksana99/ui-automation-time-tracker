package com.timetracker.auto.util;

import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;

public class Utils {
    @Getter private static final PropsConfig PROPS = ConfigFactory.create(PropsConfig.class);
}
