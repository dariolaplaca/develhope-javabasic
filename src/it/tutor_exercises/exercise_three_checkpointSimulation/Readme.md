1) Progettare una classe FootballPlayer che ha i seguenti attributi:
- Id
- Nome
- Cognome
- Numero di presenze
- Numero di gol segnati
- Numero di assist

Implementare un costruttore con tutti gli argomenti e un costruttore
che imposta solo id, nome e cognome. Inoltre scrivere il getter per
ogni attributo e un setter solamente per le presenze, i gol e gli assist.
La classe avrà infine i seguenti metodi:
- score() : questo metodo calcola quanto un giocatore sia incisivo in campo.
  Il punteggio è dato da (numeroGol + (0.75*numeroAssist)) / numeroPresenze.

2) Progettare la classe Team che ha i seguenti attributi:
- Id
- Nome
- L'insieme dei giocatori della squadra

Impostare un costruttore in modo che inizializzi id e nome, inizializzando vuoto
l'insieme dei giocatori e un altro costruttore che invece prende come parametro anche
un insieme di giocatori. Aggiungere inoltre nella classe FootballPlayer la squadra in
cui gioca come attributo, con corrispettivi getter e setter.
Implementare infine il seguente metodo:
- printTeam() : stampa riga per riga nome e cognome di ogni giocatore.
- addPlayer(FootballPlayer p) : aggiunge il giocatore p al team.

3) Creare una classe Main nella quale:
   a) Istanziare 5 variabili di tipo FootballPlayer (con parametri a scelta) e inserire
   3 di loro in un insieme.
   b) Istanziare un oggetto di tipo Team teamA passando come parametro al costruttore l'insieme
   appena creato.
   c) Istanziare un oggetto di tipo Team teamB usando il costruttore senza l'insieme in input e
   poi aggiungere ad esso gli altri 2 giocatori con il metodo addPlayer.
   d) Stampare tutti i giocatori del teamA che hanno:
- almeno segnato 5 gol oppure ha almeno effettuato 7 assist e
- ha almeno 20 presenze.
  e) Istanziare un teamC i cui giocatori sono quelli del teamA più quelli del teamB.
  f) Creare una mappa dove le chiavi sono i giocatori del teamC e i valori sono i loro punteggi
  calcolati dal metodo score().
  g) Stampare tutti i giocatori della mappa che hanno un punteggio superiore a 0.6