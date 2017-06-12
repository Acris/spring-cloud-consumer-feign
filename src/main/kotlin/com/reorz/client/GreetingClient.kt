package com.reorz.client

import com.reorz.client.fallback.GreetingClientFallback
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

/**
 * Created by Acris on 2017/6/9.
 */
@FeignClient(value = "spring-cloud-provider", fallback = GreetingClientFallback::class)
interface GreetingClient {
    @GetMapping("/greeting")
    fun greeting(@RequestParam("name", defaultValue = "World") name: String): String
}