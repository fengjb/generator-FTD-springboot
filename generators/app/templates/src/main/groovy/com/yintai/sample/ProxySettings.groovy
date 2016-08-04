package <%=packageName%>.sample

import groovy.transform.CompileStatic
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@CompileStatic
@Component
@ConfigurationProperties(prefix = "FTD.proxy")
class ProxySettings {
    ProxyUrl url;
}
