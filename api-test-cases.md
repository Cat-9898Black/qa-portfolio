TC-01: GET https://jsonplaceholder.typicode.com/posts → ожидаем 200 + массив JSON
TC-02: POST на тот же URL с телом {"title":"Дэн","body":"Тест","userId":8} → ожидаем 201 + поле id
{
  "title": "Дэн",
  "body": "Тест",
  "userId": 8
}
TC-03: GET https://jsonplaceholder.typicode.com/posts/999 → ожидаем 404
