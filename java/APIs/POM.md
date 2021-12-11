# POM (Project Object Model)

* Базовый модуль [[Maven]]
* Находится в базовой директории
    * мб несколько но все должны замыкаться в базовом POM
* Содержит

---

### Конфигурации:

* Информация о проекте (для его идентификации)
    * Группа (groupId)
    * Имя (artefactId)
    * Версия (version)
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
* xmlns - атрибут для объявления пространства имен


