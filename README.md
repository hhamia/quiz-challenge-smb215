Au début, nous allons montrer comment le jeu travaille 
cette application est un jeu online  de multi-joueurs de plusieurs étapes (level 1,level 2,level 3 ...) nécessite  l'inscription a la base de donne pour que le client devient un joueur ce fonction d'inscription se réalise a partir d'une application web qui est l'interface de la base de donne mysql 
âpres l'inscription le rôle du serveur apparait et basée sur la notion socket ceci permet d'échange des donnes entre client -serveur et vise versa.
chaque client inscrit il fait uploadé tout les contact liste sur le serveur et il va registré son numéro du téléphone sur le serveur  et si un nouveaux joueur inscrit le serveur En regardant les bases de données s'il a conformé les numéro du téléphone de autre personne dans la contact liste le serveur va émet de notifications au joueur pour informer Cet ami de la vôtre est inscrit dans le jeu si vous voulez jouer avec lui.(comme l'application viber par exemple si un nouveaux personne de mon contact liste a installer l'application le serveur viber va informer les autre personne par de notification )
en plus le rôle du serveur est présenter sur ce application par la requêté qui se fait entre le joueur (par la premier click sur le bouton qui permet de faire la réponse au question il arrête l'acceptation du requête venant de autre joueur ,  par présentation et changement de questions selon le étapes du joueur , par calcul du point pour chaque joueur )
et cette application doit contient de page (Dashboard qui représente et affiche le joueur avec son étapes et son score ...)



Plan du projet
introduction
Ø  Objet du document

c'est un jeu scientifique multi-joueurs ,qui est un quiz de questions scientifiques.

il a pour but et d'évaluer  le niveau et la compétition entre les joueurs.

 

 

Nom du projet :Challenge quiz

Membres de l'équipe projet:

-Hamza Hamia

-Mohamad el dakdouki

 

Description du projet :

c'est une application mobile pour que le joueur soit un membre du jeu

il registre ses informations personnelles dans l'application qui lui permet de connecter avec d'autres joueurs .

le jeu commence par une question distribuer les joueurs connectes de même degré (ceux qui acceptent l'invitation )celui qui répond le premier aux question en appuyant sur le bouton, il termine le jeu par des points s'il gagne.

en cas d'échec ,le jeu retranche ,automatiquement de points de son crédit .

 

cote technique:

c'est une application android base sur :

java/xml pour l'interface graphique

Mysql pour base de donnes

php:interface entre java et mysql 
