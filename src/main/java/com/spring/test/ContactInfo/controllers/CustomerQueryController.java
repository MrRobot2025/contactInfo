package com.spring.test.ContactInfo.controllers;
import com.spring.test.ContactInfo.entity.CustomerQuery;
import com.spring.test.ContactInfo.service.CustQueryService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class CustomerQueryController {

    private final CustQueryService custQueryService;

    @Autowired
    public CustomerQueryController(CustQueryService custQueryService){
        this.custQueryService = custQueryService;
    }

    @GetMapping(path = "/getAllQueries",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CustomerQuery>> getAllQueries(HttpServletResponse response){
        return ResponseEntity.ok(custQueryService.getAllQueries());
    }

    @PostMapping(path = "/createQuery")
    public ResponseEntity<CustomerQuery> createQuery(@RequestBody CustomerQuery customerQuery){
        custQueryService.save(customerQuery);
        return ResponseEntity.ok(customerQuery);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id){
        custQueryService.deleteQuery(id);
        return ResponseEntity.ok("Query Deleted");
    }

    @PutMapping(path = "/status/{id}")
    public ResponseEntity<CustomerQuery> updateStatus(@PathVariable String id,@RequestBody CustomerQuery status){
        custQueryService.updateStatus(id,status);
        CustomerQuery query = custQueryService.findbyId(id);
        return ResponseEntity.ok(query);
    }
}
