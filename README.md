# SLM Warungsmonitor_GruppeH

Rene Ramsauer (ic18b066@technikum-wien.at)

Daniel Moll (ic21b044@technikum-wien.at)

---

### 1. About STMicroelectronics NUCLEO-L432KC

In diesem Projekt wurde eine RestAPI-Schnittstelle mit Hilfe von Software-Lifecycle-Managment Tools entwickelt.

### 2. Ablauf

Die Schnittstelle kann in jedem Browser via http://localhost:8080/wartung aufgerufen werden, nachdem das Projekt gestartet wurde.

Initial wird die Webseite mit roten Hintergrund angezeigt (bedeutet der Wert der Message ist nicht korrekt):
![image](https://user-images.githubusercontent.com/115585009/205461376-addb7384-f0a2-41c5-bba8-dd5fff9a746a.png)

Wenn man eine Nachricht setzen möchte gelingt dies mit folgendem Link: http://localhost:8080/text/{Message} ({Message} = die gewünschte Message)

Nach erfolgreicher Eingabe bekommt man den eingegeben Wert auf der Seite zurück:
![image](https://user-images.githubusercontent.com/115585009/205461481-5a657262-a4ca-4c68-a08b-ed54a72f791d.png)

Die Nachricht wird dann auf dem dem Wartungsmonitor ausgegeben:

![image](https://user-images.githubusercontent.com/115585009/205461523-cc2642d7-dad8-4cbd-989a-8331a1080165.png)

Wenn der Monitor über seine Schnittstelle den Wert "ok" erhält, ändert sich die Farbe des Hintergrunds auf Grün.
![image](https://user-images.githubusercontent.com/115585009/205461575-e4ac85cb-646d-4da3-883f-2d60ab8cd3fb.png)



<!-- CONTACT -->
## 3. Contact

* Rene Ramsauer [ic18b066@technikum-wien.at](mailto:ic18b066@technikum-wien.at)

* Daniel Moll [ic21b044@technikum-wien.at](mailto:ic21b0446@technikum-wien.at)
