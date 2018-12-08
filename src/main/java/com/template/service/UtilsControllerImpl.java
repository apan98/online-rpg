package com.template.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class UtilsControllerImpl implements UtilsController {

    @Override
    public Boolean isPage(Map map) {
        try{
            if(Long.valueOf(map.get("page").toString()) >= 1L && Long.valueOf(map.get("size").toString()) >= 1L){
                return true;
            }
            else {
                map.remove("page");
                map.remove("size");
                return false;
            }
        } catch (Exception e){
            map.remove("page");
            map.remove("size");
            return false;
        }
    }
}
