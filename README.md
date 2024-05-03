## Техническое задание  

В данной задаче предлагается проанализировать массив данных с информаций о людях с использованием стримов из библиотеки `Stream API`.  

Для работы необходимо подготовить несколько классов, а именно:  
- `Sex`, содержащий типы полов
- `Education`, содержащий типы образования
- `Person`, содержащий информацию об имени, возрасте, поле и образовании человека

Из коллеции объектов `Person` необходимо:  
1. Найти количество несовершеннолетних (т.е. людей младше 18 лет).
2. Получить список фамилий призывников (т.е. мужчин от 18 и до 27 лет).
3. Получить отсортированный по фамилии список потенциально работоспособных людей с высшим образованием в выборке (т.е. людей с высшим образованием от 18 до 60 лет для женщин и до 65 лет для мужчин).

В классе `Main` в функции `main()` необходимо создать коллекцию экземпляров класса `Person`. Вам потребуется действительно большое количство данных. Для примера будем считать, что Вы производите перепись населения города Лондон с населением в 10 миллионов человек. Генерировать исходные данные предлагаем в цикле.



