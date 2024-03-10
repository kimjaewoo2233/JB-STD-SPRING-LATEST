package jb.joonbee.back.controller;

import jb.joonbee.back.utils.common.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    @GetMapping("/auth/kakao/callback")
    public ResponseEntity<CommonResponse<?>> kakaoAuth(
            @RequestParam(required = true) String code
    ){

        return null;
    }
}
