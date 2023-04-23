## Кутявин Данил, группа [РИ-210945], преподаватель -- [Калугин Евгений]
### Домашнее задание по теме Web Service:

#### Реализовать два контроллера. Один контроллер должен в качестве ответа на GET запрос отдавать список входящих заголовков. Второй контроллер должен принимать на вход JSON вида:
```
{
"price": 125.0,
"info": {
"date": "2022-01-01"
}
}
```
#### и отдавать его обратно при этом добавить в ответ свойство id:
```
{
"price": 125.0,
"info": {
"id": 123,
"date": "2022-01-01"
}
}
```
#### Написать обработчик ошибок, который будет возвращать кастомную 502 ошибку.