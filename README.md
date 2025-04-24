In diesen Aufgaben beginnen Sie, automatisch getesteten Code zu schreiben.

Sie können den Code vorab auf Ihrem Computer testen, indem Sie den Befehl:

```gradle aufgabe1Test```

ausführen (bzw. für die anderen Aufgaben die Nummer der Aufgabe in dem Befehl anpassen). Dafür muss auf Ihrem System [gradle](https://gradle.org/) installiert sein. Alternativ können Sie die Tests auch direkt aus Ihrer IDE ausführen, wie in der Übung gezeigt. Es ist wichtig, dass Sie die Aufgaben online über git abgeben (wie in der Übung gezeigt, kurz: Auf der Kommandozeile `git add ./*; git commit -m "Fertig"; git push` bzw. über die IDEA-GUI mit Rechtsklick auf das Projektverzeichnis->git->push). Überprüfen Sie danach bitte unbedingt auf github.com, dass Ihre Ergebnisse auch wirklich online sind!

# Aufgabe 1

Beginnen Sie damit, den Bereich mit dem Kommentar `/* Hier Code einfügen */` in der Datei src/Programmieraufgabe1.java so zu ersetzen, dass die folgende Ausgabe generiert wird:

```
Hello, world!
```

# Aufgabe 2

Nun geben wir zwei Zeilen aus. Ersetzen Sie das `null` in der Datei src/Programmieraufgabe2.java so, dass
die folgende
Ausgabe generiert wird:

```
Hello, world!
What a great day to be alive!
```

# Aufgabe 3

Schreiben Sie in der Datei src/Programmieraufgabe3.java ein Programm, das auf der Kommandozeile exakt die folgenden vier Zeilen in ausgibt:

```text
*******
.......
*******
.......
```

Verwenden Sie für die Lösung mindestens eine Schleife.

# Aufgabe 4

Schreiben Sie in der Datei src/Programmieraufgabe4.java ein Programm, das auf der Kommandozeile exakt die folgenden sieben Zeilen in ausgibt:

```text
*******
******
.....
****
***
**
*
```

Verwenden Sie für die Lösung mindestens eine Schleife.

# Aufgabe 5

Schreiben Sie in der Datei src/Programmieraufgabe5.java ein Programm, das auf der Kommandozeile exakt die folgenden Zeilen ausgibt:

```text
*
**
***
****
*****
****
***
**
*
```

Verwenden Sie Schleifen etc. - geben Sie nicht einfach explizit mit 9 System.out.println die Zeilen aus!

# Aufgabe 6

Schreiben Sie in der Datei src/Programmieraufgabe6.java ein Programm, das auf der Kommandozeile exakt die folgenden Zeilen ausgibt:

```text
*.*.*.*.*
.*.*.*.*.
*.*.*.*.*
.*.*.*.*.
*.*.*.*.*
.*.*.*.*.
*.*.*.*.*
.*.*.*.*.
*.*.*.*.*
```

Verwenden Sie Schleifen etc. - geben Sie nicht einfach explizit mit 9 System.out.println die Zeilen aus!

# Aufgabe 7

Implementieren Sie in der Datei src/Programmieraufgabe7.java eine Methode `public static int getMax(int a, int b, int c)`, welche die größte der drei übergebenen Zahlen zurückgibt. Sie können gerne auch eine `public static void main(String[] args)` implementieren, in der Sie unterschiedliche Aufrufe von `getMax` testen, aber Sie müssen es nicht tun - die Tests überprüfen nur, ob die Methode da ist und sich korrekt verhält.
