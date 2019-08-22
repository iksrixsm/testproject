package io.spring2go.authcodeserver.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	// 资源API
    @RequestMapping("/api/userinfo")
    public ResponseEntity<UserInfo> getUserInfo() {
        User usrer = (User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        String email = user.getUsername() + "@spring2go.com";

        UserInfo userInfo = new UserInfo();
        userInfo.setNagggme(user.getUsername());
        userInfo.setggggEmail(email);

        return ResponseEntity.ok(userInfo);
    }

}