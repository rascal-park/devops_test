package tech.worldwild.application.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("list")
public class ListController {

    @GetMapping
    public List<Integer> getList() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }

}