package com.mapsqn.assignment.utils;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import org.json.JSONObject;


public class GenericWebServiceCall {

	public Response doPostCall(String URI, JSONObject reqObj, String accessToken) {
		WebServiceClient restClient = new WebServiceClient();
		ResteasyClient client = restClient.getResteasyClient();
		ResteasyWebTarget target = client.target(URI);
		Response response = target.request().accept("application/json")
				.header("Authorization", accessToken)
				.post(Entity.entity(reqObj.toString(), "application/json"));
		client.close();
		return response;
	}

	public Response doGetCall(String URI, String accessToken) {
		WebServiceClient restClient = new WebServiceClient();
		ResteasyClient client = restClient.getResteasyClient();
		ResteasyWebTarget target = client.target(URI);
		Response response = target.request().accept("application/json")
				.header("Authorization", accessToken).get();
		client.close();
		return response;
	}

	public Response doPutCall(String URI, JSONObject reqObj, String accessToken) {
		WebServiceClient restClient = new WebServiceClient();
		ResteasyClient client = restClient.getResteasyClient();
		ResteasyWebTarget target = client.target(URI);
		Response response = target.request().accept("application/json")
				.header("Authorization", accessToken)
				.put(Entity.entity(reqObj.toString(), "application/json"));
		client.close();
		return response;
	}

	public Response doDeleteCall(String URI, String accessToken) {
		WebServiceClient restClient = new WebServiceClient();
		ResteasyClient client = restClient.getResteasyClient();
		ResteasyWebTarget target = client.target(URI);
		Response response = target.request().accept("application/json")
				.header("Authorization", accessToken).delete();
		client.close();
		return response;
	}

	public Response doPostCallFORMData(String URI, String userAuthToken,
			MultipartFormDataOutput reqObj) {
		WebServiceClient restClient = new WebServiceClient();
		ResteasyClient client = restClient.getResteasyClient();
		ResteasyWebTarget target = client.target(URI);
		GenericEntity<MultipartFormDataOutput> entityBody = new GenericEntity<MultipartFormDataOutput>(
				reqObj) {
		};
		Response response = target
				.request()
				.header("Authorization", userAuthToken)
				.post(Entity.entity(entityBody,
						MediaType.MULTIPART_FORM_DATA_TYPE));
		return response;
	}

}
