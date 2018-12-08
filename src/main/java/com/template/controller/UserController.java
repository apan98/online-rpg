package com.template.controller;


import com.template.crud.UserCrud;
import com.template.domain.constant.RestConstant;
import com.template.domain.model.Users;
import com.template.service.UtilsController;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserCrud userCrud;
    private UtilsController utilsController;
    private final String USERS = "/users";

    @RequestMapping(value = USERS, method = RequestMethod.GET)
    public ResponseEntity<List<Users>> getAll(@RequestBody(required = false) HashMap<String, Object> map){
        HttpHeaders headers = new HttpHeaders();
        if(utilsController.isPage(map)){
            headers.add(RestConstant.TOTAL, userCrud.getCount(map).toString());
        }
        return new ResponseEntity<>(userCrud.getAll(map), headers, HttpStatus.OK);
    }

    @RequestMapping(value = USERS, method = RequestMethod.POST)
    public ResponseEntity<List<Users>> create(@RequestBody HashMap map){
        return new ResponseEntity<>(userCrud.getAll(map),  HttpStatus.OK);
    }

    @RequestMapping(value = USERS, method = RequestMethod.PUT)
    public ResponseEntity<List<Users>> replace(@RequestBody HashMap map){
        return new ResponseEntity<>(userCrud.getAll(map), HttpStatus.OK);
    }
}
