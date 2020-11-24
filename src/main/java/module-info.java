import nu.mine.mosher.genealogy.genopcit.GenOpCit;

module nu.mine.mosher.xml.viewer {
    exports nu.mine.mosher.genealogy.genopcit;
    exports nu.mine.mosher.genealogy.genopcit.util;
    provides ch.qos.logback.classic.spi.Configurator with GenOpCit.LogConfig;
    requires log.files;
    requires org.slf4j;
    requires ch.qos.logback.classic;
    requires ch.qos.logback.core;
    requires org.apache.commons.logging;
    requires log4j;
    requires jul.to.slf4j;
    requires java.logging;
    requires java.xml;
    requires java.desktop;
    requires java.prefs;
}
