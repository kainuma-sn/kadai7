# 第7回課題
## １．HTTPリクエスト（GET,POST,PATCH,DELETE）の実装<br>
- 下記のとおり、SpringbootPostmanを起動し、HTTPリクエストを行っています。<br>
```mermaid
sequenceDiagram
    participant postman as Postman
    participant controller as Controlle

    postman ->> controller: リクエスト(GET,POST,PATCH,DELETE)
    controller ->> postman: 結果を出力する

```
> ![Animation](https://github.com/kainuma-sn/kadai7/assets/145829664/812e6233-93a7-4047-95d7-53a00a1c0bed)<br>
## [プルリクエスト][https://github.com/kainuma-sn/kadai7/pull/2#issue-1959403435](https://github.com/kainuma-sn/kadai7/pull/2)<br>
<br><br>
## ２．オリジナルの実装<br>
- バリデーションの実装
- クエリ文字列の受け取り
- その他
