package com.TemplateLight.directory.history.history_person;

import com.TemplateLight.general.directory.CrudApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history/person")
public class HistoryPersonController extends CrudApi<HistoryPerson> {

    @Autowired
    public HistoryPersonController(HistoryPersonDao crud) {
        super(crud);
    }
}
