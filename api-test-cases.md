TC-01: GET https://jsonplaceholder.typicode.com/posts → ожидаем 200 + массив JSON
TC-02: POST на тот же URL с телом {"title":"Дэн","body":"Тест","userId":8} → ожидаем 201 + поле id
{
  "title": "Дэн",
  "body": "Тест",
  "userId": 8
}
TC-03: GET https://jsonplaceholder.typicode.com/posts/999 → ожидаем 404


### Баг-репорт (учебный)

**Summary:** POST /posts возвращает 500 вместо 201 при корректном JSON

**Severity:** Major  
**Priority:** High

**Environment:**  
- API: jsonplaceholder.typicode.com  
- Tool: ReqBin / браузер  
- OS: Android

**Steps to Reproduce:**
1. Открыть ReqBin или вставить URL в адресную строку.
2. Выполнить POST-запрос на `https://jsonplaceholder.typicode.com/posts`.
3. В теле запроса отправить JSON (см. выше).
4. Нажать Send.

**Actual Result:** Сервер возвращает 500 Internal Server Error, тело пустое.

**Expected Result:** Сервер должен вернуть 201 Created и JSON с полями `id`, `title`, `body`, `userId`.

**Attachments:** отсутствуют.