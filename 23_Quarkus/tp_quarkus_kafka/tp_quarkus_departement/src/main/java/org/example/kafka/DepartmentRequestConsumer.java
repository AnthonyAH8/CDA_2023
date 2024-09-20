package org.example.kafka;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.example.service.DepartmentService;

@ApplicationScoped
public class DepartmentRequestConsumer {
    @Inject
    DepartmentService departmentService;

    @Incoming("department-request")
    @Transactional
    public void consumeDepartmentOrder(String message){
        
    }
}
