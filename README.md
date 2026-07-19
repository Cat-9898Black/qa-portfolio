README.md
# мои тест-кейсы

## калькулятор 
Шаги: 2+2=
Ожидаемый результат: 4

## Telegram
Шаги: Открыть избранное ->
Написать "Тест" -> Отправить
Ожидаемый результат: Сообщение отправлено

## Поиск в Google 
Шаги: 1. Открыть google.com.
      2. Ввести в строку поиска "QA". 
      3. Нажать "Поиск".
Ожидаемый результат: Открылась страница с результатами поиска.

# Вход с верным паролем: 
tomsmith/SuperSecretPassword! (Ожидаемо: Успешный вход)
# Вход с неверным паролем:
tomsmith/12345 (Ожидаемо: Ошибка)

# Bug report [краткое описание бага] 
**Severity:** Low 
**Priority:** Mediom 

**Steps to Reproduce:**
1.
2.
3.

**Actual Result:**

**Expected Result:**

**Environment:**
*Browser: Chrome*
*OS: Windows

## Тест-кейсы: Калькулятор

| ID | Название | Шаги | Ожидаемый результат |
|----|----------|------|----------------------|
| TC-JS-01 | Все поля заполнены | Создать объект `{name: "Дэн", age: 27, email: "dan@test.com"}`. Проверить, что ошибок нет. | Ошибок нет |
| TC-JS-02 | Поле `age` не число | Создать объект `{name: "Дэн", age: "двадцать", email: "dan@test.com"}`. Проверить валидацию. | Ошибка "age must be a number" |
| TC-JS-03 | Пустой `email` | Создать объект `{name: "Дэн", age: 27, email: ""}`. Проверить валидацию. | Ошибка "email is required" |


## code: Simula ##
Begin
  Class Rectangle (Width, Height); Real Width, Height;

   Begin
      Real Area, Perimeter;

      Procedure Update;
      Begin
        Area := Width * Height;
              OutText("Rectangle is updating, Area = "); OutFix(Area,2,8); OutImage;
        Perimeter := 2*(Width + Height);
              OutText("Rectangle is updating, Perimeter = "); OutFix(Perimeter,2,8); OutImage;
      End of Update;

      Update;
      OutText("Rectangle created: "); OutFix(Width,2,6);
      OutFix(Height,2,6); OutImage;
   End of Rectangle;

       Rectangle Class ColouredRectangle (Color); Text Color;

  Begin
      OutText("ColouredRectangle created, color = "); OutText(Color);
      OutImage;
        End of ColouredRectangle;


         Ref(Rectangle) Cr;
   Cr :- New ColouredRectangle(10, 20, "Green");
End;

## TC01: Поиск в Google
- Шаги: Открыть google.com, ввести "Manual QA", нажать Enter
- Ожидаемый результат: Появились результаты поиска

