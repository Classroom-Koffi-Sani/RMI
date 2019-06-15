# RMI
Remote Method Invocation en Java

## Comment utiliser 

Ce projet permet d'illustrer les Remote Method Invocation sous JAVA. De ce fait, on dispose de trois principaux éléments :

- Une inteface `DoueDeParole` étendant la classe `java.rmi.Remote`;
- Une classe `BashoServeur` implémentant l'interface `DoueDeParole` et étendant la classe `java.rmi.server.UnicastRemoteObject`;
- Une classe `BashoClient` qui sert côté client à se connecter au serveur et exécuter des méthodes distantes.

Nous nous servons des packages `java.rmi.*` et donc de certains éléments de la jVM de JAVA.

Pour exécuter ce programme, il faut suivre les étapes suivantes :
- [x] Compiler le programme 
```bash
javac *java
```
- [x] Générer le stub ou encore la souche de la classe `BashoServeur`:
```bash
rmic BashoServeur
```
- [x] Vérifier que le fichier stub est bien créé
- [x] Déplacer les fichiers client dans le dossier client :
```bash
mv BashoServeur_Stub.class client/BashoServeur_Stub.class
cp DoueDeParole.class client/DoueDeParole.class
```
- [x] Démarrer le serveur en arrière plan :
```bash
rmiregistry &
```
- [x] Puis exécuter `BashoServeur` :
```bash
java BashoServeur
```
- [x] Sur une autre machine (en ayant adapté l'adresse IP du serveur) ou une autre console, lancer le client (dans le dossier client) :
```bash
java BashoClient
```
- [x] Vérifier que l'appel de la méthode `parler()` se fait avec succès sur la représentation locale de `DoueDeParole`.