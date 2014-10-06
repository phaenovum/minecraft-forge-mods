[english version](README.md)

Minecraft Mods
==============

Diese Mods basieren auf
forge-1.7.10-10.13.0.1180-src.zip
heruntergeladen von:
http://adf.ly/673885/http://files.minecraftforge.net/maven/net/minecraftforge/forge/1.7.10-10.13.0.1180/forge-1.7.10-10.13.0.1180-src.zip
Sollte der Link nicht mehr funktionieren, kannst Du hier nach dem aktuellsten
Link suchen:
http://www.minecraftforge.net/forum/index.php/board,3.0.html

Verzeichnis Struktur
--------------------

Der vorkonfigurierte Workspace für Eclipse IDE Nutzer. Dies ist nicht der im
forge Verzeichnis, dient aber dem selben Zweck:

    ./eclipse/

Die Forge Dateien. Wird beim Entpacken des Forge Zip-Archivs erstellt

    ./forge/

Hier befindet sich Dein Quelltext

    ./source/

Ich verwende meine eigenen ./eclipse und ./source verzeichnisse, um mir die
Nutzung eines Versionskontrollsystems (git) zu erleichtern.


Installation
------------

Nachdem dieses Repository geklont wurde:

- lade das empfohlene Minecraft Forge source Zip-Archiv herunter
- entpacke forge-1.7.10-10.13.0.1180-src.zip innerhalb Deines Repository
Klons

      unzip forge-1.7.10-10.13.0.1180-src.zip

- wechsle in das forge Verzeichnis

      cd forge/

- folge der englischen (die deutsche ist veraltet) forge Installationsanleitung
hier: http://www.minecraftforge.net/wiki/Installation/Source

- Öffne Eclipse und wähle das ./eclipse Verzeichnis als Workspace
( *nicht* 'forge/eclipse').

- In Eclipse:

  - schließe den Welcome Screen

  - navigiere zu 'File > Import...' dann wähle
  'General > Existing Projects into Workspace'

  - wähle unter 'Select root directory' den aktuellen Eclipse Workspace aus

  - stelle sicher, dass beide Projekte ausgewählt sind und beende den Dialog
  über 'Finish'

  - navigiere nochmals zu 'File > Import...' und wähle  'General > Preferences'

  - wähle unter 'Browse' das Verzeichnis `eclipse_cfg` und wähle die
  'forge-preferences.epf' Datei, beende den Dialog mit 'Finish'

  - navigiere das letzte mal zu 'File > Import...' und wähle
  'Run/Debug > Launch Configurations '

  - wähle unter 'Browse' das Verzeichnis
  `eclipse_cfg/forge-launchers` und dort alle "Launch" Konfigurationen und
  beende den Dialog wieder mit   'Finish'

- aeir_mod ist unser Projekt, seine "Launchers" sind mit Client/Server aeir_mod.
  bezeichnet.

- forge ist das originale Forge Projekt. Es wurde als "required Project on the
  build path" dem Projekt aeir_mod hinzugefügt. Es wurde so konfiguriert, dass
  alle forge/mc Bibliotheken exportiert und somit von aeir_mod importiert
  werden. Du kannst auf diese Art beliebig eigene Projekte erstellen, aber
  vergiss nicht für jedes Projekt "Launcher" anzulegen, die *Dein* Projekt
  starten.

