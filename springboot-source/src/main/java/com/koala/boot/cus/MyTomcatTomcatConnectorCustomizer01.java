package com.koala.boot.cus;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.stereotype.Component;

/**
 * day02
 * Create by koala on 2021-08-01
 */
@Component
public class MyTomcatTomcatConnectorCustomizer01 implements TomcatConnectorCustomizer {

    @Override
    public void customize(Connector connector) {
        //connector.setPort();
        //我们定义关键组件
        System.out.println();
    }

}
