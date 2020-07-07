package com.naosim.herokuroot.api

import java.util.HashMap
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloApi {

    @RequestMapping(value = ["/hello"], method = [RequestMethod.GET])
    operator fun invoke(): Map<*, *> {
        val res = HashMap<String, Any>()
        res["hello"] = "hello2020"
        return res
    }


}