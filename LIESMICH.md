[english version](README.md)

Minecraft Mods
==============

Diese Mods basieren auf
minecraftforge-src-1.6.4-9.11.0.884
heruntergeladen von:
http://adf.ly/673885/http://files.minecraftforge.net/minecraftforge/minecraftforge-src-1.6.4-9.11.0.884.zip

Verzeichnis Struktur
--------------------

Der vorkonfigurierte Workspace für Eclipse IDE Nutzer

    ./eclipse/

Die Forge Dateien. Wird beim Entpacken des Forge Zip-Archivs erstellt

    ./forge/

Das Installationskript für Forge

    ./forge/install.sh oder /forge/install.cmd

Die Minecraft Coder Pack Tools. Wird bei der Installation erstellt

    ./forge/mcp/

Skripts die Deinen Quelltext zum veröffentlichen vorbereiten

    ./forge/mcp/recompile.sh /forge/mcp/reobfuscate.sh (.bat unter Windows)

Hier landen Deine Klassendateien nachdem reobfuscate.sh (.bat unter Windows)
ausgeführt wurde

    ./forge/mcp/reobf/

Hier befindet sich Dein Quelltext

    ./source/


Installation
------------

Nachdem dieses Repository geklont wurde:

- lade das empfohlene Minecraft Forge source Zip-Archiv herunter
- entpacke minecraftforge-src-1.6.4-9.11.0.884.zip innerhalb Deines Repository
Klons

      unzip minecraftforge-src-1.6.4-9.11.0.884.zip

- wechsle in das forge Verzeichnis

      cd forge/

- unter Linux/Mac mache das Installationsskript ausführbar

      chmod u+x install.sh

- führe das Installationsskript aus (unter Windows Doppelklick auf install.cmd)

      ./install.sh

- Öffne Eclipse und wähle das ./eclipse Verzeichnis als Workspace
( *nicht* 'forge/mcp/eclipse').

- In Eclipse:

  - schließe den Welcome Screen

  - navigiere zu 'File > Import...' dann wähle
  'General > Existing Projects into Workspace'

  - wähle unter 'Select root directory' den aktuellen Eclipse Workspace aus

  - stelle sicher, dass beide Projekte ausgewählt sind und beende den Dialog
  über 'Finish'

  - navigiere nochmals zu 'File > Import...' und wähle  'General > Preferences'

  - wähle unter 'Browse' das Verzeichnis `eclipse_cfg` und wähle die
  'forgeMCP-eclipse-settings.epf' Datei, beende den Dialog mit 'Finish'

  - navigiere das letzte mal zu 'File > Import...' und wähle
  'Run/Debug > Launch Configurations '

  - wähle unter 'Browse' das Verzeichnis
  `eclipse_cfg/forgeMCP-eclipse-launch-config` und dort die 'Client.launch'
  sowie 'Server.launch' Konfigurationen und beende den Dialog wieder mit
  'Finish'

