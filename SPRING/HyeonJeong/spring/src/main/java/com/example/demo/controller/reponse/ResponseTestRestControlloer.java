package com.example.demo.controller.reponse;

import com.example.demo.entity.TestMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class ResponseTestRestControlloer {
    private static final Logger log =
            LoggerFactory.getLogger(ResponseTestRestControlloer.class);

    @GetMapping("/responseRestTestRestMember")
    public TestMember getRestTestMember() {
        log.info("getRestTestMember()");

        TestMember tm = new TestMember();

        return tm;
    }

    @GetMapping("/responseTestMemberMap")
    public Map<String, TestMember> getTestMemberMap() {
        log.info("getTestMemberMap()");

        Map<String, TestMember> map =
                new HashMap<String, TestMember>();

        TestMember tm1 = new TestMember();
        map.put("key1", tm1);

        TestMember tm2 = new TestMember();
        map.put("key2", tm2);

        return map;
    }
}
