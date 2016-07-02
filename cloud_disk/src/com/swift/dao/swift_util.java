package com.swift.dao;
import org.jclouds.ContextBuilder;
import org.jclouds.openstack.swift.v1.SwiftApi;
import org.jclouds.openstack.swift.v1.domain.Container;
import org.jclouds.openstack.swift.v1.features.ContainerApi;

import com.google.common.collect.FluentIterable;
import com.google.common.io.Closeables;

import java.io.IOException;
import java.util.Set;
public class swift_util   {
	private SwiftApi swift;
	private String endpointstring = "http://192.168.174.137:5000/v2.0/"; 
	private String provider = "openstack-swift"; 
	private String identity = "admin:admin"; //租户名和用户名 
	private String credential = "test"; // 用户密码 
	public   swift_util() {

	swift = ContextBuilder.newBuilder(provider)
	            .endpoint(endpointstring)
	            .credentials(identity, credential)
	            .buildApi(SwiftApi.class);
	

}

	   private void listContainers() {
	      System.out.println("List Containers");
	      Set<String> regions = swift.getConfiguredRegions();
	      ContainerApi containerApi = swift.getContainerApi(regions.iterator().next());
	      FluentIterable<Container> containers = containerApi.list();
	     StringBuilder cons = new StringBuilder();

	      for (Container container : containers) {
	         cons.append(container).append("\n");
	      }
	   System.out.println("容器:"+"\n"+cons.toString());
	  
	   }
	 public static void main(String[] args)  {
		 
		 
		 swift_util  s =new swift_util();
		 s.listContainers();
	 }
	 
	  public void close() throws IOException {
	      Closeables.close(swift, true);
	   }
}