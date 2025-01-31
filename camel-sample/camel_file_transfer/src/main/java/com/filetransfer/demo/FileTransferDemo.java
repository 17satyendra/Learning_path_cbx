package com.filetransfer.demo;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class FileTransferDemo 
{
    public static void main( String[] args )
    {
    	SimpleRouteBuilder simpleRoute = new SimpleRouteBuilder();
    	IntegrationRoute integrationRoute = new IntegrationRoute();
    	CamelContext ctx = new DefaultCamelContext();
    	try {
			ctx.addRoutes(simpleRoute);
			ctx.addRoutes(integrationRoute);
			ctx.start();
			Thread.sleep(30 * 1000);
			ctx.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
