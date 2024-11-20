package com.oauth;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class UserController {

    @GetMapping("/user-info")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principle){
        return principle.getAttributes();
    }

}
