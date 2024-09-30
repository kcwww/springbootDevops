package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class PingController {

    @PostMapping("/ping")
    public Response ping() {
        return new Response("pong");
    }

    @GetMapping("/ping")
    public Response pingGet() {
        return new Response("pong");
    }
    

    // 응답을 위한 내부 클래스
    static class Response {
        private String response;

        public Response(String response) {
            this.response = response;
        }

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }
    }
}
