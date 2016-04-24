package com.thoughtworks.microservice.demo.services;

import com.thoughtworks.microservice.demo.models.Staff;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.springframework.stereotype.Service;
import rx.Observable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Service
public class AdvancedUserService {
    private final static String JIGSAW_ENDPOINT = "http://localhost:9999/staffs/";

    private Observable<Staff> fetchUserByName(String name) {
        String url = JIGSAW_ENDPOINT + name;

        Client client = ClientBuilder.newClient(new ClientConfig());
        client.property(ClientProperties.CONNECT_TIMEOUT, 10);
        client.property(ClientProperties.READ_TIMEOUT,    10);

        Invocation.Builder request = client.target(url).request(MediaType.APPLICATION_JSON);

        Observable<Staff> staff;

        try {
            staff = Observable.just(request.get(Staff.class));
        } catch (Exception ex) {
            staff = Observable.just(null);
        }

        return staff;
    }

    public Observable<List<Staff>> fetchAllUsers(String[] ids) {
        return Observable.from(ids)
                .flatMap(this::fetchUserByName)
                .toList();
    }
}
