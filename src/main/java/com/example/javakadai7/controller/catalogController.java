package com.example.javakadai7.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class catalogController {

    //GETリクエストを受け取るメソッドを作成
    @GetMapping("/get")
    public String getCatalog() {
        return "get!";
    }

    //POSTリクエストを受け取るメソッドを作成
    @PostMapping("/post")
    public String postCatalog() {
        return "post!";
    }

    //PATCHリクエストを受け取るメソッドを作成
    @PatchMapping("/patch")
    public String patchCatalog() {
        return "patch!";
    }

    //DELETEリクエストを受け取るメソッドを作成
    @DeleteMapping("/delete")
    public String deleteCatalog() {
        return "delete!";
    }

}
