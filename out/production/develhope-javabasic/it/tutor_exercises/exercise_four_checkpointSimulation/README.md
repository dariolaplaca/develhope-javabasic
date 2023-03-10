CHECKPOINT 06/03/2023
1) Progettare una classe Libro con i seguenti attributi privati:
- Titolo
- Autore
- Anno di pubblicazione
- Prezzo
- Descrizione
  ● Implementare almeno due tipologie di costruttori e i relativi getter e setter per
  ciascuna variabile.
  ● Realizzare un metodo che permetta il confronto tra due libri dati in input e che
  stampi quale dei due è antecedente in base all’anno di pubblicazione.
  ● Realizzare un metodo, senza sovrascrivere il toString(), che mostri in output
  alcune info relative all’istanza della classe.
2) Progettare una classe Biblioteca che permetta di memorizzare:
- Nome della biblioteca
- Indirizzo
- Lista di libri presenti nella biblioteca
  ● Implementare un costruttore che prenda in input tutti e tre gli attributi della
  classe e un costruttore che inizializzi solamente il nome e l’indirizzo.
  ● Implementare i getter e i setter per ciascuna variabile.
  ● Realizzare un metodo Cerca che prenda in input un’unica stringa e che faccia
  una ricerca tra i libri presenti nella biblioteca in base al titolo e all’autore,
  restituendo una lista di libri coerenti con la ricerca.
  ● Realizzare un metodo che stampi i libri contenuti all’interno della Biblioteca.
  ● Realizzare un metodo per aggiungere un libro alla lista dei libri presenti.
  ● ** Bonus ** Realizzare un metodo che restituisca una mappa avente come
  chiave il nome dell’autore e come valore la lista di libri scritti da quell’autore.
3) Creare una classe Main nella quale:
   ● Istanziare 3 oggetti di tipo Libro usando i 2 costruttori creati.
   ● Istanziare un oggetto di tipo Biblioteca a partire dai libri creati.
   ● Stampare i libri contenuti nella Biblioteca.
   ● Confrontare due dei libri creati a scelta.
   ● Aggiungere un nuovo libro nella Biblioteca e stampare nuovamente la lista di
   libri contenuti nella stessa, per verificarne gli elementi aggiornati.
   ● ** Bonus ** Recuperare tutti i libri di un determinato autore.