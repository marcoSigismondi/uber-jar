package com.sigismondi.marco;

import java.io.File;
import java.util.Optional;

import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

/**
 * Hello world!
 *
 */
public class App {
	
	public static final Optional<String> port = Optional.ofNullable(System.getenv("PORT"));
	
	public static void main(String[] args) throws Exception {

		String contextPath = "/";
        String appBase = ".";
        Tomcat tomcat = new Tomcat();     
        tomcat.setPort(Integer.valueOf(port.orElse("8080") ));
        tomcat.getHost().setAppBase(appBase);
        tomcat.addWebapp(contextPath, appBase);
        tomcat.start();
        tomcat.getServer().await();
	}
}
