package org.cbs.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.dubbo.config.annotation.DubboReference;
import org.cbs.demo.common.UserService;

@Path("/hello")
public class GreetingResource {
    @DubboReference(check = false)
    UserService userService;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "RPC:"+userService.hello("王麻子");
    }
}