package com.reorz.client.fallback

import com.reorz.client.GreetingClient
import org.springframework.stereotype.Component

/**
 * Created by Acris on 2017/6/9.
 */
@Component
class GreetingClientFallback : GreetingClient {
    override fun greeting(name: String): String {
        return "Service is Offline. Request parameter name = $name"
    }
}