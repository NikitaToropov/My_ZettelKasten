# POM (Project Object Model)

* Базовый модуль [[Maven]]
* Находится в базовой директории
    * мб несколько но все должны замыкаться в базовом POM
* Содержит

---

![POM structure](POM_structure.png)

---

### Super POM

* Все POM неявно наследуются от super-POM
* в нем есть ```</repositories>``` и ```</pluginRepositories>``` где указаны дефолтне репозитории для зависимостей и
  плагинов
* в блоке ```<build>``` определены дефолтные значения некоторых
  тегов ```directory, outputDirectory, testOutputDirectory, ...```
* минимальный набор плагинов для запуска maven
    * НО есть еще ```core plugins``` которые не упомянуты в ```super POM```

#### Можно сгененировать effective-pom

В корне проекта ```mvn help:effective-pom```

```Результирующий POM``` = ```Super POM``` + ```project root POM``` + ```default plugins```

---

### Конфигурации:

* Обязательная информация о проекте (для его идентификации)
    * groupId - зачастую здесь упоминается организация или проект в рамках делается проект.а
    * artefactId - идентификатор самого проекта, его имя.
    * version - определяет версию продукта.
        * Правила версионирования - 4.5.6-SNAPSHOT
            * 4 - **МАЖОРНАЯ** версия. Добавлены изменения несовместимые с прошлой версией.
            * 5 - **МИНОРНАЯ** версия. Добавлена новая функциональность но она не нарушает обратной совместимости.
            * 6 - **ПАТЧ** версия. Обратно соместимые исправления.
                * -SNAPSHOT - qualifier/определитель того является ли версия релизной.1
* Зависимости проекта
* Плагины
* Задачи
* Профили
* Разработчики
* Список рассылок

---

```
<project xmlns="http://maven.apache.org/POM/4.0.0"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
   http://maven.apache.org/xsd/maven-4.0.0.xsd">
   <modelVersion>4.0.0</modelVersion>

   <groupId>com.companyname.project-group</groupId>
   <artifactId>project</artifactId>
   <version>1.0</version>
 
</project>
```

Атрибуты:

* xmlns - атрибут [xml](TODO) для объявления пространства имен.
    * часть пространства имен [W3C](TODO)
    * ```http://maven.apache.org/POM/4.0.0``` является пространством имен по умолчанию для элементов в этом проекте
      Maven.
* xmlns:xsi - объявляет стандартный префикс пространства имен ( xsi ) для основного пространства имен
* xsi:schemaLocation - атрибут содержит пары значений URI и ссылка на распололжение схемы пространства имен.
    * В примере выше означает что ссылка ```http://maven.apache.org/xsd/maven-4.0.0.xsd``` содержит схему xsd с
      определенным пространством имен ```http://maven.apache.org/POM/4.0.0```.
    * Может содержать несколько пар
* Обязательные элементы POM файла:

---

## Теги

### dependencies

находится в рутовом теге ```<project/>```

#### dependency

* groupId
* artifactId
* version
* scope
    * compile(default) - без этой зависимости проект не скомрилируется
    * provided - зависимость будет предоставленна снаружи и в `classpath` ее не будет
    * runtime - потребуется во время выполнения
    * system - указываем зависимость локальную. Путь к .jar в тегк `<systemPath>` на нашем компьютере
    * test - зависимоть потребуется только для тестов в `classpath` ее не будет 
* ...

---

[POM documentation](https://maven.apache.org/pom.html)