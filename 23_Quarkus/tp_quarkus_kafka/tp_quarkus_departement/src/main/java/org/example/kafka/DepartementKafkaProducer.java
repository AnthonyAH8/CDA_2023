package org.example.kafka;

import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

public class DepartementKafkaProducer {

    @Inject
    @Channel("department-requests")
    Emitter<String> departmentEmitter;


    public void sendDepartment(Long id, Long departmentid, String name, String organisation){

        String message = "{\"departmentID\": \"" + departmentid + "\", \"Nom\": \"" + name + "\", \"Organisation\": " + organisation + "}";

        departmentEmitter.send(message);
    }

}
