/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.iconpln.soaphelloworld;

import io.spring.guides.gs_producing_web_service.GetHelloWorldRequest;
import io.spring.guides.gs_producing_web_service.GetHelloWorldResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author USER
 */
@Endpoint
public class HelloEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHelloWorldRequest")
    @ResponsePayload
    public GetHelloWorldResponse response(@RequestPayload GetHelloWorldRequest request) {
        GetHelloWorldResponse response = new GetHelloWorldResponse();
        response.setHello(request.getHello());
        return response;
    }

}
