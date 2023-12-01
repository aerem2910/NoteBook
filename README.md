# NoteBook
NotebookShop:

addNotebook(Notebook notebook): Добавляет ноутбук в магазин.
filterNotebooks(Map<String, Object> criteria, Map<String, Object> minValues): Фильтрует ноутбуки по заданным критериям и их минимальным значениям.
MainApp:

main(String[] args): Основной метод программы. Создает магазин ноутбуков, добавляет несколько ноутбуков, запрашивает критерии фильтрации у пользователя, фильтрует ноутбуки и выводит результат.
InputOutput:

inputCriteria(): Запрашивает у пользователя критерии фильтрации и возвращает их в виде Map.
inputMinValues(Map<String, Object> criteria): Запрашивает у пользователя минимальные значения для критериев и возвращает их в виде Map.
outputResult(Set<Notebook> result): Выводит результат фильтрации на экран.
Notebook:

Notebook(String model, int ramGb, String storage, String os, int screenSize, String processor, String manufacturer): Конструктор для создания объекта ноутбука с заданными характеристиками.
Геттеры для получения характеристик ноутбука.
Программа создает магазин ноутбуков, добавляет несколько ноутбуков в магазин, запрашивает у пользователя критерии фильтрации, запрашивает минимальные значения для критериев, фильтрует ноутбуки и выводит результат.
