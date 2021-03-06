# 3. IP адреса, структуры и повреждение данных

IP - адресс уровень интернета

---

## 3.1. IP адреса, версии 4 и 6

* IPv4
    - 192.0.02.111
    - 127.0.0.1 - loopback (“эта машина, на которой я сейчас работаю”)
* IPv4
    - 2001:0db8:c9d2:aee5:73e3:934a:a5ae:9551
        - можно сократить ноли
            - 2001:0db8:ab00:0000:0000:0000:0000:0000 2001:db8:ab00::
    - ::1 - loopback
    - совместимость с IPv4
        - 192.0.2.33 -> ::ffff:192.0.2.33”

### 3.1.1.Подсети

- иногда удобно объявить, что "эта первая часть IP адреса вплоть до этого последнего **бита**"
    - 192.0.2.12
        - 192.0.2.0 - подсеть
        - 12 - хост
- Раньше существовали Классы по длине подсети
    - A - 1й байт
    - B - 1й и 2й байты
    - C - 1й, 2й и 3й байты

* Сетевая порция
    * определяется **маской подсети**
    * логическим & с IP адресом выделяете номер сети.
        * IP `192.0.2.12`
        * подсеть `192.0.2.12 & 255.255.255.0 = 192.0.2.0`

**A и B** - исчерпаны, поэтому

* маска может быть не только только 8, 16 или 24 бита
    * 255.255.255.252 (252 = [1111 1100])
        * позволяет иметь до 4 хостов в сети
            * 0, 1, 2, 3
* Более компактный стиль написания
    * 192.0.2.12/30 (30 - бит номера сети.)
        * 192.0.2.12 - подсеть
        * 0 - хост
    * или 2001:db8:5413:4028::9db9/64

### 3.1.2. Номера портов

Номер порта - адрес уровня транспорта хост-хост (TCP, UDP)

* 16-ти разрядное число, что-то вроде местного адреса для соединений.
* `Думайте об IP как об адресе отеля, а о номере порта, как номере комнаты`

---


