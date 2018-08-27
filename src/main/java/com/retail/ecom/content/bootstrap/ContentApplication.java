package com.retail.ecom.content.bootstrap;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.util.Set;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.Query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages={"com.retail"})
public class ContentApplication {
	
	public static  String hostName;
	public static  String port;
	public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
        
        try {
			hostName = InetAddress.getLocalHost().getHostName();
			
			MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();

	        Set<ObjectName> objectNames = beanServer.queryNames(new ObjectName("*:type=Connector,*"),
	                Query.match(Query.attr("protocol"), Query.value("HTTP/1.1")));
	        port = objectNames.iterator().next().getKeyProperty("port");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
