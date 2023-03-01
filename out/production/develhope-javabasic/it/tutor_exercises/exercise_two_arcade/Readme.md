Scrivere un programma per gestire le classifiche di una sala-giochi
In particolare, è necessario gestire sia la classifica "locale" di ogni videogioco presente, che quella "globale".
Ogni videogioco ha un id univoco, un nome e un coefficiente di difficoltà (da 1 a 5)
Il piazzamento di un utente nella classifica globale è dato dalla somma del suo piazzamento in ciascun videogioco moltiplicato per il coefficiente di difficoltà del videogioco.
Se l'utente non ha giocato ad un videogioco x, is suo punteggio per x è 0
<br>Ogni Utente ha un id univoco e un username, usato per le classifiche
<br>Implementare le seguenti operazioni
<br>Inserisci Utente
<br>Inserisci Videogioco
<br>Inserisci Partita
<br>classifica di un videogioco, dato un videogioco, restituisce la classifica (top 3) del videogioco username:punti
<br>stampa classifica globale, stamparla in ordine in base ai punteggi
